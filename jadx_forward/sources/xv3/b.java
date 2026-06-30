package xv3;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final xv3.b f538963a = new xv3.b();

    public final java.lang.String a(int i17) {
        int i18 = i17 % 60;
        int i19 = i17 / 60;
        int i27 = i19 % 60;
        int i28 = i19 / 60;
        if (i28 == 0) {
            return b(i27) + ':' + b(i18);
        }
        return b(i28) + ':' + b(i27) + ':' + b(i18);
    }

    public final java.lang.String b(int i17) {
        if (i17 >= 10) {
            return java.lang.String.valueOf(i17);
        }
        return "0" + i17;
    }
}
