package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class r3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f105798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.w3 f105799e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f105800f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f105801g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(java.util.HashSet hashSet, com.tencent.mm.plugin.finder.extension.reddot.w3 w3Var, java.util.HashSet hashSet2, java.util.ArrayList arrayList) {
        super(1);
        this.f105798d = hashSet;
        this.f105799e = w3Var;
        this.f105800f = hashSet2;
        this.f105801g = arrayList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.jb it = (com.tencent.mm.plugin.finder.extension.reddot.jb) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean contains = this.f105798d.contains(it);
        if (contains) {
            boolean y07 = it.y0("FinderEntrance");
            com.tencent.mm.plugin.finder.extension.reddot.w3 w3Var = this.f105799e;
            if (y07) {
                r45.f03 I0 = it.I0("FinderEntrance");
                if (I0 != null) {
                    com.tencent.mm.plugin.finder.report.x2.j(com.tencent.mm.plugin.finder.report.x2.f125429a, it, I0, 7, 0, null, null, 56, null);
                }
                w3Var.f105958d.o0("Finder.RedDotExpiredHandler", it);
            }
            w3Var.f105958d.F(it.field_ctrInfo, "Expired");
            java.util.HashSet hashSet = this.f105800f;
            if (hashSet.contains(it)) {
                return java.lang.Boolean.valueOf(contains);
            }
            hashSet.add(it);
            this.f105801g.add(it.u1());
        }
        return java.lang.Boolean.valueOf(contains);
    }
}
