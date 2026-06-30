package ry4;

/* loaded from: classes.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.d1 f483210d;

    public s0(ry4.d1 d1Var) {
        this.f483210d = d1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC$setupBottomButtons$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ry4.d1 d1Var = this.f483210d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = d1Var.f483146i;
        if (c22849x81a93d25 != null) {
            d1Var.f483144g = kz5.n0.S0(d1Var.f483143f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = d1Var.P6();
            if (P6 != null) {
                P6.mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f575430pk0);
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = d1Var.m158354x19263085();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                abstractActivityC21394xb3d2c0cf.mo74406x9c8c0d33(new ry4.o0(d1Var), com.p314xaae8f345.mm.R.raw.f78354xfa054953);
            }
            android.view.View findViewById = d1Var.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.v4v);
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "enterEditMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "enterEditMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = d1Var.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.v4u);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "enterEditMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "enterEditMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            d1Var.Y6(0);
            ry4.g gVar = d1Var.f483142e;
            if (gVar != null) {
                gVar.f483162m = true;
                gVar.f483163n.clear();
                int childCount = c22849x81a93d25.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    android.view.View childAt = c22849x81a93d25.getChildAt(i17);
                    if (childAt != null) {
                        childAt.setTag(com.p314xaae8f345.mm.R.id.v59, "PAYLOAD_ENTER_EDIT");
                    }
                }
                int size = gVar.f483156d.size();
                for (int i18 = 0; i18 < size; i18++) {
                    gVar.m8148xed6e4d18(i18, "PAYLOAD_ENTER_EDIT");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC$setupBottomButtons$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
