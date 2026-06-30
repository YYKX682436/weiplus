package qs3;

/* loaded from: classes15.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7 f447939d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7 c16953xeaa414a7) {
        this.f447939d = c16953xeaa414a7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16954x37c15e44 m67826x9fd65ab4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16954x37c15e44 m67826x9fd65ab42;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/radar/ui/RadarViewController$mOnQuitActionButtonListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7 c16953xeaa414a7 = this.f447939d;
        if (c16953xeaa414a7.getRadarStatus() == ps3.r.f439653d || c16953xeaa414a7.getRadarStatus() == ps3.r.f439654e) {
            android.content.Context context = c16953xeaa414a7.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((android.app.Activity) context).finish();
        } else {
            qs3.p0 p0Var = c16953xeaa414a7.f236578q;
            if (p0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (r45.oi5 oi5Var : p0Var.f447908e) {
                if (oi5Var != null) {
                    linkedList.add(oi5Var);
                }
            }
            if (c16953xeaa414a7.f(linkedList)) {
                m67826x9fd65ab4 = c16953xeaa414a7.m67826x9fd65ab4();
                m67826x9fd65ab4.a();
                m67826x9fd65ab42 = c16953xeaa414a7.m67826x9fd65ab4();
                m67826x9fd65ab42.setVisibility(0);
                ps3.w wVar = c16953xeaa414a7.f236576o;
                if (wVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("radarManager");
                    throw null;
                }
                wVar.f();
                c16953xeaa414a7.s(ps3.r.f439654e);
            } else {
                c16953xeaa414a7.s(ps3.r.f439653d);
            }
            qs3.p0 p0Var2 = c16953xeaa414a7.f236578q;
            if (p0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            p0Var2.a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/radar/ui/RadarViewController$mOnQuitActionButtonListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
