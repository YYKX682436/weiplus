package b25;

/* loaded from: classes11.dex */
public class i extends hm0.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f98934d;

    public i(b25.j jVar, java.lang.String str) {
        this.f98934d = str;
    }

    @Override // hm0.t
    public void b() {
        if (gm0.j1.a()) {
            w11.d2 Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai();
            java.lang.String str = this.f98934d;
            Ai.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "SyncService onAppForeground %s", str);
            if (gm0.j1.a() && gm0.j1.b().f354787q && !gm0.m.r()) {
                Ai.h(3);
            }
        }
    }
}
