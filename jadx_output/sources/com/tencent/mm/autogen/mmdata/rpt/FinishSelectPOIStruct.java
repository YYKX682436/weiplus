package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class FinishSelectPOIStruct extends jx3.a {

    /* renamed from: h, reason: collision with root package name */
    public long f58109h;

    /* renamed from: i, reason: collision with root package name */
    public long f58110i;

    /* renamed from: j, reason: collision with root package name */
    public long f58111j;

    /* renamed from: k, reason: collision with root package name */
    public long f58112k;

    /* renamed from: q, reason: collision with root package name */
    public long f58118q;

    /* renamed from: d, reason: collision with root package name */
    public long f58105d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f58106e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f58107f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f58108g = 0;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f58113l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f58114m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f58115n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f58116o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f58117p = "";

    @Override // jx3.a
    public int g() {
        return 17993;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58105d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58106e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58107f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58108g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58109h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58110i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58111j);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58112k);
        stringBuffer.append(",");
        stringBuffer.append(this.f58113l);
        stringBuffer.append(",");
        stringBuffer.append(this.f58114m);
        stringBuffer.append(",");
        stringBuffer.append(this.f58115n);
        stringBuffer.append(",");
        stringBuffer.append(this.f58116o);
        stringBuffer.append(",");
        stringBuffer.append(this.f58117p);
        stringBuffer.append(",");
        stringBuffer.append(this.f58118q);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FinishType:");
        stringBuffer.append(this.f58105d);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f58106e);
        stringBuffer.append("\r\nType:");
        stringBuffer.append(this.f58107f);
        stringBuffer.append("\r\nSelectPOIIndex:");
        stringBuffer.append(this.f58108g);
        stringBuffer.append("\r\nFloorWidgetShowCount:");
        stringBuffer.append(this.f58109h);
        stringBuffer.append("\r\nFloorWidgetClkCount:");
        stringBuffer.append(this.f58110i);
        stringBuffer.append("\r\nIsFinalPoiIndoor:");
        stringBuffer.append(this.f58111j);
        stringBuffer.append("\r\nIsFinalPoiIndoorSameFloorOfSender:0\r\nFinalPoiAndSenderDistanceRange:");
        stringBuffer.append(this.f58112k);
        stringBuffer.append("\r\nUserLocation:");
        stringBuffer.append(this.f58113l);
        stringBuffer.append("\r\nSessionID:");
        stringBuffer.append(this.f58114m);
        stringBuffer.append("\r\nChatName:");
        stringBuffer.append(this.f58115n);
        stringBuffer.append("\r\npoiid:");
        stringBuffer.append(this.f58116o);
        stringBuffer.append("\r\ncategory:");
        stringBuffer.append(this.f58117p);
        stringBuffer.append("\r\npoi_attr_type:");
        stringBuffer.append(this.f58118q);
        return stringBuffer.toString();
    }
}
