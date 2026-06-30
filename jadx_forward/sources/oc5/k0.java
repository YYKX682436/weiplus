package oc5;

/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final oc5.k0 f425978a = new oc5.k0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f425979b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f425980c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f425981d = new java.util.HashMap();

    public static final void c() {
        java.util.HashMap hashMap = f425981d;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) ((java.util.Map.Entry) it.next()).getValue();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
        }
        hashMap.clear();
        f425979b.clear();
        f425980c.clear();
    }

    public final void a(android.view.View view, boolean z17) {
        java.lang.Boolean bool = (java.lang.Boolean) f425980c.get(java.lang.Integer.valueOf(view.hashCode()));
        if (bool == null) {
            bool = java.lang.Boolean.FALSE;
        }
        if (bool.booleanValue()) {
            f425979b.put(java.lang.Integer.valueOf(view.hashCode()), java.lang.Integer.valueOf(z17 ? 1 : 0));
        } else {
            b(view, z17);
        }
    }

    public final void b(android.view.View view, boolean z17) {
        f425980c.put(java.lang.Integer.valueOf(view.hashCode()), java.lang.Boolean.TRUE);
        float f17 = z17 ? 0.0f : 1.0f;
        float f18 = z17 ? 1.0f : 0.0f;
        java.util.HashMap hashMap = f425981d;
        android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) hashMap.get(java.lang.Integer.valueOf(view.hashCode()));
        if (valueAnimator == null) {
            valueAnimator = new android.animation.ValueAnimator();
            hashMap.put(java.lang.Integer.valueOf(view.hashCode()), valueAnimator);
        }
        view.getResources().getResourceEntryName(view.getId());
        valueAnimator.removeAllListeners();
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.setFloatValues(f17, f18);
        valueAnimator.setInterpolator(new android.view.animation.LinearInterpolator());
        valueAnimator.setDuration(150L);
        valueAnimator.addUpdateListener(new oc5.i0(view));
        valueAnimator.addListener(new oc5.j0(view, z17));
        valueAnimator.start();
    }
}
