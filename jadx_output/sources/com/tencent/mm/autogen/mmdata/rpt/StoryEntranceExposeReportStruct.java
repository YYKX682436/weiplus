package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class StoryEntranceExposeReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f60910d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f60911e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f60912f = "";

    @Override // jx3.a
    public int g() {
        return 16887;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60910d);
        stringBuffer.append(",0,0,0,0,");
        stringBuffer.append(this.f60911e);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f60912f);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f60910d);
        stringBuffer.append("\r\nExposeViewId:0\r\nExposeOrder:0\r\nExposeNewUinCount:0\r\nExposeNewFavorUinCount:0\r\nExposeNewUinList:");
        stringBuffer.append(this.f60911e);
        stringBuffer.append("\r\nExposeBeforeUinCount:0\r\nExposeBeforeFavorUinCount:0\r\nExposeBeforeUinList:");
        stringBuffer.append(this.f60912f);
        stringBuffer.append("\r\nInteractiveUserCount:0");
        return stringBuffer.toString();
    }
}
