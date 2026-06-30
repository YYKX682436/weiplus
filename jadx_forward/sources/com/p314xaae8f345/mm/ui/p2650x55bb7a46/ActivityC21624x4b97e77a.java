package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

@pk.b(m158604x6ac9171 = pk.a.NAVIGATION_BAR)
@gm0.a2
/* renamed from: com.tencent.mm.ui.chatting.ChattingUI */
/* loaded from: classes11.dex */
public class ActivityC21624x4b97e77a extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17354xafef217a {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f279786t = 0;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea f279787h;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88 f279789m;

    /* renamed from: r, reason: collision with root package name */
    public vj5.k f279794r;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f279788i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();

    /* renamed from: n, reason: collision with root package name */
    public al5.r f279790n = al5.r.f87538e;

    /* renamed from: o, reason: collision with root package name */
    public final al5.q f279791o = al5.q.f87522e;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f279792p = "";

    /* renamed from: q, reason: collision with root package name */
    public int f279793q = 0;

    /* renamed from: s, reason: collision with root package name */
    public final m3.i f279795s = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.q8(this);

    public static int e7(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, yb5.d dVar) {
        if (z3Var == null || dVar == null) {
            return -1;
        }
        java.lang.String d17 = z3Var.d1();
        if ("notification_messages".equals(d17) || "notifymessage".equals(d17) || "schedule_message".equals(d17) || "schedule_message".equals(d17)) {
            return 0;
        }
        boolean k27 = z3Var.k2();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = dVar.f542241c;
        if (!k27) {
            if (cVar.a(sb5.s.class) == null || !((sb5.s) cVar.a(sb5.s.class)).u()) {
                return dVar.C() ? c01.e2.R(d17) ? 10 : 7 : com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(d17) ? 9 : 6;
            }
            return 8;
        }
        sb5.f fVar = (sb5.f) cVar.a(sb5.f.class);
        if (fVar == null) {
            return -1;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) fVar;
        return aVar.f280286r ? aVar.f280287s ? 2 : 1 : z3Var.m2() ? 4 : 5;
    }

