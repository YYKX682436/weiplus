package com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578;

/* renamed from: com.tencent.tmassistantsdk.logreport.GetSettingEngine */
/* loaded from: classes13.dex */
public class C26683x196ff91c implements com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.InterfaceC26694xc7afd03f {
    protected static final java.lang.String TAG = "GetSettingEngine";

    /* renamed from: mInstance */
    protected static com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26683x196ff91c f56234x46143c22;

    /* renamed from: httpRequest */
    protected com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.C26692x9eb4924d f56235x743d58e7 = null;

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26683x196ff91c m104979x9cf0d20b() {
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26683x196ff91c c26683x196ff91c;
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26683x196ff91c.class) {
            if (f56234x46143c22 == null) {
                f56234x46143c22 = new com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26683x196ff91c();
            }
            c26683x196ff91c = f56234x46143c22;
        }
        return c26683x196ff91c;
    }

    /* renamed from: cancleRequest */
    public synchronized void m104980xc6e3cda3() {
        com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.C26692x9eb4924d c26692x9eb4924d = this.f56235x743d58e7;
        if (c26692x9eb4924d != null) {
            c26692x9eb4924d.m105008xc6e3cda3();
            this.f56235x743d58e7 = null;
        }
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.InterfaceC26694xc7afd03f
    /* renamed from: onSettingHttpRequestFinish */
    public void mo104981x900d28e9(com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26745x5ba7fed6 c26745x5ba7fed6, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26746x1c7f90da c26746x1c7f90da, boolean z17) {
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26755x5c2e5d21 c26755x5c2e5d21;
        byte[] bArr;
        this.f56235x743d58e7 = null;
        if (!z17) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "get settings failed!");
            return;
        }
        java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26755x5c2e5d21> arrayList = c26746x1c7f90da.f56640x5582bc23;
        if (arrayList != null && arrayList.size() > 0 && (c26755x5c2e5d21 = c26746x1c7f90da.f56640x5582bc23.get(0)) != null && (bArr = c26755x5c2e5d21.cfg) != null) {
            com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26756xf2240950 c26756xf2240950 = (com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26756xf2240950) com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.m105151x5686712(bArr, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26756xf2240950.class);
            if (c26756xf2240950 != null) {
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105500xeaf20abc(c26756xf2240950.f56708x6dd19677);
            } else {
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "response  StatCfg is null !");
            }
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "response.settings is null !");
    }

    /* renamed from: sendRequest */
    public void m104982x319ab1e7() {
        if (this.f56235x743d58e7 != null) {
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.C26692x9eb4924d c26692x9eb4924d = new com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.C26692x9eb4924d();
        this.f56235x743d58e7 = c26692x9eb4924d;
        c26692x9eb4924d.m105005xc548398(this);
        this.f56235x743d58e7.m105004xc7518fc7();
    }
}
