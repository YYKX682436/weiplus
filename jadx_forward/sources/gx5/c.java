package gx5;

/* loaded from: classes14.dex */
public class c implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        synchronized (gx5.f.class) {
            if (gx5.f.f358991a && gx5.f.f358993c != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WordDetectModHelper", "releaseWordDetect");
                ny4.g gVar = gx5.f.f358993c;
                gVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatPicTranslateManager", "destroyOcrEnv");
                synchronized (gVar.f422999b) {
                    com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27770xd9cf22d1 c27770xd9cf22d1 = gVar.f422998a;
                    if (c27770xd9cf22d1 != null) {
                        c27770xd9cf22d1.m119937x5cd39ffa();
                    }
                    gVar.f422998a = null;
                }
                gx5.f.f358993c = null;
                gx5.f.f358991a = false;
            }
        }
    }
}
