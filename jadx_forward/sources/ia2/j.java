package ia2;

/* loaded from: classes2.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 f371465d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3) {
        super(0);
        this.f371465d = activityC13656x51707ca3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3 = this.f371465d;
        java.lang.ref.WeakReference weakReference = activityC13656x51707ca3.f183314u;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = weakReference != null ? (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) weakReference.get() : null;
        if (activityC1102x9ee2d9f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderFlutterPOIActivity", "onAddressEntranceTap: failed, parentActivity null");
        } else {
            r45.f96 f96Var = activityC13656x51707ca3.f183317x;
            if (f96Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderFlutterPOIActivity", "onAddressEntranceTap: failed, location null");
            } else {
                la2.d dVar = la2.d.f399043a;
                r45.f96 f96Var2 = activityC13656x51707ca3.f183317x;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f96Var2);
                dVar.b(activityC1102x9ee2d9f, null, 11, f96Var, true, f96Var2.m75939xb282bd08(8), false, true);
            }
        }
        return jz5.f0.f384359a;
    }
}
