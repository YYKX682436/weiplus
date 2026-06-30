package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f;

/* loaded from: classes3.dex */
public final class r implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f169174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f169175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f169176f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f169177g;

    public r(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, int i17, android.view.View view, yz5.a aVar) {
        this.f169174d = f0Var;
        this.f169175e = i17;
        this.f169176f = view;
        this.f169177g = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f169174d;
        int i17 = f0Var.f391649d + 1;
        f0Var.f391649d = i17;
        if (i17 < this.f169175e) {
            return;
        }
        this.f169176f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f169177g.mo152xb9724478();
    }
}
