package k5;

/* loaded from: classes12.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f385664a = a5.a0.e("PackageManagerHelper");

    public static void a(android.content.Context context, java.lang.Class cls, boolean z17) {
        java.lang.String str = f385664a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(context, cls.getName()), z17 ? 1 : 2, 1);
            a5.a0 c17 = a5.a0.c();
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z17 ? "enabled" : "disabled";
            c17.a(str, java.lang.String.format("%s %s", objArr), new java.lang.Throwable[0]);
        } catch (java.lang.Exception e17) {
            a5.a0 c18 = a5.a0.c();
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z17 ? "enabled" : "disabled";
            c18.a(str, java.lang.String.format("%s could not be %s", objArr2), e17);
        }
    }
}
