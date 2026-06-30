package bl3;

@j95.b(m140513x1e06fd29 = {c42.i.class})
/* loaded from: classes13.dex */
public class e extends i95.w {
    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        synchronized (sl3.b.class) {
            if (sl3.b.f490785b == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerCoreService", "create");
                sl3.b.f490785b = new sl3.b(context2);
            }
        }
        sl3.b.a(gl3.c.class, new ml3.e());
        sl3.b.a(el3.i.class, new el3.h());
        sl3.b.a(kl3.f.class, new kl3.u());
        synchronized (dl3.g.class) {
            if (dl3.g.f316839a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioPlayerCoreService", "create");
                dl3.g.f316839a = new dl3.g();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.d.f232186a = new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1908xc53e9ae1.C16626x55d318f6();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.PluginMusic", "PluginMusic configure SubCoreMusic");
        }
    }
}
