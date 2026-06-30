package com.tencent.kinda.modularize;

/* loaded from: classes9.dex */
public class KindaAppModuleManager {
    private java.util.List<com.tencent.kinda.modularize.KindaModule> moduleList = new java.util.ArrayList();

    public void initAllModule() {
        for (com.tencent.kinda.modularize.KindaModule kindaModule : this.moduleList) {
            kindaModule.configModule();
            kindaModule.initModuleInner();
        }
    }

    public void onAppCreate() {
        java.util.Iterator<com.tencent.kinda.modularize.KindaModule> it = this.moduleList.iterator();
        while (it.hasNext()) {
            it.next().onAppCreate();
        }
    }

    public void registerModule(com.tencent.kinda.modularize.KindaModule kindaModule) {
        if (kindaModule != null) {
            this.moduleList.add(kindaModule);
        }
    }
}
