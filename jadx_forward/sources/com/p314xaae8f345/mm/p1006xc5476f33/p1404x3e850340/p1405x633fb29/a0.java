package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29;

/* loaded from: classes14.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public int f181519a;

    /* renamed from: b, reason: collision with root package name */
    public long f181520b;

    /* renamed from: c, reason: collision with root package name */
    public long f181521c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f181522d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f181523e;

    /* renamed from: f, reason: collision with root package name */
    public long f181524f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f181525g;

    public a0(int i17, java.lang.String str) {
        this.f181519a = i17;
        if (i17 == 0) {
            this.f181520b = 30L;
            this.f181521c = 7000L;
            this.f181522d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jin);
            this.f181523e = true;
            this.f181524f = 2500L;
            this.f181525g = false;
            return;
        }
        if (i17 == 1) {
            this.f181520b = 30L;
            this.f181521c = 7000L;
            this.f181522d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c6v);
            this.f181523e = false;
            this.f181524f = -1L;
            this.f181525g = true;
            return;
        }
        if (i17 == 2) {
            this.f181520b = 30L;
            this.f181521c = 7000L;
            this.f181522d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c6w);
            this.f181523e = false;
            this.f181524f = -1L;
            this.f181525g = true;
            return;
        }
        if (i17 == 3) {
            this.f181520b = 30L;
            this.f181521c = 7000L;
            this.f181522d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c6u);
            this.f181523e = true;
            this.f181524f = -1L;
            this.f181525g = true;
            return;
        }
        if (i17 != 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectProcessModel", "hy: unknown type");
            this.f181519a = 100;
            return;
        }
        this.f181520b = 30L;
        this.f181521c = 7000L;
        this.f181522d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c6x);
        this.f181523e = true;
        this.f181524f = 1000L;
        this.f181525g = true;
    }

    /* renamed from: toString */
    public java.lang.String m55233x9616526c() {
        return "FaceProcessItem{type=" + this.f181519a + ", frameTween=" + this.f181520b + ", hintTween=" + this.f181521c + ", hintStr='" + this.f181522d + "', isCheckFace=" + this.f181523e + ", minSuccTime=" + this.f181524f + ", actionData='null'}";
    }
}
