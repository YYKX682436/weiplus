package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMListPopupWindow */
/* loaded from: classes15.dex */
public class C21505x98c24a7e {

    /* renamed from: a, reason: collision with root package name */
    public final db5.d4 f279004a;

    /* renamed from: b, reason: collision with root package name */
    public final db5.c4 f279005b;

    /* renamed from: c, reason: collision with root package name */
    public final db5.b4 f279006c;

    /* renamed from: d, reason: collision with root package name */
    public final db5.z3 f279007d;

    /* renamed from: e, reason: collision with root package name */
    public final int f279008e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f279009f;

    /* renamed from: g, reason: collision with root package name */
    public final db5.d5 f279010g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListAdapter f279011h;

    /* renamed from: i, reason: collision with root package name */
    public db5.y3 f279012i;

    /* renamed from: j, reason: collision with root package name */
    public int f279013j;

    /* renamed from: k, reason: collision with root package name */
    public int f279014k;

    /* renamed from: l, reason: collision with root package name */
    public int f279015l;

    /* renamed from: m, reason: collision with root package name */
    public int f279016m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f279017n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f279018o;

    /* renamed from: p, reason: collision with root package name */
    public android.database.DataSetObserver f279019p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f279020q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f279021r;

    /* renamed from: s, reason: collision with root package name */
    public final android.os.Handler f279022s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.Rect f279023t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f279024u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f279025v;

