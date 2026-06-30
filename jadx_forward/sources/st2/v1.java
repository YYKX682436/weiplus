package st2;

/* loaded from: classes3.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f494014a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f494015b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f494016c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 f494017d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f494018e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f494019f;

    /* renamed from: g, reason: collision with root package name */
    public final tt2.i1 f494020g;

    public v1(android.view.ViewGroup root, gk2.e buContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        this.f494014a = buContext;
        this.f494015b = "FinderLiveShoppingParingTab";
        this.f494016c = root.findViewById(com.p314xaae8f345.mm.R.id.tot);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) root.findViewById(com.p314xaae8f345.mm.R.id.tos);
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = (com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864) root.findViewById(com.p314xaae8f345.mm.R.id.uov);
        this.f494017d = c22851x22587864;
        tt2.i1 i1Var = new tt2.i1();
        this.f494020g = i1Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(root.getContext());
        c1163xf1deaba4.mo7960x6cab2c8d(i1Var);
        c1163xf1deaba4.mo7967x900dcbe1(c1162x665295de);
        c22851x22587864.m82945xba09cf09(new st2.t1(this));
        c22851x22587864.D(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15314xbe4d10f8(root.getContext(), null));
    }

    public final void a(boolean z17) {
        r45.ld2 ld2Var = new r45.ld2();
        gk2.e eVar = this.f494014a;
        ld2Var.set(3, ((mm2.c1) eVar.a(mm2.c1.class)).f410385o);
        r45.wt1 wt1Var = new r45.wt1();
        wt1Var.set(0, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f410516m));
        wt1Var.set(1, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
        wt1Var.set(2, ((mm2.c1) eVar.a(mm2.c1.class)).f410385o);
        wt1Var.set(3, z17 ? null : this.f494019f);
        new ke2.o0("/cgi-bin/mmbiz-bin/finderlivegetpairingtab", 21384, wt1Var, ld2Var, null).l().K(new st2.u1(z17, this));
    }
}
