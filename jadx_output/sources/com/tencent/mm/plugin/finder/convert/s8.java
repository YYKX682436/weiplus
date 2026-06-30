package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class s8 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f104530a;

    public s8(boolean z17) {
        this.f104530a = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.finder.convert.s8) && this.f104530a == ((com.tencent.mm.plugin.finder.convert.s8) obj).f104530a;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.f104530a);
    }

    public java.lang.String toString() {
        return "BannerResizeParam(enablePseudoVideoFullScreen=" + this.f104530a + ')';
    }
}
