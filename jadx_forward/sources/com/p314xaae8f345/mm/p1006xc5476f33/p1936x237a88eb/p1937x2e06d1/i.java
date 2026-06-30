package com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1;

/* loaded from: classes15.dex */
public class i implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 f233974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j f233975e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5) {
        this.f233975e = jVar;
        this.f233974d = c16564xb55e1d5;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j jVar = this.f233975e;
        java.util.ArrayList arrayList = jVar.f233980e;
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = this.f233974d;
        if (arrayList.contains(c16564xb55e1d5)) {
            return true;
        }
        java.util.ArrayList arrayList2 = jVar.f233981f;
        if (arrayList2.contains(c16564xb55e1d5) || !jVar.f233976a.f233986a.contains(c16564xb55e1d5)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractSendMsgFailNotification", "msgIdTalker:%s send timeout, move this message to fail list, continue send next message", c16564xb55e1d5.m66995x9616526c());
        arrayList2.add(c16564xb55e1d5);
        jVar.f233982g.add(c16564xb55e1d5);
        if (jVar.f233980e.size() + arrayList2.size() >= jVar.f233976a.b()) {
            jVar.u();
            return true;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.h(jVar, jVar.f233976a.a()), 200L);
        return true;
    }
}
