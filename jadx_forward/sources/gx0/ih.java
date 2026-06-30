package gx0;

/* loaded from: classes5.dex */
public final class ih extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.kh f358090e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f358091f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.c f358092g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(gx0.kh khVar, java.util.List list, com.p314xaae8f345.p457x3304c6.p479x4179489f.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358090e = khVar;
        this.f358091f = list;
        this.f358092g = cVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.ih(this.f358090e, this.f358091f, this.f358092g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.ih) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object g17;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4138x497e15e7 c4138x497e15e7;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 e17;
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        p012xc85e97e9.p093xedfae76a.j0 j0Var2;
        p012xc85e97e9.p093xedfae76a.j0 j0Var3;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358089d;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.c cVar = this.f358092g;
        gx0.kh khVar = this.f358090e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                java.util.List list = this.f358091f;
                this.f358089d = 1;
                khVar.getClass();
                g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new gx0.dh(list, cVar, null), this);
                if (g17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                g17 = obj;
            }
            c4138x497e15e7 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.C4138x497e15e7) g17;
            e17 = c4138x497e15e7 != null ? c4138x497e15e7.e() : null;
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        } catch (java.lang.Exception unused) {
        }
        if (c4138x497e15e7 == null || e17 == null) {
            return null;
        }
        khVar.f358175r = new ex0.a0(khVar.f358177t, c4138x497e15e7, e17, this.f358091f, khVar.m158345xefc66565(), null, new mv0.b(cVar, true), 32, null);
        ex0.a0 a0Var = khVar.f358175r;
        if (a0Var != null && (j0Var3 = a0Var.f338649z) != null) {
            j0Var3.mo7806x9d92d11c(khVar.m158354x19263085(), new gx0.fh(khVar));
        }
        ex0.a0 a0Var2 = khVar.f358175r;
        if (a0Var2 != null && (j0Var2 = a0Var2.B) != null) {
            j0Var2.mo7806x9d92d11c(khVar.m158354x19263085(), new gx0.gh(khVar));
        }
        ex0.a0 a0Var3 = khVar.f358175r;
        if (a0Var3 != null && (j0Var = a0Var3.C) != null) {
            j0Var.mo7806x9d92d11c(khVar.m158354x19263085(), new gx0.hh(khVar));
        }
        ex0.a0 a0Var4 = khVar.f358175r;
        if (a0Var4 != null) {
            java.util.Iterator it = ((java.util.ArrayList) a0Var4.f338630g.f338710e).iterator();
            while (it.hasNext()) {
                ex0.r rVar = (ex0.r) it.next();
                ug.m mVar = rVar.f338702c;
                if (mVar == ug.m.ImageClip || mVar == ug.m.VideoClip || mVar == ug.m.MovieClip) {
                    p3325xe03a0797.p3326xc267989b.l.d(a0Var4.f338626c, null, null, new ex0.z(a0Var4, rVar, null), 3, null);
                }
            }
        }
        gx0.kh.Y6(khVar);
        khVar.f358176s.mo523x53d8522f(jz5.f0.f384359a);
        return khVar.f358175r;
    }
}
