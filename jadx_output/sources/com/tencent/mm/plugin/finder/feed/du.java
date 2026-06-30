package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class du extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.fu f106587d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du(com.tencent.mm.plugin.finder.feed.fu fuVar) {
        super(1);
        this.f106587d = fuVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Number) obj).intValue() == -1) {
            com.tencent.mm.plugin.finder.feed.fu fuVar = this.f106587d;
            return new com.tencent.mm.plugin.finder.convert.i8(new com.tencent.mm.plugin.finder.feed.bu(fuVar), new com.tencent.mm.plugin.finder.feed.cu(fuVar), null, false, 12, null);
        }
        kotlin.jvm.internal.o.d(null);
        throw new jz5.d();
    }
}
