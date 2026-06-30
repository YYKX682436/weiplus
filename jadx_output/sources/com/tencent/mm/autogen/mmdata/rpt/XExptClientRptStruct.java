package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes14.dex */
public final class XExptClientRptStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f63067d;

    /* renamed from: e, reason: collision with root package name */
    public long f63068e;

    /* renamed from: f, reason: collision with root package name */
    public long f63069f;

    /* renamed from: g, reason: collision with root package name */
    public long f63070g;

    /* renamed from: h, reason: collision with root package name */
    public long f63071h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f63072i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f63073j;

    /* renamed from: k, reason: collision with root package name */
    public long f63074k;

    public XExptClientRptStruct() {
        this.f63067d = 0L;
        this.f63068e = 0L;
        this.f63069f = 0L;
        this.f63070g = 0L;
        this.f63071h = 0L;
        this.f63072i = "";
        this.f63073j = "";
    }

    @Override // jx3.a
    public int g() {
        return 15452;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f63067d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63068e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63069f);
        stringBuffer.append(",");
        stringBuffer.append(this.f63070g);
        stringBuffer.append(",");
        stringBuffer.append(this.f63071h);
        stringBuffer.append(",");
        stringBuffer.append(this.f63072i);
        stringBuffer.append(",");
        stringBuffer.append(this.f63073j);
        stringBuffer.append(",");
        stringBuffer.append(this.f63074k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ExptId:");
        stringBuffer.append(this.f63067d);
        stringBuffer.append("\r\nGroupId:");
        stringBuffer.append(this.f63068e);
        stringBuffer.append("\r\nExptSeq:");
        stringBuffer.append(this.f63069f);
        stringBuffer.append("\r\nStartTimeStampSec:");
        stringBuffer.append(this.f63070g);
        stringBuffer.append("\r\nEndTimeStampSec:");
        stringBuffer.append(this.f63071h);
        stringBuffer.append("\r\nExptKey:");
        stringBuffer.append(this.f63072i);
        stringBuffer.append("\r\nExptVal:");
        stringBuffer.append(this.f63073j);
        stringBuffer.append("\r\nBucketSrc:");
        stringBuffer.append(this.f63074k);
        return stringBuffer.toString();
    }

    public XExptClientRptStruct(java.lang.String str) {
        java.lang.String[] split;
        this.f63067d = 0L;
        this.f63068e = 0L;
        this.f63069f = 0L;
        this.f63070g = 0L;
        this.f63071h = 0L;
        this.f63072i = "";
        this.f63073j = "";
        if (str == null || (split = str.split(",")) == null) {
            return;
        }
        if (split.length < 8) {
            java.lang.String[] strArr = new java.lang.String[8];
            java.util.Arrays.fill(strArr, 0, 8, "");
            java.lang.System.arraycopy(split, 0, strArr, 0, split.length);
            split = strArr;
        }
        this.f63067d = h(split[0]);
        this.f63068e = h(split[1]);
        this.f63069f = h(split[2]);
        this.f63070g = h(split[3]);
        this.f63071h = h(split[4]);
        this.f63072i = b("ExptKey", split[5], true);
        this.f63073j = b("ExptVal", split[6], false);
        this.f63074k = h(split[7]);
    }
}
