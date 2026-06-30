package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public final class j implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.k f219099d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.k kVar) {
        this.f219099d = kVar;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public final void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        o13.y yVar;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "*") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "chatroomname")) {
            return;
        }
        java.lang.Object obj = w0Var.f398509d;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = obj instanceof com.p314xaae8f345.mm.p2621x8fb0427b.a3 ? (com.p314xaae8f345.mm.p2621x8fb0427b.a3) obj : null;
        if (a3Var != null) {
            byte[] bytes = (a3Var.f69099x6941929d + a3Var.f69084x8729abea).getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            int i17 = w0Var.f398507b;
            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.k kVar = this.f219099d;
            if (i17 != 5) {
                if (!kVar.f219112i.add(g17) || (yVar = kVar.f219108e) == null) {
                    return;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) yVar).b(kVar.f219111h, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.f(kVar, a3Var));
                return;
            }
            kVar.f219112i.remove(g17);
            o13.y yVar2 = kVar.f219108e;
            if (yVar2 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) yVar2).b(kVar.f219111h, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.f(kVar, a3Var));
            }
        }
    }
}
