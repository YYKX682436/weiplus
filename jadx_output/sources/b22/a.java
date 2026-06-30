package b22;

/* loaded from: classes12.dex */
public class a extends com.tencent.mm.plugin.emoji.sync.l {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.sync.m f17375d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f17376e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17377f;

    /* renamed from: g, reason: collision with root package name */
    public z12.l f17378g;

    public a(java.lang.String str) {
        this.f17377f = false;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "[cpan]");
        }
        this.f17376e = str;
    }

    @Override // com.tencent.mm.plugin.emoji.sync.l
    public void a() {
        z12.l lVar = this.f17378g;
        if (lVar == null || com.tencent.mm.sdk.platformtools.t8.K0(lVar.f469329r)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "failed cancel exchange emotion pack.");
            return;
        }
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(this.f17378g.f469329r);
        com.tencent.mars.xlog.Log.i("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "success cancel exchange emotion pack clientid:%s", this.f17378g.f469329r);
    }

    @Override // com.tencent.mm.plugin.emoji.sync.l
    public void b(com.tencent.mm.plugin.emoji.sync.m mVar) {
        this.f17375d = mVar;
    }

    @Override // com.tencent.mm.plugin.emoji.sync.l
    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof b22.a)) {
            return false;
        }
        b22.a aVar = (b22.a) obj;
        java.lang.String str = this.f17376e;
        return (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(aVar.getKey()) || !str.equals(aVar.getKey())) ? false : true;
    }

    @Override // com.tencent.mm.plugin.emoji.sync.l
    public java.lang.String getKey() {
        java.lang.String str = this.f17376e;
        return str == null ? "" : str;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr;
        if (this.f17375d != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is ruing. key:%s", getKey());
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "call back is null");
        }
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.emotion.EmojiGroupInfo f17 = com.tencent.mm.storage.n5.f().b().f1(getKey(), true);
        if (!this.f17377f && f17 != null && f17.field_sync == 2 && f17.field_status == 7) {
            com.tencent.mm.autogen.events.EmojiSyncTaskEvent emojiSyncTaskEvent = new com.tencent.mm.autogen.events.EmojiSyncTaskEvent();
            java.lang.String key = getKey();
            am.p4 p4Var = emojiSyncTaskEvent.f54103g;
            p4Var.f7603b = key;
            p4Var.f7602a = 2;
            p4Var.f7604c = true;
            emojiSyncTaskEvent.e();
            return;
        }
        java.lang.String str = this.f17376e;
        this.f17378g = new z12.l(str);
        gm0.j1.n().f273288b.g(this.f17378g);
        r45.se3 se3Var = new r45.se3();
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        z85.s y07 = com.tencent.mm.storage.n5.f().d().y0(str);
        if (y07 != null && (bArr = y07.field_content) != null) {
            try {
                se3Var.parseFrom(bArr);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
        if (se3Var.f385652d == null) {
            gm0.j1.n().f273288b.g(new z12.q(str, 15, -1));
        }
    }

    public a(java.lang.String str, boolean z17) {
        this.f17377f = false;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BKGLoader.EmojiStoreEmojiSyncTask", "[cpan]");
        }
        this.f17376e = str;
        this.f17377f = z17;
    }
}
