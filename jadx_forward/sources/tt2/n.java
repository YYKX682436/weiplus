package tt2;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f503495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f503496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f503497f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f503498g;

    public n(cm2.m0 m0Var, tt2.e1 e1Var, ut2.s3 s3Var, int i17) {
        this.f503495d = m0Var;
        this.f503496e = e1Var;
        this.f503497f = s3Var;
        this.f503498g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        r45.nt2 nt2Var;
        cm2.m0 m0Var = this.f503495d;
        boolean z18 = m0Var.G == 1;
        r45.dv1 dv1Var = ((mm2.f6) this.f503496e.f503415m.a(mm2.f6.class)).P;
        boolean z19 = (dv1Var == null || (nt2Var = (r45.nt2) dv1Var.m75936x14adae67(12)) == null || !nt2Var.m75933x41a8a7f2(2)) ? false : true;
        ut2.s3 s3Var = this.f503497f;
        android.view.ViewGroup.LayoutParams layoutParams = s3Var.N().getLayoutParams();
        jz5.g gVar = s3Var.f512615r;
        if (z18 || !z19) {
            s3Var.N().setPadding(0, 0, 0, 0);
            android.view.View view = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$bindAnchorActionBtn$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$bindAnchorActionBtn$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            layoutParams.width = -2;
        } else {
            java.lang.Integer num = 4;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(num, "<this>");
            int a17 = i65.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, ((num.floatValue() * 1.0f) * j65.f.g()) / 400);
            s3Var.N().setPadding(a17, 0, a17, 0);
            android.view.View view2 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$bindAnchorActionBtn$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$bindAnchorActionBtn$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            layoutParams.width = -2;
        }
        s3Var.N().setLayoutParams(layoutParams);
        boolean z27 = m0Var.k() == 1;
        tt2.e1 e1Var = this.f503496e;
        if (!zl2.r4.f555483a.w1()) {
            gk2.e eVar = gk2.e.f354004n;
            if (!(eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).T)) {
                z17 = false;
                e1Var.b0(z17, z18, z27, this.f503497f, this.f503498g, this.f503495d);
            }
        }
        z17 = true;
        e1Var.b0(z17, z18, z27, this.f503497f, this.f503498g, this.f503495d);
    }
}
