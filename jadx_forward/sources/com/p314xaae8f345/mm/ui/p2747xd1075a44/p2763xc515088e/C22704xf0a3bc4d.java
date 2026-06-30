package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* renamed from: com.tencent.mm.ui.widget.picker.CustomDatePicker */
/* loaded from: classes15.dex */
public class C22704xf0a3bc4d extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22710xb9ba704 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f293716p = 0;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.NumberPicker f293717f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.NumberPicker f293718g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.NumberPicker f293719h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.Date f293720i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.Date f293721m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.Calendar f293722n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String[] f293723o;

    public C22704xf0a3bc4d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        this.f293723o = new java.lang.String[12];
        int i17 = 0;
        while (true) {
            java.lang.String[] strArr = this.f293723o;
            if (i17 >= strArr.length) {
                break;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            int i18 = i17 + 1;
            sb6.append(i18);
            strArr[i17] = sb6.toString();
            i17 = i18;
        }
        this.f293722n = java.util.Calendar.getInstance(java.util.Locale.US);
        m82086xa7e0b78c(false);
        m82088xe4eb0275(true);
        this.f293717f = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) m82085x1005540f()).f293877f;
        this.f293718g = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) m82085x1005540f()).f293876e;
        this.f293719h = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.x0) m82085x1005540f()).f293875d;
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.auc);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.c(this.f293717f, drawable);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.c(this.f293718g, drawable);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.c(this.f293719h, drawable);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.d(this.f293717f);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.d(this.f293718g);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.d(this.f293719h);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.f(this.f293717f, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.f(this.f293718g, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.f(this.f293719h, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a(this);
        android.widget.NumberPicker numberPicker = this.f293717f;
        if (numberPicker != null) {
            numberPicker.setOnValueChangedListener(aVar);
            this.f293717f.setMinValue(1900);
        }
        android.widget.NumberPicker numberPicker2 = this.f293718g;
        if (numberPicker2 != null) {
            numberPicker2.setOnValueChangedListener(aVar);
        }
        android.widget.NumberPicker numberPicker3 = this.f293719h;
        if (numberPicker3 != null) {
            numberPicker3.setOnValueChangedListener(aVar);
        }
        b();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.e(this.f293717f);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.e(this.f293718g);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.e(this.f293719h);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r5 = this;
            android.widget.NumberPicker r0 = r5.f293717f
            if (r0 == 0) goto Lde
            android.widget.NumberPicker r0 = r5.f293718g
            if (r0 == 0) goto Lde
            android.widget.NumberPicker r1 = r5.f293719h
            if (r1 != 0) goto Le
            goto Lde
        Le:
            r1 = 0
            r0.setDisplayedValues(r1)
            android.widget.NumberPicker r0 = r5.f293717f
            int r0 = r0.getValue()
            android.widget.NumberPicker r1 = r5.f293717f
            int r1 = r1.getMaxValue()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L4c
            java.util.Date r0 = r5.f293721m
            if (r0 == 0) goto L4c
            android.widget.NumberPicker r1 = r5.f293718g
            int r0 = r0.getMonth()
            r1.setMaxValue(r0)
            android.widget.NumberPicker r0 = r5.f293718g
            int r0 = r0.getValue()
            android.widget.NumberPicker r1 = r5.f293718g
            int r1 = r1.getMaxValue()
            if (r0 != r1) goto L53
            java.util.Date r0 = r5.f293721m
            if (r0 == 0) goto L53
            android.widget.NumberPicker r1 = r5.f293719h
            int r0 = r0.getDate()
            r1.setMaxValue(r0)
            r0 = r3
            goto L54
        L4c:
            android.widget.NumberPicker r0 = r5.f293718g
            r1 = 11
            r0.setMaxValue(r1)
        L53:
            r0 = r2
        L54:
            if (r0 != 0) goto L73
            android.widget.NumberPicker r0 = r5.f293717f
            int r0 = r0.getValue()
            android.widget.NumberPicker r1 = r5.f293718g
            int r1 = r1.getValue()
            java.util.Calendar r4 = r5.f293722n
            r4.set(r0, r1, r3)
            java.util.Calendar r0 = r5.f293722n
            r1 = 5
            int r0 = r0.getActualMaximum(r1)
            android.widget.NumberPicker r1 = r5.f293719h
            r1.setMaxValue(r0)
        L73:
            android.widget.NumberPicker r0 = r5.f293717f
            int r0 = r0.getValue()
            android.widget.NumberPicker r1 = r5.f293717f
            int r1 = r1.getMinValue()
            if (r0 != r1) goto Lab
            java.util.Date r0 = r5.f293720i
            if (r0 == 0) goto Lab
            android.widget.NumberPicker r1 = r5.f293718g
            int r0 = r0.getMonth()
            r1.setMinValue(r0)
            android.widget.NumberPicker r0 = r5.f293718g
            int r0 = r0.getValue()
            android.widget.NumberPicker r1 = r5.f293718g
            int r1 = r1.getMinValue()
            if (r0 != r1) goto Lb0
            java.util.Date r0 = r5.f293720i
            if (r0 == 0) goto Lb0
            android.widget.NumberPicker r1 = r5.f293719h
            int r0 = r0.getDate()
            r1.setMinValue(r0)
            r2 = r3
            goto Lb0
        Lab:
            android.widget.NumberPicker r0 = r5.f293718g
            r0.setMinValue(r2)
        Lb0:
            if (r2 != 0) goto Lb7
            android.widget.NumberPicker r0 = r5.f293719h
            r0.setMinValue(r3)
        Lb7:
            android.widget.NumberPicker r0 = r5.f293718g
            java.lang.String[] r1 = r5.f293723o
            int r2 = r0.getMinValue()
            android.widget.NumberPicker r4 = r5.f293718g
            int r4 = r4.getMaxValue()
            int r4 = r4 + r3
            java.lang.Object[] r1 = java.util.Arrays.copyOfRange(r1, r2, r4)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.setDisplayedValues(r1)
            android.widget.NumberPicker r0 = r5.f293717f
            r0.setWrapSelectorWheel(r3)
            android.widget.NumberPicker r0 = r5.f293718g
            r0.setWrapSelectorWheel(r3)
            android.widget.NumberPicker r0 = r5.f293719h
            r0.setWrapSelectorWheel(r3)
        Lde:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22704xf0a3bc4d.b():void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22710xb9ba704
    /* renamed from: getDayOfMonth */
    public int mo82050xa7d8f7a3() {
        android.widget.NumberPicker numberPicker = this.f293719h;
        return numberPicker != null ? numberPicker.getValue() : super.mo82050xa7d8f7a3();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22710xb9ba704
    /* renamed from: getMonth */
    public int mo82051x74d1c8ca() {
        android.widget.NumberPicker numberPicker = this.f293718g;
        return java.lang.Math.max(java.lang.Math.min((numberPicker != null ? numberPicker.getValue() : super.mo82051x74d1c8ca()) + 1, 12), 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22710xb9ba704
    /* renamed from: getYear */
    public int mo82052xfb87f0b3() {
        android.widget.NumberPicker numberPicker = this.f293717f;
        return numberPicker != null ? numberPicker.getValue() : super.mo82052xfb87f0b3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.a(this.f293717f);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.a(this.f293718g);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.a(this.f293719h);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22710xb9ba704
    /* renamed from: setMaxDate */
    public void mo82053xe3874070(long j17) {
        super.mo82053xe3874070(j17);
        java.util.Date date = new java.util.Date(j17);
        this.f293721m = date;
        android.widget.NumberPicker numberPicker = this.f293717f;
        if (numberPicker != null) {
            numberPicker.setMaxValue(date.getYear() + 1900);
        }
        b();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22710xb9ba704
    /* renamed from: setMinDate */
    public void mo82054xf0a11a5e(long j17) {
        super.mo82054xf0a11a5e(j17);
        java.util.Date date = new java.util.Date(j17);
        this.f293720i = date;
        android.widget.NumberPicker numberPicker = this.f293717f;
        if (numberPicker != null) {
            numberPicker.setMinValue(date.getYear() + 1900);
        }
    }

    public C22704xf0a3bc4d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
