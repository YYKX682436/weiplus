package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class ub extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110602d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub(java.lang.String str) {
        super(1);
        this.f110602d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.D0(this.f110602d, it));
    }
}
