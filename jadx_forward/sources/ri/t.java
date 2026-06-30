package ri;

/* loaded from: classes12.dex */
public abstract class t {
    public static java.lang.String a() {
        java.lang.String h17 = com.p314xaae8f345.mm.app.w.INSTANCE.h();
        if (android.text.TextUtils.isEmpty(h17)) {
            h17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134273v;
        }
        return b(h17);
    }

    public static java.lang.String b(java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.g gVar;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j()) {
            try {
                gVar = (com.p314xaae8f345.mm.sdk.p2603x2137b148.g) com.p314xaae8f345.mm.sdk.p2603x2137b148.h.f274254a.call();
            } catch (java.lang.Exception unused) {
                gVar = null;
            }
            if (gVar != null && !android.text.TextUtils.isEmpty(gVar.f274245b)) {
                return gVar.f274245b;
            }
        }
        return str.contains("@") ? str.substring(0, str.lastIndexOf("@")) : str;
    }
}
