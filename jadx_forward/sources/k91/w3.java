package k91;

/* loaded from: classes4.dex */
public final class w3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f387338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f387339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f387340f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k91.u3 f387341g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k91.s3 f387342h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k91.x3 f387343i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(java.lang.String str, long j17, java.lang.String str2, k91.u3 u3Var, k91.s3 s3Var, k91.x3 x3Var) {
        super(0);
        this.f387338d = str;
        this.f387339e = j17;
        this.f387340f = str2;
        this.f387341g = u3Var;
        this.f387342h = s3Var;
        this.f387343i = x3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        k91.s3 s3Var = new k91.s3();
        java.lang.String str = this.f387338d;
        s3Var.f66566x28d45f97 = str;
        long j17 = this.f387339e;
        s3Var.f66568xbfd10768 = j17;
        s3Var.f66567xab29c8ea = this.f387340f;
        k91.u3 u3Var = this.f387341g;
        s3Var.f66569x10639700 = u3Var.ordinal();
        k91.s3 s3Var2 = this.f387342h;
        k91.x3 x3Var = this.f387343i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WeDataExptInfoStorage", "doReplaceExptInfo, appId:" + str + ", issueTimestamp:" + j17 + ", source:" + u3Var + ", ret:" + (s3Var2 == null ? super/*l75.n0*/.mo51731x24249762(s3Var, true) : super/*l75.n0*/.mo51732xbf274172(s3Var, true, "appId")));
        return jz5.f0.f384359a;
    }
}
