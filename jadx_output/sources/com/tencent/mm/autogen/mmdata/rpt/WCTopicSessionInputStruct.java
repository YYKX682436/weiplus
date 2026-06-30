package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes16.dex */
public final class WCTopicSessionInputStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62194d;

    /* renamed from: g, reason: collision with root package name */
    public long f62197g;

    /* renamed from: j, reason: collision with root package name */
    public long f62200j;

    /* renamed from: k, reason: collision with root package name */
    public long f62201k;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62195e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f62196f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f62198h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f62199i = "";

    @Override // jx3.a
    public int g() {
        return 21174;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62194d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62195e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62196f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62197g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62198h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62199i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62200j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62201k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EnterScene:");
        stringBuffer.append(this.f62194d);
        stringBuffer.append("\r\nEnterSceneId:");
        stringBuffer.append(this.f62195e);
        stringBuffer.append("\r\nRequestId:");
        stringBuffer.append(this.f62196f);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f62197g);
        stringBuffer.append("\r\nQueryKey:");
        stringBuffer.append(this.f62198h);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f62199i);
        stringBuffer.append("\r\nContentType:");
        stringBuffer.append(this.f62200j);
        stringBuffer.append("\r\nEventTimeStamp:");
        stringBuffer.append(this.f62201k);
        return stringBuffer.toString();
    }
}
