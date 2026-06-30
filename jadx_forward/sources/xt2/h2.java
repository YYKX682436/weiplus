package xt2;

/* loaded from: classes3.dex */
public final class h2 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f538307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f538308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f538309f;

    public h2(xt2.e3 e3Var, cm2.m0 m0Var, yz5.a aVar) {
        this.f538307d = e3Var;
        this.f538308e = m0Var;
        this.f538309f = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        xt2.e3 e3Var = this.f538307d;
        if (e3Var.f538248s.getWidth() > 0) {
            e3Var.f538248s.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (e3Var.U == this.f538308e) {
                this.f538309f.mo152xb9724478();
            }
        }
    }
}
