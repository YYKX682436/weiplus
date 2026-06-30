package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class StoryChatTopBarEntranceExposeStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60864d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f60865e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f60866f = 0;

    @Override // jx3.a
    public int g() {
        return 16656;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60864d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60865e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60866f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("UserName:");
        stringBuffer.append(this.f60864d);
        stringBuffer.append("\r\nPreviewEnterScene:");
        stringBuffer.append(this.f60865e);
        stringBuffer.append("\r\nHasUnreadStoryTips:");
        stringBuffer.append(this.f60866f);
        return stringBuffer.toString();
    }
}
