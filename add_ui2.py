me_path = r"C:\Users\15853\Documents\WeiPlus\app\src\main\java\com\muchen\weiplus\entry\ModuleEntry.kt"
with open(me_path, "r", encoding="utf-8") as f:
    me = f.read()

# Find FeatureConfig.gameCheat = it; FeatureConfig.save() }) 
# and insert our UI after it
old = "FeatureConfig.gameCheat = it; FeatureConfig.save() })"
new_block = """FeatureConfig.gameCheat = it; FeatureConfig.save() })

        panel.addView(switchRow(activity, d, "RemoveForwardLimit", "Allow fwd voice/card/emoji, no 9-limit",
            FeatureConfig.forwardLimit
        ) { FeatureConfig.forwardLimit = it; FeatureConfig.save() })"""

if old in me:
    me = me.replace(old, new_block, 1)
    with open(me_path, "w", encoding="utf-8") as f:
        f.write(me)
    print("UI switch added successfully")
else:
    print("old text not found")
    # Try finding switchRow with gameCheat
    import re
    matches = re.findall(r'switchRow\(activity, d, "([^"]*)".*?FeatureConfig\.gameCheat', me, re.DOTALL)
    print(f"Found {len(matches)} matches: {matches}")
