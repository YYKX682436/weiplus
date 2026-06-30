package com.tencent.kinda.modularize;

/* loaded from: classes9.dex */
public abstract class KindaModule {
    private java.util.HashMap<java.lang.String, java.lang.Class> nativeModuleMap = new java.util.HashMap<>();
    private java.util.HashMap<java.lang.String, java.lang.Class> nativeViewMap = new java.util.HashMap<>();

    public abstract void configModule();

    public void initModuleInner() {
        for (java.lang.String str : this.nativeModuleMap.keySet()) {
            com.tencent.kinda.ConstructProxy.proxyDefaultConstructor(this.nativeModuleMap.get(str), str);
        }
        for (java.lang.String str2 : this.nativeViewMap.keySet()) {
            com.tencent.kinda.ConstructProxy.proxyDefaultConstructor(this.nativeViewMap.get(str2), str2);
        }
    }

    public abstract void onAppCreate();

    public void registerNativeModule(java.lang.String str, java.lang.Class cls) {
        if (str == null || cls == null) {
            return;
        }
        this.nativeModuleMap.put(str, cls);
    }

    public void registerView(java.lang.String str, java.lang.Class cls) {
        if (str == null || cls == null) {
            return;
        }
        this.nativeViewMap.put(str, cls);
    }
}
