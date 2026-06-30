package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallFuncButton */
/* loaded from: classes14.dex */
public class C16138x11b4d11b extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f224154d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f224155e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.Drawable f224156f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.drawable.Drawable f224157g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.Drawable f224158h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f224159i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f224160m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f224161n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f224162o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.i2 f224163p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View.OnTouchListener f224164q;

    public C16138x11b4d11b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f224161n = false;
        this.f224162o = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.h2 h2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.h2(this);
        this.f224164q = h2Var;
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bls, this);
        this.f224154d = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.b2z);
        this.f224155e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o3b);
        android.content.res.TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, rj.t.f477687d, 0, 0);
        this.f224156f = obtainStyledAttributes.getDrawable(2);
        this.f224157g = obtainStyledAttributes.getDrawable(3);
        this.f224160m = obtainStyledAttributes.getBoolean(0, false);
        this.f224158h = obtainStyledAttributes.getDrawable(1);
        int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f224159i = getContext().getString(resourceId);
        }
        obtainStyledAttributes.recycle();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224159i)) {
            this.f224155e.setVisibility(8);
        } else {
            this.f224155e.setText(this.f224159i);
        }
        android.graphics.drawable.Drawable drawable = this.f224156f;
        if (drawable != null) {
            this.f224154d.setImageDrawable(drawable);
        }
        this.f224154d.setClickable(true);
        this.f224154d.setOnTouchListener(h2Var);
    }

    public boolean a() {
        if (this.f224160m) {
            return this.f224161n;
        }
        return false;
    }

    /* renamed from: getFuncText */
    public java.lang.String m65179xce1b1787() {
        return this.f224159i;
    }

    /* renamed from: setCheckBoxMode */
    public void m65180x97ea5568(boolean z17) {
        if (this.f224160m != z17) {
            this.f224160m = z17;
            this.f224161n = false;
            android.graphics.drawable.Drawable drawable = this.f224156f;
            if (drawable != null) {
                this.f224154d.setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: setChecked */
    public void m65181xdd7d58e5(boolean z17) {
        if (z17 == this.f224161n || !this.f224160m) {
            return;
        }
        this.f224161n = z17;
        if (z17) {
            this.f224154d.setImageDrawable(this.f224157g);
        } else {
            this.f224154d.setImageDrawable(this.f224156f);
        }
    }

    /* renamed from: setClickCallback */
    public void m65182x483864ab(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.i2 i2Var) {
        this.f224163p = i2Var;
    }

    /* renamed from: setEnable */
    public void m65183xae17c85(boolean z17) {
        android.graphics.drawable.Drawable drawable;
        if (z17 != this.f224162o) {
            this.f224162o = z17;
            if (z17 || (drawable = this.f224158h) == null) {
                this.f224154d.setImageDrawable(this.f224156f);
            } else {
                this.f224154d.setImageDrawable(drawable);
            }
            this.f224161n = false;
        }
    }

    /* renamed from: setFuncText */
    public void m65184xc8d37893(java.lang.String str) {
        this.f224159i = str;
        this.f224155e.setText(str);
    }
}
