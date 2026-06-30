package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class WCTopicSearchVCActionReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62186d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f62187e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f62188f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f62189g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62190h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f62191i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f62192j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f62193k = "";

    @Override // jx3.a
    public int g() {
        return 20996;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62186d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62187e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62188f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62189g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62190h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62191i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62192j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62193k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionType:");
        stringBuffer.append(this.f62186d);
        stringBuffer.append("\r\nDismissType:");
        stringBuffer.append(this.f62187e);
        stringBuffer.append("\r\nActionSourceType:");
        stringBuffer.append(this.f62188f);
        stringBuffer.append("\r\nEnterTimeStamp:");
        stringBuffer.append(this.f62189g);
        stringBuffer.append("\r\nEnterScene:");
        stringBuffer.append(this.f62190h);
        stringBuffer.append("\r\nEnterSceneId:");
        stringBuffer.append(this.f62191i);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f62192j);
        stringBuffer.append("\r\nQueryKey:");
        stringBuffer.append(this.f62193k);
        return stringBuffer.toString();
    }
}
