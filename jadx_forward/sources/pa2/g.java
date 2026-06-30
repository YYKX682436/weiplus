package pa2;

/* loaded from: classes2.dex */
public final class g extends v92.g {

    /* renamed from: c, reason: collision with root package name */
    public r45.r03 f434509c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f434510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, r45.r03 r03Var) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f434509c = r03Var;
        this.f434510d = jz5.h.b(new pa2.f(this));
    }

    public final java.lang.String A() {
        java.lang.String string = this.f515691a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f8i, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.o((int) z(), false));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    public final java.lang.String B() {
        r45.rz6 rz6Var;
        r45.r23 D = D();
        java.lang.String str = (D == null || (rz6Var = (r45.rz6) D.m75936x14adae67(1)) == null) ? null : rz6Var.f466853d;
        return str == null ? "" : str;
    }

    public final r45.ub4 C() {
        r45.rz6 rz6Var;
        r45.ub4 ub4Var = new r45.ub4();
        r45.r03 r03Var = this.f434509c;
        int i17 = 0;
        ub4Var.set(0, pm0.v.u(r03Var != null ? r03Var.m75942xfb822ef2(1) : 0L));
        r45.r23 D = D();
        if (D != null && (rz6Var = (r45.rz6) D.m75936x14adae67(1)) != null) {
            i17 = rz6Var.f466854e;
        }
        ub4Var.set(1, java.lang.Integer.valueOf(i17));
        return ub4Var;
    }

    public final r45.r23 D() {
        return (r45.r23) ((jz5.n) this.f434510d).mo141623x754a37bb();
    }

    public final java.lang.String E() {
        r45.rz6 rz6Var;
        r45.b70 b70Var;
        r45.r23 D = D();
        java.lang.String str = (D == null || (rz6Var = (r45.rz6) D.m75936x14adae67(1)) == null || (b70Var = rz6Var.f466856g) == null) ? null : b70Var.f452115d;
        return str == null ? "" : str;
    }

    @Override // v92.g
    public boolean f() {
        return B().length() == 0;
    }

    @Override // v92.g
    public boolean g() {
        return B().length() == 0;
    }

    @Override // v92.g
    public void h() {
        bd2.b bVar = bd2.b.f100777a;
        java.lang.String B = B();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = this.f515691a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        bVar.l(context, bVar.h(context, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54069x7617ffff, kz5.b1.e(new jz5.l("template_id", B))), false, null);
    }

    @Override // v92.g
    public void i() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doUnpublish templateId:");
        sb6.append(B());
        sb6.append(" topicName:");
        sb6.append(E());
        sb6.append(" topicId:");
        r45.r03 r03Var = this.f434509c;
        sb6.append(r03Var != null ? new jz5.x(r03Var.m75942xfb822ef2(1)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTemplateShareHandler", sb6.toString());
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f515691a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC0065xcd7aa112, 1, true);
        java.lang.String string = activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p5p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        k0Var.q(string, 17);
        k0Var.f293405n = new pa2.a(this);
        k0Var.f293414s = new pa2.b(this);
        k0Var.v();
    }

    @Override // v92.g
    public boolean o() {
        return this.f515691a.getIntent().getBooleanExtra("key_is_user_self", false);
    }

    @Override // v92.g
    public boolean p() {
        r45.r23 D = D();
        if (((D != null ? D.m75939xb282bd08(5) : 0) & 1) == 0) {
            if (!(B().length() == 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // v92.g
    public void r() {
        r45.rz6 rz6Var;
        r45.b70 b70Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shareToConversation templateId:");
        sb6.append(B());
        sb6.append(" topicName:");
        sb6.append(E());
        sb6.append(" topicId:");
        r45.r03 r03Var = this.f434509c;
        java.lang.String str = null;
        sb6.append(r03Var != null ? new jz5.x(r03Var.m75942xfb822ef2(1)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTemplateShareHandler", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f515691a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa112, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC0065xcd7aa112;
        java.lang.String E = E();
        long z17 = z();
        r45.r23 D = D();
        if (D != null && (rz6Var = (r45.rz6) D.m75936x14adae67(1)) != null && (b70Var = rz6Var.f466856g) != null) {
            str = b70Var.f452118g;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.J(n7Var, abstractActivityC21394xb3d2c0cf, E, 18, z17, str == null ? "" : str, A(), null, 195, null, null, null, C(), 1792, null);
    }

    @Override // v92.g
    public void t() {
        r45.rz6 rz6Var;
        r45.b70 b70Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shareToSnsTimeLine templateId:");
        sb6.append(B());
        sb6.append(" topicName:");
        sb6.append(E());
        sb6.append(" topicId:");
        r45.r03 r03Var = this.f434509c;
        java.lang.String str = null;
        sb6.append(r03Var != null ? new jz5.x(r03Var.m75942xfb822ef2(1)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTemplateShareHandler", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f515691a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa112, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC0065xcd7aa112;
        java.lang.String E = E();
        long z17 = z();
        r45.r23 D = D();
        if (D != null && (rz6Var = (r45.rz6) D.m75936x14adae67(1)) != null && (b70Var = rz6Var.f466856g) != null) {
            str = b70Var.f452118g;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.K(n7Var, abstractActivityC21394xb3d2c0cf, E, 18, z17, str == null ? "" : str, A(), null, 195, null, null, null, C(), 1792, null);
    }

    @Override // v92.g
    public boolean v() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.H8).mo141623x754a37bb()).r()).booleanValue();
    }

    @Override // v92.g
    public boolean y() {
        return o();
    }

    public final long z() {
        r45.rz6 rz6Var;
        r45.b70 b70Var;
        r45.r23 D = D();
        if (D == null || (rz6Var = (r45.rz6) D.m75936x14adae67(1)) == null || (b70Var = rz6Var.f466856g) == null) {
            return 0L;
        }
        return b70Var.f452116e;
    }
}
