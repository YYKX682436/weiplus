package com.tencent.mm.plugin.address.ui;

/* loaded from: classes5.dex */
public class InvoiceQrcodeTextView extends android.widget.RelativeLayout implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f74433d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f74434e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f74435f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f74436g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f74437h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f74438i;

    /* renamed from: m, reason: collision with root package name */
    public final int f74439m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f74440n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f74441o;

    /* renamed from: p, reason: collision with root package name */
    public int f74442p;

    /* renamed from: q, reason: collision with root package name */
    public int f74443q;

    public InvoiceQrcodeTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f74437h = "";
        this.f74438i = "";
        this.f74439m = -1;
        this.f74440n = true;
        this.f74441o = false;
        com.tencent.mm.plugin.address.ui.h0 h0Var = new com.tencent.mm.plugin.address.ui.h0(this);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rj.t.f396155e, i17, 0);
        int resourceId = obtainStyledAttributes.getResourceId(7, 0);
        if (resourceId != 0) {
            this.f74437h = context.getString(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(13, 0);
        if (resourceId2 != 0) {
            this.f74438i = context.getString(resourceId2);
        }
        obtainStyledAttributes.getInteger(3, 1);
        this.f74439m = obtainStyledAttributes.getInteger(5, 0);
        this.f74440n = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getInt(0, 19);
        int integer = obtainStyledAttributes.getInteger(4, 5);
        obtainStyledAttributes.getResourceId(1, com.tencent.mm.R.drawable.f482190b84);
        int resourceId3 = obtainStyledAttributes.getResourceId(10, -1);
        obtainStyledAttributes.getResourceId(8, com.tencent.mm.R.drawable.f482190b84);
        boolean z17 = obtainStyledAttributes.getBoolean(12, true);
        obtainStyledAttributes.recycle();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bli, (android.view.ViewGroup) this, true);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.h0c);
        this.f74435f = textView;
        textView.setTextSize(0, i65.a.h(context, com.tencent.mm.R.dimen.f479897ia));
        this.f74434e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o_q);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.hco);
        this.f74436g = imageView;
        imageView.setOnClickListener(h0Var);
        this.f74435f.setImeOptions(integer);
        java.lang.String str = this.f74437h;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f74435f.setHint(str);
        }
        java.lang.String str2 = this.f74438i;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            this.f74434e.setText(str2);
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        a(this.f74435f, rect);
        this.f74435f.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        setPadding(i65.a.b(getContext(), 8), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        if (resourceId3 != -1) {
            this.f74436g.setImageResource(resourceId3);
        }
        if (!z17) {
            this.f74435f.setSingleLine(false);
        }
        this.f74435f.setOnTouchListener(new com.tencent.mm.plugin.address.ui.c0(this));
        this.f74435f.setOnLongClickListener(new com.tencent.mm.plugin.address.ui.g0(this));
    }

    private android.graphics.Rect getValidRectOfInfoIv() {
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f74436g.getHitRect(rect);
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
        this.f74434e.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479232tk));
        this.f74435f.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
        this.f74435f.setInputType(0);
        this.f74435f.clearFocus();
        this.f74435f.setSingleLine(false);
        ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f74435f.getWindowToken(), 0);
    }

    public final void c(boolean z17) {
        boolean z18 = this.f74440n;
        int i17 = this.f74439m;
        if (!z18 || com.tencent.mm.sdk.platformtools.t8.K0(getText())) {
            if (i17 != 0 && i17 != 1) {
                if (i17 == 2) {
                    this.f74436g.setVisibility(0);
                    this.f74436g.setContentDescription(getContext().getString(com.tencent.mm.R.string.f489870e1));
                    return;
                } else if (i17 == 3) {
                    this.f74436g.setVisibility(0);
                    this.f74436g.setContentDescription(getContext().getString(com.tencent.mm.R.string.f489915fb));
                    return;
                } else if (i17 != 4) {
                    this.f74436g.setVisibility(8);
                    return;
                }
            }
            this.f74436g.setVisibility(8);
            return;
        }
        this.f74436g.setImageResource(com.tencent.mm.R.drawable.f481913aj3);
        this.f74436g.setContentDescription(getContext().getString(com.tencent.mm.R.string.f490919b91));
        if (i17 != 0 && i17 != 1) {
            if (i17 == 2) {
                this.f74436g.setVisibility(0);
                this.f74436g.setContentDescription(getContext().getString(com.tencent.mm.R.string.f489870e1));
                return;
            } else if (i17 == 3) {
                this.f74436g.setVisibility(0);
                this.f74436g.setContentDescription(getContext().getString(com.tencent.mm.R.string.f489915fb));
                return;
            } else if (i17 != 4 && i17 != 5) {
                this.f74436g.setVisibility(8);
                return;
            }
        }
        if (z17) {
            this.f74436g.setVisibility(0);
        } else {
            this.f74436g.setVisibility(8);
        }
    }

    public java.lang.String getText() {
        return this.f74435f.getText().toString();
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f74433d;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this, z17);
        }
        if (this.f74441o) {
            this.f74434e.setEnabled(true);
        } else {
            this.f74434e.setEnabled(false);
        }
        if (view == this.f74435f) {
            android.graphics.Rect rect = new android.graphics.Rect();
            a(this, rect);
            if (z17) {
                setBackgroundResource(com.tencent.mm.R.drawable.c7a);
            } else {
                setBackgroundResource(com.tencent.mm.R.drawable.c7b);
            }
            setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
        c(z17);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.f74440n) {
            if (!((this.f74436g.getVisibility() == 0) && getValidRectOfInfoIv().contains((int) motionEvent.getX(), (int) motionEvent.getY()))) {
                return true;
            }
        }
        return false;
    }

    public void setBankNumberValStr(java.lang.String str) {
        if (this.f74439m == 5) {
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
        this.f74435f.setText(str);
    }

    public void setEditBG(int i17) {
        if (this.f74435f != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            a(this.f74435f, rect);
            this.f74435f.setBackgroundResource(i17);
            this.f74435f.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public void setEllipsize(android.text.TextUtils.TruncateAt truncateAt) {
        this.f74435f.setEllipsize(truncateAt);
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        super.setEnabled(z17);
        this.f74440n = z17;
        this.f74436g.setEnabled(true);
    }

    public void setHintStr(java.lang.String str) {
        this.f74435f.setHint(str);
    }

    public void setImeOptions(int i17) {
        this.f74435f.setImeOptions(i17);
    }

    public void setInfoIvOnClickListener(com.tencent.mm.plugin.address.ui.i0 i0Var) {
    }

    public void setInfoIvVisible(int i17) {
        this.f74436g.setVisibility(i17);
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        super.setOnFocusChangeListener(onFocusChangeListener);
        this.f74433d = onFocusChangeListener;
    }

    public void setOnInputInvoiceTypeChangeListener(com.tencent.mm.plugin.address.ui.j0 j0Var) {
    }

    public void setOnInputValidChangeListener(com.tencent.mm.plugin.address.ui.k0 k0Var) {
    }

    public void setTipStr(java.lang.String str) {
        this.f74434e.setText(str);
    }

    public void setTipTextColor(int i17) {
        android.widget.TextView textView = this.f74434e;
        if (textView != null) {
            textView.setTextColor(i17);
        }
    }

    public void setValStr(java.lang.String str) {
        this.f74435f.setText(str);
    }

    public InvoiceQrcodeTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
