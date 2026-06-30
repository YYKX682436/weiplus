package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class MomentsTogetherTailActionStruct extends jx3.a {
    public MomentsTogetherTailActionStruct() {
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

    public com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherTailActionStruct setCCUserList(java.lang.String str) {
        j("CCUserList", b("CCUserList", str, true));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherTailActionStruct setClickCount(long j17) {
        j("ClickCount", java.lang.Long.valueOf(j17));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherTailActionStruct setExpoCount(long j17) {
        j("ExpoCount", java.lang.Long.valueOf(j17));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherTailActionStruct setPublishId(java.lang.String str) {
        j("PublishId", b("PublishId", str, true));
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherTailActionStruct setScene(cm.d dVar) {
        j("Scene", dVar);
        return this;
    }
}
