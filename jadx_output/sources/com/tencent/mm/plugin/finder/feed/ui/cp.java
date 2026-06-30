package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class cp extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 f109918d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 occupyFinderUI39) {
        super(1);
        this.f109918d = occupyFinderUI39;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String word = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(word, "word");
        com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 occupyFinderUI39 = this.f109918d;
        bm2.w7 w7Var = occupyFinderUI39.f109619z;
        w7Var.getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) w7Var.f22417e;
        int indexOf = arrayList.indexOf(word);
        arrayList.remove(word);
        w7Var.notifyItemRemoved(indexOf);
        occupyFinderUI39.g7(w7Var.getItemCount());
        kotlinx.coroutines.l.d(v65.m.b(occupyFinderUI39), null, null, new com.tencent.mm.plugin.finder.feed.ui.fp(occupyFinderUI39, word, null), 3, null);
        return jz5.f0.f302826a;
    }
}
