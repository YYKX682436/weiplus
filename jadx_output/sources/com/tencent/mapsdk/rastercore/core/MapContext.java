package com.tencent.mapsdk.rastercore.core;

/* loaded from: classes13.dex */
public class MapContext {
    private static volatile android.content.Context context;

    public static android.content.Context getContext() {
        return context;
    }

    public static void setContext(android.content.Context context2) {
        context = context2;
    }
}
