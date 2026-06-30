package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderCommentUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderCommentUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {
    public static final /* synthetic */ int G = 0;
    public jz5.l A;
    public yw2.a0 B;
    public boolean C;
    public long D;
    public int E;
    public boolean F;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f109220t = "Finder.FinderCommentUI";

    /* renamed from: u, reason: collision with root package name */
    public final long f109221u = 300;

    /* renamed from: v, reason: collision with root package name */
    public final int f109222v = 50;

    /* renamed from: w, reason: collision with root package name */
    public final int f109223w = 300;

    /* renamed from: x, reason: collision with root package name */
    public final float f109224x = 0.3f;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderTouchLayout f109225y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderCommentDrawer f109226z;

    public final com.tencent.mm.plugin.finder.view.FinderTouchLayout c7() {
        com.tencent.mm.plugin.finder.view.FinderTouchLayout finderTouchLayout = this.f109225y;
        if (finderTouchLayout != null) {
            return finderTouchLayout;
        }
        kotlin.jvm.internal.o.o("containerView");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.view.FinderCommentDrawer d7() {
        com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer = this.f109226z;
        if (finderCommentDrawer != null) {
            return finderCommentDrawer;
        }
        kotlin.jvm.internal.o.o("drawer");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        hideVKB();
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.afe;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        setTheme(com.tencent.mm.R.style.f494395lx);
        super.onCreate(bundle);
        if (getSupportActionBar() != null) {
            androidx.appcompat.app.b supportActionBar = getSupportActionBar();
            kotlin.jvm.internal.o.d(supportActionBar);
            supportActionBar.w(new android.graphics.drawable.ColorDrawable(0));
            androidx.appcompat.app.b supportActionBar2 = getSupportActionBar();
            kotlin.jvm.internal.o.d(supportActionBar2);
            supportActionBar2.o();
        }
        com.tencent.mm.plugin.finder.view.d5 d5Var = com.tencent.mm.plugin.finder.view.f5.f132064i;
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.o.g(intent, "intent");
        jz5.l lVar = (jz5.l) com.tencent.mm.plugin.finder.view.f5.f132065j.remove(java.lang.Long.valueOf(intent.getLongExtra("COMMENT_REQUEST_KEY", 0L)));
        if (lVar == null) {
            finish();
            return;
        }
        this.A = lVar;
        android.content.Intent intent2 = getIntent();
        kotlin.jvm.internal.o.g(intent2, "intent");
        this.C = intent2.getBooleanExtra("FROM_MSG", false);
        android.content.Intent intent3 = getIntent();
        kotlin.jvm.internal.o.g(intent3, "intent");
        this.D = intent3.getLongExtra("MENTION_ID", 0L);
        android.content.Intent intent4 = getIntent();
        kotlin.jvm.internal.o.g(intent4, "intent");
        this.E = intent4.getIntExtra("MENTION_CREATE_TIME", 0);
        jz5.l lVar2 = this.A;
        if (lVar2 == null) {
            kotlin.jvm.internal.o.o("requestData");
            throw null;
        }
        com.tencent.mm.plugin.finder.view.a5 a5Var = (com.tencent.mm.plugin.finder.view.a5) lVar2.f302833d;
        if (lVar2 == null) {
            kotlin.jvm.internal.o.o("requestData");
            throw null;
        }
        com.tencent.mm.plugin.finder.view.b5 b5Var = (com.tencent.mm.plugin.finder.view.b5) lVar2.f302834e;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.c87);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f109225y = (com.tencent.mm.plugin.finder.view.FinderTouchLayout) findViewById;
        this.B = new com.tencent.mm.plugin.finder.feed.ui.g1(this.C, b5Var.f131690a, this.D, this.E, this, new com.tencent.mm.plugin.finder.feed.a7(this));
        pf5.z zVar = pf5.z.f353948a;
        ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135379m;
        com.tencent.mm.plugin.finder.view.i5 i5Var = com.tencent.mm.plugin.finder.view.FinderCommentDrawer.V;
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        yw2.a0 a0Var = this.B;
        if (a0Var == null) {
            kotlin.jvm.internal.o.o("builder");
            throw null;
        }
        this.f109226z = com.tencent.mm.plugin.finder.view.i5.a(i5Var, this, decorView, a0Var, a5Var.f131619b, true, 0, 32, null);
        d7().setInterceptClose(com.tencent.mm.plugin.finder.feed.ui.h1.f110101d);
        d7().setOnCloseDrawerCallback(new com.tencent.mm.plugin.finder.feed.ui.j1(this));
        c7().post(new com.tencent.mm.plugin.finder.feed.ui.k1(this, b5Var));
        c7().setTouchListener(new com.tencent.mm.plugin.finder.feed.ui.l1(this));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        d7().b();
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
