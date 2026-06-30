package yk4;

/* loaded from: classes10.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c f544366d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c) {
        this.f544366d = c18713x3be2dc6c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        m40.k0 m72054x3f358f57;
        m40.k0 m72054x3f358f572;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/comment/view/TingCommentFooter$refreshSwitchSceneView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c = this.f544366d;
        m72054x3f358f57 = c18713x3be2dc6c.m72054x3f358f57();
        if (((c61.p7) m72054x3f358f57).aj() > 0) {
            m72054x3f358f572 = c18713x3be2dc6c.m72054x3f358f57();
            ((c61.p7) m72054x3f358f572).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.c3(0);
            android.view.View m72084x6d7448b9 = c18713x3be2dc6c.m72084x6d7448b9();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m72084x6d7448b9, arrayList2.toArray(), "com/tencent/mm/plugin/ting/comment/view/TingCommentFooter$refreshSwitchSceneView$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m72084x6d7448b9.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(m72084x6d7448b9, "com/tencent/mm/plugin/ting/comment/view/TingCommentFooter$refreshSwitchSceneView$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            uk4.e eVar = new uk4.e(c18713x3be2dc6c.getContext());
            android.view.LayoutInflater.from(eVar.f510065f.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571113d16, eVar.f510075s, true);
            com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) eVar.f510065f.findViewById(com.p314xaae8f345.mm.R.id.fsz)).getPaint(), 0.8f);
            android.view.View findViewById = eVar.f510065f.findViewById(com.p314xaae8f345.mm.R.id.fsx);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
            com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c.b(c18713x3be2dc6c, findViewById, 1, new yk4.z(c18713x3be2dc6c, eVar));
            android.view.View findViewById2 = eVar.f510065f.findViewById(com.p314xaae8f345.mm.R.id.fsy);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c.b(c18713x3be2dc6c, findViewById2, 2, new yk4.a0(c18713x3be2dc6c, eVar));
            eVar.f510066g = eVar.a();
            android.content.Context context = eVar.f510064e;
            eVar.f510067h = context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0;
            if (eVar.f510063d != null) {
                ((android.view.ViewGroup) eVar.f510065f.getParent()).setVisibility(0);
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) eVar.f510065f.getLayoutParams();
                boolean z17 = eVar.f510071o;
                android.view.View view2 = eVar.f510069m;
                if (!z17 && eVar.f510066g && view2 != null) {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    view2.getWindowVisibleDisplayFrame(rect);
                    layoutParams.width = java.lang.Math.min(rect.right, rect.bottom);
                    layoutParams.gravity = 1;
                    android.view.ViewParent parent = eVar.f510065f.getParent();
                    if (parent instanceof android.view.View) {
                        ((android.view.View) parent).setOnTouchListener(new uk4.c(eVar, parent));
                    }
                    if (parent instanceof android.view.ViewGroup) {
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                        if (viewGroup.getLayoutParams() instanceof p012xc85e97e9.p073xee01125a.p074xd1075a44.c) {
                            p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) viewGroup.getLayoutParams();
                            uk4.d dVar = new uk4.d(eVar);
                            cVar.b(dVar);
                            eVar.f510072p = dVar;
                            dVar.D(3);
                        }
                    }
                }
                eVar.f510065f.setLayoutParams(layoutParams);
                eVar.f510063d.getWindow().addFlags(Integer.MIN_VALUE);
                eVar.f510063d.getWindow().clearFlags(8);
                eVar.f510063d.getWindow().clearFlags(131072);
                eVar.f510063d.getWindow().clearFlags(128);
                eVar.f510063d.getWindow().getDecorView().setSystemUiVisibility(0);
                if (view2 != null) {
                    boolean z18 = eVar.f510070n == null;
                    android.view.ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                    eVar.f510070n = viewTreeObserver;
                    if (z18) {
                        viewTreeObserver.addOnGlobalLayoutListener(eVar);
                    }
                }
                if ((context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing()) {
                    eVar.f510063d.show();
                }
                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = eVar.f510072p;
                if (c2690x46972046 != null) {
                    c2690x46972046.f125976p = false;
                }
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c.c(c18713x3be2dc6c);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ting/comment/view/TingCommentFooter$refreshSwitchSceneView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
