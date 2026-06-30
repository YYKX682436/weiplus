package bh2;

/* loaded from: classes10.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bh2.v f20889d;

    public r(bh2.v vVar) {
        this.f20889d = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bh2.v vVar = this.f20889d;
        bh2.b bVar = vVar.f20898f;
        if (bVar != null) {
            om2.s sVar = vVar.f20894b;
            bVar.a0(sVar != null ? sVar.a() : "", 0);
        }
        vVar.f20903k = true;
        vVar.f20902j = false;
    }
}
