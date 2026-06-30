package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes5.dex */
public class n5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154281d;

    public n5(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907) {
        this.f154281d = activityC11351x975a7907;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.List linkedList;
        android.view.View view2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/aa/ui/LaunchAAUI$55", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = this.f154281d;
        g0Var.d(13721, 9, 0, java.lang.Integer.valueOf(activityC11351x975a7907.f154037h));
        z60.k kVar = (z60.k) i95.n0.c(z60.k.class);
        java.lang.String str = activityC11351x975a7907.f154040m;
        java.lang.String r17 = c01.z1.r();
        ((z60.i) kVar).getClass();
        y63.c Bi = ((t63.e) i95.n0.c(t63.e.class)).Bi();
        Bi.getClass();
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(r17)) {
            linkedList = new java.util.LinkedList();
        } else {
            p75.n0 n0Var = dm.c6.f317663p;
            p75.d dVar = dm.c6.f317664q;
            p75.d dVar2 = dm.c6.f317665r;
            p75.d dVar3 = dm.c6.f317666s;
            p75.d dVar4 = dm.c6.f317667t;
            long e17 = c01.id.e();
            kk.j jVar = x63.g.f533768a;
            long longValue = e17 - (5 * y63.c.f541191e.longValue());
            p75.i0 i17 = n0Var.i();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
            p75.y yVar = (p75.y) dVar.j(str).c(dVar2.j(r17));
            yVar.f(dVar3.i(1));
            yVar.f(dVar4.n(java.lang.Long.valueOf(longValue)));
            i17.f434190d = yVar;
            i17.e(dVar4.u());
            linkedList = i17.a().k(Bi.f541195d, y63.a.class);
            java.util.Iterator it = ((java.util.ArrayList) linkedList).iterator();
            while (it.hasNext()) {
                x63.g.n((y63.a) it.next());
            }
        }
        linkedList.sort(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.j5(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(activityC11351x975a7907);
        android.view.View inflate = android.view.View.inflate(activityC11351x975a7907.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569398a2, null);
        ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f563831am)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.k5(this, y1Var));
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f563832an)).getPaint(), 0.8f);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f563827ai);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) inflate.findViewById(com.p314xaae8f345.mm.R.id.f563825ag);
        com.p314xaae8f345.mm.p2776x373aa5.C22791xb8ff38fd c22791xb8ff38fd = (com.p314xaae8f345.mm.p2776x373aa5.C22791xb8ff38fd) inflate.findViewById(com.p314xaae8f345.mm.R.id.f563826ah);
        c22791xb8ff38fd.m82588x25bfb969((com.p314xaae8f345.mm.ui.bl.b(activityC11351x975a7907.mo55332x76847179()).y * 2) / 3);
        if (linkedList.size() <= 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAUI$55", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/aa/ui/LaunchAAUI$55", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c22791xb8ff38fd.setVisibility(8);
            view2 = inflate;
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/aa/ui/LaunchAAUI$55", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/aa/ui/LaunchAAUI$55", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c22791xb8ff38fd.setVisibility(0);
            ww1.f fVar = new ww1.f(activityC11351x975a7907.mo55332x76847179());
            fVar.f531711e = linkedList;
            fVar.m8146xced61ae5();
            c1163xf1deaba4.mo7960x6cab2c8d(fVar);
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(activityC11351x975a7907));
            fVar.f531713g = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.l5(this, y1Var);
            fVar.f531712f = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.m5(this);
            view2 = inflate;
        }
        y1Var.k(view2);
        y1Var.f293560f.setFocusable(false);
        y1Var.s();
        yj0.a.h(this, "com/tencent/mm/plugin/aa/ui/LaunchAAUI$55", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
