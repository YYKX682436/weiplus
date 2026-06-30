package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f95828a;

    /* renamed from: b, reason: collision with root package name */
    public final int f95829b;

    public b0(int i17, int i18) {
        this.f95828a = i17;
        this.f95829b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b0)) {
            return false;
        }
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b0 b0Var = (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b0) obj;
        return this.f95828a == b0Var.f95828a && this.f95829b == b0Var.f95829b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f95828a) * 31) + java.lang.Integer.hashCode(this.f95829b);
    }

    public java.lang.String toString() {
        return "AudioInfo(sampleRate=" + this.f95828a + ", channelCount=" + this.f95829b + ')';
    }
}
