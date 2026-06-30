package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class EmoticonDesignerProfileIPExposeNewStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f56028d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f56029e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f56030f;

    @Override // jx3.a
    public int g() {
        return 27615;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56028d);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f56029e);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f56030f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f56028d);
        stringBuffer.append("\r\nifHasFinder:0\r\nipCnt:0\r\ndesUin:");
        stringBuffer.append(this.f56029e);
        stringBuffer.append("\r\nIPTabClick:0\r\nemotionTabClick:0\r\nemojiTabClick:");
        stringBuffer.append(this.f56030f);
        return stringBuffer.toString();
    }
}
