package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class SnsBigPicClickRatioStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f60465d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f60466e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f60467f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f60468g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f60469h = "";

    @Override // jx3.a
    public int g() {
        return 11599;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,0,0,0,");
        stringBuffer.append(this.f60465d);
        stringBuffer.append(",0,0,0,0,0,0,0,");
        stringBuffer.append(this.f60466e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60467f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60468g);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f60469h);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PictureCount:0\r\nPictureClickedCount:0\r\nPictureFirstClickIndex:0\r\nNetworkType:0\r\nSnsItemId:0\r\nPublishid:");
        stringBuffer.append(this.f60465d);
        stringBuffer.append("\r\nLastMsgChatInterval:0\r\nTotalMsgCount:0\r\nPictureHistoryClickedCount:0\r\nPictureHistoryPostCount:0\r\nlikeCountSnapShot:0\r\ncommentCountSnapShot:0\r\nPictureDownloadCount:0\r\nPictureScanIndexArray:");
        stringBuffer.append(this.f60466e);
        stringBuffer.append("\r\nPictureScaleInIndexArray:");
        stringBuffer.append(this.f60467f);
        stringBuffer.append("\r\nPictureScaleOutIndexArray:");
        stringBuffer.append(this.f60468g);
        stringBuffer.append("\r\npreloadPicCnt:0\r\npreloadPicIndexArray:");
        stringBuffer.append(this.f60469h);
        stringBuffer.append("\r\nIsCollapsed:0");
        return stringBuffer.toString();
    }
}
