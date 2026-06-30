package com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1;

/* loaded from: classes16.dex */
public class o extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.r f294185a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.r rVar, android.os.Looper looper) {
        super(looper);
        this.f294185a = rVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        boolean m82237xb47d514d;
        if (this.f294185a.f294191c.get()) {
            com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.AbstractC22733x77ee84fd abstractC22733x77ee84fd = ((com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.h) this.f294185a.f294190b).f294181a;
            abstractC22733x77ee84fd.m82254x2377a9fa();
            abstractC22733x77ee84fd.m82232x1e04ef8f();
            return;
        }
        java.lang.Object obj = message.obj;
        com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.AbstractC22733x77ee84fd abstractC22733x77ee84fd2 = ((com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.h) this.f294185a.f294190b).f294181a;
        com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.u m82251xfb822da1 = abstractC22733x77ee84fd2.m82251xfb822da1(obj);
        m82237xb47d514d = abstractC22733x77ee84fd2.m82237xb47d514d(m82251xfb822da1, obj);
        if (!m82251xfb822da1.f294202g && !m82237xb47d514d) {
            abstractC22733x77ee84fd2.m82239x3000b5eb(m82251xfb822da1);
        }
        synchronized (this.f294185a.f294192d) {
            this.f294185a.f294189a.put(obj, com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.q.FILLED);
        }
    }
}
