package com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1;

/* loaded from: classes15.dex */
public class f implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j f233970d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j jVar) {
        this.f233970d = jVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.j jVar = this.f233970d;
        if (!jVar.f233978c) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractSendMsgFailNotification", "mCheckMsgExistTimer, before check msgList.size:%d, successList.size:%d, failedList.size:%d", java.lang.Integer.valueOf(jVar.f233976a.b()), java.lang.Integer.valueOf(jVar.f233980e.size()), java.lang.Integer.valueOf(jVar.f233981f.size()));
        jVar.s();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbstractSendMsgFailNotification", "mCheckMsgExistTimer, after check msgList.size:%d, successList.size:%d, failedList.size:%d", java.lang.Integer.valueOf(jVar.f233976a.b()), java.lang.Integer.valueOf(jVar.f233980e.size()), java.lang.Integer.valueOf(jVar.f233981f.size()));
        if (jVar.f233976a.b() > 0) {
            jVar.z();
            return true;
        }
        jVar.u();
        return true;
    }
}
