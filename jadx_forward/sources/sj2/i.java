package sj2;

/* loaded from: classes10.dex */
public abstract class i extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public boolean f489919J;
    public int K;
    public java.util.ArrayList L;
    public boolean M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service, int i17) {
        super(context, pluginAbility, service, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    public boolean Z() {
        if (sn0.b.f491497e2 != null) {
            return true;
        }
        dk2.ef efVar = dk2.ef.f314905a;
        tn0.w0 w0Var = dk2.ef.f314911d;
        if ((w0Var == null || w0Var.X()) ? false : true) {
            if (!(in0.q.f374302b2 != null)) {
                return true;
            }
        }
        return false;
    }

    public final void a0() {
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
        if (c1Var != null) {
            c1Var.N1 = !c1Var.N1;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", c1Var.N1);
            qo0.c q17 = m174009x3a33aac1().q();
            if (q17 != null) {
                q17.mo46557x60d69242(qo0.b.Z2, bundle);
            }
        }
    }

    public abstract void b0(boolean z17);

    @Override // wj2.w, lj2.u0
    /* renamed from: getAnchorAudioModeLayout */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124425xd504a5f8() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getAnchorCriticalLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124426x1ce0d634() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getBattleResultWidget */
    public /* bridge */ /* synthetic */ ai2.a mo124427x4f7d778f() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getBattleTipsWidget */
    public /* bridge */ /* synthetic */ qi2.s1 mo124428x3f645dea() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getCriticalGiftLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124429x4ed4a76f() {
        return null;
    }

    @Override // wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator mo124432x5dc7fd72() {
        return null;
    }

    @Override // wj2.w, sj2.m
    /* renamed from: getGiftRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124433x9681e6d() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getLotteryBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124434x83df3d46() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getLuckyMoneyRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124447xe76ca375() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    /* renamed from: getPotholingRectList */
    public final java.util.ArrayList<android.graphics.RectF> m164661x145d661e() {
        return this.L;
    }

    /* renamed from: getRightOffestSize */
    public final int m164662x9dd54f5e() {
        return this.K;
    }

    /* renamed from: getRoundCornerConstraintLayout */
    public abstract com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea mo164659xafdbe1d4();

    @Override // wj2.w, lj2.u0
    /* renamed from: getVoteBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124442x86ddad3() {
        return null;
    }

    /* renamed from: setAudioMode */
    public final void m164663x66f5a057(boolean z17) {
        this.f489919J = z17;
    }

    /* renamed from: setFocus */
    public final void m164664x52fd1596(boolean z17) {
        this.M = z17;
    }

    /* renamed from: setPotholingRectList */
    public final void m164665xeff37292(java.util.ArrayList<android.graphics.RectF> arrayList) {
        this.L = arrayList;
    }

    /* renamed from: setRightOffestSize */
    public final void m164666xd4abe8d2(int i17) {
        this.K = i17;
    }

    /* renamed from: setScreenMode */
    public final void m164667x3815e31(boolean z17) {
    }
}
