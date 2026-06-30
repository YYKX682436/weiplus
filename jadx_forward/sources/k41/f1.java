package k41;

/* loaded from: classes11.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f385522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f385523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f385524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385525g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k41.g0 f385526h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.gk3 f385527i;

    public f1(java.util.ArrayList arrayList, int i17, int i18, java.lang.String str, k41.g0 g0Var, r45.gk3 gk3Var) {
        this.f385522d = arrayList;
        this.f385523e = i17;
        this.f385524f = i18;
        this.f385525g = str;
        this.f385526h = g0Var;
        this.f385527i = gk3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.util.ArrayList<j41.w> arrayList = this.f385522d;
        if (arrayList != null) {
            for (j41.w wVar : arrayList) {
                j41.i0 i0Var = new j41.i0();
                i0Var.f379173a = this.f385523e;
                i0Var.f379174b = this.f385524f;
                i0Var.f379175c = this.f385525g;
                i0Var.f379176d = this.f385526h;
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                r45.gk3 gk3Var = this.f385527i;
                i0Var.f379177e = gk3Var != null ? gk3Var.f456845e : 3;
                if (gk3Var == null || (str = gk3Var.f456846f) == null) {
                    str = "";
                }
                i0Var.f379178f = str;
                wVar.a(i0Var);
            }
        }
    }
}
