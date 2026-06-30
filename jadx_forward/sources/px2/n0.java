package px2;

/* loaded from: classes2.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.a1 f440439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f440440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f440441f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(bb2.a1 a1Var, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd) {
        super(0);
        this.f440439d = a1Var;
        this.f440440e = j17;
        this.f440441f = c15188xd8bd4bd;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bb2.a1 a1Var = this.f440439d;
        a1Var.getBulletManager().n(this.f440440e, this.f440441f.V(), false);
        a1Var.mo10141x53a1e732(false);
        return jz5.f0.f384359a;
    }
}
