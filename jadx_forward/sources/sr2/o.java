package sr2;

/* loaded from: classes.dex */
public final class o extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f493180d;

    /* renamed from: e, reason: collision with root package name */
    public ya2.b2 f493181e;

    /* renamed from: f, reason: collision with root package name */
    public final int f493182f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f493183g;

    /* renamed from: h, reason: collision with root package name */
    public y9.i f493184h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f493180d = "";
        this.f493182f = 3;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.view.Window window;
        android.view.View decorView;
        android.view.Window window2;
        java.lang.String e17 = xy2.c.e(m158354x19263085());
        this.f493180d = e17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
            this.f493181e = ya2.h.f542017a.b(this.f493180d);
        }
        ya2.b2 b2Var = this.f493181e;
        long j17 = b2Var != null ? b2Var.f69298x75e87a18 : 0L;
        boolean z17 = (64 & j17) > 0;
        boolean z18 = (128 & j17) > 0;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_AD_COMMENT_APPLY_DIALOG_SHOW_COUNT_INT_SYNC;
        int r17 = c17.r(u3Var, 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkShowApplyDialog extFlag=");
        sb6.append(j17);
        sb6.append(" isAlreadyJoin=");
        sb6.append(z17);
        sb6.append(" isAdCheckPass=");
        sb6.append(z18);
        sb6.append(" dialogShowCount=");
        sb6.append(r17);
        sb6.append(" showMaxCount=");
        int i17 = this.f493182f;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostAdCommentApplyUIC", sb6.toString());
        if (z17 || !z18 || r17 >= i17) {
            return;
        }
        if (this.f493184h == null) {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b5i, (android.view.ViewGroup) null, false);
            y9.i iVar = new y9.i(m80379x76847179(), com.p314xaae8f345.mm.R.C30868x68b1db1.f81563do);
            this.f493184h = iVar;
            iVar.setContentView(inflate);
            y9.i iVar2 = this.f493184h;
            if (iVar2 != null && (window2 = iVar2.getWindow()) != null) {
                window2.setDimAmount(0.5f);
            }
            y9.i iVar3 = this.f493184h;
            if (iVar3 != null && (window = iVar3.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ayr);
            }
            y9.i iVar4 = this.f493184h;
            if (iVar4 != null) {
                iVar4.setOnDismissListener(new sr2.n(this));
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.e9j);
            android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.e9k);
            android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.e9l);
            com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc = (com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) inflate.findViewById(com.p314xaae8f345.mm.R.id.e9o);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.m(d2Var, findViewById, "join_original_split", 0, 0, null, null, 60, null);
            findViewById.setOnClickListener(new sr2.i(this));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.m(d2Var, findViewById2, "nojoin_original_split", 0, 0, null, null, 60, null);
            findViewById2.setOnClickListener(new sr2.j(this));
            checkBox.setOnCheckedChangeListener(new sr2.k(this, findViewById));
            java.lang.String string = m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cjv);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String string2 = m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cjw, string);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            android.text.SpannableString spannableString = new android.text.SpannableString(string2);
            int L = r26.n0.L(string2, string, 0, false, 6, null);
            spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl(string2, m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c), m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e), false, false, new sr2.l(this)), L, string.length() + L, 17);
            c23001x9d3a0bdc.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(m80379x76847179()));
            c23001x9d3a0bdc.b(spannableString);
            c23001x9d3a0bdc.setOnClickListener(new sr2.m(checkBox));
            y9.i iVar5 = this.f493184h;
            if (iVar5 != null) {
                iVar5.show();
            }
        }
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
    }
}
