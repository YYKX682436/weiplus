package xc2;

/* loaded from: classes4.dex */
public final class x1 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f534866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f534867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f534868c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f534869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f534870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f534871f;

    public x1(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, android.content.Context context, xc2.p0 p0Var, in5.s0 s0Var, boolean z17, java.lang.String str) {
        this.f534866a = c0Var;
        this.f534867b = context;
        this.f534868c = p0Var;
        this.f534869d = s0Var;
        this.f534870e = z17;
        this.f534871f = str;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.JumperUtils", "jumpLiteApp fail");
        pm0.v.X(new xc2.w1(this.f534866a, this.f534867b, this.f534868c, this.f534869d, this.f534870e, this.f534871f));
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.JumperUtils", "jumpLiteApp success");
    }
}
