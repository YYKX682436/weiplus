package tm1;

/* loaded from: classes11.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm1.b f501996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.pq0 f501997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.lq0 f501998f;

    public a(tm1.b bVar, bw5.kq0 kq0Var, bw5.pq0 pq0Var, bw5.lq0 lq0Var, bw5.mq0 mq0Var) {
        this.f501996d = bVar;
        this.f501997e = pq0Var;
        this.f501998f = lq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f501997e.f113341d;
        int i18 = this.f501998f.f111463d;
        this.f501996d.getClass();
        if (tm1.h.f502003a.b() == null) {
            return;
        }
        if (i17 != tm1.h.f502008f) {
            qk.ha haVar = qk.ia.f445702e;
            if (i17 != 2) {
                tm1.h hVar = tm1.h.f502003a;
            }
            tm1.h.f502008f = i17;
        }
        if (i18 != tm1.h.f502009g) {
            tm1.h.f502009g = i18;
        }
    }
}
