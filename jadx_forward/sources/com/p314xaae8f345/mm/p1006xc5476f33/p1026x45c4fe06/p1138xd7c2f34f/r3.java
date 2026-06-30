package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class r3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12341x90ad3f34 f166631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 f166632e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f166633f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f166634g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k3 f166635h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12341x90ad3f34 c12341x90ad3f34, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 o6Var, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, yz5.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k3 k3Var) {
        super(2);
        this.f166631d = c12341x90ad3f34;
        this.f166632e = o6Var;
        this.f166633f = atomicBoolean;
        this.f166634g = pVar;
        this.f166635h = k3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6 err = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6) obj;
        java.lang.String str = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(err, "err");
        mo48814x2efc64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("waitForPkg ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 request = this.f166632e;
        sb6.append(request);
        sb6.append(" onError(");
        sb6.append(err);
        sb6.append(' ');
        sb6.append(str);
        sb6.append("), stack=");
        sb6.append(android.util.Log.getStackTraceString(new java.lang.Throwable()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.BatchGetCodePkgExecutor", sb6.toString());
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f166633f;
        if (!atomicBoolean.getAndSet(true)) {
            this.f166634g.mo149xb9724478(java.lang.Integer.valueOf(err.f166030d), str);
            atomicBoolean.set(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k3 k3Var = this.f166635h;
        if (k3Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(request, "$request");
            k3Var.c(request);
        }
        return jz5.f0.f384359a;
    }
}
