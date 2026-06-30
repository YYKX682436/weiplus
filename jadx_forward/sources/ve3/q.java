package ve3;

/* loaded from: classes7.dex */
public abstract class q {
    public static /* synthetic */ void c(ve3.q qVar, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEventToScl");
        }
        if ((i17 & 2) != 0) {
            str2 = null;
        }
        qVar.b(str, str2);
    }

    public abstract int a();

    public void b(java.lang.String eventType, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventType, "eventType");
        java.lang.String str2 = bf3.w0.f101205a.a(bf3.v0.f101203d) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a : com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274592g;
        if (str2 == null) {
            str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274592g;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str2, new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16465x448f9090(a(), eventType, str), ve3.x.class, ve3.p.f517637d);
    }
}
