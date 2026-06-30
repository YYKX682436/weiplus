package com.tencent.mm.plugin.address.ui;

/* loaded from: classes15.dex */
public class InvoiceEditView extends android.widget.RelativeLayout implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f74410d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.address.ui.s f74411e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f74412f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f74413g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.EditText f74414h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f74415i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f74416m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f74417n;

    /* renamed from: o, reason: collision with root package name */
    public int f74418o;

    /* renamed from: p, reason: collision with root package name */
    public final int f74419p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f74420q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f74421r;

    /* renamed from: s, reason: collision with root package name */
    public final int f74422s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f74423t;

    public InvoiceEditView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f74410d = false;
        this.f74416m = "";
        this.f74417n = "";
        this.f74418o = 0;
        this.f74419p = -1;
        this.f74420q = true;
        this.f74421r = false;
        this.f74422s = 100;
        com.tencent.mm.plugin.address.ui.p pVar = new com.tencent.mm.plugin.address.ui.p(this);
        this.f74423t = null;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rj.t.f396155e, i17, 0);
        int resourceId = obtainStyledAttributes.getResourceId(7, 0);
        if (resourceId != 0) {
            this.f74416m = context.getString(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(13, 0);
        if (resourceId2 != 0) {
            this.f74417n = context.getString(resourceId2);
        }
        int integer = obtainStyledAttributes.getInteger(3, 1);
        this.f74419p = obtainStyledAttributes.getInteger(5, 0);
        this.f74420q = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getInt(0, 19);
        int integer2 = obtainStyledAttributes.getInteger(4, 5);
        int resourceId3 = obtainStyledAttributes.getResourceId(1, com.tencent.mm.R.drawable.f482190b84);
        int resourceId4 = obtainStyledAttributes.getResourceId(10, -1);
        int resourceId5 = obtainStyledAttributes.getResourceId(8, com.tencent.mm.R.drawable.f482190b84);
        boolean z17 = obtainStyledAttributes.getBoolean(12, true);
        obtainStyledAttributes.recycle();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.blf, (android.view.ViewGroup) this, true);
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.tencent.mm.R.id.h0c);
        this.f74414h = editText;
        editText.setTextSize(0, i65.a.h(context, com.tencent.mm.R.dimen.f479897ia));
        this.f74413g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o_q);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.hco);
        this.f74415i = imageView;
        imageView.setOnClickListener(pVar);
        this.f74414h.setImeOptions(integer2);
        this.f74414h.setInputType(integer);
        if (integer == 2) {
            this.f74414h.setKeyListener(new com.tencent.mm.plugin.address.ui.m(this));
        } else if (integer == 3) {
            this.f74414h.setKeyListener(new com.tencent.mm.plugin.address.ui.n(this));
        } else {
            this.f74414h.setInputType(integer);
        }
        d(this.f74414h.isFocused());
        this.f74414h.addTextChangedListener(new com.tencent.mm.plugin.address.ui.o(this));
        this.f74414h.setOnFocusChangeListener(this);
        java.lang.String str = this.f74416m;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f74414h.setHint(str);
        }
        java.lang.String str2 = this.f74417n;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            this.f74413g.setText(str2);
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        a(this.f74414h, rect);
        if (!this.f74420q) {
            this.f74414h.setEnabled(false);
            this.f74414h.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478614c9));
            this.f74414h.setFocusable(false);
            this.f74414h.setClickable(false);
            this.f74414h.setBackgroundResource(com.tencent.mm.R.drawable.f482190b84);
            setBackgroundResource(com.tencent.mm.R.drawable.f481306q2);
            setPadding(i65.a.b(getContext(), 8), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        } else {
            this.f74421r = false;
            this.f74414h.setBackgroundResource(resourceId5);
            setBackgroundResource(resourceId3);
        }
        this.f74414h.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        if (resourceId4 != -1) {
            this.f74415i.setImageResource(resourceId4);
        }
        if (z17) {
            return;
        }
        this.f74414h.setSingleLine(false);
    }

    private android.graphics.Rect getValidRectOfInfoIv() {
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f74415i.getHitRect(rect);
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
        java.lang.String obj = this.f74414h.getText().toString();
        int i17 = this.f74422s;
        int i18 = this.f74419p;
        return i18 != 0 ? i18 != 1 ? i18 != 4 ? i18 != 5 ? obj.length() >= 0 && obj.length() <= i17 : obj.length() <= 48 : obj.length() <= 100 : obj.length() == 0 || (obj.length() >= 0 && obj.length() <= i17) : obj.length() >= 0 && obj.length() <= i17;
    }

    public boolean c() {
        java.lang.String text = getText();
        java.lang.String str = this.f74423t;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        return !text.equals(str);
    }

    public final void d(boolean z17) {
        boolean z18 = this.f74420q;
        int i17 = this.f74419p;
        if (!z18 || com.tencent.mm.sdk.platformtools.t8.K0(getText())) {
            if (i17 != 0 && i17 != 1) {
                if (i17 == 2) {
                    this.f74415i.setVisibility(0);
                    this.f74415i.setContentDescription(getContext().getString(com.tencent.mm.R.string.f489870e1));
                    return;
                } else if (i17 == 3) {
                    this.f74415i.setVisibility(0);
                    this.f74415i.setContentDescription(getContext().getString(com.tencent.mm.R.string.f489915fb));
                    return;
                } else if (i17 != 4) {
                    this.f74415i.setVisibility(8);
                    return;
                }
            }
            this.f74415i.setVisibility(8);
            return;
        }
        this.f74415i.setImageResource(com.tencent.mm.R.drawable.f481913aj3);
        this.f74415i.setContentDescription(getContext().getString(com.tencent.mm.R.string.f490919b91));
        if (i17 != 0 && i17 != 1) {
            if (i17 == 2) {
                this.f74415i.setVisibility(0);
                this.f74415i.setContentDescription(getContext().getString(com.tencent.mm.R.string.f489870e1));
                return;
            } else if (i17 == 3) {
                this.f74415i.setVisibility(0);
                this.f74415i.setContentDescription(getContext().getString(com.tencent.mm.R.string.f489915fb));
                return;
            } else if (i17 != 4 && i17 != 5) {
                this.f74415i.setVisibility(8);
                return;
            }
        }
        if (z17) {
            this.f74415i.setVisibility(0);
        } else {
            this.f74415i.setVisibility(8);
        }
    }

    public java.lang.String getText() {
        return this.f74414h.getText().toString();
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f74412f;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this, z17);
        }
        com.tencent.mm.plugin.address.ui.s sVar = this.f74411e;
        if (sVar != null) {
            ((com.tencent.mm.plugin.address.ui.AddInvoiceUI) sVar).T6();
        }
        if (this.f74421r) {
            this.f74413g.setEnabled(true);
        } else {
            this.f74413g.setEnabled(false);
        }
        if (view == this.f74414h) {
            android.graphics.Rect rect = new android.graphics.Rect();
            a(this, rect);
            if (z17) {
                setBackgroundResource(com.tencent.mm.R.drawable.c7a);
            } else {
                setBackgroundResource(com.tencent.mm.R.drawable.c7b);
            }
            setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
        d(z17);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.f74420q) {
            if (!((this.f74415i.getVisibility() == 0) && getValidRectOfInfoIv().contains((int) motionEvent.getX(), (int) motionEvent.getY()))) {
                return true;
            }
        }
        return false;
    }

    public void setBankNumberValStr(java.lang.String str) {
        if (this.f74419p == 5) {
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
        this.f74414h.setText(str);
        android.widget.EditText editText = this.f74414h;
        editText.setSelection(editText.getText().length());
    }

    public void setEditBG(int i17) {
        if (this.f74414h != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            a(this.f74414h, rect);
            this.f74414h.setBackgroundResource(i17);
            this.f74414h.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public void setEllipsize(android.text.TextUtils.TruncateAt truncateAt) {
        this.f74414h.setEllipsize(truncateAt);
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        super.setEnabled(z17);
        this.f74420q = z17;
        this.f74415i.setEnabled(true);
    }

    public void setHintStr(java.lang.String str) {
        this.f74414h.setHint(str);
    }

    public void setImeOptions(int i17) {
        this.f74414h.setImeOptions(i17);
    }

    public void setInfoIvOnClickListener(com.tencent.mm.plugin.address.ui.q qVar) {
    }

    public void setInfoIvVisible(int i17) {
        this.f74415i.setVisibility(i17);
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        super.setOnFocusChangeListener(onFocusChangeListener);
        this.f74412f = onFocusChangeListener;
    }

    public void setOnInputInvoiceTypeChangeListener(com.tencent.mm.plugin.address.ui.r rVar) {
    }

    public void setOnInputValidChangeListener(com.tencent.mm.plugin.address.ui.s sVar) {
        this.f74411e = sVar;
    }

    public void setTipStr(java.lang.String str) {
        this.f74413g.setText(str);
    }

    public void setTipTextColor(int i17) {
        android.widget.TextView textView = this.f74413g;
        if (textView != null) {
            textView.setTextColor(i17);
        }
    }

    public void setValStr(java.lang.String str) {
        this.f74414h.setText(str);
        android.widget.EditText editText = this.f74414h;
        editText.setSelection(editText.getText().length());
        this.f74423t = str;
    }

    public InvoiceEditView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
