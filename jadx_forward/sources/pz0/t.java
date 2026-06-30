package pz0;

/* loaded from: classes5.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f440703d;

    /* renamed from: e, reason: collision with root package name */
    public int f440704e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.bl6 f440705f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r45.bl6 bl6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f440705f = bl6Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pz0.t(this.f440705f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pz0.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.bl6 bl6Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f440704e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.bl6 it = this.f440705f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "$it");
            this.f440703d = it;
            this.f440704e = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            java.lang.String c17 = com.p314xaae8f345.mm.vfs.q7.c("maas_music_demo_resource");
            com.p314xaae8f345.mm.vfs.w6.u(c17);
            java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(c17 + '/' + it.f452393f, true);
            if (i18 == null) {
                nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Maas.MusicVideoResManager", "get path error");
            } else {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(i18));
                if (!r6Var.m() || r6Var.C() <= 0) {
                    ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37789x737fa05e(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.m37659xe960bf84(it.f452393f, it.f452392e, 251, it.f452391d == 1 ? 20304 : 20302, i18), null, new pz0.s(it, i18, r6Var, nVar), 0);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.MusicVideoResManager", it.f452393f + ' ' + it.f452391d + " already cached at " + i18 + ", fileSize: " + r6Var.C() + ", url: " + it.f452392e);
                    nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(i18));
                }
            }
            obj = nVar.a();
            if (obj == aVar) {
                return aVar;
            }
            bl6Var = it;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bl6Var = (r45.bl6) this.f440703d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        bl6Var.f452392e = (java.lang.String) obj;
        return jz5.f0.f384359a;
    }
}
