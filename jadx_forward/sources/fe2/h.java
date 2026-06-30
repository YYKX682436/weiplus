package fe2;

/* loaded from: classes3.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f343047p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f343048q;

    /* renamed from: r, reason: collision with root package name */
    public mm2.o6 f343049r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f343047p = jz5.h.b(new fe2.e(context, this));
        this.f343048q = context.getIntent().getBooleanExtra("key_enter_live_param_is_from_chat_group", false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 234) {
            if (bundle == null || bundle.getInt("requestCode") != 16) {
                return;
            }
            boolean z17 = bundle.getBoolean("is_share_success");
            java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("current_group_select");
            if (z17) {
                if (stringArrayList != null && !stringArrayList.isEmpty()) {
                    r6 = false;
                }
                if (!r6) {
                    p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c), null, null, new fe2.f(stringArrayList, this, null), 3, null);
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleShareToChatGroup: ");
            sb6.append(z17);
            sb6.append(" groupId: ");
            sb6.append(stringArrayList != null ? kz5.n0.g0(stringArrayList, ",", null, null, 0, null, null, 62, null) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveBoxGroupHintPlugin", sb6.toString());
            return;
        }
        if (ordinal != 243) {
            return;
        }
        if ((bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_START_BY_MINI_WINDOW") : false) || mm2.g0.Q6((mm2.g0) P0(mm2.g0.class), null, 1, null)) {
            return;
        }
        df2.xw xwVar = (df2.xw) U0(df2.xw.class);
        if ((xwVar == null || xwVar.e7()) ? false : true) {
            de2.h t17 = t1();
            r45.qm1 qm1Var = (r45.qm1) ((mm2.e0) P0(mm2.e0.class)).f410503m.mo3195x754a37bb();
            if (qm1Var == null || (str = qm1Var.m75945x2fec8307(1)) == null) {
                str = "";
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (n17 == null) {
                c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f573072dg4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getString(...)");
            } else {
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                c17 = c01.a2.c(n17, str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getDisplayName(...)");
            }
            t17.f310918f = c17;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("isFromChatEnter: ");
            boolean z18 = this.f343048q;
            sb7.append(z18);
            sb7.append(", ");
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_BOX_HINT_INT_SYNC;
            sb7.append(c18.r(u3Var, 0) == 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveBoxGroupHintPlugin", sb7.toString());
            if (z18) {
                if (gm0.j1.u().c().r(u3Var, 0) == 0) {
                    mm2.o6 o6Var = new mm2.o6(mm2.p6.f410888h, new fe2.b(this), new fe2.c(this), null, 8, null);
                    pm0.v.X(new mm2.r6((mm2.w6) P0(mm2.w6.class), o6Var));
                    this.f343049r = o6Var;
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final de2.h t1() {
        return (de2.h) ((jz5.n) this.f343047p).mo141623x754a37bb();
    }
}
