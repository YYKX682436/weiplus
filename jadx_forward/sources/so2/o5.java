package so2;

/* loaded from: classes8.dex */
public final class o5 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.w5 f492063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.k5 f492064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f492065f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f492066g;

    public o5(so2.w5 w5Var, so2.k5 k5Var, java.lang.String str, int i17) {
        this.f492063d = w5Var;
        this.f492064e = k5Var;
        this.f492065f = str;
        this.f492066g = i17;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SetProfileCoverViewModel", "onModifyResult, retCode: " + ret.m75939xb282bd08(1) + " retMsg:" + ret.m75945x2fec8307(2));
        p3325xe03a0797.p3326xc267989b.l.c(this.f492063d.m158345xefc66565(), oz5.m.f431862d, p3325xe03a0797.p3326xc267989b.a1.DEFAULT, new so2.n5(this.f492064e, this.f492065f, this.f492066g, ret, null));
    }
}
