package ad4;

/* loaded from: classes4.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f84702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f84703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f84704f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f84705g;

    public a0(android.view.View view, android.widget.TextView textView, android.widget.TextView textView2, android.view.View view2) {
        this.f84702d = view;
        this.f84703e = textView;
        this.f84704f = textView2;
        this.f84705g = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion$applyFoldingLogic$2");
        android.view.View view = this.f84702d;
        if (view.isAttachedToWindow()) {
            ad4.c0.f84708a.a(view, this.f84703e, this.f84704f, this.f84705g.getWidth());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion$applyFoldingLogic$2");
    }
}
