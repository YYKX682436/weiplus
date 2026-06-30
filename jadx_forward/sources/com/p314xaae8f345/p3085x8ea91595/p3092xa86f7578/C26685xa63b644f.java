package com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578;

/* renamed from: com.tencent.tmassistantsdk.logreport.LogReportHttpRequest */
/* loaded from: classes13.dex */
public class C26685xa63b644f extends com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.AbstractC26695x7cbd7c07 {

    /* renamed from: mListener */
    protected com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.InterfaceC26684xe500c24b f56236x753a6c41 = null;

    @Override // com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.AbstractC26695x7cbd7c07
    /* renamed from: onFinished */
    public void mo104983x7cf2e371(com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921, com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec49212, int i17) {
        if (abstractC2861x7aec49212 == null) {
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.InterfaceC26684xe500c24b interfaceC26684xe500c24b = this.f56236x753a6c41;
        if (interfaceC26684xe500c24b == null || i17 != 0) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i("LogReportHttpRequest", "mListener is null !");
            return;
        }
        if (!(abstractC2861x7aec49212 instanceof com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26749x7dcda1b1)) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i("LogReportHttpRequest", "response isn't instanceof ReportLogResponse !");
        } else if (((com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26749x7dcda1b1) abstractC2861x7aec49212).ret == 0) {
            interfaceC26684xe500c24b.mo104974xe6f8e8bb(this, true);
        } else {
            interfaceC26684xe500c24b.mo104974xe6f8e8bb(this, false);
        }
    }

    /* renamed from: sendLogDataToServer */
    public boolean m104984x38404424(byte b17, com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.AbstractC26767x1daf70fb.DataWrapper dataWrapper) {
        if (dataWrapper == null) {
            return false;
        }
        return super.m105009x319ab1e7((com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26748x1478f71f) com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.m105149x1807eed(b17, dataWrapper.f56758x6a9f2f68, com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105484xd4409c06(com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105492x76847179()), com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105485xc7211efa(com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105492x76847179()), ""));
    }

    /* renamed from: setmListener */
    public void m104985x59897e1f(com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.InterfaceC26684xe500c24b interfaceC26684xe500c24b) {
        this.f56236x753a6c41 = interfaceC26684xe500c24b;
    }
}
