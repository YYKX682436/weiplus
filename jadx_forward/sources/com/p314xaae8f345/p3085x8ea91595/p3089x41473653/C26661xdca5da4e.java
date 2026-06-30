package com.p314xaae8f345.p3085x8ea91595.p3089x41473653;

/* renamed from: com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKSettingClient */
/* loaded from: classes13.dex */
public class C26661xdca5da4e extends com.p314xaae8f345.p3085x8ea91595.p3089x41473653.AbstractServiceConnectionC26658x1e46da09 {

    /* renamed from: DOWNDLOADSDKSERVICENAME */
    protected static final java.lang.String f56054xfd3a340e = "com.tencent.TMAssistantDownloadSDKService";

    public C26661xdca5da4e(android.content.Context context, java.lang.String str) {
        super(context, str, f56054xfd3a340e);
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.AbstractServiceConnectionC26658x1e46da09
    /* renamed from: getBindServiceIntent */
    public android.content.Intent mo104820x330e6bbe() {
        return new android.content.Intent(this.f56038xd6cfe882, java.lang.Class.forName(this.f56039xb08a3c7b));
    }

    /* renamed from: getVersion */
    public synchronized int m104853x52c258a2() {
        com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a interfaceC26646xb416be9a = (com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a) super.m104838xa7c7e97a();
        if (interfaceC26646xb416be9a != null) {
            return interfaceC26646xb416be9a.mo104785x8a0bb559();
        }
        super.mo104821xc3bb29fd();
        return 0;
    }

    /* renamed from: isAllDownloadFinished */
    public synchronized boolean m104854xe58d0751() {
        boolean z17;
        com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a interfaceC26646xb416be9a = (com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a) super.m104838xa7c7e97a();
        if (interfaceC26646xb416be9a != null) {
            z17 = interfaceC26646xb416be9a.mo104786xe58d0751();
        } else {
            super.mo104821xc3bb29fd();
            z17 = false;
        }
        return z17;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.AbstractServiceConnectionC26658x1e46da09
    /* renamed from: onDownloadSDKServiceInvalid */
    public void mo104822xec7c4795() {
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.AbstractServiceConnectionC26658x1e46da09
    /* renamed from: registerServiceCallback */
    public void mo104823xef0bd4f7() {
        ((com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a) this.f56041x26074c91).mo104788x8f0da8d5(this.f56037x938e4a7, (com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4) this.f56040xec4f5ed);
    }

    /* renamed from: setDownloadSDKMaxTaskNum */
    public synchronized void m104855xc4114aad(int i17) {
        if (i17 < 1 || i17 > 10) {
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a interfaceC26646xb416be9a = (com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a) super.m104838xa7c7e97a();
        if (interfaceC26646xb416be9a != null) {
            interfaceC26646xb416be9a.mo104791x39ddf030(i17);
        } else {
            super.mo104821xc3bb29fd();
        }
    }

    /* renamed from: setDownloadSDKWifiOnly */
    public synchronized void m104856x2a514951(boolean z17) {
        com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a interfaceC26646xb416be9a = (com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a) super.m104838xa7c7e97a();
        if (interfaceC26646xb416be9a != null) {
            interfaceC26646xb416be9a.mo104789xa56831c6(z17);
        } else {
            super.mo104821xc3bb29fd();
        }
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.AbstractServiceConnectionC26658x1e46da09
    /* renamed from: stubAsInterface */
    public void mo104826xca6a1f99(android.os.IBinder iBinder) {
        this.f56041x26074c91 = com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a.Stub.m104794xbd0d1927(iBinder);
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3089x41473653.AbstractServiceConnectionC26658x1e46da09
    /* renamed from: unRegisterServiceCallback */
    public void mo104827x5b97421e() {
        ((com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a) this.f56041x26074c91).mo104793x9e4c47ee(this.f56037x938e4a7, (com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4) this.f56040xec4f5ed);
    }
}
