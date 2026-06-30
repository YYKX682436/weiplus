package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class w1 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21351xb4ef97a5 f292720a;

    public w1(com.p314xaae8f345.mm.ui.ActivityC21351xb4ef97a5 activityC21351xb4ef97a5) {
        this.f292720a = activityC21351xb4ef97a5;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckCanSubscribeBizUI", "hasConcerned  getContactCallBack  succ:" + z17);
        if (z17) {
            return;
        }
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50293x3498a0(new com.p314xaae8f345.mm.ui.v1(this));
    }
}
