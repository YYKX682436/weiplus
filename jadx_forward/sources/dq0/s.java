package dq0;

/* loaded from: classes7.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq0.x f323866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f323867e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dq0.a0 f323868f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(fq0.x xVar, yz5.l lVar, dq0.a0 a0Var) {
        super(0);
        this.f323866d = xVar;
        this.f323867e = lVar;
        this.f323868f = a0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preLayout finish ");
        fq0.x xVar = this.f323866d;
        sb6.append(xVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", sb6.toString());
        this.f323867e.mo146xb9724478(java.lang.Double.valueOf(vp0.b.b(java.lang.Integer.valueOf(xVar.f347016g))));
        if (!xVar.f347022m) {
            this.f323868f.v(xVar);
        }
        return jz5.f0.f384359a;
    }
}
