package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMAutoSwitchEditTextView */
/* loaded from: classes12.dex */
public class C21485x435984bf extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f278849d;

    /* renamed from: e, reason: collision with root package name */
    public final int f278850e;

    /* renamed from: f, reason: collision with root package name */
    public final int f278851f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f278852g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f278853h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f278854i;

    /* renamed from: m, reason: collision with root package name */
    public final db5.q1 f278855m;

    /* renamed from: n, reason: collision with root package name */
    public final int f278856n;

    public C21485x435984bf(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278854i = new java.util.ArrayList();
        this.f278855m = new db5.q1(this, null);
        this.f278856n = 100;
        this.f278853h = context;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f528716a);
        int integer = obtainStyledAttributes.getInteger(0, 3);
        this.f278849d = integer;
        this.f278850e = obtainStyledAttributes.getInteger(3, 4);
        this.f278851f = obtainStyledAttributes.getInteger(2, 2);
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId != 0) {
            this.f278852g = context.getString(resourceId);
        }
        obtainStyledAttributes.recycle();
        if (context instanceof android.app.Activity) {
            this.f278856n = ((((android.app.Activity) context).getWindowManager().getDefaultDisplay().getWidth() - 80) - ((integer - 1) * 20)) / integer;
        }
        setPadding(i65.a.b(context, 20), 0, i65.a.b(context, 20), 0);
        for (int i17 = 0; i17 < this.f278849d; i17++) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21484x4baee2fa c21484x4baee2fa = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21484x4baee2fa) android.view.View.inflate(this.f278853h, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569697iy, null);
            c21484x4baee2fa.setInputType(this.f278851f);
            java.lang.String str = this.f278852g;
            if (str != null && str.length() > 0) {
                c21484x4baee2fa.setKeyListener(android.text.method.DigitsKeyListener.getInstance(str));
            }
            c21484x4baee2fa.m78907x5326e990(i17);
            c21484x4baee2fa.m78908x5b6f8ea7(this.f278850e);
            db5.q1 q1Var = this.f278855m;
            c21484x4baee2fa.m78910xcb4af3a3(q1Var);
            c21484x4baee2fa.m78909x557ac9a2(q1Var);
            c21484x4baee2fa.m78911x6a2b0158(q1Var);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(this.f278856n, -2);
            if (i17 > 0) {
                layoutParams.leftMargin = 20;
            } else {
                layoutParams.leftMargin = 0;
            }
            layoutParams.weight = 1.0f;
            c21484x4baee2fa.setLayoutParams(layoutParams);
            this.f278854i.add(c21484x4baee2fa);
            addView(c21484x4baee2fa);
        }
    }

    /* renamed from: getText */
    public java.lang.String m78912xfb85ada3() {
        java.util.Iterator it = this.f278854i.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21484x4baee2fa c21484x4baee2fa = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21484x4baee2fa) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21484x4baee2fa.getText().toString().trim())) {
                str = str + c21484x4baee2fa.getText().toString().trim();
            }
        }
        return str;
    }

    /* renamed from: setOnInputFinished */
    public void m78913x44ae61fb(db5.o1 o1Var) {
    }

    /* renamed from: setOnTextChanged */
    public void m78914x66bfa426(db5.p1 p1Var) {
    }
}
