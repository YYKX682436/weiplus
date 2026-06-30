package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderPageEnterStatStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f57459f;

    /* renamed from: h, reason: collision with root package name */
    public long f57461h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57457d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57458e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57460g = "";

    @Override // jx3.a
    public int g() {
        return 29492;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57457d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57458e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57459f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57460g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57461h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ToPage:");
        stringBuffer.append(this.f57457d);
        stringBuffer.append("\r\nFromUI:");
        stringBuffer.append(this.f57458e);
        stringBuffer.append("\r\nfromCommentScene:");
        stringBuffer.append(this.f57459f);
        stringBuffer.append("\r\nContextId:");
        stringBuffer.append(this.f57460g);
        stringBuffer.append("\r\nInnerVersion:");
        stringBuffer.append(this.f57461h);
        return stringBuffer.toString();
    }
}
