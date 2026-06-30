package c22;

/* loaded from: classes12.dex */
public final class a extends lr.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c22.e f119525f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c22.e eVar, android.view.View itemView, lr.k0 k0Var) {
        super(itemView, k0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f119525f = eVar;
    }

    @Override // lr.s0
    public void i(ir.u0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.i(item);
        android.view.View view = this.f3639x46306858;
        c22.e eVar = this.f119525f;
        view.setEnabled(eVar.f119531o != com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0.EDIT);
        int a17 = eVar.f119531o == com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q0.DRAGGING ? ym5.x.a(this.f3639x46306858.getContext(), 7.0f) : 0;
        this.f3639x46306858.setPadding(a17, a17, a17, a17);
    }
}
