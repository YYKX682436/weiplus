package dm2;

/* loaded from: classes3.dex */
public final class a implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1537x5c512bd.C14375x1f466727 f323197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1537x5c512bd.C14376x7fc1695 f323198b;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1537x5c512bd.C14375x1f466727 c14375x1f466727, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1537x5c512bd.C14376x7fc1695 c14376x7fc1695) {
        this.f323197a = c14375x1f466727;
        this.f323198b = c14376x7fc1695;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLogoGroupView", "#render animatorOut onAnimationEnd");
        this.f323197a.f197843f.removeView(this.f323198b);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
