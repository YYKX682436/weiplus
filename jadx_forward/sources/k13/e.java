package k13;

/* loaded from: classes10.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.g f384737d;

    public e(k13.g gVar) {
        this.f384737d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k13.g gVar = this.f384737d;
        if (gVar.f384745f) {
            return;
        }
        gVar.f384746g = com.p314xaae8f345.mm.ui.bk.C();
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(gVar.b()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bbj, (android.view.ViewGroup) null);
        gVar.f384744e = inflate;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        k13.l1 l1Var = (k13.l1) gVar;
        android.view.View view = l1Var.f384744e;
        l1Var.f384769n = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) (view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.m8z) : null);
        android.view.View view2 = l1Var.f384744e;
        l1Var.f384770o = view2 != null ? view2.findViewById(com.p314xaae8f345.mm.R.id.mqi) : null;
        android.view.View view3 = l1Var.f384744e;
        l1Var.f384771p = view3 != null ? view3.findViewById(com.p314xaae8f345.mm.R.id.d0_) : null;
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.type = fp.h.c(26) ? 2038 : 2002;
        layoutParams.format = -2;
        layoutParams.packageName = gVar.b().getPackageName();
        layoutParams.gravity = 48;
        layoutParams.flags = 1064;
        layoutParams.horizontalMargin = gVar.b().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        layoutParams.width = -1;
        layoutParams.height = -2;
        android.view.View view4 = gVar.f384744e;
        if (view4 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/forcenotify/ui/BaseWindow$show$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/forcenotify/ui/BaseWindow$show$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        try {
            ((android.view.WindowManager) ((jz5.n) gVar.f384748i).mo141623x754a37bb()).addView(gVar.f384744e, layoutParams);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ForceNotify.BaseWindow", "attach to window failed!");
        }
        android.view.View view5 = l1Var.f384744e;
        if (view5 != null) {
            view5.setFocusableInTouchMode(true);
        }
        android.view.View view6 = l1Var.f384744e;
        if (view6 != null) {
            view6.setOnKeyListener(l1Var);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = l1Var.f384769n;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.m7964x8d4ad49c(null);
        }
        java.util.ArrayList arrayList2 = l1Var.f384772q;
        i13.c cVar = (i13.c) kz5.n0.k0(arrayList2);
        if (cVar == null || cVar.h() != -1) {
            arrayList2.add(i13.i.f368827h);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (((i13.c) next).h() != -1) {
                arrayList3.add(next);
            }
        }
        arrayList2.removeAll(arrayList3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.p1713x373aa5.C15566x578e2f9b c15566x578e2f9b = new com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.p1713x373aa5.C15566x578e2f9b(2, i65.a.b(l1Var.b(), 8), 0.1f, true, new k13.w0(l1Var));
        l1Var.f384768m = c15566x578e2f9b;
        k13.t0 animator = l1Var.H;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        java.util.ArrayList arrayList4 = (java.util.ArrayList) c15566x578e2f9b.f218899s;
        if (!arrayList4.contains(animator)) {
            arrayList4.add(animator);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = l1Var.f384769n;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.mo7967x900dcbe1(l1Var.f384768m);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = l1Var.f384769n;
        if (c1163xf1deaba43 != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.forcenotify.ui.MsgWindow$onShowWindow$2
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return type != -1 ? type != 0 ? type != 1 ? type != 2 ? type != 3 ? type != 5 ? new g13.c() : new g13.h() : new g13.d() : new g13.c() : new g13.f() : new g13.g() : new g13.e();
                }
            }, arrayList2, false);
            c22848x6ddd90cf.f374638o = new k13.y0(c22848x6ddd90cf, l1Var);
            c1163xf1deaba43.mo7960x6cab2c8d(c22848x6ddd90cf);
        }
        android.view.View view7 = l1Var.f384770o;
        if (view7 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "onShowWindow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow", "onShowWindow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = l1Var.f384769n;
        if (c1163xf1deaba44 != null) {
            c1163xf1deaba44.post(new k13.z0(arrayList3, l1Var));
        }
        gVar.f384745f = true;
    }
}
