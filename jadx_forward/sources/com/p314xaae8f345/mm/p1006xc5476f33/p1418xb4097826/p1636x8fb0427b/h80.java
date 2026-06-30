package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class h80 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.k80 f208411d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h80(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.k80 k80Var) {
        super(1);
        this.f208411d = k80Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.xb1 it = (r45.xb1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfigInitExptData", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.k80.a(this.f208411d, "before callback config "));
        java.util.concurrent.ConcurrentHashMap c17 = this.f208411d.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.k80 k80Var = this.f208411d;
        synchronized (c17) {
            for (java.util.Map.Entry entry : c17.entrySet()) {
                k80Var.d(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.g80) entry.getValue()).f208348a, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.g80) entry.getValue()).f208349b, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.g80) entry.getValue()).f208350c);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfigInitExptData", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.k80.a(k80Var, "after callback config "));
            }
        }
        return jz5.f0.f384359a;
    }
}
