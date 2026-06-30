package oj5;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj5.r f427375d;

    public f(oj5.r rVar) {
        this.f427375d = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oj5.r rVar = this.f427375d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = rVar.f427411a;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        boolean b17 = n3.x0.b(c1163xf1deaba4);
        java.lang.String str = rVar.f427412b;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = rVar.f427411a;
        if (b17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[doOnAttach] " + c1163xf1deaba42.getContext());
            c1163xf1deaba42.m7971xa810ec34(rVar.f427416f);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba42.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.m8091xc21abdf5(false);
            }
        } else {
            c1163xf1deaba4.addOnAttachStateChangeListener(new oj5.d(c1163xf1deaba4, rVar));
        }
        if (n3.x0.b(c1163xf1deaba42)) {
            c1163xf1deaba42.addOnAttachStateChangeListener(new oj5.e(c1163xf1deaba42, rVar));
            return;
        }
        java.util.Iterator it = oj5.x.b(c1163xf1deaba42).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            android.view.View itemView = k3Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            oj5.r.a(rVar, itemView);
            android.view.View itemView2 = k3Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
            rVar.c(itemView2, true);
        }
        rVar.f427415e.clear();
        int[] b18 = rVar.b();
        int i17 = b18[0];
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[doOnDetach] " + kz5.z.x0(b18) + " hitRate=" + a06.d.b((i17 * 100.0f) / (1 < i17 + b18[1] ? r1 : 1)) + '%');
        java.util.HashMap hashMap = oj5.r.f427410h;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba42.mo7946xf939df19();
        hashMap.remove(java.lang.Integer.valueOf(mo7946xf939df19 != null ? mo7946xf939df19.hashCode() : 0));
    }
}
