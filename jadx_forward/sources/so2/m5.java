package so2;

/* loaded from: classes.dex */
public final class m5 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f492016d;

    public m5(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f492016d = qVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SetProfileCoverViewModel", "onModifyResult, retCode: " + ret.m75939xb282bd08(1) + " retMsg:" + ret.m75945x2fec8307(2));
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        ((p3325xe03a0797.p3326xc267989b.r) this.f492016d).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(java.lang.Integer.valueOf(ret.m75939xb282bd08(1)), ret.m75945x2fec8307(2))));
    }
}
