package mp5;

/* loaded from: classes9.dex */
public class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f412012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mp5.g f412013e;

    public f(mp5.g gVar, int i17) {
        this.f412013e = gVar;
        this.f412012d = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        mp5.g gVar = this.f412013e;
        if (gVar.f412015e.B != null) {
            gVar.f412015e.B.h4(this.f412012d - ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
