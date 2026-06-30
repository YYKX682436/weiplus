package ln5;

/* loaded from: classes15.dex */
public final class i extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 f401473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f401474e;

    public i(com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864, boolean z17) {
        this.f401473d = c22851x22587864;
        this.f401474e = z17;
    }

    @Override // qn5.a
    public void b(android.animation.Animator animator) {
        boolean z17 = false;
        if (animator != null && animator.getDuration() == 0) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = this.f401473d;
        c22851x22587864.m82913x4b20af2f().f411760t = java.lang.System.currentTimeMillis();
        c22851x22587864.f295271h.c(sn5.b.f491697w);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRefresh ");
        boolean z18 = this.f401474e;
        sb6.append(z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxRefreshLayout", sb6.toString());
        qn5.c onSimpleAction = c22851x22587864.getOnSimpleAction();
        if (onSimpleAction != null) {
            onSimpleAction.a(z18);
        }
        on5.g headerPlugin = c22851x22587864.getHeaderPlugin();
        if (headerPlugin != null) {
            headerPlugin.f(c22851x22587864, c22851x22587864.m82919xbce906a5().f411768a, (int) (c22851x22587864.m82919xbce906a5().f411770c < 10.0f ? c22851x22587864.m82919xbce906a5().f411768a * c22851x22587864.m82919xbce906a5().f411770c : c22851x22587864.m82919xbce906a5().f411770c));
        }
    }
}
