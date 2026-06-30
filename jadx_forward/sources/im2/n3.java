package im2;

/* loaded from: classes.dex */
public final class n3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f373988d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(im2.z3 z3Var) {
        super(1);
        this.f373988d = z3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        im2.z3 z3Var = this.f373988d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(z3Var.f374168d, "#showChargeSheet choose wecoin:" + intValue);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((jz5.n) z3Var.L).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "access$getPreSaleValueLayout(...)");
        relativeLayout.postDelayed(new im2.k0(z3Var, relativeLayout), 50L);
        z3Var.f374200x1 = intValue;
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) z3Var.K).mo141623x754a37bb()).setVisibility(z3Var.f374200x1 > 0 ? 0 : 8);
        ((android.widget.TextView) ((jz5.n) z3Var.M).mo141623x754a37bb()).setText(java.lang.String.valueOf(z3Var.f374200x1));
        return jz5.f0.f384359a;
    }
}
