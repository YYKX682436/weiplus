package yj;

/* loaded from: classes5.dex */
public final class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p617xd6d92827.cgi.C4978x557b1957 f544165a;

    public c(com.p314xaae8f345.mm.p617xd6d92827.cgi.C4978x557b1957 c4978x557b1957) {
        this.f544165a = c4978x557b1957;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152149b;
        com.p314xaae8f345.mm.p617xd6d92827.cgi.C4978x557b1957 c4978x557b1957 = this.f544165a;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicAdCommonFeatureService", "report cgi fail, aid: " + c4978x557b1957.f134689e + ", reportType: " + c4978x557b1957.f134688d + ", errCode: " + fVar.f152149b + ", errMsg: " + fVar.f152150c);
        } else {
            r45.ip5 ip5Var = (r45.ip5) fVar.f152151d;
            if (ip5Var == null || ip5Var.m75939xb282bd08(1) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", "report cgi success, aid: " + c4978x557b1957.f134689e + ", reportType: " + c4978x557b1957.f134688d);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicAdCommonFeatureService", "report cgi resp return error, aid: " + c4978x557b1957.f134689e + ", reportType: " + c4978x557b1957.f134688d + ", retCode: " + ip5Var.m75939xb282bd08(1));
            }
        }
        return jz5.f0.f384359a;
    }
}
