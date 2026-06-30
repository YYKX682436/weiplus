package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f110249a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.z91 f110250b;

    public l(int i17, r45.z91 request) {
        kotlin.jvm.internal.o.g(request, "request");
        this.f110249a = i17;
        this.f110250b = request;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.feed.ui.l)) {
            return false;
        }
        com.tencent.mm.plugin.finder.feed.ui.l lVar = (com.tencent.mm.plugin.finder.feed.ui.l) obj;
        return this.f110249a == lVar.f110249a && kotlin.jvm.internal.o.b(this.f110250b, lVar.f110250b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f110249a) * 31) + this.f110250b.hashCode();
    }

    public java.lang.String toString() {
        return "RelatedRequest(scene=" + this.f110249a + ", request=" + this.f110250b + ')';
    }
}
