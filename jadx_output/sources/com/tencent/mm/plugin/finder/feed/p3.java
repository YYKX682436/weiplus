package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes5.dex */
public final class p3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f108697d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        super(0);
        this.f108697d = a7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(this.f108697d.f106207d);
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(f17, "zh_CN") || kotlin.jvm.internal.o.b(f17, "zh_TW") || kotlin.jvm.internal.o.b(f17, "zh_HK"));
    }
}
