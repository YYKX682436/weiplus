package g80;

/* loaded from: classes12.dex */
public final class b implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final s70.g f350943d;

    /* renamed from: e, reason: collision with root package name */
    public final j15.d f350944e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f350945f;

    public b(s70.g params, j15.d imgMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgMsg, "imgMsg");
        this.f350943d = params;
        this.f350944e = imgMsg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    @Override // dn.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O(java.lang.String r31, java.io.ByteArrayOutputStream r32) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g80.b.O(java.lang.String, java.io.ByteArrayOutputStream):void");
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.mm.p971x6de15a2e.o G;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("decodePrepareResponse[");
        s70.g gVar = this.f350943d;
        sb6.append(gVar.f485477a);
        sb6.append("] mediaId:");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.MsgImgUploadFSC", sb6.toString());
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        r45.qs qsVar = new r45.qs();
        byte[] bArr2 = null;
        try {
            com.p314xaae8f345.mm.p971x6de15a2e.s sVar = gm0.j1.d().f152297d;
            byte[] d17 = com.p314xaae8f345.mm.p944x882e457a.y2.d(110, bArr, (sVar == null || (G = sVar.G()) == null) ? null : G.r(1), c19767x257d7f, qsVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.MsgImgUploadFSC", "decodePrepareResponse[" + gVar.f485477a + "] aeskey[%s], fileid[%s], clientimgid[%s]", qsVar.f465773i, qsVar.f465774m, qsVar.f465768d);
            this.f350945f = qsVar.f465773i;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).Di(qsVar.f465776o);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.MsgImgUploadFSC", "decodePrepareResponse[" + gVar.f485477a + "].ActionFlag:%s", java.lang.Integer.valueOf(qsVar.f465776o));
            bArr2 = d17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgUpload.MsgImgUploadFSC", "decodePrepareResponse[" + gVar.f485477a + "] Exception:%s", e17);
            gVar.f485484h.put("up_resp_decode_err", 1);
            this.f350945f = null;
        }
        java.lang.String str2 = "decodePrepareResponse[" + gVar.f485477a + "] clientmediaid:%s, ret:%d result:%b aesKey:%s";
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(c19767x257d7f.f38864x6ac9171);
        objArr[2] = java.lang.Boolean.valueOf(bArr2 == null);
        objArr[3] = this.f350945f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.MsgImgUploadFSC", str2, objArr);
        return bArr2;
    }
}
