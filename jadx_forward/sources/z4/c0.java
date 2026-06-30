package z4;

/* loaded from: classes13.dex */
public class c0 extends z4.i {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.regex.Pattern f551591d;

    public c0(java.lang.String str, java.lang.String str2) {
        super(str, str2);
        this.f551591d = java.util.regex.Pattern.compile("\\A\\d+");
    }

    @Override // z4.j
    public boolean b() {
        int i17;
        android.content.pm.PackageInfo packageInfo;
        boolean b17 = super.b();
        if (!b17 || (i17 = android.os.Build.VERSION.SDK_INT) >= 29) {
            return b17;
        }
        int i18 = y4.m.f540810a;
        if (i17 >= 26) {
            packageInfo = z4.o.a();
        } else {
            try {
                packageInfo = y4.m.a();
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                packageInfo = null;
            }
        }
        if (packageInfo == null) {
            return false;
        }
        java.util.regex.Matcher matcher = this.f551591d.matcher(packageInfo.versionName);
        return matcher.find() && java.lang.Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
