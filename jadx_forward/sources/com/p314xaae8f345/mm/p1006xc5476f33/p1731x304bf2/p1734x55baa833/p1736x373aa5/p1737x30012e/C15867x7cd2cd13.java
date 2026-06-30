package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.p1737x30012e;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.flow.FlowView */
/* loaded from: classes13.dex */
public class C15867x7cd2cd13 extends android.view.ViewGroup {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f220644r = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f220645d;

    /* renamed from: e, reason: collision with root package name */
    public int f220646e;

    /* renamed from: f, reason: collision with root package name */
    public float f220647f;

    /* renamed from: g, reason: collision with root package name */
    public int f220648g;

    /* renamed from: h, reason: collision with root package name */
    public float f220649h;

    /* renamed from: i, reason: collision with root package name */
    public float f220650i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f220651m;

    /* renamed from: n, reason: collision with root package name */
    public int f220652n;

    /* renamed from: o, reason: collision with root package name */
    public f43.a f220653o;

    /* renamed from: p, reason: collision with root package name */
    public f43.e f220654p;

    /* renamed from: q, reason: collision with root package name */
    public int f220655q;

    public C15867x7cd2cd13(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f220655q = -1;
        b(context, attributeSet);
    }

    public final android.view.View a(int i17) {
        android.view.View a17 = this.f220653o.a(i17, null, this);
        a17.setOnClickListener(new f43.c(this, i17));
        a17.setOnLongClickListener(new f43.d(this, i17));
        return a17;
    }

