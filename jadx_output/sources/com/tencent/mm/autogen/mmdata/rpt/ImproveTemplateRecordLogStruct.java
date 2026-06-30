package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class ImproveTemplateRecordLogStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f58491d;

    /* renamed from: e, reason: collision with root package name */
    public int f58492e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f58493f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f58494g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f58495h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f58496i = "";

    /* renamed from: j, reason: collision with root package name */
    public int f58497j;

    @Override // jx3.a
    public int g() {
        return 29070;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58491d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58492e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58493f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58494g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58495h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58496i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58497j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f58491d);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f58492e);
        stringBuffer.append("\r\nTemplateId:");
        stringBuffer.append(this.f58493f);
        stringBuffer.append("\r\nFollowTemplateId:");
        stringBuffer.append(this.f58494g);
        stringBuffer.append("\r\nMusicId:");
        stringBuffer.append(this.f58495h);
        stringBuffer.append("\r\nFollowMusicId:");
        stringBuffer.append(this.f58496i);
        stringBuffer.append("\r\nTemplatePosition:");
        stringBuffer.append(this.f58497j);
        return stringBuffer.toString();
    }
}
