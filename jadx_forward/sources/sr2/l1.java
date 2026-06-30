package sr2;

/* loaded from: classes10.dex */
public final class l1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.o1 f493153d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(sr2.o1 o1Var) {
        super(1);
        this.f493153d = o1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View layout = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        if (zv2.l0.f557941i.b()) {
            android.widget.TextView textView = (android.widget.TextView) layout.findViewById(com.p314xaae8f345.mm.R.id.olp);
            if (textView != null) {
                textView.setText(this.f493153d.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572810dd1));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) layout.findViewById(com.p314xaae8f345.mm.R.id.pnp);
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f81143xc05d6573);
            }
        }
        return jz5.f0.f384359a;
    }
}
