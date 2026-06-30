package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class h5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f106899e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(com.tencent.mm.plugin.finder.feed.a7 a7Var, java.lang.String str) {
        super(2);
        this.f106898d = a7Var;
        this.f106899e = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        r45.iu0 resp = (r45.iu0) obj2;
        kotlin.jvm.internal.o.g(resp, "resp");
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.g5(this.f106898d, this.f106899e, longValue, resp));
        return jz5.f0.f302826a;
    }
}
