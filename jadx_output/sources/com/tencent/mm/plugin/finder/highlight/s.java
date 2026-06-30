package com.tencent.mm.plugin.finder.highlight;

/* loaded from: classes2.dex */
public final class s implements cw2.ea {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.highlight.u f111466d;

    public s(com.tencent.mm.plugin.finder.highlight.u uVar) {
        this.f111466d = uVar;
    }

    @Override // cw2.ea
    public void onVideoPause() {
    }

    @Override // cw2.ea
    public void onVideoPlay() {
    }

    @Override // cw2.ea
    public void p4(long j17, long j18) {
        java.lang.Object obj;
        java.lang.Object obj2;
        long j19 = j17 / 1000;
        com.tencent.mm.plugin.finder.highlight.p pVar = this.f111466d.f111470f;
        java.util.ArrayList arrayList = pVar.f111456c;
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            obj = null;
            if (!listIterator.hasPrevious()) {
                obj2 = null;
                break;
            }
            obj2 = listIterator.previous();
            com.tencent.mm.plugin.finder.highlight.d dVar = (com.tencent.mm.plugin.finder.highlight.d) obj2;
            if (j19 >= ((long) dVar.f111427d.getInteger(0)) && j19 < ((long) dVar.f111427d.getInteger(1))) {
                break;
            }
        }
        com.tencent.mm.plugin.finder.highlight.d dVar2 = (com.tencent.mm.plugin.finder.highlight.d) obj2;
        if (dVar2 == null) {
            java.util.ListIterator listIterator2 = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    break;
                }
                java.lang.Object previous = listIterator2.previous();
                if (j19 >= ((long) ((com.tencent.mm.plugin.finder.highlight.d) previous).f111427d.getInteger(0))) {
                    obj = previous;
                    break;
                }
            }
            pVar.b((com.tencent.mm.plugin.finder.highlight.d) obj);
            return;
        }
        if (!kotlin.jvm.internal.o.b(pVar.f111459f, dVar2)) {
            pVar.f111459f = dVar2;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = pVar.f111458e;
            if (wxRecyclerAdapter == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            wxRecyclerAdapter.notifyDataSetChanged();
            pVar.b(dVar2);
        }
        pVar.f111461h = -1;
    }
}
