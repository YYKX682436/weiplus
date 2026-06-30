package fh1;

/* loaded from: classes7.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh1.z f344109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f344111f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344112g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f344113h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f344114i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(fh1.z zVar, java.lang.String str, int i17, java.lang.String str2, int i18, int i19) {
        super(0);
        this.f344109d = zVar;
        this.f344110e = str;
        this.f344111f = i17;
        this.f344112g = str2;
        this.f344113h = i18;
        this.f344114i = i19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fq0.x xVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f344109d.f344164e, "onCreateFrameSet appId:" + this.f344110e + " frameId:" + this.f344111f + " name:" + this.f344112g + " width:" + this.f344113h + " height:" + this.f344114i);
        fh1.x0 a17 = this.f344109d.a();
        java.lang.String frameSetName = this.f344112g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        hq0.e0 e0Var = a17.B;
        if (e0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(a17.A, "frameSetRoot is null, create frameset:" + frameSetName + " fail");
            xVar = null;
        } else {
            fq0.x xVar2 = (fq0.x) e0Var.e(frameSetName).f384366d;
            a17.C.put(frameSetName, xVar2);
            xVar = xVar2;
        }
        if (xVar != null) {
            int i17 = this.f344113h;
            int i18 = this.f344114i;
            int i19 = this.f344111f;
            xVar.f347015f = i17;
            xVar.f347016g = i18;
            xVar.d();
            xVar.b();
            fh1.s0 s0Var = fh1.x0.I;
            java.lang.String frameSetId = xVar.f347011b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclMBFrameBiz", "notifyFrameSetId2TextureId frameSetId:" + frameSetId + " textureId:" + i19);
            synchronized (s0Var) {
                fh1.x0.K.put(frameSetId, java.lang.Integer.valueOf(i19));
            }
            s0Var.a();
            hq0.e0 e0Var2 = a17.B;
            if (e0Var2 != null) {
                e0Var2.a("", "");
            }
        }
        return jz5.f0.f384359a;
    }
}
