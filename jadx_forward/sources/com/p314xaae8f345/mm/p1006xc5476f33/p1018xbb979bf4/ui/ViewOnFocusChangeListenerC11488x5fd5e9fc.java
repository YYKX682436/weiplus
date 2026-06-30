package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* renamed from: com.tencent.mm.plugin.address.ui.InvoiceEditView */
/* loaded from: classes15.dex */
public class ViewOnFocusChangeListenerC11488x5fd5e9fc extends android.widget.RelativeLayout implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f155943d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.s f155944e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f155945f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f155946g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.EditText f155947h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f155948i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f155949m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f155950n;

    /* renamed from: o, reason: collision with root package name */
    public int f155951o;

    /* renamed from: p, reason: collision with root package name */
    public final int f155952p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f155953q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f155954r;

    /* renamed from: s, reason: collision with root package name */
    public final int f155955s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f155956t;

    public ViewOnFocusChangeListenerC11488x5fd5e9fc(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f155943d = false;
        this.f155949m = "";
        this.f155950n = "";
        this.f155951o = 0;
        this.f155952p = -1;
        this.f155953q = true;
        this.f155954r = false;
        this.f155955s = 100;
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.p(this);
        this.f155956t = null;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rj.t.f477688e, i17, 0);
        int resourceId = obtainStyledAttributes.getResourceId(7, 0);
        if (resourceId != 0) {
            this.f155949m = context.getString(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(13, 0);
        if (resourceId2 != 0) {
            this.f155950n = context.getString(resourceId2);
        }
        int integer = obtainStyledAttributes.getInteger(3, 1);
        this.f155952p = obtainStyledAttributes.getInteger(5, 0);
        this.f155953q = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getInt(0, 19);
        int integer2 = obtainStyledAttributes.getInteger(4, 5);
        int resourceId3 = obtainStyledAttributes.getResourceId(1, com.p314xaae8f345.mm.R.C30861xcebc809e.f563723b84);
        int resourceId4 = obtainStyledAttributes.getResourceId(10, -1);
        int resourceId5 = obtainStyledAttributes.getResourceId(8, com.p314xaae8f345.mm.R.C30861xcebc809e.f563723b84);
        boolean z17 = obtainStyledAttributes.getBoolean(12, true);
        obtainStyledAttributes.recycle();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.blf, (android.view.ViewGroup) this, true);
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.p314xaae8f345.mm.R.id.h0c);
        this.f155947h = editText;
        editText.setTextSize(0, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
        this.f155946g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o_q);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hco);
        this.f155948i = imageView;
        imageView.setOnClickListener(pVar);
        this.f155947h.setImeOptions(integer2);
        this.f155947h.setInputType(integer);
        if (integer == 2) {
            this.f155947h.setKeyListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.m(this));
        } else if (integer == 3) {
            this.f155947h.setKeyListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.n(this));
        } else {
            this.f155947h.setInputType(integer);
        }
        d(this.f155947h.isFocused());
        this.f155947h.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.o(this));
        this.f155947h.setOnFocusChangeListener(this);
        java.lang.String str = this.f155949m;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f155947h.setHint(str);
        }
        java.lang.String str2 = this.f155950n;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            this.f155946g.setText(str2);
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        a(this.f155947h, rect);
        if (!this.f155953q) {
            this.f155947h.setEnabled(false);
            this.f155947h.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560147c9));
            this.f155947h.setFocusable(false);
            this.f155947h.setClickable(false);
            this.f155947h.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563723b84);
            setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2);
            setPadding(i65.a.b(getContext(), 8), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        } else {
            this.f155954r = false;
            this.f155947h.setBackgroundResource(resourceId5);
            setBackgroundResource(resourceId3);
        }
        this.f155947h.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        if (resourceId4 != -1) {
            this.f155948i.setImageResource(resourceId4);
        }
        if (z17) {
            return;
        }
        this.f155947h.setSingleLine(false);
    }

    /* renamed from: getValidRectOfInfoIv */
    private android.graphics.Rect m48725x330fe29c() {
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f155948i.getHitRect(rect);
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

    public boolean b() {
        java.lang.String obj = this.f155947h.getText().toString();
        int i17 = this.f155955s;
        int i18 = this.f155952p;
        return i18 != 0 ? i18 != 1 ? i18 != 4 ? i18 != 5 ? obj.length() >= 0 && obj.length() <= i17 : obj.length() <= 48 : obj.length() <= 100 : obj.length() == 0 || (obj.length() >= 0 && obj.length() <= i17) : obj.length() >= 0 && obj.length() <= i17;
    }

    public boolean c() {
        java.lang.String m48726xfb85ada3 = m48726xfb85ada3();
        java.lang.String str = this.f155956t;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        return !m48726xfb85ada3.equals(str);
    }

    public final void d(boolean z17) {
        boolean z18 = this.f155953q;
        int i17 = this.f155952p;
        if (!z18 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m48726xfb85ada3())) {
            if (i17 != 0 && i17 != 1) {
                if (i17 == 2) {
                    this.f155948i.setVisibility(0);
                    this.f155948i.setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571403e1));
                    return;
                } else if (i17 == 3) {
                    this.f155948i.setVisibility(0);
                    this.f155948i.setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571448fb));
                    return;
                } else if (i17 != 4) {
                    this.f155948i.setVisibility(8);
                    return;
                }
            }
            this.f155948i.setVisibility(8);
            return;
        }
        this.f155948i.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563446aj3);
        this.f155948i.setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572452b91));
        if (i17 != 0 && i17 != 1) {
            if (i17 == 2) {
                this.f155948i.setVisibility(0);
                this.f155948i.setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571403e1));
                return;
            } else if (i17 == 3) {
                this.f155948i.setVisibility(0);
                this.f155948i.setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571448fb));
                return;
            } else if (i17 != 4 && i17 != 5) {
                this.f155948i.setVisibility(8);
                return;
            }
        }
        if (z17) {
            this.f155948i.setVisibility(0);
        } else {
            this.f155948i.setVisibility(8);
        }
    }

    /* renamed from: getText */
    public java.lang.String m48726xfb85ada3() {
        return this.f155947h.getText().toString();
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f155945f;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this, z17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.s sVar = this.f155944e;
        if (sVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11486x99e55700) sVar).T6();
        }
        if (this.f155954r) {
            this.f155946g.setEnabled(true);
        } else {
            this.f155946g.setEnabled(false);
        }
        if (view == this.f155947h) {
            android.graphics.Rect rect = new android.graphics.Rect();
            a(this, rect);
            if (z17) {
                setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c7a);
            } else {
                setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c7b);
            }
            setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
        d(z17);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.f155953q) {
            if (!((this.f155948i.getVisibility() == 0) && m48725x330fe29c().contains((int) motionEvent.getX(), (int) motionEvent.getY()))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: setBankNumberValStr */
    public void m48727xbca468d7(java.lang.String str) {
        if (this.f155952p == 5) {
            java.lang.String replace = str.replace(" ", "");
            if (replace.length() >= 4) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                int i17 = 0;
                if (replace.length() % 4 == 0) {
                    while (i17 < (replace.length() / 4) - 1) {
                        int i18 = i17 * 4;
                        i17++;
                        sb6.append(replace.substring(i18, i17 * 4));
                        sb6.append(" ");
                    }
                } else {
                    while (i17 < replace.length() / 4) {
                        int i19 = i17 * 4;
                        i17++;
                        sb6.append(replace.substring(i19, i17 * 4));
                        sb6.append(" ");
                    }
                    sb6.append(replace.substring((replace.length() / 4) * 4, replace.length()));
                    str = sb6.toString();
                }
            }
        }
        this.f155947h.setText(str);
        android.widget.EditText editText = this.f155947h;
        editText.setSelection(editText.getText().length());
    }

    /* renamed from: setEditBG */
    public void m48728xa5872d1(int i17) {
        if (this.f155947h != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            a(this.f155947h, rect);
            this.f155947h.setBackgroundResource(i17);
            this.f155947h.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* renamed from: setEllipsize */
    public void m48729xb86dec4b(android.text.TextUtils.TruncateAt truncateAt) {
        this.f155947h.setEllipsize(truncateAt);
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        super.setEnabled(z17);
        this.f155953q = z17;
        this.f155948i.setEnabled(true);
    }

    /* renamed from: setHintStr */
    public void m48730xe8378f68(java.lang.String str) {
        this.f155947h.setHint(str);
    }

    /* renamed from: setImeOptions */
    public void m48731x843d819f(int i17) {
        this.f155947h.setImeOptions(i17);
    }

    /* renamed from: setInfoIvOnClickListener */
    public void m48732xfefa6780(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.q qVar) {
    }

    /* renamed from: setInfoIvVisible */
    public void m48733x59990035(int i17) {
        this.f155948i.setVisibility(i17);
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        super.setOnFocusChangeListener(onFocusChangeListener);
        this.f155945f = onFocusChangeListener;
    }

    /* renamed from: setOnInputInvoiceTypeChangeListener */
    public void m48734xd9f9aa02(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.r rVar) {
    }

    /* renamed from: setOnInputValidChangeListener */
    public void m48735x749e7e77(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.s sVar) {
        this.f155944e = sVar;
    }

    /* renamed from: setTipStr */
    public void m48736x243a5298(java.lang.String str) {
        this.f155946g.setText(str);
    }

    /* renamed from: setTipTextColor */
    public void m48737x3db6995d(int i17) {
        android.widget.TextView textView = this.f155946g;
        if (textView != null) {
            textView.setTextColor(i17);
        }
    }

    /* renamed from: setValStr */
    public void m48738x27317652(java.lang.String str) {
        this.f155947h.setText(str);
        android.widget.EditText editText = this.f155947h;
        editText.setSelection(editText.getText().length());
        this.f155956t = str;
    }

    public ViewOnFocusChangeListenerC11488x5fd5e9fc(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
