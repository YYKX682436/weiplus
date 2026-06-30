package c22;

/* loaded from: classes12.dex */
public final class a extends lr.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c22.e f37992f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c22.e eVar, android.view.View itemView, lr.k0 k0Var) {
        super(itemView, k0Var);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f37992f = eVar;
    }

    @Override // lr.s0
    public void i(ir.u0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        super.i(item);
        android.view.View view = this.itemView;
        c22.e eVar = this.f37992f;
        view.setEnabled(eVar.f37998o != com.tencent.mm.plugin.emoji.ui.q0.EDIT);
        int a17 = eVar.f37998o == com.tencent.mm.plugin.emoji.ui.q0.DRAGGING ? ym5.x.a(this.itemView.getContext(), 7.0f) : 0;
        this.itemView.setPadding(a17, a17, a17, a17);
    }
}
