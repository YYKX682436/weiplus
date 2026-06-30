package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes2.dex */
public final class t4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f172100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f172101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f172102f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f172103g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str, yz5.a aVar) {
        super(1);
        this.f172100d = atomicBoolean;
        this.f172101e = h0Var;
        this.f172102f = str;
        this.f172103g = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String reason = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        boolean compareAndSet = this.f172100d.compareAndSet(false, true);
        java.lang.String str = this.f172102f;
        if (compareAndSet) {
            wu5.c cVar = (wu5.c) this.f172101e.f391656d;
            if (cVar != null) {
                cVar.cancel(false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimpleAsyncTaskConcurrentExecutor", "MicroMsg.SimpleAsyncTaskConcurrentExecutor|execute timeout wrapper end|" + str + "|reason=" + reason);
            this.f172103g.mo152xb9724478();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SimpleAsyncTaskConcurrentExecutor", "MicroMsg.SimpleAsyncTaskConcurrentExecutor|execute timeout wrapper end ignored (already ended)|" + str + "|reason=" + reason);
        }
        return jz5.f0.f384359a;
    }
}
