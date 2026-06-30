package th;

/* loaded from: classes14.dex */
public class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f500767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ th.d f500768e;

    public c(th.d dVar, android.view.View view) {
        this.f500768e = dVar;
        this.f500767d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        th.d dVar = this.f500768e;
        android.view.View view = dVar.f500776n.f500800e;
        if (view == null || view.hashCode() != dVar.f500775m) {
            return;
        }
        dVar.f500773h.x = ((java.lang.Integer) valueAnimator.getAnimatedValue("trans")).intValue();
        dVar.f500774i.updateViewLayout(this.f500767d, dVar.f500773h);
    }
}
