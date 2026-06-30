package ke2;

/* loaded from: classes3.dex */
public final class n0 {
    public n0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p2495xc50a8b8b.f a(com.p314xaae8f345.mm.p944x882e457a.f fVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f resp) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        r45.nd2 nd2Var = (r45.nd2) fVar.f152151d;
        if (nd2Var == null || (m75934xbce7f2f = nd2Var.m75934xbce7f2f(1)) == null) {
            return null;
        }
        try {
            resp.mo11468x92b714fd(m75934xbce7f2f.g());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            resp = null;
        }
        if (resp == null) {
            return null;
        }
        return resp;
    }
}
