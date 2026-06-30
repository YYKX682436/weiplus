package b22;

/* loaded from: classes12.dex */
public class b extends com.tencent.mm.plugin.emoji.sync.l {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.sync.m f17379d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f17380e;

    public b(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BKGLoader.EmojiStoreTukaziSyncTask", "[cpan] empty productid");
        }
        this.f17380e = str;
    }

    @Override // com.tencent.mm.plugin.emoji.sync.l
    public void a() {
    }

    @Override // com.tencent.mm.plugin.emoji.sync.l
    public void b(com.tencent.mm.plugin.emoji.sync.m mVar) {
        this.f17379d = mVar;
    }

    @Override // com.tencent.mm.plugin.emoji.sync.l
    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof b22.b)) {
            return false;
        }
        b22.b bVar = (b22.b) obj;
        java.lang.String str = this.f17380e;
        return (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(bVar.getKey()) || !str.equals(bVar.getKey())) ? false : true;
    }

    @Override // com.tencent.mm.plugin.emoji.sync.l
    public java.lang.String getKey() {
        java.lang.String str = this.f17380e;
        return str == null ? "" : str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f17379d != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is ruing. key:%s", getKey());
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.BKGLoader.EmojiStoreTukaziSyncTask", "call back is null");
        }
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.emotion.EmojiGroupInfo f17 = com.tencent.mm.storage.n5.f().b().f1("17", false);
        f17.field_flag = 0;
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.n5.f().b().replace(f17);
        com.tencent.mm.plugin.emoji.sync.m mVar = this.f17379d;
        if (mVar != null) {
            ((com.tencent.mm.plugin.emoji.sync.k) mVar).d(getKey(), 2, true);
        }
    }
}
