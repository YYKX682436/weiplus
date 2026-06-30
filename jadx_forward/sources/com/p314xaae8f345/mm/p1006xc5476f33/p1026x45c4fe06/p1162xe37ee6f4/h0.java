package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4;

/* loaded from: classes7.dex */
public class h0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d0, lm0.b {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f167623d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f167624e;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 rt6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        this.f167623d = rt6;
        this.f167624e = new java.util.concurrent.ConcurrentLinkedDeque();
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 C0 = this.f167623d.C0();
        boolean z17 = false;
        if (C0 != null && C0.mo50262x39e05d35()) {
            z17 = true;
        }
        if (z17) {
            java.util.Iterator it = this.f167624e.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.e0) it.next()).f();
            }
        }
    }

    public void b() {
        this.f167624e.clear();
    }

    public void c() {
        this.f167624e.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.g0(this));
    }
}
