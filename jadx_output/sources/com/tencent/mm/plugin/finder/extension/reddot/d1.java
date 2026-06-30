package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f105452d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(java.util.List list) {
        super(1);
        this.f105452d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(this.f105452d.contains(it));
    }
}
