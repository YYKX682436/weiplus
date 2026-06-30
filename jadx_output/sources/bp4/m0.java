package bp4;

/* loaded from: classes8.dex */
public final class m0 extends bp4.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f23255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.hie);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f23255d = (android.widget.ImageView) findViewById;
    }

    @Override // bp4.p0
    public void i(ro4.e item) {
        kotlin.jvm.internal.o.g(item, "item");
        ro4.d dVar = item instanceof ro4.d ? (ro4.d) item : null;
        if (dVar != null) {
            vo0.e eVar = vo0.e.f438467a;
            ((wo0.b) vo0.e.f438468b.g(dVar.f398125b.f398117b)).c(this.f23255d);
        }
    }
}
