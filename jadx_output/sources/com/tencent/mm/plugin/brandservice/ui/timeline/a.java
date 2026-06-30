package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f94095a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f94096b;

    public a(java.lang.String name, yz5.a execute) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(execute, "execute");
        this.f94095a = name;
        this.f94096b = execute;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.brandservice.ui.timeline.a)) {
            return false;
        }
        com.tencent.mm.plugin.brandservice.ui.timeline.a aVar = (com.tencent.mm.plugin.brandservice.ui.timeline.a) obj;
        return kotlin.jvm.internal.o.b(this.f94095a, aVar.f94095a) && kotlin.jvm.internal.o.b(this.f94096b, aVar.f94096b);
    }

    public int hashCode() {
        return (this.f94095a.hashCode() * 31) + this.f94096b.hashCode();
    }

    public java.lang.String toString() {
        return "TestItem(name=" + this.f94095a + ", execute=" + this.f94096b + ')';
    }
}
