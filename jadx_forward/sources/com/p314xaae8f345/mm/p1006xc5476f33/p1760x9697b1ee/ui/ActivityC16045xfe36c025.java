package com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/gamelife/ui/GameLifeConversationUI;", "Lcom/tencent/mm/plugin/gamelife/ui/GameLifeChattingCompatUI;", "Lg63/t0;", "<init>", "()V", "plugin-gamelife_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI */
/* loaded from: classes8.dex */
public class ActivityC16045xfe36c025 extends com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.AbstractActivityC16044xc4cc504a implements g63.t0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f223521o = 0;

    /* renamed from: e, reason: collision with root package name */
    public final g63.j f223522e;

    /* renamed from: f, reason: collision with root package name */
    public final g63.f0 f223523f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f223524g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f223525h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.C16047x8b5fe36e f223526i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.C16046x45eb7dfd f223527m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f223528n;

    public ActivityC16045xfe36c025() {
        g63.j jVar = new g63.j();
        this.f223522e = jVar;
        this.f223523f = new g63.f0(this, jVar);
        this.f223524g = jz5.h.b(new g63.j0(this));
        this.f223525h = true;
        this.f223528n = jz5.h.b(new g63.h0(this));
    }

    public final a63.c T6() {
        return (a63.c) ((jz5.n) this.f223528n).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bi8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.AbstractActivityC16044xc4cc504a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.fqb);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = T6().f83285d;
        c1163xf1deaba4.mo7967x900dcbe1((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) ((jz5.n) this.f223524g).mo141623x754a37bb());
        c1163xf1deaba4.mo7960x6cab2c8d(this.f223522e);
        c1163xf1deaba4.m7964x8d4ad49c(null);
        T6().f83286e.m82683xb165a19d(new g63.m0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.C16047x8b5fe36e c16047x8b5fe36e = new com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.C16047x8b5fe36e(this, null, 0, 6, null);
        c16047x8b5fe36e.m64863xa0ca35fb(new g63.n0(this));
        this.f223526i = c16047x8b5fe36e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.C16046x45eb7dfd c16046x45eb7dfd = new com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.C16046x45eb7dfd(this, null, 0, 6, null);
        c16046x45eb7dfd.setVisibility(8);
        this.f223527m = c16046x45eb7dfd;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        android.widget.FrameLayout frameLayout = T6().f83284c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.C16046x45eb7dfd c16046x45eb7dfd2 = this.f223527m;
        if (c16046x45eb7dfd2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyCoverView");
            throw null;
        }
        frameLayout.addView(c16046x45eb7dfd2, layoutParams);
        e63.a.f331350a = getIntent().getIntExtra("game_report_from_scene", 0);
        g63.f0 f0Var = this.f223523f;
        g63.j jVar = f0Var.f350640b;
        jVar.f350660d.f350705b = f0Var.f350644f;
        jVar.f350660d.f350706c = new g63.n(g63.b0.f350627d);
        ((z53.q) f0Var.f350642d).wi(f0Var.f350645g);
        u53.y yVar = (u53.y) i95.n0.c(u53.y.class);
        l75.q0 q0Var = f0Var.f350646h;
        ((y53.x) yVar).getClass();
        if (q0Var != null) {
            ((t53.m0) i95.n0.c(t53.m0.class)).Ri().add(q0Var);
        }
        z53.o.f551794a.c(0, 15, new g63.v(f0Var));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.AbstractActivityC16044xc4cc504a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        g63.f0 f0Var = this.f223523f;
        f0Var.f350639a = null;
        ((z53.q) f0Var.f350642d).Vi(f0Var.f350645g);
        u53.y yVar = (u53.y) i95.n0.c(u53.y.class);
        l75.q0 q0Var = f0Var.f350646h;
        ((y53.x) yVar).getClass();
        if (q0Var != null) {
            ((t53.m0) i95.n0.c(t53.m0.class)).Ri().mo49775xc84af884(q0Var);
        }
    }

    /* renamed from: onFinish */
    public void mo64779x42fe6352() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            e63.a.f331350a = intent.getIntExtra("game_report_from_scene", 0);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.AbstractActivityC16044xc4cc504a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        jz5.l lVar;
        int intValue;
        int intValue2;
        super.onResume();
        g63.f0 f0Var = this.f223523f;
        f0Var.getClass();
        long j17 = e63.a.f331350a;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d c6633xea2e527d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d();
        c6633xea2e527d.f139873d = 2L;
        c6633xea2e527d.f139874e = 0L;
        c6633xea2e527d.f139875f = 0L;
        c6633xea2e527d.f139876g = 1L;
        c6633xea2e527d.f139877h = j17;
        c6633xea2e527d.k();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d c6633xea2e527d2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d();
        c6633xea2e527d2.f139873d = 2L;
        c6633xea2e527d2.f139874e = 201L;
        c6633xea2e527d2.f139875f = 0L;
        c6633xea2e527d2.f139876g = 1L;
        c6633xea2e527d2.f139877h = j17;
        c6633xea2e527d2.k();
        boolean z17 = false;
        if (f0Var.f350641c) {
            f0Var.f350641c = false;
            return;
        }
        e63.a.f331350a = 301L;
        f0Var.a();
        g63.j jVar = f0Var.f350640b;
        jVar.f350661e.getClass();
        jVar.f350662f.getClass();
        g63.t0 t0Var = f0Var.f350639a;
        if (t0Var != null) {
            wn.t tVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16045xfe36c025) t0Var).f223520d;
            if (tVar != null ? ((rb5.l) tVar).f475420n : true) {
                z17 = true;
            }
        }
        if (!z17) {
            return;
        }
        if (t0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16045xfe36c025 activityC16045xfe36c025 = (com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16045xfe36c025) t0Var;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) ((jz5.n) activityC16045xfe36c025.f223524g).mo141623x754a37bb()).w());
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) ((jz5.n) activityC16045xfe36c025.f223524g).mo141623x754a37bb()).y());
            lVar = new jz5.l(valueOf, valueOf2);
            valueOf.intValue();
            valueOf2.intValue();
        } else {
            lVar = null;
        }
        if (lVar == null || (intValue = ((java.lang.Number) lVar.f384366d).intValue()) > (intValue2 = ((java.lang.Number) lVar.f384367e).intValue())) {
            return;
        }
        while (true) {
            java.lang.Object obj = jVar.f350663g.get(intValue);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            z53.i iVar = (z53.i) obj;
            boolean u07 = iVar.u0();
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.d dVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.e.f149727a;
            if (u07) {
                int x17 = jVar.x();
                java.lang.String field_sessionId = iVar.f67669xbed8694c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
                dVar.e(intValue + 1, 1L, x17, field_sessionId, 0L, "", 0L, "", iVar.t0(), e63.a.f331350a, (r35 & 1024) != 0 ? null : null);
            } else {
                y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(iVar.f67668x5568d387);
                if (Di != null) {
                    int x18 = jVar.x();
                    java.lang.String field_sessionId2 = iVar.f67669xbed8694c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId2, "field_sessionId");
                    long j18 = Di.f67426x9f600742;
                    java.lang.String field_selfUserName = iVar.f67668x5568d387;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_selfUserName, "field_selfUserName");
                    y53.m mVar = iVar.F;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mVar);
                    long j19 = mVar.f67426x9f600742;
                    java.lang.String field_talker = iVar.f67670x114ef53e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talker, "field_talker");
                    dVar.e(intValue + 1, 1L, x18, field_sessionId2, j18, field_selfUserName, j19, field_talker, iVar.t0(), e63.a.f331350a, (r35 & 1024) != 0 ? null : null);
                }
            }
            if (intValue == intValue2) {
                return;
            } else {
                intValue++;
            }
        }
    }
}
