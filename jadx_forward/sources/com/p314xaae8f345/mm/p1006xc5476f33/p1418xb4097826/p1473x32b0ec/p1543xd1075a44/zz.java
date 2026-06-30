package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class zz {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dz f202150a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dz();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 f202151b;

    public zz(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var) {
        this.f202151b = m10Var;
    }

    public final java.lang.CharSequence a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var = this.f202151b;
        java.lang.String string = m10Var.f200532a.getContext().getString(i17, java.lang.Integer.valueOf(i18));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        int L = r26.n0.L(string, java.lang.String.valueOf(i18), 0, false, 6, null);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = m10Var.f200532a.getContext();
        java.lang.String substring = string.substring(0, L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        java.lang.String substring2 = string.substring(L, string.length());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
        android.content.Context context2 = m10Var.f200532a.getContext();
        android.widget.TextView textView = m10Var.f200535d;
        android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(context2, com.p314xaae8f345.mm.R.raw.f78868xd4a8b967, textView != null ? textView.getCurrentTextColor() : -1);
        e17.setBounds(0, 0, i65.a.f(m10Var.f200532a.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), i65.a.f(m10Var.f200532a.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        ((ke0.e) xVar).getClass();
        return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.b(context, substring, substring2, e17, true, false);
    }

    public final void b(r45.q63 q63Var, java.lang.Runnable runnable, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var = this.f202151b;
        android.widget.TextView textView = m10Var.f200538g;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = m10Var.f200539h;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.widget.TextView textView3 = m10Var.f200538g;
        if (textView3 != null) {
            textView3.setText(m10Var.f200532a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.czv));
        }
        android.widget.TextView textView4 = m10Var.f200535d;
        if (textView4 != null) {
            textView4.setText(a(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.czw : com.p314xaae8f345.mm.R.C30867xcad56011.czx, q63Var.m75939xb282bd08(11)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var2 = this.f202151b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xz xzVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xz(m10Var2, this, q63Var, z17, runnable);
        android.widget.TextView textView5 = m10Var2.f200538g;
        if (textView5 != null) {
            textView5.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vz(m10Var2, q63Var, xzVar));
        }
    }

    public final void c(boolean z17, r45.q63 q63Var) {
        android.content.Context context;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var = this.f202151b;
        android.widget.TextView textView = m10Var.f200538g;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = m10Var.f200539h;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        if (z17) {
            android.widget.TextView textView3 = m10Var.f200535d;
            if (textView3 == null) {
                return;
            }
            textView3.setText(a(com.p314xaae8f345.mm.R.C30867xcad56011.czx, q63Var.m75939xb282bd08(11)));
            return;
        }
        android.widget.TextView textView4 = m10Var.f200535d;
        if (textView4 != null) {
            textView4.setText(a(com.p314xaae8f345.mm.R.C30867xcad56011.czw, q63Var.m75939xb282bd08(11)));
        }
        android.widget.TextView textView5 = m10Var.f200539h;
        if (textView5 == null) {
            return;
        }
        textView5.setText((textView5 == null || (context = textView5.getContext()) == null) ? null : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cz_));
    }

    public final void d(r45.q63 q63Var, java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var = this.f202151b;
        android.widget.TextView textView = m10Var.f200538g;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = m10Var.f200539h;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.widget.TextView textView3 = m10Var.f200538g;
        if (textView3 != null) {
            textView3.setText(m10Var.f200532a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.czr));
        }
        android.widget.TextView textView4 = m10Var.f200535d;
        if (textView4 != null) {
            textView4.setText(a(com.p314xaae8f345.mm.R.C30867xcad56011.czx, q63Var.m75939xb282bd08(11)));
        }
        android.widget.TextView textView5 = m10Var.f200538g;
        if (textView5 != null) {
            textView5.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yz(m10Var, runnable));
        }
    }
}
