package of1;

/* loaded from: classes7.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f426519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.k f426520e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(of1.v0 v0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.k kVar) {
        super(0);
        this.f426519d = v0Var;
        this.f426520e = kVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        of1.v0 v0Var = this.f426519d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v0Var.D1(), "startTrans");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd c19231x33dc2abd = v0Var.f426555a2;
        if (c19231x33dc2abd != null) {
            c19231x33dc2abd.h(new of1.o0(v0Var, this.f426520e));
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("transHelper");
        throw null;
    }
}
