package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes13.dex */
public final class PageFlowDetailStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f59823d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59824e;

    /* renamed from: f, reason: collision with root package name */
    public long f59825f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f59826g;

    /* renamed from: h, reason: collision with root package name */
    public long f59827h;

    /* renamed from: i, reason: collision with root package name */
    public long f59828i;

    /* renamed from: j, reason: collision with root package name */
    public long f59829j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f59830k;

    /* renamed from: l, reason: collision with root package name */
    public long f59831l;

    public PageFlowDetailStruct() {
        this.f59823d = 0;
        this.f59824e = "";
        this.f59825f = 0L;
        this.f59826g = "";
        this.f59827h = 0L;
        this.f59828i = 0L;
        this.f59829j = 0L;
        this.f59831l = 0L;
    }

    @Override // jx3.a
    public int g() {
        return 15885;
    }

    @Override // jx3.a
    public java.lang.String m() {
        return p(",");
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PID:");
        stringBuffer.append(this.f59823d);
        stringBuffer.append("\r\nPName:");
        stringBuffer.append(this.f59824e);
        stringBuffer.append("\r\nSeq:");
        stringBuffer.append(this.f59825f);
        stringBuffer.append("\r\nName:");
        stringBuffer.append(this.f59826g);
        stringBuffer.append("\r\nType:");
        stringBuffer.append(this.f59827h);
        stringBuffer.append("\r\nTimeStampMs:");
        stringBuffer.append(this.f59828i);
        stringBuffer.append("\r\nGreenManFg:");
        stringBuffer.append(this.f59829j);
        stringBuffer.append("\r\nQueueFgBool:");
        stringBuffer.append(this.f59830k);
        stringBuffer.append("\r\nHashCode:");
        stringBuffer.append(this.f59831l);
        return stringBuffer.toString();
    }

    public java.lang.String p(java.lang.String str) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59823d);
        stringBuffer.append(str);
        stringBuffer.append(this.f59824e);
        stringBuffer.append(str);
        stringBuffer.append(this.f59825f);
        stringBuffer.append(str);
        stringBuffer.append(this.f59826g);
        stringBuffer.append(str);
        stringBuffer.append(this.f59827h);
        stringBuffer.append(str);
        stringBuffer.append(this.f59828i);
        stringBuffer.append(str);
        stringBuffer.append(this.f59829j);
        stringBuffer.append(str);
        stringBuffer.append(this.f59830k ? 1 : 0);
        stringBuffer.append(str);
        stringBuffer.append(this.f59831l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    public PageFlowDetailStruct(java.lang.String str) {
        java.lang.String[] split;
        this.f59823d = 0;
        this.f59824e = "";
        this.f59825f = 0L;
        this.f59826g = "";
        this.f59827h = 0L;
        this.f59828i = 0L;
        this.f59829j = 0L;
        this.f59831l = 0L;
        if (str == null || (split = str.split(",")) == null) {
            return;
        }
        if (split.length < 9) {
            java.lang.String[] strArr = new java.lang.String[9];
            java.util.Arrays.fill(strArr, 0, 9, "");
            java.lang.System.arraycopy(split, 0, strArr, 0, split.length);
            split = strArr;
        }
        this.f59823d = com.tencent.mm.sdk.platformtools.t8.P(split[0], 0);
        this.f59824e = b("PName", split[1], true);
        this.f59825f = h(split[2]);
        this.f59826g = b("Name", split[3], true);
        this.f59827h = h(split[4]);
        this.f59828i = h(split[5]);
        this.f59829j = h(split[6]);
        this.f59830k = com.tencent.mm.sdk.platformtools.t8.P(split[7], 0) != 0;
        this.f59831l = h(split[8]);
    }
}
