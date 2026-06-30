package pn2;

/* loaded from: classes3.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f438501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f438502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pn2.c0 f438503f;

    public b0(android.view.View view, float f17, pn2.c0 c0Var) {
        this.f438501d = view;
        this.f438502e = f17;
        this.f438503f = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f438501d;
        float f17 = this.f438502e;
        view.setScaleX(f17);
        view.setScaleY(f17);
        view.setPivotX(0.0f);
        pn2.c0 c0Var = this.f438503f;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = c0Var.f438512o;
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.setScaleX(f17);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = c0Var.f438512o;
        if (c22789xd23e9a9b2 == null) {
            return;
        }
        c22789xd23e9a9b2.setScaleY(f17);
    }
}
