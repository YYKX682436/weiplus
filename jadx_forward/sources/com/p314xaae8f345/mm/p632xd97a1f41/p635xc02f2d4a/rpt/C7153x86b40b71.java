package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.XExptClientRptStruct */
/* loaded from: classes14.dex */
public final class C7153x86b40b71 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f144600d;

    /* renamed from: e, reason: collision with root package name */
    public long f144601e;

    /* renamed from: f, reason: collision with root package name */
    public long f144602f;

    /* renamed from: g, reason: collision with root package name */
    public long f144603g;

    /* renamed from: h, reason: collision with root package name */
    public long f144604h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f144605i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f144606j;

    /* renamed from: k, reason: collision with root package name */
    public long f144607k;

    public C7153x86b40b71() {
        this.f144600d = 0L;
        this.f144601e = 0L;
        this.f144602f = 0L;
        this.f144603g = 0L;
        this.f144604h = 0L;
        this.f144605i = "";
        this.f144606j = "";
    }

    @Override // jx3.a
    public int g() {
        return 15452;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144600d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144601e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144602f);
        stringBuffer.append(",");
        stringBuffer.append(this.f144603g);
        stringBuffer.append(",");
        stringBuffer.append(this.f144604h);
        stringBuffer.append(",");
        stringBuffer.append(this.f144605i);
        stringBuffer.append(",");
        stringBuffer.append(this.f144606j);
        stringBuffer.append(",");
        stringBuffer.append(this.f144607k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ExptId:");
        stringBuffer.append(this.f144600d);
        stringBuffer.append("\r\nGroupId:");
        stringBuffer.append(this.f144601e);
        stringBuffer.append("\r\nExptSeq:");
        stringBuffer.append(this.f144602f);
        stringBuffer.append("\r\nStartTimeStampSec:");
        stringBuffer.append(this.f144603g);
        stringBuffer.append("\r\nEndTimeStampSec:");
        stringBuffer.append(this.f144604h);
        stringBuffer.append("\r\nExptKey:");
        stringBuffer.append(this.f144605i);
        stringBuffer.append("\r\nExptVal:");
        stringBuffer.append(this.f144606j);
        stringBuffer.append("\r\nBucketSrc:");
        stringBuffer.append(this.f144607k);
        return stringBuffer.toString();
    }

    public C7153x86b40b71(java.lang.String str) {
        java.lang.String[] split;
        this.f144600d = 0L;
        this.f144601e = 0L;
        this.f144602f = 0L;
        this.f144603g = 0L;
        this.f144604h = 0L;
        this.f144605i = "";
        this.f144606j = "";
        if (str == null || (split = str.split(",")) == null) {
            return;
        }
        if (split.length < 8) {
            java.lang.String[] strArr = new java.lang.String[8];
            java.util.Arrays.fill(strArr, 0, 8, "");
            java.lang.System.arraycopy(split, 0, strArr, 0, split.length);
            split = strArr;
        }
        this.f144600d = h(split[0]);
        this.f144601e = h(split[1]);
        this.f144602f = h(split[2]);
        this.f144603g = h(split[3]);
        this.f144604h = h(split[4]);
        this.f144605i = b("ExptKey", split[5], true);
        this.f144606j = b("ExptVal", split[6], false);
        this.f144607k = h(split[7]);
    }
}
