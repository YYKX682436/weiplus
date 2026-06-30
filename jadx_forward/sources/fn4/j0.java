package fn4;

/* loaded from: classes15.dex */
public class j0 extends com.p314xaae8f345.mm.p971x6de15a2e.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn4.k0 f346091d;

    public j0(fn4.k0 k0Var) {
        this.f346091d = k0Var;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s0
    /* renamed from: onNetworkChange */
    public void mo8869xde9f63df(int i17) {
        fn4.k0 k0Var = this.f346091d;
        int i18 = k0Var.f346102c;
        k0Var.f346102c = k0Var.a();
        if (k0Var.f346102c != i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryNetworkMgr", "network change current:%d change:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(k0Var.f346102c));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new fn4.i0(this, i18));
        }
    }
}
