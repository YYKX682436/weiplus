package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class z8 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.xs2 f106073a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f106074b;

    public z8(r45.xs2 ext, java.lang.String tipsId) {
        kotlin.jvm.internal.o.g(ext, "ext");
        kotlin.jvm.internal.o.g(tipsId, "tipsId");
        this.f106073a = ext;
        this.f106074b = tipsId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.extension.reddot.z8)) {
            return false;
        }
        com.tencent.mm.plugin.finder.extension.reddot.z8 z8Var = (com.tencent.mm.plugin.finder.extension.reddot.z8) obj;
        return kotlin.jvm.internal.o.b(this.f106073a, z8Var.f106073a) && kotlin.jvm.internal.o.b(this.f106074b, z8Var.f106074b);
    }

    public int hashCode() {
        return (this.f106073a.hashCode() * 31) + this.f106074b.hashCode();
    }

    public java.lang.String toString() {
        return "EnterTabTipsExtInfo(ext=" + this.f106073a + ", tipsId=" + this.f106074b + ')';
    }
}
