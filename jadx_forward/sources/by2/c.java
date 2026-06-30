package by2;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final by2.c f117901a = new by2.c();

    public static void a(by2.c cVar, android.view.View view, int i17, long j17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            j17 = 200;
        }
        cVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        float f17 = i17 == 0 ? 0.0f : 1.0f;
        float f18 = i17 == 0 ? 1.0f : 0.0f;
        if (view.getVisibility() == i17) {
            return;
        }
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setFloatValues(f17, f18);
        valueAnimator.setInterpolator(new android.view.animation.LinearInterpolator());
        valueAnimator.setDuration(j17);
        valueAnimator.addUpdateListener(new by2.a(view));
        valueAnimator.addListener(new by2.b(view, f18, i17));
        valueAnimator.start();
    }

    public final java.util.List b(android.view.View view, java.lang.Integer num, yz5.p pVar) {
        kz5.p0 p0Var = kz5.p0.f395529d;
        if (view == null || num == null) {
            return p0Var;
        }
        num.intValue();
        int intValue = num.intValue();
        java.util.HashSet hashSet = new java.util.HashSet();
        if ((intValue & 2) != 0) {
            hashSet.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.g1y));
            hashSet.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.chy));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            android.view.View findViewById = view.findViewById(((java.lang.Number) it.next()).intValue());
            if (findViewById != null) {
                arrayList.add(findViewById);
            }
        }
        if (pVar != null) {
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                pVar.mo149xb9724478(this, (android.view.View) it6.next());
            }
        }
        return arrayList;
    }
}
