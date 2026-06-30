package sh;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f489529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sh.b f489530e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f489531f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f489532g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m3.i f489533h;

    public a(sh.c cVar, java.util.concurrent.atomic.AtomicReference atomicReference, sh.b bVar, long j17, android.os.Handler handler, m3.i iVar) {
        this.f489529d = atomicReference;
        this.f489530e = bVar;
        this.f489531f = j17;
        this.f489532g = handler;
        this.f489533h = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f489529d;
        rh.c1 c1Var = (rh.c1) atomicReference.get();
        m3.i iVar = this.f489533h;
        android.os.Handler handler = this.f489532g;
        long j17 = this.f489531f;
        if (c1Var == null) {
            rh.c1 c1Var2 = (rh.c1) iVar.get();
            c1Var2.I();
            atomicReference.set(c1Var2);
            handler.postDelayed(this, j17);
            return;
        }
        atomicReference.set(null);
        c1Var.l();
        if (this.f489530e.a(c1Var, j17)) {
            handler.getLooper().quit();
            return;
        }
        rh.c1 c1Var3 = (rh.c1) iVar.get();
        c1Var3.I();
        atomicReference.set(c1Var3);
        handler.postDelayed(this, j17);
    }
}
