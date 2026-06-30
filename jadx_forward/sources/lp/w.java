package lp;

/* loaded from: classes5.dex */
public class w implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f401779a = 0;

    static {
        q25.b.b(new lp.w(), "//cleanwx", "//showfile", "//hidefile");
    }

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        java.lang.String str2 = strArr[0];
        str2.getClass();
        char c17 = 65535;
        switch (str2.hashCode()) {
            case -1470593122:
                if (str2.equals("//hidefile")) {
                    c17 = 0;
                    break;
                }
                break;
            case -35508263:
                if (str2.equals("//showfile")) {
                    c17 = 1;
                    break;
                }
                break;
            case 2113467658:
                if (str2.equals("//cleanwx")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                try {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CALC_WX_SCAN_SHOW_FILE_INT, 0);
                    db5.t7.m123883x26a183b(context, "hide file now.", 0).show();
                } catch (java.lang.Exception unused) {
                }
                return true;
            case 1:
                try {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CALC_WX_SCAN_SHOW_FILE_INT, 1);
                    db5.t7.m123883x26a183b(context, "show file now.", 0).show();
                } catch (java.lang.Exception unused2) {
                }
                return true;
            case 2:
                new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5270x49b3890e().e();
                db5.t7.m123883x26a183b(context, "clean wx file index now.", 0).show();
                return true;
            default:
                return false;
        }
    }
}
