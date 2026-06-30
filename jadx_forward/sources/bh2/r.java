package bh2;

/* loaded from: classes10.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bh2.v f102422d;

    public r(bh2.v vVar) {
        this.f102422d = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bh2.v vVar = this.f102422d;
        bh2.b bVar = vVar.f102431f;
        if (bVar != null) {
            om2.s sVar = vVar.f102427b;
            bVar.a0(sVar != null ? sVar.a() : "", 0);
        }
        vVar.f102436k = true;
        vVar.f102435j = false;
    }
}
