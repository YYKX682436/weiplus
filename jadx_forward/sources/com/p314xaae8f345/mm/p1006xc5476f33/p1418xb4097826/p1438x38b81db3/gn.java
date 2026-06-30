package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class gn implements cw2.e4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn f185032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185033b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f185034c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15195x130b2a6d f185035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f185036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f185037f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f185038g;

    public gn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn ynVar, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15195x130b2a6d c15195x130b2a6d, boolean z17, long j17, so2.u1 u1Var) {
        this.f185032a = ynVar;
        this.f185033b = s0Var;
        this.f185034c = c15196x85976f5f;
        this.f185035d = c15195x130b2a6d;
        this.f185036e = z17;
        this.f185037f = j17;
        this.f185038g = u1Var;
    }

    @Override // cw2.e4
    public void a(int i17) {
    }

    @Override // cw2.e4
    public void b(float f17) {
        int i17;
        if (f17 == 0.5f) {
            i17 = com.p314xaae8f345.mm.R.raw.f80041x58acb40d;
        } else {
            if (!(f17 == 1.0f)) {
                if (f17 == 1.5f) {
                    i17 = com.p314xaae8f345.mm.R.raw.f80043x58acb7ce;
                } else {
                    if (f17 == 2.0f) {
                        i17 = com.p314xaae8f345.mm.R.raw.f80044xdb98d219;
                    }
                }
            }
            i17 = com.p314xaae8f345.mm.R.raw.f80042xdb98d218;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f185033b.p(com.p314xaae8f345.mm.R.id.iqj);
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setImageResource(i17);
        }
    }

    @Override // cw2.e4
    public void c(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f185034c;
        if (c15196x85976f5f.J()) {
            this.f185035d.mo61296x11f3be80(true);
        }
        if (this.f185036e) {
            long j18 = this.f185037f;
            if (j18 <= 0) {
                cw2.da videoView = c15196x85976f5f.getVideoView();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView : null;
                j18 = c15188xd8bd4bd != null ? c15188xd8bd4bd.mo56695x7723e6ff() : 0L;
            }
            if (j17 <= 0 || j18 <= 0) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn ynVar = this.f185032a;
            long j19 = ynVar.E1;
            so2.u1 u1Var = this.f185038g;
            if (j19 != u1Var.mo2128x1ed62e84()) {
                jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea.f189366d;
                if (j18 - j17 <= ((java.lang.Number) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea.f189366d).mo141623x754a37bb()).longValue() * 1000) {
                    ynVar.E1 = u1Var.mo2128x1ed62e84();
                    android.content.Context context = this.f185033b.f374654e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.po poVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.po) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.po.class);
                    if (poVar != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar = poVar.f217105d;
                        tlVar.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.ea eaVar = tlVar.f190614s;
                        eaVar.getClass();
                        eaVar.a(u1Var.mo2128x1ed62e84(), u1Var.getFeedObject().m59276x6c285d75(), (i17 & 4) != 0 ? null : null, (i17 & 8) != 0 ? null : null, (i17 & 16) != 0 ? null : null, (i17 & 32) != 0 ? null : null);
                    }
                }
            }
        }
    }

    @Override // cw2.e4
    public void d() {
    }

    @Override // cw2.e4
    public void e(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLongVideoConvert", "onPlayStatusChange: isPlay=" + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn ynVar = this.f185032a;
        if (!z17) {
            java.lang.Runnable runnable = ynVar.D1;
            if (runnable != null) {
                ynVar.R1().mo50300x3fa464aa(runnable);
                ynVar.D1 = null;
                return;
            }
            return;
        }
        java.lang.Runnable runnable2 = ynVar.D1;
        if (runnable2 != null) {
            ynVar.R1().mo50300x3fa464aa(runnable2);
            ynVar.D1 = null;
        }
        ynVar.D1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bn(this.f185033b, ynVar);
        ynVar.R1().mo50297x7c4d7ca2(ynVar.D1, 5000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0291  */
    @Override // cw2.e4
    /* renamed from: onVideoEnded */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo55679x653dba3e() {
        /*
            Method dump skipped, instructions count: 1421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gn.mo55679x653dba3e():void");
    }
}
