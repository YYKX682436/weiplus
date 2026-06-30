package ry2;

/* loaded from: classes10.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.y f483032d;

    public w(ry2.y yVar) {
        this.f483032d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/widget/post/PostMixMediaWidget$showVideoThumb$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ry2.y yVar = this.f483032d;
        yVar.getClass();
        r45.kb4 kb4Var = new r45.kb4();
        java.util.ArrayList arrayList2 = yVar.f483044v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList2);
        int i17 = 0;
        for (java.lang.Object obj : arrayList2) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            kb4Var.m75941xfb821914(0).add(yVar.o(i17, (java.lang.String) obj));
            i17 = i18;
        }
        android.content.Intent intent = new android.content.Intent();
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17;
        android.content.Context context = yVar.f482907d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.Qj(i0Var, (android.app.Activity) context, intent, kb4Var, null, false, false, 48, null);
        hc2.p0.d(yVar.p(), "video_cover", "view_clk", null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/widget/post/PostMixMediaWidget$showVideoThumb$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