    public static int f7(int i17, yb5.d dVar) {
        if (dVar == null) {
            return 0;
        }
        boolean r07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) dVar.f542241c.a(sb5.q2.class))).r0();
        switch (i17) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
                return r07 ? 1 : 2;
            case 3:
            case 8:
            default:
                return 0;
        }
    }

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c7() {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea(true);
    }

    /* renamed from: d7 */
    public boolean getF284335v() {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.q8) this.f279795s).get() != null;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f279787h;
        if (c21628xcedb13ea == null || !c21628xcedb13ea.mo78345x1f03f0c2(keyEvent.getKeyCode(), keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f279787h;
        if (c21628xcedb13ea != null && c21628xcedb13ea.f279685f.f542241c.a(sb5.p1.class) != null && ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ej) ((sb5.p1) this.f279787h.f279685f.f542241c.a(sb5.p1.class))).f280510e && !((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ej) ((sb5.p1) this.f279787h.f279685f.f542241c.a(sb5.p1.class))).f280511f) {
            int m07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ej) ((sb5.p1) this.f279787h.f279685f.f542241c.a(sb5.p1.class))).m0();
            getIntent().putExtra("select_record_msg_num", m07);
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f279787h.f279685f.f542241c.a(sb5.z.class))).W;
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            if (copyOnWriteArraySet != null) {
                java.util.Iterator it = copyOnWriteArraySet.iterator();
                long j17 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = (com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) it.next();
                    arrayList.add(c16564xb55e1d5.f231013d + "");
                    long j18 = c16564xb55e1d5.f231013d;
                    if (j18 < j17) {
                        j17 = j18;
                    }
                }
                getIntent().putStringArrayListExtra("key_selected_record_msg_list", arrayList);
                getIntent().putExtra("select_record_min_msg_id", j17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI", "select record msg %s", java.lang.Integer.valueOf(m07));
            setResult(-1, getIntent());
        }
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Set<java.lang.Class<? extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9>> mo43419xa59964ef = super.mo43419xa59964ef();
        if (mo43419xa59964ef != null) {
            hashSet.addAll(mo43419xa59964ef);
        }
        hashSet.add(la5.c0.class);
        hashSet.add(la5.m.class);
        hashSet.add(la5.u.class);
        hashSet.add(cd0.b.class);
        hashSet.add(la5.w.class);
        return hashSet;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: isCallSuperOnSaveInstanceState */
    public boolean mo52915xa8181dad() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_media_opt_saveinstance, true) && (com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A());
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        this.f279787h.mo7496x9d4787cb(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.q8 q8Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.q8) this.f279795s;
        if (q8Var.get() != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.db) q8Var.get()).d7();
        }
        if (fp.e0.e() || u75.e.a() || fp.e0.f()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5774x7fae8755 c5774x7fae8755 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5774x7fae8755();
            boolean contains = configuration.toString().contains("mWindowingMode=100");
            am.am amVar = c5774x7fae8755.f136088g;
            amVar.f87696a = contains;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI", "onConfigurationChanged: OPPO isInMultiWindowMode:%s ", java.lang.Boolean.valueOf(amVar.f87696a));
            c5774x7fae8755.e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0047  */
    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m3.i iVar = this.f279795s;
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.q8) iVar).get() != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.db) ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.q8) iVar).get()).a7();
        }
        vj5.n.b(this).f(this.f279794r);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (com.p314xaae8f345.mm.ui.bk.y()) {
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f145060m = false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI", "chatting onRequestPermissionsResult");
        this.f279787h.mo7516x953457f1(i17, strArr, iArr);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        ((os.a) ((ps.e) i95.n0.c(ps.e.class))).getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1022xc56d9687.a.f156187d.a()) {
            ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        }
        if (com.p314xaae8f345.mm.ui.bk.y()) {
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f145060m = true;
        }
        sb5.e1 e1Var = (sb5.e1) this.f279787h.f279685f.f542241c.a(sb5.e1.class);
        if (e1Var != null) {
            this.f279793q = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ah) e1Var).f280157f;
        }
        int e76 = e7(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(this.f279792p, true), this.f279787h.f279685f);
        if (e76 == 6) {
            cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_Single);
            aVar.Rj(this, iy1.a.SingleChat);
            aVar.dk(this, "ChattingUI_Single");
            return;
        }
        if (e76 == 7) {
            cy1.a aVar2 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_Group);
            aVar2.Rj(this, iy1.a.GroupChat);
            aVar2.dk(this, "ChattingUI_Group");
            return;
        }
        if (e76 == 9) {
            cy1.a aVar3 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_EnterpriseSingle);
            aVar3.Rj(this, iy1.a.EnterpriseSingle);
            aVar3.dk(this, "ChattingUI_EnterpriseSingle");
            return;
        }
        if (e76 == 10) {
            cy1.a aVar4 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_EnterpriseGroup);
            aVar4.Rj(this, iy1.a.EnterpriseGroup);
            aVar4.dk(this, "ChattingUI_EnterpriseGroup");
            return;
        }
        if (e76 == 4 || e76 == 5) {
            cy1.a aVar5 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_Service);
            aVar5.Rj(this, iy1.a.ServiceChat);
            aVar5.dk(this, "ChattingUI_Service");
            return;
        }
        if (e76 == 0) {
            cy1.a aVar6 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_NotifyMessages);
            aVar6.Rj(this, iy1.a.ServiceNotification);
            aVar6.dk(this, "ChattingUI_NotifyMessages");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity
    public void setRequestedOrientation(int i17) {
        m3.i iVar = this.f279795s;
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.q8) iVar).get() != null) {
            i17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.db) ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.q8) iVar).get()).e7(i17);
        }
        super.setRequestedOrientation(i17);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        if (intent != null && intent.getComponent() != null) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.sd.f292275a.a(intent.getComponent().getClassName());
        }
        super.startActivityForResult(intent, i17, bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: supportNavigationSwipeBack */
    public boolean mo52922x430f73e() {
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.q8) this.f279795s).get() != null) {
            return false;
        }
        return super.mo52922x430f73e();
    }
}
