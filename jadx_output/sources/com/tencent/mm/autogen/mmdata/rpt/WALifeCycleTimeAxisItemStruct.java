package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WALifeCycleTimeAxisItemStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f61961f;

    /* renamed from: h, reason: collision with root package name */
    public long f61963h;

    /* renamed from: j, reason: collision with root package name */
    public long f61965j;

    /* renamed from: k, reason: collision with root package name */
    public long f61966k;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61959d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f61960e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f61962g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f61964i = "";

    @Override // jx3.a
    public int g() {
        return 19175;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61959d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61960e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61961f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61962g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61963h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61964i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61965j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61966k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f61959d);
        stringBuffer.append("\r\nAppid:");
        stringBuffer.append(this.f61960e);
        stringBuffer.append("\r\nTimeStampInMs:");
        stringBuffer.append(this.f61961f);
        stringBuffer.append("\r\nEventName:");
        stringBuffer.append(this.f61962g);
        stringBuffer.append("\r\nEventType:");
        stringBuffer.append(this.f61963h);
        stringBuffer.append("\r\nParent:");
        stringBuffer.append(this.f61964i);
        stringBuffer.append("\r\nCategory:");
        stringBuffer.append(this.f61965j);
        stringBuffer.append("\r\nOption:");
        stringBuffer.append(this.f61966k);
        return stringBuffer.toString();
    }
}
