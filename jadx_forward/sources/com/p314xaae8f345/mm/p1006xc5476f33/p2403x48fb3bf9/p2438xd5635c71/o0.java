package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71;

/* loaded from: classes8.dex */
public final class o0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269404a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1 f269405b;

    public o0(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1 f1Var) {
        this.f269404a = str;
        this.f269405b = f1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.s
    public final void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1.f269330e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("engine ");
        java.lang.String name = this.f269404a;
        sb6.append(name);
        sb6.append(" exception: ");
        sb6.append(str);
        sb6.append(" \nstackTrace:\n");
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebComponent", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1 f1Var = this.f269405b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "$name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        f1Var.g(name, str, str2, 0, 0);
        this.f269405b.f269345b.a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.b.D);
    }
}
