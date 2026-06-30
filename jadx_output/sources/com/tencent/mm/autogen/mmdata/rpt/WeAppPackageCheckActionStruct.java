package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppPackageCheckActionStruct extends jx3.a {

    /* renamed from: l, reason: collision with root package name */
    public long f62328l;

    /* renamed from: d, reason: collision with root package name */
    public long f62320d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f62321e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f62322f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f62323g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62324h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62325i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62326j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62327k = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f62329m = 0;

    @Override // jx3.a
    public int g() {
        return 15401;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62320d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62321e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62322f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62323g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62324h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62325i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62326j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62327k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62328l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62329m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AllPackageSize:");
        stringBuffer.append(this.f62320d);
        stringBuffer.append("\r\nAllPackageClientStoragePercent:");
        stringBuffer.append(this.f62321e);
        stringBuffer.append("\r\nClientStorageFreePercent:");
        stringBuffer.append(this.f62322f);
        stringBuffer.append("\r\nAbtestStatus:");
        stringBuffer.append(this.f62323g);
        stringBuffer.append("\r\nWeappCountThatHasPackage:");
        stringBuffer.append(this.f62324h);
        stringBuffer.append("\r\nCostTime:");
        stringBuffer.append(this.f62325i);
        stringBuffer.append("\r\nStopByEnterForeground:");
        stringBuffer.append(this.f62326j);
        stringBuffer.append("\r\nPublibCount:");
        stringBuffer.append(this.f62327k);
        stringBuffer.append("\r\nJSCodeCacheSize:");
        stringBuffer.append(this.f62328l);
        stringBuffer.append("\r\nCostTimeInMs:");
        stringBuffer.append(this.f62329m);
        return stringBuffer.toString();
    }
}
