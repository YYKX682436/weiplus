package com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e;

/* renamed from: com.tencent.tmassistantsdk.network.GetAppSimpleDetailEngine */
/* loaded from: classes13.dex */
public class C26689x43358f30 extends com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.AbstractC26695x7cbd7c07 {
    protected static final java.lang.String TAG = "GetAppSimpleDetailHttpRequest";

    /* renamed from: mListener */
    protected com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26655xe704ca24 f56255x753a6c41;

    public C26689x43358f30(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26655xe704ca24 interfaceC26655xe704ca24) {
        this.f56255x753a6c41 = interfaceC26655xe704ca24;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.AbstractC26695x7cbd7c07
    /* renamed from: onFinished */
    public void mo104983x7cf2e371(com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921, com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec49212, int i17) {
        if (abstractC2861x7aec49212 == null) {
            return;
        }
        if (this.f56255x753a6c41 == null || i17 != 0) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.w(TAG, " error happened!!");
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26655xe704ca24 interfaceC26655xe704ca24 = this.f56255x753a6c41;
            if (interfaceC26655xe704ca24 != null) {
                interfaceC26655xe704ca24.mo104817xdc6bef5(null, false);
                return;
            }
            return;
        }
        if (abstractC2861x7aec49212 instanceof com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26744xcb4325af) {
            com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26744xcb4325af c26744xcb4325af = (com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26744xcb4325af) abstractC2861x7aec49212;
            if (c26744xcb4325af.ret != 0) {
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.w(TAG, " 后台返回的ret错误，错误值为：" + c26744xcb4325af.ret);
                this.f56255x753a6c41.mo104817xdc6bef5(null, false);
                return;
            }
            java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26741x98500544> arrayList = c26744xcb4325af.f56635xeff42022;
            if (arrayList != null && arrayList.size() > 0) {
                this.f56255x753a6c41.mo104817xdc6bef5(arrayList, true);
            } else {
                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.w(TAG, " appDetails 为空!!");
                this.f56255x753a6c41.mo104817xdc6bef5(null, false);
            }
        }
    }

    /* renamed from: sendReuqest */
    public boolean m104996x31d13e6f(java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26740xf8b7a5fb> arrayList) {
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26743xc463fb61 c26743xc463fb61 = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26743xc463fb61();
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        c26743xc463fb61.f56633x84bd04fb = arrayList;
        super.m105009x319ab1e7(c26743xc463fb61);
        return true;
    }
}
