package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class r7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.f8 f108895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fp0.r f108896b;

    public r7(com.tencent.mm.plugin.finder.feed.f8 f8Var, fp0.r rVar) {
        this.f108895a = f8Var;
        this.f108896b = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        kotlin.jvm.internal.o.d(linkedList);
        boolean z17 = !linkedList.isEmpty();
        com.tencent.mm.plugin.finder.feed.f8 f8Var = this.f108895a;
        if (z17) {
            int size = f8Var.f106719p.size();
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                arrayList = f8Var.f106719p;
                if (!hasNext) {
                    break;
                }
                r45.s21 s21Var = (r45.s21) it.next();
                java.util.Iterator it6 = arrayList.iterator();
                int i17 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    if (kotlin.jvm.internal.o.b(((so2.c1) it6.next()).f410288d.f385428f, s21Var.f385428f)) {
                        break;
                    }
                    i17++;
                }
                if (!(i17 >= 0)) {
                    kotlin.jvm.internal.o.d(s21Var);
                    arrayList.add(new so2.c1(s21Var, f8Var.a().getUnsignedId()));
                }
            }
            yw2.f fVar = f8Var.f106720q;
            if (fVar != null && (recyclerView = fVar.n().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyItemRangeInserted(size, arrayList.size() - size);
            }
        } else {
            com.tencent.mars.xlog.Log.w("Finder.FavListDrawerPresenter", "[loadMoreData] empty!");
        }
        ym5.s3 s3Var = new ym5.s3(0);
        s3Var.f463521f = f8Var.f106725v;
        int size2 = linkedList.size();
        s3Var.f463523h = size2;
        if (size2 > 0) {
            s3Var.f463522g = false;
        }
        yw2.f fVar2 = f8Var.f106720q;
        if (fVar2 != null) {
            fVar2.n().onPreFinishLoadMoreSmooth(s3Var);
        }
        this.f108896b.b(fp0.u.f265290f);
        return jz5.f0.f302826a;
    }
}
