package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class x4 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f98557d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f98558e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f98559f;

    public x4(yz5.a getCurrentIndex, yz5.l onItemClick) {
        kotlin.jvm.internal.o.g(getCurrentIndex, "getCurrentIndex");
        kotlin.jvm.internal.o.g(onItemClick, "onItemClick");
        this.f98557d = getCurrentIndex;
        this.f98558e = onItemClick;
        this.f98559f = kz5.p0.f313996d;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f98559f.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.emoji.ui.v4 holder = (com.tencent.mm.plugin.emoji.ui.v4) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.emoji.ui.g2 g2Var = (com.tencent.mm.plugin.emoji.ui.g2) this.f98559f.get(i17);
        android.graphics.Bitmap bitmap = g2Var.f98038j;
        boolean z17 = (bitmap == null || bitmap.isRecycled()) ? false : true;
        android.widget.ImageView imageView = holder.f98523d;
        if (z17) {
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(imageView.getResources(), bitmap);
            android.content.Context context = imageView.getContext();
            kotlin.jvm.internal.o.f(context, "fun ImageView.load(\n    …le, imageLoader, builder)");
            r5.j a17 = r5.a.a(context);
            android.content.Context context2 = imageView.getContext();
            kotlin.jvm.internal.o.f(context2, "context");
            c6.h hVar = new c6.h(context2);
            hVar.f38805c = bitmapDrawable;
            hVar.f38806d = new coil.target.ImageViewTarget(imageView);
            hVar.H = null;
            hVar.I = null;
            hVar.f38802J = null;
            ((r5.p) a17).b(hVar.a());
        } else {
            java.io.File file = new java.io.File(g2Var.f98029a);
            android.content.Context context3 = imageView.getContext();
            kotlin.jvm.internal.o.f(context3, "fun ImageView.load(\n    …le, imageLoader, builder)");
            r5.j a18 = r5.a.a(context3);
            android.content.Context context4 = imageView.getContext();
            kotlin.jvm.internal.o.f(context4, "context");
            c6.h hVar2 = new c6.h(context4);
            hVar2.f38805c = file;
            hVar2.f38806d = new coil.target.ImageViewTarget(imageView);
            hVar2.H = null;
            hVar2.I = null;
            hVar2.f38802J = null;
            hVar2.f38820r = new g6.c(100, false, 2, null);
            ((r5.p) a18).b(hVar2.a());
        }
        android.view.View view = holder.f98524e;
        int i18 = i17 == ((java.lang.Number) this.f98557d.invoke()).intValue() ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/MediaThumbnailAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/emoji/ui/MediaThumbnailAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/MediaThumbnailAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/emoji/ui/MediaThumbnailAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        holder.f98525f.setVisibility(g2Var.a() ? 0 : 8);
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.emoji.ui.w4(holder, this));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.ehg, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.plugin.emoji.ui.v4(inflate);
    }
}
