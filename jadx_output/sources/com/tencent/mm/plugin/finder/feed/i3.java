package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class i3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f106983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fp0.r f106985f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f106986g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(java.util.LinkedList linkedList, com.tencent.mm.plugin.finder.feed.a7 a7Var, fp0.r rVar, so2.y0 y0Var) {
        super(0);
        this.f106983d = linkedList;
        this.f106984e = a7Var;
        this.f106985f = rVar;
        this.f106986g = y0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList level2Comments = this.f106983d;
        kotlin.jvm.internal.o.f(level2Comments, "$level2Comments");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = level2Comments.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f106984e;
            so2.y0 y0Var = this.f106986g;
            if (!hasNext) {
                com.tencent.mm.plugin.finder.feed.a7.p(a7Var, arrayList, y0Var, true);
                a7Var.f106206J = true;
                this.f106985f.b(fp0.u.f265290f);
                return jz5.f0.f302826a;
            }
            com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) it.next();
            kotlin.jvm.internal.o.d(finderCommentInfo);
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = a7Var.f106212i;
            if (finderItem == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            long id6 = finderItem.getId();
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = a7Var.f106212i;
            if (finderItem2 == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            java.lang.String dupFlag = finderItem2.getDupFlag();
            long itemId = y0Var.getItemId();
            com.tencent.mm.plugin.finder.storage.yj0 yj0Var = new com.tencent.mm.plugin.finder.storage.yj0();
            yj0Var.field_feedId = id6;
            yj0Var.field_dupFlag = dupFlag;
            yj0Var.field_state = 2;
            yj0Var.field_actionInfo.set(1, finderCommentInfo);
            yj0Var.n1(itemId);
            arrayList.add(new so2.y0(yj0Var));
        }
    }
}
