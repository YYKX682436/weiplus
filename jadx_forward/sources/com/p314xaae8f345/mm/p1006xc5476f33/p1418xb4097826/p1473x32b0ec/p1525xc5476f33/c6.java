package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class c6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f193649p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f193650q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 f193651r;

    /* renamed from: s, reason: collision with root package name */
    public hq0.e0 f193652s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f193653t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f193649p = statusMonitor;
        this.f193650q = "FinderLiveAnchorGamePlugin";
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f193651r = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6(context, root, statusMonitor, this);
    }

    @Override // qo0.a
    public boolean B0() {
        if (this.f446856d.getVisibility() != 0) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var = this.f193651r;
        d6Var.getClass();
        qo0.c.a(d6Var.f199593b, qo0.b.A2, null, 2, null);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    @Override // qo0.a
    public void I0() {
        hq0.e0 e0Var = this.f193652s;
        if (e0Var != null) {
            e0Var.f();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 27 || ordinal == 28) {
            u1();
            return;
        }
        switch (ordinal) {
            case 104:
                w1(r45.r84.ClickController, bundle);
                return;
            case 105:
                u1();
                return;
            case 106:
                w1(r45.r84.GoGiftSettingPage, bundle);
                return;
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void k1(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193650q, "checkAutoShow onNewIntent");
        if (((mm2.c1) P0(mm2.c1.class)).a8()) {
            t1(intent);
        }
    }

    /* renamed from: onResume */
    public final void m56914x57429eec() {
        android.view.ViewGroup viewGroup = this.f446856d;
        int visibility = viewGroup.getVisibility();
        java.lang.String str = this.f193650q;
        if (visibility == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onResume serverLost:" + this.f193653t);
            if (this.f193653t) {
                v1();
                this.f193653t = false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6.h(this.f193651r, true, false, 2, null);
            hq0.e0 e0Var = this.f193652s;
            if (e0Var != null) {
                e0Var.j();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkAutoShow resume");
        if (((mm2.c1) P0(mm2.c1.class)).a8()) {
            android.content.Context context = viewGroup.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            t1(activity != null ? activity.getIntent() : null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1(android.content.Intent intent) {
        android.app.Activity activity;
        android.content.Intent intent2;
        android.content.Intent intent3;
        java.lang.String stringExtra;
        int intExtra = intent != null ? intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0) : 0;
        android.view.ViewGroup viewGroup = this.f446856d;
        java.lang.String str = this.f193650q;
        if (intExtra == 11) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkAutoShow showHalf");
            w1(r45.r84.ClickController, null);
            android.content.Context context = viewGroup.getContext();
            activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity == null || (intent2 = activity.getIntent()) == null) {
                return;
            }
            intent2.putExtra("KEY_PARAMS_DO_ACTION", 0);
            return;
        }
        if (intExtra != 16) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkAutoShow showHalf v2");
        r45.r84 r84Var = r45.r84.GoGiftSettingPage;
        android.os.Bundle bundle = new android.os.Bundle();
        if (intent != null && (stringExtra = intent.getStringExtra("KEY_PARAMS_DO_ACTION_PARAMS")) != null) {
            if (!(stringExtra.length() > 0)) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                bundle.putString("KEY_PARAMS_DO_ACTION_PARAMS", stringExtra);
            }
        }
        w1(r84Var, bundle);
        android.content.Context context2 = viewGroup.getContext();
        activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        if (activity == null || (intent3 = activity.getIntent()) == null) {
            return;
        }
        intent3.putExtra("KEY_PARAMS_DO_ACTION", 0);
    }

    public final void u1() {
        if (this.f446856d.getVisibility() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193650q, "hidePlayTogether");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f193651r.f199607p;
            if (c22613xe7040d9c == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
                throw null;
            }
            if (c22613xe7040d9c.isShowing) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c.b(c22613xe7040d9c, null, 1, null);
            }
        }
    }

    public final void v1() {
        java.lang.String str = this.f193650q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setupDynamicCardEnv");
        boolean z17 = true;
        boolean z18 = ((mm2.c1) P0(mm2.c1.class)).A7() == null;
        int intValue = ((java.lang.Number) ae2.in.f85359n7.r()).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "enableDynamicCard playTogetherJumpInfo is null:" + z18 + ", localSwitchValue:" + intValue + " ,localSwitchValue:  native(有mb): 2, liteapp: 0、1");
        if (!z18 && intValue != 2) {
            z17 = false;
        }
        if (z17) {
            ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).Ai("wxe208ce76dfa39515");
            ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).Di(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b6(this));
            java.lang.String str2 = ((mm2.c1) P0(mm2.c1.class)).f410385o;
            long j17 = ((mm2.e1) P0(mm2.e1.class)).f410516m;
            zl2.r4 r4Var = zl2.r4.f555483a;
            android.view.ViewGroup viewGroup = this.f446856d;
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.String j07 = r4Var.j0(context);
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            java.lang.String str3 = a52.a.f83117l;
            java.lang.String f17 = dk2.q4.f315471a.f(((ml2.r0) i95.n0.c(ml2.r0.class)).M, "enter_immerse_type");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
            oe0.u uVar = new oe0.u(str2, j17, j07, str3, f17, null, null, null, 224, null);
            oe0.x xVar = (oe0.x) i95.n0.c(oe0.x.class);
            java.lang.Object obj = new java.lang.Object();
            android.content.Context context2 = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            hq0.e0 wi6 = ((ne0.r) xVar).wi(obj, context2, uVar);
            this.f193652s = wi6;
            if (wi6 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var = this.f193651r;
                d6Var.getClass();
                d6Var.f199609r = wi6;
                java.util.Iterator it = d6Var.f199600i.iterator();
                while (it.hasNext()) {
                    ((cm2.p) it.next()).f124908f = wi6;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w1(r45.r84 r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.lang.String r0 = "scene"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            java.lang.Class<mm2.c1> r0 = mm2.c1.class
            androidx.lifecycle.c1 r0 = r3.P0(r0)
            mm2.c1 r0 = (mm2.c1) r0
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r0.A7()
            java.lang.String r1 = r3.f193650q
            if (r0 == 0) goto L4d
            ae2.in r0 = ae2.in.f85221a
            lb2.j r0 = ae2.in.f85359n7
            java.lang.Object r0 = r0.r()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2 = 2
            if (r0 == r2) goto L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[showPlayTogether] scene = "
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r2 = ", param = "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            java.lang.Class<df2.oj> r0 = df2.oj.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r3.U0(r0)
            df2.oj r0 = (df2.oj) r0
            if (r0 == 0) goto L60
            r0.k7(r4, r5)
            goto L60
        L4d:
            java.lang.String r4 = "showPlayTogether"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r4)
            r4 = 0
            r3.K0(r4)
            r5 = 3
            r0 = 0
            com.tencent.mm.plugin.finder.live.widget.d6 r1 = r3.f193651r
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6.h(r1, r4, r4, r5, r0)
            r3.v1()
        L60:
            long r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184206b
            r0 = 18
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L82
            com.tencent.mm.plugin.finder.assist.x2 r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184205a
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r0 = "type"
            r1 = 4
            r5.put(r0, r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "toString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r0)
            r4.d(r5)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c6.w1(r45.r84, android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var = this.f193651r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = d6Var.f199594c;
        ((mm2.c1) lVar.P0(mm2.c1.class)).f410366k6.mo7806x9d92d11c(lVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y5(d6Var));
    }
}
