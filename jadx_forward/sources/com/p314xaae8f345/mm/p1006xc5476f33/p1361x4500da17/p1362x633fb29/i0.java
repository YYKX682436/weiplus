package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29;

/* loaded from: classes14.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f178812a;

    /* renamed from: b, reason: collision with root package name */
    public long f178813b;

    /* renamed from: c, reason: collision with root package name */
    public int f178814c;

    /* renamed from: d, reason: collision with root package name */
    public long f178815d;

    /* renamed from: e, reason: collision with root package name */
    public int f178816e;

    public i0() {
        this.f178812a = "";
        this.f178813b = 0L;
        this.f178814c = 1;
        this.f178815d = 0L;
        this.f178816e = 0;
    }

    /* renamed from: equals */
    public boolean m54702xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0.class != obj.getClass()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0) obj;
        return java.util.Objects.equals(this.f178812a, i0Var.f178812a) && this.f178813b == i0Var.f178813b && this.f178814c == i0Var.f178814c;
    }

    /* renamed from: hashCode */
    public int m54703x8cdac1b() {
        return java.util.Objects.hash(this.f178812a, java.lang.Long.valueOf(this.f178813b), java.lang.Integer.valueOf(this.f178814c));
    }

    public i0(java.lang.String str, long j17, int i17, long j18, int i18) {
        this.f178812a = str;
        this.f178813b = j17;
        this.f178814c = i17;
        this.f178815d = j18;
        this.f178816e = i18;
    }
}
