package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ra extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public mm2.n0 H;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f201145J;
    public android.widget.TextView K;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sb L;
    public p3325xe03a0797.p3326xc267989b.r2 M;

    /* renamed from: b2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 f201146b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(android.content.Context context) {
        super(context, false, null, -1.0f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e9o;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public java.lang.String L() {
        java.lang.String string = this.f199716e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.onu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCoLiveInviteePreparePanel", "initContentView");
        android.content.Context context = this.f199716e;
        a0(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.clh));
        Y(com.p314xaae8f345.mm.R.C30859x5a72f63.ah8);
        d0();
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.stu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f201146b2 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.stw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f201145J = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.stv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.K = (android.widget.TextView) findViewById3;
        android.widget.TextView textView = this.f201145J;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("quitBtn");
            throw null;
        }
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.la(this));
        android.widget.TextView textView2 = this.K;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("learnMoreBtn");
            throw null;
        }
        textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ma(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sb sbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sb(context);
        this.L = sbVar;
        sbVar.f201281f = null;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 c22843x6b8c5570 = this.f201146b2;
        if (c22843x6b8c5570 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hostListRv");
            throw null;
        }
        c22843x6b8c5570.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 c22843x6b8c55702 = this.f201146b2;
        if (c22843x6b8c55702 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hostListRv");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sb sbVar2 = this.L;
        if (sbVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hostAdapter");
            throw null;
        }
        c22843x6b8c55702.mo7960x6cab2c8d(sbVar2);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 c22843x6b8c55703 = this.f201146b2;
        if (c22843x6b8c55703 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hostListRv");
            throw null;
        }
        c22843x6b8c55703.setOverScrollMode(2);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 c22843x6b8c55704 = this.f201146b2;
        if (c22843x6b8c55704 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hostListRv");
            throw null;
        }
        c22843x6b8c55704.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u80(this));
        e0();
        mm2.n0 n0Var = this.H;
        if (n0Var == null || (y0Var = this.E) == null) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.M;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        c0Var.f391645d = n0Var.O6();
        this.M = p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.oa(n0Var, this, c0Var, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean Q() {
        return true;
    }

    public final void e0() {
        java.util.LinkedList linkedList;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var;
        mm2.n0 n0Var = this.H;
        r45.f50 f50Var = (n0Var == null || (f3Var = n0Var.f410798g) == null) ? null : (r45.f50) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) f3Var).mo144003x754a37bb();
        java.lang.String e17 = xy2.c.e(this.f199716e);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshFromSlice: invitationId=");
        sb6.append(f50Var != null ? java.lang.Long.valueOf(f50Var.f455546d) : null);
        sb6.append(", inviteeCount=");
        sb6.append((f50Var == null || (linkedList = f50Var.f455549g) == null) ? null : java.lang.Integer.valueOf(linkedList.size()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCoLiveInviteePreparePanel", sb6.toString());
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v1> a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v1.f201552f.a(f50Var, e17);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(a17, 10));
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v1 v1Var : a17) {
            java.lang.String finderUsername = v1Var.f201553a;
            java.lang.String str = v1Var.f201555c;
            int i17 = v1Var.f201556d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
            java.lang.String nickname = v1Var.f201554b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v1(finderUsername, nickname, str, i17, false));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sb sbVar = this.L;
        if (sbVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hostAdapter");
            throw null;
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) sbVar.f201280e;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        sbVar.m8146xced61ae5();
    }
}
