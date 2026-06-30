package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes13.dex */
public final class MMKVPageFlowStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58843d;

    /* renamed from: e, reason: collision with root package name */
    public long f58844e;

    /* renamed from: f, reason: collision with root package name */
    public long f58845f;

    /* renamed from: g, reason: collision with root package name */
    public long f58846g;

    public MMKVPageFlowStruct() {
        this.f58843d = "";
        this.f58844e = 0L;
        this.f58845f = 0L;
        this.f58846g = 0L;
    }

    @Override // jx3.a
    public int g() {
        return 0;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58843d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58844e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58845f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58846g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Name:");
        stringBuffer.append(this.f58843d);
        stringBuffer.append("\r\nType:");
        stringBuffer.append(this.f58844e);
        stringBuffer.append("\r\nTimeStampMs:");
        stringBuffer.append(this.f58845f);
        stringBuffer.append("\r\nHashCode:");
        stringBuffer.append(this.f58846g);
        return stringBuffer.toString();
    }

    public MMKVPageFlowStruct(java.lang.String str) {
        java.lang.String[] split;
        this.f58843d = "";
        this.f58844e = 0L;
        this.f58845f = 0L;
        this.f58846g = 0L;
        if (str == null || (split = str.split(",")) == null) {
            return;
        }
        if (split.length < 4) {
            java.lang.String[] strArr = new java.lang.String[4];
            java.util.Arrays.fill(strArr, 0, 4, "");
            java.lang.System.arraycopy(split, 0, strArr, 0, split.length);
            split = strArr;
        }
        this.f58843d = b("Name", split[0], true);
        this.f58844e = h(split[1]);
        this.f58845f = h(split[2]);
        this.f58846g = h(split[3]);
    }
}
