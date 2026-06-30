package km1;

/* loaded from: classes7.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km1.s f390555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f390556e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f390557f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(km1.s sVar, yz5.l lVar, android.util.Size size) {
        super(1);
        this.f390555d = sVar;
        this.f390556e = lVar;
        this.f390557f = size;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad = this.f390555d.f390574u;
            if (c4209xd2d3ddad == null) {
                km1.s sVar = this.f390555d;
                yz5.l lVar = this.f390556e;
                if (km1.s.F) {
                    java.lang.String str = sVar.f390562f;
                }
                if (lVar != null) {
                    lVar.mo146xb9724478(java.lang.Boolean.FALSE);
                }
            } else {
                km1.s sVar2 = this.f390555d;
                android.util.Size size = this.f390557f;
                km1.p pVar = new km1.p(sVar2);
                if (km1.s.F) {
                    sVar2.getClass();
                    java.util.Objects.toString(size);
                }
                if (sVar2.f390571r) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar2.f390562f, "setupWebGLExtTextureIfNeed, already registerSurface");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar2.f390562f, "setupWebGLExtTextureIfNeed, registerSurface");
                    com.p314xaae8f345.p485x5dc4f1ad.p486xa7b754fd.C4211x20e2c38e c4211x20e2c38e = c4209xd2d3ddad.f130115f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c4211x20e2c38e, "getExternalTexturePlugin(...)");
                    bh.a.a(c4211x20e2c38e, "livepusher", sVar2.f390560d.f334030d, size.getWidth(), size.getHeight(), null, new km1.n(sVar2, pVar), new km1.o(sVar2), false, 128, null);
                    sVar2.f390571r = true;
                }
                yz5.l lVar2 = this.f390556e;
                if (lVar2 != null) {
                    lVar2.mo146xb9724478(java.lang.Boolean.TRUE);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390555d.f390562f, "startCustomVideoCaptureIfNeed, setupWebGLEnv failure");
            yz5.l lVar3 = this.f390556e;
            if (lVar3 != null) {
                lVar3.mo146xb9724478(java.lang.Boolean.FALSE);
            }
        }
        return jz5.f0.f384359a;
    }
}
