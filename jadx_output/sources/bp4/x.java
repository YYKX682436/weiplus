package bp4;

/* loaded from: classes5.dex */
public final class x extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f23416f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f23417g;

    /* renamed from: h, reason: collision with root package name */
    public bp4.q f23418h;

    /* renamed from: i, reason: collision with root package name */
    public long f23419i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f23420m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(androidx.recyclerview.widget.RecyclerView recycler, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(recycler, "recycler");
        kotlin.jvm.internal.o.g(status, "status");
        this.f23416f = recycler;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f23417g = arrayList;
        recycler.setHasFixedSize(true);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(recycler.getContext());
        linearLayoutManager.Q(0);
        linearLayoutManager.setItemPrefetchEnabled(true);
        recycler.setLayoutManager(linearLayoutManager);
        recycler.setItemAnimator(new androidx.recyclerview.widget.z());
        recycler.N(new bp4.v(this));
        bp4.q qVar = new bp4.q(this);
        this.f23418h = qVar;
        qVar.E(arrayList);
        bp4.q qVar2 = this.f23418h;
        if (qVar2 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        new androidx.recyclerview.widget.g1(new bp4.t(this, qVar2)).d(recycler);
        androidx.recyclerview.widget.f2 f2Var = this.f23418h;
        if (f2Var == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        recycler.setAdapter(f2Var);
        bp4.q qVar3 = this.f23418h;
        if (qVar3 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        qVar3.f250922e = new bp4.w(this);
        recycler.setVisibility(0);
    }

    public final void A(int i17) {
        java.util.ArrayList arrayList = this.f23417g;
        boolean z17 = false;
        if (i17 >= 0 && i17 < arrayList.size()) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(i17);
            this.f23419i = galleryItem$MediaItem.f138434i;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("PARAM_VLOG_MULTI_IMAGE_SELECT_VALUE", galleryItem$MediaItem);
            this.f465332d.w(ju3.c0.f301872d2, bundle);
        }
    }

    public final void B(java.util.ArrayList list) {
        kotlin.jvm.internal.o.g(list, "list");
        com.tencent.mars.xlog.Log.i("MicroMsg.EditFooterRecyclerPlugin", "updateList = " + list.size());
        java.util.ArrayList arrayList = this.f23417g;
        arrayList.clear();
        arrayList.addAll(list);
        bp4.q qVar = this.f23418h;
        if (qVar == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        qVar.E(arrayList);
        bp4.q qVar2 = this.f23418h;
        if (qVar2 != null) {
            qVar2.notifyDataSetChanged();
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }

    @Override // yt3.r2
    public void onDetach() {
        bp4.q qVar = this.f23418h;
        if (qVar == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        int size = qVar.f250921d.size();
        qVar.f250921d.clear();
        qVar.notifyItemRangeRemoved(0, size);
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f23416f.setVisibility(i17);
    }

    public final int z() {
        int i17 = 0;
        for (java.lang.Object obj : this.f23417g) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj).f138434i == this.f23419i) {
                return i17;
            }
            i17 = i18;
        }
        return 0;
    }
}
