package c34;

/* loaded from: classes11.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c34.q f38222d;

    public o(c34.q qVar) {
        this.f38222d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr;
        java.lang.Runnable runnable;
        c34.q qVar = this.f38222d;
        com.tencent.mm.sdk.platformtools.n3 n3Var = qVar.f38233q;
        if (n3Var != null && (runnable = qVar.f38234r) != null) {
            n3Var.removeCallbacks(runnable);
        }
        if (qVar.f38232p != null) {
            c01.d9.e().d(qVar.f38232p);
        }
        c34.n nVar = qVar.f38231o;
        if (nVar != null && (bArr = nVar.f38220f) != null) {
            qVar.f38232p = new c34.m(bArr);
        }
        if (qVar.f38232p != null) {
            c01.d9.e().g(qVar.f38232p);
        }
    }
}
