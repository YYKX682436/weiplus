package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class WCTopicSearchContentActionStruct extends jx3.a {

    /* renamed from: j, reason: collision with root package name */
    public long f62163j;

    /* renamed from: k, reason: collision with root package name */
    public long f62164k;

    /* renamed from: d, reason: collision with root package name */
    public long f62157d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f62158e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f62159f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f62160g = "";

    /* renamed from: h, reason: collision with root package name */
    public long f62161h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f62162i = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f62165l = "";

    /* renamed from: m, reason: collision with root package name */
    public int f62166m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f62167n = -1;

    @Override // jx3.a
    public int g() {
        return 20998;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62157d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62158e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62159f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62160g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62161h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62162i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62163j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62164k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62165l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62166m);
        stringBuffer.append(",");
        stringBuffer.append(this.f62167n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionType:");
        stringBuffer.append(this.f62157d);
        stringBuffer.append("\r\nActionTimeStamp:");
        stringBuffer.append(this.f62158e);
        stringBuffer.append("\r\nResultType:");
        stringBuffer.append(this.f62159f);
        stringBuffer.append("\r\nResultQuery:");
        stringBuffer.append(this.f62160g);
        stringBuffer.append("\r\nShareScene:");
        stringBuffer.append(this.f62161h);
        stringBuffer.append("\r\nShareSceneId:");
        stringBuffer.append(this.f62162i);
        stringBuffer.append("\r\nCreateTime:");
        stringBuffer.append(this.f62163j);
        stringBuffer.append("\r\nTimelineEnterSource:");
        stringBuffer.append(this.f62164k);
        stringBuffer.append("\r\nSearchSessionId:");
        stringBuffer.append(this.f62165l);
        stringBuffer.append("\r\nPageType:");
        stringBuffer.append(this.f62166m);
        stringBuffer.append("\r\nAccountType:");
        stringBuffer.append(this.f62167n);
        return stringBuffer.toString();
    }
}
