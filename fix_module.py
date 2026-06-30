import re

me_path = r"C:\Users\15853\Documents\WeiPlus\app\src\main\java\com\muchen\weiplus\entry\ModuleEntry.kt"
with open(me_path, "r", encoding="utf-8") as f:
    me = f.read()

# Fix the broken registerFeatures - replace the whole broken block
old_block = r"""        try { GameCheatFeature\(\)\.onEnable\(this, classLoader\); log\(Log\.INFO, TAG, "GameCheatFeature OK"\) \}
  
        try { ForwardLimitFeature\(\)\.onEnable\(this, classLoader\); log\(Log\.INFO, TAG, "ForwardLimitFeature OK"\) \}
        catch \(e: Throwable\) { log\(Log\.ERROR, TAG, "ForwardLimitFeature fail", e\) \}
        catch \(e: Throwable\) { log\(Log\.ERROR, TAG, "GameCheatFeature fail", e\) \}"""

new_block = """        try { GameCheatFeature().onEnable(this, classLoader); log(Log.INFO, TAG, "GameCheatFeature OK") }
        catch (e: Throwable) { log(Log.ERROR, TAG, "GameCheatFeature fail", e) }

        try { ForwardLimitFeature().onEnable(this, classLoader); log(Log.INFO, TAG, "ForwardLimitFeature OK") }
        catch (e: Throwable) { log(Log.ERROR, TAG, "ForwardLimitFeature fail", e) }"""

me = re.sub(old_block, new_block, me)

with open(me_path, "w", encoding="utf-8") as f:
    f.write(me)
print("Fixed registerFeatures")
