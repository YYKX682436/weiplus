package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class x4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f180090d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f180091e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f180092f;

    public x4(yz5.a getCurrentIndex, yz5.l onItemClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getCurrentIndex, "getCurrentIndex");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClick, "onItemClick");
        this.f180090d = getCurrentIndex;
        this.f180091e = onItemClick;
        this.f180092f = kz5.p0.f395529d;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f180092f.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v4 holder = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v4) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2 g2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g2) this.f180092f.get(i17);
        android.graphics.Bitmap bitmap = g2Var.f179571j;
        boolean z17 = (bitmap == null || bitmap.isRecycled()) ? false : true;
        android.widget.ImageView imageView = holder.f180056d;
        if (z17) {
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(imageView.getResources(), bitmap);
            android.content.Context context = imageView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "fun ImageView.load(\n    …le, imageLoader, builder)");
            r5.j a17 = r5.a.a(context);
            android.content.Context context2 = imageView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "context");
            c6.h hVar = new c6.h(context2);
            hVar.f120338c = bitmapDrawable;
            hVar.f120339d = new p135x2eae8f.p139xcb7e7191.C1422x9d6d031(imageView);
            hVar.H = null;
            hVar.I = null;
            hVar.f120335J = null;
            ((r5.p) a17).b(hVar.a());
        } else {
            java.io.File file = new java.io.File(g2Var.f179562a);
            android.content.Context context3 = imageView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "fun ImageView.load(\n    …le, imageLoader, builder)");
            r5.j a18 = r5.a.a(context3);
            android.content.Context context4 = imageView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "context");
            c6.h hVar2 = new c6.h(context4);
            hVar2.f120338c = file;
            hVar2.f120339d = new p135x2eae8f.p139xcb7e7191.C1422x9d6d031(imageView);
            hVar2.H = null;
            hVar2.I = null;
            hVar2.f120335J = null;
            hVar2.f120353r = new g6.c(100, false, 2, null);
            ((r5.p) a18).b(hVar2.a());
        }
        android.view.View view = holder.f180057e;
        int i18 = i17 == ((java.lang.Number) this.f180090d.mo152xb9724478()).intValue() ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/MediaThumbnailAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/emoji/ui/MediaThumbnailAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/MediaThumbnailAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/emoji/ui/MediaThumbnailAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        holder.f180058f.setVisibility(g2Var.a() ? 0 : 8);
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.w4(holder, this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ehg, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v4(inflate);
    }
}
