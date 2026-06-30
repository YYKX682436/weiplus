package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd;

/* loaded from: classes5.dex */
public abstract class b1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.a implements com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.d, ev3.b {
    public ev3.d A;
    public ev3.e B;
    public final im5.c C;
    public final java.lang.Runnable D;
    public boolean E;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f237703h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f237704i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f237705m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f237706n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.EditText f237707o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f237708p;

    /* renamed from: q, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f237709q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f237710r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f237711s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f237712t;

    /* renamed from: u, reason: collision with root package name */
    public dv3.c f237713u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f237714v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f237715w;

    /* renamed from: x, reason: collision with root package name */
    public wt3.z f237716x;

    /* renamed from: y, reason: collision with root package name */
    public long f237717y;

    /* renamed from: z, reason: collision with root package name */
    public int f237718z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(android.view.ViewGroup parent, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.j0 status, boolean z17) {
        super(parent, status);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f237703h = "MicroMsg.MusicSearchInputComponent";
        st3.v vVar = st3.v.f494138d;
        this.C = new im5.c();
        this.D = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.a1(this);
    }

    public static final void q(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b1 b1Var, boolean z17) {
        android.widget.EditText editText = b1Var.f237707o;
        if (editText != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b1Var.y(), "setImeVisibility: " + z17);
            java.lang.Runnable runnable = b1Var.D;
            if (z17) {
                editText.post(runnable);
                return;
            }
            editText.removeCallbacks(runnable);
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) b1Var.f237701g.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.d
    public void A() {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f237715w, this.f237714v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(y(), "refreshSearchList: same string, no need to update");
            return;
        }
        nu3.i iVar = nu3.i.f421751a;
        nu3.i.c(iVar, "KEY_SEARCH_MUSIC_COUNT_INT", 0, 2, null);
        java.lang.String str = this.f237714v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        iVar.e("KEY_SEARCH_MUSIC_LIST_STRING", str);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f237709q;
        if (c1163xf1deaba4 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent", "refreshSearchList", "()V", "Undefined", "scrollToPosition", "(I)V");
            c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent", "refreshSearchList", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
        dv3.c cVar = this.f237713u;
        if (cVar != null) {
            cVar.T0(new java.util.LinkedList());
        }
        this.f237717y = 0L;
        dv3.c cVar2 = this.f237713u;
        if (cVar2 != null) {
            cVar2.K = 0;
        }
        this.f237715w = this.f237714v;
        u(false, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.c1.f237721d);
    }

