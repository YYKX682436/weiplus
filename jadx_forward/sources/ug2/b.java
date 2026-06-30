package ug2;

/* loaded from: classes3.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug2.c f509048d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ug2.c cVar) {
        super(0);
        this.f509048d = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f pi1Var;
        ug2.c cVar = this.f509048d;
        int m75939xb282bd08 = cVar.f509049a.m75939xb282bd08(1);
        r45.ch1 ch1Var = cVar.f509049a;
        switch (m75939xb282bd08) {
            case 20090:
                pi1Var = new r45.pi1();
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var.m75934xbce7f2f(4);
                byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
                if (g17 == null) {
                    return null;
                }
                try {
                    pi1Var.mo11468x92b714fd(g17);
                    break;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                    return null;
                }
            case 20091:
                pi1Var = new r45.wi1();
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2 = ch1Var.m75934xbce7f2f(4);
                byte[] g18 = m75934xbce7f2f2 != null ? m75934xbce7f2f2.g() : null;
                if (g18 == null) {
                    return null;
                }
                try {
                    pi1Var.mo11468x92b714fd(g18);
                    break;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e18);
                    return null;
                }
            case 20092:
                pi1Var = new r45.oi1();
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f3 = ch1Var.m75934xbce7f2f(4);
                byte[] g19 = m75934xbce7f2f3 != null ? m75934xbce7f2f3.g() : null;
                if (g19 == null) {
                    return null;
                }
                try {
                    pi1Var.mo11468x92b714fd(g19);
                    break;
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e19);
                    return null;
                }
            default:
                return null;
        }
        return pi1Var;
    }
}
