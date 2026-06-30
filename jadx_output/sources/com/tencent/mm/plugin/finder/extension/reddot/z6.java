package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class z6 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.xs2 f106068a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f106069b;

    public z6(r45.xs2 ext, java.lang.String tipsId) {
        kotlin.jvm.internal.o.g(ext, "ext");
        kotlin.jvm.internal.o.g(tipsId, "tipsId");
        this.f106068a = ext;
        this.f106069b = tipsId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.extension.reddot.z6)) {
            return false;
        }
        com.tencent.mm.plugin.finder.extension.reddot.z6 z6Var = (com.tencent.mm.plugin.finder.extension.reddot.z6) obj;
        return kotlin.jvm.internal.o.b(this.f106068a, z6Var.f106068a) && kotlin.jvm.internal.o.b(this.f106069b, z6Var.f106069b);
    }

    public int hashCode() {
        return (this.f106068a.hashCode() * 31) + this.f106069b.hashCode();
    }

    public java.lang.String toString() {
        return "EnterTabTipsExtInfo(ext=" + this.f106068a + ", tipsId=" + this.f106069b + ')';
    }
}
