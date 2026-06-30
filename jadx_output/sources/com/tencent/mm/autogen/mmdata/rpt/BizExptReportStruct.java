package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class BizExptReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f55392d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f55393e = "";

    @Override // jx3.a
    public int g() {
        return 28651;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55392d);
        stringBuffer.append(",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,");
        stringBuffer.append(this.f55393e);
        stringBuffer.append(",0,0,0,0,0,0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f55392d);
        stringBuffer.append("\r\nType:0\r\nExptType:0\r\nEnterInPageCache:0\r\nBoxUnreadCount:0\r\nBoxHasRedDot:0\r\nListMsgCount:0\r\nFinderCardCntInTop5:0\r\nFinderCardCntInTop10:0\r\nAdCardCntInTop5:0\r\nAdCardCntInTop10:0\r\nValidExposedMsgCnt:0\r\nInvalidExposedMsgCnt:0\r\nExposedMsgMaxIndex:0\r\nReceiveMsgCntInBox:0\r\nSepLineType:0\r\nSepLineFirstExposeIndex:0\r\nClickRecoFlowUnfold:0\r\nSessionIdInt:0\r\nBizRecCardCntInTop5:0\r\nBizRecCardCntInTop10:0\r\nExtraData:");
        stringBuffer.append(this.f55393e);
        stringBuffer.append("\r\nExposedMsgMinIndex:0\r\nArticelClickCount:0\r\nEngineGroupExist:0\r\nFirstScreenMsgIndex:0\r\nNavNewMsgClickCnt:0\r\nMsgExpandMoreCnt:0\r\nIsDataEnd:0");
        return stringBuffer.toString();
    }
}
