package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class h8 implements com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.k4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.i8 f261853a;

    public h8(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.i8 i8Var) {
        this.f261853a = i8Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.k4
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 c19098xdf4bc178) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String m17;
        java.lang.String string;
        double d17;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.i8 i8Var = this.f261853a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var = i8Var.f261874f;
        n8Var.H = c19098xdf4bc178;
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = n8Var.X;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.a(c19760x34448d56 == null ? 0 : c19760x34448d56.f273642e, c19760x34448d56 == null ? "" : c19760x34448d56.f273647m, 15, c19098xdf4bc178.f261200d);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var2 = i8Var.f261874f;
        n8Var2.I = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 c19098xdf4bc1782 = n8Var2.H;
        java.util.List h17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.g0.h(c19098xdf4bc1782.f261201e, c19098xdf4bc1782.f261202f);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 c19098xdf4bc1783 = n8Var2.H;
        c19098xdf4bc1783.f261204h = "";
        boolean j17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.g0.j(c19098xdf4bc1783, n8Var2.K);
        android.content.Context context = i8Var.f261872d;
        if (j17) {
            n8Var2.I = true;
            if (((java.util.ArrayList) h17).size() == 0) {
                n8Var2.H.f261204h = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.klp);
            } else {
                n8Var2.H.f261204h = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.klq);
            }
            n8Var2.dismiss();
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m8 m8Var = n8Var2.f262069u;
            if (m8Var != null) {
                m8Var.a(n8Var2.f262068t.m83161xfb85ada3(), n8Var2.H, n8Var2.I);
                return;
            }
        }
        android.view.View view = n8Var2.f262071w;
        if (view != null) {
            view.setTag(n8Var2.H);
        }
        vr4.l0 f17 = n8Var2.G.f(n8Var2.H.f261200d);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = i8Var.f261873e;
        vr4.j0 j0Var = c19099x8d444f05.N;
        double d18 = j0Var.f521288f;
        java.lang.String str4 = null;
        if (f17 == null || f17.f521312m <= 0.0d) {
            double d19 = j0Var.f521286d;
            str = null;
            str2 = null;
            m17 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(d19);
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kwr);
            d17 = d19;
        } else {
            d17 = f17.f521308f;
            java.lang.String m18 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(f17.f521311i);
            java.lang.String m19 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(c19099x8d444f05.N.f521286d);
            str2 = f17.f521314o;
            str = m19;
            m17 = m18;
            string = null;
        }
        if (f17 == null || f17.f521313n == 0) {
            str3 = null;
        } else {
            str3 = f17.f521315p;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                str3 = "," + str3;
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                str4 = "," + string;
            }
            string = str4;
        }
        n8Var2.t(m17, d17);
        n8Var2.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            n8Var2.f262061n.setVisibility(8);
        } else {
            n8Var2.f262061n.setVisibility(0);
            n8Var2.f262061n.setText(str);
        }
        n8Var2.s(str2, string);
        java.lang.String str5 = c19099x8d444f05.f261214m;
        n8Var2.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            n8Var2.A.setVisibility(8);
        } else {
            n8Var2.A.setText(str3);
            n8Var2.A.setVisibility(0);
        }
    }
}
