package com.p314xaae8f345.mm.p2802xd031a825.ui;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.wallet_core.ui.EditHintView */
/* loaded from: classes9.dex */
public class ViewOnFocusChangeListenerC22900x495c6e16 extends android.widget.RelativeLayout implements android.view.View.OnFocusChangeListener {
    public android.app.DatePickerDialog A;
    public int B;
    public int C;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 D;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f295603d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f295604e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f295605f;

    /* renamed from: g, reason: collision with root package name */
    public com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 f295606g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f295607h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f295608i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f295609m;

    /* renamed from: n, reason: collision with root package name */
    public int f295610n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f295611o;

    /* renamed from: p, reason: collision with root package name */
    public int f295612p;

    /* renamed from: q, reason: collision with root package name */
    public final int f295613q;

    /* renamed from: r, reason: collision with root package name */
    public int f295614r;

    /* renamed from: s, reason: collision with root package name */
    public final int f295615s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f295616t;

    /* renamed from: u, reason: collision with root package name */
    public int f295617u;

    /* renamed from: v, reason: collision with root package name */
    public final int f295618v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f295619w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f295620x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f295621y;

    /* renamed from: z, reason: collision with root package name */
    public int f295622z;

    public ViewOnFocusChangeListenerC22900x495c6e16(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        boolean z17;
        this.f295608i = "";
        this.f295609m = "";
        this.f295610n = 1;
        this.f295611o = true;
        this.f295612p = -1;
        this.f295613q = 1;
        this.f295614r = -1;
        this.f295615s = -1;
        this.f295616t = false;
        this.f295617u = 1;
        this.f295618v = -1;
        this.f295619w = true;
        this.f295620x = true;
        this.f295621y = null;
        this.f295622z = 0;
        this.A = null;
        this.B = 0;
        this.C = 0;
        com.p314xaae8f345.mm.p2802xd031a825.ui.i iVar = new com.p314xaae8f345.mm.p2802xd031a825.ui.i(this);
        this.D = null;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.j.f270111a, i17, 0);
        int resourceId = obtainStyledAttributes.getResourceId(8, 0);
        if (resourceId != 0) {
            this.f295608i = context.getString(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(13, 0);
        if (resourceId2 != 0) {
            this.f295609m = context.getString(resourceId2);
        }
        this.f295610n = obtainStyledAttributes.getInteger(4, 1);
        this.f295619w = obtainStyledAttributes.getBoolean(7, true);
        int i18 = obtainStyledAttributes.getInt(0, 19);
        this.f295611o = obtainStyledAttributes.getBoolean(2, true);
        this.f295612p = obtainStyledAttributes.getInteger(11, -1);
        int integer = obtainStyledAttributes.getInteger(6, 0);
        this.f295615s = integer;
        int integer2 = obtainStyledAttributes.getInteger(5, 5);
        int color = obtainStyledAttributes.getColor(10, com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
        this.f295618v = color;
        int resourceId3 = obtainStyledAttributes.getResourceId(1, -1);
        int resourceId4 = obtainStyledAttributes.getResourceId(9, com.p314xaae8f345.mm.R.C30861xcebc809e.f562935sd);
        this.f295613q = obtainStyledAttributes.getInteger(12, 1);
        boolean z18 = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570253a53, (android.view.ViewGroup) this, true);
        this.f295606g = (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359) inflate.findViewById(com.p314xaae8f345.mm.R.id.h0c);
        this.f295604e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o_q);
        this.f295605f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567920l26);
        this.f295607h = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hco);
        this.f295606g.setImeOptions(integer2);
        switch (integer) {
            case 0:
            case 10:
                break;
            case 1:
                this.f295612p = 25;
                this.f295606g.m121622x6347c2af(true);
                this.f295610n = 2;
                break;
            case 2:
            case 9:
                this.f295612p = 30;
                this.f295610n = 3;
                break;
            case 3:
                this.f295619w = false;
                this.f295606g.m121630x744cf207(true);
                setOnClickListener(new com.p314xaae8f345.mm.p2802xd031a825.ui.h(this));
                break;
            case 4:
                this.f295612p = 4;
                this.f295610n = 2;
                break;
            case 5:
                this.f295612p = 18;
                this.f295610n = 4;
                break;
            case 6:
                this.f295612p = 6;
                this.f295604e.setVisibility(8);
                this.f295610n = 2;
                break;
            case 7:
            case 17:
                this.f295612p = 6;
                this.f295604e.setVisibility(8);
                this.f295606g.m121628xbc8182be(true, true);
                this.f295606g.setImeOptions(6);
                this.f295610n = 128;
                break;
            case 8:
                this.f295610n = 32;
                break;
            case 11:
            default:
                this.f295610n = 1;
                break;
            case 12:
                this.f295612p = 12;
                this.f295606g.m121627xf65f6f83(true);
                break;
            case 13:
            case 16:
                this.f295606g.m121629x930fe401(true);
                break;
            case 14:
                this.f295612p = 3;
                this.f295604e.setVisibility(8);
                this.f295606g.m121625x85af8146(true);
                this.f295606g.setImeOptions(6);
                this.f295610n = 128;
                break;
            case 15:
                this.f295612p = 4;
                this.f295604e.setVisibility(8);
                this.f295606g.m121624x1f38bf20(true);
                this.f295606g.setImeOptions(6);
                this.f295610n = 128;
                break;
        }
        b();
        this.f295606g.setSingleLine(z18);
        if (!z18) {
            this.f295606g.setMaxLines(1073741823);
        }
        this.f295607h.setOnClickListener(iVar);
        this.f295606g.addTextChangedListener(new com.p314xaae8f345.mm.p2802xd031a825.ui.a(this));
        this.f295606g.setOnFocusChangeListener(this);
        java.lang.String str = this.f295608i;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f295606g.setHint(str);
        }
        java.lang.String str2 = this.f295609m;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            this.f295604e.setText(str2);
        }
        this.f295606g.setGravity(i18);
        int i19 = this.f295610n;
        if (i19 == 2) {
            this.f295606g.setKeyListener(new com.p314xaae8f345.mm.p2802xd031a825.ui.b(this));
        } else if (i19 == 4) {
            this.f295606g.setKeyListener(new com.p314xaae8f345.mm.p2802xd031a825.ui.c(this));
        } else if (i19 == 128) {
            this.f295606g.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
            this.f295606g.setKeyListener(new com.p314xaae8f345.mm.p2802xd031a825.ui.d(this));
            this.f295606g.setRawInputType(18);
        } else if (i19 == 3) {
            this.f295606g.setKeyListener(new com.p314xaae8f345.mm.p2802xd031a825.ui.e(this));
        } else {
            this.f295606g.setInputType(i19);
        }
        if (this.f295612p != -1) {
            z17 = false;
            this.f295606g.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(this.f295612p)});
        } else {
            z17 = false;
        }
        super.setEnabled(true);
        super.setClickable(true);
        if (!this.f295611o) {
            this.f295606g.setEnabled(z17);
            this.f295606g.setTextColor(getResources().getColor(color));
            this.f295606g.setFocusable(z17);
            this.f295606g.setClickable(z17);
            this.f295606g.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563723b84);
            setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bfj);
        }
        if (!this.f295619w) {
            this.f295616t = true;
            this.f295606g.setEnabled(z17);
            this.f295606g.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560843vq));
            this.f295606g.setFocusable(z17);
            this.f295606g.setClickable(z17);
            this.f295606g.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563723b84);
            setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2);
        } else {
            this.f295616t = z17;
            this.f295606g.setBackgroundResource(resourceId4);
            setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563723b84);
        }
        if (resourceId3 > 0) {
            setBackgroundResource(resourceId3);
        }
        android.widget.TextView textView = this.f295604e;
        if (textView != null && this.f295614r != -1) {
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = this.f295614r;
            this.f295604e.setLayoutParams(layoutParams);
        }
        if (c01.z1.I()) {
            this.f295606g.m121635xbde60dac(new kp5.a(m83057xeed7c209()));
        }
    }

    /* renamed from: getEncryptType */
    private int m83057xeed7c209() {
        int i17 = this.f295615s;
        if (i17 == 1) {
            return 50;
        }
        if (i17 == 4) {
            return 30;
        }
        if (i17 == 6) {
            return 60;
        }
        if (i17 == 7) {
            return 20;
        }
        switch (i17) {
            case 13:
                return 40;
            case 14:
            case 15:
                return 30;
            case 16:
                return -20;
            case 17:
                return -10;
            default:
                return 0;
        }
    }

    /* renamed from: getValidRectOfInfoIv */
    private android.graphics.Rect m83058x330fe29c() {
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f295607h.getHitRect(rect);
        rect.left -= 50;
        rect.right += 50;
        rect.top -= 25;
        rect.bottom += 25;
        return rect;
    }

    /* renamed from: setValStrForce */
    private void m83059x9b4447b9(java.lang.String str) {
        android.text.method.KeyListener keyListener = this.f295606g.getKeyListener();
        this.f295606g.setKeyListener(null);
        setEnabled(false);
        setClickable(false);
        m83081x27317652(str);
        this.f295606g.setKeyListener(keyListener);
    }

    public boolean a() {
        if (!this.f295619w && !this.f295611o) {
            return true;
        }
        int i17 = this.f295615s;
        if (i17 == 1) {
            return this.f295606g.m121605x7cde7910();
        }
        if (i17 == 12) {
            return this.f295606g.m121607x245c69ae();
        }
        if (i17 != 17) {
            if (i17 == 4) {
                return this.f295606g.m121601xbad2461a() >= 1;
            }
            if (i17 == 5) {
                return this.f295606g.m121604xff9f1dc4(this.f295617u);
            }
            if (i17 != 7) {
                return i17 != 8 ? i17 != 9 ? i17 != 14 ? i17 != 15 ? this.f295606g.m121601xbad2461a() >= this.f295613q : this.f295606g.m121601xbad2461a() == 4 : this.f295606g.m121601xbad2461a() == 3 : this.f295606g.m121608x846a7e82() : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Y0(this.f295606g.getText().toString());
            }
        }
        return this.f295606g.m121601xbad2461a() == 6;
    }

    public final void b() {
        int i17 = this.f295615s;
        if (i17 == 7 || i17 == 14 || i17 == 15) {
            return;
        }
        if (this.f295619w && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m83062xfb85ada3())) {
            this.f295607h.setVisibility(0);
            this.f295607h.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563446aj3);
            return;
        }
        if (i17 == 1) {
            if (!this.f295620x) {
                this.f295607h.setVisibility(8);
                return;
            } else {
                this.f295607h.setVisibility(0);
                this.f295607h.setImageResource(com.p314xaae8f345.mm.R.raw.f81361x88cfa7e1);
                return;
            }
        }
        if (i17 != 3 && i17 != 4 && i17 != 9 && i17 != 10) {
            this.f295607h.setVisibility(8);
        } else {
            this.f295607h.setVisibility(0);
            this.f295607h.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563556bl2);
        }
    }

    /* renamed from: get3DesEncrptData */
    public java.lang.String m83060x7d902dbb() {
        return this.f295606g.m121591x7d902dbb();
    }

    /* renamed from: getMD5Value */
    public java.lang.String m83061x233c8fe9() {
        java.lang.String obj;
        if (this.f295615s == 3) {
            java.lang.String str = this.f295621y;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            obj = str.replace("/", "");
        } else {
            obj = this.f295606g.getText().toString();
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(obj);
    }

    /* renamed from: getText */
    public java.lang.String m83062xfb85ada3() {
        switch (this.f295615s) {
            case 0:
            case 8:
            case 10:
                java.lang.String obj = this.f295606g.getText().toString();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                return obj == null ? "" : obj;
            case 1:
            case 13:
            case 16:
                com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f295606g;
                com.p314xaae8f345.mm.p2802xd031a825.b.a().g();
                return c28001xdd2bb359.m121598x15a9108d(false, true);
            case 2:
            case 9:
                java.lang.String obj2 = this.f295606g.getText().toString();
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                return obj2 == null ? "" : obj2;
            case 3:
                java.lang.String str = this.f295621y;
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str == null) {
                    str = "";
                }
                return str.replace("/", "");
            case 4:
            case 14:
            case 15:
                return this.f295606g.m121591x7d902dbb();
            case 5:
                return this.f295606g.m121591x7d902dbb();
            case 6:
                return this.f295606g.m121593xa958131b();
            case 7:
                com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3592 = this.f295606g;
                com.p314xaae8f345.mm.p2802xd031a825.b.a().g();
                return c28001xdd2bb3592.m121598x15a9108d(true, true);
            case 11:
            case 12:
            default:
                java.lang.String obj3 = this.f295606g.getText().toString();
                boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                return obj3 == null ? "" : obj3;
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f295603d;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this, z17);
        }
        if (this.f295616t) {
            this.f295604e.setEnabled(true);
        } else {
            this.f295604e.setEnabled(false);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.f295619w) {
            if (!((this.f295607h.getVisibility() == 0) && m83058x330fe29c().contains((int) motionEvent.getX(), (int) motionEvent.getY()))) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.f295615s;
        if (i19 == 7 || i19 == 17 || i19 == 14 || i19 == 15) {
            setMeasuredDimension(android.view.View.getDefaultSize(com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(getContext(), 960.0f), i17), android.view.View.getDefaultSize(com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(getContext(), 720.0f), i18));
            int measuredWidth = getMeasuredWidth();
            int i27 = (i19 == 7 || i19 == 17) ? measuredWidth / 6 : i19 == 14 ? measuredWidth / 3 : measuredWidth / 4;
            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i27, 1073741824);
            setMeasuredDimension(android.view.View.getDefaultSize(measuredWidth, makeMeasureSpec), android.view.View.getDefaultSize(i27, makeMeasureSpec2));
            i18 = makeMeasureSpec2;
            i17 = makeMeasureSpec;
        }
        super.onMeasure(i17, i18);
    }

    /* renamed from: set3DesValStr */
    public void m83063x9ef8cf1(java.lang.String str) {
        if (this.f295615s != 1) {
            this.f295606g.setText(str);
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f295606g;
            c28001xdd2bb359.setSelection(c28001xdd2bb359.getText().length());
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.length() > 5) {
            this.f295606g.m121611x458695c7(str);
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3592 = this.f295606g;
            c28001xdd2bb3592.setSelection(c28001xdd2bb3592.getText().length());
        } else {
            this.f295606g.setSelection(0);
            this.f295606g.m121611x458695c7(str);
            this.f295612p = 24 - str.length();
            this.f295606g.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(this.f295612p)});
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z17) {
        super.setClickable(z17);
        this.f295611o = z17;
        int i17 = this.f295618v;
        if (z17) {
            this.f295606g.setEnabled(true);
            if (this.f295619w) {
                this.f295606g.setTextColor(getResources().getColor(i17));
            } else {
                this.f295606g.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560843vq));
            }
            this.f295606g.setFocusable(true);
            this.f295606g.setClickable(true);
            return;
        }
        this.f295606g.setEnabled(false);
        if (this.f295619w) {
            this.f295606g.setTextColor(getResources().getColor(i17));
        } else {
            this.f295606g.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560839vm));
        }
        this.f295606g.setFocusable(false);
        this.f295606g.setClickable(false);
    }

    /* renamed from: setEditBG */
    public void m83064xa5872d1(int i17) {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f295606g;
        if (c28001xdd2bb359 != null) {
            c28001xdd2bb359.setBackgroundResource(i17);
        }
    }

    /* renamed from: setEllipsize */
    public void m83065xb86dec4b(android.text.TextUtils.TruncateAt truncateAt) {
        this.f295606g.setEllipsize(truncateAt);
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        super.setEnabled(z17);
        this.f295619w = z17;
        this.f295607h.setEnabled(true);
    }

    /* renamed from: setEncryptType */
    public void m83066x853d357d(int i17) {
        if (c01.z1.I()) {
            this.f295606g.m121635xbde60dac(new kp5.a(i17));
        }
    }

    /* renamed from: setHintStr */
    public void m83067xe8378f68(java.lang.String str) {
        this.f295606g.setHint(str);
    }

    /* renamed from: setIdentifyCardType */
    public void m83068x7e707a18(int i17) {
        this.f295617u = i17;
        if (i17 == 1) {
            this.f295606g.setKeyListener(new com.p314xaae8f345.mm.p2802xd031a825.ui.f(this));
        } else {
            this.f295606g.setInputType(1);
        }
    }

    /* renamed from: setImeOptions */
    public void m83069x843d819f(int i17) {
        this.f295606g.setImeOptions(i17);
    }

    /* renamed from: setInfoIvVisible */
    public void m83070x59990035(int i17) {
        this.f295607h.setVisibility(i17);
    }

    /* renamed from: setMaxLen */
    public void m83071x17db3113(int i17) {
        if (i17 != -1) {
            this.f295612p = i17;
            this.f295606g.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(i17)});
        }
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    /* renamed from: setOnEditorActionListener */
    public void m83072x37562b58(android.widget.TextView.OnEditorActionListener onEditorActionListener) {
        this.f295606g.setOnEditorActionListener(onEditorActionListener);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        super.setOnFocusChangeListener(onFocusChangeListener);
        this.f295603d = onFocusChangeListener;
    }

    /* renamed from: setOnInfoListener */
    public void m83073x40f8c003(com.p314xaae8f345.mm.p2802xd031a825.ui.k kVar) {
    }

    /* renamed from: setOnInputValidChangeListener */
    public void m83074x749e7e77(com.p314xaae8f345.mm.p2802xd031a825.ui.l lVar) {
    }

    /* renamed from: setPreFilledStr */
    public void m83075xd901478e(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f295605f.setText("");
            this.f295605f.setVisibility(8);
        } else {
            this.f295605f.setText(str);
            this.f295605f.setVisibility(0);
        }
    }

    /* renamed from: setPreText */
    public void m83076x9e37ebae(java.lang.String str) {
        android.text.method.KeyListener keyListener = this.f295606g.getKeyListener();
        this.f295606g.setInputType(1);
        this.f295606g.setKeyListener(null);
        m83081x27317652(str);
        this.f295606g.setKeyListener(keyListener);
        this.f295622z = 4;
    }

    /* renamed from: setShowScanCamera */
    public void m83077xb824f7e1(boolean z17) {
        this.f295620x = z17;
        b();
    }

    /* renamed from: setTipStr */
    public void m83078x243a5298(java.lang.String str) {
        this.f295604e.setText(str);
    }

    /* renamed from: setTipTextColor */
    public void m83079x3db6995d(int i17) {
        android.widget.TextView textView = this.f295604e;
        if (textView != null) {
            textView.setTextColor(i17);
        }
    }

    /* renamed from: setTipWidth */
    public void m83080xff23446d(int i17) {
        this.f295614r = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(getContext(), i17 * 1.0f);
        android.widget.TextView textView = this.f295604e;
        if (textView != null) {
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = this.f295614r;
            this.f295604e.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: setValStr */
    public void m83081x27317652(java.lang.String str) {
        if (this.f295615s != 1) {
            this.f295606g.setText(str);
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = this.f295606g;
            c28001xdd2bb359.setSelection(c28001xdd2bb359.getText().length());
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.length() > 5) {
            this.f295606g.setText(str);
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb3592 = this.f295606g;
            c28001xdd2bb3592.setSelection(c28001xdd2bb3592.getText().length());
        } else {
            this.f295606g.setSelection(0);
            this.f295606g.m121613x8f8ccf68(str);
            this.f295612p = 24 - str.length();
            this.f295606g.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(this.f295612p)});
        }
    }

    public ViewOnFocusChangeListenerC22900x495c6e16(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
