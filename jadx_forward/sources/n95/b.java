package n95;

/* loaded from: classes12.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f417459a = "";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f417460b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f417461c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f417462d;

    public static final java.lang.Object a(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(f417459a + ".svg.SVGBuildConfig");
            java.lang.reflect.Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(cls);
        } catch (java.lang.ClassNotFoundException e17) {
            n95.d.c("MicroMSG.WeChatSVGConfig", e17, "ClassNotFoundException", new java.lang.Object[0]);
            return null;
        } catch (java.lang.IllegalAccessException e18) {
            n95.d.c("MicroMSG.WeChatSVGConfig", e18, "IllegalAccessException", new java.lang.Object[0]);
            return null;
        } catch (java.lang.IllegalArgumentException e19) {
            n95.d.c("MicroMSG.WeChatSVGConfig", e19, "IllegalArgumentException", new java.lang.Object[0]);
            return null;
        } catch (java.lang.NoSuchFieldException e27) {
            n95.d.c("MicroMSG.WeChatSVGConfig", e27, "NoSuchFieldException", new java.lang.Object[0]);
            return null;
        }
    }

    public static final boolean b() {
        if (!f417460b) {
            java.lang.Object a17 = a("WxSVGCode");
            if (a17 == null) {
                f417461c = false;
            } else {
                f417461c = ((java.lang.Boolean) a17).booleanValue();
            }
            n95.d.b("MicroMSG.WeChatSVGConfig", "Initialized mUsingWeChatSVGCode %s", java.lang.Boolean.valueOf(f417461c));
            f417460b = true;
        }
        return !f417461c;
    }
}
