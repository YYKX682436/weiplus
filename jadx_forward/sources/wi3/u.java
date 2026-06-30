package wi3;

/* loaded from: classes4.dex */
public class u extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f527803d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f527804e;

    public u(wi3.o oVar, int i17, long j17, wi3.r rVar) {
        this(oVar, i17, j17, "", "");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f527804e = u0Var;
        return mo9409x10f9447a(sVar, this.f527803d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5865;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMultiMediaReport", "onGYNetEnd, errType:%d, errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        this.f527804e.mo815x76e0bfae(i18, i19, str, this);
    }

    public u(wi3.o oVar, int i17, long j17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new wi3.p();
        lVar.f152198b = new wi3.q();
        lVar.f152200d = 5865;
        lVar.f152199c = "/cgi-bin/micromsg-bin/mulmediareportcgi";
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f527803d = a17;
        wi3.p pVar = (wi3.p) a17.f152243a.f152217a;
        pVar.f527791g = oVar;
        pVar.f527790f = i17;
        pVar.f527789e = j17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        pVar.f527792h = linkedList;
        wi3.a aVar = new wi3.a();
        aVar.f527698d = "MEDIA_REPORT_USE_MMFG";
        wi3.b bVar = new wi3.b();
        bVar.f527700d = 1;
        bVar.f527701e = 1;
        aVar.f527699e = bVar;
        linkedList.add(aVar);
        pVar.f527788d = gm0.j1.b().h();
        java.util.LinkedList linkedList2 = pVar.f527792h;
        wi3.a aVar2 = new wi3.a();
        aVar2.f527698d = "img_phash";
        wi3.b bVar2 = new wi3.b();
        bVar2.f527700d = 6;
        bVar2.f527706m = str;
        aVar2.f527699e = bVar2;
        linkedList2.add(aVar2);
        java.util.LinkedList linkedList3 = pVar.f527792h;
        wi3.a aVar3 = new wi3.a();
        aVar3.f527698d = "img_pdq_hash";
        wi3.b bVar3 = new wi3.b();
        bVar3.f527700d = 6;
        bVar3.f527706m = str2;
        aVar3.f527699e = bVar3;
        linkedList3.add(aVar3);
        if (i17 == 2) {
            oVar.f527787z = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(oVar.f527772h);
            java.lang.String str3 = oVar.f527772h;
            oVar.f527771g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str3.substring(0, str3.indexOf(64)));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMultiMediaReport", "NetSceneMultiMediaReport init, MediaScene:%s, mediaid:%s, MediaType:%s, MediaSource:%s, to_username:%s, chatromid:%s, sns_url:%s, fileid:%s, filekey:%s, md5:%s, createtime:%s, media_width:%s, media_height:%s, thumb_url:%s, video_len:%s, video_fps:%s, audio_sample_rate:%s, video_codec:%s, audio_codec:%s, qrcode_url：%s, chatroom_size:%s, uuid:%s, phash:%s pdqhash:%s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(oVar.f527768d), java.lang.Integer.valueOf(oVar.f527769e), java.lang.Integer.valueOf(oVar.f527770f), oVar.f527772h, java.lang.Long.valueOf(oVar.f527771g), oVar.f527773i, oVar.f527774m, oVar.f527775n, oVar.f527776o, java.lang.Long.valueOf(oVar.f527777p), java.lang.Integer.valueOf(oVar.f527778q), java.lang.Integer.valueOf(oVar.f527779r), oVar.f527780s, java.lang.Integer.valueOf(oVar.f527781t), java.lang.Integer.valueOf(oVar.f527782u), java.lang.Integer.valueOf(oVar.f527783v), oVar.f527784w, oVar.f527785x, oVar.f527786y, java.lang.Integer.valueOf(oVar.f527787z), oVar.A, str, str2);
    }
}
