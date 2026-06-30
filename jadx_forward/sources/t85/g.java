package t85;

/* loaded from: classes5.dex */
public final class g {
    public g(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(java.lang.String packDir) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packDir, "packDir");
        if (!com.p314xaae8f345.mm.vfs.w6.j(packDir.concat("config.json"))) {
            return false;
        }
        int optInt = new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(packDir.concat("config.json"))).optInt("cache_version", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StickerPack", "checkLocalCacheVersion: " + optInt + ", 2");
        if (optInt >= 2) {
            return true;
        }
        com.p314xaae8f345.mm.vfs.w6.f(packDir);
        return false;
    }
}
