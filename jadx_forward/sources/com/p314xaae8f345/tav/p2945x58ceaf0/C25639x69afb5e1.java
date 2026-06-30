package com.p314xaae8f345.tav.p2945x58ceaf0;

/* renamed from: com.tencent.tav.asset.CompositionTrack */
/* loaded from: classes16.dex */
public class C25639x69afb5e1 extends com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b<com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212> {

    /* renamed from: segments */
    protected java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212> f47094x3eef47a0;

    public C25639x69afb5e1() {
        this.f47094x3eef47a0 = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b
    /* renamed from: getSegments */
    public java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212> mo96159xbac98516() {
        return this.f47094x3eef47a0;
    }

    /* renamed from: toString */
    public java.lang.String m96183x9616526c() {
        return "CompositionTrack{segments=" + this.f47094x3eef47a0 + ", trackID=" + this.f47088xc060d3a6 + ", mediaType=" + this.f47077x7f94e13e + '}';
    }

    @Override // com.p314xaae8f345.tav.p2945x58ceaf0.C25634xf527485b
    /* renamed from: segmentForTrackTime */
    public com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 mo96168x1a2bbec2(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 m97241x30959487;
        java.util.List<com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212> list = this.f47094x3eef47a0;
        if (list == null) {
            return null;
        }
        for (com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212 c25640x7df05212 : list) {
            if (c25640x7df05212 != null && (m97241x30959487 = c25640x7df05212.m96173x35b5540b().m97241x30959487()) != null && m97241x30959487.m97253x805f158c(c25736x76b98a57) && (c25640x7df05212 instanceof com.p314xaae8f345.tav.p2945x58ceaf0.C25640x7df05212)) {
                return c25640x7df05212;
            }
        }
        return null;
    }

    public C25639x69afb5e1(com.p314xaae8f345.tav.p2945x58ceaf0.AbstractC25633x3c9fad0 abstractC25633x3c9fad0, int i17, int i18, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        super(abstractC25633x3c9fad0, i17, i18, c25738xead39d26);
        this.f47094x3eef47a0 = new java.util.ArrayList();
    }
}
