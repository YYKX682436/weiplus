package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class AiWeixinGpsInfoStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55027d;

    /* renamed from: e, reason: collision with root package name */
    public long f55028e;

    /* renamed from: f, reason: collision with root package name */
    public long f55029f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f55030g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f55031h;

    public AiWeixinGpsInfoStruct() {
        this.f55027d = 0L;
        this.f55028e = 0L;
        this.f55029f = 0L;
        this.f55030g = "";
        this.f55031h = "";
    }

    @Override // jx3.a
    public int g() {
        return 0;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55027d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55028e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55029f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55030g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55031h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("lastGpsScene:");
        stringBuffer.append(this.f55027d);
        stringBuffer.append("\r\nlastGpsTimeMs:");
        stringBuffer.append(this.f55028e);
        stringBuffer.append("\r\nlastPre:");
        stringBuffer.append(this.f55029f);
        stringBuffer.append("\r\nlongitude:");
        stringBuffer.append(this.f55030g);
        stringBuffer.append("\r\nlatitude:");
        stringBuffer.append(this.f55031h);
        return stringBuffer.toString();
    }

    public AiWeixinGpsInfoStruct(java.lang.String str) {
        java.lang.String[] split;
        this.f55027d = 0L;
        this.f55028e = 0L;
        this.f55029f = 0L;
        this.f55030g = "";
        this.f55031h = "";
        if (str == null || (split = str.split(",")) == null) {
            return;
        }
        if (split.length < 5) {
            java.lang.String[] strArr = new java.lang.String[5];
            java.util.Arrays.fill(strArr, 0, 5, "");
            java.lang.System.arraycopy(split, 0, strArr, 0, split.length);
            split = strArr;
        }
        this.f55027d = h(split[0]);
        this.f55028e = h(split[1]);
        this.f55029f = h(split[2]);
        this.f55030g = b("longitude", split[3], true);
        this.f55031h = b("latitude", split[4], true);
    }
}
