package pk2;

/* loaded from: classes3.dex */
public final class pa extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437703i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437703i = "audience.more.morefunction.gifteffect";
    }

    public static final void w(pk2.o9 o9Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8, boolean z17) {
        java.lang.String string = o9Var.f437611d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dhq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var.f437611d;
        if (z17) {
            viewOnClickListenerC22631x1cc07cc8.setContentDescription(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.efy, string));
        } else {
            viewOnClickListenerC22631x1cc07cc8.setContentDescription(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.efx, string));
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437703i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 bottomSheet, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) bottomSheet.f213492f.findViewById(com.p314xaae8f345.mm.R.id.nti);
        viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(!((mm2.c1) o9Var.c(mm2.c1.class)).f410427u5);
        pk2.f8.d(pk2.f8.f437280a, 4, 0, 2, 1, null, 16, null);
        w(o9Var, viewOnClickListenerC22631x1cc07cc8, viewOnClickListenerC22631x1cc07cc8.f292896x);
        viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new pk2.oa(o9Var, this, viewOnClickListenerC22631x1cc07cc8));
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.grg);
    }
}
