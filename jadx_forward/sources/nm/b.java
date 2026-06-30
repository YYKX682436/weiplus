package nm;

/* loaded from: classes12.dex */
public class b implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Runnable f419959a;

    /* renamed from: b, reason: collision with root package name */
    public final lm5.d f419960b;

    public b(java.lang.Runnable runnable, lm5.d dVar) {
        this.f419959a = runnable;
        this.f419960b = dVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        lm5.d dVar = this.f419960b;
        if (!(dVar instanceof lm5.c)) {
            return dVar.d();
        }
        lm5.j jVar = lm5.d.f401133a;
        return lm5.i.a() instanceof lm5.c ? lm5.d.f401133a.f401152f : lm5.i.a().d();
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FirstScreenArrangement", "FirstScreenArrangement tryConsumingWaitingQueue runnable %s, %s", this.f419959a, this.f419960b.d());
        try {
            java.lang.Runnable runnable = this.f419959a;
            if (runnable != null) {
                runnable.run();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FirstScreenArrangement", "ERROR: FirstScreenArrangement gonna retry!");
            }
            return null;
        } finally {
            this.f419959a = null;
        }
    }
}
