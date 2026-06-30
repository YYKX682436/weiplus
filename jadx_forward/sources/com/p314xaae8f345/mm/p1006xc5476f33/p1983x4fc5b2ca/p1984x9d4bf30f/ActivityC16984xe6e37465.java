package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f;

@db5.a(m123858x6ac9171 = 4099)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/activity/MMRecordUI;", "Lcom/tencent/mm/ui/gallery/BaseMediaTabActivity;", "<init>", "()V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.recordvideo.activity.MMRecordUI */
/* loaded from: classes10.dex */
public class ActivityC16984xe6e37465 extends com.p314xaae8f345.mm.ui.p2706xf44c7752.AbstractActivityC22408xd92d9051 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f237158t = 0;

    /* renamed from: f, reason: collision with root package name */
    public ut3.b f237159f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f237160g;

    /* renamed from: i, reason: collision with root package name */
    public jt3.h f237162i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f237163m;

    /* renamed from: n, reason: collision with root package name */
    public f25.m0 f237164n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f237165o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f237167q;

    /* renamed from: h, reason: collision with root package name */
    public final jt3.a f237161h = new jt3.a();

    /* renamed from: p, reason: collision with root package name */
    public int f237166p = -1;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.C16985xf78f73e f237168r = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6230x485f3fc9>() { // from class: com.tencent.mm.plugin.recordvideo.activity.MMRecordUI$voipCallEventListener$1
        {
            super(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465.this);
            this.f39173x3fe91575 = 1496544185;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6230x485f3fc9 c6230x485f3fc9) {
            jt3.h hVar;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6230x485f3fc9 event = c6230x485f3fc9;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
            boolean z17 = false;
            if (!gm0.j1.a()) {
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465 activityC16984xe6e37465 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465.this;
            if (activityC16984xe6e37465.isFinishing() || activityC16984xe6e37465.isDestroyed()) {
                return false;
            }
            if (event.f136477g.f89866a == "Voip_End") {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465.f237158t;
                activityC16984xe6e37465.b7();
                f25.m0 m0Var = activityC16984xe6e37465.f237164n;
                if (m0Var != null && ((g25.e) m0Var).f349513c) {
                    z17 = true;
                }
                if (z17 && (hVar = activityC16984xe6e37465.f237162i) != null) {
                    hVar.b();
                }
            }
            return true;
        }
    };

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.C16986x74b00d61 f237169s = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5384x2da57458>() { // from class: com.tencent.mm.plugin.recordvideo.activity.MMRecordUI$voipMutiCallEventListener$1
        {
            super(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465.this);
            this.f39173x3fe91575 = -2057571736;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5384x2da57458 c5384x2da57458) {
            jt3.h hVar;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5384x2da57458 event = c5384x2da57458;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
            boolean z17 = false;
            if (!gm0.j1.a()) {
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465 activityC16984xe6e37465 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465.this;
            if (activityC16984xe6e37465.isFinishing() || activityC16984xe6e37465.isDestroyed()) {
                return false;
            }
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465.f237158t;
            activityC16984xe6e37465.b7();
            f25.m0 m0Var = activityC16984xe6e37465.f237164n;
            if (m0Var != null && ((g25.e) m0Var).f349513c) {
                z17 = true;
            }
            if (z17 && (hVar = activityC16984xe6e37465.f237162i) != null) {
                hVar.b();
            }
            return true;
        }
    };

    @Override // com.p314xaae8f345.mm.ui.p2706xf44c7752.AbstractActivityC22408xd92d9051
    public void V6(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce abstractC17010x26b2d1ce;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMRecordUI", "onPageSelected: ");
        activity.getWindow().addFlags(1024);
        jt3.h hVar = this.f237162i;
        if (hVar != null && (abstractC17010x26b2d1ce = hVar.f383168g) != null) {
            abstractC17010x26b2d1ce.s();
        }
        this.f237167q = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2706xf44c7752.AbstractActivityC22408xd92d9051
    public void W6(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce abstractC17010x26b2d1ce;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMRecordUI", "onPageUnselected: ");
        jt3.h hVar = this.f237162i;
        if (hVar != null && (abstractC17010x26b2d1ce = hVar.f383168g) != null) {
            abstractC17010x26b2d1ce.u();
        }
        this.f237167q = false;
    }

    public final void X6() {
        android.view.ViewGroup.LayoutParams layoutParams;
        if (com.p314xaae8f345.mm.ui.bk.w()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = this.f237160g;
            boolean z17 = false;
            if (c16993xacc19624 != null && c16993xacc19624.N) {
                z17 = true;
            }
            if (z17) {
                mo55332x76847179().getWindow().getDecorView().setBackgroundColor(i65.a.d(mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
                int i17 = com.p314xaae8f345.mm.ui.bl.b(mo55332x76847179()).y;
                int i18 = (int) (i17 * 0.5625f);
                android.view.ViewGroup viewGroup = this.f237163m;
                if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
                    layoutParams.width = i18;
                    layoutParams.height = i17;
                    if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
                        ((android.widget.LinearLayout.LayoutParams) layoutParams).gravity = 17;
                    } else if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
                        ((android.widget.FrameLayout.LayoutParams) layoutParams).gravity = 17;
                    } else if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
                        ((android.widget.RelativeLayout.LayoutParams) layoutParams).addRule(13);
                    }
                }
                int i19 = vt3.q.f521570a;
                vt3.q.f521570a = i18;
                vt3.q.f521571b = i17;
                return;
            }
        }
        android.view.ViewGroup viewGroup2 = this.f237163m;
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup2 != null ? viewGroup2.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.width = -1;
        }
        android.view.ViewGroup viewGroup3 = this.f237163m;
        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup3 != null ? viewGroup3.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.height = -1;
        }
        int i27 = vt3.q.f521570a;
        vt3.q.f521570a = com.p314xaae8f345.mm.ui.bl.b(mo55332x76847179()).x;
        vt3.q.f521571b = com.p314xaae8f345.mm.ui.bl.b(mo55332x76847179()).y;
    }

    public final void Y6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMRecordUI", "enableVPSlide: " + z17);
        if (z17) {
            xg5.a aVar = this.f290218e;
            if (aVar != null) {
                ((b33.f) aVar).V6();
                return;
            }
            return;
        }
        xg5.a aVar2 = this.f290218e;
        if (aVar2 != null) {
            ((b33.f) aVar2).X6();
        }
    }

    public final void Z6() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("report", nu3.i.f421751a.l());
        setResult(0, intent);
        nu3.m.f421762a.i(2, 3L);
        finish();
    }

    public final boolean a7() {
        f25.m0 m0Var = this.f237164n;
        return m0Var != null && ((g25.e) m0Var).f349513c;
    }

    public final void b7() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe c6229x2bb765fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe();
        c6229x2bb765fe.e();
        if (c6229x2bb765fe.f136476g.f89780c || iq.b.H()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMRecordUI", "requestFocus fail for voip");
            return;
        }
        f25.m0 m0Var = this.f237164n;
        if (m0Var != null) {
            i95.m c17 = i95.n0.c(f25.n0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((f25.n0) c17).yg(m0Var);
        }
        this.f237164n = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.i0.f340632c, new it3.a0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMRecordUI", "finish  " + hashCode());
        super.finish();
        dw3.f0.f325739a.a();
        ut3.f.f512709c.f512710a = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightRecordConfig", "unInit");
        st3.t.f494134e = false;
        lt3.v vVar = lt3.v.f402810a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mix_background.VideoMixHandler", "VideoMixHandler resumeBgMix!");
        lt3.v.f402812c = false;
        lt3.v.f402815f = null;
        vVar.b();
        jt3.h hVar = this.f237162i;
        if (hVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordUIRouter", "finish " + hVar.f383168g);
            hVar.f383170i = true;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new jt3.c(hVar));
        }
        if (getIntent() == null || getIntent().getIntExtra("KEY_PARAMS_EXIT_ANIM", -1) == -1) {
            return;
        }
        overridePendingTransition(-1, getIntent().getIntExtra("KEY_PARAMS_EXIT_ANIM", -1));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cdb;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMRecordUI", "requestCode : " + i17 + " resultCode:" + i18 + "  " + hashCode());
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1 && i17 == 1 && intent != null) {
            setResult(-1, intent);
            ut3.b bVar = this.f237159f;
            if (bVar != null) {
                bVar.a(this, intent);
                return;
            }
            return;
        }
        jt3.h hVar = this.f237162i;
        if (hVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordUIRouter", "onActivityResult " + i17 + ' ' + i18 + ' ' + intent);
            if (hVar.f383172k) {
                ((ku5.t0) ku5.t0.f394148d).B(new jt3.d(hVar, i17, i18, intent));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce abstractC17010x26b2d1ce = hVar.f383168g;
                if (abstractC17010x26b2d1ce != null) {
                    abstractC17010x26b2d1ce.mo47332x9d4787cb(i17, i18, intent);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMRecordUI", "onBackPressed  " + hashCode());
        jt3.h hVar = this.f237162i;
        boolean z17 = false;
        if (hVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = this.f237160g;
            int i17 = c16993xacc19624 != null ? c16993xacc19624.F : 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordUIRouter", "onBackPressed " + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce abstractC17010x26b2d1ce = hVar.f383168g;
            boolean mo9064x4ceae47d = abstractC17010x26b2d1ce != null ? abstractC17010x26b2d1ce.mo9064x4ceae47d() : false;
            if (!mo9064x4ceae47d) {
                nu3.i iVar = nu3.i.f421751a;
                iVar.d(14);
                iVar.i(i17);
            }
            if (mo9064x4ceae47d) {
                z17 = true;
            }
        }
        if (z17) {
            return;
        }
        Z6();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i17 = newConfig.screenLayout;
        boolean z17 = ((i17 & 3) == 0 || (i17 & 16) == 0) ? false : true;
        if (z17 != this.f237165o) {
            this.f237165o = z17;
            X6();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x01fb, code lost:
    
        if (r26.i0.p(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54258x7b032c6e, r0, true) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0210, code lost:
    
        if (r0 == 999) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02db A[Catch: Exception -> 0x0302, TryCatch #2 {Exception -> 0x0302, blocks: (B:43:0x02be, B:45:0x02ce, B:62:0x02db, B:64:0x02e8, B:66:0x02f4), top: B:42:0x02be }] */
    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r41) {
        /*
            Method dump skipped, instructions count: 1661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMRecordUI", "MMRecordUI onDestroy " + hashCode());
        super.onDestroy();
        jt3.h hVar = this.f237162i;
        if (hVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordUIRouter", "onDestroy " + hVar.f383168g);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new jt3.e(hVar));
            if (hVar.f383168g instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17025x1dde6f4e) {
                nu3.i.f421751a.n("KEY_EXIT_TIME_MS_LONG", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
        }
        dw3.f0.f325739a.a();
        int intExtra = getIntent().getIntExtra("KEY_PARAMS_SELECTED_BIZ_INT", -1);
        if (intExtra == 2 || intExtra == 3) {
            ((wb0.e) ((xb0.e) i95.n0.c(xb0.e.class))).getClass();
            new rj.l().a();
        }
        nu3.m.f421762a.a();
        is0.b.f375924a.c();
        rm5.l.f479053a.a();
        mo48814x2efc64();
        mo48814x2efc64();
        f25.m0 m0Var = this.f237164n;
        if (m0Var != null) {
            i95.m c17 = i95.n0.c(f25.n0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((f25.n0) c17).yg(m0Var);
        }
        this.f237164n = null;
        vt3.l.f521538a.d();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        java.lang.Object obj;
        jt3.h hVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMRecordUI", "MMRecordUI onPause  isFinishing  : " + isFinishing() + "  " + hashCode() + "  ");
        super.onPause();
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        java.util.List p07 = Bi.p0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p07, "getBallInfoListSync(...)");
        java.util.Iterator it = p07.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) obj).f174579d;
            if (i17 == 35 || i17 == 34 || i17 == 21 || i17 == 32) {
                break;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) obj;
        if (this.f237166p != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMRecordUI", "abandonFocus");
            f25.m0 m0Var = this.f237164n;
            if (m0Var != null) {
                i95.m c17 = i95.n0.c(f25.n0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ((f25.n0) c17).yg(m0Var);
            }
            this.f237164n = null;
            jt3.h hVar2 = this.f237162i;
            if (hVar2 != null) {
                hVar2.d();
            }
        }
        if (this.f237166p == 0 && c12886x91aa2b6d != null) {
            Bi.X(false);
            Bi.y(true);
        }
        if (isFinishing() || (hVar = this.f237162i) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordUIRouter", "onPause " + hVar.f383168g);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce abstractC17010x26b2d1ce = hVar.f383168g;
        if (abstractC17010x26b2d1ce != null) {
            abstractC17010x26b2d1ce.mo11000xb01dfb57();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMRecordUI", "onRequestPermissionsResult, requestCode:" + i17);
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        jt3.h hVar = this.f237162i;
        if (hVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordUIRouter", "onRequestPermissionsResult " + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce abstractC17010x26b2d1ce = hVar.f383168g;
            if (abstractC17010x26b2d1ce != null) {
                abstractC17010x26b2d1ce.mo61366x953457f1(i17, permissions, grantResults);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[LOOP:0: B:4:0x0023->B:40:?, LOOP_END, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            r9 = this;
            java.lang.String r0 = "MMRecordUI onResume "
            java.lang.String r1 = "MicroMsg.MMRecordUI"
            r2 = 0
            super.onResume()     // Catch: java.lang.Exception -> Lbf
            java.lang.Class<pv.d0> r3 = pv.d0.class
            i95.m r3 = i95.n0.c(r3)     // Catch: java.lang.Exception -> Lbf
            pv.d0 r3 = (pv.d0) r3     // Catch: java.lang.Exception -> Lbf
            ov.i0 r3 = (ov.i0) r3     // Catch: java.lang.Exception -> Lbf
            gp1.v r3 = r3.Bi()     // Catch: java.lang.Exception -> Lbf
            java.util.List r4 = r3.p0()     // Catch: java.lang.Exception -> Lbf
            java.lang.String r5 = "getBallInfoListSync(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r5)     // Catch: java.lang.Exception -> Lbf
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> Lbf
        L23:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Exception -> Lbf
            r6 = 1
            if (r5 == 0) goto L4a
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Exception -> Lbf
            r7 = r5
            com.tencent.mm.plugin.ball.model.BallInfo r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) r7     // Catch: java.lang.Exception -> Lbf
            int r7 = r7.f174579d     // Catch: java.lang.Exception -> Lbf
            r8 = 35
            if (r7 == r8) goto L46
            r8 = 34
            if (r7 == r8) goto L46
            r8 = 21
            if (r7 == r8) goto L46
            r8 = 32
            if (r7 != r8) goto L44
            goto L46
        L44:
            r7 = r2
            goto L47
        L46:
            r7 = r6
        L47:
            if (r7 == 0) goto L23
            goto L4b
        L4a:
            r5 = 0
        L4b:
            com.tencent.mm.plugin.ball.model.BallInfo r5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) r5     // Catch: java.lang.Exception -> Lbf
            jt3.h r4 = r9.f237162i     // Catch: java.lang.Exception -> Lbf
            if (r4 == 0) goto L6d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbf
            java.lang.String r8 = "onResume "
            r7.<init>(r8)     // Catch: java.lang.Exception -> Lbf
            com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout r8 = r4.f383168g     // Catch: java.lang.Exception -> Lbf
            r7.append(r8)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> Lbf
            java.lang.String r8 = "MicroMsg.RecordUIRouter"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r7)     // Catch: java.lang.Exception -> Lbf
            com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout r4 = r4.f383168g     // Catch: java.lang.Exception -> Lbf
            if (r4 == 0) goto L6d
            r4.mo11001x57429eec()     // Catch: java.lang.Exception -> Lbf
        L6d:
            int r4 = r9.f237166p     // Catch: java.lang.Exception -> Lbf
            if (r4 == r6) goto L81
            r9.b7()     // Catch: java.lang.Exception -> Lbf
            boolean r4 = r9.a7()     // Catch: java.lang.Exception -> Lbf
            if (r4 == 0) goto L81
            jt3.h r4 = r9.f237162i     // Catch: java.lang.Exception -> Lbf
            if (r4 == 0) goto L81
            r4.b()     // Catch: java.lang.Exception -> Lbf
        L81:
            int r4 = r9.f237166p     // Catch: java.lang.Exception -> Lbf
            if (r4 != 0) goto L8d
            if (r5 == 0) goto L8d
            r3.X(r6)     // Catch: java.lang.Exception -> Lbf
            r3.d(r6)     // Catch: java.lang.Exception -> Lbf
        L8d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbf
            r3.<init>()     // Catch: java.lang.Exception -> Lbf
            r3.append(r0)     // Catch: java.lang.Exception -> Lbf
            int r4 = r9.hashCode()     // Catch: java.lang.Exception -> Lbf
            r3.append(r4)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r4 = " toWhere:"
            r3.append(r4)     // Catch: java.lang.Exception -> Lbf
            int r4 = r9.f237166p     // Catch: java.lang.Exception -> Lbf
            r3.append(r4)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r4 = " hasGainFocus("
            r3.append(r4)     // Catch: java.lang.Exception -> Lbf
            boolean r4 = r9.a7()     // Catch: java.lang.Exception -> Lbf
            r3.append(r4)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r4 = ") "
            r3.append(r4)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> Lbf
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r3)     // Catch: java.lang.Exception -> Lbf
            goto Ldd
        Lbf:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            int r0 = r9.hashCode()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0)
            java.lang.String r0 = ""
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r3, r0, r2)
            r9.finish()
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465.onResume():void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
        super.onSaveInstanceState(outState);
        jt3.h hVar = this.f237162i;
        if (hVar != null) {
            java.util.Map viewMap = hVar.f383167f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewMap, "viewMap");
            java.util.Iterator it = viewMap.entrySet().iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce) ((java.util.Map.Entry) it.next()).getValue()).x(outState);
            }
        }
        ut3.b bVar = this.f237159f;
        if (bVar != null) {
            bVar.mo160886xa71a2260(outState);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(ht3.l.class);
        set.add(ht3.g.class);
        set.addAll(((pc0.s2) ((qc0.k1) i95.n0.c(qc0.k1.class))).f434839e);
    }
}
