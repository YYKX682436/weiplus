package df;

/* loaded from: classes15.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f311098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 f311099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df.z f311100f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 f311101g;

    public w(p3325xe03a0797.p3326xc267989b.q qVar, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 interfaceC28648x8c0b9e17, df.z zVar, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079) {
        this.f311098d = qVar;
        this.f311099e = interfaceC28648x8c0b9e17;
        this.f311100f = zVar;
        this.f311101g = enumC28568xbdfb1079;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 interfaceC28648x8c0b9e17 = this.f311099e;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f311098d;
        p3325xe03a0797.p3326xc267989b.r rVar = (p3325xe03a0797.p3326xc267989b.r) qVar;
        if (rVar.n()) {
            try {
                android.graphics.SurfaceTexture surfaceTexture = ((io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4) interfaceC28648x8c0b9e17).getSurfaceTexture();
                if (surfaceTexture != null) {
                    ((io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4) interfaceC28648x8c0b9e17).m137238xaca290f5(new android.view.Surface(surfaceTexture));
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.a("SkylineFlutterView", "set renderSurface error, may cause flash", e17);
            }
            df.z zVar = this.f311100f;
            if (zVar.m124147x19cc2a81().mo137196x1f8c622()) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
                return;
            }
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079 = this.f311101g;
            df.v vVar = new df.v(qVar, zVar, enumC28568xbdfb1079);
            if (enumC28568xbdfb1079 == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.surface) {
                zVar.f311154m.add(vVar);
            } else if (enumC28568xbdfb1079 == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture) {
                zVar.f311153i.add(vVar);
            }
        }
    }
}
