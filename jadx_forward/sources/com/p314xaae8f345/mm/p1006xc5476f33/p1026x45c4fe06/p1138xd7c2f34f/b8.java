package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class b8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.d8 f166054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 f166055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166056f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f166057g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f166058h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7079xa7f98ad3 f166059i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.d8 d8Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 o6Var, java.lang.String str, java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.concurrent.atomic.AtomicReference atomicReference, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7079xa7f98ad3 c7079xa7f98ad3) {
        super(2);
        this.f166054d = d8Var;
        this.f166055e = o6Var;
        this.f166056f = str;
        this.f166057g = atomicInteger;
        this.f166058h = atomicReference;
        this.f166059i = c7079xa7f98ad3;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6 err = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(err, "err");
        this.f166054d.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update plugin(");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 o6Var = this.f166055e;
        sb6.append(o6Var.f166384d);
        sb6.append(") to latest failed, ERROR(");
        sb6.append(err);
        sb6.append(") errMsg(");
        sb6.append((java.lang.String) obj2);
        sb6.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils.defaultBatchReporter", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12329x5651dcf.f165890n;
        java.lang.String instanceId = this.f166056f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(instanceId, "$instanceId");
        h0Var.a(instanceId, ne1.j.UPDATE_FAILED, o6Var.f166384d, this.f166057g.get(), (java.lang.String) this.f166058h.get());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7079xa7f98ad3 c7079xa7f98ad3 = this.f166059i;
        c7079xa7f98ad3.f143878m = 2L;
        c7079xa7f98ad3.k();
        return jz5.f0.f384359a;
    }
}
