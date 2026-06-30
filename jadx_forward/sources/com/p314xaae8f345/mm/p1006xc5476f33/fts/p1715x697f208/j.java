package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208;

/* loaded from: classes12.dex */
public class j implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.C15587x9e6f975b f219357d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.C15587x9e6f975b c15587x9e6f975b) {
        this.f219357d = c15587x9e6f975b;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.f fVar;
        if (obj instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            if (str.endsWith("@chatroom") || str.endsWith("@im.chatroom")) {
                if (i17 != 5) {
                    ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1715x697f208.i(this, str), "fts.GroupTrainIncr");
                    return;
                }
                fVar = this.f219357d.f36403x5a0af82;
                java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = fVar.f219351d;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    ((java.util.HashMap) fVar.f219348a).remove(str);
                    ((java.util.HashMap) fVar.f219349b).remove(str);
                    ((java.util.HashMap) fVar.f219350c).remove(str);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
        }
    }
}
