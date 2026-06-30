package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.StoryEntranceExposeReportStruct */
/* loaded from: classes.dex */
public final class C6931x240fd218 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f142443d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f142444e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f142445f = "";

    @Override // jx3.a
    public int g() {
        return 16887;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142443d);
        stringBuffer.append(",0,0,0,0,");
        stringBuffer.append(this.f142444e);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f142445f);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f142443d);
        stringBuffer.append("\r\nExposeViewId:0\r\nExposeOrder:0\r\nExposeNewUinCount:0\r\nExposeNewFavorUinCount:0\r\nExposeNewUinList:");
        stringBuffer.append(this.f142444e);
        stringBuffer.append("\r\nExposeBeforeUinCount:0\r\nExposeBeforeFavorUinCount:0\r\nExposeBeforeUinList:");
        stringBuffer.append(this.f142445f);
        stringBuffer.append("\r\nInteractiveUserCount:0");
        return stringBuffer.toString();
    }
}
