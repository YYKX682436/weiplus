package ze5;

/* loaded from: classes9.dex */
public final class r1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f553707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553709f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        super(1);
        this.f553707d = h0Var;
        this.f553708e = dVar;
        this.f553709f = f9Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ze5.g1 holder = (ze5.g1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e g17 = te5.e2.g((ot0.q) this.f553707d.f391656d);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ca caVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ca();
        caVar.f271779a = g17;
        yb5.d dVar = this.f553708e;
        caVar.f271780b = dVar.x();
        caVar.f271781c = te5.e2.d(this.f553709f);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.q(dVar, holder.f553467c, caVar);
        android.widget.LinearLayout linearLayout = holder.f553467c;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        android.widget.TextView textView = holder.f553468d;
        if (textView != null) {
            android.app.Activity g18 = dVar.g();
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = g17 != null ? g17.f152795e : null;
            textView.setText(g18.getString(com.p314xaae8f345.mm.R.C30867xcad56011.epp, objArr));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = holder.f553469e;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f78484x5341c45);
        }
        return jz5.f0.f384359a;
    }
}
