package t00;

/* loaded from: classes8.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f495910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f495911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.z7 f495912f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(c00.n3 n3Var, long j17, bw5.z7 z7Var) {
        super(1);
        this.f495910d = n3Var;
        this.f495911e = j17;
        this.f495912f = z7Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.i9 i9Var = (bw5.i9) obj;
        c00.n3 n3Var = this.f495910d;
        if (i9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetEcsSectionDataActionHandler", "resp is null");
            n3Var.a();
        } else {
            org.json.JSONObject b17 = t00.a0.f495795a.b(i9Var, this.f495911e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetEcsSectionDataActionHandler", "reqScene:" + this.f495912f.f117378e + " onSuccess, result count: " + i9Var.f110034d.size() + ",hitCache:" + i9Var.f110035e);
            n3Var.b(b17);
        }
        return jz5.f0.f384359a;
    }
}
