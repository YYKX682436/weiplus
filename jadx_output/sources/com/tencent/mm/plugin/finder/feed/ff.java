package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes.dex */
public final class ff extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f106740d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(java.util.HashMap hashMap) {
        super(1);
        this.f106740d = hashMap;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return (km2.q) this.f106740d.get(it);
    }
}
