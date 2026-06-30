package com.tencent.mm.plugin.expansions;

/* loaded from: classes.dex */
public final class SoDepsAnalysis {
    private static java.util.Map<java.lang.String, java.util.List<java.lang.String>> deliveryDepsMap = new java.util.HashMap();
    private static java.util.Map<java.lang.String, java.util.List<java.lang.String>> baseDepsMap = new java.util.HashMap();

    static {
        initDeliveryMap();
        initBaseMap();
    }

    public static java.util.Map<java.lang.String, java.util.List<java.lang.String>> getBaseDepsMap() {
        return baseDepsMap;
    }

    public static java.util.Map<java.lang.String, java.util.List<java.lang.String>> getDeliveryDepsMap() {
        return deliveryDepsMap;
    }

    private static void initBaseMap() {
    }

    private static void initDeliveryMap() {
    }
}
