package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes5.dex */
public final class p6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 f151705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f151706e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 m7Var, e0.f1 f1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f151705d = m7Var;
        this.f151706e = f1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.p6(this.f151705d, this.f151706e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.p6 p6Var = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.p6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        p6Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.List b17 = this.f151706e.f().b();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
        java.util.Iterator it = b17.iterator();
        while (it.hasNext()) {
            arrayList.add(new java.lang.Integer(((e0.q0) ((e0.n) it.next())).f327212b));
        }
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m7 m7Var = this.f151705d;
        m7Var.getClass();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            int intValue = ((java.lang.Number) it6.next()).intValue();
            com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5) kz5.n0.a0(m7Var.b(), intValue);
            if ((m5Var instanceof com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5) || (m5Var instanceof com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.g5)) {
                java.lang.String str = m5Var.f151610a;
                java.util.HashSet hashSet = m7Var.f151637v;
                if (!hashSet.contains(str)) {
                    com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.b7 b7Var = m7Var.f151634s;
                    if (b7Var != null) {
                        b7Var.b(str, intValue);
                    }
                    hashSet.add(str);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
