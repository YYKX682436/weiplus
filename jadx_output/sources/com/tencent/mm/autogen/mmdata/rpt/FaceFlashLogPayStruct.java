package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes14.dex */
public final class FaceFlashLogPayStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56202d;

    /* renamed from: e, reason: collision with root package name */
    public long f56203e;

    /* renamed from: f, reason: collision with root package name */
    public long f56204f;

    /* renamed from: g, reason: collision with root package name */
    public int f56205g;

    /* renamed from: h, reason: collision with root package name */
    public int f56206h;

    /* renamed from: i, reason: collision with root package name */
    public int f56207i;

    /* renamed from: j, reason: collision with root package name */
    public int f56208j;

    /* renamed from: k, reason: collision with root package name */
    public long f56209k;

    /* renamed from: l, reason: collision with root package name */
    public long f56210l;

    /* renamed from: m, reason: collision with root package name */
    public long f56211m;

    /* renamed from: p, reason: collision with root package name */
    public int f56214p;

    /* renamed from: q, reason: collision with root package name */
    public int f56215q;

    /* renamed from: r, reason: collision with root package name */
    public int f56216r;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f56212n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f56213o = "";

    /* renamed from: s, reason: collision with root package name */
    public int f56217s = -1;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f56218t = "";

    @Override // jx3.a
    public int g() {
        return 21131;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56202d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56203e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56204f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56205g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56206h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56207i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56208j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56209k);
        stringBuffer.append(",");
        stringBuffer.append(this.f56210l);
        stringBuffer.append(",");
        stringBuffer.append(this.f56211m);
        stringBuffer.append(",");
        stringBuffer.append(this.f56212n);
        stringBuffer.append(",");
        stringBuffer.append(this.f56213o);
        stringBuffer.append(",");
        stringBuffer.append(this.f56214p);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f56215q);
        stringBuffer.append(",");
        stringBuffer.append(this.f56216r);
        stringBuffer.append(",");
        stringBuffer.append(this.f56217s);
        stringBuffer.append(",");
        stringBuffer.append(this.f56218t);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ResultCode:");
        stringBuffer.append(this.f56202d);
        stringBuffer.append("\r\nAliveType:");
        stringBuffer.append(this.f56203e);
        stringBuffer.append("\r\nFinalState:");
        stringBuffer.append(this.f56204f);
        stringBuffer.append("\r\nPrepareCgiErrorCode:");
        stringBuffer.append(this.f56205g);
        stringBuffer.append("\r\nConfigCgiErrorCode:");
        stringBuffer.append(this.f56206h);
        stringBuffer.append("\r\nCdnErrorCode:");
        stringBuffer.append(this.f56207i);
        stringBuffer.append("\r\nVerifyCgiErrorCode:");
        stringBuffer.append(this.f56208j);
        stringBuffer.append("\r\nCdnCost:");
        stringBuffer.append(this.f56209k);
        stringBuffer.append("\r\nLivenessCost:");
        stringBuffer.append(this.f56210l);
        stringBuffer.append("\r\nResetCount:");
        stringBuffer.append(this.f56211m);
        stringBuffer.append("\r\nStateRecord:");
        stringBuffer.append(this.f56212n);
        stringBuffer.append("\r\nAndroidStateRecord:");
        stringBuffer.append(this.f56213o);
        stringBuffer.append("\r\nFaceReset:");
        stringBuffer.append(this.f56214p);
        stringBuffer.append("\r\nFaceInterrupt:0\r\nVoiceOverState:");
        stringBuffer.append(this.f56215q);
        stringBuffer.append("\r\nFaceRecogTime:");
        stringBuffer.append(this.f56216r);
        stringBuffer.append("\r\nErrorType:");
        stringBuffer.append(this.f56217s);
        stringBuffer.append("\r\nSerialId:");
        stringBuffer.append(this.f56218t);
        return stringBuffer.toString();
    }
}
