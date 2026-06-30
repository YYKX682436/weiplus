package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class pp extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 f110432d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 occupyFinderUI40) {
        super(1);
        this.f110432d = occupyFinderUI40;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String word = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(word, "word");
        com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 occupyFinderUI40 = this.f110432d;
        bm2.w7 w7Var = occupyFinderUI40.D;
        w7Var.getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) w7Var.f22417e;
        int indexOf = arrayList.indexOf(word);
        arrayList.remove(word);
        w7Var.notifyItemRemoved(indexOf);
        kotlinx.coroutines.l.d(v65.m.b(occupyFinderUI40), null, null, new com.tencent.mm.plugin.finder.feed.ui.qp(occupyFinderUI40, word, null), 3, null);
        return jz5.f0.f302826a;
    }
}
