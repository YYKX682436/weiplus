package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AiWeixinGpsInfoStruct */
/* loaded from: classes8.dex */
public final class C6295xdee69c3 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f136560d;

    /* renamed from: e, reason: collision with root package name */
    public long f136561e;

    /* renamed from: f, reason: collision with root package name */
    public long f136562f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f136563g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f136564h;

    public C6295xdee69c3() {
        this.f136560d = 0L;
        this.f136561e = 0L;
        this.f136562f = 0L;
        this.f136563g = "";
        this.f136564h = "";
    }

    @Override // jx3.a
    public int g() {
        return 0;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136560d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136561e);
        stringBuffer.append(",");
        stringBuffer.append(this.f136562f);
        stringBuffer.append(",");
        stringBuffer.append(this.f136563g);
        stringBuffer.append(",");
        stringBuffer.append(this.f136564h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("lastGpsScene:");
        stringBuffer.append(this.f136560d);
        stringBuffer.append("\r\nlastGpsTimeMs:");
        stringBuffer.append(this.f136561e);
        stringBuffer.append("\r\nlastPre:");
        stringBuffer.append(this.f136562f);
        stringBuffer.append("\r\nlongitude:");
        stringBuffer.append(this.f136563g);
        stringBuffer.append("\r\nlatitude:");
        stringBuffer.append(this.f136564h);
        return stringBuffer.toString();
    }

    public C6295xdee69c3(java.lang.String str) {
        java.lang.String[] split;
        this.f136560d = 0L;
        this.f136561e = 0L;
        this.f136562f = 0L;
        this.f136563g = "";
        this.f136564h = "";
        if (str == null || (split = str.split(",")) == null) {
            return;
        }
        if (split.length < 5) {
            java.lang.String[] strArr = new java.lang.String[5];
            java.util.Arrays.fill(strArr, 0, 5, "");
            java.lang.System.arraycopy(split, 0, strArr, 0, split.length);
            split = strArr;
        }
        this.f136560d = h(split[0]);
        this.f136561e = h(split[1]);
        this.f136562f = h(split[2]);
        this.f136563g = b("longitude", split[3], true);
        this.f136564h = b("latitude", split[4], true);
    }
}
