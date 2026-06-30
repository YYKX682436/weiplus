package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class va implements ph1.r, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ka {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f166810b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f166811c;

    /* renamed from: d, reason: collision with root package name */
    public ph1.p f166812d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12350x8cb074f7 f166813e;

    public va(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 rt6, java.lang.String requestedModuleName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestedModuleName, "requestedModuleName");
        this.f166810b = rt6;
        this.f166811c = requestedModuleName;
        this.f166813e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12350x8cb074f7(rt6, requestedModuleName);
    }

    @Override // ph1.r
    public void a(java.util.concurrent.Executor executor) {
        ph1.p pVar = this.f166812d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 rt6 = this.f166810b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        java.lang.String requestedModuleName = this.f166811c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestedModuleName, "requestedModuleName");
        this.f166813e.f165999t = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ja(rt6, requestedModuleName, pVar, null);
        if (executor == null) {
            executor = ph1.o.f435880c;
        }
        executor.execute(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ua(this));
    }

    @Override // ph1.r
    public void b(ph1.p pVar) {
        this.f166812d = pVar;
    }
}
