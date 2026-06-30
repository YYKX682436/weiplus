package zi4;

/* loaded from: classes11.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.l0 f554765d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(zi4.l0 l0Var) {
        super(0);
        this.f554765d = l0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.animation.ObjectAnimator objectAnimator;
        zi4.l0 l0Var = this.f554765d;
        java.lang.ref.WeakReference weakReference = l0Var.f554714e;
        java.lang.Object obj = weakReference != null ? (android.content.Context) weakReference.get() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18654x831dd7b0 activityC18654x831dd7b0 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18654x831dd7b0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18654x831dd7b0) obj : null;
        if (activityC18654x831dd7b0 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusNewActivity", "doEnterAnim: ");
            if (!activityC18654x831dd7b0.isFinishing() && !activityC18654x831dd7b0.isDestroyed() && (objectAnimator = activityC18654x831dd7b0.f255187v) != null) {
                objectAnimator.start();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.f554767g, "handleRequest: " + activityC18654x831dd7b0);
        return jz5.f0.f384359a;
    }
}
