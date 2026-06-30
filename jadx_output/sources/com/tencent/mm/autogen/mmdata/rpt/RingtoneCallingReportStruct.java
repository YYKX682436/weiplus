package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes14.dex */
public final class RingtoneCallingReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60052d;

    /* renamed from: e, reason: collision with root package name */
    public int f60053e;

    /* renamed from: f, reason: collision with root package name */
    public long f60054f;

    /* renamed from: h, reason: collision with root package name */
    public long f60056h;

    /* renamed from: i, reason: collision with root package name */
    public long f60057i;

    /* renamed from: k, reason: collision with root package name */
    public long f60059k;

    /* renamed from: l, reason: collision with root package name */
    public long f60060l;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f60055g = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f60058j = "";

    @Override // jx3.a
    public int g() {
        return 23653;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60052d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60053e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60054f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60055g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60056h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60057i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60058j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60059k);
        stringBuffer.append(",");
        stringBuffer.append(this.f60060l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("type:");
        stringBuffer.append(this.f60052d);
        stringBuffer.append("\r\nroomId:");
        stringBuffer.append(this.f60053e);
        stringBuffer.append("\r\nroomKey:");
        stringBuffer.append(this.f60054f);
        stringBuffer.append("\r\nfeedId:");
        stringBuffer.append(this.f60055g);
        stringBuffer.append("\r\nfeedType:");
        stringBuffer.append(this.f60056h);
        stringBuffer.append("\r\nisIndividual:");
        stringBuffer.append(this.f60057i);
        stringBuffer.append("\r\ntoUserName:");
        stringBuffer.append(this.f60058j);
        stringBuffer.append("\r\nlogoClick:");
        stringBuffer.append(this.f60059k);
        stringBuffer.append("\r\nplayDuration:");
        stringBuffer.append(this.f60060l);
        return stringBuffer.toString();
    }
}
