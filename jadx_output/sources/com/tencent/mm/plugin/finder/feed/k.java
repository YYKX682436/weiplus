package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f107153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.c0 f107154e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.c0 c0Var) {
        super(1);
        this.f107153d = obj;
        this.f107154e = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        java.lang.Object obj2 = this.f107153d;
        if (obj2 != null) {
            ((cw2.ca) obj2).t(this.f107154e.v());
        }
        return jz5.f0.f302826a;
    }
}
