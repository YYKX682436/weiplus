package l83;

/* loaded from: classes14.dex */
public class d implements l83.k {

    /* renamed from: b, reason: collision with root package name */
    public j83.b f398629b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f398630c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6 f398631d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f398632e;

    /* renamed from: f, reason: collision with root package name */
    public long f398633f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final l83.l f398628a = new l83.l();

    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallDeviceManager", "onScreenDistanceChange, isClose: %b", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f398632e;
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.mo65198x1aec5e91(!z17);
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().b()) {
            if (z17) {
                this.f398629b.a(false);
            } else {
                j83.b bVar = this.f398629b;
                bVar.a(bVar.f379697o);
            }
        }
    }

    public void b(boolean z17) {
        this.f398629b.a(z17);
    }

    public void c() {
        l83.h hVar = this.f398629b.f379695m;
        if (hVar == null || hVar.f398639c) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRecorder", "start record");
        hVar.f398639c = true;
        synchronized (hVar.f398638b) {
            s75.d.b(new l83.f(hVar), "IPCallRecorder_startRecord");
        }
    }
}
