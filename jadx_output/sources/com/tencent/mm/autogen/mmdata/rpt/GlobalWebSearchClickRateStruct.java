package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class GlobalWebSearchClickRateStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58367d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f58368e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f58369f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f58370g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f58371h = 0;

    @Override // jx3.a
    public int g() {
        return 12639;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58367d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58368e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58369f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58370g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58371h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Query:");
        stringBuffer.append(this.f58367d);
        stringBuffer.append("\r\nHasWebSearchEntryShown:");
        stringBuffer.append(this.f58368e);
        stringBuffer.append("\r\nClickType:");
        stringBuffer.append(this.f58369f);
        stringBuffer.append("\r\nStyle:");
        stringBuffer.append(this.f58370g);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f58371h);
        return stringBuffer.toString();
    }
}
