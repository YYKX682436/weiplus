package u4;

/* loaded from: classes13.dex */
public class k extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f506039d;

    public k(p012xc85e97e9.p112x993b6d55.C1174x257a2215 c1174x257a2215, android.view.View view) {
        this.f506039d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.w0.c(this.f506039d, null);
    }
}
