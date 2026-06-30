package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2759xbdc636c;

/* renamed from: com.tencent.mm.ui.widget.happybubble.LabelsView */
/* loaded from: classes13.dex */
public class ViewOnClickListenerC22697x158cd364 extends android.view.ViewGroup implements android.view.View.OnClickListener {
    public final java.util.ArrayList A;
    public final java.util.ArrayList B;
    public final java.util.ArrayList C;
    public ol5.k D;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f293640d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.res.ColorStateList f293641e;

    /* renamed from: f, reason: collision with root package name */
    public float f293642f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.drawable.Drawable f293643g;

    /* renamed from: h, reason: collision with root package name */
    public int f293644h;

    /* renamed from: i, reason: collision with root package name */
    public int f293645i;

    /* renamed from: m, reason: collision with root package name */
    public int f293646m;

    /* renamed from: n, reason: collision with root package name */
    public int f293647n;

    /* renamed from: o, reason: collision with root package name */
    public int f293648o;

    /* renamed from: p, reason: collision with root package name */
    public int f293649p;

    /* renamed from: q, reason: collision with root package name */
    public int f293650q;

    /* renamed from: r, reason: collision with root package name */
    public int f293651r;

    /* renamed from: s, reason: collision with root package name */
    public int f293652s;

    /* renamed from: t, reason: collision with root package name */
    public ol5.n f293653t;

    /* renamed from: u, reason: collision with root package name */
    public int f293654u;

    /* renamed from: v, reason: collision with root package name */
    public int f293655v;

    /* renamed from: w, reason: collision with root package name */
    public int f293656w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f293657x;

    /* renamed from: y, reason: collision with root package name */
    public int f293658y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f293659z;

    public ViewOnClickListenerC22697x158cd364(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f293644h = -2;
        this.f293645i = -2;
        this.f293646m = 17;
        this.f293657x = false;
        this.f293658y = 1;
        this.A = new java.util.ArrayList();
        this.B = new java.util.ArrayList();
        this.C = new java.util.ArrayList();
        this.f293640d = context;
        c(context, attributeSet);
        h();
    }

    public final int a(float f17) {
        return (int) android.util.TypedValue.applyDimension(1, f17, getResources().getDisplayMetrics());
    }

