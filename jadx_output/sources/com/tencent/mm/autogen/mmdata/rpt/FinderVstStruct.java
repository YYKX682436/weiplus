package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderVstStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public long f58084g;

    /* renamed from: i, reason: collision with root package name */
    public long f58086i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58081d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f58082e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f58083f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f58085h = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f58087j = "";

    @Override // jx3.a
    public int g() {
        return 23898;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58081d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58082e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58083f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58084g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58085h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58086i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58087j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f58081d);
        stringBuffer.append("\r\ncontextid:");
        stringBuffer.append(this.f58082e);
        stringBuffer.append("\r\nevent_id:");
        stringBuffer.append(this.f58083f);
        stringBuffer.append("\r\nevent_time:");
        stringBuffer.append(this.f58084g);
        stringBuffer.append("\r\nvst_type:");
        stringBuffer.append(this.f58085h);
        stringBuffer.append("\r\nduration:");
        stringBuffer.append(this.f58086i);
        stringBuffer.append("\r\nudf_kv:");
        stringBuffer.append(this.f58087j);
        return stringBuffer.toString();
    }
}
