package z12;

/* loaded from: classes11.dex */
public class g extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f550825d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f550826e;

    /* renamed from: f, reason: collision with root package name */
    public final int f550827f;

    /* renamed from: g, reason: collision with root package name */
    public final int f550828g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f550829h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f550830i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f550831m;

    public g(int i17, int i18, java.util.List list, java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ad();
        lVar.f152198b = new r45.bd();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmbackupemojioperate";
        lVar.f152200d = 698;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f550826e = lVar.a();
        this.f550827f = i17;
        this.f550828g = i18;
        this.f550829h = list;
        this.f550830i = str;
        this.f550831m = java.util.UUID.randomUUID().toString() + "_" + java.lang.System.currentTimeMillis();
    }

    public static com.p314xaae8f345.mm.p2621x8fb0427b.u3 H(int i17) {
        return i17 == 0 ? com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_DOWNLOAD_VERSION_KEY_NORMAL_STRING : i17 == 1 ? com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_DOWNLOAD_VERSION_KEY_CAPTURE_STRING : com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_DOWNLOAD_VERSION_KEY_DEFAULT_STRING;
    }

    public static void I() {
        if (android.text.TextUtils.isEmpty(gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_DOWNLOAD_VERSION_KEY_NORMAL_STRING, null))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "no version key for custom emojis, sync now");
            new pr.t(0, null, false).a();
        }
        if (android.text.TextUtils.isEmpty(gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_DOWNLOAD_VERSION_KEY_CAPTURE_STRING, null))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "no version key for capture emojis, sync now");
            new pr.t(1, null, false).a();
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f550825d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f550826e;
        r45.ad adVar = (r45.ad) oVar.f152243a.f152217a;
        adVar.f451466e = this.f550828g;
        adVar.f451465d = new java.util.LinkedList(this.f550829h);
        int i17 = this.f550827f;
        adVar.f451467f = i17;
        adVar.f451468g = this.f550830i;
        java.lang.String v17 = gm0.j1.u().c().v(H(i17), null);
        adVar.f451469h = v17;
        java.lang.String str = this.f550831m;
        adVar.f451470i = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "VersionKey: %s, UpdateVersionKey: %s", v17, str);
        java.util.LinkedList linkedList = adVar.f451465d;
        if (linkedList == null || linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "empty md5 list.");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "do scene delte md5 list size:%s, versionKey: %s, updateVersionKey: %s", java.lang.Integer.valueOf(adVar.f451465d.size()), adVar.f451469h, str);
            for (int i18 = 0; i18 < adVar.f451465d.size(); i18++) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "do scene delte md5:%s", adVar.f451465d.get(i18));
            }
        }
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 698;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneBackupEmojiOperate", "errType:%d, errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i19 == -434) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.NetSceneBackupEmojiOperate", "[cpan] batch backup emoji failed. over size.");
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_BACKUP_OVERSIZE_BOOLEAN, java.lang.Boolean.TRUE);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(164L, 7L, 1L, false);
        }
        int i27 = this.f550827f;
        int i28 = this.f550828g;
        if (i18 == 0 && i19 == 0) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_BACKUP_OVERSIZE_BOOLEAN, java.lang.Boolean.FALSE);
            if (i28 == 1 || i28 == 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(164L, 5L, 1L, false);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(164L, 8L, 1L, false);
            }
            gm0.j1.u().c().x(H(i27), this.f550831m);
        } else {
            if (i28 == 1 || i28 == 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(164L, 6L, 1L, false);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(164L, 9L, 1L, false);
            }
            if (i19 == -2048) {
                new pr.t(i27, null, false).a();
            }
        }
        this.f550825d.mo815x76e0bfae(i18, i19, str, this);
    }
}
