package bp4;

/* loaded from: classes8.dex */
public final class c1 extends bp4.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f23116d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.hig);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f23116d = (android.widget.TextView) findViewById;
    }

    @Override // bp4.p0
    public void i(ro4.e item) {
        kotlin.jvm.internal.o.g(item, "item");
        ro4.f fVar = item instanceof ro4.f ? (ro4.f) item : null;
        if (fVar != null) {
            this.f23116d.setText(fVar.f398127b);
        }
    }
}
