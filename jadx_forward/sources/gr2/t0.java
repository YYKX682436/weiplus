package gr2;

/* loaded from: classes2.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f356361a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14574x58a132b4 f356362b;

    /* renamed from: c, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff f356363c;

    /* JADX WARN: Type inference failed for: r2v2, types: [com.tencent.mm.plugin.finder.nearby.ui.special.view.ThemeTagListWidget$themeTagChangEvent$1] */
    public t0(final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, float f17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f356361a = context;
        this.f356362b = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5685xa20ebe4d>(context) { // from class: com.tencent.mm.plugin.finder.nearby.ui.special.view.ThemeTagListWidget$themeTagChangEvent$1
            {
                this.f39173x3fe91575 = 1093141053;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5685xa20ebe4d c5685xa20ebe4d) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5685xa20ebe4d event = c5685xa20ebe4d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive themeTagChangEvent: ");
                am.bj bjVar = event.f136011g;
                sb6.append(bjVar != null ? java.lang.Integer.valueOf(bjVar.f87790a) : null);
                sb6.append(" pos: ");
                sb6.append(bjVar != null ? java.lang.Integer.valueOf(bjVar.f87791b) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ThemeTagListWidget", sb6.toString());
                if (bjVar.f87790a != 2) {
                    return false;
                }
                int i18 = bjVar.f87791b;
                gr2.t0 t0Var = gr2.t0.this;
                t0Var.getClass();
                pm0.v.X(new gr2.s0(i18, t0Var));
                return true;
            }
        };
    }

    public final void a(android.app.Activity context, java.util.ArrayList data) {
        oa.i k17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        android.view.View findViewById = context.findViewById(com.p314xaae8f345.mm.R.id.nva);
        this.f356363c = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) context.findViewById(com.p314xaae8f345.mm.R.id.nv8);
        if (data.size() <= 0) {
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/special/view/ThemeTagListWidget", "onBindData", "(Landroid/app/Activity;Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/ui/special/view/ThemeTagListWidget", "onBindData", "(Landroid/app/Activity;Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (findViewById != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/special/view/ThemeTagListWidget", "onBindData", "(Landroid/app/Activity;Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/ui/special/view/ThemeTagListWidget", "onBindData", "(Landroid/app/Activity;Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f356363c;
        if (c2718xca2902ff != null) {
            int i17 = 0;
            for (java.lang.Object obj : data) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                gr2.q0 q0Var = new gr2.q0(this.f356361a, c2718xca2902ff.l());
                java.lang.String m75945x2fec8307 = ((zq2.e) obj).f556565d.m75945x2fec8307(0);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                android.widget.TextView textView = q0Var.f356351c;
                if (textView != null) {
                    textView.setText(m75945x2fec8307);
                }
                q0Var.f356353e = i17;
                int size = data.size();
                android.content.Context context2 = q0Var.f356349a;
                int b17 = i65.a.b(context2, 4);
                int b18 = i65.a.b(context2, 8);
                int b19 = i65.a.b(context2, 4);
                int b27 = i65.a.b(context2, 8);
                int i19 = q0Var.f356353e;
                if (i19 == 0) {
                    b17 = i65.a.b(context2, 24);
                } else if (i19 == size - 1) {
                    b19 = i65.a.b(context2, 24);
                }
                oa.i iVar = q0Var.f356350b;
                oa.k kVar = iVar.f425318h;
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                n3.v0.k(kVar, b17, b18, b19, b27);
                c2718xca2902ff.d(iVar, false);
                i17 = i18;
            }
            c2718xca2902ff.a(new gr2.r0());
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff2 = this.f356363c;
            if (c2718xca2902ff2 != null && (k17 = c2718xca2902ff2.k(0)) != null && !k17.a()) {
                k17.b();
            }
        }
        mo48813x58998cd();
    }
}
