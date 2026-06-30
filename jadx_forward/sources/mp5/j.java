package mp5;

/* loaded from: classes9.dex */
public class j implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f412019a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 f412020b;

    public j(com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223, boolean z17) {
        this.f412020b = c22894x55bf3223;
        this.f412019a = z17;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        mp5.i iVar = new mp5.i(this);
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f412020b;
        c22894x55bf3223.post(iVar);
        c22894x55bf3223.m82974x98a9210(c22894x55bf3223.f295352w.getHeight());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f412020b;
        c22894x55bf3223.f295352w.setVisibility(0);
        if (this.f412019a) {
            c22894x55bf3223.f295347r.setVisibility(0);
        } else {
            c22894x55bf3223.f295347r.setVisibility(4);
        }
    }
}
