package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public final class v0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.f2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f171695a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 f171696b;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.b0 b0Var) {
        this.f171696b = c12723x5ab2de90;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.f2
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 c1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1) k3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 c11712x63ef1ef4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) obj;
        c1Var.f171580f.setVisibility(8);
        android.view.View view = c1Var.f171578d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentProvider", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem;Lcom/tencent/mm/plugin/appbrand/appusage/AppBrandRecentTaskInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentProvider", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem;Lcom/tencent/mm/plugin/appbrand/appusage/AppBrandRecentTaskInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c1Var.f171579e.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11712x63ef1ef4.f157889x) ? c11712x63ef1ef4.f157888w.replaceFirst("@app", "") : c11712x63ef1ef4.f157889x);
        d(c1Var, c11712x63ef1ef4.A, c11712x63ef1ef4.f157903p, c11712x63ef1ef4.f157905r ? c11712x63ef1ef4.f157906s : "");
        b(c1Var, c11712x63ef1ef4.f157890y);
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p.a(c11712x63ef1ef4.A);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17);
        android.widget.TextView textView = c1Var.f171581g;
        if (K0) {
            textView.setVisibility(8);
        } else {
            textView.setText(a17);
            textView.setVisibility(0);
        }
        c(c1Var);
        boolean b17 = ne.s.b(c11712x63ef1ef4.D, 6);
        android.widget.ImageView imageView = c1Var.f171585n;
        if (b17) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.relievedbuy, 0) == 1) {
                imageView.setVisibility(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ae.a(imageView);
                return;
            }
        }
        if (!ne.s.a(c11712x63ef1ef4.F, 6)) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vd.a(imageView);
        }
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 c1Var, java.lang.String str) {
        boolean z17 = this.f171696b.L;
        ((java.util.HashMap) this.f171695a).put(str, l01.d0.f396294a.b(c1Var.f171583i, str, l01.a.h(), l01.q0.f396320d));
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 c1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90 = this.f171696b;
        if (c12723x5ab2de90.f171546w.u0(c1Var.f3639x46306858) == c12723x5ab2de90.f171549y.mo1894x7e414b06() - 1) {
            android.view.View view = c1Var.f171578d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentProvider", "applyCommonInconsistent", "(Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentProvider", "applyCommonInconsistent", "(Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = c1Var.f171578d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentProvider", "applyCommonInconsistent", "(Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentProvider", "applyCommonInconsistent", "(Lcom/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList$RecentsItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean z17 = c12723x5ab2de90.f171536n;
        android.widget.TextView textView = c1Var.f171582h;
        if (!z17) {
            textView.setVisibility(8);
        } else {
            textView.setText(java.lang.String.valueOf(c12723x5ab2de90.f171546w.u0(c1Var.f3639x46306858)));
            textView.setVisibility(0);
        }
    }

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 c1Var, int i17, long j17, java.lang.String str) {
        c1Var.f171580f.setVisibility(8);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = c1Var.f171586o;
        c22699x3dcdb352.setVisibility(8);
        c1Var.f171583i.setColorFilter((android.graphics.ColorFilter) null);
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        android.widget.TextView textView = c1Var.f171580f;
        textView.setVisibility(0);
        c22699x3dcdb352.setVisibility(0);
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f78488xf9c84813);
        c22699x3dcdb352.m82040x7541828(this.f171696b.m7460x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj));
        textView.setText(str);
    }
}
