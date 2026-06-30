package in4;

/* loaded from: classes12.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f374506a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f374507b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f374508c;

    /* renamed from: d, reason: collision with root package name */
    public final sm4.f f374509d;

    /* renamed from: e, reason: collision with root package name */
    public final in4.j f374510e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f374511f;

    public k(android.content.Context context, android.view.View view, in4.j jVar, sm4.f fVar, java.lang.String str) {
        this.f374506a = view;
        this.f374509d = fVar;
        this.f374507b = view.findViewById(com.p314xaae8f345.mm.R.id.d2p);
        this.f374508c = view.findViewById(com.p314xaae8f345.mm.R.id.f569034ot0);
        this.f374510e = jVar;
        this.f374511f = str;
        view.setOnClickListener(new in4.i(this));
    }

    public void a(android.view.View view, boolean z17, int i17, int i18) {
        android.view.View view2;
        android.content.Context context = view.getContext();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        int height = view.getHeight();
        int i19 = com.p314xaae8f345.mm.ui.bk.h(context).x;
        android.view.View view3 = this.f374506a;
        view3.measure(0, 0);
        int measuredHeight = view3.getMeasuredHeight();
        int measuredWidth = view3.getMeasuredWidth();
        if (z17) {
            iArr[0] = (i19 - measuredWidth) / 2;
            iArr[1] = iArr2[1] - measuredHeight;
        } else {
            iArr[0] = (i19 - measuredWidth) / 2;
            iArr[1] = iArr2[1] + height;
        }
        iArr[0] = iArr[0] + i17;
        iArr[1] = iArr[1] + i18;
        android.view.View view4 = this.f374508c;
        if (view4 != null && (view2 = this.f374507b) != null) {
            int[] iArr3 = new int[2];
            view.getLocationOnScreen(iArr3);
            int width = (iArr3[0] + (view.getWidth() / 2)) - ((int) ((16 * view.getContext().getResources().getDisplayMetrics().density) + 0.5f));
            if (z17) {
                android.view.View view5 = this.f374508c;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view5, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/widget/HaokanPopupWindow", "showCenter", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/topstory/ui/widget/HaokanPopupWindow", "showCenter", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view6 = this.f374507b;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view6, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/widget/HaokanPopupWindow", "showCenter", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/topstory/ui/widget/HaokanPopupWindow", "showCenter", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view4.getLayoutParams();
                layoutParams.leftMargin = width;
                view4.setLayoutParams(layoutParams);
            } else {
                android.view.View view7 = this.f374508c;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view7, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/widget/HaokanPopupWindow", "showCenter", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/topstory/ui/widget/HaokanPopupWindow", "showCenter", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view8 = this.f374507b;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view8, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/widget/HaokanPopupWindow", "showCenter", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/topstory/ui/widget/HaokanPopupWindow", "showCenter", "(Landroid/view/View;ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) view2.getLayoutParams();
                layoutParams2.leftMargin = width;
                view2.setLayoutParams(layoutParams2);
            }
        }
        android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) view3.getLayoutParams();
        layoutParams3.topMargin = iArr[1];
        view3.setLayoutParams(layoutParams3);
    }
}
