package com.tencent.mm.plugin.appbrand.widget.input.autofill;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public class AutoFillListPopupWindowBase {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f91289a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.PopupWindow f91290b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ListAdapter f91291c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.autofill.v f91292d;

    /* renamed from: e, reason: collision with root package name */
    public int f91293e;

    /* renamed from: f, reason: collision with root package name */
    public int f91294f;

    /* renamed from: g, reason: collision with root package name */
    public int f91295g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f91296h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f91297i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f91298j;

    /* renamed from: k, reason: collision with root package name */
    public final int f91299k;

    /* renamed from: l, reason: collision with root package name */
    public android.database.DataSetObserver f91300l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f91301m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.autofill.a0 f91302n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.autofill.z f91303o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.autofill.y f91304p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.autofill.w f91305q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f91306r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Rect f91307s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f91308t;

    public AutoFillListPopupWindowBase(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478316gj);
    }

    public void a() {
        android.widget.PopupWindow popupWindow = this.f91290b;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.f91292d = null;
        this.f91306r.removeCallbacks(this.f91302n);
    }

    public boolean b() {
        return this.f91290b.isShowing();
    }

    public void c() {
        int i17;
        int i18;
        int i19;
        int i27;
        com.tencent.mm.plugin.appbrand.widget.input.autofill.v vVar;
        android.view.View view;
        com.tencent.mm.plugin.appbrand.widget.input.autofill.v vVar2 = this.f91292d;
        android.widget.PopupWindow popupWindow = this.f91290b;
        android.content.Context context = this.f91289a;
        if (vVar2 == null) {
            com.tencent.mm.plugin.appbrand.widget.input.autofill.v vVar3 = new com.tencent.mm.plugin.appbrand.widget.input.autofill.v(context, !this.f91308t);
            this.f91292d = vVar3;
            vVar3.setAdapter(this.f91291c);
            this.f91292d.setOnItemClickListener(null);
            this.f91292d.setFocusable(true);
            this.f91292d.setFocusableInTouchMode(true);
            this.f91292d.setDivider(null);
            this.f91292d.setDividerHeight(0);
            this.f91292d.setOnItemSelectedListener(new com.tencent.mm.plugin.appbrand.widget.input.autofill.u(this));
            this.f91292d.setOnScrollListener(this.f91304p);
            popupWindow.setContentView(this.f91292d);
        }
        android.graphics.drawable.Drawable background = popupWindow.getBackground();
        android.graphics.Rect rect = this.f91307s;
        if (background != null) {
            background.getPadding(rect);
            int i28 = rect.top;
            i17 = rect.bottom + i28;
            if (!this.f91296h) {
                this.f91295g = -i28;
            }
        } else {
            rect.setEmpty();
            i17 = 0;
        }
        boolean z17 = popupWindow.getInputMethodMode() == 2;
        android.view.View view2 = this.f91301m;
        int i29 = this.f91295g;
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
        if (!this.f91297i && this.f91293e != -1) {
            int i39 = this.f91294f;
            int makeMeasureSpec = i39 != -2 ? i39 != -1 ? android.view.View.MeasureSpec.makeMeasureSpec(i39, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            com.tencent.mm.plugin.appbrand.widget.input.autofill.v vVar4 = this.f91292d;
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
            int i59 = this.f91294f;
            if (i59 == -1) {
                i59 = -1;
            } else if (i59 == -2) {
                i59 = this.f91301m.getWidth();
            }
            int i66 = this.f91293e;
            if (i66 == -1) {
                int i67 = z18 ? i58 : -1;
                if (z18) {
                    popupWindow.setWindowLayoutMode(this.f91294f == -1 ? -1 : 0, 0);
                } else {
                    popupWindow.setWindowLayoutMode(this.f91294f == -1 ? -1 : 0, -1);
                }
                i58 = i67;
            } else if (i66 != -2) {
                i58 = i66;
            }
            popupWindow.update(i59, i58);
            popupWindow.setOutsideTouchable((this.f91298j || this.f91297i) ? false : true);
            popupWindow.update(this.f91301m, 0, this.f91295g, popupWindow.getWidth(), popupWindow.getHeight());
            return;
        }
        int i68 = this.f91294f;
        if (i68 == -1) {
            i19 = -1;
            i18 = -2;
        } else {
            i18 = -2;
            if (i68 == -2) {
                popupWindow.setWidth(this.f91301m.getWidth());
            } else {
                popupWindow.setWidth(i68);
            }
            i19 = 0;
        }
        int i69 = this.f91293e;
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
        popupWindow.setOutsideTouchable((this.f91298j || this.f91297i) ? false : true);
        popupWindow.setTouchInterceptor(this.f91303o);
        popupWindow.showAsDropDown(this.f91301m, 0, this.f91295g, 53);
        this.f91292d.setSelection(-1);
        if ((!this.f91308t || this.f91292d.isInTouchMode()) && (vVar = this.f91292d) != null) {
            vVar.f91357d = true;
            vVar.requestLayout();
        }
        if (this.f91308t) {
            return;
        }
        this.f91306r.post(this.f91305q);
    }

    public AutoFillListPopupWindowBase(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this.f91293e = -2;
        this.f91294f = -2;
        this.f91297i = false;
        this.f91298j = false;
        this.f91299k = Integer.MAX_VALUE;
        this.f91302n = new com.tencent.mm.plugin.appbrand.widget.input.autofill.a0(this, null);
        this.f91303o = new com.tencent.mm.plugin.appbrand.widget.input.autofill.z(this, null);
        this.f91304p = new com.tencent.mm.plugin.appbrand.widget.input.autofill.y(this, null);
        this.f91305q = new com.tencent.mm.plugin.appbrand.widget.input.autofill.w(this, null);
        this.f91306r = new com.tencent.mm.sdk.platformtools.n3();
        this.f91307s = new android.graphics.Rect();
        this.f91289a = context;
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(context);
        this.f91290b = popupWindow;
        popupWindow.setInputMethodMode(1);
        java.util.Locale locale = context.getResources().getConfiguration().locale;
    }
}
