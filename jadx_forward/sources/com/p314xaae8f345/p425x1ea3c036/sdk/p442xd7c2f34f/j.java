package com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f;

/* loaded from: classes4.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3934x511d55a6 f129150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3936x91f5958d f129151e;

    public j(com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3934x511d55a6 c3934x511d55a6, com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3936x91f5958d c3936x91f5958d) {
        this.f129150d = c3934x511d55a6;
        this.f129151e = c3936x91f5958d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("EventBinder finalized, instance:");
        com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3934x511d55a6 c3934x511d55a6 = this.f129150d;
        sb6.append(c3934x511d55a6.f129126d);
        sb6.append(", processName:");
        sb6.append(c3934x511d55a6.f129127e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnWXAppResultXPCLeakFreeWrapper.Helper", sb6.toString());
        mo48814x2efc64();
    }
}
