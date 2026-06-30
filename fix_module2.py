import re

me_path = r"C:\Users\15853\Documents\WeiPlus\app\src\main\java\com\muchen\weiplus\entry\ModuleEntry.kt"
with open(me_path, "r", encoding="utf-8") as f:
    me = f.read()

# Find and replace the entire registerFeatures function
old = r"""    private fun registerFeatures\(classLoader: ClassLoader\) \{
        try \{ AntiRecallFeature\(\)\.onEnable\(this, classLoader\); log\(Log\.INFO, TAG, "AntiRecallFeature OK"\) \}
        catch \(e: Throwable\) \{ log\(Log\.ERROR, TAG, "AntiRecallFeature fail", e\) \}

        try \{ SwipeQuoteFeature\(\)\.onEnable\(this, classLoader\); log\(Log\.INFO, TAG, "SwipeQuoteFeature OK"\) \}
        catch \(e: Throwable\) \{ log\(Log\.ERROR, TAG, "SwipeQuoteFeature fail", e\) \}

        try \{ ShowDetailTimeFeature\(\)\.onEnable\(this, classLoader\); log\(Log\.INFO, TAG, "ShowDetailTimeFeature OK"\) \}
        catch \(e: Throwable\) \{ log\(Log\.ERROR, TAG, "ShowDetailTimeFeature fail", e\) \}

        try \{ GameCheatFeature\(\)\.onEnable\(this, classLoader\); log\(Log\.INFO, TAG, "GameCheatFeature OK"\) \}

        try \{ ForwardLimitFeature\(\)\.onEnable\(this, classLoader\); log\(Log\.INFO, TAG, "ForwardLimitFeature OK"\) \}
        catch \(e: Throwable\) \{ log\(Log\.ERROR, TAG, "ForwardLimitFeature fail", e\) \}
        catch \(e: Throwable\) \{ log\(Log\.ERROR, TAG, "GameCheatFeature fail", e\) \}"""

new = """    private fun registerFeatures(classLoader: ClassLoader) {
        try { AntiRecallFeature().onEnable(this, classLoader); log(Log.INFO, TAG, "AntiRecallFeature OK") }
        catch (e: Throwable) { log(Log.ERROR, TAG, "AntiRecallFeature fail", e) }

        try { SwipeQuoteFeature().onEnable(this, classLoader); log(Log.INFO, TAG, "SwipeQuoteFeature OK") }
        catch (e: Throwable) { log(Log.ERROR, TAG, "SwipeQuoteFeature fail", e) }

        try { ShowDetailTimeFeature().onEnable(this, classLoader); log(Log.INFO, TAG, "ShowDetailTimeFeature OK") }
        catch (e: Throwable) { log(Log.ERROR, TAG, "ShowDetailTimeFeature fail", e) }

        try { GameCheatFeature().onEnable(this, classLoader); log(Log.INFO, TAG, "GameCheatFeature OK") }
        catch (e: Throwable) { log(Log.ERROR, TAG, "GameCheatFeature fail", e) }

        try { ForwardLimitFeature().onEnable(this, classLoader); log(Log.INFO, TAG, "ForwardLimitFeature OK") }
        catch (e: Throwable) { log(Log.ERROR, TAG, "ForwardLimitFeature fail", e) }"""

result = re.sub(old, new, me, flags=re.DOTALL)
if result == me:
    print("NO MATCH - trying manual")
    # Manual approach: find the function and replace lines
    lines = me.split('\n')
    out = []
    in_broken = False
    skip_rest = False
    for i, line in enumerate(lines):
        if 'private fun registerFeatures' in line:
            in_broken = True
            out.append(new)
            continue
        if in_broken and line.strip() == '}':
            in_broken = False
            out.append(line)
            continue
        if not in_broken:
            out.append(line)
    result = '\n'.join(out)
    
with open(me_path, "w", encoding="utf-8") as f:
    f.write(result)
print("Done - registerFeatures fixed")
