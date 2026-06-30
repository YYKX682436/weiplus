package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class zj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl f192805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f192806e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar, long j17) {
        super(0);
        this.f192805d = tlVar;
        this.f192806e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        cw2.da videoView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar = this.f192805d;
        java.lang.Object obj = tlVar.f().f374658i;
        so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
        long j17 = this.f192806e;
        if (j17 > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.L7).mo141623x754a37bb()).r()).intValue() != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLongVideoShareContract", "show remind dialog not open");
            } else {
                java.lang.String stringExtra = tlVar.f190602d.getIntent().getStringExtra("FLOAT_BALL_KEY");
                boolean z17 = false;
                if (!(!(stringExtra == null || stringExtra.length() == 0))) {
                    if (u1Var != null && tlVar.f190621z == u1Var.mo2128x1ed62e84()) {
                        z17 = true;
                    }
                    if (z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLongVideoShareContract", "same feed id");
                    } else {
                        tlVar.f().p(com.p314xaae8f345.mm.R.id.frs).getLocationInWindow(new int[2]);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) tlVar.f().p(com.p314xaae8f345.mm.R.id.e_k);
                        long mo56695x7723e6ff = (c15196x85976f5f == null || (videoView = c15196x85976f5f.getVideoView()) == null) ? 0L : videoView.mo56695x7723e6ff();
                        if (mo56695x7723e6ff <= 0) {
                            mo56695x7723e6ff = 1000 * ((u1Var == null || (feedObject = u1Var.getFeedObject()) == null) ? 0L : feedObject.m59300x36bbd779());
                        }
                        if (mo56695x7723e6ff > 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLongVideoShareContract", "setupSeekLayoutRemindDialog, timeMill:" + j17 + ", duration:" + mo56695x7723e6ff);
                            double width = ((double) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) tlVar.f().p(com.p314xaae8f345.mm.R.id.e_k)).getWidth()) * 0.15d;
                            android.content.Context context = tlVar.f().f374654e;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                            do2.k kVar = new do2.k(context);
                            kVar.e((int) width, r12[1] - 8);
                            tlVar.B = kVar;
                            kVar.show();
                            pm0.v.V(3500L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.nl(tlVar));
                        }
                    }
                }
            }
        }
        in5.c cVar = (in5.c) tlVar.f().f374658i;
        long mo2128x1ed62e84 = cVar != null ? cVar.mo2128x1ed62e84() : 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLongVideoShareContract", "[checkSeek] video feedId=" + pm0.v.u(mo2128x1ed62e84) + " seekTime=" + j17);
        ((ey2.v2) pf5.u.f435469a.e(c61.l7.class).a(ey2.v2.class)).N6(mo2128x1ed62e84);
        java.lang.Object obj2 = tlVar.f().f374658i;
        so2.u1 u1Var2 = obj2 instanceof so2.u1 ? (so2.u1) obj2 : null;
        if (u1Var2 != null) {
            u1Var2.f492165f = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) tlVar.f().p(com.p314xaae8f345.mm.R.id.e_k);
        if (c15196x85976f5f2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f.Z(c15196x85976f5f2, this.f192806e, 3, 0.0f, false, null, 28, null);
        }
        return jz5.f0.f384359a;
    }
}
