package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes5.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f151755d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f151756e;

    /* renamed from: f, reason: collision with root package name */
    public int f151757f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t2 f151758g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.k96 f151759h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t2 t2Var, r45.k96 k96Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f151758g = t2Var;
        this.f151759h = k96Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.s2(this.f151758g, this.f151759h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.s2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        gz0.h hVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f151757f;
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t2 t2Var = this.f151758g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gz0.h hVar2 = t2Var.f151778r;
            if (hVar2 != null) {
                this.f151757f = 1;
                if (hVar2.d(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t2Var = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t2) this.f151756e;
                hVar = (gz0.h) this.f151755d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                t2Var.f151778r = hVar;
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.String music_url = this.f151759h.f460051e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(music_url, "music_url");
        gz0.h hVar3 = new gz0.h(music_url, r1.f460052f, 0L, 4, null);
        yz5.p pVar = t2Var.f151769f;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        pVar.mo149xb9724478(bool, bool);
        this.f151755d = hVar3;
        this.f151756e = t2Var;
        this.f151757f = 2;
        if (hVar3.c(this) == aVar) {
            return aVar;
        }
        hVar = hVar3;
        t2Var.f151778r = hVar;
        return jz5.f0.f384359a;
    }
}
