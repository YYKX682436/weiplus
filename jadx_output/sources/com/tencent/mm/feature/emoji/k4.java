package com.tencent.mm.feature.emoji;

/* loaded from: classes4.dex */
public final class k4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.l4 f66359d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(com.tencent.mm.feature.emoji.l4 l4Var) {
        super(0);
        this.f66359d = l4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f66359d.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        byte[] y07 = com.tencent.mm.storage.n5.f().e().y0("cache_type_send_list");
        if (y07 != null) {
            linkedList.addAll(r26.n0.f0(new java.lang.String(y07, r26.c.f368865a), new java.lang.String[]{"_"}, false, 0, 6, null));
        }
        return linkedList;
    }
}
