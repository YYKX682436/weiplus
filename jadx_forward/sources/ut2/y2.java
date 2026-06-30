package ut2;

/* loaded from: classes3.dex */
public final class y2 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f512693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f512694b;

    public y2(cm2.m0 m0Var, ut2.s3 s3Var) {
        this.f512693a = m0Var;
        this.f512694b = s3Var;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report cart exposed, productId = ");
            cm2.m0 m0Var = this.f512693a;
            sb6.append(m0Var.f124902w);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveShoppingViewHolder", sb6.toString());
            ut2.s3.o(this.f512694b, m0Var);
        }
    }
}
