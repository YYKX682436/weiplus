package xt2;

/* loaded from: classes3.dex */
public final class b4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.b5 f538168d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(xt2.b5 b5Var) {
        super(2);
        this.f538168d = b5Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        xt2.b5 b5Var = this.f538168d;
        if (booleanValue) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = b5Var.f538172n;
            if (viewOnClickListenerC22631x1cc07cc8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("askForPromoteSwitchBtn");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(booleanValue2);
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = b5Var.f538172n;
            if (viewOnClickListenerC22631x1cc07cc82 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("askForPromoteSwitchBtn");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc82.m81392x52cfa5c6(!booleanValue2);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = b5Var.f538169h;
            db5.t7.g(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573313e75));
        }
        return jz5.f0.f384359a;
    }
}
