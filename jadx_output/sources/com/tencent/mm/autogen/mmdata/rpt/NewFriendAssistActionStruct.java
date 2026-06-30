package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class NewFriendAssistActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59674d;

    /* renamed from: e, reason: collision with root package name */
    public long f59675e;

    /* renamed from: f, reason: collision with root package name */
    public long f59676f;

    /* renamed from: g, reason: collision with root package name */
    public long f59677g;

    /* renamed from: h, reason: collision with root package name */
    public long f59678h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f59679i = "";

    @Override // jx3.a
    public int g() {
        return 24723;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59674d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59675e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59676f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59677g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59678h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59679i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("type_:");
        stringBuffer.append(this.f59674d);
        stringBuffer.append("\r\nstatus_:");
        stringBuffer.append(this.f59675e);
        stringBuffer.append("\r\nis_expired_:");
        stringBuffer.append(this.f59676f);
        stringBuffer.append("\r\nsource_:");
        stringBuffer.append(this.f59677g);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f59678h);
        stringBuffer.append("\r\nusername:");
        stringBuffer.append(this.f59679i);
        return stringBuffer.toString();
    }
}
