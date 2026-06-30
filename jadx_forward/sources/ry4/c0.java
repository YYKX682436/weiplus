package ry4;

/* loaded from: classes.dex */
public final class c0 extends wm3.a implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f483122d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 f483123e;

    /* renamed from: f, reason: collision with root package name */
    public int f483124f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f483125g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a f483126h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a f483127i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f483128m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a f483129n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f483130o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f483131p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f483132q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ScrollView f483133r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f483134s;

    /* renamed from: t, reason: collision with root package name */
    public int f483135t;

    /* renamed from: u, reason: collision with root package name */
    public final ry4.p f483136u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f483122d = "";
        this.f483124f = -1;
        this.f483131p = jz5.h.b(new ry4.m(this));
        this.f483132q = jz5.h.b(new ry4.i(this));
        this.f483136u = new ry4.p(this);
    }

    public static final java.lang.Object T6(ry4.c0 c0Var, xg3.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        c0Var.getClass();
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        ry4.n nVar = new ry4.n(rVar);
        xg3.o0 fj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj();
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(nVar);
        e21.z0 z0Var = (e21.z0) fj6;
        z0Var.getClass();
        z0Var.d(aVar, null, weakReference);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar2 = pz5.a.f440719d;
        return j17;
    }

    public final void U6() {
        m158354x19263085().finish();
        m158354x19263085().overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    public final void V6() {
        android.widget.LinearLayout linearLayout = this.f483134s;
        if (linearLayout != null && linearLayout.getPaddingBottom() > 0) {
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), 0);
        }
    }

    public final void W6() {
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21525x1d56253b editText;
        android.text.Editable text;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = this.f483126h;
        if (c21503x6e5a020a == null || (editText = c21503x6e5a020a.getEditText()) == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a2 = this.f483127i;
        boolean z17 = false;
        boolean c17 = c21503x6e5a020a2 != null ? c21503x6e5a020a2.c() : false;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a3 = this.f483126h;
        boolean c18 = c21503x6e5a020a3 != null ? c21503x6e5a020a3.c() : false;
        if ((!r26.n0.N(str)) && !c17 && !c18) {
            z17 = true;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.m78500x43e00957(1, z17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eqa;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0270, code lost:
    
        if (((r12 == null || (r12 = r12.f269613e) == null || !(r26.n0.N(r12) ^ true)) ? false : true) != false) goto L172;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo739xfd763ae1(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ry4.c0.mo739xfd763ae1(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f483130o;
        if (f5Var != null) {
            if (f5Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyboardHeightProvider");
                throw null;
            }
            f5Var.d();
        }
        android.widget.ScrollView scrollView = this.f483133r;
        if (scrollView == null || (viewTreeObserver = scrollView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this.f483136u);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f483130o;
        if (f5Var != null) {
            if (f5Var != null) {
                f5Var.d();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyboardHeightProvider");
                throw null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f483130o;
        if (f5Var != null) {
            if (f5Var != null) {
                f5Var.f();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyboardHeightProvider");
                throw null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onSaveInstanceState */
    public void mo2285xa71a2260(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21525x1d56253b editText;
        android.text.Editable text;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21525x1d56253b editText2;
        android.text.Editable text2;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21525x1d56253b editText3;
        android.text.Editable text3;
        java.lang.String obj;
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21525x1d56253b editText4;
        android.text.Editable text4;
        super.mo2285xa71a2260(bundle);
        java.lang.String str2 = "";
        if (bundle != null) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = this.f483126h;
            if (c21503x6e5a020a == null || (editText4 = c21503x6e5a020a.getEditText()) == null || (text4 = editText4.getText()) == null || (str = text4.toString()) == null) {
                str = "";
            }
            bundle.putString("state_content", str);
        }
        if (bundle != null) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a2 = this.f483127i;
            if (c21503x6e5a020a2 != null && (editText3 = c21503x6e5a020a2.getEditText()) != null && (text3 = editText3.getText()) != null && (obj = text3.toString()) != null) {
                str2 = obj;
            }
            bundle.putString("state_title", str2);
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a3 = this.f483126h;
        java.lang.String str3 = null;
        objArr[0] = (c21503x6e5a020a3 == null || (editText2 = c21503x6e5a020a3.getEditText()) == null || (text2 = editText2.getText()) == null) ? null : text2.toString();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a4 = this.f483127i;
        if (c21503x6e5a020a4 != null && (editText = c21503x6e5a020a4.getEditText()) != null && (text = editText.getText()) != null) {
            str3 = text.toString();
        }
        objArr[1] = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutCommandEditUIC", "[onSaveInstanceState] content=%s, title=%s", objArr);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        android.widget.LinearLayout linearLayout;
        android.widget.ScrollView scrollView = this.f483133r;
        if (scrollView == null || (linearLayout = this.f483134s) == null) {
            return;
        }
        if (i17 == 0) {
            V6();
            this.f483135t = 0;
            scrollView.post(new ry4.v(scrollView));
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = this.f483129n;
        if (c21503x6e5a020a == null) {
            V6();
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c21503x6e5a020a, this.f483126h)) {
            V6();
            scrollView.smoothScrollTo(0, ((java.lang.Number) ((jz5.n) this.f483132q).mo141623x754a37bb()).intValue());
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c21503x6e5a020a, this.f483127i)) {
            int height = scrollView.getHeight() - (linearLayout.getHeight() - linearLayout.getPaddingBottom());
            int i18 = height >= 0 ? height : 0;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a2 = this.f483127i;
            if (c21503x6e5a020a2 != null) {
                c21503x6e5a020a = c21503x6e5a020a2;
            }
            int[] iArr = new int[2];
            c21503x6e5a020a.getLocationOnScreen(iArr);
            int height2 = iArr[1] + c21503x6e5a020a.getHeight();
            int[] iArr2 = new int[2];
            scrollView.getLocationOnScreen(iArr2);
            linearLayout.post(new ry4.j(linearLayout, i18 + ((java.lang.Number) ((jz5.n) this.f483131p).mo141623x754a37bb()).intValue(), height2 - ((iArr2[1] + scrollView.getHeight()) - i17)));
            scrollView.postDelayed(new ry4.k(this, scrollView, i17), 300L);
        }
    }
}
