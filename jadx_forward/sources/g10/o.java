package g10;

/* loaded from: classes7.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f349072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g10.v f349073e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.x7 f349074f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, g10.v vVar, bw5.x7 x7Var) {
        super(0);
        this.f349072d = str;
        this.f349073e = vVar;
        this.f349074f = x7Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "doBizPreload, bizName = " + this.f349072d);
        this.f349073e.Ai(this.f349074f);
        return jz5.f0.f384359a;
    }
}
