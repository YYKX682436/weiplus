package bp4;

/* loaded from: classes8.dex */
public final class c1 extends bp4.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f104649d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.hig);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f104649d = (android.widget.TextView) findViewById;
    }

    @Override // bp4.p0
    public void i(ro4.e item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ro4.f fVar = item instanceof ro4.f ? (ro4.f) item : null;
        if (fVar != null) {
            this.f104649d.setText(fVar.f479660b);
        }
    }
}
