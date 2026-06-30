package xc2;

/* loaded from: classes10.dex */
public final class n1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f534748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f534749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f534750f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(android.content.Context context, xc2.p0 p0Var, org.json.JSONObject jSONObject) {
        super(2);
        this.f534748d = context;
        this.f534749e = p0Var;
        this.f534750f = jSONObject;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String audioPath = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((android.content.Context) obj, "<anonymous parameter 0>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioPath, "audioPath");
        xc2.y2.f534876a.j(this.f534748d, this.f534749e, audioPath, this.f534750f);
        return jz5.f0.f384359a;
    }
}
