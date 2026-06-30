package pf1;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final pf1.c f435308a;

    public h(pf1.c view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f435308a = view;
    }

    public static void a(pf1.h hVar, java.lang.String str, android.webkit.ValueCallback valueCallback, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            valueCallback = null;
        }
        hVar.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new pf1.g(hVar, str, valueCallback));
    }

    @android.webkit.JavascriptInterface
    /* renamed from: invokeHandler */
    public final java.lang.String m158324x304a33b2(java.lang.String str, java.lang.String str2, int i17) {
        if (str == null) {
            return "";
        }
        pf1.q qVar = (pf1.q) this.f435308a;
        qVar.getClass();
        return qVar.f435323f.B(str, str2, i17);
    }
}
