package rc5;

/* loaded from: classes5.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc5.x f475722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475723e;

    public r(rc5.x xVar, int i17) {
        this.f475722d = xVar;
        this.f475723e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rc5.m mVar;
        java.lang.ref.WeakReference weakReference = this.f475722d.A;
        if (weakReference == null || (mVar = (rc5.m) weakReference.get()) == null) {
            return;
        }
        boolean z17 = mVar.f475715u;
        int i17 = this.f475723e;
        if (z17) {
            mVar.getLayoutParams().height = i17;
        } else {
            mVar.f475704g = i17;
            int i18 = (int) (i17 * mVar.f475701d);
            mVar.f475706i = i18;
            mVar.f475707m = (int) (i18 * mVar.f475702e);
            android.view.ViewGroup.LayoutParams layoutParams = mVar.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            layoutParams2.height = mVar.f475706i;
            layoutParams2.gravity = 80;
            mVar.setLayoutParams(layoutParams2);
        }
        mVar.invalidate();
        jz5.g gVar = rc5.x.D;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExpandableHalfScreenChattingUIC", "curHeight: " + i17 + " mFullScreenHeight: " + mVar.f475704g + ", mCollapsedScreenHeight: " + mVar.f475706i);
    }
}
