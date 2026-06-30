package vp4;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f520552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vp4.j f520553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f520554f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, vp4.j jVar, android.os.Bundle bundle) {
        super(2);
        this.f520552d = interfaceC29045xdcb5ca57;
        this.f520553e = jVar;
        this.f520554f = bundle;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        java.lang.String workTagId = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        nu3.m mVar = nu3.m.f421762a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setBackgroundWorkTagId >> workTagId: ".concat(workTagId));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6874x68a054db c6874x68a054db = nu3.m.f421763b;
        c6874x68a054db.U = c6874x68a054db.b("BackgroundWorkId", workTagId, true);
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f520552d;
        if (booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoBackgroundRemuxChain", "download music success, " + str);
            vp4.j jVar = this.f520553e;
            st3.r rVar = jVar.f520569b;
            rp4.a aVar = jVar.f520572e;
            int i17 = aVar != null ? aVar.f480142l : 0;
            android.os.Bundle bundle = this.f520554f;
            boolean z17 = bundle != null ? bundle.getBoolean("KEY_EXPORT_HEVC_HARD", false) : false;
            boolean z18 = bundle != null ? bundle.getBoolean("KEY_EXPORT_HEVC_SOFT", false) : false;
            rp4.x xVar = jVar.f520575h;
            int i18 = bundle != null ? bundle.getInt("KEY_EXPORT_TARGET_VIDEO_BITRATE", 0) : 0;
            st3.s sVar = jVar.f520576i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = jVar.f520571d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc19624);
            vp4.j jVar2 = this.f520553e;
            vp4.j.f(jVar2, z18, z17, str, i18, rVar, i17, c16993xacc19624, xVar, sVar, workTagId, new vp4.e(interfaceC29045xdcb5ca57, jVar2, workTagId));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoBackgroundRemuxChain", "download music failed");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16504x377e8372(og3.h.f426697d, 1008, "Background remux audio error", null, 8, null)));
        }
        return jz5.f0.f384359a;
    }
}
