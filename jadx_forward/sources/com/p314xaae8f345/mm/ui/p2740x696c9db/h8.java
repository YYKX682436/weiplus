package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes.dex */
public class h8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f291992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f291993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f291994f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f291995g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f291996h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f291997i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f291998m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f291999n;

    public h8(android.view.View view, android.view.View view2, android.content.Context context, int i17, android.view.View view3, float f17, android.view.ViewGroup viewGroup, boolean z17) {
        this.f291992d = view;
        this.f291993e = view2;
        this.f291994f = context;
        this.f291995g = i17;
        this.f291996h = view3;
        this.f291997i = f17;
        this.f291998m = viewGroup;
        this.f291999n = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view;
        android.view.View view2;
        android.view.View view3 = this.f291992d;
        if (view3 == null || (view = this.f291993e) == null) {
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i17 = marginLayoutParams.topMargin;
        int i18 = this.f291995g;
        android.content.Context context = this.f291994f;
        int b17 = i65.a.b(context, i18);
        if (view3.getMeasuredHeight() <= 0 || (view2 = this.f291996h) == null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (i17 == b17) {
                return;
            } else {
                marginLayoutParams.topMargin = b17;
            }
        } else {
            int c17 = (int) ((com.p314xaae8f345.mm.ui.bk.h(context).y - com.p314xaae8f345.mm.ui.bl.c(context)) - this.f291997i);
            int[] iArr = new int[2];
            if (view2.getTag(view2.getId()) == null) {
                view2.getLocationOnScreen(iArr);
                view2.setTag(view2.getId(), iArr);
            } else {
                iArr = (int[]) view2.getTag(view2.getId());
            }
            android.view.ViewGroup viewGroup = this.f291998m;
            if (viewGroup != null && c17 >= iArr[1] + view2.getMeasuredHeight() + b17 + view.getMeasuredHeight()) {
                int j17 = ((c17 - com.p314xaae8f345.mm.ui.bl.j(context)) - (this.f291999n ? 0 : o25.n1.a(context))) - view.getMeasuredHeight();
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (i17 == j17) {
                    return;
                }
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewGroup.getChildAt(0);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C0(view.getTag(), "no_first")) {
                    ((android.view.ViewGroup) view.getParent()).removeView(view);
                    viewGroup2.addView(view);
                } else {
                    viewGroup.removeView(viewGroup2);
                    android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -2);
                    android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(context);
                    relativeLayout.addView(viewGroup2);
                    relativeLayout.setLayoutParams(layoutParams);
                    viewGroup.addView(relativeLayout);
                    ((android.view.ViewGroup) view.getParent()).removeView(view);
                    relativeLayout.addView(view);
                }
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams2.topMargin = j17;
                marginLayoutParams2.bottomMargin = 0;
                view.setLayoutParams(marginLayoutParams2);
                android.view.View view4 = this.f291993e;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/ui/tools/ScrollViewHelper$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/ui/tools/ScrollViewHelper$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setTag("no_first");
                viewGroup.requestLayout();
                return;
            }
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (i17 == b17) {
                return;
            }
            ((android.view.ViewGroup) view.getParent()).removeView(view);
            ((android.view.ViewGroup) view2.getParent()).addView(view);
            marginLayoutParams.topMargin = b17;
        }
        android.view.View view5 = this.f291993e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/ui/tools/ScrollViewHelper$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/ui/tools/ScrollViewHelper$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setLayoutParams(marginLayoutParams);
        view.requestLayout();
    }
}
