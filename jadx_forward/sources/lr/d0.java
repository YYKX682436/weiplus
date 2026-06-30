package lr;

/* loaded from: classes13.dex */
public final class d0 extends lr.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f402039f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(android.view.View itemView, lr.k0 k0Var) {
        super(itemView, k0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.f564805a50);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f402039f = (android.widget.ImageView) findViewById;
    }

    @Override // lr.s0
    public void i(ir.u0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.i(item);
        ir.z zVar = (ir.z) this.f402114e;
        if (zVar != null) {
            android.widget.ImageView imageView = this.f402039f;
            int i17 = zVar.f375454b;
            if (i17 == 0) {
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f79035xbaaa5668, imageView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560798ui)));
                imageView.setContentDescription(imageView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iyb));
            } else if (i17 == 1) {
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f79034x78555b2f, imageView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560798ui)));
                imageView.setContentDescription(imageView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aql));
            }
        }
    }
}
