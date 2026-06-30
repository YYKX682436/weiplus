package hw2;

/* loaded from: classes5.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os5.o f367075d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(os5.o oVar) {
        super(1);
        this.f367075d = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        os5.o oVar = this.f367075d;
        if (booleanValue) {
            if (oVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14302xfcce20b7) oVar).b(true);
            }
        } else if (oVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14302xfcce20b7 c14302xfcce20b7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14302xfcce20b7) oVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#showSelf");
            android.animation.Animator animator = c14302xfcce20b7.f197345e;
            if (animator != null && animator.isRunning()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#showSelf visibilityAnimator isRunning");
            } else {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(c14302xfcce20b7, "alpha", 0.0f, 1.0f);
                ofFloat.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v2(c14302xfcce20b7));
                ofFloat.start();
                c14302xfcce20b7.f197345e = ofFloat;
            }
        }
        return jz5.f0.f384359a;
    }
}
