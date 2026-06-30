package e33;

/* loaded from: classes10.dex */
public class d5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.a1 {

    /* renamed from: a, reason: collision with root package name */
    public int f328733a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e33.h5 f328734b;

    public d5(e33.h5 h5Var) {
        this.f328734b = h5Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: clearView */
    public void mo8113xb4407692(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        if (k3Var != null) {
            super.mo8113xb4407692(c1163xf1deaba4, k3Var);
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this.f328734b.f328790e, com.p314xaae8f345.mm.R.C30854x2dc211.f559356ch);
            loadAnimation.setAnimationListener(new e33.c5(this));
            ((e33.f5) k3Var).f328760n.startAnimation(loadAnimation);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: getMoveThreshold */
    public float mo8118xbee83fe4(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        return 0.295858f;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: getMovementFlags */
    public int mo8119x457acf62(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        return p012xc85e97e9.p103xe821e364.p104xd1075a44.a1.m8110x3388cfca(51, 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: isItemViewSwipeEnabled */
    public boolean mo8126x5b4a2f69() {
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: isLongPressDragEnabled */
    public boolean mo8127x3b3ada10() {
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onChildDraw */
    public void mo8128xf876e561(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, float f17, float f18, int i17, boolean z17) {
        super.mo8128xf876e561(canvas, c1163xf1deaba4, k3Var, f17 / 1.3f, f18 / 1.3f, i17, z17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onMove */
    public boolean mo8132xc39cb650(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2) {
        int m8183xf806b362 = k3Var.m8183xf806b362();
        int m8183xf806b3622 = k3Var2.m8183xf806b362();
        e33.h5 h5Var = this.f328734b;
        h5Var.m8150x87567217(m8183xf806b362, m8183xf806b3622);
        e33.g5 g5Var = h5Var.f328794i;
        if (g5Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewUIChangelcai", "[onItemMove]fromPos:%s, toPos:%s, mPosition:%s", java.lang.Integer.valueOf(m8183xf806b362), java.lang.Integer.valueOf(m8183xf806b3622), ((e33.v3) g5Var).f329049a.f220126o);
        }
        h5Var.f328799q = m8183xf806b3622;
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onSelectedChanged */
    public void mo8134xb54743ba(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        if (k3Var != null) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this.f328734b.f328790e, com.p314xaae8f345.mm.R.C30854x2dc211.f559357ci);
            loadAnimation.setAnimationListener(new e33.b5(this, i17, k3Var));
            ((e33.f5) k3Var).f328760n.startAnimation(loadAnimation);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onSwiped */
    public void mo8135x59f07f29(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
    }
}
