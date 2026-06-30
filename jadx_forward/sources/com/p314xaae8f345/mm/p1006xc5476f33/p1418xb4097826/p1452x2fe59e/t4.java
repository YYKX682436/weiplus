package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class t4 implements vh0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f190566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f190567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f190568c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f190569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190570e;

    public t4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var, int i17, java.util.List list, java.lang.CharSequence charSequence, java.lang.String str) {
        this.f190566a = a7Var;
        this.f190567b = i17;
        this.f190568c = list;
        this.f190569d = charSequence;
        this.f190570e = str;
    }

    @Override // vh0.i1
    /* renamed from: onResult */
    public void mo56534x57429edc(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DrawerPresenter", "onReply privacy result " + bool);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f190566a;
        yw2.a0 a0Var = a7Var.f187749o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 n17 = a0Var != null ? a0Var.n() : null;
        if (n17 != null) {
            n17.m61918xcd569a2(false);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        if (bool.booleanValue()) {
            java.lang.String str = this.f190570e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7.v(a7Var, this.f190567b, this.f190568c, this.f190569d, true ^ (str == null || str.length() == 0));
        } else {
            yw2.a0 a0Var2 = a7Var.f187749o;
            if (a0Var2 != null) {
                a0Var2.n().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.s4(a7Var), 300L);
            }
        }
    }
}
