package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class HbSessionReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58416d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f58417e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f58418f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f58419g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f58420h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f58421i = 0;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f58422j = "";

    /* renamed from: k, reason: collision with root package name */
    public long f58423k = 0;

    @Override // jx3.a
    public int g() {
        return 16724;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58416d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58417e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58418f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58419g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58420h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58421i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58422j);
        stringBuffer.append(",");
        stringBuffer.append(this.f58423k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionType:");
        stringBuffer.append(this.f58416d);
        stringBuffer.append("\r\nContent:");
        stringBuffer.append(this.f58417e);
        stringBuffer.append("\r\nChangeAmountTimes:");
        stringBuffer.append(this.f58418f);
        stringBuffer.append("\r\nAddSelfieEmoticonTimes:");
        stringBuffer.append(this.f58419g);
        stringBuffer.append("\r\nAddCustonEmoticonTimes:");
        stringBuffer.append(this.f58420h);
        stringBuffer.append("\r\nAddSelfieEmoticonFormBoardTimes:");
        stringBuffer.append(this.f58421i);
        stringBuffer.append("\r\nEmoticonMd5:");
        stringBuffer.append(this.f58422j);
        stringBuffer.append("\r\nAddShopEmoticonTimes:");
        stringBuffer.append(this.f58423k);
        return stringBuffer.toString();
    }
}
