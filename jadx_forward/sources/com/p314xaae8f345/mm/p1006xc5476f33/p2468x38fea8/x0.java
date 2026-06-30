package com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8;

@j95.b
/* loaded from: classes12.dex */
public class x0 extends i95.w implements c25.f {

    /* renamed from: d, reason: collision with root package name */
    public c01.wc f270221d;

    /* renamed from: e, reason: collision with root package name */
    public volatile w11.d2 f270222e;

    public w11.d2 Ai() {
        gm0.j1.b().c();
        if (this.f270222e == null) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.x0.class) {
                if (this.f270222e == null) {
                    this.f270222e = new w11.d2();
                }
            }
        }
        return this.f270222e;
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        if (this.f270222e != null) {
            w11.d2 d2Var = this.f270222e;
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) d2Var.f523533b;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(concurrentLinkedQueue.size());
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = (java.util.concurrent.ConcurrentLinkedQueue) d2Var.f523534c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "clear synclist:%s notify:%s running:%s", valueOf, java.lang.Integer.valueOf(concurrentLinkedQueue2.size()), d2Var.f523536e);
            concurrentLinkedQueue.clear();
            concurrentLinkedQueue2.clear();
        }
        c01.wc wcVar = this.f270221d;
        if (wcVar != null) {
            wcVar.b();
        }
    }

    public c01.wc wi() {
        gm0.j1.b().c();
        if (this.f270221d == null) {
            this.f270221d = new c01.wc(new com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.w0(this));
        }
        return this.f270221d;
    }
}
