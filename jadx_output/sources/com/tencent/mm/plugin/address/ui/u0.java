package com.tencent.mm.plugin.address.ui;

/* loaded from: classes15.dex */
public final class u0 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.address.model.RcptItem f74629d;

    public u0(com.tencent.mm.plugin.address.model.RcptItem item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f74629d = item;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        com.tencent.mm.plugin.address.model.RcptItem rcptItem = this.f74629d;
        com.tencent.mm.plugin.address.model.RcptItem rcptItem2 = com.tencent.mm.plugin.address.ui.l1.G;
        return kotlin.jvm.internal.o.b(rcptItem, com.tencent.mm.plugin.address.ui.l1.H) ? 2 : 1;
    }

    public java.lang.String toString() {
        return super.toString();
    }
}
