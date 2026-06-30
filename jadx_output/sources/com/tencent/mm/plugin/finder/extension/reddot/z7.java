package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class z7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ut2 f106070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f106071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f106072f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(r45.ut2 ut2Var, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.c0 c0Var2) {
        super(1);
        this.f106070d = ut2Var;
        this.f106071e = c0Var;
        this.f106072f = c0Var2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo = (com.tencent.mm.plugin.finder.extension.reddot.jb) obj;
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        boolean contains = this.f106070d.getList(2).contains(ctrlInfo.field_tipsId);
        if (contains) {
            this.f106071e.f310112d = true;
        } else {
            this.f106072f.f310112d = false;
        }
        return java.lang.Boolean.valueOf(contains);
    }
}
