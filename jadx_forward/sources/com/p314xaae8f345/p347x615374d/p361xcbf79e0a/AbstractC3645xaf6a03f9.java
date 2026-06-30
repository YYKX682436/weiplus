package com.p314xaae8f345.p347x615374d.p361xcbf79e0a;

/* renamed from: com.tencent.kinda.modularize.KindaModule */
/* loaded from: classes9.dex */
public abstract class AbstractC3645xaf6a03f9 {

    /* renamed from: nativeModuleMap */
    private java.util.HashMap<java.lang.String, java.lang.Class> f13976x89dfd8f9 = new java.util.HashMap<>();

    /* renamed from: nativeViewMap */
    private java.util.HashMap<java.lang.String, java.lang.Class> f13977xe20a0460 = new java.util.HashMap<>();

    /* renamed from: configModule */
    public abstract void mo25847x15d1c4e();

    /* renamed from: initModuleInner */
    public void m28557x5381541a() {
        for (java.lang.String str : this.f13976x89dfd8f9.keySet()) {
            com.p314xaae8f345.p347x615374d.C3075x2a2f10f7.m24620xeddcee07(this.f13976x89dfd8f9.get(str), str);
        }
        for (java.lang.String str2 : this.f13977xe20a0460.keySet()) {
            com.p314xaae8f345.p347x615374d.C3075x2a2f10f7.m24620xeddcee07(this.f13977xe20a0460.get(str2), str2);
        }
    }

    /* renamed from: onAppCreate */
    public abstract void mo25848x3c20675e();

    /* renamed from: registerNativeModule */
    public void m28558x63e5dba6(java.lang.String str, java.lang.Class cls) {
        if (str == null || cls == null) {
            return;
        }
        this.f13976x89dfd8f9.put(str, cls);
    }

    /* renamed from: registerView */
    public void m28559x9a36d3e8(java.lang.String str, java.lang.Class cls) {
        if (str == null || cls == null) {
            return;
        }
        this.f13977xe20a0460.put(str, cls);
    }
}
