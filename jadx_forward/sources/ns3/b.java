package ns3;

/* loaded from: classes8.dex */
public class b extends hs3.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.p1972x3608ae.BinderC16929xaaa42de1 f420954a;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.p1972x3608ae.BinderC16929xaaa42de1 binderC16929xaaa42de1) {
        this.f420954a = binderC16929xaaa42de1;
    }

    @Override // hs3.j
    public void a() {
        this.f420954a.m142013x77b46a52("onComplete", new java.lang.Object[0]);
    }

    @Override // hs3.j
    public void b(int i17, java.lang.String str) {
        this.f420954a.m142013x77b46a52("onError", java.lang.Integer.valueOf(i17), str);
    }

    @Override // hs3.j
    public boolean c() {
        return ((java.lang.Boolean) this.f420954a.m142013x77b46a52("onReady", new java.lang.Object[0])).booleanValue();
    }

    @Override // hs3.j
    public void d(java.lang.String str, java.util.Map map) {
        this.f420954a.m142013x77b46a52("onSuccess", str, map);
    }
}
