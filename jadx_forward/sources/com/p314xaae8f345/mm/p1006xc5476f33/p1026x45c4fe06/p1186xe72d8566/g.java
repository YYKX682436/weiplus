package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f170018a;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f170018a = kz5.c0.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.n1(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.p1());
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.e(runtime, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.f(this));
    }

    public static final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        boolean z17;
        gVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.z zVar = c11510xdd90c2f2.D1;
        if (zVar == null) {
            return false;
        }
        java.util.Iterator it = ((java.util.concurrent.ConcurrentLinkedDeque) zVar.f168292c).iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha) it.next()).f168219f) {
                z17 = true;
                break;
            }
        }
        return true == z17;
    }
}
