package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes2.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f106042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(java.lang.String str) {
        super(1);
        this.f106042d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.jb it = (com.tencent.mm.plugin.finder.extension.reddot.jb) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(it.field_tipsId, this.f106042d));
    }
}
