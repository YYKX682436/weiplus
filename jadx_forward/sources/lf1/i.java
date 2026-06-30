package lf1;

/* loaded from: classes7.dex */
public final class i implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f399794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lf1.j f399795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f399796c;

    public i(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, lf1.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f399794a = h0Var;
        this.f399795b = jVar;
        this.f399796c = lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c
    public void d(int i17) {
        java.lang.Object obj = this.f399794a.f391656d;
        if (obj == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "requestFullscreen, page view is null");
            return;
        }
        int i18 = -90;
        if (i17 != -90) {
            if (i17 != 0) {
                i18 = 90;
                if (i17 != 90 && i17 == 180) {
                    i18 = 180;
                }
            } else {
                i18 = 0;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) obj;
        v5Var.m(new lf1.g(v5Var, this.f399795b, this.f399796c, i18));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c
    /* renamed from: exitFullScreen */
    public void mo54529xd02faf99() {
        java.lang.Object obj = this.f399794a.f391656d;
        if (obj == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SameLayer.VoipRoomPluginHandler", "exitFullscreen, page view is null");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) obj;
            v5Var.m(new lf1.h(v5Var, this.f399795b, this.f399796c));
        }
    }
}
