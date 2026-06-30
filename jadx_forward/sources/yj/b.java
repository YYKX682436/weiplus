package yj;

/* loaded from: classes5.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f544163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p617xd6d92827.cgi.C4977xe7434428 f544164b;

    public b(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, yj.f fVar, com.p314xaae8f345.mm.p617xd6d92827.cgi.C4977xe7434428 c4977xe7434428) {
        this.f544163a = rVar;
        this.f544164b = c4977xe7434428;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152149b;
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f544163a;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicAdCommonFeatureService", "pullAds cgi fail, errCode: " + fVar.f152149b + ", errMsg: " + fVar.f152150c);
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p617xd6d92827.cgi.C4975x585fc1a8(false, null, java.lang.Integer.valueOf(fVar.f152149b), 2, null));
            }
        } else {
            r45.l93 l93Var = (r45.l93) fVar.f152151d;
            if (l93Var == null || l93Var.m75939xb282bd08(1) == 0) {
                r45.m93 m93Var = (r45.m93) l93Var.m75936x14adae67(2);
                if (m93Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicAdCommonFeatureService", "pullAds cgi success but result is null");
                    if (rVar != null) {
                        rVar.a(new com.p314xaae8f345.mm.p617xd6d92827.cgi.C4975x585fc1a8(false, null, null, 6, null));
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", "pullAds cgi success, posIds: " + this.f544164b.f134687d + ", size: " + m93Var.m75941xfb821914(3).size());
                    if (rVar != null) {
                        rVar.a(new com.p314xaae8f345.mm.p617xd6d92827.cgi.C4975x585fc1a8(false, ((r45.m93) l93Var.m75936x14adae67(2)).mo14344x5f01b1f6(), null, 5, null));
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicAdCommonFeatureService", "cgi resp return error, retCode: " + l93Var.m75939xb282bd08(1));
                if (rVar != null) {
                    rVar.a(new com.p314xaae8f345.mm.p617xd6d92827.cgi.C4975x585fc1a8(false, null, null, 6, null));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
