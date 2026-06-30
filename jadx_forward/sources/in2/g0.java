package in2;

/* loaded from: classes2.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.n0 f374373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f374374e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(in2.n0 n0Var, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25) {
        super(1);
        this.f374373d = n0Var;
        this.f374374e = c22849x81a93d25;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f374374e;
        in2.n0 n0Var = this.f374373d;
        if (intValue <= 0) {
            android.widget.TextView textView = n0Var.M;
            if (textView != null) {
                textView.setText(c22849x81a93d25.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oji));
            }
        } else {
            android.widget.TextView textView2 = n0Var.M;
            if (textView2 != null) {
                textView2.setText(c22849x81a93d25.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ojv, java.lang.Integer.valueOf(intValue)));
            }
        }
        return jz5.f0.f384359a;
    }
}
