package com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1;

/* loaded from: classes16.dex */
public class g extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.AbstractC22733x77ee84fd f294180a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.AbstractC22733x77ee84fd abstractC22733x77ee84fd, android.os.Looper looper) {
        super(looper);
        this.f294180a = abstractC22733x77ee84fd;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.AbstractC22733x77ee84fd abstractC22733x77ee84fd = this.f294180a;
        if (i17 == 1) {
            abstractC22733x77ee84fd.m82231xe72d15de();
        } else {
            if (i17 != 2) {
                return;
            }
            abstractC22733x77ee84fd.mo82248x7abbb162();
        }
    }
}
