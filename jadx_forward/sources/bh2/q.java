package bh2;

/* loaded from: classes10.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bh2.v f102421d;

    public q(bh2.v vVar) {
        this.f102421d = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bh2.v vVar = this.f102421d;
        bh2.b bVar = vVar.f102431f;
        if (bVar != null) {
            om2.s sVar = vVar.f102427b;
            bVar.s0(sVar != null ? sVar.a() : "", vVar.f());
        }
        vVar.f102436k = true;
        vVar.f102435j = false;
    }
}
