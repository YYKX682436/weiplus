package df2;

/* loaded from: classes3.dex */
public final class mu extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f312339m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f312340n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f312341o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312339m = "LiveShopWeAppController";
        this.f312340n = "";
        this.f312341o = jz5.h.b(new df2.lu(this));
    }

    public final void Z6(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f312340n, appId)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312339m, "appId:" + appId + " is same, return");
            return;
        }
        boolean z17 = this.f312340n.length() > 0;
        jz5.g gVar = this.f312341o;
        if (z17) {
            ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).Bi(this.f312340n, (df2.ku) ((jz5.n) gVar).mo141623x754a37bb());
        }
        this.f312340n = appId;
        if (appId.length() > 0) {
            ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).wi(appId, (df2.ku) ((jz5.n) gVar).mo141623x754a37bb());
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312339m, "onViewUnmount, resetListener");
        Z6("");
    }
}
