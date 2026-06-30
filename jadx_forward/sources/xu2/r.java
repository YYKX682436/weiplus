package xu2;

/* loaded from: classes3.dex */
public final class r extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xu2.u f538760a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(xu2.u uVar, long j17) {
        super(j17, 100L);
        this.f538760a = uVar;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        xu2.u uVar = this.f538760a;
        uVar.getClass();
        pm0.v.X(new xu2.o(uVar, true));
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        xu2.u uVar = this.f538760a;
        ((mm2.c1) uVar.S0().a(mm2.c1.class)).K5 = (int) ((((mm2.c1) uVar.S0().a(mm2.c1.class)).J5 - (j17 / 1000)) - 1);
        if (uVar.v1() > 0 && !((mm2.c1) uVar.S0().a(mm2.c1.class)).M5) {
            xu2.v vVar = uVar.f538765r;
            if (vVar != null) {
                r45.i33 i33Var = vVar.f538773b;
                vVar.a();
                try {
                    java.lang.String m75945x2fec8307 = i33Var.m75945x2fec8307(5);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    org.json.JSONObject jSONObject = new org.json.JSONObject(m75945x2fec8307);
                    org.json.JSONObject optJSONObject = jSONObject.optJSONObject("weapp_extra_data");
                    if (optJSONObject == null) {
                        optJSONObject = new org.json.JSONObject();
                    }
                    jSONObject.put("report_type", 1);
                    jSONObject.put("report_link", i33Var.m75945x2fec8307(3));
                    jSONObject.put("viewable", true);
                    jSONObject.put("exposure_type", 1);
                    optJSONObject.put("exp_time", vVar.f538777f);
                    optJSONObject.put("clk_time", 0);
                    jSONObject.put("weapp_extra_data", optJSONObject.toString());
                    long j18 = vVar.f538779h;
                    long j19 = vVar.f538778g;
                    java.lang.String jSONObject2 = jSONObject.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                    new ek2.h0(j18, j19, 1, jSONObject2).l().f(vVar.f538772a);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(vVar.f538774c, th6, "reportFirstPlay", new java.lang.Object[0]);
                }
            }
            ((mm2.c1) uVar.S0().a(mm2.c1.class)).M5 = true;
        }
        pm0.v.X(new xu2.o(uVar, false));
    }
}
