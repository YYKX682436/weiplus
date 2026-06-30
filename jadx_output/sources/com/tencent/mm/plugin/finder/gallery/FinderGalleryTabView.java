package com.tencent.mm.plugin.finder.gallery;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B#\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cJ\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/finder/gallery/FinderGalleryTabView;", "Landroid/widget/FrameLayout;", "Landroidx/recyclerview/widget/p2;", "getItemDecoration", "Lcom/tencent/mm/plugin/finder/gallery/i;", "e", "Lcom/tencent/mm/plugin/finder/gallery/i;", "getPresenter", "()Lcom/tencent/mm/plugin/finder/gallery/i;", "setPresenter", "(Lcom/tencent/mm/plugin/finder/gallery/i;)V", "presenter", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "f", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "getRecyclerView", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "setRecyclerView", "(Lcom/tencent/mm/view/recyclerview/WxRecyclerView;)V", "recyclerView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderGalleryTabView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f111339d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.finder.gallery.i presenter;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderGalleryTabView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f111339d = "Finder.FinderAlbumFilterView";
    }

    public final void a(int i17) {
        java.util.ArrayList arrayList;
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.finder.gallery.i0 i0Var;
        com.tencent.mm.plugin.finder.gallery.i iVar = this.presenter;
        if (iVar == null || (arrayList = iVar.f111376f) == null || arrayList.size() <= i17 || i17 < 0) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.finder.gallery.j0) it.next()).f111387e = false;
        }
        com.tencent.mm.plugin.finder.gallery.j0 j0Var = (com.tencent.mm.plugin.finder.gallery.j0) kz5.n0.a0(arrayList, i17);
        if (j0Var != null) {
            j0Var.f111387e = true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select ");
        sb6.append(i17);
        sb6.append(", title:");
        com.tencent.mm.plugin.finder.gallery.j0 j0Var2 = (com.tencent.mm.plugin.finder.gallery.j0) kz5.n0.a0(arrayList, i17);
        sb6.append((j0Var2 == null || (i0Var = j0Var2.f111386d) == null) ? null : i0Var.f111384b);
        com.tencent.mars.xlog.Log.i(this.f111339d, sb6.toString());
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.recyclerView;
        if (wxRecyclerView == null || (adapter = wxRecyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }

    public final androidx.recyclerview.widget.p2 getItemDecoration() {
        return new com.tencent.mm.plugin.finder.gallery.k0();
    }

    public final com.tencent.mm.plugin.finder.gallery.i getPresenter() {
        return this.presenter;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    public final void setPresenter(com.tencent.mm.plugin.finder.gallery.i iVar) {
        this.presenter = iVar;
    }

    public final void setRecyclerView(com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView) {
        this.recyclerView = wxRecyclerView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderGalleryTabView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f111339d = "Finder.FinderAlbumFilterView";
    }
}
