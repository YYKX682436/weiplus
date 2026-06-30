package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class TimelineTrashReEditStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61293d;

    /* renamed from: f, reason: collision with root package name */
    public long f61295f;

    /* renamed from: g, reason: collision with root package name */
    public long f61296g;

    /* renamed from: j, reason: collision with root package name */
    public long f61299j;

    /* renamed from: k, reason: collision with root package name */
    public long f61300k;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f61294e = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f61297h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f61298i = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f61301l = "";

    @Override // jx3.a
    public int g() {
        return 19750;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61293d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61294e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61295f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61296g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61297h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61298i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61299j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61300k);
        stringBuffer.append(",");
        stringBuffer.append(this.f61301l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionType:");
        stringBuffer.append(this.f61293d);
        stringBuffer.append("\r\nPublishId:");
        stringBuffer.append(this.f61294e);
        stringBuffer.append("\r\nLikeCnt:");
        stringBuffer.append(this.f61295f);
        stringBuffer.append("\r\nCommCnt:");
        stringBuffer.append(this.f61296g);
        stringBuffer.append("\r\nSessionid:");
        stringBuffer.append(this.f61297h);
        stringBuffer.append("\r\nActionTimeStamp:");
        stringBuffer.append(this.f61298i);
        stringBuffer.append("\r\nNextAction:");
        stringBuffer.append(this.f61299j);
        stringBuffer.append("\r\nExposeCnt:");
        stringBuffer.append(this.f61300k);
        stringBuffer.append("\r\nNextPublishId:");
        stringBuffer.append(this.f61301l);
        return stringBuffer.toString();
    }
}
