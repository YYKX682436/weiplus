package bp4;

/* loaded from: classes8.dex */
public final class l0 extends bp4.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f104776d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f104777e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.hie);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f104776d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.hif);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f104777e = (android.widget.TextView) findViewById2;
    }

    @Override // bp4.p0
    public void i(ro4.e item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ro4.b bVar = item instanceof ro4.b ? (ro4.b) item : null;
        if (bVar != null) {
            vo0.e eVar = vo0.e.f520000a;
            ((wo0.b) vo0.e.f520001b.g(bVar.f479651b.f479650b)).c(this.f104776d);
            this.f104777e.setText(java.lang.String.valueOf(bVar.f479655f));
        }
    }
}
