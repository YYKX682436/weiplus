package c01;

/* loaded from: classes12.dex */
public class wc {

    /* renamed from: a, reason: collision with root package name */
    public final c01.vc f37552a;

    /* renamed from: b, reason: collision with root package name */
    public long f37553b;

    /* renamed from: c, reason: collision with root package name */
    public long f37554c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f37555d;

    /* renamed from: e, reason: collision with root package name */
    public int f37556e;

    public wc(c01.vc vcVar) {
        this.f37552a = null;
        this.f37553b = 0L;
        this.f37554c = 0L;
        this.f37555d = "";
        this.f37556e = 1;
        iz5.a.g(null, vcVar != null);
        this.f37552a = vcVar;
        this.f37556e = 1;
        this.f37553b = 0L;
        this.f37554c = 0L;
        this.f37555d = "";
    }

    public final synchronized void a() {
        if (this.f37556e != 1) {
            long j17 = this.f37553b + this.f37554c;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (j17 < java.lang.System.currentTimeMillis()) {
                b();
            }
        }
    }

    public synchronized void b() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (this.f37556e == 1) {
            return;
        }
        this.f37556e = 1;
        this.f37553b = 0L;
        this.f37554c = 0L;
        this.f37555d = "";
        com.tencent.mm.autogen.events.SyncPauseEvent syncPauseEvent = new com.tencent.mm.autogen.events.SyncPauseEvent();
        syncPauseEvent.f54876g.getClass();
        syncPauseEvent.e();
    }

    public synchronized void c() {
        int i17 = this.f37556e;
        if (i17 != 2) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.SyncPauser", "ERR: setFullPause but currState is %d  %s", java.lang.Integer.valueOf(i17), new com.tencent.mm.sdk.platformtools.z3());
            return;
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.System.currentTimeMillis();
        this.f37556e = 3;
        com.tencent.mm.autogen.events.SyncPauseEvent syncPauseEvent = new com.tencent.mm.autogen.events.SyncPauseEvent();
        syncPauseEvent.f54876g.getClass();
        syncPauseEvent.e();
    }
}
