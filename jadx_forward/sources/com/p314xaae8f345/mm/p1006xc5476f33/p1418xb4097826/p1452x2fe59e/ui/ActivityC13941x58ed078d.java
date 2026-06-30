package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderCommentUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI */
/* loaded from: classes10.dex */
public final class ActivityC13941x58ed078d extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {
    public static final /* synthetic */ int G = 0;
    public jz5.l A;
    public yw2.a0 B;
    public boolean C;
    public long D;
    public int E;
    public boolean F;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f190753t = "Finder.FinderCommentUI";

    /* renamed from: u, reason: collision with root package name */
    public final long f190754u = 300;

    /* renamed from: v, reason: collision with root package name */
    public final int f190755v = 50;

    /* renamed from: w, reason: collision with root package name */
    public final int f190756w = 300;

    /* renamed from: x, reason: collision with root package name */
    public final float f190757x = 0.3f;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15355xac041723 f190758y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a f190759z;

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15355xac041723 c7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15355xac041723 c15355xac041723 = this.f190758y;
        if (c15355xac041723 != null) {
            return c15355xac041723;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("containerView");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a c15268x6a41bd8a = this.f190759z;
        if (c15268x6a41bd8a != null) {
            return c15268x6a41bd8a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("drawer");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        mo48674x36654fab();
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.afe;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575928lx);
        super.onCreate(bundle);
        if (mo2533x106ab264() != null) {
            p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo2533x106ab264);
            mo2533x106ab264.w(new android.graphics.drawable.ColorDrawable(0));
            p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab2642 = mo2533x106ab264();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo2533x106ab2642);
            mo2533x106ab2642.o();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.d5 d5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5.f213597i;
        android.content.Intent intent = getIntent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        jz5.l lVar = (jz5.l) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f5.f213598j.remove(java.lang.Long.valueOf(intent.getLongExtra("COMMENT_REQUEST_KEY", 0L)));
        if (lVar == null) {
            finish();
            return;
        }
        this.A = lVar;
        android.content.Intent intent2 = getIntent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent2, "intent");
        this.C = intent2.getBooleanExtra("FROM_MSG", false);
        android.content.Intent intent3 = getIntent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent3, "intent");
        this.D = intent3.getLongExtra("MENTION_ID", 0L);
        android.content.Intent intent4 = getIntent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent4, "intent");
        this.E = intent4.getIntExtra("MENTION_CREATE_TIME", 0);
        jz5.l lVar2 = this.A;
        if (lVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("requestData");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.a5 a5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.a5) lVar2.f384366d;
        if (lVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("requestData");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.b5 b5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.b5) lVar2.f384367e;
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.c87);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f190758y = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15355xac041723) findViewById;
        this.B = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.g1(this.C, b5Var.f213223a, this.D, this.E, this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7(this));
        pf5.z zVar = pf5.z.f435481a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216912m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.i5 i5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15268x6a41bd8a.V;
        android.view.View decorView = getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        yw2.a0 a0Var = this.B;
        if (a0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("builder");
            throw null;
        }
        this.f190759z = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.i5.a(i5Var, this, decorView, a0Var, a5Var.f213152b, true, 0, 32, null);
        d7().m61824x1b1d2b58(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.h1.f191634d);
        d7().m61827x1367b0cd(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.j1(this));
        c7().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.k1(this, b5Var));
        c7().m62433xce6c7bd1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.l1(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        d7().b();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
