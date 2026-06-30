package rp4;

/* loaded from: classes10.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp4.f0 f480143d;

    public a0(rp4.f0 f0Var) {
        this.f480143d = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/video/VideoCompositionRemuxPlugin$initProgress$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancel remux job >> isActive: ");
        rp4.f0 f0Var = this.f480143d;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = f0Var.f480175t;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) : null);
        sb6.append(" progress: ");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2762x1410e13c.C22703xb395948f c22703xb395948f = f0Var.f480179x;
        sb6.append(c22703xb395948f != null ? java.lang.Integer.valueOf(c22703xb395948f.m82048x402effa3()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCompositionRemuxPlugin", sb6.toString());
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = f0Var.f480175t;
        if (r2Var2 != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var2).a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCompositionRemuxPlugin", "initProgress cancel");
            m55.c cVar = f0Var.f480176u;
            if (cVar != null) {
                ((m55.b) cVar).a();
            }
            p3325xe03a0797.p3326xc267989b.r2 r2Var3 = f0Var.f480175t;
            if (r2Var3 != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var3, null, 1, null);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2762x1410e13c.C22703xb395948f c22703xb395948f2 = f0Var.f480179x;
            if (c22703xb395948f2 != null) {
                c22703xb395948f2.m82049x3ae760af(0);
            }
            android.view.View view2 = f0Var.f480178w;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/video/VideoCompositionRemuxPlugin$initProgress$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/vlog/ui/video/VideoCompositionRemuxPlugin$initProgress$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ju3.d0 d0Var = f0Var.f480163e;
            if (d0Var != null) {
                ju3.d0.k(d0Var, ju3.c0.M2, null, 2, null);
            }
            f0Var.f480167i = true;
            f0Var.a(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/video/VideoCompositionRemuxPlugin$initProgress$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
