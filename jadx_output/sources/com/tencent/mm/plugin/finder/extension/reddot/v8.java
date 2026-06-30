package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class v8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ut2 f105929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f105930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f105931f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.x8 f105932g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(r45.ut2 ut2Var, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.c0 c0Var2, com.tencent.mm.plugin.finder.extension.reddot.x8 x8Var) {
        super(1);
        this.f105929d = ut2Var;
        this.f105930e = c0Var;
        this.f105931f = c0Var2;
        this.f105932g = x8Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo = (com.tencent.mm.plugin.finder.extension.reddot.jb) obj;
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        boolean contains = this.f105929d.getList(2).contains(ctrlInfo.field_tipsId);
        if (contains) {
            this.f105931f.f310112d = true;
        } else {
            this.f105930e.f310112d = false;
        }
        if (contains) {
            this.f105932g.f106000a.F(ctrlInfo.field_ctrInfo, "revokeRedDotPath#1");
        }
        return java.lang.Boolean.valueOf(contains);
    }
}
