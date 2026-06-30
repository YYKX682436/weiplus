package k91;

/* loaded from: classes7.dex */
public class c4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f387090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6 f387091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k91.g4 f387092f;

    public c4(k91.g4 g4Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6 e6Var) {
        this.f387092f = g4Var;
        this.f387090d = str;
        this.f387091e = e6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f387090d;
        android.util.Pair i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.q.i(str, false, null, new k91.q4(str, null), null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6 e6Var = this.f387091e;
        if (e6Var != null) {
            e6Var.a(i17.first != null ? this.f387092f.Ai(str) : null);
        }
    }
}
