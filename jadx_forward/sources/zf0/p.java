package zf0;

/* loaded from: classes12.dex */
public final class p extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f554030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vf0.j1 f554031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f554032f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(zf0.v0 v0Var, vf0.j1 j1Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f554030d = v0Var;
        this.f554031e = j1Var;
        this.f554032f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zf0.p(this.f554030d, this.f554031e, this.f554032f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((zf0.p) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        zf0.v0 v0Var = this.f554030d;
        oi3.h hVar = v0Var.f554096i.f517711e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        vf0.j1 j1Var = this.f554031e;
        if (hVar == null) {
            j1Var.f517730a = -520002;
            return f0Var;
        }
        t21.v2 e17 = vf0.m3.e(hVar);
        if (e17 == null) {
            j1Var.f517730a = -540010;
            return f0Var;
        }
        java.lang.Integer d17 = v0Var.d(false);
        if (d17 != null) {
            j1Var.f517730a = d17.intValue();
            return f0Var;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17.S)) {
            j1Var.getClass();
            return f0Var;
        }
        t21.v2 f17 = vf0.m3.f(hVar);
        if (f17 == null) {
            j1Var.f517730a = -540011;
            return f0Var;
        }
        java.util.Map map = j1Var.f517731b;
        v0Var.getClass();
        java.lang.String sj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).sj(hVar, bm5.f0.f104103r, f17.d(), true);
        java.lang.String str = this.f554032f;
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            if (com.p314xaae8f345.mm.vfs.w6.d(str, sj6, false) < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoMsg.SendVideoTask", "copy video file failed.target file path :{" + str + '}');
                if (map != null) {
                    map.put("prepare_origin_video_res", "error_copy_video");
                }
            } else {
                long k17 = com.p314xaae8f345.mm.vfs.w6.k(sj6);
                boolean mo10231x922a682f = ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10231x922a682f(sj6);
                long abs = java.lang.Math.abs(com.p314xaae8f345.mm.vfs.w6.k(sj6) - k17);
                if (abs > 1048576) {
                    com.p314xaae8f345.mm.vfs.w6.h(sj6);
                    com.p314xaae8f345.mm.vfs.w6.c(str, sj6);
                    if (map != null) {
                        map.put("optimizedMP4VFSFailed", "1");
                    }
                    if (map != null) {
                        map.put("optimizedMP4VFSDiff", java.lang.Long.valueOf(abs));
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoMsg.SendVideoTask", "optimizeMP4VFS result:" + mo10231x922a682f + ",fileLengthDiff:" + abs);
                }
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_remove_video_metadata_before_send, 1) == 1) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10232xd68876a6(sj6, true, true);
                }
                vf0.m3.n(f17, sj6);
            }
        } else if (map != null) {
            map.put("prepare_origin_video_res", "error_no_origin");
        }
        return f0Var;
    }
}
