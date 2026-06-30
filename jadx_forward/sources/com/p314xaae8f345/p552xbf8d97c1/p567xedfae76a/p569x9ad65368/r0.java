package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f134402a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f134403b;

    public r0() {
        jz5.i iVar = jz5.i.f384362d;
        this.f134402a = jz5.h.a(iVar, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.q0.f134399d);
        this.f134403b = jz5.h.a(iVar, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.p0.f134396d);
    }

    public final boolean a() {
        boolean z17;
        jz5.g gVar = this.f134402a;
        if (((java.util.concurrent.ConcurrentHashMap) gVar.mo141623x754a37bb()).isEmpty()) {
            return true;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) gVar.mo141623x754a37bb();
        if (!concurrentHashMap.isEmpty()) {
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (!(((java.lang.Number) ((java.util.Map.Entry) it.next()).getKey()).intValue() == android.os.Process.myPid())) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        return z17;
    }

    public final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea b(int i17) {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea c4689x7ffeacea = (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea) ((java.util.concurrent.ConcurrentHashMap) this.f134402a.mo141623x754a37bb()).remove(java.lang.Integer.valueOf(i17));
        if (c4689x7ffeacea != null) {
            ((java.util.concurrent.ConcurrentHashMap) this.f134403b.mo141623x754a37bb()).remove(c4689x7ffeacea.f134326f);
            return c4689x7ffeacea;
        }
        throw new java.lang.IllegalStateException("token with pid=" + i17 + " not found");
    }
}
