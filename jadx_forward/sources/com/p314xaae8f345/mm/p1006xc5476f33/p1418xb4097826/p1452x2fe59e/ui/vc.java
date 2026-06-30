package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class vc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd f192181d;

    public vc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd kdVar) {
        this.f192181d = kdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd kdVar = this.f192181d;
        if (((java.lang.Boolean) ((jz5.n) kdVar.P).mo141623x754a37bb()).booleanValue()) {
            android.content.Context context = kdVar.f199716e;
            boolean z17 = false;
            kdVar.F1 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 0, 2);
            android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570451au1, null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567253ir5);
            textView.setText(inflate.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d9o));
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567250ir2);
            if (findViewById != null) {
                findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.gd(kdVar));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = kdVar.F1;
            if (z2Var != null) {
                z2Var.s(inflate);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4(context, null);
            c1163xf1deaba4.m7963x830bc99d(true);
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba4.getContext(), 1, false));
            rm2.d dVar = new rm2.d();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.lang.String string = c1163xf1deaba4.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d8r);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String string2 = c1163xf1deaba4.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d8s);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            rm2.a aVar = new rm2.a(string, string2, 1, false);
            java.lang.String string3 = c1163xf1deaba4.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d8t);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            java.lang.String string4 = c1163xf1deaba4.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d8w);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
            rm2.a aVar2 = new rm2.a(string3, string4, 2, false);
            r45.hn1 hn1Var = kdVar.K1;
            r45.hf5 hf5Var = (r45.hf5) hn1Var.m75936x14adae67(3);
            if (hf5Var != null && hf5Var.m75939xb282bd08(0) == 1) {
                aVar.f478965d = true;
            }
            r45.hf5 hf5Var2 = (r45.hf5) hn1Var.m75936x14adae67(3);
            if (hf5Var2 != null && hf5Var2.m75939xb282bd08(0) == 2) {
                z17 = true;
            }
            if (z17) {
                aVar2.f478965d = true;
            }
            linkedList.add(aVar);
            linkedList.add(aVar2);
            dVar.f478972d = linkedList;
            dVar.f478973e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.hd(kdVar);
            c1163xf1deaba4.mo7960x6cab2c8d(dVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = kdVar.F1;
            if (z2Var2 != null) {
                z2Var2.j(c1163xf1deaba4);
            }
            android.view.ViewGroup.LayoutParams layoutParams = c1163xf1deaba4.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = com.p314xaae8f345.mm.ui.bl.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var3 = kdVar.F1;
            if (z2Var3 != null) {
                z2Var3.C();
            }
            if (lk5.s.b(context)) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var4 = kdVar.F1;
                if (z2Var4 != null) {
                    z2Var4.u(com.p314xaae8f345.mm.ui.bl.b(context).y);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var5 = kdVar.F1;
                if (z2Var5 != null && (i17 = com.p314xaae8f345.mm.ui.bl.b(context).y) != 0) {
                    android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) z2Var5.f293591g.getLayoutParams();
                    layoutParams2.width = i17;
                    z2Var5.f293591g.setLayoutParams(layoutParams2);
                    z2Var5.f293591g.invalidate();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