    public final void b() {
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            ((android.widget.TextView) getChildAt(i17)).setClickable((this.D == null && this.f293653t == ol5.n.NONE) ? false : true);
        }
    }

    public final void c(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.M);
            int i17 = obtainStyledAttributes.getInt(16, 1);
            ol5.n nVar = ol5.n.NONE;
            if (i17 != 1) {
                if (i17 == 2) {
                    nVar = ol5.n.SINGLE;
                } else if (i17 == 3) {
                    nVar = ol5.n.SINGLE_IRREVOCABLY;
                } else if (i17 == 4) {
                    nVar = ol5.n.MULTI;
                }
            }
            this.f293653t = nVar;
            this.f293654u = obtainStyledAttributes.getInteger(14, 0);
            this.f293655v = obtainStyledAttributes.getInteger(15, 0);
            this.f293656w = obtainStyledAttributes.getInteger(13, 0);
            this.f293659z = obtainStyledAttributes.getBoolean(0, false);
            this.f293646m = obtainStyledAttributes.getInt(2, this.f293646m);
            this.f293644h = obtainStyledAttributes.getLayoutDimension(11, this.f293644h);
            this.f293645i = obtainStyledAttributes.getLayoutDimension(4, this.f293645i);
            if (obtainStyledAttributes.hasValue(3)) {
                this.f293641e = obtainStyledAttributes.getColorStateList(3);
            } else {
                this.f293641e = android.content.res.ColorStateList.valueOf(-16777216);
            }
            this.f293642f = obtainStyledAttributes.getDimension(10, (int) android.util.TypedValue.applyDimension(2, 14.0f, getResources().getDisplayMetrics()));
            if (obtainStyledAttributes.hasValue(5)) {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                this.f293650q = dimensionPixelOffset;
                this.f293649p = dimensionPixelOffset;
                this.f293648o = dimensionPixelOffset;
                this.f293647n = dimensionPixelOffset;
            } else {
                this.f293647n = obtainStyledAttributes.getDimensionPixelOffset(7, a(10.0f));
                this.f293648o = obtainStyledAttributes.getDimensionPixelOffset(9, a(5.0f));
                this.f293649p = obtainStyledAttributes.getDimensionPixelOffset(8, a(10.0f));
                this.f293650q = obtainStyledAttributes.getDimensionPixelOffset(6, a(5.0f));
            }
            this.f293652s = obtainStyledAttributes.getDimensionPixelOffset(12, a(5.0f));
            this.f293651r = obtainStyledAttributes.getDimensionPixelOffset(18, a(5.0f));
            if (obtainStyledAttributes.hasValue(1)) {
                int resourceId = obtainStyledAttributes.getResourceId(1, 0);
                if (resourceId != 0) {
                    this.f293643g = getResources().getDrawable(resourceId);
                } else {
                    this.f293643g = new android.graphics.drawable.ColorDrawable(obtainStyledAttributes.getColor(1, 0));
                }
            } else {
                this.f293643g = getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562877qy);
            }
            this.f293657x = obtainStyledAttributes.getBoolean(17, false);
            obtainStyledAttributes.recycle();
        }
    }

    public final void d() {
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            f((android.widget.TextView) getChildAt(i17), false);
        }
        this.B.clear();
    }

    public final int e(int i17, int i18) {
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        if (mode == 1073741824) {
            i18 = size;
        } else if (mode == Integer.MIN_VALUE) {
            i18 = java.lang.Math.min(i18, size);
        }
        return android.view.View.resolveSizeAndState(java.lang.Math.max(i18, getSuggestedMinimumWidth()), i17, 0);
    }

    public final void f(android.widget.TextView textView, boolean z17) {
        if (textView.isSelected() != z17) {
            textView.setSelected(z17);
            java.util.ArrayList arrayList = this.B;
            if (z17) {
                arrayList.add((java.lang.Integer) textView.getTag(com.p314xaae8f345.mm.R.id.nwq));
            } else {
                arrayList.remove((java.lang.Integer) textView.getTag(com.p314xaae8f345.mm.R.id.nwq));
            }
        }
    }

    public void g(java.util.List list, ol5.j jVar) {
        d();
        removeAllViews();
        java.util.ArrayList arrayList = this.A;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
            int size = list.size();
            for (int i17 = 0; i17 < size; i17++) {
                java.lang.Object obj = list.get(i17);
                android.widget.TextView textView = new android.widget.TextView(this.f293640d);
                textView.setPadding(this.f293647n, this.f293648o, this.f293649p, this.f293650q);
                textView.setTextSize(0, this.f293642f);
                textView.setGravity(this.f293646m);
                textView.setTextColor(this.f293641e);
                textView.setBackgroundDrawable(this.f293643g.getConstantState().newDrawable());
                textView.setTag(com.p314xaae8f345.mm.R.id.nwn, obj);
                textView.setTag(com.p314xaae8f345.mm.R.id.nwq, java.lang.Integer.valueOf(i17));
                textView.setOnClickListener(this);
                textView.setSingleLine(true);
                textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
                addView(textView, this.f293644h, this.f293645i);
                textView.setText(jVar.a(textView, i17, obj));
            }
            b();
        }
        if (this.f293653t == ol5.n.SINGLE_IRREVOCABLY) {
            m82031x2725f435(0);
        }
    }

    /* renamed from: getCompulsorys */
    public java.util.List<java.lang.Integer> m81993xd9d38fd4() {
        return this.C;
    }

    /* renamed from: getLabelGravity */
    public int m81994x54992330() {
        return this.f293646m;
    }

    /* renamed from: getLabelTextColor */
    public android.content.res.ColorStateList m81995x8f132e98() {
        return this.f293641e;
    }

    /* renamed from: getLabelTextSize */
    public float m81996xfc62a62c() {
        return this.f293642f;
    }

    /* renamed from: getLabels */
    public <T> java.util.List<T> m81997x22e782f5() {
        return this.A;
    }

    /* renamed from: getLineCount */
    public int m81998x92d2fac5() {
        return this.f293658y;
    }

    /* renamed from: getLineMargin */
    public int m81999xd7d612b8() {
        return this.f293652s;
    }

    /* renamed from: getMaxLines */
    public int m82000x931cb571() {
        return this.f293656w;
    }

    /* renamed from: getMaxSelect */
    public int m82001xdc329cca() {
        return this.f293654u;
    }

    /* renamed from: getMinSelect */
    public int m82002xa3db338() {
        return this.f293655v;
    }

    /* renamed from: getSelectLabelDatas */
    public <T> java.util.List<T> m82003x57823d07() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.B;
        int size = arrayList2.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.Object tag = getChildAt(((java.lang.Integer) arrayList2.get(i17)).intValue()).getTag(com.p314xaae8f345.mm.R.id.nwn);
            if (tag != null) {
                arrayList.add(tag);
            }
        }
        return arrayList;
    }

    /* renamed from: getSelectLabels */
    public java.util.List<java.lang.Integer> m82004xcd926691() {
        return this.B;
    }

    /* renamed from: getSelectType */
    public ol5.n m82005x8b8d124c() {
        return this.f293653t;
    }

    /* renamed from: getTextPaddingBottom */
    public int m82006x91c1b4b9() {
        return this.f293650q;
    }

    /* renamed from: getTextPaddingLeft */
    public int m82007xc280615() {
        return this.f293647n;
    }

    /* renamed from: getTextPaddingRight */
    public int m82008x792f1dce() {
        return this.f293649p;
    }

    /* renamed from: getTextPaddingTop */
    public int m82009xefe06187() {
        return this.f293648o;
    }

    /* renamed from: getWordMargin */
    public int m82010x3b37014e() {
        return this.f293651r;
    }

    public final void h() {
        if (isInEditMode()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("Label 1");
            arrayList.add("Label 2");
            arrayList.add("Label 3");
            arrayList.add("Label 4");
            arrayList.add("Label 5");
            arrayList.add("Label 6");
            arrayList.add("Label 7");
            m82021x161cb701(arrayList);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/happybubble/LabelsView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) view;
            if (!this.f293659z && this.f293653t != ol5.n.NONE) {
                boolean isSelected = textView.isSelected();
                java.util.ArrayList arrayList2 = this.B;
                ol5.n nVar = ol5.n.SINGLE_IRREVOCABLY;
                ol5.n nVar2 = ol5.n.MULTI;
                boolean z17 = true;
                if (isSelected) {
                    if (!((this.f293653t == nVar2 && this.C.contains((java.lang.Integer) textView.getTag(com.p314xaae8f345.mm.R.id.nwq))) || (this.f293653t == nVar2 && arrayList2.size() <= this.f293655v)) && this.f293653t != nVar) {
                        z17 = false;
                    }
                    if (!z17) {
                        f(textView, false);
                    }
                } else {
                    ol5.n nVar3 = this.f293653t;
                    if (nVar3 == ol5.n.SINGLE || nVar3 == nVar) {
                        d();
                        f(textView, true);
                    } else if (nVar3 == nVar2 && ((i17 = this.f293654u) <= 0 || i17 > arrayList2.size())) {
                        f(textView, true);
                    }
                }
            }
            ol5.k kVar = this.D;
            if (kVar != null) {
                java.lang.Object tag = textView.getTag(com.p314xaae8f345.mm.R.id.nwn);
                int intValue = ((java.lang.Integer) textView.getTag(com.p314xaae8f345.mm.R.id.nwq)).intValue();
                xr3.e eVar = (xr3.e) kVar;
                yz5.q qVar = eVar.f537751a.f537762e;
                if (qVar != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizServiceMenuButton");
                    qVar.mo147xb9724478((r45.mm) tag, java.lang.Integer.valueOf(eVar.f537752b), java.lang.Integer.valueOf(intValue));
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/happybubble/LabelsView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i28 = i19 - i17;
        int childCount = getChildCount();
        int i29 = 1;
        int i37 = 0;
        for (int i38 = 0; i38 < childCount; i38++) {
            android.view.View childAt = getChildAt(i38);
            if (!this.f293657x && i28 < childAt.getMeasuredWidth() + paddingLeft + getPaddingRight()) {
                i29++;
                int i39 = this.f293656w;
                if (i39 > 0 && i29 > i39) {
                    return;
                }
                paddingLeft = getPaddingLeft();
                paddingTop = paddingTop + this.f293652s + i37;
                i37 = 0;
            }
            childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
            paddingLeft = paddingLeft + childAt.getMeasuredWidth() + this.f293651r;
            i37 = java.lang.Math.max(i37, childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f293657x) {
            int childCount = getChildCount();
            int i19 = 0;
            int i27 = 0;
            for (int i28 = 0; i28 < childCount; i28++) {
                android.view.View childAt = getChildAt(i28);
                measureChild(childAt, i17, i18);
                i19 += childAt.getMeasuredWidth();
                if (i28 != childCount - 1) {
                    i19 += this.f293651r;
                }
                i27 = java.lang.Math.max(i27, childAt.getMeasuredHeight());
            }
            setMeasuredDimension(e(i17, i19 + getPaddingLeft() + getPaddingRight()), e(i18, i27 + getPaddingTop() + getPaddingBottom()));
            return;
        }
        int childCount2 = getChildCount();
        int size = (android.view.View.MeasureSpec.getSize(i17) - getPaddingLeft()) - getPaddingRight();
        int i29 = 1;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i47 = 0;
        for (int i48 = 0; i48 < childCount2; i48++) {
            android.view.View childAt2 = getChildAt(i48);
            measureChild(childAt2, i17, i18);
            if (childAt2.getMeasuredWidth() + i37 > size) {
                i29++;
                int i49 = this.f293656w;
                if (i49 > 0 && i29 > i49) {
                    break;
                }
                i39 = i39 + this.f293652s + i38;
                i47 = java.lang.Math.max(i47, i37);
                i37 = 0;
                i38 = 0;
            }
            i37 += childAt2.getMeasuredWidth();
            i38 = java.lang.Math.max(i38, childAt2.getMeasuredHeight());
            if (i48 != childCount2 - 1) {
                int i57 = this.f293651r + i37;
                if (i57 > size) {
                    i29++;
                    int i58 = this.f293656w;
                    if (i58 > 0 && i29 > i58) {
                        break;
                    }
                    i39 = i39 + this.f293652s + i38;
                    i38 = 0;
                    i47 = java.lang.Math.max(i47, i37);
                    i37 = 0;
                } else {
                    i37 = i57;
                }
            }
        }
        this.f293658y = i29;
        setMeasuredDimension(e(i17, java.lang.Math.max(i47, i37) + getPaddingLeft() + getPaddingRight()), e(i18, i39 + i38 + getPaddingTop() + getPaddingBottom()));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof android.os.Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        android.os.Bundle bundle = (android.os.Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("key_super_state"));
        android.content.res.ColorStateList colorStateList = (android.content.res.ColorStateList) bundle.getParcelable("key_text_color_state");
        if (colorStateList != null) {
            m82019x570996a4(colorStateList);
        }
        m82020x8f390ca0(bundle.getFloat("key_text_size_state", this.f293642f));
        this.f293644h = bundle.getInt("key_label_width_state", this.f293644h);
        this.f293645i = bundle.getInt("key_label_height_state", this.f293645i);
        m82017x8ae21e3c(bundle.getInt("key_label_gravity_state", this.f293646m));
        int[] intArray = bundle.getIntArray("key_padding_state");
        if (intArray != null && intArray.length == 4) {
            int i17 = intArray[0];
            int i18 = intArray[1];
            int i19 = intArray[2];
            int i27 = intArray[3];
            if (this.f293647n != i17 || this.f293648o != i18 || this.f293649p != i19 || this.f293650q != i27) {
                this.f293647n = i17;
                this.f293648o = i18;
                this.f293649p = i19;
                this.f293650q = i27;
                int childCount = getChildCount();
                for (int i28 = 0; i28 < childCount; i28++) {
                    ((android.widget.TextView) getChildAt(i28)).setPadding(i17, i18, i19, i27);
                }
            }
        }
        m82033x695b4f5a(bundle.getInt("key_word_margin_state", this.f293651r));
        m82022x5fa60c4(bundle.getInt("key_line_margin_state", this.f293652s));
        int i29 = bundle.getInt("key_select_type_state", this.f293653t.f427774d);
        ol5.n nVar = ol5.n.NONE;
        if (i29 != 1) {
            if (i29 == 2) {
                nVar = ol5.n.SINGLE;
            } else if (i29 == 3) {
                nVar = ol5.n.SINGLE_IRREVOCABLY;
            } else if (i29 == 4) {
                nVar = ol5.n.MULTI;
            }
        }
        m82029xb9b16058(nVar);
        m82024x38865d3e(bundle.getInt("key_max_select_state", this.f293654u));
        m82025x669173ac(bundle.getInt("key_min_select_state", this.f293655v));
        m82023x8dd5167d(bundle.getInt("key_max_lines_state", this.f293656w));
        m82013x3150efcd(bundle.getBoolean("key_indicator_state", this.f293659z));
        m82032x52d64a5e(bundle.getBoolean("key_single_line_state", this.f293657x));
        java.util.ArrayList<java.lang.Integer> integerArrayList = bundle.getIntegerArrayList("key_select_compulsory_state");
        if (integerArrayList != null && !integerArrayList.isEmpty()) {
            m82011x70390348(integerArrayList);
        }
        java.util.ArrayList<java.lang.Integer> integerArrayList2 = bundle.getIntegerArrayList("key_select_labels_state");
        if (integerArrayList2 == null || integerArrayList2.isEmpty()) {
            return;
        }
        int size = integerArrayList2.size();
        int[] iArr = new int[size];
        for (int i37 = 0; i37 < size; i37++) {
            iArr[i37] = integerArrayList2.get(i37).intValue();
        }
        m82031x2725f435(iArr);
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("key_super_state", super.onSaveInstanceState());
        android.content.res.ColorStateList colorStateList = this.f293641e;
        if (colorStateList != null) {
            bundle.putParcelable("key_text_color_state", colorStateList);
        }
        bundle.putFloat("key_text_size_state", this.f293642f);
        bundle.putInt("key_label_width_state", this.f293644h);
        bundle.putInt("key_label_height_state", this.f293645i);
        bundle.putInt("key_label_gravity_state", this.f293646m);
        bundle.putIntArray("key_padding_state", new int[]{this.f293647n, this.f293648o, this.f293649p, this.f293650q});
        bundle.putInt("key_word_margin_state", this.f293651r);
        bundle.putInt("key_line_margin_state", this.f293652s);
        bundle.putInt("key_select_type_state", this.f293653t.f427774d);
        bundle.putInt("key_max_select_state", this.f293654u);
        bundle.putInt("key_min_select_state", this.f293655v);
        bundle.putInt("key_max_lines_state", this.f293656w);
        bundle.putBoolean("key_indicator_state", this.f293659z);
        java.util.ArrayList<java.lang.Integer> arrayList = this.B;
        if (!arrayList.isEmpty()) {
            bundle.putIntegerArrayList("key_select_labels_state", arrayList);
        }
        java.util.ArrayList<java.lang.Integer> arrayList2 = this.C;
        if (!arrayList2.isEmpty()) {
            bundle.putIntegerArrayList("key_select_compulsory_state", arrayList2);
        }
        bundle.putBoolean("key_single_line_state", this.f293657x);
        return bundle;
    }

    /* renamed from: setCompulsorys */
    public void m82011x70390348(java.util.List<java.lang.Integer> list) {
        if (this.f293653t != ol5.n.MULTI || list == null) {
            return;
        }
        java.util.ArrayList arrayList = this.C;
        arrayList.clear();
        arrayList.addAll(list);
        d();
        m82030x2725f435(list);
    }

    /* renamed from: setIndicator */
    public void m82013x3150efcd(boolean z17) {
        this.f293659z = z17;
    }

    /* renamed from: setLabelBackgroundColor */
    public void m82014x1ba5d4c3(int i17) {
        m82015x5b2b5f3e(new android.graphics.drawable.ColorDrawable(i17));
    }

    /* renamed from: setLabelBackgroundDrawable */
    public void m82015x5b2b5f3e(android.graphics.drawable.Drawable drawable) {
        this.f293643g = drawable;
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            ((android.widget.TextView) getChildAt(i17)).setBackgroundDrawable(this.f293643g.getConstantState().newDrawable());
        }
    }

    /* renamed from: setLabelBackgroundResource */
    public void m82016x781aa2ae(int i17) {
        m82015x5b2b5f3e(getResources().getDrawable(i17));
    }

    /* renamed from: setLabelGravity */
    public void m82017x8ae21e3c(int i17) {
        if (this.f293646m != i17) {
            this.f293646m = i17;
            int childCount = getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                ((android.widget.TextView) getChildAt(i18)).setGravity(i17);
            }
        }
    }

    /* renamed from: setLabelTextColor */
    public void m82018x570996a4(int i17) {
        m82019x570996a4(android.content.res.ColorStateList.valueOf(i17));
    }

    /* renamed from: setLabelTextSize */
    public void m82020x8f390ca0(float f17) {
        if (this.f293642f != f17) {
            this.f293642f = f17;
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                ((android.widget.TextView) getChildAt(i17)).setTextSize(0, f17);
            }
        }
    }

    /* renamed from: setLabels */
    public void m82021x161cb701(java.util.List<java.lang.String> list) {
        g(list, new ol5.i(this));
    }

    /* renamed from: setLineMargin */
    public void m82022x5fa60c4(int i17) {
        if (this.f293652s != i17) {
            this.f293652s = i17;
            requestLayout();
        }
    }

    /* renamed from: setMaxLines */
    public void m82023x8dd5167d(int i17) {
        if (this.f293656w != i17) {
            this.f293656w = i17;
            requestLayout();
        }
    }

    /* renamed from: setMaxSelect */
    public void m82024x38865d3e(int i17) {
        if (this.f293654u != i17) {
            this.f293654u = i17;
            if (this.f293653t == ol5.n.MULTI) {
                d();
            }
        }
    }

    /* renamed from: setMinSelect */
    public void m82025x669173ac(int i17) {
        this.f293655v = i17;
    }

    /* renamed from: setOnLabelClickListener */
    public void m82026x7b481f89(ol5.k kVar) {
        this.D = kVar;
        b();
    }

    /* renamed from: setOnLabelSelectChangeListener */
    public void m82027xadfcaed3(ol5.l lVar) {
    }

    /* renamed from: setOnSelectChangeIntercept */
    public void m82028xe3b6fef5(ol5.m mVar) {
    }

    /* renamed from: setSelectType */
    public void m82029xb9b16058(ol5.n nVar) {
        if (this.f293653t != nVar) {
            this.f293653t = nVar;
            d();
            if (this.f293653t == ol5.n.SINGLE_IRREVOCABLY) {
                m82031x2725f435(0);
            }
            if (this.f293653t != ol5.n.MULTI) {
                this.C.clear();
            }
            b();
        }
    }

    /* renamed from: setSelects */
    public void m82030x2725f435(java.util.List<java.lang.Integer> list) {
        if (list != null) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i17 = 0; i17 < size; i17++) {
                iArr[i17] = list.get(i17).intValue();
            }
            m82031x2725f435(iArr);
        }
    }

    /* renamed from: setSingleLine */
    public void m82032x52d64a5e(boolean z17) {
        if (this.f293657x != z17) {
            this.f293657x = z17;
            requestLayout();
        }
    }

    /* renamed from: setWordMargin */
    public void m82033x695b4f5a(int i17) {
        if (this.f293651r != i17) {
            this.f293651r = i17;
            requestLayout();
        }
    }

    /* renamed from: setLabelTextColor */
    public void m82019x570996a4(android.content.res.ColorStateList colorStateList) {
        this.f293641e = colorStateList;
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            ((android.widget.TextView) getChildAt(i17)).setTextColor(this.f293641e);
        }
    }

    /* renamed from: setSelects */
    public void m82031x2725f435(int... iArr) {
        if (this.f293653t != ol5.n.NONE) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int childCount = getChildCount();
            ol5.n nVar = this.f293653t;
            int i17 = (nVar == ol5.n.SINGLE || nVar == ol5.n.SINGLE_IRREVOCABLY) ? 1 : this.f293654u;
            for (int i18 : iArr) {
                if (i18 < childCount) {
                    android.widget.TextView textView = (android.widget.TextView) getChildAt(i18);
                    if (!arrayList.contains(textView)) {
                        f(textView, true);
                        arrayList.add(textView);
                    }
                    if (i17 > 0 && arrayList.size() == i17) {
                        break;
                    }
                }
            }
            for (int i19 = 0; i19 < childCount; i19++) {
                android.widget.TextView textView2 = (android.widget.TextView) getChildAt(i19);
                if (!arrayList.contains(textView2)) {
                    f(textView2, false);
                }
            }
        }
    }

    /* renamed from: setCompulsorys */
    public void m82012x70390348(int... iArr) {
        if (this.f293653t != ol5.n.MULTI || iArr == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(iArr.length);
        for (int i17 : iArr) {
            arrayList.add(java.lang.Integer.valueOf(i17));
        }
        m82011x70390348(arrayList);
    }

    public ViewOnClickListenerC22697x158cd364(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f293644h = -2;
        this.f293645i = -2;
        this.f293646m = 17;
        this.f293657x = false;
        this.f293658y = 1;
        this.A = new java.util.ArrayList();
        this.B = new java.util.ArrayList();
        this.C = new java.util.ArrayList();
        this.f293640d = context;
        c(context, attributeSet);
        h();
    }
}
