package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ei extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n8 implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f199785h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f199786i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f199787m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f199788n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.EditText f199789o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f199790p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f199791q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f199792r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f199793s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aqk, (android.view.ViewGroup) this, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f199786i = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.ds7);
        this.f199787m = findViewById;
        android.view.View findViewById2 = this.f199786i.findViewById(com.p314xaae8f345.mm.R.id.ds8);
        this.f199788n = findViewById2;
        android.widget.TextView title = (android.widget.TextView) this.f199786i.findViewById(com.p314xaae8f345.mm.R.id.dsa);
        android.widget.EditText editText = (android.widget.EditText) this.f199786i.findViewById(com.p314xaae8f345.mm.R.id.jpt);
        this.f199789o = editText;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f199786i.findViewById(com.p314xaae8f345.mm.R.id.ds9);
        android.widget.TextView textView = (android.widget.TextView) this.f199786i.findViewById(com.p314xaae8f345.mm.R.id.jpp);
        this.f199790p = textView;
        this.f199791q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.di(this));
        this.f199792r = "";
        this.f199793s = "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(title, "title");
        com.p314xaae8f345.mm.ui.fk.a(title);
        d(false);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        c22699x3dcdb352.setOnClickListener(this);
        textView.setOnClickListener(this);
        zl2.r4.f555483a.Z2(editText, null, 6, 3, (r17 & 16) != 0, (r17 & 32) != 0 ? com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2 : null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yh(this));
        editText.clearFocus();
        m58110x3ab833d4(textView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getModifyBottomPage */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ai m58022x3addff2a() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ai) ((jz5.n) this.f199791q).mo141623x754a37bb();
    }

    public final void c(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        r45.eq1 eq1Var;
        mm2.n2 n2Var = (mm2.n2) dk2.ef.f314905a.i(mm2.n2.class);
        java.lang.String m75945x2fec8307 = (n2Var == null || (eq1Var = n2Var.f410812g) == null) ? null : eq1Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        this.f199793s = m75945x2fec8307;
        this.f199789o.setHint(m75945x2fec8307);
        zl2.r4.f555483a.Q2(this);
        if (y1Var != null) {
            y1Var.h(m58022x3addff2a());
        }
    }

    public final void d(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFansModifyNameWidget", "updateConfirmBtn canConfirm:" + z17);
        this.f199790p.setEnabled(z17);
    }

    /* renamed from: getBackClickListener */
    public final yz5.a m58023x563007ff() {
        return this.f199785h;
    }

    /* renamed from: getFansClubName */
    public final java.lang.String m58024xbcef56b7() {
        return this.f199792r;
    }

    /* renamed from: getLastFansClubName */
    public final java.lang.String m58025xcd4de16d() {
        return this.f199793s;
    }

    /* renamed from: getRoot */
    public final android.view.View m58026xfb84e958() {
        return this.f199786i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyNameWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.widget.EditText editText = this.f199789o;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.ds7) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = m58022x3addff2a().f293331d;
            if (y1Var != null) {
                y1Var.q();
            }
            editText.clearFocus();
            editText.setText("");
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.ds9) {
            editText.clearFocus();
            editText.setText("");
            editText.clearFocus();
            android.content.Context context = editText.getContext();
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) (context != null ? context.getSystemService("input_method") : null);
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
            }
            postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ci(this), 300L);
            yz5.a aVar = this.f199785h;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.jpp) {
            d(false);
            java.lang.String str = this.f199792r;
            r45.eq1 eq1Var = new r45.eq1();
            eq1Var.set(0, str);
            new ke2.e(2, eq1Var, (r45.qt2) null).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bi(this));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyNameWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: setBackClickListener */
    public final void m58027x31c61473(yz5.a aVar) {
        this.f199785h = aVar;
    }

    /* renamed from: setFansClubName */
    public final void m58028xf33851c3(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f199792r = str;
    }

    /* renamed from: setLastFansClubName */
    public final void m58029x714a7679(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f199793s = str;
    }

    /* renamed from: setRoot */
    public final void m58030x764fb064(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<set-?>");
        this.f199786i = view;
    }
}
