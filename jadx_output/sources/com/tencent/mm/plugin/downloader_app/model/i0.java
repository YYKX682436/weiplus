package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes14.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f97279a;

    /* renamed from: b, reason: collision with root package name */
    public long f97280b;

    /* renamed from: c, reason: collision with root package name */
    public int f97281c;

    /* renamed from: d, reason: collision with root package name */
    public long f97282d;

    /* renamed from: e, reason: collision with root package name */
    public int f97283e;

    public i0() {
        this.f97279a = "";
        this.f97280b = 0L;
        this.f97281c = 1;
        this.f97282d = 0L;
        this.f97283e = 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.tencent.mm.plugin.downloader_app.model.i0.class != obj.getClass()) {
            return false;
        }
        com.tencent.mm.plugin.downloader_app.model.i0 i0Var = (com.tencent.mm.plugin.downloader_app.model.i0) obj;
        return java.util.Objects.equals(this.f97279a, i0Var.f97279a) && this.f97280b == i0Var.f97280b && this.f97281c == i0Var.f97281c;
    }

    public int hashCode() {
        return java.util.Objects.hash(this.f97279a, java.lang.Long.valueOf(this.f97280b), java.lang.Integer.valueOf(this.f97281c));
    }

    public i0(java.lang.String str, long j17, int i17, long j18, int i18) {
        this.f97279a = str;
        this.f97280b = j17;
        this.f97281c = i17;
        this.f97282d = j18;
        this.f97283e = i18;
    }
}
