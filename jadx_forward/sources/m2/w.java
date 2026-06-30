package m2;

/* loaded from: classes13.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f404483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.ui.p070xbc0ba74a.C1069x2505018 f404484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404485f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404486g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f404487h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f404488i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j17, p012xc85e97e9.p064x38a77192.ui.p070xbc0ba74a.C1069x2505018 c1069x2505018, java.lang.String str, java.lang.String str2, java.lang.Class cls, int i17) {
        super(2);
        this.f404483d = j17;
        this.f404484e = c1069x2505018;
        this.f404485f = str;
        this.f404486g = str2;
        this.f404487h = cls;
        this.f404488i = i17;
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
        java.lang.String str = this.f404485f;
        java.lang.String str2 = this.f404486g;
        java.lang.Class cls = this.f404487h;
        int i17 = this.f404488i;
        p012xc85e97e9.p064x38a77192.ui.p070xbc0ba74a.C1069x2505018 c1069x2505018 = this.f404484e;
        m2.v vVar = new m2.v(str, str2, oVar, cls, i17, c1069x2505018);
        if (this.f404483d >= 0) {
            c1069x2505018.m7165x164bf3f(new n2.d(new m2.u(c1069x2505018)));
        }
        vVar.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
