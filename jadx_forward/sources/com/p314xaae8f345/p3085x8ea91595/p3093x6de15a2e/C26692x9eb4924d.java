package com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e;

/* renamed from: com.tencent.tmassistantsdk.network.GetSettingHttpRequest */
/* loaded from: classes13.dex */
public class C26692x9eb4924d extends com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.AbstractC26695x7cbd7c07 {
    protected static final java.lang.String TAG = "GetSettingHttpRequest";

    /* renamed from: mListener */
    protected com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.InterfaceC26694xc7afd03f f56261x753a6c41 = null;

    @Override // com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.AbstractC26695x7cbd7c07
    /* renamed from: onFinished */
    public void mo104983x7cf2e371(com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921, com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec49212, int i17) {
        if (abstractC2861x7aec49212 == null) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "response is null!");
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.InterfaceC26694xc7afd03f interfaceC26694xc7afd03f = this.f56261x753a6c41;
        if (interfaceC26694xc7afd03f != null && i17 == 0 && (abstractC2861x7aec49212 instanceof com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26746x1c7f90da)) {
            com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26746x1c7f90da c26746x1c7f90da = (com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26746x1c7f90da) abstractC2861x7aec49212;
            if (c26746x1c7f90da.ret == 0) {
                interfaceC26694xc7afd03f.mo104981x900d28e9((com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26745x5ba7fed6) abstractC2861x7aec4921, c26746x1c7f90da, true);
            } else {
                interfaceC26694xc7afd03f.mo104981x900d28e9((com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26745x5ba7fed6) abstractC2861x7aec4921, c26746x1c7f90da, false);
            }
        }
    }

    /* renamed from: sendSettingRequest */
    public void m105004xc7518fc7() {
        super.m105009x319ab1e7(new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26745x5ba7fed6());
    }

    /* renamed from: setGetSettingHttpListener */
    public void m105005xc548398(com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.InterfaceC26694xc7afd03f interfaceC26694xc7afd03f) {
        this.f56261x753a6c41 = interfaceC26694xc7afd03f;
    }
}
