package b25;

/* loaded from: classes11.dex */
public class i extends hm0.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f17401d;

    public i(b25.j jVar, java.lang.String str) {
        this.f17401d = str;
    }

    @Override // hm0.t
    public void b() {
        if (gm0.j1.a()) {
            w11.d2 Ai = ((com.tencent.mm.plugin.zero.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai();
            java.lang.String str = this.f17401d;
            Ai.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.SyncService", "SyncService onAppForeground %s", str);
            if (gm0.j1.a() && gm0.j1.b().f273254q && !gm0.m.r()) {
                Ai.h(3);
            }
        }
    }
}
