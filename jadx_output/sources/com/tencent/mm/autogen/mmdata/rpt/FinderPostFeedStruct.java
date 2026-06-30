package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class FinderPostFeedStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f57521d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f57522e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f57523f = "";

    @Override // jx3.a
    public int g() {
        return 19086;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f57521d);
        stringBuffer.append(",0,0,0,0,0,");
        stringBuffer.append(this.f57522e);
        stringBuffer.append(",0,0,0,0,");
        stringBuffer.append(this.f57523f);
        stringBuffer.append(",0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:0\r\nSessionId:");
        stringBuffer.append(this.f57521d);
        stringBuffer.append("\r\nFeedId:0\r\nVideoSource:0\r\nPostTime:0\r\nVideoZip:0\r\nCdnUploadTime:0\r\nMediaInfo:");
        stringBuffer.append(this.f57522e);
        stringBuffer.append("\r\nPostStatus:0\r\nRemuxTime:0\r\nInnerVersion:0\r\nCdnUploadRetCode:0\r\nNetType:");
        stringBuffer.append(this.f57523f);
        stringBuffer.append("\r\nRetryCount:0\r\nUploadSpeed:0");
        return stringBuffer.toString();
    }
}
