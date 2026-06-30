package ta1;

/* loaded from: classes7.dex */
public class q0 {

    /* renamed from: g, reason: collision with root package name */
    public static volatile java.util.Map f498196g = new java.util.HashMap(1);

    /* renamed from: h, reason: collision with root package name */
    public static final ta1.m0 f498197h = ta1.m0.Hardware;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f498198a;

    /* renamed from: b, reason: collision with root package name */
    public final ta1.b f498199b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p290xb772556d.p291xca4f91d6.C2827xce297dd6 f498200c = new com.p290xb772556d.p291xca4f91d6.C2827xce297dd6();

    /* renamed from: d, reason: collision with root package name */
    public ta1.o0 f498201d = ta1.o0.NotInit;

    /* renamed from: e, reason: collision with root package name */
    public ta1.r0 f498202e = null;

    /* renamed from: f, reason: collision with root package name */
    public ta1.r0 f498203f = null;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        android.content.Context mo50352x76847179 = e9Var.mo50352x76847179();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("wegame_screen_recorder_worker");
        this.f498198a = n3Var;
        if (f498197h != ta1.m0.Software) {
            this.f498199b = new ta1.f(e9Var);
        }
        n3Var.m77784x795fa299(new ta1.w(this, mo50352x76847179));
    }

    public static boolean a(ta1.q0 q0Var) {
        ta1.o0 o0Var = q0Var.f498201d;
        if (o0Var != ta1.o0.NotInit && o0Var != ta1.o0.Inited) {
            q0Var.f498199b.getClass();
            ta1.r0 r0Var = q0Var.f498202e;
            if (r0Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((ma1.c) r0Var).f406685a)) {
                return true;
            }
        }
        return false;
    }

    public static ta1.q0 b(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            throw new java.lang.RuntimeException("Null or nil appid");
        }
        ta1.q0 q0Var = null;
        if (!((java.util.HashMap) f498196g).containsKey(str)) {
            synchronized (ta1.q0.class) {
                if (!((java.util.HashMap) f498196g).containsKey(str)) {
                    q0Var = new ta1.q0(e9Var);
                    ((java.util.HashMap) f498196g).put(str, q0Var);
                }
            }
        }
        return q0Var == null ? (ta1.q0) ((java.util.HashMap) f498196g).get(str) : q0Var;
    }
}
