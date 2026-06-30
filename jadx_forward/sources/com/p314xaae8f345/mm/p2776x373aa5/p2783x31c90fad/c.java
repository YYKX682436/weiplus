package com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad;

/* loaded from: classes5.dex */
public final class c implements com.p314xaae8f345.mm.p2470x93e71c27.ui.g1 {

    /* renamed from: a, reason: collision with root package name */
    public int f295148a;

    /* renamed from: b, reason: collision with root package name */
    public int f295149b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f295150c;

    /* renamed from: d, reason: collision with root package name */
    public int f295151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.h1 f295152e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f295153f;

    public c(com.p314xaae8f345.mm.p2470x93e71c27.ui.h1 h1Var, android.view.View view) {
        this.f295152e = h1Var;
        this.f295153f = view;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g1
    public void a(int i17) {
        if (this.f295151d == i17) {
            return;
        }
        this.f295151d = i17;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.h1 h1Var = this.f295152e;
        int i18 = ((ym5.f0) h1Var).f544823p;
        ((ym5.f0) h1Var).c();
        this.f295153f.setTranslationY(i18 + (i17 * (-1.0f)));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g1
    public void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPanelSlideIndicatorHelper", "onFinished: expanded=%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        ((ym5.f0) this.f295152e).b(this.f295148a, this.f295149b, 0);
        int i17 = this.f295149b;
        android.view.View view = this.f295153f;
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.a aVar = new com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.a(this, view);
        if (view == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPanelSlideIndicatorHelper", "update height " + view.getHeight() + " to " + i17);
        if (layoutParams == null || view.getHeight() == i17) {
            return;
        }
        layoutParams.height = i17;
        view.setLayoutParams(layoutParams);
        aVar.mo152xb9724478();
        view.requestLayout();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g1
    public void c(int i17, int i18, int i19, int i27) {
        if (this.f295148a == 0 && this.f295149b == 0) {
            this.f295148a = (com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y * 4) / 5;
            this.f295149b = i27;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPanelSlideIndicatorHelper", "onPanelSizeChanged: [" + i19 + ',' + i27 + "], " + this.f295148a);
            ((ym5.f0) this.f295152e).b(this.f295148a, this.f295149b, 0);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g1
    public void d() {
        int i17 = this.f295149b;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.h1 h1Var = this.f295152e;
        if (((ym5.f0) h1Var).c()) {
            i17 += ((ym5.f0) h1Var).f544823p;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPanelSlideIndicatorHelper", "onUpdateHeight: %s %s %s", java.lang.Integer.valueOf(this.f295148a), java.lang.Integer.valueOf(i17), 0);
        ((ym5.f0) h1Var).b(this.f295148a, i17, 0);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g1
    public void e(boolean z17) {
        this.f295150c = z17;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.h1 h1Var = this.f295152e;
        if (!z17) {
            ((ym5.f0) h1Var).d();
        } else {
            ((ym5.f0) h1Var).b(this.f295148a, this.f295149b, 0);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.g1
    public void f(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPanelSlideIndicatorHelper", "onStart: expanded=%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        int i17 = this.f295148a;
        int i18 = this.f295149b;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.h1 h1Var = this.f295152e;
        ((ym5.f0) h1Var).b(i17, i18, 0);
        int i19 = this.f295149b + ((ym5.f0) h1Var).f544823p;
        android.view.View view = this.f295153f;
        com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.b bVar = new com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.b(view, h1Var);
        if (view == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPanelSlideIndicatorHelper", "update height " + view.getHeight() + " to " + i19);
        if (layoutParams == null || view.getHeight() == i19) {
            return;
        }
        layoutParams.height = i19;
        view.setLayoutParams(layoutParams);
        bVar.mo152xb9724478();
        view.requestLayout();
    }
}
