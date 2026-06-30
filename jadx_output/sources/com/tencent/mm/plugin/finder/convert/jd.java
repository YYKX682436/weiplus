package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class jd extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f103742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f103743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f103744f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f103745g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd(com.tencent.mm.plugin.finder.convert.qe qeVar, java.util.List list, java.util.List list2, float f17) {
        super(1);
        this.f103742d = qeVar;
        this.f103743e = list;
        this.f103744f = list2;
        this.f103745g = f17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList curLikeList = (java.util.LinkedList) obj;
        kotlin.jvm.internal.o.g(curLikeList, "curLikeList");
        com.tencent.mm.plugin.finder.convert.t8 t8Var = com.tencent.mm.plugin.finder.convert.qe.U;
        this.f103742d.G0(curLikeList, this.f103743e, this.f103744f, this.f103745g);
        return jz5.f0.f302826a;
    }
}
