package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class a4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2 f210380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f210381e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2 activityC15025x361cfff2, java.lang.Throwable th6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f210380d = activityC15025x361cfff2;
        this.f210381e = th6;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.a4(this.f210380d, this.f210381e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.a4 a4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.a4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        a4Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.nk2 nk2Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.Throwable th6 = this.f210381e;
        int i17 = ((rm0.j) th6).f478957e;
        int i18 = ((rm0.j) th6).f478958f;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((rm0.j) th6).f478960h;
        jz5.f0 f0Var = null;
        r45.r01 r01Var = fVar instanceof r45.r01 ? (r45.r01) fVar : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2 activityC15025x361cfff2 = this.f210380d;
        android.app.ProgressDialog progressDialog = activityC15025x361cfff2.U;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (i18 == -4008) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1279L, 38L, 1L);
        } else if (i18 == -4003) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1279L, 37L, 1L);
        }
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (r01Var != null && (nk2Var = (r45.nk2) r01Var.m75936x14adae67(2)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCreateContactUI", "verify info: " + pm0.b0.g(nk2Var));
            if (nk2Var.m75939xb282bd08(6) == 1) {
                android.widget.EditText editText = activityC15025x361cfff2.f210079w;
                if (editText == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickEdt");
                    throw null;
                }
                editText.setTextColor(i65.a.d(activityC15025x361cfff2, com.p314xaae8f345.mm.R.C30859x5a72f63.a2y));
            }
            if (i18 == -4009) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(activityC15025x361cfff2.mo55332x76847179());
                y1Var.j(com.p314xaae8f345.mm.R.C30864xbddafb2a.ecn);
                android.widget.TextView textView = (android.widget.TextView) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.odf);
                if (textView != null) {
                    textView.setText(nk2Var.m75945x2fec8307(0));
                }
                android.widget.TextView textView2 = (android.widget.TextView) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.f567500uh5);
                if (textView2 != null) {
                    textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.g3(y1Var));
                }
                java.lang.String string = activityC15025x361cfff2.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o2f);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                android.text.SpannableString spannableString = new android.text.SpannableString(string);
                spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl(string, activityC15025x361cfff2.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5), activityC15025x361cfff2.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77841x66d62781), false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.h3(nk2Var), 16, null), 0, string.length(), 17);
                android.widget.TextView textView3 = (android.widget.TextView) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.sh7);
                if (textView3 != null) {
                    textView3.setText(string);
                    textView3.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c8(spannableString, textView3));
                }
                y1Var.s();
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nk2Var.m75945x2fec8307(1))) {
                java.lang.String string2 = activityC15025x361cfff2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cro);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.m7(activityC15025x361cfff2, string2, null, null, 6, null);
            } else {
                java.lang.String m75945x2fec8307 = nk2Var.m75945x2fec8307(1);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                activityC15025x361cfff2.l7(m75945x2fec8307, nk2Var.m75945x2fec8307(8), nk2Var.m75945x2fec8307(7));
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            java.lang.String string3 = activityC15025x361cfff2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cro);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.m7(activityC15025x361cfff2, string3, null, null, 6, null);
        }
        activityC15025x361cfff2.setResult(5);
        return f0Var2;
    }
}
