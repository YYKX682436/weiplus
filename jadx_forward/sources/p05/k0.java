package p05;

/* loaded from: classes3.dex */
public final class k0 implements com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22960x759189cd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p05.l0 f432099a;

    public k0(p05.l0 l0Var) {
        this.f432099a = l0Var;
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22960x759189cd
    public void a(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGestureRenderEffect", "#onAnimationStateChange status=" + i17 + " playedTime=" + i18 + " maxPlayTime=" + i19 + " instanceId=" + i27);
        if (i17 == 1) {
            p05.l0 l0Var = this.f432099a;
            long j17 = l0Var.f432113f;
            if (j17 != 0) {
                rh0.d0 d0Var = l0Var.f432109b;
                if (d0Var != null) {
                    ((p05.l4) d0Var).z(j17, null);
                }
                l0Var.f432113f = 0L;
                yz5.a aVar = l0Var.f432115h;
                if (aVar != null) {
                    aVar.mo152xb9724478();
                }
                l0Var.f432115h = null;
            }
        }
    }
}
