package z63;

/* loaded from: classes5.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f551900d;

    /* renamed from: e, reason: collision with root package name */
    public final z63.u0 f551901e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f551902f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f551903g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f551904h;

    public b1(android.content.Context context, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, z63.u0 u0Var) {
        this.f551900d = context;
        this.f551902f = n3Var;
        this.f551901e = u0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object obj;
        try {
            android.util.Pair j17 = ((t63.e) i95.n0.c(t63.e.class)).wi().j(this.f551903g, 1, this.f551904h);
            int intValue = ((java.lang.Integer) j17.first).intValue();
            int w17 = x63.g.w();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f551902f;
            if (intValue > w17) {
                n3Var.mo50305x3d8a09a2(20002);
                return;
            }
            int intValue2 = ((java.lang.Integer) j17.first).intValue();
            z63.u0 u0Var = this.f551901e;
            if (intValue2 < 1 && ((obj = j17.second) == null || ((y63.a) obj).Q < 1)) {
                if (!x63.g.B(this.f551900d, this.f551903g)) {
                    n3Var.mo50305x3d8a09a2(20002);
                    return;
                }
                ((z63.f1) u0Var).f551924l = null;
                android.os.Message message = new android.os.Message();
                message.what = 20001;
                message.arg1 = 1;
                ((z63.f1) u0Var).f551925m = this.f551903g.trim();
                n3Var.mo50308x2936bf5f(message);
                return;
            }
            java.lang.Object obj2 = j17.second;
            ((z63.f1) u0Var).f551924l = (y63.a) obj2;
            if (!x63.g.C((y63.a) obj2)) {
                n3Var.mo50305x3d8a09a2(20002);
                return;
            }
            android.os.Message message2 = new android.os.Message();
            message2.what = 20001;
            message2.obj = x63.g.o((y63.a) j17.second);
            n3Var.mo50308x2936bf5f(message2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.groupsolitaire.SuggestSolitatireTips", "CheckRunnable run() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }
}
