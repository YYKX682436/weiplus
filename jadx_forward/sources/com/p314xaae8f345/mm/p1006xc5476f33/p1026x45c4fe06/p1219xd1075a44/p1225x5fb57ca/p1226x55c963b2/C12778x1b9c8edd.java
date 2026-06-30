package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase */
/* loaded from: classes15.dex */
public class C12778x1b9c8edd {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f172822a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.PopupWindow f172823b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ListAdapter f172824c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.v f172825d;

    /* renamed from: e, reason: collision with root package name */
    public int f172826e;

    /* renamed from: f, reason: collision with root package name */
    public int f172827f;

    /* renamed from: g, reason: collision with root package name */
    public int f172828g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f172829h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f172830i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f172831j;

    /* renamed from: k, reason: collision with root package name */
    public final int f172832k;

    /* renamed from: l, reason: collision with root package name */
    public android.database.DataSetObserver f172833l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f172834m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.a0 f172835n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.z f172836o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.y f172837p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.w f172838q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f172839r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Rect f172840s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f172841t;

    public C12778x1b9c8edd(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559849gj);
    }

    public void a() {
        android.widget.PopupWindow popupWindow = this.f172823b;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.f172825d = null;
        this.f172839r.mo50300x3fa464aa(this.f172835n);
    }

    public boolean b() {
        return this.f172823b.isShowing();
    }

    public void c() {
        int i17;
        int i18;
        int i19;
        int i27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.v vVar;
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.v vVar2 = this.f172825d;
        android.widget.PopupWindow popupWindow = this.f172823b;
        android.content.Context context = this.f172822a;
        if (vVar2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.v vVar3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.v(context, !this.f172841t);
            this.f172825d = vVar3;
            vVar3.setAdapter(this.f172824c);
            this.f172825d.setOnItemClickListener(null);
            this.f172825d.setFocusable(true);
            this.f172825d.setFocusableInTouchMode(true);
            this.f172825d.setDivider(null);
            this.f172825d.setDividerHeight(0);
            this.f172825d.setOnItemSelectedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.u(this));
            this.f172825d.setOnScrollListener(this.f172837p);
            popupWindow.setContentView(this.f172825d);
        }
        android.graphics.drawable.Drawable background = popupWindow.getBackground();
        android.graphics.Rect rect = this.f172840s;
        if (background != null) {
            background.getPadding(rect);
            int i28 = rect.top;
            i17 = rect.bottom + i28;
            if (!this.f172829h) {
                this.f172828g = -i28;
            }
        } else {
            rect.setEmpty();
            i17 = 0;
        }
        boolean z17 = popupWindow.getInputMethodMode() == 2;
        android.view.View view2 = this.f172834m;
        int i29 = this.f172828g;
        android.graphics.Rect rect2 = new android.graphics.Rect();
        view2.getWindowVisibleDisplayFrame(rect2);
        view2.getLocationOnScreen(new int[2]);
        int i37 = rect2.bottom;
        if (z17) {
            i37 = view2.getContext().getResources().getDisplayMetrics().heightPixels;
        }
        int i38 = i37 - i29;
        if (popupWindow.getBackground() != null) {
            popupWindow.getBackground().getPadding(rect);
            i38 -= rect.top + rect.bottom;
        }
        if (!this.f172830i && this.f172826e != -1) {
            int i39 = this.f172827f;
            int makeMeasureSpec = i39 != -2 ? i39 != -1 ? android.view.View.MeasureSpec.makeMeasureSpec(i39, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.v vVar4 = this.f172825d;
            i38 += 0;
            int listPaddingTop = vVar4.getListPaddingTop();
            int listPaddingBottom = vVar4.getListPaddingBottom();
            vVar4.getListPaddingLeft();
            vVar4.getListPaddingRight();
            int dividerHeight = vVar4.getDividerHeight();
            android.graphics.drawable.Drawable divider = vVar4.getDivider();
            android.widget.ListAdapter adapter = vVar4.getAdapter();
            int i47 = listPaddingTop + listPaddingBottom;
            if (adapter != null) {
                if (dividerHeight <= 0 || divider == null) {
                    dividerHeight = 0;
                }
                int count = adapter.getCount();
                int i48 = 0;
                int i49 = 0;
                android.view.View view3 = null;
                while (i48 < count) {
                    int itemViewType = adapter.getItemViewType(i48);
                    if (itemViewType != i49) {
                        i49 = itemViewType;
                        view = null;
                    } else {
                        view = view3;
                    }
                    android.view.View view4 = adapter.getView(i48, view, vVar4);
                    int i57 = view4.getLayoutParams().height;
                    view4.measure(makeMeasureSpec, i57 > 0 ? android.view.View.MeasureSpec.makeMeasureSpec(i57, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                    if (i48 > 0) {
                        i47 += dividerHeight;
                    }
                    i47 += view4.getMeasuredHeight();
                    if (i47 >= i38) {
                        break;
                    }
                    i48++;
                    view3 = view4;
                }
            }
            i38 = i47;
            i17 = i38 > 0 ? i17 + 0 : 0;
        }
        int i58 = i38 + i17;
        boolean z18 = popupWindow.getInputMethodMode() == 2;
        if (popupWindow.isShowing()) {
            int i59 = this.f172827f;
            if (i59 == -1) {
                i59 = -1;
            } else if (i59 == -2) {
                i59 = this.f172834m.getWidth();
            }
            int i66 = this.f172826e;
            if (i66 == -1) {
                int i67 = z18 ? i58 : -1;
                if (z18) {
                    popupWindow.setWindowLayoutMode(this.f172827f == -1 ? -1 : 0, 0);
                } else {
                    popupWindow.setWindowLayoutMode(this.f172827f == -1 ? -1 : 0, -1);
                }
                i58 = i67;
            } else if (i66 != -2) {
                i58 = i66;
            }
            popupWindow.update(i59, i58);
            popupWindow.setOutsideTouchable((this.f172831j || this.f172830i) ? false : true);
            popupWindow.update(this.f172834m, 0, this.f172828g, popupWindow.getWidth(), popupWindow.getHeight());
            return;
        }
        int i68 = this.f172827f;
        if (i68 == -1) {
            i19 = -1;
            i18 = -2;
        } else {
            i18 = -2;
            if (i68 == -2) {
                popupWindow.setWidth(this.f172834m.getWidth());
            } else {
                popupWindow.setWidth(i68);
            }
            i19 = 0;
        }
        int i69 = this.f172826e;
        if (i69 == -1) {
            i27 = -1;
        } else {
            if (i69 == i18) {
                popupWindow.setHeight(i58);
            } else {
                popupWindow.setHeight(i69);
            }
            i27 = 0;
        }
        popupWindow.setWindowLayoutMode(i19, i27);
        popupWindow.setOutsideTouchable((this.f172831j || this.f172830i) ? false : true);
        popupWindow.setTouchInterceptor(this.f172836o);
        popupWindow.showAsDropDown(this.f172834m, 0, this.f172828g, 53);
        this.f172825d.setSelection(-1);
        if ((!this.f172841t || this.f172825d.isInTouchMode()) && (vVar = this.f172825d) != null) {
            vVar.f172890d = true;
            vVar.requestLayout();
        }
        if (this.f172841t) {
            return;
        }
        this.f172839r.mo50293x3498a0(this.f172838q);
    }

    public C12778x1b9c8edd(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this.f172826e = -2;
        this.f172827f = -2;
        this.f172830i = false;
        this.f172831j = false;
        this.f172832k = Integer.MAX_VALUE;
        this.f172835n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.a0(this, null);
        this.f172836o = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.z(this, null);
        this.f172837p = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.y(this, null);
        this.f172838q = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.w(this, null);
        this.f172839r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f172840s = new android.graphics.Rect();
        this.f172822a = context;
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(context);
        this.f172823b = popupWindow;
        popupWindow.setInputMethodMode(1);
        java.util.Locale locale = context.getResources().getConfiguration().locale;
    }
}
