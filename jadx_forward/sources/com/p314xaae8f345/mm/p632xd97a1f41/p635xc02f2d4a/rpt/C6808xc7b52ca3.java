package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.PageFlowDetailStruct */
/* loaded from: classes13.dex */
public final class C6808xc7b52ca3 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f141356d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f141357e;

    /* renamed from: f, reason: collision with root package name */
    public long f141358f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f141359g;

    /* renamed from: h, reason: collision with root package name */
    public long f141360h;

    /* renamed from: i, reason: collision with root package name */
    public long f141361i;

    /* renamed from: j, reason: collision with root package name */
    public long f141362j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f141363k;

    /* renamed from: l, reason: collision with root package name */
    public long f141364l;

    public C6808xc7b52ca3() {
        this.f141356d = 0;
        this.f141357e = "";
        this.f141358f = 0L;
        this.f141359g = "";
        this.f141360h = 0L;
        this.f141361i = 0L;
        this.f141362j = 0L;
        this.f141364l = 0L;
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
        stringBuffer.append(this.f141356d);
        stringBuffer.append("\r\nPName:");
        stringBuffer.append(this.f141357e);
        stringBuffer.append("\r\nSeq:");
        stringBuffer.append(this.f141358f);
        stringBuffer.append("\r\nName:");
        stringBuffer.append(this.f141359g);
        stringBuffer.append("\r\nType:");
        stringBuffer.append(this.f141360h);
        stringBuffer.append("\r\nTimeStampMs:");
        stringBuffer.append(this.f141361i);
        stringBuffer.append("\r\nGreenManFg:");
        stringBuffer.append(this.f141362j);
        stringBuffer.append("\r\nQueueFgBool:");
        stringBuffer.append(this.f141363k);
        stringBuffer.append("\r\nHashCode:");
        stringBuffer.append(this.f141364l);
        return stringBuffer.toString();
    }

    public java.lang.String p(java.lang.String str) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141356d);
        stringBuffer.append(str);
        stringBuffer.append(this.f141357e);
        stringBuffer.append(str);
        stringBuffer.append(this.f141358f);
        stringBuffer.append(str);
        stringBuffer.append(this.f141359g);
        stringBuffer.append(str);
        stringBuffer.append(this.f141360h);
        stringBuffer.append(str);
        stringBuffer.append(this.f141361i);
        stringBuffer.append(str);
        stringBuffer.append(this.f141362j);
        stringBuffer.append(str);
        stringBuffer.append(this.f141363k ? 1 : 0);
        stringBuffer.append(str);
        stringBuffer.append(this.f141364l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    public C6808xc7b52ca3(java.lang.String str) {
        java.lang.String[] split;
        this.f141356d = 0;
        this.f141357e = "";
        this.f141358f = 0L;
        this.f141359g = "";
        this.f141360h = 0L;
        this.f141361i = 0L;
        this.f141362j = 0L;
        this.f141364l = 0L;
        if (str == null || (split = str.split(",")) == null) {
            return;
        }
        if (split.length < 9) {
            java.lang.String[] strArr = new java.lang.String[9];
            java.util.Arrays.fill(strArr, 0, 9, "");
            java.lang.System.arraycopy(split, 0, strArr, 0, split.length);
            split = strArr;
        }
        this.f141356d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[0], 0);
        this.f141357e = b("PName", split[1], true);
        this.f141358f = h(split[2]);
        this.f141359g = b("Name", split[3], true);
        this.f141360h = h(split[4]);
        this.f141361i = h(split[5]);
        this.f141362j = h(split[6]);
        this.f141363k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[7], 0) != 0;
        this.f141364l = h(split[8]);
    }
}
