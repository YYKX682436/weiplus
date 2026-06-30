package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class c40 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f215488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f215489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f215490f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f215491g;

    public c40(android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var) {
        this.f215488d = textView;
        this.f215489e = textView2;
        this.f215490f = textView3;
        this.f215491g = f50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.String str;
        r45.f03 f03Var;
        r45.f03 f03Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[wxMessageEntrance] red=");
        sb6.append(z9Var != null && z9Var.f186860a);
        sb6.append(" ctrlType=");
        sb6.append((z9Var == null || (jbVar = z9Var.f186862c) == null) ? null : java.lang.Integer.valueOf(jbVar.m55856xfb85f7b0()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SelfUIC", sb6.toString());
        java.lang.String str2 = (z9Var == null || (f03Var2 = z9Var.f186861b) == null) ? null : f03Var2.f455439z;
        if ((str2 == null || str2.length() == 0) == false) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b((z9Var == null || (f03Var = z9Var.f186861b) == null) ? null : f03Var.f455439z, g92.b.f351302e.T0())) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("return show this reddot ");
                sb7.append(z9Var != null ? z9Var.f186862c : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.SelfUIC", sb7.toString());
                return;
            }
        }
        boolean z17 = z9Var != null && z9Var.f186860a;
        android.widget.TextView textView = this.f215489e;
        android.widget.TextView textView2 = this.f215490f;
        android.widget.TextView textView3 = this.f215488d;
        if (!z17) {
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
            return;
        }
        r45.f03 f03Var3 = z9Var.f186861b;
        int i17 = f03Var3 != null ? f03Var3.f455421e : 0;
        int i18 = f03Var3 != null ? f03Var3.f455420d : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SelfUIC", "wxMessageEntrance count:" + i17 + ",showType:" + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var = this.f215491g;
        if (i18 == 2) {
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.a(i17));
            }
            textView3.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(f50Var.m80379x76847179(), i17));
            textView3.setTextSize(0, i65.a.f(f50Var.m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f562162ad3) * i65.a.m(f50Var.m80379x76847179()));
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else if (i18 == 27) {
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            i95.m c17 = i95.n0.c(zy2.s6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.s6 s6Var = (zy2.s6) c17;
            r45.f03 f03Var4 = z9Var.f186861b;
            if (f03Var4 == null || (str = f03Var4.f455422f) == null) {
                str = "";
            }
            android.text.SpannableString H3 = zy2.s6.H3(s6Var, str, (int) (textView2 != null ? textView2.getTextSize() : 0.0f), false, 4, null);
            if (textView2 != null) {
                textView2.setText(H3);
            }
        }
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("WxMessageEntry");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("WxMessageEntry");
        if (I0 == null || L0 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(L0.f65880x11c19d58, f50Var.R)) {
            return;
        }
        java.lang.String field_tipsId = L0.f65880x11c19d58;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_tipsId, "field_tipsId");
        f50Var.R = field_tipsId;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = f50Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.i(x2Var, "4", L0, I0, 1, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
    }
}
