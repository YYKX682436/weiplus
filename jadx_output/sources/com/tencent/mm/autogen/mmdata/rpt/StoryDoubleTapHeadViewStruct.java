package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class StoryDoubleTapHeadViewStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60892d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f60893e = 0;

    @Override // jx3.a
    public int g() {
        return 16659;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,");
        stringBuffer.append(this.f60892d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60893e);
        stringBuffer.append(",0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("NetType:0\r\nPreviewEnterScene:0\r\nSourceUserName:");
        stringBuffer.append(this.f60892d);
        stringBuffer.append("\r\nSourceContactType:");
        stringBuffer.append(this.f60893e);
        stringBuffer.append("\r\nHasUnreadStoryTips:0\r\nHasEnterPreview:0");
        return stringBuffer.toString();
    }
}
