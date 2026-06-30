package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public final class x1 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f295552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295553f;

    public x1(java.lang.String str, p3325xe03a0797.p3326xc267989b.q qVar, java.lang.String str2) {
        this.f295551d = str;
        this.f295552e = qVar;
        this.f295553f = str2;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z1 z1Var = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z1.f295574a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cdncallback, mediaId:");
        sb6.append(mediaId);
        sb6.append(", startRet:");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.f69553xb5f54fe9) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPagDownloader", sb6.toString());
        if (hVar == null) {
            return 0;
        }
        int i18 = hVar.f69553xb5f54fe9;
        java.lang.String str = this.f295553f;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f295552e;
        if (i18 == 0) {
            java.lang.String str2 = this.f295551d;
            if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPagDownloader", "success download：".concat(mediaId));
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.r1(str2)));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPagDownloader", "failed download：file not Exist");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28153, str, 3);
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z1 z1Var2 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z1.f295574a;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1(10002)));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPagDownloader", "failed download, " + hVar.f69553xb5f54fe9);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28153, str, 3);
            p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q1(hVar.f69553xb5f54fe9)));
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inbuf, "inbuf");
        return new byte[0];
    }
}
