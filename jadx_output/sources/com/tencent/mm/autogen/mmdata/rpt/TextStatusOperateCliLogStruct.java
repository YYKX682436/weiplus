package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class TextStatusOperateCliLogStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f61225e;

    /* renamed from: g, reason: collision with root package name */
    public long f61227g;

    /* renamed from: h, reason: collision with root package name */
    public long f61228h;

    /* renamed from: j, reason: collision with root package name */
    public long f61230j;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61224d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f61226f = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f61229i = "";

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f61231k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f61232l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f61233m = "";

    @Override // jx3.a
    public int g() {
        return 22208;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61224d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61225e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61226f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61227g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61228h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61229i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61230j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61231k);
        stringBuffer.append(",");
        stringBuffer.append(this.f61232l);
        stringBuffer.append(",");
        stringBuffer.append(this.f61233m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionID:");
        stringBuffer.append(this.f61224d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f61225e);
        stringBuffer.append("\r\nActionResult:");
        stringBuffer.append(this.f61226f);
        stringBuffer.append("\r\nActionTs:");
        stringBuffer.append(this.f61227g);
        stringBuffer.append("\r\nAllFriendsStatusEntranceStyle:");
        stringBuffer.append(this.f61228h);
        stringBuffer.append("\r\nToStatusID:");
        stringBuffer.append(this.f61229i);
        stringBuffer.append("\r\nReddotType:");
        stringBuffer.append(this.f61230j);
        stringBuffer.append("\r\nPostRecomIconID:");
        stringBuffer.append(this.f61231k);
        stringBuffer.append("\r\nSceneSessionID:");
        stringBuffer.append(this.f61232l);
        stringBuffer.append("\r\nPageID:");
        stringBuffer.append(this.f61233m);
        return stringBuffer.toString();
    }
}
