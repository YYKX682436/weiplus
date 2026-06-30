package hw2;

/* loaded from: classes5.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw2.e f367043d;

    public d(hw2.e eVar) {
        this.f367043d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hw2.e eVar = this.f367043d;
        if (eVar.f367053o) {
            iu3.i iVar = eVar.f367047f;
            if (iVar != null) {
                iVar.b(eVar.f367052n);
                return;
            }
            return;
        }
        iu3.i iVar2 = eVar.f367047f;
        if (iVar2 != null) {
            iVar2.c(eVar.f367052n);
        }
    }
}
