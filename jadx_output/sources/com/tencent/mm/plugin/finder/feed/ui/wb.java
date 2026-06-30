package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class wb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110694d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(java.lang.String str) {
        super(1);
        this.f110694d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.D0(this.f110694d, it));
    }
}
