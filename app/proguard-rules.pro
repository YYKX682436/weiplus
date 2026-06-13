# Xposed module rules
-keep public class * extends de.robv.android.xposed.IXposedHookLoadPackage {
    public <init>();
}
-keep public class * extends de.robv.android.xposed.IXposedHookZygoteInit {
    public <init>();
}
