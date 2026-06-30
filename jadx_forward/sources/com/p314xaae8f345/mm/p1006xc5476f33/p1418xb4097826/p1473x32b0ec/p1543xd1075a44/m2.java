package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class m2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s2 f200558d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s2 s2Var) {
        super(0);
        this.f200558d = s2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.s2 s2Var = this.f200558d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3(s2Var.f201232a);
        android.content.Context context = s2Var.f201232a;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e7v, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        s2Var.f201238g = inflate;
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        int color = context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadii(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, 0.0f, 0.0f, 0.0f, 0.0f});
        android.view.View view = s2Var.f201238g;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        view.setBackground(gradientDrawable);
        android.view.View view2 = s2Var.f201238g;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.u_a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        s2Var.f201239h = (android.widget.TextView) findViewById;
        android.view.View view3 = s2Var.f201238g;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        android.view.View findViewById2 = view3.findViewById(com.p314xaae8f345.mm.R.id.f567072i12);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        s2Var.f201240i = (android.widget.TextView) findViewById2;
        android.view.View view4 = s2Var.f201238g;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        android.view.View findViewById3 = view4.findViewById(com.p314xaae8f345.mm.R.id.u_8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        s2Var.f201241j = (android.widget.LinearLayout) findViewById3;
        android.view.View view5 = s2Var.f201238g;
        if (view5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        android.view.View findViewById4 = view5.findViewById(com.p314xaae8f345.mm.R.id.f567071i11);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        s2Var.f201242k = (android.widget.CheckBox) findViewById4;
        android.view.View view6 = s2Var.f201238g;
        if (view6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        android.view.View findViewById5 = view6.findViewById(com.p314xaae8f345.mm.R.id.u_9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        s2Var.f201243l = (android.widget.TextView) findViewById5;
        android.view.View view7 = s2Var.f201238g;
        if (view7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        android.view.View findViewById6 = view7.findViewById(com.p314xaae8f345.mm.R.id.u__);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        s2Var.f201244m = (android.widget.TextView) findViewById6;
        android.view.View view8 = s2Var.f201238g;
        if (view8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        android.view.View findViewById7 = view8.findViewById(com.p314xaae8f345.mm.R.id.u_7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        s2Var.f201245n = (android.widget.TextView) findViewById7;
        android.widget.CheckBox checkBox = s2Var.f201242k;
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkBox");
            throw null;
        }
        checkBox.setChecked(false);
        android.widget.LinearLayout linearLayout = s2Var.f201241j;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkboxContainer");
            throw null;
        }
        linearLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q2(s2Var));
        android.widget.CheckBox checkBox2 = s2Var.f201242k;
        if (checkBox2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkBox");
            throw null;
        }
        checkBox2.setOnCheckedChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r2(s2Var));
        s2Var.c();
        if (s2Var.f201236e) {
            android.widget.TextView textView = s2Var.f201244m;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmButton");
                throw null;
            }
            textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.orp));
            android.widget.TextView textView2 = s2Var.f201244m;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmButton");
                throw null;
            }
            textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n2(s2Var));
        } else {
            android.widget.TextView textView3 = s2Var.f201244m;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmButton");
                throw null;
            }
            textView3.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.orr));
            android.widget.TextView textView4 = s2Var.f201244m;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmButton");
                throw null;
            }
            textView4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o2(s2Var));
        }
        android.widget.TextView textView5 = s2Var.f201245n;
        if (textView5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelButton");
            throw null;
        }
        textView5.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p2(s2Var));
        boolean z17 = context.getResources().getConfiguration().orientation == 2;
        android.widget.LinearLayout linearLayout2 = s2Var.f201241j;
        if (linearLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkboxContainer");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        if (z17) {
            layoutParams2.topMargin = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        } else {
            layoutParams2.topMargin = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        }
        android.widget.LinearLayout linearLayout3 = s2Var.f201241j;
        if (linearLayout3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkboxContainer");
            throw null;
        }
        linearLayout3.setLayoutParams(layoutParams2);
        yf2.h0 h0Var = s2Var.f201246o;
        if (h0Var != null) {
            s2Var.a(h0Var);
            s2Var.f201246o = null;
        }
        android.view.View view9 = s2Var.f201238g;
        if (view9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        e3Var.f213508y.addView(view9, 0);
        e3Var.f213501r = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l2(s2Var);
        return e3Var;
    }
}
