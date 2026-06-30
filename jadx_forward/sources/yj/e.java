package yj;

/* loaded from: classes5.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p617xd6d92827.cgi.C4978x557b1957 f544167a;

    public e(com.p314xaae8f345.mm.p617xd6d92827.cgi.C4978x557b1957 c4978x557b1957) {
        this.f544167a = c4978x557b1957;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152149b != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicAdCommonFeatureService", "reportAd(pay) cgi fail, errCode: " + fVar.f152149b + ", errMsg: " + fVar.f152150c);
        } else {
            r45.w65 w65Var = (r45.w65) fVar.f152151d;
            if (w65Var == null || w65Var.m75939xb282bd08(1) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", "reportAd(pay) cgi success, serverAid: " + this.f544167a.f134689e);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicAdCommonFeatureService", "reportAd(pay) cgi resp return error, retCode: " + w65Var.m75939xb282bd08(1));
            }
        }
        return jz5.f0.f384359a;
    }
}
