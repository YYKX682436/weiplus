package in0;

/* loaded from: classes3.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in0.q f374298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f374299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f374300f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(in0.q qVar, int i17, long j17) {
        super(0);
        this.f374298d = qVar;
        this.f374299e = i17;
        this.f374300f = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p05.l0 l0Var = (p05.l0) this.f374298d.W1;
        int i17 = this.f374299e;
        if (l0Var.d(i17)) {
            long j17 = l0Var.f432113f;
            long j18 = this.f374300f;
            if (j18 != j17) {
                if (j17 != 0) {
                    rh0.d0 d0Var = l0Var.f432109b;
                    if (d0Var != null) {
                        ((p05.l4) d0Var).z(j17, null);
                    }
                    l0Var.f432113f = 0L;
                }
                l0Var.f432113f = j18;
                yz5.a aVar = l0Var.f432114g;
                if (aVar != null) {
                    aVar.mo152xb9724478();
                }
                l0Var.f432114g = null;
                rh0.d0 d0Var2 = l0Var.f432109b;
                if (d0Var2 != null) {
                    ((p05.l4) d0Var2).z(j18, new p05.k0(l0Var));
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveGestureRenderEffect", "#applyAnimationCallback effectId=" + i17 + " not match");
        }
        return jz5.f0.f384359a;
    }
}
