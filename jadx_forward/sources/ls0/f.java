package ls0;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.k f402356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f402357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f402358f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f402359g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ls0.k kVar, byte[] bArr, long j17, yz5.l lVar) {
        super(0);
        this.f402356d = kVar;
        this.f402357e = bArr;
        this.f402358f = j17;
        this.f402359g = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (this.f402356d.f402401v) {
            try {
                ms0.c.l(this.f402356d.f402380a, this.f402357e, false, 2, null);
                this.f402356d.f402380a.p();
                ls0.k kVar = this.f402356d;
                if (kVar.f402386g != null) {
                    kVar.i(this.f402358f);
                    rs0.h hVar = this.f402356d.f402384e;
                    if (hVar != null) {
                        rs0.i.f480829a.x(hVar.f480825a, hVar.f480826b);
                    }
                }
                yz5.l lVar = this.f402356d.f402385f;
                if (lVar != null) {
                    lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                }
                this.f402359g.mo146xb9724478(this.f402357e);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecWriteYUVError");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 27L, 1L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f402356d.f402381b, e17, "", new java.lang.Object[0]);
                yz5.l lVar2 = this.f402356d.f402385f;
                if (lVar2 != null) {
                    lVar2.mo146xb9724478(java.lang.Boolean.FALSE);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f402356d.f402381b, "requestDraw not init now");
        }
        return jz5.f0.f384359a;
    }
}
