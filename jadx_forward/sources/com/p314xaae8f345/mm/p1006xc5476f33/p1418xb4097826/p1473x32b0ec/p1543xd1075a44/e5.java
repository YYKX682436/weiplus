package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class e5 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh f199759a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cf f199760b;

    public e5(android.app.Activity activity, android.view.ViewGroup container, gk2.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh bhVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh(activity);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58104xb7f4f95a = bhVar.m58104xb7f4f95a();
        if (m58104xb7f4f95a != null) {
            bhVar.a(m58104xb7f4f95a);
        }
        this.f199759a = bhVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cf cfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cf(activity, eVar);
        cfVar.f199536J = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d5(cfVar, this);
        this.f199760b = cfVar;
    }

    public final void a(int i17, boolean z17) {
        android.widget.EditText editText;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh bhVar = this.f199759a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ei eiVar = bhVar.M;
        if (eiVar != null && !z17) {
            eiVar.f199789o.clearFocus();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ri riVar = bhVar.N;
        if (riVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ei eiVar2 = riVar.f201177o;
            if (eiVar2 != null && !z17) {
                eiVar2.f199789o.clearFocus();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xh xhVar = riVar.f201178p;
            if (xhVar != null) {
                android.view.View view = xhVar.f201863p;
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (i17 <= 0 || !z17) {
                    if (marginLayoutParams != null) {
                        marginLayoutParams.bottomMargin = 0;
                    }
                } else if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = i17;
                }
                view.setLayoutParams(marginLayoutParams);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cf cfVar = this.f199760b;
        android.view.View view2 = cfVar.L;
        android.view.ViewGroup.LayoutParams layoutParams2 = view2 != null ? view2.getLayoutParams() : null;
        android.widget.LinearLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams2 : null;
        if (i17 > com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz)) {
            if (layoutParams3 != null) {
                layoutParams3.bottomMargin = i17 - com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            }
        } else if (layoutParams3 != null) {
            layoutParams3.bottomMargin = i17;
        }
        android.view.View view3 = cfVar.L;
        android.view.ViewParent parent = view3 != null ? view3.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.updateViewLayout(cfVar.L, layoutParams3);
        }
        if (z17 || (editText = cfVar.Q) == null) {
            return;
        }
        editText.clearFocus();
    }

    public final void b() {
        android.app.Activity activity;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh bhVar = this.f199759a;
        if (bhVar != null) {
            java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
            if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
                java.lang.ref.WeakReference j17 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
                activity = j17 != null ? (android.app.Activity) j17.get() : null;
            }
            if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.w0) {
                activity.finish();
            }
            db5.t7.i(bhVar.getContext(), bhVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lv8), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
            if (bhVar.S) {
                android.view.View view = bhVar.B;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "onSuperFansUpgradeSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "onSuperFansUpgradeSuccess", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                bhVar.f199412J.setVisibility(0);
            }
        }
    }
}
