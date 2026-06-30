package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes5.dex */
public final class b6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106354d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        super(1);
        this.f106354d = a7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f it = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(it, "it");
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.a6(this.f106354d));
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "getQrcode err " + it.f70615a + ' ' + it.f70616b);
        return jz5.f0.f302826a;
    }
}
