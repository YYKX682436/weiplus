package com.p314xaae8f345.mm.ui.p2736xc9fa65a8;

/* renamed from: com.tencent.mm.ui.search.FTSEditTextView */
/* loaded from: classes8.dex */
public class C22479x68a26381 extends android.widget.LinearLayout {
    public static final /* synthetic */ int I = 0;
    public final int A;
    public tj5.l B;
    public boolean C;
    public final android.view.View.OnClickListener D;
    public tj5.n E;
    public final java.util.ArrayList F;
    public tj5.o G;
    public final android.view.View.OnFocusChangeListener H;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f291346d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f291347e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageButton f291348f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.EditText f291349g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f291350h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f291351i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f291352m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f291353n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f291354o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f291355p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f291356q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f291357r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f291358s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f291359t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f291360u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f291361v;

    /* renamed from: w, reason: collision with root package name */
    public int f291362w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f291363x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f291364y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f291365z;

    public C22479x68a26381(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f291358s = true;
        this.f291359t = false;
        this.f291360u = false;
        this.f291361v = false;
        this.f291362w = 0;
        this.f291363x = "";
        this.A = 2;
        this.D = new tj5.j(this);
        this.F = new java.util.ArrayList();
        this.G = tj5.o.UserInput;
        this.H = new tj5.a(this);
        j(attributeSet);
    }

