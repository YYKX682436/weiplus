package com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1;

/* loaded from: classes16.dex */
public class f extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.AbstractC22733x77ee84fd f294179a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.AbstractC22733x77ee84fd abstractC22733x77ee84fd, android.os.Looper looper) {
        super(looper);
        this.f294179a = abstractC22733x77ee84fd;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        if (message.what != 1) {
            return;
        }
        com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u uVar = (com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u) message.obj;
        this.f294179a.m82241xb0065141(uVar.f294196a, uVar.f294197b);
    }
}
