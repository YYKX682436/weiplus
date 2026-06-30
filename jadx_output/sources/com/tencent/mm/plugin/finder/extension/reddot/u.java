package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final zy2.fa f105880a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f105881b;

    public u(zy2.fa manager) {
        kotlin.jvm.internal.o.g(manager, "manager");
        this.f105880a = manager;
        this.f105881b = new java.util.LinkedList();
    }

    public final void a() {
        java.util.LinkedList linkedList = this.f105881b;
        zy2.fa faVar = this.f105880a;
        linkedList.add(new jc2.a(faVar));
        linkedList.add(new jc2.f());
        linkedList.add(new jc2.j(faVar));
    }
}
