package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityAndroidMagicBrushCreateCostStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public cm.o f62369f;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62367d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62368e = "";

    /* renamed from: g, reason: collision with root package name */
    public long f62370g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62371h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62372i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62373j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62374k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f62375l = 0;

    @Override // jx3.a
    public int g() {
        return 17111;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62367d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62368e);
        stringBuffer.append(",");
        cm.o oVar = this.f62369f;
        stringBuffer.append(oVar != null ? oVar.f43163d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62370g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62371h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62372i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62373j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62374k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62375l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62367d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62368e);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62369f);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62370g);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f62371h);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62372i);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f62373j);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f62374k);
        stringBuffer.append("\r\nIsPreload:");
        stringBuffer.append(this.f62375l);
        return stringBuffer.toString();
    }
}
