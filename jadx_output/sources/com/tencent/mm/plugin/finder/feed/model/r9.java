package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class r9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f108300a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f108301b;

    /* renamed from: c, reason: collision with root package name */
    public final int f108302c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.c f108303d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f108304e;

    public r9(java.util.ArrayList dataList, com.tencent.mm.protobuf.g gVar, int i17, com.tencent.mm.plugin.finder.feed.model.c cVar, java.lang.String stack, int i18, kotlin.jvm.internal.i iVar) {
        if ((i18 & 16) != 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            stack = com.tencent.mm.sdk.platformtools.z3.b(true);
            kotlin.jvm.internal.o.f(stack, "toString(...)");
        }
        kotlin.jvm.internal.o.g(dataList, "dataList");
        kotlin.jvm.internal.o.g(stack, "stack");
        this.f108300a = dataList;
        this.f108301b = gVar;
        this.f108302c = i17;
        this.f108303d = cVar;
        this.f108304e = stack;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.feed.model.r9)) {
            return false;
        }
        com.tencent.mm.plugin.finder.feed.model.r9 r9Var = (com.tencent.mm.plugin.finder.feed.model.r9) obj;
        return kotlin.jvm.internal.o.b(this.f108300a, r9Var.f108300a) && kotlin.jvm.internal.o.b(this.f108301b, r9Var.f108301b) && this.f108302c == r9Var.f108302c && kotlin.jvm.internal.o.b(this.f108303d, r9Var.f108303d) && kotlin.jvm.internal.o.b(this.f108304e, r9Var.f108304e);
    }

    public int hashCode() {
        int hashCode = this.f108300a.hashCode() * 31;
        com.tencent.mm.protobuf.g gVar = this.f108301b;
        int hashCode2 = (((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + java.lang.Integer.hashCode(this.f108302c)) * 31;
        com.tencent.mm.plugin.finder.feed.model.c cVar = this.f108303d;
        return ((hashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.f108304e.hashCode();
    }

    public java.lang.String toString() {
        return "LoaderCache(dataList=" + this.f108300a + ", lastBuffer=" + this.f108301b + ", position=" + this.f108302c + ", customData=" + this.f108303d + ", stack=" + this.f108304e + ')';
    }
}
