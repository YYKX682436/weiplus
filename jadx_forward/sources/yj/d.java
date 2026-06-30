package yj;

/* loaded from: classes5.dex */
public final class d implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p617xd6d92827.cgi.C4978x557b1957 f544166a;

    public d(com.p314xaae8f345.mm.p617xd6d92827.cgi.C4978x557b1957 c4978x557b1957) {
        this.f544166a = c4978x557b1957;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152149b != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicAdCommonFeatureService", "report cgi fail, errCode: " + fVar.f152149b + ", errMsg: " + fVar.f152150c);
        } else {
            r45.w2 w2Var = (r45.w2) fVar.f152151d;
            if (w2Var == null || w2Var.m75939xb282bd08(0) != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicAdCommonFeatureService", "report cgi resp return error, retCode: " + w2Var.m75939xb282bd08(0) + ", message: " + w2Var.m75945x2fec8307(1));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", "report cgi success, aid: " + this.f544166a.f134689e);
            }
        }
        return jz5.f0.f384359a;
    }
}
