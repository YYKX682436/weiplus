package tt2;

/* loaded from: classes3.dex */
public final class r0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f503520a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f503521b;

    public r0(tt2.e1 e1Var, ut2.s3 s3Var) {
        this.f503520a = e1Var;
        this.f503521b = s3Var;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            java.lang.Object tag = view.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
            tt2.e1.J(this.f503520a, ((java.lang.Integer) tag).intValue(), this.f503521b, ml2.f4.f408971n);
        }
    }
}
