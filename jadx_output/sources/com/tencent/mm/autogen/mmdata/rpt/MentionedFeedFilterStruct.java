package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class MentionedFeedFilterStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f59173d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f59174e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f59175f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f59176g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f59177h = "";

    @Override // jx3.a
    public int g() {
        return 22657;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59173d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59174e);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f59175f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59176g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59177h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f59173d);
        stringBuffer.append("\r\nfindercontextid:");
        stringBuffer.append(this.f59174e);
        stringBuffer.append("\r\nevent_code:0\r\nevent_time:");
        stringBuffer.append(this.f59175f);
        stringBuffer.append("\r\neid:");
        stringBuffer.append(this.f59176g);
        stringBuffer.append("\r\nudf_kv:");
        stringBuffer.append(this.f59177h);
        return stringBuffer.toString();
    }
}
