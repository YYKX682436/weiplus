package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class rc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.id f108902d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(com.tencent.mm.plugin.finder.feed.id idVar) {
        super(0);
        this.f108902d = idVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.id idVar = this.f108902d;
        jz5.o k17 = idVar.k();
        if (k17 != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.bd(idVar, (java.util.List) k17.f302841d, (java.util.Set) k17.f302842e, (java.util.Set) k17.f302843f));
        }
        return jz5.f0.f302826a;
    }
}
