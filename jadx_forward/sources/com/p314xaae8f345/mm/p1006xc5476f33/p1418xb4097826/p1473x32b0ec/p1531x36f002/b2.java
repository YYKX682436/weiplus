package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes5.dex */
public final class b2 extends qz5.l implements yz5.p {
    public b2(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.b2(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.b2((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.d2.f197009a;
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteSongDecodeResource fileDir: ");
            sb6.append(r6Var);
            sb6.append(" size: ");
            com.p314xaae8f345.mm.vfs.r6[] G = r6Var.G();
            sb6.append(G != null ? new java.lang.Integer(G.length) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveKTVResourceUtil", sb6.toString());
            return java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.g(str, true));
        } catch (java.lang.Throwable unused) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("deleteSongDecodeResource error, ");
            jz5.f0 f0Var = jz5.f0.f384359a;
            sb7.append(f0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveKTVResourceUtil", sb7.toString());
            return f0Var;
        }
    }
}
