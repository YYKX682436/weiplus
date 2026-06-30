package au5;

/* loaded from: classes15.dex */
public class d implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ au5.j f14149d;

    public d(au5.j jVar) {
        this.f14149d = jVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        zt5.h.c("Soter.SoterCoreTreble", "soter: binder died", new java.lang.Object[0]);
        bu5.c cVar = au5.j.f14154l;
        if (cVar == null || cVar.asBinder() == null) {
            return;
        }
        au5.j.f14154l.asBinder().unlinkToDeath(this.f14149d.f14168i, 0);
        au5.j.f14154l = null;
        au5.k kVar = this.f14149d.f14167h;
        if (kVar != null) {
            ((se4.e) kVar).getClass();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1104L, 8L, 1L, false);
        }
        synchronized (au5.j.f14158p) {
            au5.j.f14155m = 0;
            this.f14149d.A();
            au5.j.u(this.f14149d);
        }
    }
}
