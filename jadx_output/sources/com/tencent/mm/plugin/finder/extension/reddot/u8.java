package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class u8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ut2 f105910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f105911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f105912f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(r45.ut2 ut2Var, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.c0 c0Var2) {
        super(1);
        this.f105910d = ut2Var;
        this.f105911e = c0Var;
        this.f105912f = c0Var2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo = (com.tencent.mm.plugin.finder.extension.reddot.jb) obj;
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        boolean contains = this.f105910d.getList(2).contains(ctrlInfo.field_tipsId);
        if (contains) {
            this.f105911e.f310112d = true;
        } else {
            this.f105912f.f310112d = false;
        }
        return java.lang.Boolean.valueOf(contains);
    }
}
