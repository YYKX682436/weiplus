package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class qr extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f104417d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f104418e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f104419f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f104420g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f104421h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f104422i;

    /* renamed from: m, reason: collision with root package name */
    public final int f104423m;

    /* renamed from: n, reason: collision with root package name */
    public final int f104424n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.wr f104425o;

    public qr(com.tencent.mm.plugin.finder.convert.wr wrVar, android.content.Context context, int i17, int i18, java.lang.Object obj, java.lang.String wording, com.tencent.mm.protobuf.g gVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(wording, "wording");
        this.f104425o = wrVar;
        this.f104417d = context;
        this.f104418e = obj;
        this.f104419f = wording;
        this.f104420g = gVar;
        this.f104421h = new java.util.ArrayList();
        this.f104422i = new java.util.ArrayList();
        int i19 = ((com.tencent.mm.ui.bh.a(context).f197135a - (i18 * 2)) - (i17 * 2)) / 3;
        this.f104423m = i19;
        this.f104424n = (i19 * 4) / 3;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f104421h).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        java.lang.String sb6;
        com.tencent.mm.plugin.finder.convert.sr holder = (com.tencent.mm.plugin.finder.convert.sr) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((java.util.ArrayList) this.f104421h).get(i17);
        int intValue = ((java.lang.Number) ((java.util.ArrayList) this.f104422i).get(i17)).intValue();
        int l17 = nv2.n1.f340551h.l(finderObject);
        java.lang.String g17 = l17 > 0 ? com.tencent.mm.plugin.finder.assist.w2.g(2, l17) : "0";
        android.widget.TextView textView = holder.f104572e;
        if (textView != null) {
            textView.setText(g17);
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        if (objectDesc != null && (media = objectDesc.getMedia()) != null && media.size() > 0) {
            java.lang.String coverUrl = media.get(0).getCoverUrl();
            if (coverUrl == null || coverUrl.length() == 0) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(media.get(0).getThumbUrl());
                java.lang.String thumb_url_token = media.get(0).getThumb_url_token();
                sb7.append(thumb_url_token != null ? thumb_url_token : "");
                sb6 = sb7.toString();
            } else {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(media.get(0).getCoverUrl());
                java.lang.String cover_url_token = media.get(0).getCover_url_token();
                sb8.append(cover_url_token != null ? cover_url_token : "");
                sb6 = sb8.toString();
            }
            android.widget.ImageView imageView = holder.f104571d;
            if (imageView != null) {
                mn2.g1 g1Var = mn2.g1.f329975a;
                g1Var.e().b(new mn2.q3(sb6, com.tencent.mm.plugin.finder.storage.y90.f128356f), g1Var.h(mn2.f1.f329970x)).c(imageView);
            }
        }
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.pr(intValue, this, i17, this.f104425o, finderObject));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.b4n, parent, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.view.ViewGroup.LayoutParams layoutParams = ((android.widget.RelativeLayout) inflate).getLayoutParams();
        layoutParams.width = this.f104423m;
        int i18 = this.f104424n;
        layoutParams.height = i18;
        com.tencent.mm.plugin.finder.convert.sr srVar = new com.tencent.mm.plugin.finder.convert.sr(this.f104425o, inflate);
        android.widget.ImageView imageView = srVar.f104571d;
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView != null ? imageView.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.height = i18;
        }
        return srVar;
    }
}
