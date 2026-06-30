package com.p314xaae8f345.p347x615374d.p361xcbf79e0a;

/* renamed from: com.tencent.kinda.modularize.KindaAppModuleManager */
/* loaded from: classes9.dex */
public class C3643xd1ddb44d {

    /* renamed from: moduleList */
    private java.util.List<com.p314xaae8f345.p347x615374d.p361xcbf79e0a.AbstractC3645xaf6a03f9> f13974xcc1eb52a = new java.util.ArrayList();

    /* renamed from: initAllModule */
    public void m28551x3857fc3d() {
        for (com.p314xaae8f345.p347x615374d.p361xcbf79e0a.AbstractC3645xaf6a03f9 abstractC3645xaf6a03f9 : this.f13974xcc1eb52a) {
            abstractC3645xaf6a03f9.mo25847x15d1c4e();
            abstractC3645xaf6a03f9.m28557x5381541a();
        }
    }

    /* renamed from: onAppCreate */
    public void m28552x3c20675e() {
        java.util.Iterator<com.p314xaae8f345.p347x615374d.p361xcbf79e0a.AbstractC3645xaf6a03f9> it = this.f13974xcc1eb52a.iterator();
        while (it.hasNext()) {
            it.next().mo25848x3c20675e();
        }
    }

    /* renamed from: registerModule */
    public void m28553xd8c9faef(com.p314xaae8f345.p347x615374d.p361xcbf79e0a.AbstractC3645xaf6a03f9 abstractC3645xaf6a03f9) {
        if (abstractC3645xaf6a03f9 != null) {
            this.f13974xcc1eb52a.add(abstractC3645xaf6a03f9);
        }
    }
}
