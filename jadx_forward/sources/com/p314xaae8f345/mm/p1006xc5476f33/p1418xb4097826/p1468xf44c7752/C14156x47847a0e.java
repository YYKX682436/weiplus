package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B#\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cJ\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/finder/gallery/FinderGalleryTabView;", "Landroid/widget/FrameLayout;", "Landroidx/recyclerview/widget/p2;", "getItemDecoration", "Lcom/tencent/mm/plugin/finder/gallery/i;", "e", "Lcom/tencent/mm/plugin/finder/gallery/i;", "getPresenter", "()Lcom/tencent/mm/plugin/finder/gallery/i;", "setPresenter", "(Lcom/tencent/mm/plugin/finder/gallery/i;)V", "presenter", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "f", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "getRecyclerView", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "setRecyclerView", "(Lcom/tencent/mm/view/recyclerview/WxRecyclerView;)V", "recyclerView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.gallery.FinderGalleryTabView */
/* loaded from: classes2.dex */
public final class C14156x47847a0e extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f192872d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.i presenter;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 recyclerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14156x47847a0e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f192872d = "Finder.FinderAlbumFilterView";
    }

    public final void a(int i17) {
        java.util.ArrayList arrayList;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.i0 i0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.i iVar = this.presenter;
        if (iVar == null || (arrayList = iVar.f192909f) == null || arrayList.size() <= i17 || i17 < 0) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.j0) it.next()).f192920e = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.j0 j0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.j0) kz5.n0.a0(arrayList, i17);
        if (j0Var != null) {
            j0Var.f192920e = true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select ");
        sb6.append(i17);
        sb6.append(", title:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.j0 j0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.j0) kz5.n0.a0(arrayList, i17);
        sb6.append((j0Var2 == null || (i0Var = j0Var2.f192919d) == null) ? null : i0Var.f192917b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f192872d, sb6.toString());
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.recyclerView;
        if (c22849x81a93d25 == null || (mo7946xf939df19 = c22849x81a93d25.mo7946xf939df19()) == null) {
            return;
        }
        mo7946xf939df19.m8146xced61ae5();
    }

    /* renamed from: getItemDecoration */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 m56726x5ae46119() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.k0();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.i getPresenter() {
        return this.presenter;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 getRecyclerView() {
        return this.recyclerView;
    }

    /* renamed from: setPresenter */
    public final void m56729x24cd7466(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.i iVar) {
        this.presenter = iVar;
    }

    /* renamed from: setRecyclerView */
    public final void m56730x7f4ee506(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25) {
        this.recyclerView = c22849x81a93d25;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14156x47847a0e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f192872d = "Finder.FinderAlbumFilterView";
    }
}
