package lj2;

/* loaded from: classes3.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj2.o0 f400411d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(lj2.o0 o0Var) {
        super(1);
        this.f400411d = o0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        lj2.o0 o0Var = this.f400411d;
        if (o0Var.f400440g == 1) {
            db5.t7.m123882x26a183b(o0Var.f400434a.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.mkg, 0).show();
        } else {
            pi2.w0 w0Var = o0Var.f400435b.f444082n;
            if (w0Var != null) {
                w0Var.e0(true, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
