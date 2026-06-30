package com.tencent.mm.plugin.expansions;

/* loaded from: classes6.dex */
public final class DeliveryInitializer {
    private static final java.lang.String TAG = "MicroMsg.exp.DeliveryInitializer";

    public static void init(android.content.Context context, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map2) {
        com.tencent.mars.xlog.Log.i(TAG, "init Delivery for Expansions");
        com.tencent.mm.plugin.expansions.Delivery.init(context, map, map2);
    }
}
