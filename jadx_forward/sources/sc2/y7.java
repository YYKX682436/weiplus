package sc2;

/* loaded from: classes2.dex */
public final class y7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f487929e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        super(1);
        this.f487928d = s0Var;
        this.f487929e = abstractC14490x69736cb5;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ad2.h observer = (ad2.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        xc2.z2 z2Var = observer.f84684o;
        java.lang.String simpleName = z2Var == null ? "null" : z2Var.getClass().getSimpleName();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("viewEventHandler", simpleName);
        xc2.p0 p0Var = observer.f84680h;
        java.lang.Object obj2 = p0Var != null ? p0Var.f534779h : null;
        xc2.n0 n0Var = obj2 instanceof xc2.n0 ? (xc2.n0) obj2 : null;
        long j17 = n0Var != null ? n0Var.f534763i : 0L;
        android.content.Context context = this.f487928d.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1 p1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.p1.class);
        if (p1Var != null) {
            p1Var.O6(this.f487929e.mo2128x1ed62e84(), "observer.onPause", jSONObject, j17);
        }
        return jz5.f0.f384359a;
    }
}
