package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class g1 extends yw2.a0 {
    public final /* synthetic */ boolean F;
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem G;
    public final /* synthetic */ long H;
    public final /* synthetic */ int I;

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI f110067J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(boolean z17, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, long j17, int i17, com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI finderCommentUI, com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        super(a7Var);
        this.F = z17;
        this.G = finderItem;
        this.H = j17;
        this.I = i17;
        this.f110067J = finderCommentUI;
    }

    @Override // yw2.a0, com.tencent.mm.plugin.finder.view.g5
    public void g(android.content.Context context, android.widget.FrameLayout headerLayout, boolean z17) {
        java.lang.CharSequence i17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(headerLayout, "headerLayout");
        super.g(context, headerLayout, z17);
        if (!this.F) {
            android.view.View findViewById = headerLayout.findViewById(com.tencent.mm.R.id.ggz);
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderCommentUI$initBuilder$1", "onBuildDrawerHeader", "(Landroid/content/Context;Landroid/widget/FrameLayout;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderCommentUI$initBuilder$1", "onBuildDrawerHeader", "(Landroid/content/Context;Landroid/widget/FrameLayout;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById2 = headerLayout.findViewById(com.tencent.mm.R.id.ggz);
        if (findViewById2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderCommentUI$initBuilder$1", "onBuildDrawerHeader", "(Landroid/content/Context;Landroid/widget/FrameLayout;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/ui/FinderCommentUI$initBuilder$1", "onBuildDrawerHeader", "(Landroid/content/Context;Landroid/widget/FrameLayout;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.f1(this.G, this.H, this.I, this.f110067J, context));
        android.widget.ImageView imageView = (android.widget.ImageView) headerLayout.findViewById(com.tencent.mm.R.id.f485086gh1);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.G;
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(finderItem.getMediaList());
        if (mb4Var != null) {
            int integer = mb4Var.getInteger(2);
            mn2.g1 g1Var = mn2.g1.f329975a;
            if (integer == 4) {
                mn2.c1 c1Var = new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null);
                vo0.d e17 = g1Var.e();
                kotlin.jvm.internal.o.d(imageView);
                e17.c(c1Var, imageView, g1Var.h(mn2.f1.f329953d));
            } else {
                vo0.d e18 = g1Var.e();
                mn2.c1 c1Var2 = new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null);
                kotlin.jvm.internal.o.d(imageView);
                e18.c(c1Var2, imageView, g1Var.h(mn2.f1.f329953d));
            }
        }
        android.widget.TextView textView = (android.widget.TextView) headerLayout.findViewById(com.tencent.mm.R.id.f485087gh2);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String string = context.getString(com.tencent.mm.R.string.cwa, finderItem.getNickName());
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string));
        android.widget.TextView textView2 = (android.widget.TextView) headerLayout.findViewById(com.tencent.mm.R.id.f485085gh0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(finderItem.getDescription())) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            if (com.tencent.mm.sdk.platformtools.t8.K0(finderItem.getDescription())) {
                i17 = "";
            } else {
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                java.lang.String description = finderItem.getDescription();
                ((ke0.e) xVar2).getClass();
                i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(context2, description);
            }
            textView2.setText(i17);
        }
        k().k(findViewById2);
    }
}
