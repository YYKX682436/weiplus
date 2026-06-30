package pc3;

/* loaded from: classes7.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pc3.t f434924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434925e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f434926f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434927g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(pc3.t tVar, java.lang.String str, yz5.l lVar, java.lang.String str2) {
        super(1);
        this.f434924d = tVar;
        this.f434925e = str;
        this.f434926f = lVar;
        this.f434927g = str2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.f0 f0Var;
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f434924d.f434935h;
        java.lang.String str = this.f434925e;
        sc3.k1 k1Var = (sc3.k1) concurrentHashMap.get(str);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (k1Var != null) {
            k1Var.g1(new pc3.q(this.f434926f, byteBuffer));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicBrushServerMgr", "public service " + str + " read from " + this.f434927g + " but lost");
        }
        return f0Var2;
    }
}
