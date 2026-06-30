package com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9;

/* renamed from: com.tencent.kinda.framework.sns_cross.SnsServiceBean */
/* loaded from: classes9.dex */
public class C3275x1c73078d {

    /* renamed from: mAppId */
    private java.lang.String f12496xbdc8caaf;

    /* renamed from: mChannel */
    private int f12497xca242fd6;

    /* renamed from: mContext */
    private android.content.Context f12498xd6cfe882;

    /* renamed from: mPayInfo */
    private com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 f12499x6f24a849;

    /* renamed from: mPayScene */
    private int f12500x75f84851;

    /* renamed from: mReceiverName */
    private java.lang.String f12501x6a916227;

    /* renamed from: mReqKey */
    private java.lang.String f12502x17b867ae;

    /* renamed from: mTrueName */
    private java.lang.String f12503x92e794c6;

    public C3275x1c73078d(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56) {
        this.f12501x6a916227 = "";
        this.f12503x92e794c6 = "";
        this.f12496xbdc8caaf = "";
        this.f12499x6f24a849 = c19760x34448d56;
        this.f12498xd6cfe882 = context;
        this.f12502x17b867ae = c19760x34448d56.f273647m;
        this.f12497xca242fd6 = c19760x34448d56.f273644g;
        this.f12500x75f84851 = c19760x34448d56.f273642e;
        android.os.Bundle bundle = c19760x34448d56.f273655u;
        if (bundle != null) {
            this.f12501x6a916227 = bundle.getString("extinfo_key_1");
            this.f12503x92e794c6 = c19760x34448d56.f273655u.getString("extinfo_key_2");
            this.f12496xbdc8caaf = c19760x34448d56.f273655u.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd);
        }
    }

    /* renamed from: getAppId */
    public java.lang.String m25999x74292566() {
        return this.f12496xbdc8caaf;
    }

    /* renamed from: getChannel */
    public int m26000x69d8b8cd() {
        return this.f12497xca242fd6;
    }

    /* renamed from: getContext */
    public android.content.Context m26001x76847179() {
        return this.f12498xd6cfe882;
    }

    /* renamed from: getPayInfo */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 m26002xed93140() {
        return this.f12499x6f24a849;
    }

    /* renamed from: getPayScene */
    public int m26003xccd4de3a() {
        return this.f12500x75f84851;
    }

    /* renamed from: getReceiverName */
    public java.lang.String m26004x33eedb90() {
        return this.f12501x6a916227;
    }

    /* renamed from: getReqKey */
    public java.lang.String m26005x2d6363d7() {
        return this.f12502x17b867ae;
    }

    /* renamed from: getTrueName */
    public java.lang.String m26006xe9c42aaf() {
        return this.f12503x92e794c6;
    }

    /* renamed from: setChannel */
    public void m26007xdd4a0641(int i17) {
        this.f12497xca242fd6 = i17;
    }

    /* renamed from: setContext */
    public void m26008xe9f5beed(android.content.Context context) {
        this.f12498xd6cfe882 = context;
    }

    /* renamed from: setPayInfo */
    public void m26009x824a7eb4(com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56) {
        this.f12499x6f24a849 = c19760x34448d56;
    }

    /* renamed from: setPayScene */
    public void m26010xc78d3f46(int i17) {
        this.f12500x75f84851 = i17;
    }

    /* renamed from: setReceiverName */
    public void m26011x6a37d69c(java.lang.String str) {
        this.f12501x6a916227 = str;
    }

    /* renamed from: setReqKey */
    public void m26012x209897e3(java.lang.String str) {
        this.f12502x17b867ae = str;
    }

    /* renamed from: setTrueName */
    public void m26013xe47c8bbb(java.lang.String str) {
        this.f12503x92e794c6 = str;
    }
}
