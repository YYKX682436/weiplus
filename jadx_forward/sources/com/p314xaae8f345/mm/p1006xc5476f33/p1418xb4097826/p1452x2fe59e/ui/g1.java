package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class g1 extends yw2.a0 {
    public final /* synthetic */ boolean F;
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 G;
    public final /* synthetic */ long H;
    public final /* synthetic */ int I;

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13941x58ed078d f191600J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, long j17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13941x58ed078d activityC13941x58ed078d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var) {
        super(a7Var);
        this.F = z17;
        this.G = c14994x9b99c079;
        this.H = j17;
        this.I = i17;
        this.f191600J = activityC13941x58ed078d;
    }

    @Override // yw2.a0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g5
    public void g(android.content.Context context, android.widget.FrameLayout headerLayout, boolean z17) {
        java.lang.CharSequence i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerLayout, "headerLayout");
        super.g(context, headerLayout, z17);
        if (!this.F) {
            android.view.View findViewById = headerLayout.findViewById(com.p314xaae8f345.mm.R.id.ggz);
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderCommentUI$initBuilder$1", "onBuildDrawerHeader", "(Landroid/content/Context;Landroid/widget/FrameLayout;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderCommentUI$initBuilder$1", "onBuildDrawerHeader", "(Landroid/content/Context;Landroid/widget/FrameLayout;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById2 = headerLayout.findViewById(com.p314xaae8f345.mm.R.id.ggz);
        if (findViewById2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderCommentUI$initBuilder$1", "onBuildDrawerHeader", "(Landroid/content/Context;Landroid/widget/FrameLayout;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/ui/FinderCommentUI$initBuilder$1", "onBuildDrawerHeader", "(Landroid/content/Context;Landroid/widget/FrameLayout;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.f1(this.G, this.H, this.I, this.f191600J, context));
        android.widget.ImageView imageView = (android.widget.ImageView) headerLayout.findViewById(com.p314xaae8f345.mm.R.id.f566619gh1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.G;
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(c14994x9b99c079.m59264x7efe73ec());
        if (mb4Var != null) {
            int m75939xb282bd08 = mb4Var.m75939xb282bd08(2);
            mn2.g1 g1Var = mn2.g1.f411508a;
            if (m75939xb282bd08 == 4) {
                mn2.c1 c1Var = new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null);
                vo0.d e17 = g1Var.e();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                e17.c(c1Var, imageView, g1Var.h(mn2.f1.f411486d));
            } else {
                vo0.d e18 = g1Var.e();
                mn2.c1 c1Var2 = new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                e18.c(c1Var2, imageView, g1Var.h(mn2.f1.f411486d));
            }
        }
        android.widget.TextView textView = (android.widget.TextView) headerLayout.findViewById(com.p314xaae8f345.mm.R.id.f566620gh2);
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cwa, c14994x9b99c079.m59273x80025a04());
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, string));
        android.widget.TextView textView2 = (android.widget.TextView) headerLayout.findViewById(com.p314xaae8f345.mm.R.id.f566618gh0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c14994x9b99c079.m59226x730bcac6())) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c14994x9b99c079.m59226x730bcac6())) {
                i17 = "";
            } else {
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                java.lang.String m59226x730bcac6 = c14994x9b99c079.m59226x730bcac6();
                ((ke0.e) xVar2).getClass();
                i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, m59226x730bcac6);
            }
            textView2.setText(i17);
        }
        k().k(findViewById2);
    }
}
