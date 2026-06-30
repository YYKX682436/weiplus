package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class a8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ut2 f105345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f105346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f105347f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.d8 f105348g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(r45.ut2 ut2Var, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.c0 c0Var2, com.tencent.mm.plugin.finder.extension.reddot.d8 d8Var) {
        super(1);
        this.f105345d = ut2Var;
        this.f105346e = c0Var;
        this.f105347f = c0Var2;
        this.f105348g = d8Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo = (com.tencent.mm.plugin.finder.extension.reddot.jb) obj;
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        boolean contains = this.f105345d.getList(2).contains(ctrlInfo.field_tipsId);
        if (contains) {
            this.f105347f.f310112d = true;
        } else {
            this.f105346e.f310112d = false;
        }
        if (contains) {
            this.f105348g.F(ctrlInfo.field_ctrInfo, "revokeRedDotPath#1");
        }
        return java.lang.Boolean.valueOf(contains);
    }
}
