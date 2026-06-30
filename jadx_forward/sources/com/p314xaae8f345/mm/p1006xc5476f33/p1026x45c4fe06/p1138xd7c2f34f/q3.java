package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class q3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentSkipListSet f166580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 f166581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o3 f166582f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f166583g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f166584h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12341x90ad3f34 f166585i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166586m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f166587n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k3 f166588o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a7 f166589p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o3 o3Var, java.util.HashSet hashSet, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12341x90ad3f34 c12341x90ad3f34, java.lang.String str, yz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k3 k3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a7 a7Var) {
        super(1);
        this.f166580d = concurrentSkipListSet;
        this.f166581e = o6Var;
        this.f166582f = o3Var;
        this.f166583g = hashSet;
        this.f166584h = atomicBoolean;
        this.f166585i = c12341x90ad3f34;
        this.f166586m = str;
        this.f166587n = lVar;
        this.f166588o = k3Var;
        this.f166589p = a7Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p6 response = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = this.f166580d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811 interfaceC11654xe38d2811 = response.f166425a;
        boolean add = concurrentSkipListSet.add(interfaceC11654xe38d2811);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("waitForPkg ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 request = this.f166581e;
        sb6.append(request);
        sb6.append(" onSuccess(");
        sb6.append(interfaceC11654xe38d2811.mo49191x1c82a56c());
        sb6.append('|');
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.s6 s6Var = response.f166426b;
        sb6.append(s6Var);
        sb6.append(") added(");
        sb6.append(add);
        sb6.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.BatchGetCodePkgExecutor", sb6.toString());
        if (add) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(request, "$request");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o3 o3Var = this.f166582f;
            o3Var.getClass();
            java.lang.String mo49190xe121c411 = interfaceC11654xe38d2811.mo49190xe121c411();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo49190xe121c411);
            if (o3Var.f166377b.size() == 1) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r6.f166637a)) {
                    long k17 = com.p314xaae8f345.mm.vfs.w6.k(mo49190xe121c411);
                    o3Var.f166376a.mo146xb9724478(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f(100, k17, k17));
                }
            } else if (o3Var.f166378c.size() > 0) {
                long k18 = com.p314xaae8f345.mm.vfs.w6.k(mo49190xe121c411);
                o3Var.a(request, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f(100, k18, k18));
            }
            if (concurrentSkipListSet.size() == this.f166583g.size()) {
                if (!this.f166584h.getAndSet(true)) {
                    mo48814x2efc64();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.BatchGetCodePkgExecutor", "session(" + this.f166586m + ") waitForPkg all completed");
                    this.f166587n.mo146xb9724478(kz5.n0.S0(concurrentSkipListSet));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k3 k3Var = this.f166588o;
                    if (k3Var != null) {
                        k3Var.b();
                    }
                }
            } else if (s6Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q6) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a7 a7Var = this.f166589p;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n3 n3Var = a7Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n3) a7Var : null;
                if (n3Var != null) {
                    n3Var.d(request);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
