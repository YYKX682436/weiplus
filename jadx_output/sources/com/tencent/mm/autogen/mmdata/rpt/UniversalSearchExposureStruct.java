package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class UniversalSearchExposureStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f61458d = "";

    @Override // jx3.a
    public int g() {
        return 16050;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61458d);
        stringBuffer.append(",0,0,0,0,0,0,0,0,0,0,0,0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Keyword:");
        stringBuffer.append(this.f61458d);
        stringBuffer.append("\r\nActionType:0\r\nSearchScene:0\r\nHasShownTopHit:0\r\nHasShownBizContact:0\r\nHasShownWeApp:0\r\nHasShownGame:0\r\nHasShownMiniGame:0\r\nuniSearchId:0\r\nhasHitGroupChat:0\r\nhasHitChatRecord:0\r\nHasHitServiceWidget:0\r\ntimestampMs:0\r\nhasHitSearchBar:0");
        return stringBuffer.toString();
    }
}
