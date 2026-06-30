package ok;

/* loaded from: classes10.dex */
public class k implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ok.m f427472d;

    public k(ok.m mVar) {
        this.f427472d = mVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue("deltaY")).floatValue();
        float floatValue2 = ((java.lang.Float) valueAnimator.getAnimatedValue("deltaX")).floatValue();
        ok.m mVar = this.f427472d;
        float f17 = mVar.f427479h;
        dl.y yVar = mVar.f427474c;
        float f18 = floatValue2 - mVar.f427480i;
        float f19 = floatValue - mVar.f427479h;
        java.lang.String str = mVar.f427476e;
        um.g gVar = (um.g) yVar.d();
        if (gVar != null) {
            java.util.ListIterator f27 = gVar.f();
            while (true) {
                if (!f27.hasPrevious()) {
                    break;
                }
                xk0.f fVar = (xk0.f) f27.previous();
                if (fVar.q().equals(str)) {
                    fVar.y(f18, f19, fVar.f536490o, fVar.f536489n);
                    yVar.r();
                    break;
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmojiAndTextArtist", "cache is null!");
        }
        mVar.f427479h = floatValue;
        mVar.f427480i = floatValue2;
    }
}
