package com.tencent.mm.plugin.fav;

/* loaded from: classes12.dex */
public class i implements vg3.q4 {
    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavNewXmlConsumer", "consumeNewXml subtype: %s values: %s", str, map.toString());
        str.getClass();
        if (str.equals("resendfavitem")) {
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            am.z9 z9Var = favoriteOperationEvent.f54243g;
            z9Var.f8528a = 39;
            z9Var.f8544q = (java.lang.String) map.get(".sysmsg.favitem.favid");
            z9Var.f8545r = (java.lang.String) map.get(".sysmsg.favitem.dataidlist");
            favoriteOperationEvent.b(android.os.Looper.getMainLooper());
            o72.v2.b(0);
            return null;
        }
        if (!str.equals("uploadfavitem")) {
            return null;
        }
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent2 = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var2 = favoriteOperationEvent2.f54243g;
        z9Var2.f8528a = 38;
        z9Var2.f8544q = (java.lang.String) map.get(".sysmsg.favids");
        favoriteOperationEvent2.b(android.os.Looper.getMainLooper());
        o72.v2.b(1);
        return null;
    }
}
