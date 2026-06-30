package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderRecordProfileReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f57679d;

    /* renamed from: e, reason: collision with root package name */
    public long f57680e;

    /* renamed from: f, reason: collision with root package name */
    public int f57681f;

    /* renamed from: g, reason: collision with root package name */
    public long f57682g;

    /* renamed from: h, reason: collision with root package name */
    public long f57683h;

    /* renamed from: i, reason: collision with root package name */
    public long f57684i;

    /* renamed from: j, reason: collision with root package name */
    public long f57685j;

    /* renamed from: k, reason: collision with root package name */
    public long f57686k;

    /* renamed from: l, reason: collision with root package name */
    public long f57687l;

    /* renamed from: m, reason: collision with root package name */
    public long f57688m;

    /* renamed from: n, reason: collision with root package name */
    public int f57689n;

    @Override // jx3.a
    public int g() {
        return 23312;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57679d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57680e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57681f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57682g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57683h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57684i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57685j);
        stringBuffer.append(",");
        stringBuffer.append(this.f57686k);
        stringBuffer.append(",");
        stringBuffer.append(this.f57687l);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f57688m);
        stringBuffer.append(",");
        stringBuffer.append(this.f57689n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OpenCameraCost:");
        stringBuffer.append(this.f57679d);
        stringBuffer.append("\r\nFirstFrameCost:");
        stringBuffer.append(this.f57680e);
        stringBuffer.append("\r\nIsCamera2:");
        stringBuffer.append(this.f57681f);
        stringBuffer.append("\r\nCreateRecorderCost:");
        stringBuffer.append(this.f57682g);
        stringBuffer.append("\r\nStopRecorderCost:");
        stringBuffer.append(this.f57683h);
        stringBuffer.append("\r\nRenderFps:");
        stringBuffer.append(this.f57684i);
        stringBuffer.append("\r\nRenderFrameCost:");
        stringBuffer.append(this.f57685j);
        stringBuffer.append("\r\nEffectInitCost:");
        stringBuffer.append(this.f57686k);
        stringBuffer.append("\r\nEffectTrackCost:");
        stringBuffer.append(this.f57687l);
        stringBuffer.append("\r\nEffectRenderCost:0\r\nEffectErrCode:");
        stringBuffer.append(this.f57688m);
        stringBuffer.append("\r\nNextStep:");
        stringBuffer.append(this.f57689n);
        return stringBuffer.toString();
    }
}
