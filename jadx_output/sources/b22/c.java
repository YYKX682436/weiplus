package b22;

/* loaded from: classes12.dex */
public class c extends com.tencent.mm.plugin.emoji.sync.l {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.sync.m f17381d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f17382e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.m1 f17383f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.storage.emotion.EmojiInfo f17384g;

    public c(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BKGLoader.EmojiUploadTask", "[cpan] can not create task. md5 is null.");
        }
        this.f17382e = str;
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        this.f17384g = com.tencent.mm.storage.n5.f().c().u1(str);
    }

    @Override // com.tencent.mm.plugin.emoji.sync.l
    public void a() {
    }

    @Override // com.tencent.mm.plugin.emoji.sync.l
    public void b(com.tencent.mm.plugin.emoji.sync.m mVar) {
        this.f17381d = mVar;
    }

    @Override // com.tencent.mm.plugin.emoji.sync.l
    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof b22.c)) {
            return false;
        }
        b22.c cVar = (b22.c) obj;
        java.lang.String str = this.f17382e;
        return (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(cVar.f17382e) || !str.equals(cVar.f17382e)) ? false : true;
    }

    @Override // com.tencent.mm.plugin.emoji.sync.l
    public java.lang.String getKey() {
        return this.f17382e;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.emoji.sync.m mVar = this.f17381d;
        java.lang.String str = this.f17382e;
        if (mVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is ruing. key:%s", str);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.BKGLoader.EmojiUploadTask", "call back is null.");
        }
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f17384g;
        if (emojiInfo == null) {
            ((com.tencent.mm.plugin.emoji.sync.k) this.f17381d).d(str, 1, false);
        } else {
            this.f17383f = new z12.j(emojiInfo);
            gm0.j1.n().f273288b.g(this.f17383f);
        }
    }
}
