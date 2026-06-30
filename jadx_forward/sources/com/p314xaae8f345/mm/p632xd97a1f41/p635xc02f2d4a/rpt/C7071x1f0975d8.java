package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct */
/* loaded from: classes7.dex */
public final class C7071x1f0975d8 extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public cm.f f143792f;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143790d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f143791e = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f143793g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f143794h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f143795i = "";

    /* renamed from: j, reason: collision with root package name */
    public long f143796j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f143797k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f143798l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f143799m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f143800n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f143801o = 0;

    @Override // jx3.a
    public int g() {
        return 17687;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143790d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143791e);
        stringBuffer.append(",");
        cm.f fVar = this.f143792f;
        stringBuffer.append(fVar != null ? fVar.f124608d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f143793g);
        stringBuffer.append(",");
        stringBuffer.append(this.f143794h);
        stringBuffer.append(",");
        stringBuffer.append(this.f143795i);
        stringBuffer.append(",");
        stringBuffer.append(this.f143796j);
        stringBuffer.append(",");
        stringBuffer.append(this.f143797k);
        stringBuffer.append(",");
        stringBuffer.append(this.f143798l);
        stringBuffer.append(",");
        stringBuffer.append(this.f143799m);
        stringBuffer.append(",");
        stringBuffer.append(this.f143800n);
        stringBuffer.append(",");
        stringBuffer.append(this.f143801o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f143790d);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f143791e);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f143792f);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f143793g);
        stringBuffer.append("\r\nFileOccupation:");
        stringBuffer.append(this.f143794h);
        stringBuffer.append("\r\nDirPrefix:");
        stringBuffer.append(this.f143795i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f143796j);
        stringBuffer.append("\r\nTotalFileOccupation:");
        stringBuffer.append(this.f143797k);
        stringBuffer.append("\r\nTriggerSingleAppClean:");
        stringBuffer.append(this.f143798l);
        stringBuffer.append("\r\nTriggerAllAppClean:");
        stringBuffer.append(this.f143799m);
        stringBuffer.append("\r\nRuntimeFileOccupation:");
        stringBuffer.append(this.f143800n);
        stringBuffer.append("\r\nRuntimeSpaceStaticsEnable:");
        stringBuffer.append(this.f143801o);
        return stringBuffer.toString();
    }
}
