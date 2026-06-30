package bp4;

/* loaded from: classes8.dex */
public final class m0 extends bp4.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f104788d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.hie);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f104788d = (android.widget.ImageView) findViewById;
    }

    @Override // bp4.p0
    public void i(ro4.e item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ro4.d dVar = item instanceof ro4.d ? (ro4.d) item : null;
        if (dVar != null) {
            vo0.e eVar = vo0.e.f520000a;
            ((wo0.b) vo0.e.f520001b.g(dVar.f479658b.f479650b)).c(this.f104788d);
        }
    }
}
