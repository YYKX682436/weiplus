package io;

/* loaded from: classes5.dex */
public final class t implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.z0 f374962a;

    /* renamed from: b, reason: collision with root package name */
    public wd5.b f374963b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.z0 z0Var = this.f374962a;
        android.view.View view = z0Var != null ? z0Var.f336500a : null;
        if (view != null) {
            return view;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ehs, (android.view.ViewGroup) null);
        this.f374962a = new em.z0(inflate);
        c(null, this.f374963b);
        return inflate;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        wd5.b bVar = (wd5.b) pVar;
        wd5.b bVar2 = this.f374963b;
        this.f374963b = bVar;
        c(bVar2, bVar);
    }

    public final void c(wd5.b bVar, wd5.b bVar2) {
        boolean z17;
        int i17;
        em.z0 z0Var = this.f374962a;
        if (bVar2 == null || z0Var == null) {
            return;
        }
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            java.util.Objects.toString(bVar2.f526618f);
            java.util.Objects.toString(bVar2.f526623n);
        }
        z0Var.a().setText(bVar2.f526618f);
        z0Var.a().setTag(bVar2.f526619g);
        java.lang.Integer num = bVar2.f526620h;
        if (num != null) {
            z0Var.a().setTextColor(num.intValue());
        }
        java.lang.Integer num2 = bVar2.f526621i;
        android.view.View view = z0Var.f336500a;
        if (num2 != null) {
            int intValue = num2.intValue();
            if (z0Var.f336502c == null) {
                z0Var.f336502c = (android.widget.RelativeLayout) view.findViewById(com.p314xaae8f345.mm.R.id.lgy);
            }
            z0Var.f336502c.setBackgroundResource(intValue);
        }
        if (bVar2.f526622m) {
            z0Var.a().setVisibility(0);
            z0Var.e().setVisibility(0);
            z0Var.e().setOnLongClickListener(bVar2.f526624o);
            if (bVar2.f526626q != -1) {
                z0Var.b().setOnClickListener(bVar2.f526625p);
                z0Var.e().setOnClickListener(new io.s(z0Var));
            } else {
                z0Var.e().setOnClickListener(bVar2.f526625p);
            }
            z17 = true;
        } else {
            java.lang.CharSequence charSequence = bVar2.f526623n;
            if (charSequence == null || r26.n0.N(charSequence)) {
                z0Var.a().setVisibility(8);
                z17 = false;
            } else {
                z17 = true;
            }
            z0Var.e().setVisibility(8);
        }
        if (z0Var.f336505f == null) {
            z0Var.f336505f = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.che);
        }
        z0Var.f336505f.setVisibility(z17 ? 0 : 8);
        if (bVar2.f526626q == -1) {
            android.content.Context context = view.getContext();
            z0Var.a().setMaxWidth((int) (com.p314xaae8f345.mm.ui.zk.a(context, com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4) / i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
            android.view.ViewGroup.LayoutParams layoutParams = z0Var.a().getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.rightMargin = com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            layoutParams2.topMargin = com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561176bi);
            layoutParams2.removeRule(10);
            layoutParams2.addRule(15);
            z0Var.a().setGravity(19);
            z0Var.a().setLayoutParams(layoutParams2);
            z0Var.b().setVisibility(8);
            z0Var.c().setVisibility(8);
            z0Var.d().setVisibility(8);
            return;
        }
        android.content.Context context2 = view.getContext();
        z0Var.c().setVisibility(0);
        ct.a3 a3Var = (ct.a3) i95.n0.c(ct.a3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
        ((bt.u0) a3Var).getClass();
        pf5.z zVar = pf5.z.f435481a;
        boolean z18 = context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
        if (!z18) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2;
        ((la5.l0) zVar.a(activityC0065xcd7aa112).a(la5.l0.class)).m42291x53d8522f("quote_img", "");
        if (!z18) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((la5.u) zVar.a(activityC0065xcd7aa112).a(la5.u.class)).m42291x53d8522f("quote_img", "");
        z0Var.a().setMaxWidth((int) (com.p314xaae8f345.mm.ui.zk.a(context2, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508) / i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
        android.view.ViewGroup.LayoutParams layoutParams3 = z0Var.a().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) layoutParams3;
        layoutParams4.removeRule(15);
        layoutParams4.addRule(10);
        layoutParams4.topMargin = com.p314xaae8f345.mm.ui.zk.e(context2, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        layoutParams4.rightMargin = 0;
        z0Var.a().setGravity(48);
        z0Var.a().setIncludeFontPadding(false);
        z0Var.a().setLayoutParams(layoutParams4);
        z0Var.b().setVisibility(0);
        if (bVar2.f526626q == 2) {
            z0Var.d().setVisibility(0);
            i17 = 8;
        } else {
            i17 = 8;
            z0Var.d().setVisibility(8);
        }
        if (bVar2.f526626q == 11) {
            z0Var.c().setVisibility(i17);
        } else {
            z0Var.c().setVisibility(0);
        }
        z0Var.c().setImageBitmap(null);
        ti3.m mVar = new ti3.m();
        mVar.f501162a = z0Var.c();
        mVar.f501163b = z0Var.d();
        com.p314xaae8f345.mm.ui.p2740x696c9db.e3 e3Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.e3(mVar);
        java.lang.Object obj = bVar2.f526617e;
        if (ti3.i.o(context2, null, e3Var, obj instanceof com.p314xaae8f345.mm.p2621x8fb0427b.f9 ? (com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj : null, true)) {
            return;
        }
        z0Var.c().setImageResource(com.p314xaae8f345.mm.R.raw.f79863x2ebe0c96);
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f374963b;
    }
}
