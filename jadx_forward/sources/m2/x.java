package m2;

/* loaded from: classes14.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f404489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.ui.p070xbc0ba74a.C1069x2505018 f404490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f404491f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404492g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404493h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f404494i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f404495m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(yz5.a aVar, p012xc85e97e9.p064x38a77192.ui.p070xbc0ba74a.C1069x2505018 c1069x2505018, long j17, java.lang.String str, java.lang.String str2, java.lang.Class cls, int i17) {
        super(2);
        this.f404489d = aVar;
        this.f404490e = c1069x2505018;
        this.f404491f = j17;
        this.f404492g = str;
        this.f404493h = str2;
        this.f404494i = cls;
        this.f404495m = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        n0.d2.h(this.f404489d, oVar, 0);
        p012xc85e97e9.p064x38a77192.ui.p070xbc0ba74a.C1069x2505018 c1069x2505018 = this.f404490e;
        p012xc85e97e9.p064x38a77192.ui.p070xbc0ba74a.C1069x2505018.a(c1069x2505018, u0.j.b(oVar, 1938351266, true, new m2.w(this.f404491f, c1069x2505018, this.f404492g, this.f404493h, this.f404494i, this.f404495m)), oVar, 70);
        return jz5.f0.f384359a;
    }
}
