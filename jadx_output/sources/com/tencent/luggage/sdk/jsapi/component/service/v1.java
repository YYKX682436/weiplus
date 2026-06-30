package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f47557a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47558b;

    public v1(boolean z17, boolean z18) {
        this.f47557a = z17;
        this.f47558b = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.luggage.sdk.jsapi.component.service.v1)) {
            return false;
        }
        com.tencent.luggage.sdk.jsapi.component.service.v1 v1Var = (com.tencent.luggage.sdk.jsapi.component.service.v1) obj;
        return this.f47557a == v1Var.f47557a && this.f47558b == v1Var.f47558b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f47557a) * 31) + java.lang.Boolean.hashCode(this.f47558b);
    }

    public java.lang.String toString() {
        return "ServicePreloadExtraArgs(skipPreloadAdWorker=" + this.f47557a + ", skipPreloadSkyline=" + this.f47558b + ')';
    }
}
