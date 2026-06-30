package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* renamed from: com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView */
/* loaded from: classes5.dex */
public class ViewOnFocusChangeListenerC11490xd5b31b8d extends android.widget.RelativeLayout implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f155966d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f155967e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f155968f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f155969g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f155970h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f155971i;

    /* renamed from: m, reason: collision with root package name */
    public final int f155972m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f155973n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f155974o;

    /* renamed from: p, reason: collision with root package name */
    public int f155975p;

    /* renamed from: q, reason: collision with root package name */
    public int f155976q;

    public ViewOnFocusChangeListenerC11490xd5b31b8d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f155970h = "";
        this.f155971i = "";
        this.f155972m = -1;
        this.f155973n = true;
        this.f155974o = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.h0 h0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.h0(this);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rj.t.f477688e, i17, 0);
        int resourceId = obtainStyledAttributes.getResourceId(7, 0);
        if (resourceId != 0) {
            this.f155970h = context.getString(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(13, 0);
        if (resourceId2 != 0) {
            this.f155971i = context.getString(resourceId2);
        }
        obtainStyledAttributes.getInteger(3, 1);
        this.f155972m = obtainStyledAttributes.getInteger(5, 0);
        this.f155973n = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getInt(0, 19);
        int integer = obtainStyledAttributes.getInteger(4, 5);
        obtainStyledAttributes.getResourceId(1, com.p314xaae8f345.mm.R.C30861xcebc809e.f563723b84);
        int resourceId3 = obtainStyledAttributes.getResourceId(10, -1);
        obtainStyledAttributes.getResourceId(8, com.p314xaae8f345.mm.R.C30861xcebc809e.f563723b84);
        boolean z17 = obtainStyledAttributes.getBoolean(12, true);
        obtainStyledAttributes.recycle();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bli, (android.view.ViewGroup) this, true);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.h0c);
        this.f155968f = textView;
        textView.setTextSize(0, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
        this.f155967e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o_q);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hco);
        this.f155969g = imageView;
        imageView.setOnClickListener(h0Var);
        this.f155968f.setImeOptions(integer);
        java.lang.String str = this.f155970h;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f155968f.setHint(str);
        }
        java.lang.String str2 = this.f155971i;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            this.f155967e.setText(str2);
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        a(this.f155968f, rect);
        this.f155968f.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        setPadding(i65.a.b(getContext(), 8), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        if (resourceId3 != -1) {
            this.f155969g.setImageResource(resourceId3);
        }
        if (!z17) {
            this.f155968f.setSingleLine(false);
        }
        this.f155968f.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.c0(this));
        this.f155968f.setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.g0(this));
    }

    /* renamed from: getValidRectOfInfoIv */
    private android.graphics.Rect m48739x330fe29c() {
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f155969g.getHitRect(rect);
        rect.left -= 50;
        rect.right += 50;
        rect.top -= 25;
        rect.bottom += 25;
        return rect;
    }

    public final void a(android.view.View view, android.graphics.Rect rect) {
        rect.left = view.getPaddingLeft();
        rect.right = view.getPaddingRight();
        rect.top = view.getPaddingTop();
        rect.bottom = view.getPaddingBottom();
    }

    public void b() {
        setBackgroundResource(0);
        this.f155967e.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
        this.f155968f.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        this.f155968f.setInputType(0);
        this.f155968f.clearFocus();
        this.f155968f.setSingleLine(false);
        ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f155968f.getWindowToken(), 0);
    }

    public final void c(boolean z17) {
        boolean z18 = this.f155973n;
        int i17 = this.f155972m;
        if (!z18 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m48740xfb85ada3())) {
            if (i17 != 0 && i17 != 1) {
                if (i17 == 2) {
                    this.f155969g.setVisibility(0);
                    this.f155969g.setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571403e1));
                    return;
                } else if (i17 == 3) {
                    this.f155969g.setVisibility(0);
                    this.f155969g.setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571448fb));
                    return;
                } else if (i17 != 4) {
                    this.f155969g.setVisibility(8);
                    return;
                }
            }
            this.f155969g.setVisibility(8);
            return;
        }
        this.f155969g.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563446aj3);
        this.f155969g.setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572452b91));
        if (i17 != 0 && i17 != 1) {
            if (i17 == 2) {
                this.f155969g.setVisibility(0);
                this.f155969g.setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571403e1));
                return;
            } else if (i17 == 3) {
                this.f155969g.setVisibility(0);
                this.f155969g.setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571448fb));
                return;
            } else if (i17 != 4 && i17 != 5) {
                this.f155969g.setVisibility(8);
                return;
            }
        }
        if (z17) {
            this.f155969g.setVisibility(0);
        } else {
            this.f155969g.setVisibility(8);
        }
    }

    /* renamed from: getText */
    public java.lang.String m48740xfb85ada3() {
        return this.f155968f.getText().toString();
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f155966d;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this, z17);
        }
        if (this.f155974o) {
            this.f155967e.setEnabled(true);
        } else {
            this.f155967e.setEnabled(false);
        }
        if (view == this.f155968f) {
            android.graphics.Rect rect = new android.graphics.Rect();
            a(this, rect);
            if (z17) {
                setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c7a);
            } else {
                setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c7b);
            }
            setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
        c(z17);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.f155973n) {
            if (!((this.f155969g.getVisibility() == 0) && m48739x330fe29c().contains((int) motionEvent.getX(), (int) motionEvent.getY()))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: setBankNumberValStr */
    public void m48741xbca468d7(java.lang.String str) {
        if (this.f155972m == 5) {
            java.lang.String replace = str.replace(" ", "");
            if (replace.length() >= 4) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                int i17 = 0;
                while (i17 < replace.length() / 4) {
                    int i18 = i17 * 4;
                    i17++;
                    sb6.append(replace.substring(i18, i17 * 4));
                    sb6.append(" ");
                }
                sb6.append(replace.substring((replace.length() / 4) * 4, replace.length()));
                str = sb6.toString();
            }
        }
        this.f155968f.setText(str);
    }

    /* renamed from: setEditBG */
    public void m48742xa5872d1(int i17) {
        if (this.f155968f != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            a(this.f155968f, rect);
            this.f155968f.setBackgroundResource(i17);
            this.f155968f.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* renamed from: setEllipsize */
    public void m48743xb86dec4b(android.text.TextUtils.TruncateAt truncateAt) {
        this.f155968f.setEllipsize(truncateAt);
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        super.setEnabled(z17);
        this.f155973n = z17;
        this.f155969g.setEnabled(true);
    }

    /* renamed from: setHintStr */
    public void m48744xe8378f68(java.lang.String str) {
        this.f155968f.setHint(str);
    }

    /* renamed from: setImeOptions */
    public void m48745x843d819f(int i17) {
        this.f155968f.setImeOptions(i17);
    }

    /* renamed from: setInfoIvOnClickListener */
    public void m48746xfefa6780(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.i0 i0Var) {
    }

    /* renamed from: setInfoIvVisible */
    public void m48747x59990035(int i17) {
        this.f155969g.setVisibility(i17);
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        super.setOnFocusChangeListener(onFocusChangeListener);
        this.f155966d = onFocusChangeListener;
    }

    /* renamed from: setOnInputInvoiceTypeChangeListener */
    public void m48748xd9f9aa02(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.j0 j0Var) {
    }

    /* renamed from: setOnInputValidChangeListener */
    public void m48749x749e7e77(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.k0 k0Var) {
    }

    /* renamed from: setTipStr */
    public void m48750x243a5298(java.lang.String str) {
        this.f155967e.setText(str);
    }

    /* renamed from: setTipTextColor */
    public void m48751x3db6995d(int i17) {
        android.widget.TextView textView = this.f155967e;
        if (textView != null) {
            textView.setTextColor(i17);
        }
    }

    /* renamed from: setValStr */
    public void m48752x27317652(java.lang.String str) {
        this.f155968f.setText(str);
    }

    public ViewOnFocusChangeListenerC11490xd5b31b8d(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
