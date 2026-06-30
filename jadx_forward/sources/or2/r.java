package or2;

/* loaded from: classes10.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or2.s f429203d;

    public r(or2.s sVar) {
        this.f429203d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        or2.i iVar = this.f429203d.f429205e;
        if (iVar != null) {
            iVar.a();
        }
    }
}
