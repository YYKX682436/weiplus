package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* loaded from: classes15.dex */
public class x0 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.t0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.NumberPicker f293875d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.NumberPicker f293876e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.NumberPicker f293877f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.LinearLayout f293878g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.EditText f293879h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.EditText f293880i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.EditText f293881j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.CalendarView f293882k;

    /* renamed from: l, reason: collision with root package name */
    public final java.text.DateFormat f293883l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String[] f293884m;

    /* renamed from: n, reason: collision with root package name */
    public int f293885n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.Calendar f293886o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.Calendar f293887p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.Calendar f293888q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.Calendar f293889r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f293890s;

    public x0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22710xb9ba704 c22710xb9ba704, android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(c22710xb9ba704, context);
        android.widget.LinearLayout linearLayout;
        this.f293883l = new java.text.SimpleDateFormat("MM/dd/yyyy");
        this.f293890s = true;
        this.f293865a = c22710xb9ba704;
        this.f293866b = context;
        a(java.util.Locale.getDefault());
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f544632f, i17, i18);
        boolean z17 = obtainStyledAttributes.getBoolean(16, true);
        boolean z18 = obtainStyledAttributes.getBoolean(1, true);
        int i19 = obtainStyledAttributes.getInt(17, 1900);
        int i27 = obtainStyledAttributes.getInt(5, 2100);
        java.lang.String string = obtainStyledAttributes.getString(15);
        java.lang.String string2 = obtainStyledAttributes.getString(14);
        int resourceId = obtainStyledAttributes.getResourceId(13, com.p314xaae8f345.mm.R.C30864xbddafb2a.a3j);
        obtainStyledAttributes.recycle();
        ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(resourceId, (android.view.ViewGroup) this.f293865a, true);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.v0 v0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.v0(this);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) this.f293865a.findViewById(com.p314xaae8f345.mm.R.id.kvu);
        this.f293878g = linearLayout2;
        android.widget.CalendarView calendarView = (android.widget.CalendarView) this.f293865a.findViewById(com.p314xaae8f345.mm.R.id.f565067b50);
        this.f293882k = calendarView;
        calendarView.setOnDateChangeListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.w0(this));
        android.widget.NumberPicker numberPicker = (android.widget.NumberPicker) this.f293865a.findViewById(com.p314xaae8f345.mm.R.id.cqu);
        this.f293875d = numberPicker;
        numberPicker.setFormatter(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.r0());
        numberPicker.setOnLongPressUpdateInterval(100L);
        numberPicker.setOnValueChangedListener(v0Var);
        this.f293879h = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.b(numberPicker);
        android.widget.NumberPicker numberPicker2 = (android.widget.NumberPicker) this.f293865a.findViewById(com.p314xaae8f345.mm.R.id.jqd);
        this.f293876e = numberPicker2;
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(this.f293885n - 1);
        numberPicker2.setDisplayedValues(this.f293884m);
        numberPicker2.setOnLongPressUpdateInterval(200L);
        numberPicker2.setOnValueChangedListener(v0Var);
        this.f293880i = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.b(numberPicker2);
        android.widget.NumberPicker numberPicker3 = (android.widget.NumberPicker) this.f293865a.findViewById(com.p314xaae8f345.mm.R.id.pta);
        this.f293877f = numberPicker3;
        numberPicker3.setOnLongPressUpdateInterval(100L);
        numberPicker3.setOnValueChangedListener(v0Var);
        this.f293881j = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.b(numberPicker3);
        if (z17 || z18) {
            linearLayout = linearLayout2;
            linearLayout.setVisibility(z17 ? 0 : 8);
            calendarView.setVisibility(z18 ? 0 : 8);
        } else {
            linearLayout = linearLayout2;
            linearLayout.setVisibility(0);
        }
        this.f293886o.clear();
        if (android.text.TextUtils.isEmpty(string)) {
            this.f293886o.set(i19, 0, 1);
        } else if (!c(string, this.f293886o)) {
            this.f293886o.set(i19, 0, 1);
        }
        g(this.f293886o.getTimeInMillis());
        this.f293886o.clear();
        if (android.text.TextUtils.isEmpty(string2)) {
            this.f293886o.set(i27, 11, 31);
        } else if (!c(string2, this.f293886o)) {
            this.f293886o.set(i27, 11, 31);
        }
        f(this.f293886o.getTimeInMillis());
        this.f293889r.setTimeInMillis(java.lang.System.currentTimeMillis());
        d(this.f293889r.get(1), this.f293889r.get(2), this.f293889r.get(5));
        i();
        h();
        linearLayout.removeAllViews();
        char[] dateFormatOrder = this.f293865a.getLayoutDirection() == 0 ? new char[]{'y', 'M', 'd'} : android.text.format.DateFormat.getDateFormatOrder(this.f293865a.getContext());
        int length = dateFormatOrder.length;
        for (int i28 = 0; i28 < length; i28++) {
            char c17 = dateFormatOrder[i28];
            if (c17 == 'M') {
                android.widget.NumberPicker numberPicker4 = this.f293876e;
                linearLayout.addView(numberPicker4);
                e(numberPicker4, length, i28);
            } else if (c17 == 'd') {
                android.widget.NumberPicker numberPicker5 = this.f293875d;
                linearLayout.addView(numberPicker5);
                e(numberPicker5, length, i28);
            } else {
                if (c17 != 'y') {
                    throw new java.lang.IllegalArgumentException(java.util.Arrays.toString(dateFormatOrder));
                }
                android.widget.NumberPicker numberPicker6 = this.f293877f;
                linearLayout.addView(numberPicker6);
                e(numberPicker6, length, i28);
            }
        }
        if (this.f293865a.getImportantForAccessibility() == 0) {
            this.f293865a.setImportantForAccessibility(1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.t0
    public void a(java.util.Locale locale) {
        if (!locale.equals(this.f293867c)) {
            this.f293867c = locale;
        }
        this.f293886o = b(this.f293886o, locale);
        this.f293887p = b(this.f293887p, locale);
        this.f293888q = b(this.f293888q, locale);
        this.f293889r = b(this.f293889r, locale);
        this.f293885n = this.f293886o.getActualMaximum(2) + 1;
        java.lang.String[] shortMonths = new java.text.DateFormatSymbols().getShortMonths();
        this.f293884m = shortMonths;
        int i17 = 0;
        if (java.lang.Character.isDigit(shortMonths[0].charAt(0))) {
            this.f293884m = new java.lang.String[this.f293885n];
            while (i17 < this.f293885n) {
                int i18 = i17 + 1;
                this.f293884m[i17] = java.lang.String.format("%d", java.lang.Integer.valueOf(i18));
                i17 = i18;
            }
        }
    }

    public final java.util.Calendar b(java.util.Calendar calendar, java.util.Locale locale) {
        if (calendar == null) {
            return java.util.Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale);
        calendar2.setTimeInMillis(timeInMillis);
        return calendar2;
    }

    public final boolean c(java.lang.String str, java.util.Calendar calendar) {
        try {
            calendar.setTime(this.f293883l.parse(str));
            return true;
        } catch (java.text.ParseException unused) {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22710xb9ba704.f293771e;
            com.p314xaae8f345.mm.ui.yk.f("YADatePicker", "Date: " + str + " not in format: MM/dd/yyyy", new java.lang.Object[0]);
            return false;
        }
    }

    public final void d(int i17, int i18, int i19) {
        this.f293889r.set(i17, i18, i19);
        if (this.f293889r.before(this.f293887p)) {
            this.f293889r.setTimeInMillis(this.f293887p.getTimeInMillis());
        } else if (this.f293889r.after(this.f293888q)) {
            this.f293889r.setTimeInMillis(this.f293888q.getTimeInMillis());
        }
    }

    public final void e(android.widget.NumberPicker numberPicker, int i17, int i18) {
        int i19 = i18 < i17 + (-1) ? 5 : 6;
        android.widget.EditText b17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.b(numberPicker);
        if (b17 != null) {
            b17.setImeOptions(i19);
        }
    }

    public void f(long j17) {
        this.f293886o.setTimeInMillis(j17);
        if (this.f293886o.get(1) != this.f293888q.get(1) || this.f293886o.get(6) == this.f293888q.get(6)) {
            this.f293888q.setTimeInMillis(j17);
            this.f293882k.setMaxDate(j17);
            if (this.f293889r.after(this.f293888q)) {
                this.f293889r.setTimeInMillis(this.f293888q.getTimeInMillis());
                h();
            }
            i();
        }
    }

    public void g(long j17) {
        this.f293886o.setTimeInMillis(j17);
        if (this.f293886o.get(1) != this.f293887p.get(1) || this.f293886o.get(6) == this.f293887p.get(6)) {
            this.f293887p.setTimeInMillis(j17);
            this.f293882k.setMinDate(j17);
            if (this.f293889r.before(this.f293887p)) {
                this.f293889r.setTimeInMillis(this.f293887p.getTimeInMillis());
                h();
            }
            i();
        }
    }

    public final void h() {
        this.f293882k.setDate(this.f293889r.getTimeInMillis(), false, false);
    }

    public final void i() {
        boolean equals = this.f293889r.equals(this.f293887p);
        android.widget.NumberPicker numberPicker = this.f293875d;
        android.widget.NumberPicker numberPicker2 = this.f293876e;
        if (equals) {
            numberPicker.setMinValue(this.f293889r.get(5));
            numberPicker.setMaxValue(this.f293889r.getActualMaximum(5));
            numberPicker.setWrapSelectorWheel(false);
            numberPicker2.setDisplayedValues(null);
            numberPicker2.setMinValue(this.f293889r.get(2));
            numberPicker2.setMaxValue(this.f293889r.getActualMaximum(2));
            numberPicker2.setWrapSelectorWheel(false);
        } else if (this.f293889r.equals(this.f293888q)) {
            numberPicker.setMinValue(this.f293889r.getActualMinimum(5));
            numberPicker.setMaxValue(this.f293889r.get(5));
            numberPicker.setWrapSelectorWheel(false);
            numberPicker2.setDisplayedValues(null);
            numberPicker2.setMinValue(this.f293889r.getActualMinimum(2));
            numberPicker2.setMaxValue(this.f293889r.get(2));
            numberPicker2.setWrapSelectorWheel(false);
        } else {
            numberPicker.setMinValue(1);
            numberPicker.setMaxValue(this.f293889r.getActualMaximum(5));
            numberPicker.setWrapSelectorWheel(true);
            numberPicker2.setDisplayedValues(null);
            numberPicker2.setMinValue(0);
            numberPicker2.setMaxValue(11);
            numberPicker2.setWrapSelectorWheel(true);
        }
        numberPicker2.setDisplayedValues((java.lang.String[]) java.util.Arrays.copyOfRange(this.f293884m, numberPicker2.getMinValue(), numberPicker2.getMaxValue() + 1));
        int i17 = this.f293887p.get(1);
        android.widget.NumberPicker numberPicker3 = this.f293877f;
        numberPicker3.setMinValue(i17);
        numberPicker3.setMaxValue(this.f293888q.get(1));
        numberPicker3.setWrapSelectorWheel(false);
        numberPicker3.setValue(this.f293889r.get(1));
        numberPicker2.setValue(this.f293889r.get(2));
        numberPicker.setValue(this.f293889r.get(5));
        if (java.lang.Character.isDigit(this.f293884m[0].charAt(0))) {
            this.f293880i.setRawInputType(2);
        }
    }
}
