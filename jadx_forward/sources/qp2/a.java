package qp2;

/* loaded from: classes2.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qp2.g f447293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f447294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f447295f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qp2.g gVar, r45.qt2 qt2Var, boolean z17) {
        super(1);
        this.f447293d = gVar;
        this.f447294e = qt2Var;
        this.f447295f = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.f0 f0Var;
        az2.w wVar = (az2.w) obj;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        qp2.g gVar = this.f447293d;
        if (wVar != null) {
            com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = (com.p314xaae8f345.mm.p944x882e457a.m1) wVar.f97693d;
            gVar.mo815x76e0bfae(wVar.f97691b, wVar.f97690a, wVar.f97692c, m1Var);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            gVar.b(this.f447294e, this.f447295f, 1);
        }
        return f0Var2;
    }
}
