package d9;

/* loaded from: classes15.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d9.t f308911d;

    public m(d9.t tVar) {
        this.f308911d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        d9.t tVar = this.f308911d;
        if (tVar.P || tVar.A || tVar.f308947w == null || !tVar.f308950z) {
            return;
        }
        for (d9.f0 f0Var : tVar.f308948x) {
            if (f0Var.i() == null) {
                return;
            }
        }
        t9.g gVar = tVar.f308942r;
        synchronized (gVar) {
            gVar.f498045a = false;
        }
        int length = tVar.f308948x.length;
        d9.k0[] k0VarArr = new d9.k0[length];
        tVar.H = new boolean[length];
        tVar.G = new boolean[length];
        tVar.F = tVar.f308947w.g();
        int i17 = 0;
        while (true) {
            boolean z17 = true;
            if (i17 >= length) {
                tVar.E = new d9.l0(k0VarArr);
                tVar.A = true;
                ((d9.v) tVar.f308936i).g(tVar.F, tVar.f308947w.c());
                tVar.f308946v.a(tVar);
                return;
            }
            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 i18 = tVar.f308948x[i17].i();
            k0VarArr[i17] = new d9.k0(i18);
            java.lang.String str = i18.f125613i;
            if (!t9.k.e(str) && !t9.k.d(str)) {
                z17 = false;
            }
            tVar.H[i17] = z17;
            tVar.I = z17 | tVar.I;
            i17++;
        }
    }
}
