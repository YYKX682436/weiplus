package ph1;

/* loaded from: classes7.dex */
public class a0 implements ph1.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f435839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ph1.g0 f435840b;

    public a0(ph1.g0 g0Var) {
        this.f435840b = g0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(g0Var.hashCode());
        sb6.append("@");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        this.f435839a = sb6.toString();
    }

    @Override // ph1.b
    public void a(java.lang.String str, ph1.d dVar, ph1.c cVar, boolean z17) {
        this.f435840b.m(str, dVar, cVar, z17, this.f435839a);
    }

    @Override // ph1.b
    /* renamed from: commit */
    public void mo158531xaf3f2937() {
        ph1.q.f435881a.a(this.f435839a);
    }
}
