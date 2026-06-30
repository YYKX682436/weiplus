package z63;

/* loaded from: classes5.dex */
public class g0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f551946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab f551947e;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017) {
        this.f551947e = activityC16081x2d23fdab;
        this.f551946d = c22621x7603e017;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab;
        android.view.View view2;
        if (!z17 || (view2 = (activityC16081x2d23fdab = this.f551947e).f223766v) == null || !activityC16081x2d23fdab.G) {
            this.f551946d.mo81549xf579a34a(0);
        } else {
            view2.postDelayed(new z63.e0(this), 200L);
            activityC16081x2d23fdab.f223766v.postDelayed(new z63.f0(this), 200L);
        }
    }
}
