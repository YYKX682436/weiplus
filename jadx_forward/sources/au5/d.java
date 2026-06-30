package au5;

/* loaded from: classes15.dex */
public class d implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ au5.j f95682d;

    public d(au5.j jVar) {
        this.f95682d = jVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        zt5.h.c("Soter.SoterCoreTreble", "soter: binder died", new java.lang.Object[0]);
        bu5.c cVar = au5.j.f95687l;
        if (cVar == null || cVar.asBinder() == null) {
            return;
        }
        au5.j.f95687l.asBinder().unlinkToDeath(this.f95682d.f95701i, 0);
        au5.j.f95687l = null;
        au5.k kVar = this.f95682d.f95700h;
        if (kVar != null) {
            ((se4.e) kVar).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1104L, 8L, 1L, false);
        }
        synchronized (au5.j.f95691p) {
            au5.j.f95688m = 0;
            this.f95682d.A();
            au5.j.u(this.f95682d);
        }
    }
}
