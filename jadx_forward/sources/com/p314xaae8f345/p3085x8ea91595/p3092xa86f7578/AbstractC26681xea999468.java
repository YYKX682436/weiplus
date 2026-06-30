package com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578;

/* renamed from: com.tencent.tmassistantsdk.logreport.BaseReportManager */
/* loaded from: classes13.dex */
public abstract class AbstractC26681xea999468 implements com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.InterfaceC26684xe500c24b {

    /* renamed from: MAX_READ_COUNT */
    public static final int f56229xae277ee1 = 1000;
    protected static final java.lang.String TAG = "BaseReportManager";

    /* renamed from: reportRequest */
    protected com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26685xa63b644f f56232xc5eb2bb = null;

    /* renamed from: maxReportCount */
    protected int f56231x7984a837 = 0;

    /* renamed from: idLists */
    protected final java.util.List<java.lang.Long> f56230x61735f3a = new java.util.ArrayList();

    /* renamed from: addLogData */
    public synchronized void m104969x86141d2d(com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "addLogData,loginfo");
        if (abstractC2861x7aec4921 != null) {
            mo104972xf33d5060().m105437x35c17d(com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.m105157xa76917d5(abstractC2861x7aec4921));
        }
    }

    /* renamed from: cancleRequest */
    public void m104970xc6e3cda3() {
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26685xa63b644f c26685xa63b644f = this.f56232xc5eb2bb;
        if (c26685xa63b644f != null) {
            c26685xa63b644f.m105008xc6e3cda3();
            this.f56232xc5eb2bb = null;
        }
    }

    /* renamed from: destroy */
    public void m104971x5cd39ffa() {
        this.f56232xc5eb2bb = null;
        this.f56230x61735f3a.clear();
    }

    /* renamed from: getLogTable */
    public abstract com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.AbstractC26767x1daf70fb mo104972xf33d5060();

    /* renamed from: getReportType */
    public abstract byte mo104973x615f5684();

    @Override // com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.InterfaceC26684xe500c24b
    /* renamed from: onLogReprotHttpRequestFinish */
    public void mo104974xe6f8e8bb(com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26685xa63b644f c26685xa63b644f, boolean z17) {
        java.util.List<java.lang.Long> list;
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "onLogReprotHttpRequestFinish,result:" + z17);
        if (z17 && (list = this.f56230x61735f3a) != null && list.size() > 0) {
            mo104972xf33d5060().m105428xb06685ab(this.f56230x61735f3a);
        }
        this.f56232xc5eb2bb = null;
        this.f56230x61735f3a.clear();
        if (!z17 || this.f56231x7984a837 >= 5) {
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "onLogReprotHttpRequestFinish wifi is true reportlog go on,result:" + z17 + " count:" + this.f56231x7984a837);
        m104975xdf66853a();
        this.f56231x7984a837 = this.f56231x7984a837 + 1;
    }

    /* renamed from: reportLogData */
    public synchronized void m104975xdf66853a() {
        boolean m104984x38404424;
        if (com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105490x5aef92ad()) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "reportLogData,request:" + this.f56232xc5eb2bb);
            if (this.f56232xc5eb2bb != null) {
                return;
            }
            com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26685xa63b644f c26685xa63b644f = new com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26685xa63b644f();
            this.f56232xc5eb2bb = c26685xa63b644f;
            c26685xa63b644f.m104985x59897e1f(this);
            com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.AbstractC26767x1daf70fb.DataWrapper m105432x744cac53 = mo104972xf33d5060().m105432x744cac53(1000);
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "readLogDataAndSendToServer,wrappterCount:" + m105432x744cac53.f56758x6a9f2f68.size());
            if (m105432x744cac53.f56758x6a9f2f68.size() <= 0) {
                m104984x38404424 = false;
            } else {
                this.f56230x61735f3a.addAll(m105432x744cac53.f56759xb8d22c59);
                m104984x38404424 = this.f56232xc5eb2bb.m104984x38404424(mo104973x615f5684(), m105432x744cac53);
            }
            if (!m104984x38404424) {
                this.f56231x7984a837 = 0;
                this.f56232xc5eb2bb = null;
            }
        }
    }

    /* renamed from: resetMaxReportCount */
    public void m104976x53809b66() {
        this.f56231x7984a837 = 0;
    }
}
