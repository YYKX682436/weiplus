package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class cl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hl f199542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199543e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hl hlVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f199542d = hlVar;
        this.f199543e = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cl(this.f199542d, this.f199543e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cl) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hl hlVar = this.f199542d;
        if (hlVar.f200106a.getVisibility() != 0) {
            hlVar.f200106a.setVisibility(0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGiftPlayPagWidget", "plagPagAudio start pag");
        hlVar.f200106a.g();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("plagPagAudio start audio, audioPath:");
        java.lang.String path = this.f199543e;
        sb6.append(path);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGiftPlayPagWidget", sb6.toString());
        tn0.w0 Z0 = hlVar.f200107b.Z0();
        if (Z0 == null) {
            return null;
        }
        int hashCode = path.hashCode();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "playLocalBgmAudio path:" + path + ", listener:null");
        Z0.G0();
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam = new com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam(hashCode, path);
        audioMusicParam.f14522xf1f89d0f = false;
        audioMusicParam.f14520x4a5820cb = -1;
        if (hashCode == 0) {
            audioMusicParam.f127778id = new java.util.Random().nextInt();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "playLocalBgmAudio generated random id " + audioMusicParam.f127778id + " for music play");
        }
        Z0.H1 = audioMusicParam;
        Z0.T().mo30282x5f1b9a9c().mo29057xc0cc2931(audioMusicParam.f127778id, 50);
        Z0.T().mo30282x5f1b9a9c().mo29055xe624d2d9(audioMusicParam.f127778id, new tn0.k(null, Z0));
        Z0.T().mo30282x5f1b9a9c().mo29068x79fb7d0f(audioMusicParam);
        return jz5.f0.f384359a;
    }
}
