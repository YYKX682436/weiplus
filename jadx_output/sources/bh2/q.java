package bh2;

/* loaded from: classes10.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bh2.v f20888d;

    public q(bh2.v vVar) {
        this.f20888d = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bh2.v vVar = this.f20888d;
        bh2.b bVar = vVar.f20898f;
        if (bVar != null) {
            om2.s sVar = vVar.f20894b;
            bVar.s0(sVar != null ? sVar.a() : "", vVar.f());
        }
        vVar.f20903k = true;
        vVar.f20902j = false;
    }
}
