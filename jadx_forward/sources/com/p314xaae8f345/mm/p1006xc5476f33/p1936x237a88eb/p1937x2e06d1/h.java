package com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1;

/* loaded from: classes15.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 f233972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j f233973e;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5) {
        this.f233973e = jVar;
        this.f233972d = c16564xb55e1d5;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j jVar = this.f233973e;
        jVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = this.f233972d;
        do {
            java.lang.String a17 = c16564xb55e1d5.a();
            long j17 = c16564xb55e1d5.f231013d;
            if (jVar.b(a17, j17)) {
                jVar.v(c16564xb55e1d5.a(), j17);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.i(jVar, c16564xb55e1d5), false);
                b4Var.c(1800000L, 1800000L);
                jVar.f233983h.add(b4Var);
                return;
            }
            arrayList = jVar.f233981f;
            arrayList.add(c16564xb55e1d5);
            jVar.z();
            c16564xb55e1d5 = jVar.f233976a.a();
        } while (c16564xb55e1d5.f231013d > 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AbstractSendMsgFailNotification", "tryResendNextMsg error, finalMsgId is -1, may be resend finish");
        if (jVar.f233980e.size() + arrayList.size() >= jVar.f233976a.b()) {
            jVar.u();
        }
    }
}
