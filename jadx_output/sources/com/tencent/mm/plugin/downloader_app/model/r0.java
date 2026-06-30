package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes8.dex */
public class r0 extends m43.d {

    /* renamed from: c, reason: collision with root package name */
    public int f97314c;

    /* renamed from: d, reason: collision with root package name */
    public int f97315d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f97316e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f97318g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f97319h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f97320i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f97321j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f97322k;

    /* renamed from: m, reason: collision with root package name */
    public d02.c f97324m;

    /* renamed from: n, reason: collision with root package name */
    public c02.g f97325n;

    /* renamed from: o, reason: collision with root package name */
    public d02.b f97326o;

    /* renamed from: p, reason: collision with root package name */
    public int f97327p;

    /* renamed from: q, reason: collision with root package name */
    public int f97328q;

    /* renamed from: a, reason: collision with root package name */
    public boolean f97312a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f97313b = false;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f97317f = "";

    /* renamed from: l, reason: collision with root package name */
    public int f97323l = 0;

    public r0(int i17) {
        this.f97314c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.tencent.mm.plugin.downloader_app.model.r0)) {
            return false;
        }
        com.tencent.mm.plugin.downloader_app.model.r0 r0Var = (com.tencent.mm.plugin.downloader_app.model.r0) obj;
        if (com.tencent.mm.sdk.platformtools.t8.K0(r0Var.f97317f) || com.tencent.mm.sdk.platformtools.t8.K0(this.f97317f)) {
            return false;
        }
        return r0Var.f97317f.equals(this.f97317f);
    }

    public r0() {
    }
}
