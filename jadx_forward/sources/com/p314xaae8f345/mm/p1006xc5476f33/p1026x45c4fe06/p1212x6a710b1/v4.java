package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class v4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f172121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.q4 f172122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y4 f172123f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f172124g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.q4 q4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y4 y4Var, yz5.a aVar) {
        super(0);
        this.f172121d = g0Var;
        this.f172122e = q4Var;
        this.f172123f = y4Var;
        this.f172124g = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        long j17 = this.f172121d.f391654d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.q4 q4Var = this.f172122e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimpleAsyncTaskConcurrentExecutor", "MicroMsg.SimpleAsyncTaskConcurrentExecutor|" + this.f172123f.hashCode() + "|end|" + q4Var.f172069d + "|pendingTime|" + (j17 - q4Var.f172071f) + "|runTime|" + (uptimeMillis - j17));
        this.f172124g.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
