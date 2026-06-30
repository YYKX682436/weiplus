package vp4;

/* loaded from: classes10.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f520555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vp4.j f520556e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f520557f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, vp4.j jVar, java.lang.String str) {
        super(2);
        this.f520555d = interfaceC29045xdcb5ca57;
        this.f520556e = jVar;
        this.f520557f = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f520555d;
        if (booleanValue) {
            vp4.j jVar = this.f520556e;
            jVar.getClass();
            ut3.f fVar = ut3.f.f512709c;
            fVar.f512711b.putString("key_background_remux_work_id", this.f520557f);
            fVar.f512711b.putBoolean("key_is_background_video", true);
            vp4.s.f520607a.g(jVar.f520570c);
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16504x377e8372(intValue == 0 ? og3.h.f426698e : og3.h.f426697d, intValue, "go to background remux", null, 8, null)));
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16504x377e8372(intValue == 0 ? og3.h.f426698e : og3.h.f426697d, intValue, "ERROR_TARGET_BITRATE_ERROR remux error", null, 8, null)));
        }
        return jz5.f0.f384359a;
    }
}
