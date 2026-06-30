package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class kp {

    /* renamed from: a, reason: collision with root package name */
    public final int f103851a;

    /* renamed from: b, reason: collision with root package name */
    public final int f103852b;

    public kp(int i17, int i18) {
        this.f103851a = i17;
        this.f103852b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.convert.kp)) {
            return false;
        }
        com.tencent.mm.plugin.finder.convert.kp kpVar = (com.tencent.mm.plugin.finder.convert.kp) obj;
        return this.f103851a == kpVar.f103851a && this.f103852b == kpVar.f103852b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f103851a) * 31) + java.lang.Integer.hashCode(this.f103852b);
    }

    public java.lang.String toString() {
        return "MsgSceneData(scene=" + this.f103851a + ", requestScene=" + this.f103852b + ')';
    }
}
