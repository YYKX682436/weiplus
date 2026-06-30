package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.StoryDoubleTapHeadViewStruct */
/* loaded from: classes4.dex */
public final class C6928x97fb96f7 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f142425d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f142426e = 0;

    @Override // jx3.a
    public int g() {
        return 16659;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,");
        stringBuffer.append(this.f142425d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142426e);
        stringBuffer.append(",0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("NetType:0\r\nPreviewEnterScene:0\r\nSourceUserName:");
        stringBuffer.append(this.f142425d);
        stringBuffer.append("\r\nSourceContactType:");
        stringBuffer.append(this.f142426e);
        stringBuffer.append("\r\nHasUnreadStoryTips:0\r\nHasEnterPreview:0");
        return stringBuffer.toString();
    }
}
