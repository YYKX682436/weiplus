package ox2;

/* loaded from: classes2.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f431229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f431230e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f431231f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f431232g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.ri0 f431233h;

    public o0(in5.s0 s0Var, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, r45.ri0 ri0Var) {
        this.f431229d = s0Var;
        this.f431230e = j17;
        this.f431231f = qeVar;
        this.f431232g = abstractC14490x69736cb5;
        this.f431233h = ri0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        in5.s0 s0Var = this.f431229d;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = null;
        if (s0Var.f3639x46306858.getTag(com.p314xaae8f345.mm.R.id.tbw) == this) {
            s0Var.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.tbw, null);
        }
        java.lang.Object obj = s0Var.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        long j17 = this.f431230e;
        boolean z17 = false;
        if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null && feedObject.m59251x5db1b11() == j17) {
            z17 = true;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedFullConvert+InteractionEasterEgg", "preloadCenterInteractionEasterEggEmoji: feedId不匹配，跳过绑定");
            return;
        }
        java.lang.String w17 = this.f431232g.w();
        r45.ri0 ri0Var = this.f431233h;
        if (ri0Var != null) {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            interfaceC4987x84e327cb = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.t2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6) c17)).Di(ri0Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedFullConvert+InteractionEasterEgg", "onBindFeed: " + j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e c15408x626e05e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e) s0Var.p(com.p314xaae8f345.mm.R.id.tfm);
        if (c15408x626e05e == null) {
            if (interfaceC4987x84e327cb == null) {
                return;
            }
            c15408x626e05e = ox2.p0.a(this.f431231f, s0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedFullConvert+InteractionEasterEgg", "onBindFeed:easterEggContainer==null call getEasterEggCenter");
        }
        if (c15408x626e05e != null) {
            c15408x626e05e.e(j17, w17, interfaceC4987x84e327cb);
            c15408x626e05e.setVisibility(8);
        }
    }
}
