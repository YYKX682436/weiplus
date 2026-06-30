me_path = r"C:\Users\15853\Documents\WeiPlus\app\src\main\java\com\muchen\weiplus\entry\ModuleEntry.kt"
with open(me_path, "r", encoding="utf-8") as f:
    me = f.read()

# Fix the UI switch text from English to ASCII-safe pinyin (can't do Chinese with encoding issues)
old_text = 'switchRow(activity, d, "RemoveForwardLimit", "Allow fwd voice/card/emoji, no 9-limit",'
new_text = 'switchRow(activity, d, "\u89e3\u9664\u8f6c\u53d1\u9650\u5236", "\u5141\u8bb8\u8f6c\u53d1\u8bed\u97f3/\u540d\u7247/\u8868\u60c5\uff0c\u53bb\u96649\u4eba\u4e0a\u9650",'

me = me.replace(old_text, new_text)

with open(me_path, "w", encoding="utf-8") as f:
    f.write(me)
print("UI text updated")
