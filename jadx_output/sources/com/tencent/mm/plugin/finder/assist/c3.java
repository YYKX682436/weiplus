package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.c3 f102052a = new com.tencent.mm.plugin.finder.assist.c3();

    public final void a(android.view.View finderLogoView, android.widget.ImageView authView, boolean z17, com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo, boolean z18, android.content.Context context) {
        kotlin.jvm.internal.o.g(finderLogoView, "finderLogoView");
        kotlin.jvm.internal.o.g(authView, "authView");
        kotlin.jvm.internal.o.g(context, "context");
        boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L1().r()).booleanValue();
        ya2.m1 m1Var = ya2.m1.f460511a;
        if (booleanValue) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            zy2.tb.a(m1Var, authView, finderAuthInfo, 0, 4, null);
            if (z18 || z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(finderLogoView, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/FinderIdentityIconHelper", "setDualIcons", "(Landroid/view/View;Landroid/widget/ImageView;ZLcom/tencent/mm/protocal/protobuf/FinderAuthInfo;ZLandroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                finderLogoView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(finderLogoView, "com/tencent/mm/plugin/finder/assist/FinderIdentityIconHelper", "setDualIcons", "(Landroid/view/View;Landroid/widget/ImageView;ZLcom/tencent/mm/protocal/protobuf/FinderAuthInfo;ZLandroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(finderLogoView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/FinderIdentityIconHelper", "setDualIcons", "(Landroid/view/View;Landroid/widget/ImageView;ZLcom/tencent/mm/protocal/protobuf/FinderAuthInfo;ZLandroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            finderLogoView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(finderLogoView, "com/tencent/mm/plugin/finder/assist/FinderIdentityIconHelper", "setDualIcons", "(Landroid/view/View;Landroid/widget/ImageView;ZLcom/tencent/mm/protocal/protobuf/FinderAuthInfo;ZLandroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        int authIconType = finderAuthInfo != null ? finderAuthInfo.getAuthIconType() : 0;
        if (authIconType != 1 && authIconType != 2) {
            authView.setVisibility(8);
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(finderLogoView, arrayList3.toArray(), "com/tencent/mm/plugin/finder/assist/FinderIdentityIconHelper", "setDualIcons", "(Landroid/view/View;Landroid/widget/ImageView;ZLcom/tencent/mm/protocal/protobuf/FinderAuthInfo;ZLandroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            finderLogoView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(finderLogoView, "com/tencent/mm/plugin/finder/assist/FinderIdentityIconHelper", "setDualIcons", "(Landroid/view/View;Landroid/widget/ImageView;ZLcom/tencent/mm/protocal/protobuf/FinderAuthInfo;ZLandroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.tb.a(m1Var, authView, finderAuthInfo, 0, 4, null);
        authView.setVisibility(0);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(finderLogoView, arrayList4.toArray(), "com/tencent/mm/plugin/finder/assist/FinderIdentityIconHelper", "setDualIcons", "(Landroid/view/View;Landroid/widget/ImageView;ZLcom/tencent/mm/protocal/protobuf/FinderAuthInfo;ZLandroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        finderLogoView.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(finderLogoView, "com/tencent/mm/plugin/finder/assist/FinderIdentityIconHelper", "setDualIcons", "(Landroid/view/View;Landroid/widget/ImageView;ZLcom/tencent/mm/protocal/protobuf/FinderAuthInfo;ZLandroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
