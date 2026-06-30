package zi4;

/* loaded from: classes11.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.n0 f554770d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(zi4.n0 n0Var) {
        super(0);
        this.f554770d = n0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.animation.ObjectAnimator objectAnimator;
        zi4.n0 n0Var = this.f554770d;
        java.lang.ref.WeakReference weakReference = n0Var.f554714e;
        java.lang.Object obj = weakReference != null ? (android.content.Context) weakReference.get() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18654x831dd7b0 activityC18654x831dd7b0 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18654x831dd7b0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18654x831dd7b0) obj : null;
        if (activityC18654x831dd7b0 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusNewActivity", "doExitAnim: ");
            if (!activityC18654x831dd7b0.isDestroyed() && (objectAnimator = activityC18654x831dd7b0.f255187v) != null) {
                objectAnimator.reverse();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(n0Var.f554774g, "handleRequest: " + activityC18654x831dd7b0);
        return jz5.f0.f384359a;
    }
}
