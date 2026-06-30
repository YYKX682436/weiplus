package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class yb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f110764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(java.util.LinkedList linkedList) {
        super(1);
        this.f110764d = linkedList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(this.f110764d.contains(it));
    }
}
