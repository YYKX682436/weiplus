package p10;

/* loaded from: classes7.dex */
public final class e0 extends com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.mb.p732x373aa5.AbstractC10540x771b4b57 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.ActivityC10542x4d3a27a1 f432477m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.ActivityC10542x4d3a27a1 activityC10542x4d3a27a1) {
        super(activityC10542x4d3a27a1, null, 0);
        this.f432477m = activityC10542x4d3a27a1;
    }

    @Override // zq0.a, xq0.d
    public void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canvas view surface available, isCanvasFirstFrameRendered: ");
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.ActivityC10542x4d3a27a1 activityC10542x4d3a27a1 = this.f432477m;
        sb6.append(activityC10542x4d3a27a1.f147379r);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicCanvasViewContainer", sb6.toString());
        if (activityC10542x4d3a27a1.f147379r) {
            activityC10542x4d3a27a1.X6();
        }
    }

    @Override // zq0.a, xq0.d
    public void c(int i17, boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f432477m.f147369e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicCanvasViewContainer", "canvas view first frame rendered, cost time: " + currentTimeMillis + "ms, surfaceReady: " + z17);
        p10.c0 c0Var = this.f432477m.f147371g;
        if (c0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingComponent");
            throw null;
        }
        c0Var.a();
        this.f432477m.f147379r = true;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicCanvasViewContainer", "first frame rendered but surface not ready, redraw canvas");
            this.f432477m.X6();
        }
        bw5.d5 d5Var = bw5.d5.EcsNirvanaUILaunchResult;
        ((ku5.t0) ku5.t0.f394148d).h(new q10.o(this.f432477m.f147375n, d5Var, 0), "MicroMsg.EcsNirvanaReportUtil");
        ((ku5.t0) ku5.t0.f394148d).h(new q10.o(this.f432477m.f147375n, bw5.d5.EcsNirvanaLaunchTime, (int) currentTimeMillis), "MicroMsg.EcsNirvanaReportUtil");
    }

    @Override // zq0.a, xq0.d
    /* renamed from: isValid */
    public boolean mo157669x7b953cf2() {
        return this.f432477m.f147370f;
    }
}