    public abstract boolean B();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.d
    public java.lang.String C() {
        java.lang.String str = this.f237714v;
        return str == null ? "" : str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.d
    /* renamed from: D */
    public dv3.c getF237889u() {
        return this.f237713u;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.d
    public void F() {
        android.widget.LinearLayout linearLayout = this.f237711s;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f237709q;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.setVisibility(8);
        }
        android.widget.TextView textView = this.f237710r;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.d
    public void N() {
        android.widget.LinearLayout linearLayout = this.f237711s;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f237709q;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.setVisibility(8);
        }
        android.widget.TextView textView = this.f237710r;
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.d
    /* renamed from: getActivity */
    public android.app.Activity mo68350x19263085() {
        android.content.Context context = this.f237701g;
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        return null;
    }

    @Override // ev3.b
    public void h(android.view.View itemView, rv3.h feed, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.d
    public void i0(java.util.ArrayList audioList, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioList, "audioList");
        if (!z17) {
            this.f237718z = 0;
        }
        android.widget.LinearLayout linearLayout = this.f237711s;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f237709q;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.setVisibility(0);
        }
        android.widget.TextView textView = this.f237710r;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (z17) {
            dv3.c cVar = this.f237713u;
            if (cVar != null) {
                dv3.c.F0(cVar, audioList, false, 2, null);
                return;
            }
            return;
        }
        dv3.c cVar2 = this.f237713u;
        if (cVar2 != null) {
            cVar2.T0(audioList);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.d
    public void j(fv3.d statusEnum, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusEnum, "statusEnum");
        this.f348515d.j(statusEnum, bundle);
    }

    @Override // fv3.b
    public void m() {
        android.view.View n17 = n(com.p314xaae8f345.mm.R.id.pza);
        this.f237704i = n17;
        if (n17 != null) {
            n17.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.v0(this));
        }
        android.view.View n18 = n(com.p314xaae8f345.mm.R.id.pz7);
        this.f237705m = n18;
        if (n18 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(n18, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent", "initSearchInputViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            n18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(n18, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent", "initSearchInputViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View n19 = n(com.p314xaae8f345.mm.R.id.qgo);
        this.f237706n = n19;
        android.content.Context context = this.f237701g;
        if (n19 != null) {
            n19.setContentDescription(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571545ig));
        }
        android.view.View view = this.f237706n;
        if (view != null) {
            view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.w0(this));
        }
        android.widget.EditText editText = (android.widget.EditText) n(com.p314xaae8f345.mm.R.id.nm8);
        this.f237707o = editText;
        if (editText != null) {
            editText.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.x0(this));
        }
        android.widget.ImageView imageView = (android.widget.ImageView) n(com.p314xaae8f345.mm.R.id.nm_);
        if (imageView != null) {
            imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79899x267f2c0, i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834)));
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) n(com.p314xaae8f345.mm.R.id.nm9);
        this.f237708p = imageView2;
        if (imageView2 != null) {
            imageView2.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79679xe7836e52, i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834)));
        }
        android.widget.ImageView imageView3 = this.f237708p;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.y0(this));
        }
        this.f237712t = n(com.p314xaae8f345.mm.R.id.nma);
        this.f237709q = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) n(com.p314xaae8f345.mm.R.id.nmh);
        this.f237710r = (android.widget.TextView) n(com.p314xaae8f345.mm.R.id.nmf);
        this.f237711s = (android.widget.LinearLayout) n(com.p314xaae8f345.mm.R.id.nme);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f237709q;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 1, false));
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f237709q;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.z0(this));
        }
        dv3.c s17 = s(new java.util.ArrayList());
        this.f237713u = s17;
        if (s17 != null) {
            s17.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.n0(this);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f237709q;
        if (c1163xf1deaba43 != null) {
            c1163xf1deaba43.mo7960x6cab2c8d(s17);
        }
        android.widget.EditText editText2 = this.f237707o;
        if (editText2 != null) {
            editText2.setOnFocusChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.r0(this));
        }
        android.widget.EditText editText3 = this.f237707o;
        if (editText3 != null) {
            editText3.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.s0(this));
        }
        android.widget.EditText editText4 = this.f237707o;
        if (editText4 != null) {
            editText4.setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.t0(this));
        }
        ev3.d dVar = this.A;
        if (dVar != null) {
            dVar.c(x(), new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.u0(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.a
    public void o(boolean z17) {
        fv3.c.a(this.f348515d, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.i0.f237781h, null, 2, null);
        android.view.View view = this.f237705m;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent", "hideSearchUI", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicSearchInputComponent", "hideSearchUI", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        z();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.d
    public void p(boolean z17) {
        this.E = z17;
    }

    public in5.s r(final yz5.a aVar, final yz5.p pVar) {
        return new in5.s() { // from class: com.tencent.mm.plugin.recordvideo.ui.editor.music.component.MusicSearchInputComponent$buildRVItemConverts$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == 2) {
                    return new rv3.k();
                }
                return new rv3.m(pVar, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b1.this, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b1.this.w(), com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b1.this.v(), aVar);
            }
        };
    }

    public dv3.c s(java.util.ArrayList initData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initData, "initData");
        return new dv3.e(r(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.o0(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.p0(this)), initData);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a t(r45.mh4 protoInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(protoInfo, "protoInfo");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a.M.c(protoInfo, 3);
    }

    public void u(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.c1 searchType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchType, "searchType");
        y();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f237714v)) {
            return;
        }
        if (!z17) {
            F();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key_string_1", this.f237714v);
            this.f348515d.j(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.i0.f237780g, bundle);
        }
        java.lang.String str = this.f237714v;
        if (str == null) {
            str = "";
        }
        wt3.z zVar = this.f237716x;
        if (zVar != null) {
            zVar.j();
        }
        long j17 = this.f237717y;
        dv3.c cVar = this.f237713u;
        wt3.z zVar2 = new wt3.z(j17, str, cVar != null ? cVar.K : 0, 0L, 0, 0, 16, null);
        this.f237716x = zVar2;
        pq5.g l17 = zVar2.l();
        if (l17 != null) {
            l17.f(this.C);
            l17.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.q0(this, str, z17));
        }
    }

    public boolean v() {
        return false;
    }

    public boolean w() {
        return false;
    }

    public int x() {
        return 3;
    }

    public java.lang.String y() {
        return this.f237703h;
    }

    public void z() {
        wt3.z zVar = this.f237716x;
        if (zVar != null) {
            zVar.j();
        }
        this.f237716x = null;
        dv3.c cVar = this.f237713u;
        if (cVar != null) {
            cVar.K = 0;
        }
        this.f237717y = 0L;
        android.widget.EditText editText = this.f237707o;
        if (editText != null) {
            editText.setText((java.lang.CharSequence) null);
        }
        this.f237714v = "";
        this.f237715w = "";
        this.f237718z = 0;
        dv3.c cVar2 = this.f237713u;
        if (cVar2 != null) {
            cVar2.T0(new java.util.LinkedList());
        }
    }
}
