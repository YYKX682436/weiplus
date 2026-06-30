import re
p = r"C:\Users\15853\Documents\WeiPlus\app\src\main\java\com\muchen\weiplus\features\ForwardLimitFeature.kt"
with open(p, "r", encoding="utf-8") as f:
    content = f.read()
# Replace garbled name line
content = re.sub(r'override val name = "[^"]*"', 'override val name = "RemoveForwardLimit"', content)
with open(p, "w", encoding="utf-8") as f:
    f.write(content)
print("Fixed name field")
