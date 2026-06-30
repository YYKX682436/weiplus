package ze5;

/* loaded from: classes9.dex */
public final class t0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ze5.b1 f553729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553730b;

    public t0(ze5.b1 b1Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f553729a = b1Var;
        this.f553730b = f9Var;
    }

    @Override // ym5.n0
    /* renamed from: getExposedId */
    public long mo55681x18a217a5(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return this.f553730b.m124847x74d37ac6() + view.hashCode();
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            vd2.d3 d3Var = vd2.d3.f517236a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            w05.a aVar = this.f553729a.f553366t;
            if (aVar == null || (str = aVar.m173053x93d5ac12()) == null) {
                str = "";
            }
            jSONObject.put("finderusername", str);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            d3Var.a("expose_shopwindow_shard_card", jSONObject2);
        }
    }
}
