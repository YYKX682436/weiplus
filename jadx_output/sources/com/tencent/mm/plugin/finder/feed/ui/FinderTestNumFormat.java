package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderTestNumFormat;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderTestNumFormat extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int G = 0;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f109560t = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.nm(this));

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f109561u = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.cm(this));

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f109562v = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.jm(this));

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f109563w = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.lm(this));

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f109564x = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.mm(this));

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f109565y = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.im(this));

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f109566z = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.bm(this));
    public final jz5.g A = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.km(this));
    public final jz5.g B = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.am(this));
    public final jz5.g C = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.em(this));
    public final jz5.g D = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.dm(this));
    public final jz5.g E = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.zl(this));
    public final jz5.g F = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.yl(this));

    public final void c7() {
        android.view.View view = (android.view.View) ((jz5.n) this.f109564x).getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderTestNumFormat", "initCommentConfig", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderTestNumFormat", "initCommentConfig", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_INT_SYNC, 100);
        kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
        f0Var2.f310116d = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_COUNT_INT_SYNC, 2);
        kotlin.jvm.internal.f0 f0Var3 = new kotlin.jvm.internal.f0();
        f0Var3.f310116d = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_SPEED_INT_SYNC, 200);
        jz5.g gVar = this.f109565y;
        ((com.tencent.mm.ui.widget.MMEditText) ((jz5.n) gVar).getValue()).setHint("间隔多少毫秒取评论（当前:" + f0Var.f310116d + (char) 65289);
        jz5.g gVar2 = this.f109566z;
        ((com.tencent.mm.ui.widget.MMEditText) ((jz5.n) gVar2).getValue()).setHint("每次取多少条（当前:" + f0Var2.f310116d + (char) 65289);
        jz5.g gVar3 = this.A;
        ((com.tencent.mm.ui.widget.MMEditText) ((jz5.n) gVar3).getValue()).setHint("评论滑动速度,越大越慢（当前:" + f0Var3.f310116d + (char) 65289);
        ((com.tencent.mm.ui.widget.MMEditText) ((jz5.n) gVar).getValue()).setText("");
        ((com.tencent.mm.ui.widget.MMEditText) ((jz5.n) gVar2).getValue()).setText("");
        ((com.tencent.mm.ui.widget.MMEditText) ((jz5.n) gVar3).getValue()).setText("");
        ((android.view.View) ((jz5.n) this.B).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.fm(this, f0Var, f0Var2, f0Var3));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.awc;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("SCENE_TEST_PAGE", 1);
        if (intExtra != 1) {
            if (intExtra == 2) {
                c7();
                return;
            }
            return;
        }
        android.view.View view = (android.view.View) ((jz5.n) this.f109560t).getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderTestNumFormat", "initTestNum", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderTestNumFormat", "initTestNum", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((com.tencent.mm.ui.widget.MMEditText) ((jz5.n) this.f109561u).getValue()).addTextChangedListener(new com.tencent.mm.plugin.finder.feed.ui.hm(this));
        ((android.view.View) ((jz5.n) this.D).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.gm(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        gm0.j1.n().f273288b.q(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, this);
        if (i17 == 0 && i18 == 0) {
            kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.feature.geta8key.api.INetSceneGetA8Key");
            ((com.tencent.mm.ui.widget.MMEditText) ((jz5.n) this.E).getValue()).setText(((com.tencent.mm.modelsimple.k0) ((w60.k) m1Var)).Q());
        }
    }
}
