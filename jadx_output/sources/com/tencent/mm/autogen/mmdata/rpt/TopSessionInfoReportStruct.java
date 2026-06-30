package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class TopSessionInfoReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61316d;

    /* renamed from: e, reason: collision with root package name */
    public long f61317e;

    /* renamed from: f, reason: collision with root package name */
    public long f61318f;

    /* renamed from: g, reason: collision with root package name */
    public long f61319g;

    /* renamed from: h, reason: collision with root package name */
    public long f61320h;

    /* renamed from: i, reason: collision with root package name */
    public long f61321i;

    /* renamed from: j, reason: collision with root package name */
    public long f61322j;

    /* renamed from: k, reason: collision with root package name */
    public long f61323k;

    /* renamed from: l, reason: collision with root package name */
    public long f61324l;

    @Override // jx3.a
    public int g() {
        return 23512;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61316d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61317e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61318f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61319g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61320h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61321i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61322j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61323k);
        stringBuffer.append(",");
        stringBuffer.append(this.f61324l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SingleCount:");
        stringBuffer.append(this.f61316d);
        stringBuffer.append("\r\nGroupCount:");
        stringBuffer.append(this.f61317e);
        stringBuffer.append("\r\nServiceCount:");
        stringBuffer.append(this.f61318f);
        stringBuffer.append("\r\nRedChatTopCount:");
        stringBuffer.append(this.f61319g);
        stringBuffer.append("\r\nRedChatNoTopCount:");
        stringBuffer.append(this.f61320h);
        stringBuffer.append("\r\nOneScreenCount:");
        stringBuffer.append(this.f61321i);
        stringBuffer.append("\r\nLimitRate:");
        stringBuffer.append(this.f61322j);
        stringBuffer.append("\r\nSelfCount:");
        stringBuffer.append(this.f61323k);
        stringBuffer.append("\r\nFileHelperCount:");
        stringBuffer.append(this.f61324l);
        return stringBuffer.toString();
    }
}
