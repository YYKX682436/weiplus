package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes5.dex */
public class i8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f292022f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f292023g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292024h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f292025i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 f292026m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f292027n;

    public i8(android.view.View view, android.view.View view2, android.content.Context context, int i17, android.view.View view3, float f17, p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f89, boolean z17) {
        this.f292020d = view;
        this.f292021e = view2;
        this.f292022f = context;
        this.f292023g = i17;
        this.f292024h = view3;
        this.f292025i = f17;
        this.f292026m = c1095x65355f89;
        this.f292027n = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view;
        android.view.View view2;
        android.view.View view3 = this.f292020d;
        if (view3 == null || (view = this.f292021e) == null) {
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i17 = marginLayoutParams.topMargin;
        int i18 = this.f292023g;
        android.content.Context context = this.f292022f;
        int b17 = i65.a.b(context, i18);
        if (view3.getMeasuredHeight() <= 0 || (view2 = this.f292024h) == null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (i17 == b17) {
                return;
            } else {
                marginLayoutParams.topMargin = b17;
            }
        } else {
            int height = (int) (((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getHeight() - this.f292025i);
            int[] iArr = new int[2];
            if (view2.getTag(view2.getId()) == null) {
                view2.getLocationOnScreen(iArr);
                view2.setTag(view2.getId(), iArr);
            } else {
                iArr = (int[]) view2.getTag(view2.getId());
            }
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f89 = this.f292026m;
            if (c1095x65355f89 != null && height >= iArr[1] + view2.getMeasuredHeight() + b17 + view.getMeasuredHeight()) {
                int j17 = ((height - com.p314xaae8f345.mm.ui.bl.j(context)) - (this.f292027n ? 0 : o25.n1.a(context))) - view.getMeasuredHeight();
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (i17 == j17) {
                    return;
                }
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) c1095x65355f89.getChildAt(0);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C0(view.getTag(), "no_first")) {
                    ((android.view.ViewGroup) view.getParent()).removeView(view);
                    viewGroup.addView(view);
                } else {
                    c1095x65355f89.removeView(viewGroup);
                    android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -2);
                    android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(context);
                    relativeLayout.addView(viewGroup);
                    relativeLayout.setLayoutParams(layoutParams);
                    c1095x65355f89.addView(relativeLayout);
                    ((android.view.ViewGroup) view.getParent()).removeView(view);
                    relativeLayout.addView(view);
                }
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams2.topMargin = j17;
                marginLayoutParams2.bottomMargin = 0;
                view.setLayoutParams(marginLayoutParams2);
                android.view.View view4 = this.f292021e;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/ui/tools/ScrollViewHelper$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/ui/tools/ScrollViewHelper$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setTag("no_first");
                c1095x65355f89.requestLayout();
                return;
            }
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (i17 == b17) {
                return;
            }
            android.view.ViewParent parent = view.getParent();
            ((android.view.ViewGroup) view.getParent()).removeView(view);
            ((android.view.ViewGroup) view2.getParent()).addView(view);
            if ((view2.getParent() instanceof android.widget.LinearLayout) && (parent instanceof android.widget.RelativeLayout)) {
                marginLayoutParams = new android.widget.LinearLayout.LayoutParams(marginLayoutParams);
            }
            marginLayoutParams.topMargin = b17;
        }
        android.view.View view5 = this.f292021e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/ui/tools/ScrollViewHelper$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/ui/tools/ScrollViewHelper$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setLayoutParams(marginLayoutParams);
        view.requestLayout();
    }
}
