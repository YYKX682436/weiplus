package k91;

/* loaded from: classes7.dex */
public class t4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f387303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f387304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k91.d5 f387305f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k91.c5 f387306g;

    public t4(java.lang.String str, boolean z17, k91.d5 d5Var, k91.c5 c5Var) {
        this.f387303d = str;
        this.f387304e = z17;
        this.f387305f = d5Var;
        this.f387306g = c5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
        boolean z17 = this.f387304e;
        java.lang.String str = this.f387303d;
        android.util.Pair i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.q.i(str, z17 && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.q.k(str), null, new k91.s4(this), c19762x487075a);
        k91.c5 c5Var = this.f387306g;
        if (c5Var != null) {
            java.lang.Object obj = i17.second;
            c5Var.a(obj == null ? k91.b5.RET_HIT_FREQUENCY_LIMIT : (((com.p314xaae8f345.mm.p944x882e457a.f) obj).f152148a == 0 && ((com.p314xaae8f345.mm.p944x882e457a.f) obj).f152149b == 0) ? c19762x487075a.f38859x6ac9171 ? k91.b5.RET_UPDATED : k91.b5.RET_NO_UPDATE : k91.b5.RET_CGI_FAIL, (k91.v5) i17.first);
        }
    }
}
