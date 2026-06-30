package kw2;

/* loaded from: classes12.dex */
public final class k0 implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f394576a;

    public k0(org.json.JSONObject jSONObject) {
        this.f394576a = jSONObject;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        rh.o2 o2Var = (rh.o2) obj;
        java.lang.Integer num = (java.lang.Integer) ((oh.b) o2Var.f477019c).f426708d.f477085a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
        int intValue = num.intValue();
        org.json.JSONObject jSONObject = this.f394576a;
        jSONObject.put("battLevelDetal", intValue);
        jSONObject.put("startPower", ((oh.b) o2Var.f477017a).f426708d.f477085a.intValue());
        jSONObject.put("endPower", ((oh.b) o2Var.f477018b).f426708d.f477085a.intValue());
    }
}
