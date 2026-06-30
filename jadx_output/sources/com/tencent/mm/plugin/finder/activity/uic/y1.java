package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public int f101975a;

    /* renamed from: b, reason: collision with root package name */
    public int f101976b;

    public y1(int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        i17 = (i19 & 1) != 0 ? 2 : i17;
        i18 = (i19 & 2) != 0 ? 0 : i18;
        this.f101975a = i17;
        this.f101976b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.activity.uic.y1)) {
            return false;
        }
        com.tencent.mm.plugin.finder.activity.uic.y1 y1Var = (com.tencent.mm.plugin.finder.activity.uic.y1) obj;
        return this.f101975a == y1Var.f101975a && this.f101976b == y1Var.f101976b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f101975a) * 31) + java.lang.Integer.hashCode(this.f101976b);
    }

    public java.lang.String toString() {
        return "JoinResult(joinActivityResult=" + this.f101975a + ", interceptType=" + this.f101976b + ')';
    }
}
