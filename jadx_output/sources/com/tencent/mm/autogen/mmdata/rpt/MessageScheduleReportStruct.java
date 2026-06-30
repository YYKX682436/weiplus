package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class MessageScheduleReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59193d;

    /* renamed from: e, reason: collision with root package name */
    public long f59194e;

    /* renamed from: f, reason: collision with root package name */
    public long f59195f;

    /* renamed from: g, reason: collision with root package name */
    public long f59196g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59197h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f59198i;

    /* renamed from: j, reason: collision with root package name */
    public long f59199j;

    @Override // jx3.a
    public int g() {
        return 26723;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59193d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59194e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59195f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59196g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59197h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59198i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59199j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f59193d);
        stringBuffer.append("\r\nChatType:");
        stringBuffer.append(this.f59194e);
        stringBuffer.append("\r\nalarm_time_recommended_type:");
        stringBuffer.append(this.f59195f);
        stringBuffer.append("\r\nalarm_time_final_recommended_type:");
        stringBuffer.append(this.f59196g);
        stringBuffer.append("\r\nchatname:");
        stringBuffer.append(this.f59197h);
        stringBuffer.append("\r\nalarm_time_recommended:");
        stringBuffer.append(this.f59198i);
        stringBuffer.append("\r\nalarm_time_final:");
        stringBuffer.append(this.f59199j);
        return stringBuffer.toString();
    }
}
