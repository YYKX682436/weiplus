package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherTailActionStruct */
/* loaded from: classes4.dex */
public final class C6748xae3949e8 extends jx3.a {
    public C6748xae3949e8() {
        j("Scene", 0);
        j("ExpoCount", 0);
        j("ClickCount", 0);
        j("PublishId", "");
        j("CCUserList", "");
    }

    @Override // jx3.a
    public int g() {
        return 24784;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(f("Scene") != null ? f("Scene").toString() : -1);
        stringBuffer.append(",");
        stringBuffer.append(f("ExpoCount"));
        stringBuffer.append(",");
        stringBuffer.append(f("ClickCount"));
        stringBuffer.append(",");
        stringBuffer.append(f("PublishId"));
        stringBuffer.append(",");
        stringBuffer.append(f("CCUserList"));
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(f("Scene") != null ? f("Scene").toString() : -1);
        stringBuffer.append("\r\nExpoCount:");
        stringBuffer.append(f("ExpoCount"));
        stringBuffer.append("\r\nClickCount:");
        stringBuffer.append(f("ClickCount"));
        stringBuffer.append("\r\nPublishId:");
        stringBuffer.append(f("PublishId"));
        stringBuffer.append("\r\nCCUserList:");
        stringBuffer.append(f("CCUserList"));
        return stringBuffer.toString();
    }

    /* renamed from: setCCUserList */
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6748xae3949e8 m43257x56a9696b(java.lang.String str) {
        j("CCUserList", b("CCUserList", str, true));
        return this;
    }

    /* renamed from: setClickCount */
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6748xae3949e8 m43258xec89d669(long j17) {
        j("ClickCount", java.lang.Long.valueOf(j17));
        return this;
    }

    /* renamed from: setExpoCount */
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6748xae3949e8 m43259x72563ffb(long j17) {
        j("ExpoCount", java.lang.Long.valueOf(j17));
        return this;
    }

    /* renamed from: setPublishId */
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6748xae3949e8 m43260xb206d048(java.lang.String str) {
        j("PublishId", b("PublishId", str, true));
        return this;
    }

    /* renamed from: setScene */
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6748xae3949e8 m43261x53aed94a(cm.d dVar) {
        j("Scene", dVar);
        return this;
    }
}
