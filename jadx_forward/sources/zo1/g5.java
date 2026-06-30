package zo1;

/* loaded from: classes5.dex */
public final class g5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f556160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e f556161e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e activityC12873xf94c39e) {
        super(1);
        this.f556160d = gVar;
        this.f556161e = activityC12873xf94c39e;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = this.f556160d;
        if (intValue != gVar.f297368m) {
            long j17 = gVar.f297362d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", "Try to change option from " + gVar.f297368m + " to " + intValue);
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e activityC12873xf94c39e = this.f556161e;
            java.lang.String string = activityC12873xf94c39e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvy);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            zo1.f5 f5Var = new zo1.f5(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC12873xf94c39e, string, false, 3, null), this.f556161e, intValue, j17);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar2 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g();
            gVar2.mo11468x92b714fd(gVar.m75960xfb7e5820());
            gVar2.f297368m = intValue;
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.s(gVar2, f5Var);
        }
        return jz5.f0.f384359a;
    }
}
