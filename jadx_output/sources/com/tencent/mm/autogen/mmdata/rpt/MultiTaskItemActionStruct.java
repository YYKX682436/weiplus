package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class MultiTaskItemActionStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f59369e;

    /* renamed from: g, reason: collision with root package name */
    public long f59371g;

    /* renamed from: h, reason: collision with root package name */
    public long f59372h;

    /* renamed from: i, reason: collision with root package name */
    public long f59373i;

    /* renamed from: k, reason: collision with root package name */
    public long f59375k;

    /* renamed from: l, reason: collision with root package name */
    public long f59376l;

    /* renamed from: m, reason: collision with root package name */
    public int f59377m;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59368d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59370f = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f59374j = "";

    @Override // jx3.a
    public int g() {
        return 21922;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59368d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59369e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59370f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59371g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59372h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59373i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59374j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59375k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59376l);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f59377m);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ContextId:");
        stringBuffer.append(this.f59368d);
        stringBuffer.append("\r\nItemType:");
        stringBuffer.append(this.f59369e);
        stringBuffer.append("\r\nItemId:");
        stringBuffer.append(this.f59370f);
        stringBuffer.append("\r\nPosition:");
        stringBuffer.append(this.f59371g);
        stringBuffer.append("\r\nExposeTimestamp:");
        stringBuffer.append(this.f59372h);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f59373i);
        stringBuffer.append("\r\nItemSubId:");
        stringBuffer.append(this.f59374j);
        stringBuffer.append("\r\nActualExposeTimestamp:");
        stringBuffer.append(this.f59375k);
        stringBuffer.append("\r\nAddTimestamp:");
        stringBuffer.append(this.f59376l);
        stringBuffer.append("\r\naliveTime:0\r\noperationPath:");
        stringBuffer.append(this.f59377m);
        stringBuffer.append("\r\naddType:0");
        return stringBuffer.toString();
    }
}
