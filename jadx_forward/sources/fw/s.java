package fw;

/* loaded from: classes7.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq0.x f348567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fw.v f348568e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(fq0.x xVar, fw.v vVar) {
        super(0);
        this.f348567d = xVar;
        this.f348568e = vVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fq0.x xVar = this.f348567d;
        if (xVar.f347016g > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclEcsTLFlutterPluginBase", "saveCardHeight " + xVar);
            this.f348568e.B(xVar.f347010a, xVar.f347016g);
        }
        return jz5.f0.f384359a;
    }
}
