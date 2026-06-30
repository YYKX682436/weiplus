package ze5;

/* loaded from: classes9.dex */
public final class r8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.w8 f553716d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(ze5.w8 w8Var) {
        super(1);
        this.f553716d = w8Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ze5.n8 it = (ze5.n8) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        ze5.w8 w8Var = this.f553716d;
        w8Var.getClass();
        boolean z17 = !(w8Var instanceof ze5.j8);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956 c21522xf5a6e956 = it.f39489xe7f4e7e5;
        if (c21522xf5a6e956 != null) {
            c21522xf5a6e956.setVisibility(z17 ? 0 : 8);
        }
        android.view.View view = it.f553649h;
        if (view != null) {
            int a17 = z17 ? 0 : i65.a.a(view.getContext(), 4.0f);
            if (w8Var.M()) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), a17, view.getPaddingBottom());
            } else {
                view.setPadding(a17, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
            }
        }
        return jz5.f0.f384359a;
    }
}
