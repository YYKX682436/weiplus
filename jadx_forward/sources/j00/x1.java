package j00;

/* loaded from: classes9.dex */
public final class x1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.d2 f378475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f378476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c00.j3 f378477f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f378478g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(j00.d2 d2Var, boolean z17, c00.j3 j3Var, int i17) {
        super(1);
        this.f378475d = d2Var;
        this.f378476e = z17;
        this.f378477f = j3Var;
        this.f378478g = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        bw5.x7 wi6 = this.f378475d.wi(this.f378476e);
        if (wi6 != null) {
            boolean z17 = this.f378476e;
            bw5.x7 mo11468x92b714fd = new bw5.x7().mo11468x92b714fd(wi6.mo14344x5f01b1f6());
            j00.d dVar = j00.d.f378272a;
            c00.j3 j3Var = this.f378477f;
            int i17 = j3Var.f118526b.f118502c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo11468x92b714fd);
            dVar.a(i17, 1, z17, mo11468x92b714fd, dVar.b(j3Var, z17, this.f378478g, str), 0L);
        }
        return jz5.f0.f384359a;
    }
}
