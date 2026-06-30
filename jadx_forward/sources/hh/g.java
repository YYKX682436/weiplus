package hh;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f362974a = new java.util.HashMap();

    public final int a(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "viewGroup");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.util.HashMap hashMap = this.f362974a;
        java.lang.Integer num = (java.lang.Integer) hashMap.get(view);
        if (num != null && num.intValue() == i17) {
            return -2;
        }
        hashMap.put(view, java.lang.Integer.valueOf(i17));
        int childCount = viewGroup.getChildCount();
        boolean z17 = false;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            java.lang.Object obj = hashMap.get(viewGroup.getChildAt(i19));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            if (i17 < ((java.lang.Number) obj).intValue()) {
                z17 = true;
                i18 = i19;
            }
        }
        if (z17) {
            return i18;
        }
        return -1;
    }
}
