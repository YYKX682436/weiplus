package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.OpenImMigrateStruct */
/* loaded from: classes5.dex */
public final class C6804x4b1d7ad2 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f141336d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f141337e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f141338f;

    @Override // jx3.a
    public int g() {
        return 20246;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141336d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141337e);
        stringBuffer.append(",");
        stringBuffer.append(this.f141338f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomID:");
        stringBuffer.append(this.f141336d);
        stringBuffer.append("\r\noldRoomID:");
        stringBuffer.append(this.f141337e);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f141338f);
        return stringBuffer.toString();
    }
}
