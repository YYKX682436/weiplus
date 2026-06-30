package xf0;

/* loaded from: classes12.dex */
public final class q extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xf0.i f535744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.o f535745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535746f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xf0.s f535747g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(xf0.i iVar, dn.o oVar, java.lang.String str, xf0.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f535744d = iVar;
        this.f535745e = oVar;
        this.f535746f = str;
        this.f535747g = sVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xf0.q(this.f535744d, this.f535745e, this.f535746f, this.f535747g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((xf0.q) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17;
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xf0.i iVar = this.f535744d;
        iVar.f535717l.put("down_file_size", new java.lang.Long(com.p314xaae8f345.mm.vfs.w6.k(this.f535745e.f69595x6d25b0d9)));
        if (iVar.f535714i) {
            if (!com.p314xaae8f345.mm.vfs.w6.x(this.f535746f, iVar.f535711f, true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoMsg.Receive.MsgVideoSyncDownloadFSC", "downloadMsgVideo[" + iVar.f535715j + "] move file error " + iVar.f535710e);
                xf0.j jVar = new xf0.j(xf0.k.f535730g);
                jVar.f535726b = -9999;
                return jVar;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.Receive.MsgVideoSyncDownloadFSC", "downloadMsgVideo[" + iVar.f535715j + "] move file success " + iVar.f535710e + ",or no need move,downloadToTmp:" + iVar.f535714i);
        this.f535747g.getClass();
        java.lang.String str2 = iVar.f535711f;
        t21.v2 v2Var = iVar.f535712g;
        if (v2Var != null && (k17 = pt0.f0.f439742b1.k(v2Var.f496553r, v2Var.f496549n)) != null) {
            boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str2);
            java.lang.String str3 = iVar.f535715j;
            if (j17) {
                zz.b bj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(str2, k17.mo78013xfb85f7b0(), com.p314xaae8f345.mm.vfs.w6.p(str2), null);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkDupVideo[");
                sb6.append(str3);
                sb6.append("] video path=");
                sb6.append(str2);
                sb6.append(", fileName=");
                sb6.append(v2Var.d());
                sb6.append(", ret=");
                sb6.append(bj6.f559224a);
                sb6.append(", hitCache=");
                sb6.append(bj6.f559225b);
                sb6.append(", copyResult=");
                sb6.append(bj6.f559227d);
                sb6.append(", replaceResult=");
                str = ", copyResult=";
                sb6.append(bj6.f559228e);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.Receive.MsgVideoSyncDownloadFSC", sb6.toString());
            } else {
                str = ", copyResult=";
            }
            if (iVar.f535707b == xf0.f.f535696d) {
                java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, v2Var.d(), false);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tj6) && com.p314xaae8f345.mm.vfs.w6.j(tj6)) {
                    zz.b bj7 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(tj6, k17.mo78013xfb85f7b0(), com.p314xaae8f345.mm.vfs.w6.p(tj6), null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.Receive.MsgVideoSyncDownloadFSC", "checkDupVideo[" + str3 + "] thumb path=" + tj6 + ", fileName=" + v2Var.d() + ", ret=" + bj7.f559224a + ", hitCache=" + bj7.f559225b + str + bj7.f559227d);
                }
            }
        }
        return new xf0.j(xf0.k.f535727d);
    }
}
