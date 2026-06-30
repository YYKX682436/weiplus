package com.p314xaae8f345.tav.p2945x58ceaf0;

/* renamed from: com.tencent.tav.asset.CompositionTrackSegment */
/* loaded from: classes16.dex */
public class C25640x7df05212 extends com.p314xaae8f345.tav.p2945x58ceaf0.C25635x5b7fe258 {

    /* renamed from: sourcePath */
    private java.lang.String f47095xbdbebae0;

    /* renamed from: sourceTrackID */
    private int f47096xc603bf0b;

    /* renamed from: sourceType */
    private int f47097xbdc0e5f5;
    private java.net.URL url;

    public C25640x7df05212(java.lang.String str, int i17, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d262, int i18) {
        super(c25738xead39d26, c25738xead39d262);
        this.f47095xbdbebae0 = str;
        this.f47097xbdc0e5f5 = i18;
        this.f47096xc603bf0b = i17;
        this.f47089x5c2854d = false;
    }

    /* renamed from: getSourcePath */
    public java.lang.String m96184xabff72d6() {
        return this.f47095xbdbebae0;
    }

    /* renamed from: getSourceTrackID */
    public int m96185x83637b55() {
        return this.f47096xc603bf0b;
    }

    /* renamed from: getSourceType */
    public int m96186xac019deb() {
        return this.f47097xbdc0e5f5;
    }

    /* renamed from: getUrl */
    public java.net.URL m96187xb5887639() {
        return this.url;
    }

    /* renamed from: toString */
    public java.lang.String m96188x9616526c() {
        return "CompositionTrackSegment{sourcePath='" + this.f47095xbdbebae0 + "', sourceTrackID=" + this.f47096xc603bf0b + ", timeMapping=" + this.f47091x5bdf0d41 + '}';
    }

    /* renamed from: updateTargetTimeRange */
    public void m96189xbe4e43d6(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        this.f47090xa450d0fe = c25738xead39d26.m97256x51e8b0a().m97224x5a5dd5d();
        this.f47092x16fae70 = c25738xead39d26.m97252x5a5dd5d();
        this.f47091x5bdf0d41.m97243x23cac893(c25738xead39d26);
    }

    public C25640x7df05212(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        super(c25738xead39d26, c25738xead39d26);
        this.f47089x5c2854d = true;
    }
}
