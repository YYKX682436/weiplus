package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMTagPanel */
/* loaded from: classes11.dex */
public class C21516xe823d84a extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 {
    public final java.util.LinkedList A;
    public final java.util.LinkedList B;
    public db5.t6 C;
    public int D;
    public android.view.View E;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 F;
    public int G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final android.view.View.OnClickListener f279112J;
    public boolean K;
    public db5.a7 L;

    /* renamed from: i, reason: collision with root package name */
    public boolean f279113i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f279114m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f279115n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f279116o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f279117p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f279118q;

    /* renamed from: r, reason: collision with root package name */
    public int f279119r;

    /* renamed from: s, reason: collision with root package name */
    public int f279120s;

    /* renamed from: t, reason: collision with root package name */
    public int f279121t;

    /* renamed from: u, reason: collision with root package name */
    public int f279122u;

    /* renamed from: v, reason: collision with root package name */
    public int f279123v;

    /* renamed from: w, reason: collision with root package name */
    public int f279124w;

    /* renamed from: x, reason: collision with root package name */
    public int f279125x;

    /* renamed from: y, reason: collision with root package name */
    public int f279126y;

    /* renamed from: z, reason: collision with root package name */
    public db5.b7 f279127z;

    public C21516xe823d84a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f279113i = false;
        this.f279114m = true;
        this.f279115n = false;
        this.f279116o = true;
        this.f279117p = false;
        this.f279118q = false;
        this.f279119r = com.p314xaae8f345.mm.R.C30861xcebc809e.cfw;
        this.f279120s = 0;
        this.f279121t = com.p314xaae8f345.mm.R.C30861xcebc809e.f563683b51;
        this.f279122u = com.p314xaae8f345.mm.R.C30859x5a72f63.a0c;
        this.f279123v = com.p314xaae8f345.mm.R.C30861xcebc809e.b4t;
        this.f279124w = com.p314xaae8f345.mm.R.C30859x5a72f63.aaq;
        this.f279125x = com.p314xaae8f345.mm.R.C30861xcebc809e.b4w;
        this.f279126y = com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0;
        this.f279127z = null;
        this.A = new java.util.LinkedList();
        this.B = new java.util.LinkedList();
        this.H = false;
        this.I = false;
        this.f279112J = new db5.s6(this);
        this.K = true;
        l();
    }

    public static db5.b7 b(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a c21516xe823d84a, java.lang.String str) {
        c21516xe823d84a.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMTagPanel", "want to get tag info, but it is null or empty");
            return null;
        }
        java.util.Iterator it = c21516xe823d84a.A.iterator();
        while (it.hasNext()) {
            db5.b7 b7Var = (db5.b7) it.next();
            if (str.equals(b7Var.f309828a)) {
                return b7Var;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMTagPanel", "want to get tag %s, but it not exsited!", str);
        return null;
    }

    public java.lang.String c(android.widget.EditText editText, android.text.Editable editable, java.lang.String str, android.text.TextWatcher textWatcher) {
        return str;
    }

    public void d(java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMTagPanel", "want to add tag, but it is null or empty");
            return;
        }
        java.lang.String trim = str.trim();
        p(trim);
        java.util.LinkedList linkedList = this.A;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (trim.equals(((db5.b7) it.next()).f309828a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMTagPanel", "want to add tag %s, but it exsited!", trim);
                return;
            }
        }
        db5.b7 i17 = i();
        t(i17, trim, z17);
        linkedList.add(i17);
        if (this.f279115n) {
            addView(i17.f309829b, getChildCount() - 1);
        } else {
            addView(i17.f309829b);
        }
        h();
    }

    public void e() {
        java.util.LinkedList linkedList = this.A;
        linkedList.clear();
        removeAllViews();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            n((db5.b7) it.next());
        }
    }

    public void f() {
        android.view.inputmethod.InputMethodManager inputMethodManager;
        android.os.IBinder windowToken;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.F;
        if (c22621x7603e017 == null || !c22621x7603e017.isFocused() || (inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")) == null || (windowToken = this.F.getWindowToken()) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        this.F.clearFocus();
    }

    public void g() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.F;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setText("");
        }
    }

    /* renamed from: getEditText */
    public java.lang.String m79118xdb574fcd() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.F;
        return c22621x7603e017 != null ? c22621x7603e017.getText().toString() : "";
    }

    /* renamed from: getEditTextView */
    public android.widget.EditText m79119xbc895012() {
        return this.F;
    }

    /* renamed from: getEditViewLayoutId */
    public int mo65203x2298764a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c1l;
    }

    /* renamed from: getEdittextText */
    public java.lang.String m79120xb8adf67a() {
        return (!this.f279115n || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(this.F.getText())) ? "" : this.F.getText().toString();
    }

    /* renamed from: getSelectTagList */
    public java.util.ArrayList<java.lang.String> mo65204x8c275306() {
        android.widget.TextView textView;
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.Iterator it = this.A.iterator();
        while (it.hasNext()) {
            db5.b7 b7Var = (db5.b7) it.next();
            if (b7Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b7Var.f309828a) && (textView = b7Var.f309829b) != null && ((java.lang.Integer) textView.getTag()).intValue() == 1) {
                arrayList.add(b7Var.f309828a);
            }
        }
        return arrayList;
    }

    /* renamed from: getTagCount */
    public int m79121x4cc68f0b() {
        return this.A.size();
    }

    /* renamed from: getTagList */
    public java.util.ArrayList<java.lang.String> m79122xe175c322() {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.Iterator it = this.A.iterator();
        while (it.hasNext()) {
            db5.b7 b7Var = (db5.b7) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b7Var.f309828a)) {
                arrayList.add(b7Var.f309828a);
            }
        }
        return arrayList;
    }

    /* renamed from: getTagSet */
    public java.util.Set<java.lang.String> m79123x3090495e() {
        java.util.TreeSet treeSet = new java.util.TreeSet();
        java.util.Iterator it = this.A.iterator();
        while (it.hasNext()) {
            db5.b7 b7Var = (db5.b7) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b7Var.f309828a)) {
                treeSet.add(b7Var.f309828a);
            }
        }
        return treeSet;
    }

    public void h() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.F;
        if (c22621x7603e017 != null) {
            c22621x7603e017.isFocused();
            this.F.setCursorVisible(true);
        }
        db5.b7 b7Var = this.f279127z;
        if (b7Var == null) {
            return;
        }
        android.widget.TextView textView = b7Var.f309829b;
        u(textView, ((java.lang.Integer) textView.getTag()).intValue() == 1, false);
        this.f279127z = null;
    }

    public db5.b7 i() {
        java.util.LinkedList linkedList = this.B;
        if (!linkedList.isEmpty()) {
            return (db5.b7) linkedList.removeFirst();
        }
        db5.b7 b7Var = new db5.b7();
        b7Var.f309829b = j();
        return b7Var;
    }

    public android.widget.TextView j() {
        android.widget.TextView textView = new android.widget.TextView(getContext());
        textView.setBackgroundResource(this.f279121t);
        textView.setTextColor(getResources().getColor(this.f279122u));
        textView.setTag(0);
        textView.setGravity(17);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, this.f279119r, 0);
        textView.setOnClickListener(this.f279114m ? this.f279112J : null);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setSingleLine();
        return textView;
    }

    public void k(boolean z17) {
        if (z17 == this.f279115n) {
            return;
        }
        this.f279115n = z17;
        removeView(this.E);
        if (this.f279115n) {
            addView(this.E);
            f();
        }
    }

    public final void l() {
        this.D = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(mo65203x2298764a(), (android.view.ViewGroup) null);
        this.E = inflate;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) inflate.findViewById(com.p314xaae8f345.mm.R.id.d98);
        this.F = c22621x7603e017;
        c22621x7603e017.setOnKeyListener(new db5.i6(this));
        this.F.addTextChangedListener(new db5.j6(this));
        this.F.setOnFocusChangeListener(new db5.k6(this));
        this.F.setOnClickListener(new db5.l6(this));
        this.F.setOnEditorActionListener(new db5.m6(this));
        db5.z6 z6Var = new db5.z6(this);
        this.F.mo81583x7e4f2d39(new android.text.InputFilter[]{z6Var, new db5.x6(this)});
        f();
        setOnClickListener(new db5.n6(this));
        setOnTouchListener(new db5.o6(this, z6Var));
    }

    public void m() {
    }

    public void n(db5.b7 b7Var) {
        b7Var.f309829b.setOnClickListener(null);
        java.util.LinkedList linkedList = this.B;
        if (linkedList.size() >= 16) {
            return;
        }
        linkedList.add(b7Var);
    }

    public void o() {
        java.util.LinkedList linkedList = this.A;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            db5.b7 b7Var = (db5.b7) it.next();
            removeView(b7Var.f309829b);
            n(b7Var);
        }
        linkedList.clear();
        h();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.K) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public void p(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMTagPanel", "want to remove tag, but it is null or empty");
            return;
        }
        java.util.LinkedList linkedList = this.A;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            db5.b7 b7Var = (db5.b7) it.next();
            if (str.equals(b7Var.f309828a)) {
                linkedList.remove(b7Var);
                removeView(b7Var.f309829b);
                n(b7Var);
                h();
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMTagPanel", "want to remove tag %s, but it not exsited!", str);
    }

    public void q() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.F;
        if (c22621x7603e017 == null || c22621x7603e017.isFocused()) {
            return;
        }
        this.F.requestFocus();
    }

    public void r(java.util.Collection collection, java.util.List list) {
        e();
        if (this.f279115n) {
            addView(this.E);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            d(str, collection == null ? false : collection.contains(str));
        }
    }

    public void s(java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMTagPanel", "want to update tag status, but it is null or empty");
            return;
        }
        java.util.Iterator it = this.A.iterator();
        while (it.hasNext()) {
            db5.b7 b7Var = (db5.b7) it.next();
            if (str.equals(b7Var.f309828a)) {
                t(b7Var, str, z17);
                h();
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMTagPanel", "want to update tag %s status, but it not exsited!", str);
    }

    /* renamed from: setCallBack */
    public void m79124x6c4032e7(db5.t6 t6Var) {
        this.C = t6Var;
    }

    /* renamed from: setEditHint */
    public void m79125xd60a4a33(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.F;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setHint(str);
        }
    }

    /* renamed from: setEditTextColor */
    public void m79126x666e2e0a(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.F;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setTextColor(i17);
        }
    }

    /* renamed from: setEditTextEnable */
    public void m79127x6aadfbbc(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.F;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setEnabled(z17);
        }
    }

    /* renamed from: setEditTextEnableEdit */
    public void m79128x27b29fe6(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.F;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setCursorVisible(z17);
            this.F.setFocusable(z17);
            this.F.setFocusableInTouchMode(z17);
        }
    }

    /* renamed from: setEditTextHit */
    public void m79129x8bf60ffa(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.F;
        if (c22621x7603e017 != null) {
            if (z17) {
                c22621x7603e017.setHint(com.p314xaae8f345.mm.R.C30867xcad56011.f571375da);
            } else {
                c22621x7603e017.setHint("");
            }
        }
    }

    /* renamed from: setEditTextOnClickListener */
    public void m79130x3163e4a4(android.view.View.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.F;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setClickable(true);
            this.F.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: setEditTextSize */
    public void m79131xf2d0f07a(float f17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.F;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setTextSize(0, f17);
        }
    }

    /* renamed from: setEdittextMaxSize */
    public void m79132x19e7f08c(int i17) {
        this.G = i17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.F;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setMaxEms(i17);
        }
    }

    /* renamed from: setHintTextSize */
    public void m79133xb7cc93f7(int i17) {
        this.D = i17;
    }

    /* renamed from: setIsAllowEnterCharacter */
    public void m79134xa13ce0e(boolean z17) {
        this.H = z17;
    }

    /* renamed from: setPanelClickable */
    public void m79135x51ea640(boolean z17) {
        this.K = z17;
    }

    /* renamed from: setTagEditTextBG */
    public void m79136x213c66d4(int i17) {
        this.f279120s = i17;
        if (this.F != null) {
            i65.a.b(getContext(), 6);
            getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
            this.F.setBackgroundResource(this.f279120s);
        }
    }

    /* renamed from: setTagHighlineBG */
    public void m79137xc209ad53(int i17) {
        this.f279125x = i17;
    }

    /* renamed from: setTagNormalBG */
    public void m79138x7e5ecb64(int i17) {
        this.f279121t = i17;
    }

    /* renamed from: setTagNormalTextColorRes */
    public void m79139xb10bdb09(int i17) {
        this.f279122u = i17;
    }

    /* renamed from: setTagSelectedBG */
    public void m79140x4a0e4618(int i17) {
        this.f279123v = i17;
    }

    /* renamed from: setTagSelectedTextColorRes */
    public void m79141x9bf884bd(int i17) {
        this.f279124w = i17;
    }

    /* renamed from: setTagTipsDrawable */
    public void m79142x43f367ee(int i17) {
        this.f279119r = i17;
    }

    /* renamed from: setTaghighlineTextColorRes */
    public void m79143xdf0f2a18(int i17) {
        this.f279126y = i17;
    }

    /* renamed from: setTagsSelected */
    public void m79144xad8cef56(java.util.ArrayList<java.lang.String> arrayList) {
        if (arrayList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMTagPanel", "want to update tags status, but tags list is null");
            return;
        }
        java.util.Iterator it = this.A.iterator();
        while (it.hasNext()) {
            db5.b7 b7Var = (db5.b7) it.next();
            java.lang.String str = b7Var.f309828a;
            t(b7Var, str, arrayList.contains(str));
        }
    }

    /* renamed from: setUnUseBackground */
    public void m79145xc5bfc73a(boolean z17) {
        this.I = z17;
    }

    public void t(db5.b7 b7Var, java.lang.String str, boolean z17) {
        b7Var.f309828a = str;
        b7Var.f309829b.setText(pg5.d.a(getContext(), str));
        b7Var.f309829b.setOnClickListener(this.f279114m ? this.f279112J : null);
        u(b7Var.f309829b, z17, false);
    }

    public void u(android.widget.TextView textView, boolean z17, boolean z18) {
        textView.setTextSize(0, this.D * i65.a.q(getContext()));
        if (z18) {
            textView.setBackgroundResource(this.f279125x);
            textView.setTextColor(getResources().getColor(this.f279126y));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, this.f279119r, 0);
            textView.setContentDescription(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bop, textView.getText()));
            return;
        }
        if (z17) {
            textView.setTag(1);
            textView.setBackgroundResource(this.f279123v);
            textView.setTextColor(getResources().getColor(this.f279124w));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            textView.setContentDescription(((java.lang.Object) textView.getText()) + getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbd) + getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_));
            return;
        }
        textView.setTag(0);
        textView.setBackgroundResource(this.f279121t);
        textView.setTextColor(getResources().getColor(this.f279122u));
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        textView.setContentDescription(((java.lang.Object) textView.getText()) + getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbd) + getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571376db));
    }

    public C21516xe823d84a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f279113i = false;
        this.f279114m = true;
        this.f279115n = false;
        this.f279116o = true;
        this.f279117p = false;
        this.f279118q = false;
        this.f279119r = com.p314xaae8f345.mm.R.C30861xcebc809e.cfw;
        this.f279120s = 0;
        this.f279121t = com.p314xaae8f345.mm.R.C30861xcebc809e.f563683b51;
        this.f279122u = com.p314xaae8f345.mm.R.C30859x5a72f63.a0c;
        this.f279123v = com.p314xaae8f345.mm.R.C30861xcebc809e.b4t;
        this.f279124w = com.p314xaae8f345.mm.R.C30859x5a72f63.aaq;
        this.f279125x = com.p314xaae8f345.mm.R.C30861xcebc809e.b4w;
        this.f279126y = com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0;
        this.f279127z = null;
        this.A = new java.util.LinkedList();
        this.B = new java.util.LinkedList();
        this.H = false;
        this.I = false;
        this.f279112J = new db5.s6(this);
        this.K = true;
        l();
    }
}
