package ck2;

/* loaded from: classes10.dex */
public final class o extends if2.b implements ak2.a, mf2.n {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f42433m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f42434n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f42435o;

    /* renamed from: p, reason: collision with root package name */
    public zj2.b f42436p;

    /* renamed from: q, reason: collision with root package name */
    public zj2.c f42437q;

    /* renamed from: r, reason: collision with root package name */
    public if2.d0 f42438r;

    /* renamed from: s, reason: collision with root package name */
    public final bk2.c f42439s;

    /* renamed from: t, reason: collision with root package name */
    public mm2.o6 f42440t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f42441u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f42433m = "MilestoneBannerController_" + hashCode();
        this.f42439s = new bk2.c(store, store.getLiveRoomData());
    }

    @Override // mf2.n
    public void S0(mm2.r4 data, boolean z17, boolean z18, boolean z19) {
        kotlin.jvm.internal.o.g(data, "data");
        pm0.v.X(new ck2.k(z17, data, this, z18, z19));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (zl2.r4.f473950a.I0().getBoolean("milestone_".concat(r0), false) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6(r45.f02 r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L79
            int r0 = r9.f373881g
            r1 = 1
            boolean r0 = pm0.v.z(r0, r1)
            r2 = 0
            if (r0 == 0) goto L2a
            java.lang.String r0 = r9.f373878d
            if (r0 != 0) goto L12
            java.lang.String r0 = ""
        L12:
            zl2.q4 r3 = zl2.q4.f473933a
            r3.E()
            zl2.r4 r3 = zl2.r4.f473950a
            com.tencent.mm.sdk.platformtools.o4 r3 = r3.I0()
            java.lang.String r4 = "milestone_"
            java.lang.String r0 = r4.concat(r0)
            boolean r0 = r3.getBoolean(r0, r2)
            if (r0 == 0) goto L2a
            goto L2b
        L2a:
            r1 = r2
        L2b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "checkShowLotteryResult hasLottery: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r2 = " ext_flag: "
            r0.append(r2)
            int r2 = r9.f373881g
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r8.f42433m
            com.tencent.mars.xlog.Log.i(r2, r0)
            if (r1 != 0) goto L79
            int r0 = r9.f373881g
            if (r0 <= 0) goto L79
            mm2.o6 r0 = new mm2.o6
            mm2.p6 r2 = mm2.p6.f329354g
            ck2.b r3 = new ck2.b
            r3.<init>(r8, r9)
            ck2.c r4 = new ck2.c
            r4.<init>(r8)
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.Class<mm2.w6> r9 = mm2.w6.class
            androidx.lifecycle.c1 r9 = r8.business(r9)
            mm2.w6 r9 = (mm2.w6) r9
            r9.getClass()
            mm2.r6 r1 = new mm2.r6
            r1.<init>(r9, r0)
            pm0.v.X(r1)
            r8.f42440t = r0
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ck2.o.Z6(r45.f02):void");
    }

    public final zj2.b a7() {
        zj2.b bVar = this.f42436p;
        if (bVar == null) {
            android.view.ViewGroup viewGroup = this.f42434n;
            bVar = viewGroup != null ? new zj2.b(viewGroup, this) : null;
        }
        this.f42436p = bVar;
        return bVar;
    }

    public final zj2.c b7() {
        zj2.c cVar = this.f42437q;
        if (cVar == null) {
            android.view.ViewGroup viewGroup = this.f42434n;
            cVar = viewGroup != null ? new zj2.c(viewGroup, this) : null;
        }
        this.f42437q = cVar;
        return cVar;
    }

    public final boolean c7() {
        android.content.Context context;
        android.view.View view;
        zj2.b bVar = this.f42436p;
        if (bVar == null || (view = bVar.f473287a) == null || (context = view.getContext()) == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        return com.tencent.mm.ui.bk.Q() && (com.tencent.mm.ui.bk.P(context) || com.tencent.mm.ui.bk.O(context.getContentResolver()));
    }

    public void d7() {
        r45.f02 f02Var;
        mm2.r4 P6 = ((mm2.v4) business(mm2.v4.class)).P6();
        java.lang.String str = (P6 == null || (f02Var = P6.f329379d) == null) ? null : f02Var.f373878d;
        com.tencent.mars.xlog.Log.i(this.f42433m, "onBubbleClick currentLotteryId: " + str);
        if (zl2.r4.f473950a.w1()) {
            f7(null);
        } else {
            f7(str);
        }
    }

    public final void e7(df2.dn dnVar, r45.f02 f02Var, yz5.l lVar) {
        android.view.ViewGroup viewGroup = this.f42435o;
        android.content.Context context = viewGroup != null ? viewGroup.getContext() : null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        boolean isDestroyed = activity != null ? activity.isDestroyed() : false;
        java.lang.String str = this.f42433m;
        mm2.w4.a(f02Var, str, "showLotteryResult source: " + dnVar);
        if (isDestroyed) {
            com.tencent.mars.xlog.Log.i(str, "showLotteryResult page isDestroyed");
            return;
        }
        df2.un unVar = (df2.un) controller(df2.un.class);
        if (unVar != null) {
            unVar.Z6();
        }
        java.lang.String str2 = f02Var.f373878d;
        com.tencent.mars.xlog.Log.i("FinderLiveMilestoneUtil", "recordCardOpenLottery lottery: " + str2);
        zl2.r4.f473950a.I0().putBoolean("milestone_" + str2, true);
        if (f02Var.f373881g > 0) {
            com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new ck2.m(this, dnVar, f02Var, lVar, null), 3, null);
        }
    }

    public final void f7(java.lang.String str) {
        if (U6() && !c7() && !com.tencent.mm.ui.bk.d0()) {
            W6(new ck2.n(this, str));
            return;
        }
        df2.un unVar = (df2.un) controller(df2.un.class);
        if (unVar != null) {
            unVar.d7(str);
        }
    }

    public final void g7(r45.g02 g02Var) {
        r45.tl4 tl4Var;
        r45.tl4 tl4Var2;
        mm2.r4 P6 = ((mm2.v4) business(mm2.v4.class)).P6();
        r45.f02 f02Var = P6 != null ? P6.f329379d : null;
        if (g02Var == null && f02Var == null) {
            if2.d0 d0Var = this.f42438r;
            if (d0Var != null) {
                d0Var.d(8);
                return;
            }
            return;
        }
        if ((f02Var == null || (tl4Var2 = f02Var.f373879e) == null || tl4Var2.f386548g != 1) ? false : true) {
            return;
        }
        if (((f02Var == null || (tl4Var = f02Var.f373879e) == null || tl4Var.f386548g != 2) ? false : true) || g02Var == null) {
            return;
        }
        zj2.b a76 = a7();
        if (a76 != null) {
            java.lang.String str = g02Var.f374769e;
            if (str == null) {
                str = "";
            }
            a76.f473290d.setText(str);
        }
        zj2.b a77 = a7();
        if (a77 != null) {
            a77.f473289c.setVisibility(0);
        }
        zj2.c b76 = b7();
        if (b76 != null) {
            b76.f473293f.setVisibility(8);
        }
        if2.d0 d0Var2 = this.f42438r;
        if (d0Var2 != null) {
            d0Var2.d(0);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new ck2.e(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new ck2.g(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new ck2.i(this, null), 3, null);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        this.f42439s.b("onDestroy");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        if (this.f42441u) {
            d7();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStartFromWindow() {
        r45.f02 f02Var = (r45.f02) ((kotlinx.coroutines.flow.h3) ((mm2.v4) business(mm2.v4.class)).f329479i).getValue();
        if (f02Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLiveStartFromWindow status: ");
            r45.tl4 tl4Var = f02Var.f373879e;
            sb6.append(tl4Var != null ? java.lang.Integer.valueOf(tl4Var.f386548g) : null);
            sb6.append(" id: ");
            sb6.append(f02Var.f373878d);
            com.tencent.mars.xlog.Log.i(this.f42433m, sb6.toString());
            r45.tl4 tl4Var2 = f02Var.f373879e;
            boolean z17 = false;
            if (tl4Var2 != null && tl4Var2.f386548g == 3) {
                z17 = true;
            }
            if (z17) {
                Z6(f02Var);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        android.content.Intent intent;
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        this.f42434n = (android.view.ViewGroup) pluginLayout.findViewById(com.tencent.mm.R.id.f484732fb3);
        this.f42435o = (android.view.ViewGroup) pluginLayout.findViewById(com.tencent.mm.R.id.evm);
        android.view.ViewGroup viewGroup = this.f42434n;
        if (viewGroup != null) {
            if2.d0 d0Var = new if2.d0(viewGroup, this);
            this.f42438r = d0Var;
            this.f291103i = new ck2.l(d0Var);
        }
        if2.d0 d0Var2 = this.f42438r;
        if (d0Var2 != null) {
            d0Var2.d(8);
        }
        r45.f02 f02Var = (r45.f02) ((kotlinx.coroutines.flow.h3) ((mm2.v4) business(mm2.v4.class)).f329479i).getValue();
        if (f02Var != null) {
            this.f42439s.a(f02Var);
        }
        r45.g02 g02Var = (r45.g02) ((kotlinx.coroutines.flow.h3) ((mm2.v4) business(mm2.v4.class)).f329477g).getValue();
        if (g02Var != null) {
            g7(g02Var);
        }
        android.view.ViewGroup viewGroup2 = this.f42435o;
        java.lang.Integer num = null;
        android.content.Context context = viewGroup2 != null ? viewGroup2.getContext() : null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            num = java.lang.Integer.valueOf(intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0));
        }
        if (num != null && num.intValue() == 12) {
            this.f42441u = true;
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        android.content.Intent intent;
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        if (this.f42441u) {
            android.view.ViewGroup viewGroup = this.f42435o;
            android.content.Context context = viewGroup != null ? viewGroup.getContext() : null;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null && (intent = activity.getIntent()) != null) {
                intent.putExtra("KEY_PARAMS_DO_ACTION", 0);
            }
            this.f42441u = false;
        }
        this.f42436p = null;
        this.f42437q = null;
        this.f42434n = null;
        this.f42435o = null;
        this.f42438r = null;
    }
}
