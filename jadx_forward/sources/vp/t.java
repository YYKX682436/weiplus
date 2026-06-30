package vp;

/* loaded from: classes16.dex */
public class t {

    /* renamed from: b, reason: collision with root package name */
    public final zp.l f520364b;

    /* renamed from: c, reason: collision with root package name */
    public final zp.i f520365c;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f520367e = -1;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f520363a = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f520366d = new java.util.concurrent.atomic.AtomicBoolean(false);

    public t(zp.i iVar, vp.v vVar) {
        this.f520365c = iVar;
        this.f520364b = new zp.l(vVar, new vp.s(this));
    }

    public void a(wp.a aVar) {
        c();
        java.util.Objects.toString(aVar);
        zp.l lVar = this.f520364b;
        if (aVar == null) {
            lVar.getClass();
        } else {
            zp.j jVar = lVar.f556451a;
            zp.j jVar2 = jVar.f556450c;
            while (jVar2 != jVar) {
                if (lVar.f556452b.compare(jVar2.f556448a, aVar) <= 0) {
                    break;
                } else {
                    jVar2 = jVar2.f556450c;
                }
            }
            if (!aVar.m174282xb2c87fbf(jVar2.f556448a)) {
                zp.j jVar3 = jVar2.f556449b;
                zp.j jVar4 = new zp.j(aVar, jVar3, jVar2);
                jVar3.f556450c = jVar4;
                jVar2.f556449b = jVar4;
                lVar.f556454d++;
            }
        }
        e();
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuDataSource", "clear danmaku queue");
        c();
        zp.l lVar = this.f520364b;
        zp.j jVar = lVar.f556451a;
        jVar.f556449b = jVar;
        jVar.f556450c = jVar;
        lVar.f556454d = 0;
        e();
    }

    public final void c() {
        while (!this.f520366d.compareAndSet(false, true)) {
            java.lang.Thread.yield();
        }
    }

    public void d() {
        c();
        zp.j jVar = this.f520364b.f556451a;
        zp.j jVar2 = jVar.f556450c;
        wp.a aVar = (wp.a) (jVar2 != jVar ? jVar2.f556448a : null);
        if (aVar == null) {
            this.f520367e = -1L;
        } else {
            this.f520367e = aVar.f529868f;
        }
        e();
    }

    public final void e() {
        while (!this.f520366d.compareAndSet(true, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DanmakuDataSource", "update end is blocked! this can not happend!");
            java.lang.Thread.yield();
        }
    }
}
