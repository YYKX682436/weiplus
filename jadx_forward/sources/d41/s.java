package d41;

@j95.b(m140513x1e06fd29 = {wx.c1.class})
/* loaded from: classes11.dex */
public final class s extends i95.w implements e41.e {

    /* renamed from: d, reason: collision with root package name */
    public final d41.j f307927d = new d41.j();

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        iw5.o.f376808a = new d41.k();
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.n.f299013b = d41.l.f307920a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.o.f299015a = d41.m.f307921a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.o.f299016b = d41.n.f307922a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.o.f299017c = d41.o.f307923a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.o.f299018d = d41.p.f307924a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.n.f299012a = d41.q.f307925a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.n.f299014c = d41.r.f307926a;
        boolean z17 = jw5.i.f383888c;
        if (!jw5.i.f383888c) {
            boolean z18 = true;
            jw5.i.f383888c = true;
            if (iw5.o.f376808a != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AidlZChannelServerFactory", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
            }
            jw5.f fVar = new jw5.f();
            boolean z19 = iw5.d.f376801a;
            if (!z19 && !z19) {
                if (iw5.o.f376808a != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtChannelManager", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
                }
                iw5.d.f376801a = true;
                com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.i.f301572a = iw5.b.f376799a;
                com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.i.f301573b = iw5.c.f376800a;
            }
            java.util.Map map = iw5.f.f376802c;
            if (!map.containsKey("AIDL")) {
                if (iw5.o.f376808a != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtChannelServerFactory", "register: type AIDL");
                }
                if (map.containsKey("AIDL") && iw5.o.f376808a != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtChannelServerFactory", "register: type already exists, cover it");
                }
                map.put("AIDL", fVar);
            } else {
                z18 = false;
            }
            if (!z18 && iw5.o.f376808a != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AidlZChannelServerFactory", "init: register server failed");
            }
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.g.f299010b.a(q.i.f440748a);
        com.p314xaae8f345.mm.app.w.INSTANCE.a(this.f307927d);
    }
}
