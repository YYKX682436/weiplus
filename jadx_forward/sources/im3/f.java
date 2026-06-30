package im3;

/* loaded from: classes10.dex */
public final class f extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final qk4.b f374222e;

    public f(qk4.b videoLayoutRecycler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoLayoutRecycler, "videoLayoutRecycler");
        this.f374222e = videoLayoutRecycler;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c4l;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        im3.j item = (im3.j) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.f568828o70);
        t23.i1 i1Var = (t23.i1) i95.n0.c(t23.i1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = item.f374237m;
        java.lang.String o17 = abstractC15633xee433078 != null ? abstractC15633xee433078.o() : null;
        java.lang.String str = abstractC15633xee433078 != null ? abstractC15633xee433078.f219963e : null;
        long j17 = abstractC15633xee433078 != null ? abstractC15633xee433078.f219967i : 0L;
        long j18 = abstractC15633xee433078 != null ? abstractC15633xee433078.f219968m : 0L;
        ((t23.r0) i1Var).getClass();
        android.graphics.Bitmap g17 = t23.p0.h().g(o17, str, j17, null, j18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getGalleryBitmapFromMemory(...)");
        if (g17.isRecycled()) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ccy);
        } else {
            imageView.setImageBitmap(g17);
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(com.p314xaae8f345.mm.R.id.oy7);
        frameLayout.setVisibility(0);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.kwj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/mv/model/preview/MvPreviewAlbumVideoItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/preview/MvPreviewLiveItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/mv/model/preview/MvPreviewAlbumVideoItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/preview/MvPreviewLiveItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b = abstractC15633xee433078 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b ? (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) abstractC15633xee433078 : null;
        if (c15635xf0ea441b != null && (c15635xf0ea441b.f219981z == -1 || c15635xf0ea441b.f219980y == -1)) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new im3.e(c15635xf0ea441b, im3.b.f374213d, null), 2, null);
        }
        p17.setOnClickListener(new im3.c(this, frameLayout, item, p17));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
