package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppFileSystemTempFileLastOccupationStatStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public cm.f f62259f;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62257d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f62258e = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f62260g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62261h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f62262i = "";

    /* renamed from: j, reason: collision with root package name */
    public long f62263j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62264k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f62265l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f62266m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f62267n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f62268o = 0;

    @Override // jx3.a
    public int g() {
        return 17687;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62257d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62258e);
        stringBuffer.append(",");
        cm.f fVar = this.f62259f;
        stringBuffer.append(fVar != null ? fVar.f43075d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62260g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62261h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62262i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62263j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62264k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62265l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62266m);
        stringBuffer.append(",");
        stringBuffer.append(this.f62267n);
        stringBuffer.append(",");
        stringBuffer.append(this.f62268o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f62257d);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62258e);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62259f);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62260g);
        stringBuffer.append("\r\nFileOccupation:");
        stringBuffer.append(this.f62261h);
        stringBuffer.append("\r\nDirPrefix:");
        stringBuffer.append(this.f62262i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62263j);
        stringBuffer.append("\r\nTotalFileOccupation:");
        stringBuffer.append(this.f62264k);
        stringBuffer.append("\r\nTriggerSingleAppClean:");
        stringBuffer.append(this.f62265l);
        stringBuffer.append("\r\nTriggerAllAppClean:");
        stringBuffer.append(this.f62266m);
        stringBuffer.append("\r\nRuntimeFileOccupation:");
        stringBuffer.append(this.f62267n);
        stringBuffer.append("\r\nRuntimeSpaceStaticsEnable:");
        stringBuffer.append(this.f62268o);
        return stringBuffer.toString();
    }
}
