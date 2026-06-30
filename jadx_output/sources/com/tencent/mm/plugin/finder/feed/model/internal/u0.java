package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f108052a;

    /* renamed from: b, reason: collision with root package name */
    public int f108053b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f108054c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f108055d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f108056e;

    public u0(int i17, int i18, java.util.LinkedList changeIndex, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(changeIndex, "changeIndex");
        this.f108052a = i17;
        this.f108053b = i18;
        this.f108054c = changeIndex;
        this.f108055d = z17;
        this.f108056e = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.feed.model.internal.u0)) {
            return false;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.u0 u0Var = (com.tencent.mm.plugin.finder.feed.model.internal.u0) obj;
        return this.f108052a == u0Var.f108052a && this.f108053b == u0Var.f108053b && kotlin.jvm.internal.o.b(this.f108054c, u0Var.f108054c) && this.f108055d == u0Var.f108055d && this.f108056e == u0Var.f108056e;
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f108052a) * 31) + java.lang.Integer.hashCode(this.f108053b)) * 31) + this.f108054c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f108055d)) * 31) + java.lang.Boolean.hashCode(this.f108056e);
    }

    public java.lang.String toString() {
        return "MergeResult(insertIndex=" + this.f108052a + ", insertCount=" + this.f108053b + ", changeIndex=" + this.f108054c + ", isRemoveBeforeInsert=" + this.f108055d + ", dataReplace=" + this.f108056e + ')';
    }

    public /* synthetic */ u0(int i17, int i18, java.util.LinkedList linkedList, boolean z17, boolean z18, int i19, kotlin.jvm.internal.i iVar) {
        this(i17, i18, linkedList, (i19 & 8) != 0 ? false : z17, (i19 & 16) != 0 ? false : z18);
    }
}
