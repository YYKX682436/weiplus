package pk2;

/* loaded from: classes2.dex */
public final class i3 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f437368d;

    public i3(v65.n nVar) {
        this.f437368d = nVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.gi2 req = (r45.gi2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorRecommendOption", "modifyLiveUserRecommendSetting ret:" + ret.m75939xb282bd08(1) + ", " + ret.m75945x2fec8307(2) + ", " + ret.m75939xb282bd08(0));
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        v65.n nVar = this.f437368d;
        if (m75939xb282bd08 == 0) {
            nVar.a(java.lang.Boolean.TRUE);
        } else {
            nVar.a(java.lang.Boolean.FALSE);
        }
    }
}
