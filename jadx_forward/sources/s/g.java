package s;

/* loaded from: classes16.dex */
public final class g extends qz5.l implements yz5.p {
    public final /* synthetic */ s.i L;
    public final /* synthetic */ long M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(s.i iVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.L = iVar;
        this.M = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new s.g(this.L, this.M, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        s.g gVar = (s.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        gVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        s.i iVar = this.L;
        iVar.f483371h = true;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = iVar.f483370g;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        iVar.f483370g = null;
        com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11200x558f7a4c c11200x558f7a4c = iVar.f483366c;
        if (c11200x558f7a4c == null) {
            c11200x558f7a4c = iVar.f483367d;
        }
        if (c11200x558f7a4c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCLoadingUI", "dismiss: not attached yet, keep ui for late attach id=" + iVar.f483369f);
        } else {
            c11200x558f7a4c.m48373x63a3b28a();
            int i17 = iVar.f483369f;
            if (i17 > 0) {
                s.i.f483361i.a(i17);
                iVar.f483369f = 0;
            }
        }
        iVar.f483366c = null;
        iVar.f483367d = null;
        iVar.f483368e = 0L;
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.r rVar = iVar.f483365b;
        if (rVar != null) {
            rVar.b(this.M);
        }
        iVar.f483365b = null;
        return jz5.f0.f384359a;
    }
}
