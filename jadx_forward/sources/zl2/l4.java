package zl2;

/* loaded from: classes.dex */
public final class l4 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f555415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f555416e;

    public l4(boolean z17, yz5.p pVar) {
        this.f555415d = z17;
        this.f555416e = pVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.g33 req = (r45.g33) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        zl2.q4 q4Var = zl2.q4.f555466a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUtil2", "[configFeedDanmakuOpenState], open:" + this.f555415d + ", ret:" + ret.m75939xb282bd08(1));
        this.f555416e.mo149xb9724478(req, ret);
    }
}
