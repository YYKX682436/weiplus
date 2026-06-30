package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f107815a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f107816b;

    public e(java.lang.Integer num, com.tencent.mm.protobuf.g gVar) {
        this.f107815a = num;
        this.f107816b = gVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.feed.model.e)) {
            return false;
        }
        com.tencent.mm.plugin.finder.feed.model.e eVar = (com.tencent.mm.plugin.finder.feed.model.e) obj;
        return kotlin.jvm.internal.o.b(this.f107815a, eVar.f107815a) && kotlin.jvm.internal.o.b(this.f107816b, eVar.f107816b);
    }

    public int hashCode() {
        java.lang.Integer num = this.f107815a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        com.tencent.mm.protobuf.g gVar = this.f107816b;
        return hashCode + (gVar != null ? gVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FeedRequestExtInfo(byPassInfoType=" + this.f107815a + ", byPassInfo=" + this.f107816b + ')';
    }
}
