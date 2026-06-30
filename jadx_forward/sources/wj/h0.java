package wj;

/* loaded from: classes9.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj.j0 f527950d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(wj.j0 j0Var) {
        super(1);
        this.f527950d = j0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject adsInfoJson = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adsInfoJson, "adsInfoJson");
        com.p314xaae8f345.mm.p2495xc50a8b8b.e m75931xb5cb93b2 = new r45.e5().m75931xb5cb93b2(adsInfoJson);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m75931xb5cb93b2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AdsInfo");
        r45.e5 e5Var = (r45.e5) m75931xb5cb93b2;
        wj.j0 j0Var = this.f527950d;
        java.lang.String m75945x2fec8307 = e5Var.m75945x2fec8307(5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75945x2fec8307, "getAdPosid(...)");
        wj.j0.hj(j0Var, m75945x2fec8307, e5Var, 60L, false, 8, null);
        return jz5.f0.f384359a;
    }
}