    public final void b(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes;
        this.f220647f = -1.0f;
        this.f220648g = -1;
        this.f220655q = 0;
        this.f220649h = 10.0f;
        this.f220650i = 10.0f;
        this.f220645d = 1;
        this.f220646e = 5;
        this.f220651m = new java.util.ArrayList();
        if (attributeSet == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s33.m0.f484061a)) == null) {
            return;
        }
        this.f220645d = obtainStyledAttributes.getInt(4, this.f220645d);
        this.f220646e = obtainStyledAttributes.getInt(5, this.f220646e);
        this.f220647f = obtainStyledAttributes.getDimension(0, this.f220647f);
        this.f220649h = obtainStyledAttributes.getDimension(1, this.f220649h);
        this.f220650i = obtainStyledAttributes.getDimension(3, this.f220650i);
        this.f220648g = obtainStyledAttributes.getInt(2, this.f220648g);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: getCurrentLinesNum */
    public int m64442xb19a7a6a() {
        return this.f220655q;
    }

    /* renamed from: getFlowHeight */
    public float m64443xf2a81beb() {
        return this.f220647f;
    }

    /* renamed from: getFlowMaxRow */
    public int m64444xfafe7c9a() {
        return this.f220648g;
    }

    /* renamed from: getHorizontalAlign */
    public int m64445x2278e30b() {
        return this.f220645d;
    }

    /* renamed from: getHorizontalSpace */
    public float m64446x23783d0c() {
        return this.f220649h;
    }

    /* renamed from: getVerticalAlign */
    public int m64447x796e3579() {
        return this.f220646e;
    }

    /* renamed from: getVerticalSpace */
    public float m64448x7a6d8f7a() {
        return this.f220650i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        f43.a aVar = this.f220653o;
        if (aVar != null) {
            f43.e eVar = this.f220654p;
            if (eVar != null) {
                aVar.f341069a.unregisterObserver(eVar);
            }
            this.f220653o = null;
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.p1737x30012e.C15867x7cd2cd13.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        float f17;
        float f18;
        float f19;
        float f27;
        float f28;
        float f29;
        float f37;
        float f38;
        super.onMeasure(i17, i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        int mode = android.view.View.MeasureSpec.getMode(i18);
        if (this.f220653o == null || getChildCount() == 0) {
            if (mode != 1073741824) {
                size2 = getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(size, size2);
            return;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        this.f220651m.clear();
        int i19 = 0;
        int i27 = 0;
        int i28 = 0;
        float f39 = 0.0f;
        for (int i29 = 0; i29 < childCount; i29++) {
            android.view.View childAt = getChildAt(i29);
            childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), 0);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i37 = i19 + measuredWidth;
            if (i37 <= paddingLeft) {
                i27++;
                if (i28 < measuredHeight) {
                    i28 = measuredHeight;
                }
                float f47 = i37;
                float f48 = this.f220649h;
                if (f47 <= paddingLeft - f48) {
                    int i38 = (int) (f47 + f48);
                    if (i29 == childCount - 1) {
                        float f49 = this.f220647f;
                        if (f49 == -1.0f) {
                            float f57 = i28;
                            this.f220651m.add(new float[]{i27, i29, f57});
                            f37 = f39 + f57;
                            f38 = this.f220650i;
                        } else {
                            this.f220651m.add(new float[]{i27, i29, f49});
                            f37 = f39 + this.f220647f;
                            f38 = this.f220650i;
                        }
                        f39 = f37 + f38;
                    }
                    i19 = i38;
                } else {
                    float f58 = this.f220647f;
                    if (f58 == -1.0f) {
                        float f59 = i28;
                        this.f220651m.add(new float[]{i27, i29, f59});
                        f28 = f39 + f59;
                        f29 = this.f220650i;
                    } else {
                        this.f220651m.add(new float[]{i27, i29, f58});
                        f28 = f39 + this.f220647f;
                        f29 = this.f220650i;
                    }
                    f39 = f28 + f29;
                    i19 = 0;
                    i27 = 0;
                    i28 = 0;
                }
            } else {
                float f66 = this.f220647f;
                if (f66 == -1.0f) {
                    float f67 = i28;
                    this.f220651m.add(new float[]{i27, i29 - 1, f67});
                    f17 = f39 + f67;
                    f18 = this.f220650i;
                } else {
                    this.f220651m.add(new float[]{i27, i29 - 1, f66});
                    f17 = f39 + this.f220647f;
                    f18 = this.f220650i;
                }
                f39 = f17 + f18;
                int i39 = (int) (measuredWidth + this.f220649h);
                if (i29 == childCount - 1) {
                    float f68 = this.f220647f;
                    if (f68 == -1.0f) {
                        i27 = 1;
                        float f69 = measuredHeight;
                        this.f220651m.add(new float[]{1, i29, f69});
                        f19 = f39 + f69;
                        f27 = this.f220650i;
                    } else {
                        i27 = 1;
                        this.f220651m.add(new float[]{1, i29, f68});
                        f19 = f39 + this.f220647f;
                        f27 = this.f220650i;
                    }
                    f39 = f19 + f27;
                } else {
                    i27 = 1;
                }
                i19 = i39;
                i28 = measuredHeight;
            }
        }
        int i47 = this.f220648g;
        if (i47 != -1 && i47 >= 0 && this.f220651m.size() > this.f220648g) {
            float f76 = 0.0f;
            for (int i48 = 0; i48 < this.f220648g; i48++) {
                f76 += ((float[]) this.f220651m.get(i48))[2] + this.f220650i;
            }
            f39 = f76;
        }
        int paddingTop = (int) ((f39 - this.f220650i) + getPaddingTop() + getPaddingBottom());
        if (mode != 1073741824) {
            size2 = paddingTop;
        }
        setMeasuredDimension(size, size2);
    }

    /* renamed from: setAdapter */
    public void m64449x6cab2c8d(f43.a aVar) {
        f43.e eVar;
        f43.a aVar2 = this.f220653o;
        if (aVar2 != null && (eVar = this.f220654p) != null) {
            aVar2.f341069a.unregisterObserver(eVar);
        }
        removeAllViews();
        this.f220653o = aVar;
        if (aVar == null) {
            return;
        }
        f43.e eVar2 = new f43.e(this, null);
        this.f220654p = eVar2;
        this.f220653o.f341069a.registerObserver(eVar2);
        java.util.List list = ((f43.h) this.f220653o).f341077d;
        int size = list != null ? list.size() : 0;
        this.f220652n = size;
        if (size <= 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            java.util.List list2 = ((f43.h) this.f220653o).f341077d;
            if (i17 >= (list2 != null ? list2.size() : 0)) {
                return;
            }
            addView(a(i17));
            i17++;
        }
    }

    /* renamed from: setFlowHeight */
    public void m64450x20cc69f7(float f17) {
        this.f220647f = f17;
    }

    /* renamed from: setHorizontalAlign */
    public void m64451x594f7c7f(int i17) {
        this.f220645d = i17;
    }

    /* renamed from: setHorizontalSpace */
    public void m64452x5a4ed680(float f17) {
        this.f220649h = f17;
    }

    /* renamed from: setMaxRow */
    public void m64453x17db48d8(int i17) {
        this.f220648g = i17;
    }

    /* renamed from: setOnItemClickListener */
    public void m64454xa1aeda28(f43.f fVar) {
    }

    /* renamed from: setOnItemLongClickListener */
    public void m64455x1c3e70c(f43.g gVar) {
    }

    /* renamed from: setVerticalAlign */
    public void m64456xc449bed(int i17) {
        this.f220646e = i17;
    }

    /* renamed from: setVerticalSpace */
    public void m64457xd43f5ee(float f17) {
        this.f220650i = f17;
    }

    public C15867x7cd2cd13(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f220655q = -1;
        b(context, attributeSet);
    }
}
