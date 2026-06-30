package z12;

/* loaded from: classes12.dex */
public class h extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, z12.b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f550832d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f550833e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f550834f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f550835g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public int f550836h;

    /* renamed from: i, reason: collision with root package name */
    public final int f550837i;

    /* renamed from: m, reason: collision with root package name */
    public final int f550838m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.u3 f550839n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.u3 f550840o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f550841p;

    public h(java.util.LinkedList linkedList, int i17) {
        this.f550836h = 0;
        this.f550837i = 0;
        this.f550841p = new java.util.LinkedList();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.xe();
        lVar.f152198b = new r45.ye();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmbatchemojidownload";
        lVar.f152200d = 697;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f550833e = lVar.a();
        this.f550836h = 0;
        this.f550837i = 1;
        this.f550841p = linkedList;
        this.f550838m = i17;
        if (i17 == 1) {
            this.f550839n = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_SYNC_CAPTURE_EMOJI_BATCH_DOWNLOAD_BOOLEAN;
            this.f550840o = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_NEXT_CAPTURE_BATCH_DOWNLOAD_TIME_LONG;
        } else {
            this.f550839n = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN;
            this.f550840o = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_NEXT_CUSTOM_BATCH_DOWNLOAD_TIME_LONG;
        }
    }

    public final void H(r45.ye yeVar) {
        int i17 = this.f550838m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "addEmojiInfoList mCustomType: %d", java.lang.Integer.valueOf(i17));
        if (yeVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "addEmojiInfoList response is null.");
            return;
        }
        java.util.LinkedList linkedList = yeVar.f472541g;
        if (linkedList == null || linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "addemojiInfoList EmojiList is null or size is empty.");
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.ri0 ri0Var = (r45.ri0) it.next();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ri0Var.f466419d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "addEmojiInfoList: empty md5 %s", ri0Var);
            } else {
                this.f550834f.add(ri0Var.f466419d.toLowerCase());
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
                n22.m.a(ri0Var, c21053xdbf1e5f4);
                if (i17 == 1) {
                    c21053xdbf1e5f4.f68663x861009b5 = "capture";
                } else {
                    c21053xdbf1e5f4.f68653x95b20dd4 = 81;
                }
                this.f550835g.add(c21053xdbf1e5f4);
            }
        }
    }

    public r45.ye I() {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f550833e;
        if (oVar == null) {
            return null;
        }
        return (r45.ye) oVar.f152244b.f152233a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f550832d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f550833e;
        r45.xe xeVar = (r45.xe) oVar.f152243a.f152217a;
        xeVar.f471534d = this.f550836h;
        xeVar.f471535e = this.f550837i;
        xeVar.f471536f = this.f550841p;
        xeVar.f471537g = this.f550838m;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 697;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0175 A[Catch: all -> 0x0213, TryCatch #0 {all -> 0x0213, blocks: (B:62:0x0140, B:71:0x0175, B:73:0x017b, B:74:0x017f, B:75:0x018c, B:77:0x0192, B:78:0x01a9, B:83:0x01ec, B:84:0x01f3, B:86:0x01a6, B:87:0x0186, B:88:0x0161, B:96:0x021b, B:97:0x0222), top: B:61:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0192 A[Catch: all -> 0x0213, TryCatch #0 {all -> 0x0213, blocks: (B:62:0x0140, B:71:0x0175, B:73:0x017b, B:74:0x017f, B:75:0x018c, B:77:0x0192, B:78:0x01a9, B:83:0x01ec, B:84:0x01f3, B:86:0x01a6, B:87:0x0186, B:88:0x0161, B:96:0x021b, B:97:0x0222), top: B:61:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020b A[LOOP:0: B:59:0x013a->B:80:0x020b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a6 A[Catch: all -> 0x0213, TryCatch #0 {all -> 0x0213, blocks: (B:62:0x0140, B:71:0x0175, B:73:0x017b, B:74:0x017f, B:75:0x018c, B:77:0x0192, B:78:0x01a9, B:83:0x01ec, B:84:0x01f3, B:86:0x01a6, B:87:0x0186, B:88:0x0161, B:96:0x021b, B:97:0x0222), top: B:61:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0186 A[Catch: all -> 0x0213, TryCatch #0 {all -> 0x0213, blocks: (B:62:0x0140, B:71:0x0175, B:73:0x017b, B:74:0x017f, B:75:0x018c, B:77:0x0192, B:78:0x01a9, B:83:0x01ec, B:84:0x01f3, B:86:0x01a6, B:87:0x0186, B:88:0x0161, B:96:0x021b, B:97:0x0222), top: B:61:0x0140 }] */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r18, int r19, int r20, java.lang.String r21, com.p314xaae8f345.mm.p971x6de15a2e.v0 r22, byte[] r23) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z12.h.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 150;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }
}
