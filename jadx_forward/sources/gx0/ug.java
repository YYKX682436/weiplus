package gx0;

/* loaded from: classes5.dex */
public final class ug implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bh f358575d;

    public ug(gx0.bh bhVar) {
        this.f358575d = bhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a InvalidTime;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC$initTimelineToolbarListener$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gx0.w8 a76 = this.f358575d.a7();
        ex0.a0 a0Var = a76.W6().f358175r;
        if (a0Var != null) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4138x497e15e7 c4138x497e15e7 = a0Var.f338624a;
            if (c4138x497e15e7.a()) {
                yy0.m7 m7Var = (yy0.m7) a76.R6().O6();
                p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.v3(m7Var, null), 3, null);
                if (c4138x497e15e7.a()) {
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.C4169xe31f3fd3 g17 = c4138x497e15e7.g();
                    if (g17 == null || (c4128x879fba0a = g17.m34260xf0d14e77()) == null) {
                        c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
                    }
                    if (g17 == null) {
                        InvalidTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(InvalidTime, "InvalidTime");
                    } else {
                        a0Var.Q(g17, cx0.a.f306027e);
                        a0Var.S();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4128x879fba0a);
                        InvalidTime = c4128x879fba0a;
                    }
                } else {
                    InvalidTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(InvalidTime, "InvalidTime");
                }
                if (InvalidTime.m33983x7b953cf2()) {
                    p3325xe03a0797.p3326xc267989b.l.d(a76.m158345xefc66565(), null, null, new gx0.k5(a76, a0Var, InvalidTime, null), 3, null);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC$initTimelineToolbarListener$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
