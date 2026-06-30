package bp4;

/* loaded from: classes8.dex */
public final class l0 extends bp4.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f23243d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f23244e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.hie);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f23243d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.hif);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f23244e = (android.widget.TextView) findViewById2;
    }

    @Override // bp4.p0
    public void i(ro4.e item) {
        kotlin.jvm.internal.o.g(item, "item");
        ro4.b bVar = item instanceof ro4.b ? (ro4.b) item : null;
        if (bVar != null) {
            vo0.e eVar = vo0.e.f438467a;
            ((wo0.b) vo0.e.f438468b.g(bVar.f398118b.f398117b)).c(this.f23243d);
            this.f23244e.setText(java.lang.String.valueOf(bVar.f398122f));
        }
    }
}
