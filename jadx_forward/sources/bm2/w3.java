package bm2;

/* loaded from: classes3.dex */
public final class w3 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.n3 f103939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.a4 f103940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ce2.i f103941f;

    public w3(bm2.n3 n3Var, bm2.a4 a4Var, ce2.i iVar) {
        this.f103939d = n3Var;
        this.f103940e = a4Var;
        this.f103941f = iVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        bm2.n3 n3Var = this.f103939d;
        n3Var.f103753d.getViewTreeObserver().removeOnPreDrawListener(this);
        pm0.v.V(300L, new bm2.v3(this.f103940e, n3Var, this.f103941f));
        return true;
    }
}