    public static void a(com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381) {
        java.lang.String m80970x134c2d56 = c22479x68a26381.m80970x134c2d56();
        java.lang.String m80978xc3706fda = c22479x68a26381.m80978xc3706fda();
        tj5.n nVar = c22479x68a26381.E;
        if (nVar != null) {
            nVar.C3(m80978xc3706fda, m80970x134c2d56, c22479x68a26381.f291350h, c22479x68a26381.G);
        }
        if (m80970x134c2d56.length() == 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c22479x68a26381.f291355p)) {
                c22479x68a26381.f291349g.setHint(c22479x68a26381.f291356q);
            } else {
                c22479x68a26381.f291349g.setHint(c22479x68a26381.f291355p);
            }
        }
        java.util.Iterator it = c22479x68a26381.F.iterator();
        while (it.hasNext()) {
            ((tj5.m) it.next()).C3(m80978xc3706fda, m80970x134c2d56, c22479x68a26381.f291350h, c22479x68a26381.G);
        }
    }

    /* renamed from: getSearchInputType */
    public static int m80964xdaabcf26() {
        return j62.e.g().i("clicfg_websearch_input_type", 0, true, true);
    }

    public boolean b() {
        return false;
    }

    public final void c() {
        android.widget.LinearLayout linearLayout = this.f291354o;
        android.widget.EditText m80966xdb574fcd = m80966xdb574fcd();
        if (linearLayout == null || m80966xdb574fcd == null || m80966xdb574fcd.isFocused()) {
            return;
        }
        if (m80966xdb574fcd.getPaint().measureText(m80966xdb574fcd.getText().toString()) > ((float) (m80966xdb574fcd.getWidth() - i65.a.b(getContext(), 4)))) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSEditTextView", "[hitest] clearEditTextFocus, currentHasFocus=%s, textChangeStatus=%s", java.lang.Boolean.valueOf(this.f291349g.hasFocus()), this.G);
        this.f291349g.clearFocus();
    }

    public void e() {
        this.G = tj5.o.ClearText;
        if (this.f291358s) {
            ((java.util.ArrayList) this.f291350h).clear();
        }
        this.f291349g.setText("");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f291355p)) {
            this.f291349g.setHint(this.f291356q);
        } else {
            this.f291349g.setHint(this.f291355p);
        }
        this.f291348f.setVisibility(8);
        w();
        this.G = tj5.o.UserInput;
    }

    public void f() {
        if (this.f291360u) {
            this.f291348f.setVisibility(0);
        } else {
            this.f291348f.setVisibility(8);
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSEditTextView", "hideClearBtn， forceEditToBeTextView = %s. forceShowClearBtn = %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), java.lang.Boolean.valueOf(this.f291360u));
    }

    public void g() {
        this.f291346d.setVisibility(8);
    }

    /* renamed from: getClearBtn */
    public android.widget.ImageButton m80965xaaf4ce45() {
        return this.f291348f;
    }

    /* renamed from: getEditText */
    public android.widget.EditText m80966xdb574fcd() {
        return this.f291349g;
    }

    /* renamed from: getHighlightColor */
    public int m80967xbd65005() {
        return this.f291349g.getHighlightColor();
    }

    /* renamed from: getIconMargin */
    public android.view.View m80968xc558677d() {
        return this.f291347e;
    }

    /* renamed from: getIconView */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m80969x4fdf4434() {
        return this.f291346d;
    }

    /* renamed from: getInEditTextQuery */
    public java.lang.String m80970x134c2d56() {
        return this.f291349g.getText().toString().trim();
    }

    /* renamed from: getLimitInputLength */
    public int m80971x6c71b00b() {
        return 100;
    }

    /* renamed from: getRecommendSearchHint */
    public java.lang.String m80972xc738b2f5() {
        return this.f291355p;
    }

    /* renamed from: getSearchDone */
    public android.view.View m80973xc3e0a140() {
        return this.f291364y;
    }

    /* renamed from: getSearchInputBackground */
    public android.view.View m80974x8c20f41a() {
        return this.f291365z;
    }

    /* renamed from: getTagList */
    public java.util.List<tj5.x> m80975xe175c322() {
        return this.f291350h;
    }

    /* renamed from: getTagPanel */
    public android.view.View m80976x4d774800() {
        return this.f291357r;
    }

    /* renamed from: getTextChangeStatus */
    public tj5.o m80977x491af105() {
        return this.G;
    }

    /* renamed from: getTotalQuery */
    public java.lang.String m80978xc3706fda() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Iterator it = ((java.util.ArrayList) this.f291350h).iterator();
        while (it.hasNext()) {
            stringBuffer.append(((tj5.x) it.next()).R0());
            stringBuffer.append(" ");
        }
        stringBuffer.append(this.f291349g.getText().toString());
        return stringBuffer.toString().trim();
    }

    public void h() {
        ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f291349g.getWindowToken(), 0);
    }

    public void i(int i17) {
        if (i17 == this.A) {
            android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570651bc3, (android.view.ViewGroup) this, true);
        } else {
            android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570652bc4, (android.view.ViewGroup) this, true);
        }
    }

    public void j(android.util.AttributeSet attributeSet) {
        int i17;
        android.widget.ImageButton imageButton;
        this.f291362w = m80964xdaabcf26();
        if (getContext() instanceof android.app.Activity) {
            this.C = ((android.app.Activity) getContext()).getIntent().getBooleanExtra("fts_need_sos_edittext_tobe_touch_only", false);
        }
        int[] iArr = wm0.a.f528722g;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, iArr);
            i17 = obtainStyledAttributes.getInt(4, 0);
            obtainStyledAttributes.recycle();
        } else {
            i17 = 0;
        }
        i(i17);
        this.f291357r = findViewById(com.p314xaae8f345.mm.R.id.f568750nx3);
        this.f291346d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.h5n);
        this.f291349g = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.d98);
        this.f291348f = (android.widget.ImageButton) findViewById(com.p314xaae8f345.mm.R.id.bxn);
        this.f291351i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nvv);
        this.f291352m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nvz);
        this.f291353n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568744nw3);
        this.f291354o = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.rfy);
        this.f291365z = findViewById(com.p314xaae8f345.mm.R.id.mek);
        this.f291347e = findViewById(com.p314xaae8f345.mm.R.id.h79);
        this.f291364y = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mdx);
        android.widget.LinearLayout linearLayout = this.f291354o;
        if (linearLayout != null && i17 == 3) {
            linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562266ud);
        }
        this.f291349g.setTextSize(0, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r) * i65.a.m(getContext()));
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, iArr);
            int i18 = obtainStyledAttributes2.getInt(0, 0);
            if (i18 != 0) {
                this.f291349g.setHintTextColor(i18);
            }
            int i19 = obtainStyledAttributes2.getInt(3, 0);
            if (i19 != 0) {
                this.f291349g.setTextColor(i19);
            }
            int resourceId = obtainStyledAttributes2.getResourceId(1, 0);
            if (resourceId != 0 && (imageButton = this.f291348f) != null) {
                imageButton.setImageResource(resourceId);
            }
            obtainStyledAttributes2.recycle();
        }
        android.widget.TextView textView = this.f291364y;
        if (textView != null) {
            textView.setTextSize(0, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz) * i65.a.m(getContext()));
        }
        this.f291350h = new java.util.ArrayList();
        this.f291349g.setOnKeyListener(new tj5.b(this));
        this.f291349g.addTextChangedListener(new tj5.c(this));
        this.f291349g.setOnFocusChangeListener(this.H);
        this.f291349g.setOnEditorActionListener(new tj5.d(this));
        android.widget.EditText editText = this.f291349g;
        if (editText instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) editText).m81364x44f86e7(new tj5.e(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTSEditTextView", "init: editText is not MMEditText");
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f291346d;
        if (c22699x3dcdb352 != null) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) c22699x3dcdb352.getLayoutParams();
            if (b()) {
                layoutParams.width = (int) (getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz) * i65.a.q(getContext()));
                layoutParams.height = (int) (getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz) * i65.a.q(getContext()));
                layoutParams.rightMargin = 0;
            } else {
                layoutParams.width = (int) (getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs) * i65.a.m(getContext()));
                layoutParams.height = (int) (getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs) * i65.a.m(getContext()));
                layoutParams.rightMargin = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            }
            this.f291346d.setLayoutParams(layoutParams);
        }
        android.widget.TextView textView2 = this.f291351i;
        android.view.View.OnClickListener onClickListener = this.D;
        textView2.setOnClickListener(onClickListener);
        this.f291352m.setOnClickListener(onClickListener);
        this.f291353n.setOnClickListener(onClickListener);
        this.f291348f.setOnClickListener(new tj5.f(this));
        ck5.f b17 = ck5.f.b(this.f291349g);
        int m80971x6c71b00b = m80971x6c71b00b();
        b17.f124094f = 0;
        b17.f124093e = m80971x6c71b00b;
        b17.f124095g = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_1;
        b17.d(null);
        if (com.p314xaae8f345.mm.ui.bk.C() || (this instanceof com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22480x7635635a)) {
            this.f291348f.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
        this.f291348f.setContentDescription(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ftn));
        if (m80973xc3e0a140() != null) {
            m80973xc3e0a140().setOnClickListener(new tj5.g(this));
        }
    }

    public boolean k() {
        return this.f291349g.hasFocus();
    }

    public void l(boolean z17) {
        android.widget.LinearLayout linearLayout = this.f291354o;
        android.widget.EditText editText = this.f291349g;
        if (editText == null) {
            return;
        }
        if (linearLayout == null) {
            if (z17) {
                editText.setEllipsize(null);
                return;
            }
            editText.setEllipsize(android.text.TextUtils.TruncateAt.END);
            android.text.Selection.setSelection(this.f291349g.getText(), 0);
            this.f291349g.clearFocus();
            return;
        }
        if (z17) {
            linearLayout.setVisibility(8);
            android.widget.ImageButton m80965xaaf4ce45 = m80965xaaf4ce45();
            if (m80965xaaf4ce45 != null) {
                m80965xaaf4ce45.setPadding(i65.a.b(getContext(), 4), m80965xaaf4ce45.getPaddingTop(), m80965xaaf4ce45.getPaddingRight(), m80965xaaf4ce45.getPaddingBottom());
                return;
            }
            return;
        }
        editText.setEllipsize(null);
        android.text.Selection.setSelection(this.f291349g.getText(), 0);
        this.f291349g.clearFocus();
        c();
        android.widget.ImageButton m80965xaaf4ce452 = m80965xaaf4ce45();
        if (m80965xaaf4ce452 != null) {
            m80965xaaf4ce452.setPadding(0, m80965xaaf4ce452.getPaddingTop(), m80965xaaf4ce452.getPaddingRight(), m80965xaaf4ce452.getPaddingBottom());
        }
    }

    public void m() {
        this.f291349g.requestFocus();
    }

    public void n(java.lang.String str, java.util.List list) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSEditTextView", "[hitest] setText(2-param), query=%s, will use UserInput", str);
        o(str, list, tj5.o.UserInput);
    }

    public void o(java.lang.String str, java.util.List list, tj5.o oVar) {
        p(str, list, oVar, false, false);
    }

    public void p(java.lang.String str, java.util.List list, tj5.o oVar, boolean z17, boolean z18) {
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        java.lang.String trim = str.trim();
        if (trim.length() > m80971x6c71b00b()) {
            trim = trim.substring(0, m80971x6c71b00b()).replace("\n", " ");
        }
        this.f291350h.clear();
        if (list != null) {
            this.f291350h.addAll(list);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSEditTextView", "setText: %s %d", trim, java.lang.Integer.valueOf(this.f291350h.size()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSEditTextView", "[hitest] setText(5-param), query=%s, status=%s, alignStart=%s, isEditing=%s, hasFocus=%s", trim, oVar, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(this.f291349g.hasFocus()));
        this.G = tj5.o.SetText;
        this.f291349g.setText(trim);
        if (z17) {
            android.text.Selection.setSelection(this.f291349g.getText(), 0);
            this.f291349g.clearFocus();
        } else {
            android.text.Selection.setSelection(this.f291349g.getText(), this.f291349g.getText().length());
        }
        w();
        this.G = oVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSEditTextView", "[hitest] setText(5-param) done, final textChangeStatus=%s", oVar);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) {
            return;
        }
        v(z18);
    }

    public void q(java.lang.String str, java.util.List list, boolean z17) {
        p(str, list, tj5.o.UserInput, z17, false);
    }

    public void r() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSEditTextView", "showClearBtn， forceEditToBeTextView = " + this.f291359t);
        if (this.f291359t) {
            this.f291348f.setVisibility(8);
        } else {
            this.f291348f.setVisibility(0);
        }
    }

    public void s() {
        ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this.f291349g, 0);
    }

    /* renamed from: setActionSearchDoneListener */
    public void m80979xa89fdb76(tj5.l lVar) {
        this.B = lVar;
    }

    /* renamed from: setCanDeleteTag */
    public void m80980x55355581(boolean z17) {
        this.f291358s = z17;
    }

    /* renamed from: setClearBtnIconColor */
    public void m80981x56f98219(int i17) {
        android.widget.ImageButton imageButton = this.f291348f;
        if (imageButton != null && (imageButton instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f)) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f) imageButton).m82034x7541828(i17);
            return;
        }
        android.graphics.PorterDuff.Mode mode = android.graphics.PorterDuff.Mode.SRC_ATOP;
        if (imageButton != null) {
            imageButton.getDrawable().setColorFilter(i17, mode);
        }
    }

    /* renamed from: setClearBtnImageDrawable */
    public void m80982x3a6f2f48(android.graphics.drawable.Drawable drawable) {
        android.widget.ImageButton imageButton = this.f291348f;
        if (imageButton != null) {
            imageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: setClearBtnVisable */
    public void m80983xc23608e9(int i17) {
        android.widget.ImageButton imageButton = this.f291348f;
        if (imageButton != null) {
            imageButton.setVisibility(i17);
        }
    }

    /* renamed from: setEditTextDrawableLeft */
    public void m80984xa8369d3e(int i17) {
        if (i17 == -1) {
            this.f291349g.setCompoundDrawablesRelative(null, null, null, null);
            return;
        }
        android.graphics.drawable.Drawable drawable = getContext().getResources().getDrawable(i17);
        drawable.setBounds(0, 0, i65.a.b(getContext(), 15), i65.a.b(getContext(), 15));
        this.f291349g.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    /* renamed from: setForceDisable */
    public void m80985x1905aeff(boolean z17) {
        this.f291359t = z17;
    }

    /* renamed from: setForceHideSearchIconBtn */
    public void m80986x32c55990(boolean z17) {
        this.f291361v = z17;
    }

    /* renamed from: setForceShowClearBtn */
    public void m80987x9d01ed35(boolean z17) {
        this.f291360u = z17;
    }

    /* renamed from: setFtsEditTextListener */
    public void m80988xce28f7ee(tj5.n nVar) {
        this.E = nVar;
    }

    /* renamed from: setHint */
    public void m80989x764b0e09(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f291355p)) {
            this.f291349g.setHint(str);
        } else {
            this.f291349g.setHint(this.f291355p);
        }
        this.f291356q = str;
    }

    /* renamed from: setHintColor */
    public void m80990xb7ad8eda(int i17) {
        this.f291349g.setHintTextColor(i17);
    }

    /* renamed from: setIconMarginVisable */
    public void m80991xb44593b1(int i17) {
        android.view.View view = this.f291347e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/search/FTSEditTextView", "setIconMarginVisable", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/search/FTSEditTextView", "setIconMarginVisable", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: setRecommendSearchHint */
    public void m80992x157d7269(java.lang.String str) {
        this.f291349g.setHint(str);
        this.f291355p = str;
    }

    /* renamed from: setSearchIconGone */
    public void m80993xb152382(int i17) {
        if (m80973xc3e0a140() != null) {
            android.view.View m80973xc3e0a140 = m80973xc3e0a140();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m80973xc3e0a140, arrayList.toArray(), "com/tencent/mm/ui/search/FTSEditTextView", "setSearchIconGone", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m80973xc3e0a140.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m80973xc3e0a140, "com/tencent/mm/ui/search/FTSEditTextView", "setSearchIconGone", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: setSearchIconVisable */
    public void m80994xc0759bb7(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f291346d;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(8);
        }
    }

    /* renamed from: setTextColor */
    public void m80995x1c5c5ff4(int i17) {
        this.f291349g.setTextColor(i17);
    }

    public void t() {
        post(new tj5.i(this));
    }

    public void u(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSEditTextView", "updateActionDonePos, getSosEditTextView().getSearchBarCancelTextContainer().getVisibility() = " + z17);
        if (m80973xc3e0a140() != null) {
            if (z17) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) m80973xc3e0a140().getLayoutParams();
                marginLayoutParams.rightMargin = 0;
                m80973xc3e0a140().setLayoutParams(marginLayoutParams);
            } else {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) m80973xc3e0a140().getLayoutParams();
                marginLayoutParams2.rightMargin = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                m80973xc3e0a140().setLayoutParams(marginLayoutParams2);
            }
        }
    }

    public void v(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSEditTextView", "[hitest] updateEllipsize, isEditing=%s, textChangeStatus=%s", java.lang.Boolean.valueOf(z17), this.G);
        this.f291349g.setKeyListener(null);
        l(z17);
        this.f291349g.setOnFocusChangeListener(new tj5.k(this));
    }

    public final void w() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSEditTextView", "updateTagView %s", java.lang.Integer.valueOf(this.f291350h.size()));
        i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia);
        if (this.f291350h.size() >= 1) {
            this.f291351i.setVisibility(0);
            this.f291351i.setText(pg5.d.a(getContext(), ((tj5.x) this.f291350h.get(0)).R0()));
        } else {
            this.f291351i.setVisibility(8);
        }
        if (this.f291350h.size() >= 2) {
            this.f291352m.setVisibility(0);
            this.f291352m.setText(pg5.d.a(getContext(), ((tj5.x) this.f291350h.get(1)).R0()));
        } else {
            this.f291352m.setVisibility(8);
        }
        if (this.f291350h.size() < 3) {
            this.f291353n.setVisibility(8);
        } else {
            this.f291353n.setVisibility(0);
            this.f291353n.setText(pg5.d.a(getContext(), ((tj5.x) this.f291350h.get(2)).R0()));
        }
    }

    public C22479x68a26381(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f291358s = true;
        this.f291359t = false;
        this.f291360u = false;
        this.f291361v = false;
        this.f291362w = 0;
        this.f291363x = "";
        this.A = 2;
        this.D = new tj5.j(this);
        this.F = new java.util.ArrayList();
        this.G = tj5.o.UserInput;
        this.H = new tj5.a(this);
        j(attributeSet);
    }
}
