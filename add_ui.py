me_path = r"C:\Users\15853\Documents\WeiPlus\app\src\main\java\com\muchen\weiplus\entry\ModuleEntry.kt"
with open(me_path, "r", encoding="utf-8") as f:
    me = f.read()

# Find the gameCheat switch block and add forwardLimit switch after it
old = '''        panel.addView(switchRow(activity, d, "\u749a\u6ca3\u752a\u6964\u6a80\u430b\u745a\u6d9f", "\u5877\u7d43\u6a84\u6657\u6d52\u7642\u6709\u5ba4\u6964\u6a80\u430b\u6a60\u408f\u5887\u6d9f",
            FeatureConfig.gameCheat
        ) { FeatureConfig.gameCheat = it; FeatureConfig.save() })'''

new = '''        panel.addView(switchRow(activity, d, "\u749a\u6ca3\u752a\u6964\u6a80\u430b\u745a\u6d9f", "\u5877\u7d43\u6a84\u6657\u6d52\u7642\u6709\u5ba4\u6964\u6a80\u430b\u6a60\u408f\u5887\u6d9f",
            FeatureConfig.gameCheat
        ) { FeatureConfig.gameCheat = it; FeatureConfig.save() })

        panel.addView(switchRow(activity, d, "RemoveForwardLimit", "Allow fwd voice/card/emoji, no 9-limit",
            FeatureConfig.forwardLimit
        ) { FeatureConfig.forwardLimit = it; FeatureConfig.save() })'''

if old in me:
    me = me.replace(old, new)
    with open(me_path, "w", encoding="utf-8") as f:
        f.write(me)
    print("UI switch added (by garbled match)")
else:
    # Try by regex
    import re
    # Match the gameCheat switchRow block
    pattern = r'(panel\.addView\(switchRow\(activity, d, [^)]+\)\s*\)\s*\{[^}]+\})'
    match = re.search(pattern, me)
    if match:
        old_text = match.group(0)
        new_text = old_text + '''

        panel.addView(switchRow(activity, d, "RemoveForwardLimit", "Allow fwd voice/card/emoji, no 9-limit",
            FeatureConfig.forwardLimit
        ) { FeatureConfig.forwardLimit = it; FeatureConfig.save() })'''
        me = me.replace(old_text, new_text)
        with open(me_path, "w", encoding="utf-8") as f:
            f.write(me)
        print("UI switch added (by regex)")
    else:
        print("COULD NOT FIND gameCheat switch in UI")
