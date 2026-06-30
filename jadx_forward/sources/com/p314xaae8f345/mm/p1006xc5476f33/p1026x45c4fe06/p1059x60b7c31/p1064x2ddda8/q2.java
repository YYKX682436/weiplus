package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class q2 implements fl1.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w2 f161225b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ km5.b f161226c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f161227d;

    public q2(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w2 w2Var, km5.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar) {
        this.f161224a = i17;
        this.f161225b = w2Var;
        this.f161226c = bVar;
        this.f161227d = yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [kz5.p0] */
    public static final r45.i24 b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, java.util.ArrayList arrayList, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w2 w2Var) {
        r45.i24 i24Var = new r45.i24();
        i24Var.f458213d = yVar.mo48798x74292566();
        java.util.LinkedList linkedList = i24Var.f458214e;
        java.util.ArrayList arrayList2 = arrayList;
        if (arrayList == null) {
            arrayList2 = kz5.p0.f395529d;
        }
        linkedList.addAll(arrayList2);
        i24Var.f458217h = i17;
        i24Var.f458218i = yVar.t3().f156338p.f158814g;
        r45.nd7 nd7Var = new r45.nd7();
        w2Var.c(nd7Var, yVar);
        i24Var.f458219m = nd7Var;
        return i24Var;
    }

    @Override // fl1.f
    public void a(int i17, java.util.ArrayList arrayList) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.JsApiLoginLU", "dialog onRecvMsg, resultCode[" + i17 + "], callbackId[" + this.f161224a + ']');
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f161227d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.r.f161233a;
        km5.b m17 = this.f161226c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w2 w2Var = this.f161225b;
        if (i17 == 1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m17, "$m");
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w.f161297q0;
            km5.d q17 = rVar.b(yVar, "/cgi-bin/mmbiz-bin/js-login-confirm", b(yVar, arrayList, i17, w2Var), r45.j24.class).q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p2.f161214a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(q17, "$logic(...)");
            w2Var.i(m17, q17);
            return;
        }
        if (i17 != 2) {
            m17.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p("fail:auth canceled"));
            return;
        }
        m17.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p("fail:auth denied"));
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w.f161297q0;
        rVar.b(yVar, "/cgi-bin/mmbiz-bin/js-login-confirm", b(yVar, arrayList, i17, w2Var), r45.j24.class);
    }
}
