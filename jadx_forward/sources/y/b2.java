package y;

/* loaded from: classes16.dex */
public final class b2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi2.h f539846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y.d2 f539847e;

    public b2(mi2.h hVar, y.d2 d2Var) {
        this.f539846d = hVar;
        this.f539847e = d2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/moreaction/FinderLiveMicMoreActionWidget$MicConditionAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mi2.h hVar = this.f539846d;
        hVar.getClass();
        y.d2 d2Var = this.f539847e;
        if (!d2Var.f539862b) {
            java.util.Iterator it = hVar.f408288l1.iterator();
            while (it.hasNext()) {
                ((y.d2) it.next()).f539862b = false;
            }
            d2Var.f539862b = true;
            int i18 = (int) hVar.U;
            android.content.Context context = hVar.f199914d;
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.duu);
            java.lang.String str = d2Var.f539861a;
            int i19 = 2;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, string)) {
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c17;
                ml2.z4 z4Var = ml2.z4.f409919x;
                ml2.r2 r2Var = ml2.r2.f409429e;
                zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(4), null, 4, null);
                java.util.regex.Pattern pattern = pm0.v.f438335a;
                i17 = (i18 & (-5) & (-3) & (-129)) | 1;
            } else {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dur)) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mjd))) {
                    i95.m c18 = i95.n0.c(ml2.j0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                    zy2.zb zbVar2 = (zy2.zb) c18;
                    ml2.z4 z4Var2 = ml2.z4.f409919x;
                    ml2.r2 r2Var2 = ml2.r2.f409429e;
                    zy2.zb.y6(zbVar2, z4Var2, java.lang.String.valueOf(5), null, 4, null);
                    java.util.regex.Pattern pattern2 = pm0.v.f438335a;
                    i17 = (i18 & (-5) & (-2) & (-129)) | 2;
                    i19 = 3;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dup))) {
                    i95.m c19 = i95.n0.c(ml2.j0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                    zy2.zb zbVar3 = (zy2.zb) c19;
                    ml2.z4 z4Var3 = ml2.z4.f409919x;
                    ml2.r2 r2Var3 = ml2.r2.f409429e;
                    zy2.zb.y6(zbVar3, z4Var3, java.lang.String.valueOf(7), null, 4, null);
                    java.util.regex.Pattern pattern3 = pm0.v.f438335a;
                    i17 = (i18 & (-2) & (-3) & (-129)) | 4;
                    i19 = 4;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lz6))) {
                    java.util.regex.Pattern pattern4 = pm0.v.f438335a;
                    i17 = (i18 & (-2) & (-3) & (-5)) | 128;
                    i19 = 5;
                } else {
                    i95.m c27 = i95.n0.c(ml2.j0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
                    zy2.zb zbVar4 = (zy2.zb) c27;
                    ml2.z4 z4Var4 = ml2.z4.f409919x;
                    ml2.r2 r2Var4 = ml2.r2.f409429e;
                    zy2.zb.y6(zbVar4, z4Var4, java.lang.String.valueOf(3), null, 4, null);
                    java.util.regex.Pattern pattern5 = pm0.v.f438335a;
                    i17 = i18 & (-5) & (-2) & (-3) & (-129);
                    i19 = 1;
                }
            }
            fj2.s.c(fj2.s.f344716a, ml2.q2.A, java.lang.String.valueOf(i19), null, 0, 0, 28, null);
            hVar.U = i17;
            hVar.V = true;
            ((y.c2) ((jz5.n) hVar.f408294p1).mo141623x754a37bb()).m8146xced61ae5();
            hVar.W(hVar.U);
            hVar.R(hVar.U);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/moreaction/FinderLiveMicMoreActionWidget$MicConditionAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
