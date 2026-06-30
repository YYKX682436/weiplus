package sc2;

/* loaded from: classes2.dex */
public final class h7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487484d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(in5.s0 s0Var) {
        super(1);
        this.f487484d = s0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52;
        ad2.h observer = (ad2.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        xc2.p0 p0Var = observer.f84680h;
        long j17 = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseAdFeedJumperUIC", "onJumpViewUnFocus feedId=".concat(pm0.v.u((p0Var == null || (abstractC14490x69736cb52 = p0Var.f534777f) == null) ? 0L : abstractC14490x69736cb52.mo2128x1ed62e84())));
        in5.s0 s0Var = this.f487484d;
        java.lang.Object obj2 = s0Var.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = obj2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj2 : null;
        if (abstractC14490x69736cb53 != null && hc2.o0.D(abstractC14490x69736cb53.getFeedObject().getFeedObject(), false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseAdFeedJumperUIC", "onJumpViewUnFocus feedId=".concat(pm0.v.u(abstractC14490x69736cb53.mo2128x1ed62e84())));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("hasObserver", java.lang.String.valueOf(true));
            xc2.p0 p0Var2 = observer.f84680h;
            java.lang.Object obj3 = p0Var2 != null ? p0Var2.f534779h : null;
            xc2.n0 n0Var = obj3 instanceof xc2.n0 ? (xc2.n0) obj3 : null;
            long j18 = n0Var != null ? n0Var.f534763i : 0L;
            if (p0Var2 != null && (abstractC14490x69736cb5 = p0Var2.f534777f) != null) {
                j17 = abstractC14490x69736cb5.mo2128x1ed62e84();
            }
            long j19 = j17;
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1 p1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1.class);
            if (p1Var != null) {
                p1Var.O6(j19, "onJumpViewUnFocus", jSONObject, j18);
            }
        }
        xc2.p0 p0Var3 = observer.f84680h;
        android.view.View view = observer.f84676d;
        if (p0Var3 != null && view != null) {
            p0Var3.A = false;
            s0Var.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.eid, java.lang.Boolean.FALSE);
            observer.w(s0Var, view, p0Var3);
        }
        return jz5.f0.f384359a;
    }
}
