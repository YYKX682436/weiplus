package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MMKVPageFlowStruct */
/* loaded from: classes13.dex */
public final class C6699x2e93e7d extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f140376d;

    /* renamed from: e, reason: collision with root package name */
    public long f140377e;

    /* renamed from: f, reason: collision with root package name */
    public long f140378f;

    /* renamed from: g, reason: collision with root package name */
    public long f140379g;

    public C6699x2e93e7d() {
        this.f140376d = "";
        this.f140377e = 0L;
        this.f140378f = 0L;
        this.f140379g = 0L;
    }

    @Override // jx3.a
    public int g() {
        return 0;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140376d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140377e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140378f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140379g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Name:");
        stringBuffer.append(this.f140376d);
        stringBuffer.append("\r\nType:");
        stringBuffer.append(this.f140377e);
        stringBuffer.append("\r\nTimeStampMs:");
        stringBuffer.append(this.f140378f);
        stringBuffer.append("\r\nHashCode:");
        stringBuffer.append(this.f140379g);
        return stringBuffer.toString();
    }

    public C6699x2e93e7d(java.lang.String str) {
        java.lang.String[] split;
        this.f140376d = "";
        this.f140377e = 0L;
        this.f140378f = 0L;
        this.f140379g = 0L;
        if (str == null || (split = str.split(",")) == null) {
            return;
        }
        if (split.length < 4) {
            java.lang.String[] strArr = new java.lang.String[4];
            java.util.Arrays.fill(strArr, 0, 4, "");
            java.lang.System.arraycopy(split, 0, strArr, 0, split.length);
            split = strArr;
        }
        this.f140376d = b("Name", split[0], true);
        this.f140377e = h(split[1]);
        this.f140378f = h(split[2]);
        this.f140379g = h(split[3]);
    }
}
