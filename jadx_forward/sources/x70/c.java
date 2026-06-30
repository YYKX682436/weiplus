package x70;

/* loaded from: classes12.dex */
public final class c extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l70.d f533940e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, l70.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f533939d = str;
        this.f533940e = dVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new x70.c(this.f533939d, this.f533940e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((x70.c) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.String str = this.f533939d;
        boolean g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(str);
        l70.d dVar = this.f533940e;
        dVar.f398342j.put("down_file_size", new java.lang.Long(com.p314xaae8f345.mm.vfs.w6.k(str)));
        dVar.f398342j.put("down_file_type", g17 ? "wxam" : "jpg");
        if (!dVar.f398344l || !g17) {
            if (com.p314xaae8f345.mm.vfs.w6.x(str, dVar.f398338f, true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgDownload.MsgImgSyncDownloadFSC", "downloadMsgImg[" + dVar.f398339g + "] move file success " + dVar.f398337e + " imgType:" + dVar.f398334b + " isTp:" + dVar.f398333a);
                return new l70.e(l70.f.f398353d);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgDownload.MsgImgSyncDownloadFSC", "downloadMsgImg[" + dVar.f398339g + "] move file error " + dVar.f398337e + " imgType:" + dVar.f398334b + " isTp:" + dVar.f398333a);
            l70.e eVar = new l70.e(l70.f.f398356g);
            eVar.f398352b = -9999;
            return eVar;
        }
        int aj6 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).aj(str, dVar.f398338f, 1);
        if (aj6 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgDownload.MsgImgSyncDownloadFSC", "downloadMsgImg[" + dVar.f398339g + "] convert hevc file success " + dVar.f398337e + " imgType:" + dVar.f398334b + " isTp:" + dVar.f398333a);
            return new l70.e(l70.f.f398353d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgDownload.MsgImgSyncDownloadFSC", "downloadMsgImg[" + dVar.f398339g + "] convert hevc file error " + dVar.f398337e + " imgType:" + dVar.f398334b + " isTp:" + dVar.f398333a + " ret:" + aj6);
        l70.e eVar2 = new l70.e(l70.f.f398357h);
        eVar2.f398352b = aj6;
        return eVar2;
    }
}
