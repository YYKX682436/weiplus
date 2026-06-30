package ad4;

/* loaded from: classes4.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f84745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f84746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f84747f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f84748g;

    public z(android.view.View view, android.widget.TextView textView, android.widget.TextView textView2, int i17) {
        this.f84745d = view;
        this.f84746e = textView;
        this.f84747f = textView2;
        this.f84748g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion$applyFoldingLogic$1");
        android.view.View view = this.f84745d;
        if (view.isAttachedToWindow()) {
            ad4.c0.f84708a.a(view, this.f84746e, this.f84747f, this.f84748g);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion$applyFoldingLogic$1");
    }
}
