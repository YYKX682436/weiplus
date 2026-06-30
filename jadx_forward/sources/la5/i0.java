package la5;

/* loaded from: classes.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ la5.l0 f399157d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(la5.l0 l0Var) {
        super(1);
        this.f399157d = l0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.String obj2 = it.findViewById(com.p314xaae8f345.mm.R.id.spo).getVisibility() == 0 ? ((android.widget.TextView) it.findViewById(com.p314xaae8f345.mm.R.id.spn)).getText().toString() : ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659) it.findViewById(com.p314xaae8f345.mm.R.id.kbq)).m79231xfb85ada3().toString();
        java.lang.String obj3 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659) it.findViewById(com.p314xaae8f345.mm.R.id.f567011ht5)).m79231xfb85ada3().toString();
        java.lang.String obj4 = ((android.widget.TextView) it.findViewById(com.p314xaae8f345.mm.R.id.otg)).getText().toString();
        android.widget.TextView textView = (android.widget.TextView) it.findViewById(com.p314xaae8f345.mm.R.id.o_u);
        android.view.View findViewById = it.findViewById(com.p314xaae8f345.mm.R.id.h_5);
        java.lang.Object parent = it.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((android.view.View) parent).getTag(com.p314xaae8f345.mm.R.id.ciq), java.lang.Boolean.TRUE);
        la5.l0 l0Var = this.f399157d;
        java.lang.String m158362x2fec8307 = l0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.bl8);
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = obj2;
        if (textView.getVisibility() != 0 || textView.getText().toString().compareTo("0") <= 0) {
            str = "";
        } else {
            str = java.lang.String.format(l0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.bld), java.util.Arrays.copyOf(new java.lang.Object[]{textView.getText()}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "format(...)");
        }
        objArr[1] = str;
        objArr[2] = obj3;
        objArr[3] = obj4;
        objArr[4] = findViewById.getVisibility() == 0 ? l0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.blb) : "";
        objArr[5] = b17 ? l0Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.blc) : "";
        java.lang.String format = java.lang.String.format(m158362x2fec8307, java.util.Arrays.copyOf(objArr, 6));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }
}
