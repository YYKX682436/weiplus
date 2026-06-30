package bl3;

@j95.b(dependencies = {c42.i.class})
/* loaded from: classes13.dex */
public class e extends i95.w {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        synchronized (sl3.b.class) {
            if (sl3.b.f409252b == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerCoreService", "create");
                sl3.b.f409252b = new sl3.b(context2);
            }
        }
        sl3.b.a(gl3.c.class, new ml3.e());
        sl3.b.a(el3.i.class, new el3.h());
        sl3.b.a(kl3.f.class, new kl3.u());
        synchronized (dl3.g.class) {
            if (dl3.g.f235306a == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerCoreService", "create");
                dl3.g.f235306a = new dl3.g();
            }
        }
        com.tencent.mm.plugin.music.player.base.d.f150653a = new com.tencent.mm.plugin.music.model.player.WechatMusicLoadLibrary();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.PluginMusic", "PluginMusic configure SubCoreMusic");
        }
    }
}
