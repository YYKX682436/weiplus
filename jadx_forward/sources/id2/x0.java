package id2;

/* loaded from: classes.dex */
public final class x0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f372404a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f372405b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f372406c;

    public x0(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, id2.v1 v1Var) {
        this.f372404a = h0Var;
        this.f372405b = h0Var2;
        this.f372406c = v1Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) this.f372404a.f391656d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        p3325xe03a0797.p3326xc267989b.p2.a((p3325xe03a0797.p3326xc267989b.r2) this.f372405b.f391656d, null, 1, null);
        int i17 = fVar.f152148a;
        id2.v1 v1Var = this.f372406c;
        if (i17 == 0 && fVar.f152149b == 0) {
            long j17 = v1Var.H;
            long m75942xfb822ef2 = ((r45.rr1) fVar.f152151d).m75942xfb822ef2(1);
            boolean z17 = m75942xfb822ef2 > j17;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) v1Var.m80379x76847179(), 1, false);
            android.view.View inflate = android.view.View.inflate(v1Var.m80379x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.arw, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundCornerConstraintLayout");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea c22641xff2656ea = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea) inflate;
            c22641xff2656ea.B(com.p314xaae8f345.mm.ui.zk.a(v1Var.m80379x76847179(), 12), com.p314xaae8f345.mm.ui.zk.a(v1Var.m80379x76847179(), 12), 0.0f, 0.0f);
            c22641xff2656ea.findViewById(com.p314xaae8f345.mm.R.id.f2a).setOnClickListener(new id2.k1(k0Var));
            ((android.widget.TextView) c22641xff2656ea.findViewById(com.p314xaae8f345.mm.R.id.f1o)).setText(java.lang.String.valueOf(m75942xfb822ef2));
            ((android.widget.TextView) c22641xff2656ea.findViewById(com.p314xaae8f345.mm.R.id.f1x)).setVisibility(z17 ? 0 : 8);
            ((android.widget.TextView) c22641xff2656ea.findViewById(com.p314xaae8f345.mm.R.id.f1x)).setOnClickListener(new id2.l1(v1Var));
            ((android.widget.TextView) c22641xff2656ea.findViewById(com.p314xaae8f345.mm.R.id.f2c)).setText(z17 ? v1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dii) : v1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dih));
            ((android.widget.TextView) c22641xff2656ea.findViewById(com.p314xaae8f345.mm.R.id.f566194f30)).setText(z17 ? java.lang.String.valueOf(j17) : java.lang.String.valueOf(j17 - m75942xfb822ef2));
            android.widget.TextView textView = (android.widget.TextView) c22641xff2656ea.findViewById(com.p314xaae8f345.mm.R.id.f1r);
            textView.setText(z17 ? v1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dix) : v1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.diy));
            textView.setOnClickListener(new id2.q1(k0Var, z17, v1Var, textView));
            k0Var.f293405n = new id2.r1(k0Var, c22641xff2656ea);
            k0Var.e(true);
            k0Var.v();
        } else {
            db5.t7.m(v1Var.m158354x19263085(), v1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dig));
        }
        return jz5.f0.f384359a;
    }
}