    public C21505x98c24a7e(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559849gj);
    }

    public void a() {
        db5.d5 d5Var = this.f279010g;
        d5Var.dismiss();
        d5Var.setContentView(null);
        this.f279012i = null;
        this.f279022s.removeCallbacks(this.f279004a);
    }

    public void b(android.widget.ListAdapter listAdapter) {
        android.database.DataSetObserver dataSetObserver = this.f279019p;
        if (dataSetObserver == null) {
            this.f279019p = new db5.a4(this, null);
        } else {
            android.widget.ListAdapter listAdapter2 = this.f279011h;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f279011h = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f279019p);
        }
        db5.y3 y3Var = this.f279012i;
        if (y3Var != null) {
            y3Var.setAdapter(this.f279011h);
        }
    }

    public void c(int i17) {
        android.graphics.drawable.Drawable background = this.f279010g.getBackground();
        if (background == null) {
            this.f279014k = i17;
            return;
        }
        android.graphics.Rect rect = this.f279023t;
        background.getPadding(rect);
        this.f279014k = rect.left + rect.right + i17;
    }

    public void d() {
        int i17;
        android.view.View view;
        int i18;
        int i19;
        int i27;
        db5.y3 y3Var;
        db5.y3 y3Var2 = this.f279012i;
        db5.d5 d5Var = this.f279010g;
        android.content.Context context = this.f279009f;
        if (y3Var2 == null) {
            db5.y3 y3Var3 = new db5.y3(context, !this.f279024u, null);
            this.f279012i = y3Var3;
            y3Var3.setAdapter(this.f279011h);
            this.f279012i.setOnItemClickListener(this.f279021r);
            this.f279012i.setFocusable(true);
            this.f279012i.setFocusableInTouchMode(true);
            this.f279012i.setDivider(null);
            this.f279012i.setDividerHeight(0);
            this.f279012i.setOnItemSelectedListener(new db5.x3(this));
            this.f279012i.setOnScrollListener(this.f279006c);
            d5Var.setContentView(this.f279012i);
        }
        android.graphics.drawable.Drawable background = d5Var.getBackground();
        android.graphics.Rect rect = this.f279023t;
        if (background != null) {
            background.getPadding(rect);
            int i28 = rect.top;
            i17 = rect.bottom + i28;
            if (!this.f279017n) {
                this.f279016m = -i28;
            }
        } else {
            rect.setEmpty();
            i17 = 0;
        }
        boolean z17 = d5Var.getInputMethodMode() == 2;
        android.view.View view2 = this.f279020q;
        int i29 = this.f279016m;
        android.graphics.Rect rect2 = new android.graphics.Rect();
        view2.getWindowVisibleDisplayFrame(rect2);
        view2.getLocationOnScreen(new int[2]);
        int i37 = rect2.bottom;
        if (z17) {
            view2.getContext().getResources();
            i37 = com.p314xaae8f345.mm.ui.dl.d(view2.getContext()).y;
        }
        int i38 = i37 - i29;
        if (d5Var.getBackground() != null) {
            d5Var.getBackground().getPadding(rect);
            i38 -= rect.top + rect.bottom;
        }
        if (this.f279013j != -1) {
            int i39 = this.f279014k;
            int makeMeasureSpec = i39 != -2 ? i39 != -1 ? android.view.View.MeasureSpec.makeMeasureSpec(i39, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            db5.y3 y3Var4 = this.f279012i;
            i38 -= 0;
            int listPaddingTop = y3Var4.getListPaddingTop();
            int listPaddingBottom = y3Var4.getListPaddingBottom();
            int dividerHeight = y3Var4.getDividerHeight();
            android.graphics.drawable.Drawable divider = y3Var4.getDivider();
            android.widget.ListAdapter adapter = y3Var4.getAdapter();
            if (adapter == null) {
                i38 = listPaddingTop + listPaddingBottom;
            } else {
                int i47 = listPaddingTop + listPaddingBottom;
                if (dividerHeight <= 0 || divider == null) {
                    dividerHeight = 0;
                }
                int count = adapter.getCount();
                int i48 = 0;
                int i49 = 0;
                android.view.View view3 = null;
                while (true) {
                    if (i48 >= count) {
                        i38 = i47;
                        break;
                    }
                    int itemViewType = adapter.getItemViewType(i48);
                    if (itemViewType != i49) {
                        i49 = itemViewType;
                        view = null;
                    } else {
                        view = view3;
                    }
                    android.view.View view4 = adapter.getView(i48, view, y3Var4);
                    int i57 = view4 == null ? 0 : view4.getLayoutParams().height;
                    int makeMeasureSpec2 = i57 > 0 ? android.view.View.MeasureSpec.makeMeasureSpec(i57, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    if (view4 != null) {
                        view4.measure(makeMeasureSpec, makeMeasureSpec2);
                    }
                    if (i48 > 0) {
                        i47 += dividerHeight;
                    }
                    if (view4 != null) {
                        i47 += view4.getMeasuredHeight();
                    }
                    if (i47 >= i38) {
                        break;
                    }
                    i48++;
                    view3 = view4;
                }
            }
            i17 = i38 > 0 ? i17 + 0 : 0;
        }
        int i58 = i38 + i17;
        boolean z18 = d5Var.getInputMethodMode() == 2;
        if (d5Var.isShowing()) {
            int i59 = this.f279014k;
            if (i59 == -1) {
                i59 = -1;
            } else if (i59 == -2) {
                i59 = this.f279020q.getWidth();
            }
            int i66 = this.f279013j;
            if (i66 == -1) {
                int i67 = z18 ? i58 : -1;
                if (z18) {
                    d5Var.setWindowLayoutMode(this.f279014k == -1 ? -1 : 0, 0);
                } else {
                    d5Var.setWindowLayoutMode(this.f279014k == -1 ? -1 : 0, -1);
                }
                i58 = i67;
            } else if (i66 != -2) {
                i58 = i66;
            }
            d5Var.update(i59, i58);
            d5Var.setOutsideTouchable(!this.f279018o);
            if (this.f279025v) {
                d5Var.showAtLocation(this.f279020q, 17, 0, 0);
                return;
            } else {
                d5Var.showAtLocation(this.f279020q, 53, this.f279015l, this.f279016m);
                return;
            }
        }
        int i68 = this.f279014k;
        if (i68 == -1) {
            i19 = -1;
            i18 = -2;
        } else {
            i18 = -2;
            if (i68 == -2) {
                d5Var.setWidth(this.f279020q.getWidth());
            } else {
                d5Var.setWidth(i68);
            }
            i19 = 0;
        }
        int i69 = this.f279013j;
        if (i69 == -1) {
            i27 = -1;
        } else {
            if (i69 == i18) {
                d5Var.setHeight(i58);
            } else {
                d5Var.setHeight(i69);
            }
            i27 = 0;
        }
        d5Var.setWindowLayoutMode(i19, i27);
        d5Var.setOutsideTouchable(!this.f279018o);
        d5Var.f309851a = this.f279005b;
        if (this.f279025v) {
            d5Var.showAtLocation(this.f279020q, 17, 0, 0);
        } else {
            d5Var.showAtLocation(this.f279020q, 53, this.f279015l, this.f279016m);
        }
        this.f279012i.setSelection(-1);
        if ((!this.f279024u || this.f279012i.isInTouchMode()) && (y3Var = this.f279012i) != null) {
            y3Var.f310112d = true;
            y3Var.requestLayout();
        }
        if (this.f279024u) {
            return;
        }
        this.f279022s.post(this.f279007d);
    }

    public C21505x98c24a7e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this.f279004a = new db5.d4(this, null);
        this.f279005b = new db5.c4(this, null);
        this.f279006c = new db5.b4(this, null);
        this.f279007d = new db5.z3(this, null);
        this.f279008e = Integer.MAX_VALUE;
        this.f279013j = -2;
        this.f279014k = -2;
        this.f279018o = false;
        this.f279022s = new android.os.Handler();
        this.f279023t = new android.graphics.Rect();
        this.f279025v = false;
        this.f279009f = context;
        db5.d5 d5Var = new db5.d5(context);
        this.f279010g = d5Var;
        d5Var.setInputMethodMode(1);
    }
}
