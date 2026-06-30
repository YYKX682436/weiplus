package com.tencent.maas.camerafun;

/* loaded from: classes5.dex */
public class MJAuditCaptureSettings {

    /* renamed from: a, reason: collision with root package name */
    public final rg.c f47810a;

    /* renamed from: b, reason: collision with root package name */
    public final double f47811b;

    /* renamed from: c, reason: collision with root package name */
    public final jg.c f47812c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f47813d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f47814e;

    public MJAuditCaptureSettings(rg.c cVar, double d17, jg.c cVar2, java.lang.String str, java.lang.String str2) {
        this.f47810a = cVar;
        this.f47811b = d17;
        this.f47812c = cVar2;
        this.f47813d = str;
        this.f47814e = str2;
    }

    public int getCaptureDimensionLevel() {
        return this.f47810a.f395149d;
    }

    public double getCaptureFrameInterval() {
        return this.f47811b;
    }

    public java.lang.String getOutputDirPath() {
        return this.f47813d;
    }

    public java.lang.String getOutputFilenameBase() {
        return this.f47814e;
    }

    public int getOutputType() {
        return this.f47812c.f299528d;
    }
}
