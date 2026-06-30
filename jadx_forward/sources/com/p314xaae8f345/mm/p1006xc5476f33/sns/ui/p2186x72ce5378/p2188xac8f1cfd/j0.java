package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes4.dex */
public final class j0 extends android.view.WindowInsetsAnimation.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18226x595adb9d f250451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f250452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 f250453c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f250454d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18226x595adb9d c18226x595adb9d, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662, int i17) {
        super(1);
        this.f250451a = c18226x595adb9d;
        this.f250452b = view;
        this.f250453c = c18037xf8026662;
        this.f250454d = i17;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public void onEnd(android.view.WindowInsetsAnimation animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onEnd", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView_R$callback$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onEnd(animation);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18226x595adb9d.Y6(this.f250451a, this.f250452b, this.f250453c, this.f250454d, 0, 8, null);
        this.f250453c.setWindowInsetsAnimationCallback(null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onEnd", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView_R$callback$1");
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public android.view.WindowInsets onProgress(android.view.WindowInsets insets, java.util.List animations) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onProgress", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView_R$callback$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insets, "insets");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animations, "animations");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onProgress", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView_R$callback$1");
        return insets;
    }
}
