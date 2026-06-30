package com.tencent.kinda.framework.app;

/* loaded from: classes11.dex */
public class KindaUIPageMap {
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.kinda.framework.app.KindaUIPageMap.Value> data = new java.util.concurrent.ConcurrentHashMap<>();

    /* loaded from: classes11.dex */
    public static class Value {
        public com.tencent.kinda.gen.IUIPage uiPage;
    }

    public static com.tencent.kinda.framework.app.KindaUIPageMap.Value getAndRemove(java.lang.String str) {
        if (!data.containsKey(str)) {
            return null;
        }
        com.tencent.kinda.framework.app.KindaUIPageMap.Value value = data.get(str);
        data.remove(str);
        return value;
    }

    public static java.lang.String getUUID() {
        return java.util.UUID.randomUUID().toString();
    }

    public static java.lang.String put(com.tencent.kinda.gen.IUIPage iUIPage) {
        java.lang.String uuid = getUUID();
        com.tencent.kinda.framework.app.KindaUIPageMap.Value value = new com.tencent.kinda.framework.app.KindaUIPageMap.Value();
        value.uiPage = iUIPage;
        data.put(uuid, value);
        return uuid;
    }
}
