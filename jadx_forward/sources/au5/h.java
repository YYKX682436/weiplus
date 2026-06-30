package au5;

/* loaded from: classes15.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ au5.j f95686d;

    public h(au5.j jVar) {
        this.f95686d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        au5.j jVar = this.f95686d;
        jVar.getClass();
        if (!au5.j.f95690o) {
            jVar.getClass();
            zt5.h.c("Soter.SoterCoreTreble", "soter: retryFunc stop, canRetry:%b isInitializeSuccessed:%b", java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(au5.j.f95690o));
            return;
        }
        int i17 = jVar.f95696d + 1;
        jVar.f95696d = i17;
        if (au5.j.f95688m == 2) {
            zt5.h.c("Soter.SoterCoreTreble", "soter: retryFunc stop, CONNECTED", new java.lang.Object[0]);
        } else {
            zt5.h.c("Soter.SoterCoreTreble", "soter: retryFunc bindservice no response: %d delay: %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(au5.j.y(jVar.f95696d)));
            jVar.v(true);
        }
    }
}
