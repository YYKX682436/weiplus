package ao3;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ao3.g f94082d;

    public e(ao3.g gVar) {
        this.f94082d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NFC_CPU_CARD_CONFIG_STRING, null))) {
            this.f94082d.Ai().c();
            return;
        }
        ((i04.i) ((j04.e) i95.n0.c(j04.e.class))).Ri("getCpuCardConfig", 24, new j04.f() { // from class: ao3.e$$a
            @Override // j04.f
            public final void a(java.lang.String str, long j17, long j18) {
                ao3.e.this.f94082d.Ai().c();
            }
        }, true, false);
    }
}
