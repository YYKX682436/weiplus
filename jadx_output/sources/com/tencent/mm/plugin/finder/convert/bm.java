package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes3.dex */
public final class bm {

    /* renamed from: a, reason: collision with root package name */
    public final int f102984a;

    /* renamed from: b, reason: collision with root package name */
    public final int f102985b;

    public bm(int i17, int i18) {
        this.f102984a = i17;
        this.f102985b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.convert.bm)) {
            return false;
        }
        com.tencent.mm.plugin.finder.convert.bm bmVar = (com.tencent.mm.plugin.finder.convert.bm) obj;
        return this.f102984a == bmVar.f102984a && this.f102985b == bmVar.f102985b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f102984a) * 31) + java.lang.Integer.hashCode(this.f102985b);
    }

    public java.lang.String toString() {
        return "MsgSceneData(scene=" + this.f102984a + ", requestScene=" + this.f102985b + ')';
    }
}
