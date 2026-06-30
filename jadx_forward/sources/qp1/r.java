package qp1;

/* loaded from: classes14.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f447270a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.ViewGroup f447271b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f447272c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f447273d;

    public r(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f447272c = new java.util.ArrayList();
        this.f447270a = context;
    }

    public final void a(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12912x4d989216 c12912x4d989216 = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12912x4d989216) kz5.n0.a0(this.f447272c, i17);
        if (c12912x4d989216 == null) {
            return;
        }
        c12912x4d989216.setVisibility(z17 ? 0 : 8);
    }

    public final void b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12912x4d989216 c12912x4d989216 = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12912x4d989216) kz5.n0.a0(this.f447272c, i17);
        java.util.List list = this.f447273d;
        if (list == null || !qp1.w.a(list)) {
            return;
        }
        java.util.List list2 = this.f447273d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list2);
        if (list2.size() > i17) {
            java.util.List list3 = this.f447273d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = list3 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) kz5.n0.a0(list3, i17) : null;
            if (c12886x91aa2b6d == null) {
                return;
            }
            int p17 = qp1.w.p(c12886x91aa2b6d);
            if (-1 != p17) {
                m95.a aVar = new m95.a();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, p17)) {
                    android.content.Context context = this.f447270a;
                    if (aVar.g(context.getResources(), p17)) {
                        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(p17);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(drawable, "getDrawable(...)");
                        if (c12912x4d989216 != null) {
                            c12912x4d989216.setImageDrawable(drawable);
                        }
                    }
                }
                if (c12912x4d989216 != null) {
                    c12912x4d989216.setImageResource(p17);
                }
                android.graphics.drawable.Drawable drawable2 = c12912x4d989216 != null ? c12912x4d989216.getDrawable() : null;
                if (drawable2 instanceof android.graphics.drawable.AnimationDrawable) {
                    ((android.graphics.drawable.AnimationDrawable) drawable2).start();
                }
            } else {
                android.graphics.drawable.Drawable drawable3 = c12886x91aa2b6d.f174594v;
                if (drawable3 != null) {
                    if (c12912x4d989216 != null) {
                        c12912x4d989216.setImageDrawable(drawable3);
                    }
                    if (drawable3 instanceof android.graphics.drawable.AnimationDrawable) {
                        ((android.graphics.drawable.AnimationDrawable) drawable3).start();
                    }
                }
            }
            long j17 = c12886x91aa2b6d.A;
            if (j17 >= 0) {
                if (c12912x4d989216 != null) {
                    c12912x4d989216.m54085x3ae760af(j17);
                }
            } else if (c12912x4d989216 != null) {
                c12912x4d989216.m54085x3ae760af(-2147483648L);
            }
        }
    }
}
