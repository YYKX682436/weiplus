package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class o00 implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108611a;

    public o00(int i17) {
        this.f108611a = i17;
    }

    @Override // in5.y0
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, in5.w0 data) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(data, "data");
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.i2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ey2.i2 i2Var = (ey2.i2) a17;
        if (this.f108611a == 4) {
            java.util.LinkedList linkedList = data.f293154g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : linkedList) {
                if (((in5.x0) obj).f293158a instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                in5.c cVar = ((in5.x0) it.next()).f293158a;
                kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                arrayList2.add((com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar);
            }
            i2Var.N6(20, arrayList2);
        }
    }
}
