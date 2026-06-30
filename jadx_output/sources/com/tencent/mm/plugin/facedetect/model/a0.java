package com.tencent.mm.plugin.facedetect.model;

/* loaded from: classes14.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public int f99986a;

    /* renamed from: b, reason: collision with root package name */
    public long f99987b;

    /* renamed from: c, reason: collision with root package name */
    public long f99988c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f99989d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f99990e;

    /* renamed from: f, reason: collision with root package name */
    public long f99991f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f99992g;

    public a0(int i17, java.lang.String str) {
        this.f99986a = i17;
        if (i17 == 0) {
            this.f99987b = 30L;
            this.f99988c = 7000L;
            this.f99989d = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jin);
            this.f99990e = true;
            this.f99991f = 2500L;
            this.f99992g = false;
            return;
        }
        if (i17 == 1) {
            this.f99987b = 30L;
            this.f99988c = 7000L;
            this.f99989d = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.c6v);
            this.f99990e = false;
            this.f99991f = -1L;
            this.f99992g = true;
            return;
        }
        if (i17 == 2) {
            this.f99987b = 30L;
            this.f99988c = 7000L;
            this.f99989d = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.c6w);
            this.f99990e = false;
            this.f99991f = -1L;
            this.f99992g = true;
            return;
        }
        if (i17 == 3) {
            this.f99987b = 30L;
            this.f99988c = 7000L;
            this.f99989d = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.c6u);
            this.f99990e = true;
            this.f99991f = -1L;
            this.f99992g = true;
            return;
        }
        if (i17 != 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectProcessModel", "hy: unknown type");
            this.f99986a = 100;
            return;
        }
        this.f99987b = 30L;
        this.f99988c = 7000L;
        this.f99989d = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.c6x);
        this.f99990e = true;
        this.f99991f = 1000L;
        this.f99992g = true;
    }

    public java.lang.String toString() {
        return "FaceProcessItem{type=" + this.f99986a + ", frameTween=" + this.f99987b + ", hintTween=" + this.f99988c + ", hintStr='" + this.f99989d + "', isCheckFace=" + this.f99990e + ", minSuccTime=" + this.f99991f + ", actionData='null'}";
    }
}
