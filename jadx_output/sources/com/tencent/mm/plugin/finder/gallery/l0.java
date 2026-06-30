package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class l0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f111389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.gallery.FinderGalleryTabView f111390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f111391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.gallery.i f111392g;

    public l0(com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter, com.tencent.mm.plugin.finder.gallery.FinderGalleryTabView finderGalleryTabView, java.util.ArrayList arrayList, com.tencent.mm.plugin.finder.gallery.i iVar) {
        this.f111389d = wxRecyclerAdapter;
        this.f111390e = finderGalleryTabView;
        this.f111391f = arrayList;
        this.f111392g = iVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        java.lang.Object obj;
        androidx.recyclerview.widget.f2 adapter2;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        int a07 = i17 - this.f111389d.a0();
        com.tencent.mm.plugin.finder.gallery.FinderGalleryTabView finderGalleryTabView = this.f111390e;
        java.lang.String str = finderGalleryTabView.f111339d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click item ");
        java.util.ArrayList arrayList = this.f111391f;
        if (a07 < 0 || a07 >= arrayList.size()) {
            obj = "";
        } else {
            obj = arrayList.get(a07);
            kotlin.jvm.internal.o.f(obj, "get(...)");
        }
        sb6.append(obj);
        sb6.append(" pos:");
        sb6.append(a07);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        com.tencent.mm.plugin.finder.gallery.j0 j0Var = (com.tencent.mm.plugin.finder.gallery.j0) holder.f293125i;
        if (j0Var != null) {
            com.tencent.mm.plugin.finder.gallery.i0 i0Var = j0Var.f111386d;
            int i18 = i0Var.f111383a;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("select item hash:");
            sb7.append(j0Var.hashCode());
            sb7.append(", title:");
            java.lang.String str2 = i0Var.f111384b;
            sb7.append(str2);
            sb7.append(", selected:");
            sb7.append(j0Var.f111387e);
            java.lang.String sb8 = sb7.toString();
            java.lang.String str3 = finderGalleryTabView.f111339d;
            com.tencent.mars.xlog.Log.i(str3, sb8);
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                boolean z17 = true;
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.mm.plugin.finder.gallery.j0 j0Var2 = (com.tencent.mm.plugin.finder.gallery.j0) it.next();
                if (j0Var2.f111386d.f111383a != i18) {
                    z17 = false;
                }
                j0Var2.f111387e = z17;
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView = finderGalleryTabView.getRecyclerView();
            if (recyclerView != null && (adapter2 = recyclerView.getAdapter()) != null) {
                adapter2.notifyItemRangeChanged(0, adapter2.getItemCount(), 1);
                com.tencent.mars.xlog.Log.i(str3, "refresh itemCount:" + adapter2.getItemCount());
            }
            com.tencent.mm.plugin.finder.gallery.i iVar = this.f111392g;
            iVar.getClass();
            java.util.Iterator it6 = iVar.f111376f.iterator();
            int i19 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i19 = -1;
                    break;
                } else {
                    if (((com.tencent.mm.plugin.finder.gallery.j0) it6.next()).f111386d.f111383a == i0Var.f111383a) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            com.tencent.mars.xlog.Log.i(iVar.f111374d, "onSelectTab title:" + str2 + ", index:" + i19);
            com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager = iVar.f111377g;
            if (finderViewPager.getCurrentItem() != i19) {
                finderViewPager.setCurrentItem(i19, false);
            }
        }
    }
}
