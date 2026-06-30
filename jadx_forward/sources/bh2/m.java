package bh2;

/* loaded from: classes10.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bh2.v f102415d;

    public m(bh2.v vVar) {
        this.f102415d = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bh2.v vVar = this.f102415d;
        bh2.b bVar = vVar.f102431f;
        if (bVar != null) {
            om2.s sVar = vVar.f102427b;
            bVar.P1(sVar != null ? sVar.a() : "", 0);
        }
        vVar.f102436k = false;
        vVar.f102435j = true;
    }
}
