package zl2;

/* loaded from: classes8.dex */
public final class q implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f555457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f555458e;

    public q(java.util.LinkedList linkedList, yz5.p pVar, float f17) {
        this.f555457d = linkedList;
        this.f555458e = pVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        java.util.LinkedList<zl2.n> linkedList = this.f555457d;
        java.util.Iterator it6 = linkedList.iterator();
        while (true) {
            boolean z17 = false;
            if (!it6.hasNext()) {
                break;
            }
            zl2.n nVar = (zl2.n) it6.next();
            zl2.o oVar = nVar.f555429c;
            boolean z18 = oVar.f555438b != oVar.f555439c;
            android.view.View view = nVar.f555427a;
            if (z18) {
                view.getLayoutParams().height = (int) (nVar.f555429c.f555438b + ((r5.f555439c - r7) * floatValue));
                z17 = true;
            }
            nVar.f555430d.getClass();
            if (z17) {
                view.requestLayout();
            }
        }
        yz5.p pVar = this.f555458e;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Float.valueOf(floatValue), java.lang.Boolean.valueOf(floatValue == 1.0f));
        }
        if (floatValue == 1.0f) {
            for (zl2.n nVar2 : linkedList) {
                if (nVar2.f555428b) {
                    zl2.o oVar2 = nVar2.f555429c;
                    if (oVar2.f555438b != oVar2.f555439c) {
                        nVar2.f555427a.post(new zl2.p(nVar2));
                    }
                    nVar2.f555430d.getClass();
                }
            }
        }
    }
}
