package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f289882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.b f289883e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ga f289884f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.Menu f289885g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f289886h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f289887i;

    public e(android.view.View view, p012xc85e97e9.p016x746ad0e3.app.b bVar, com.p314xaae8f345.mm.ui.ga gaVar, android.view.Menu menu, android.view.View view2, boolean z17) {
        this.f289882d = view;
        this.f289883e = bVar;
        this.f289884f = gaVar;
        this.f289885g = menu;
        this.f289886h = view2;
        this.f289887i = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        android.view.View view = this.f289882d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActionBarCenterHelper", "setActionTitleCenter, customView measuredWidth inside is %s, customView : %s .", java.lang.Integer.valueOf(view.getMeasuredWidth()), view);
        p012xc85e97e9.p016x746ad0e3.app.b bVar = this.f289883e;
        if (view != bVar.j()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ActionBarCenterHelper", "setActionTitleCenter, customView is not equals current actionbar's custom, customView width old = %s customView = %s， context : %s.", java.lang.Integer.valueOf(view.getMeasuredWidth()), view, view.getContext());
            if (bVar.j() != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ActionBarCenterHelper", "setActionTitleCenter, customView is not equals current actionbar's custom, customView width new = %s, customView = %s， context : %s.", java.lang.Integer.valueOf(bVar.j().getMeasuredWidth()), bVar.j(), bVar.j().getContext());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ActionBarCenterHelper", "setActionTitleCenter, actionBar.getCustomView() is null.");
            }
        }
        android.content.Context context = view.getContext();
        int B = i65.a.B(context);
        if (!com.p314xaae8f345.mm.ui.bk.y()) {
            B = i65.a.B(context);
        } else if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.getWindow() != null && activity.getWindow().getDecorView() != null) {
                B = activity.getWindow().getDecorView().getMeasuredWidth();
            }
        }
        int measuredWidth = view.getMeasuredWidth();
        if (measuredWidth == 0 && "com.tencent.mm.ui.chatting.ChattingUIFragment".equals(this.f289884f.v())) {
            android.view.Menu menu = this.f289885g;
            if (menu == null || menu.size() <= 0) {
                i17 = 0;
            } else {
                i17 = 0;
                for (int i18 = 0; i18 < menu.size(); i18++) {
                    android.view.MenuItem item = menu.getItem(i18);
                    if (item != null && item.isEnabled() && item.isVisible()) {
                        i17++;
                    }
                }
            }
            int dimension = (i17 > 1 ? i17 : 1) * ((int) view.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActionBarCenterHelper", "setActionTitleCenter, menu width is %s, defaultMenuWidth: %s.", java.lang.Integer.valueOf(i17 * ((int) view.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db))), java.lang.Integer.valueOf(dimension));
            measuredWidth = B - dimension;
        }
        android.view.View view2 = this.f289886h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/ActionBarCenterHelper$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/ActionBarCenterHelper$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f289886h;
        if (view3 == null || measuredWidth == 0) {
            return;
        }
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f78238xaeb5384d);
        int dimension2 = (int) view.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
        if (findViewById != null) {
            dimension2 = findViewById.getMeasuredWidth();
        }
        if (!this.f289887i) {
            android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.f564068h1);
            if (findViewById2 != null) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams();
                marginLayoutParams.leftMargin = 0;
                findViewById2.setLayoutParams(marginLayoutParams);
            }
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            marginLayoutParams2.leftMargin = dimension2;
            view3.setLayoutParams(marginLayoutParams2);
            return;
        }
        int left = view.getLeft();
        int i19 = (B - measuredWidth) - left;
        int max = java.lang.Math.max(i19 - left, dimension2);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = (android.view.ViewGroup.MarginLayoutParams) view3.getLayoutParams();
        marginLayoutParams3.width = B - ((max + left) * 2);
        marginLayoutParams3.leftMargin = max;
        view3.setLayoutParams(marginLayoutParams3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActionBarCenterHelper", "setActionTitleCenter, backViewWidth: %s, menuAreaWidth: %s, leftMargin: %s, titleWidth: %s, activityWidth: %s, customMeasuredWidth: %s, customPadding: %s, customRealWidth: %s.", java.lang.Integer.valueOf(dimension2), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(marginLayoutParams3.width), java.lang.Integer.valueOf(B), java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(left), java.lang.Integer.valueOf(view.getWidth()));
        if (findViewById != null) {
            if (max != 0) {
                dimension2 = 0;
            }
            view3.setPadding(dimension2, 0, dimension2, 0);
        }
    }
}
