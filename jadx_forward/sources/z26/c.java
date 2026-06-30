package z26;

/* loaded from: classes15.dex */
public class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab f551362d;

    public c(me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab c29141x858f5ab) {
        this.f551362d = c29141x858f5ab;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab c29141x858f5ab = this.f551362d;
        if (c29141x858f5ab.f407421g == null) {
            return;
        }
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = c29141x858f5ab.f407426o;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        java.util.Iterator it = c29141x858f5ab.f407426o.iterator();
        while (it.hasNext()) {
            ((z26.e) it.next()).c(c29141x858f5ab.f407421g, c29141x858f5ab.f407424m + ((int) c29141x858f5ab.C), c29141x858f5ab.f407425n + ((int) floatValue));
        }
    }
}
