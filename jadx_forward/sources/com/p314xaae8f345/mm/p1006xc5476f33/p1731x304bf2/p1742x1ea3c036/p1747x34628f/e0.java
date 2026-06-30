package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f;

/* loaded from: classes8.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f221416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f221417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 f221418f;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, java.lang.Runnable runnable) {
        this.f221418f = x0Var;
        this.f221416d = c19762x487075a;
        this.f221417e = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f221416d) {
            if (this.f221416d.f38859x6ac9171) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPage", "activeIpcTask, time out, callback");
            this.f221416d.f38859x6ac9171 = true;
            this.f221418f.F(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.d0(this));
        }
    }
}
