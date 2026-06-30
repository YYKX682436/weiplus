package sc2;

/* loaded from: classes2.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f487715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.xj f487716f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487717g;

    public r0(in5.s0 s0Var, android.widget.TextView textView, com.p314xaae8f345.mm.ui.xj xjVar, sc2.h1 h1Var) {
        this.f487714d = s0Var;
        this.f487715e = textView;
        this.f487716f = xjVar;
        this.f487717g = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f487714d;
        int dimension = (int) s0Var.f374654e.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        android.graphics.Rect rect = new android.graphics.Rect();
        android.widget.TextView textView = this.f487715e;
        textView.getHitRect(rect);
        rect.top -= dimension;
        rect.bottom += dimension;
        rect.right += (int) s0Var.f374654e.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        this.f487716f.a(new com.p314xaae8f345.mm.ui.yj(rect, textView));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487717g.f487461w, "countDownTv Rect: " + rect);
    }
}
