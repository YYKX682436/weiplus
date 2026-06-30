package ml2;

/* loaded from: classes3.dex */
public final class y0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f409779a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f409780b;

    public y0(boolean z17, long j17) {
        this.f409779a = z17;
        this.f409780b = j17;
    }

    @Override // ym5.n0
    /* renamed from: getExposedId */
    public long mo55681x18a217a5(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return this.f409780b + view.hashCode();
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (!this.f409779a) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).yj(ml2.b4.f408813y1, 0, java.lang.System.currentTimeMillis() - ((ml2.r0) i95.n0.c(ml2.r0.class)).f409411q);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("object_id", pm0.v.u(this.f409780b));
        ml2.z0.f409863a.a(jSONObject);
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.o3[] o3VarArr = ml2.o3.f409306d;
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        ((ml2.j0) zbVar).Wj("watch_live_pay_expose", jSONObject2);
    }
}
