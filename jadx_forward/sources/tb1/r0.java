package tb1;

/* loaded from: classes7.dex */
public class r0 implements tb1.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tb1.q0 f498466a;

    public r0(tb1.q0 q0Var) {
        this.f498466a = q0Var;
    }

    public void a(java.lang.String str, int i17, int i18, int i19) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        tb1.q0 q0Var = this.f498466a;
        if (K0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("bufferId", java.lang.Integer.valueOf(i17));
            hashMap.put("width", java.lang.Integer.valueOf(i18));
            hashMap.put("height", java.lang.Integer.valueOf(i19));
            q0Var.f498460e.a(q0Var.f498461f, q0Var.f498462g.p("ok", hashMap));
            return;
        }
        q0Var.f498460e.a(q0Var.f498461f, q0Var.f498462g.o("fail:" + str));
    }
}
