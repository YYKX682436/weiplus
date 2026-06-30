package com.p314xaae8f345.mm.p2818xd0d82df3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/wexnet/SessionKeeper;", "Lx71/o;", "Ljz5/f0;", "close", "finalize", "expire", "", "provideSessionPtr", "sessionPtr", "J", "<init>", "(J)V", "Companion", "com/tencent/mm/wexnet/q", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.wexnet.SessionKeeper */
/* loaded from: classes7.dex */
public final class C22943x18a74108 implements x71.o {

    /* renamed from: Companion */
    public static final com.p314xaae8f345.mm.p2818xd0d82df3.q f39957x233c02ec = new com.p314xaae8f345.mm.p2818xd0d82df3.q(null);
    public static final java.lang.String TAG = "MicroMsg.SessionKeeper";
    private long sessionPtr;

    public C22943x18a74108(long j17) {
        this.sessionPtr = j17;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        try {
            com.p314xaae8f345.mm.p2818xd0d82df3.C22945x9a2e1613.Companion companion = com.p314xaae8f345.mm.p2818xd0d82df3.C22945x9a2e1613.INSTANCE;
            long j17 = this.sessionPtr;
            companion.a();
            com.p314xaae8f345.mm.p2818xd0d82df3.C22941x91b2b43d m83546xab932c8f = com.p314xaae8f345.mm.p2818xd0d82df3.C22945x9a2e1613.m83546xab932c8f(j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "close, sessionPtr: " + this.sessionPtr + ", result.success: " + m83546xab932c8f.getSuccess());
            if (m83546xab932c8f.getSuccess()) {
                mo83524xb328fd1f();
            }
        } catch (com.p314xaae8f345.mm.p2818xd0d82df3.w e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    @Override // x71.o
    /* renamed from: expire */
    public void mo83524xb328fd1f() {
        this.sessionPtr = -1L;
    }

    /* renamed from: finalize */
    public final void m83525xd764dc1e() {
        close();
    }

    @Override // x71.o
    /* renamed from: provideSessionPtr, reason: from getter */
    public long getSessionPtr() {
        return this.sessionPtr;
    }
}
