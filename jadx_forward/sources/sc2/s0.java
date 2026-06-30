package sc2;

/* loaded from: classes2.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.xj f487759f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487760g;

    public s0(in5.s0 s0Var, android.view.View view, com.p314xaae8f345.mm.ui.xj xjVar, sc2.h1 h1Var) {
        this.f487757d = s0Var;
        this.f487758e = view;
        this.f487759f = xjVar;
        this.f487760g = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int dimension = (int) this.f487757d.f374654e.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f487758e;
        view.getHitRect(rect);
        rect.top -= dimension;
        rect.bottom += dimension;
        rect.left = 0;
        this.f487759f.a(new com.p314xaae8f345.mm.ui.yj(rect, view));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487760g.f487461w, "adTabView Rect: " + rect);
    }
}
