package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public abstract class wd implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.sd {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f172490a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wc f172491b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.vc f172492c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td f172493d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f172494e;

    public wd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 hostRuntime, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wc originResumeFn, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.vc originPauseFn) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hostRuntime, "hostRuntime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originResumeFn, "originResumeFn");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originPauseFn, "originPauseFn");
        this.f172490a = hostRuntime;
        this.f172491b = originResumeFn;
        this.f172492c = originPauseFn;
        this.f172494e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.vd(this));
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td tdVar) {
        if (tdVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td tdVar2 = this.f172493d;
            if (tdVar2 != null && tdVar2.compareTo(tdVar) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.Wxa.RuntimeEmbeddingPageHostImpl", "detachEmbeddingPage for host:" + this.f172490a + ", embeddingPage:" + tdVar);
                this.f172493d = null;
                tdVar.mo273xed6858b4().c((p012xc85e97e9.p093xedfae76a.v) ((jz5.n) this.f172494e).mo141623x754a37bb());
                tdVar.Q5(this);
            }
        }
    }
}
