package sl1;

/* loaded from: classes5.dex */
public class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1228x636ee25.C12782xeed7bcb6 f490763d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1228x636ee25.C12782xeed7bcb6 c12782xeed7bcb6) {
        this.f490763d = c12782xeed7bcb6;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1228x636ee25.C12782xeed7bcb6 c12782xeed7bcb6 = this.f490763d;
        sl1.d dVar = c12782xeed7bcb6.f173296m;
        dVar.f490767d = floatValue;
        dVar.invalidateSelf();
        c12782xeed7bcb6.f173292f.setThumb(c12782xeed7bcb6.f173296m);
    }
}
