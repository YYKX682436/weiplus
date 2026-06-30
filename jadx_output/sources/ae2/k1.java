package ae2;

/* loaded from: classes.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.k1 f3967d = new ae2.k1();

    public k1() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("action", "autoOpenFinderLive");
        jSONObject2.put("finderUserName", "v2_060000231003b20faec8c4e18818c3d1cb04eb33b077ae835e04464cdde50c6c0af16e7d9204@finder");
        jSONObject2.put("commentScene", 9);
        jSONObject.put("extInfo", jSONObject2);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f460472a;
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type android.content.Context");
        zy2.ta.d(e1Var, activity, jSONObject.toString(), null, null, 12, null);
        return jz5.f0.f302826a;
    }
}
