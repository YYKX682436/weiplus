package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes15.dex */
public class s0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final int f98396d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f98397e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f98398f;

    /* renamed from: g, reason: collision with root package name */
    public final int f98399g;

    /* renamed from: h, reason: collision with root package name */
    public final int f98400h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout.LayoutParams f98401i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout.LayoutParams f98402m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.ui.v2.q0 f98403n;

    public s0(android.content.Context context, int i17) {
        this.f98396d = 3;
        this.f98396d = i17;
        this.f98397e = context;
        int B = i65.a.B(context);
        this.f98399g = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480360vn);
        this.f98400h = (int) ((B - (r3 * i17)) / (i17 + 1.0f));
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r45.ri0 getItem(int i17) {
        java.util.List list;
        if (i17 >= 0) {
            java.util.List list2 = this.f98398f;
            if (i17 < (list2 == null ? 0 : list2.size()) && (list = this.f98398f) != null) {
                return (r45.ri0) list.get(i17);
            }
        }
        return null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f98398f == null) {
            return 0;
        }
        return (int) java.lang.Math.ceil(r0.size() / this.f98396d);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.widget.ImageView, android.view.View] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.view.View$OnClickListener, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View, com.tencent.mm.plugin.emoji.ui.v2.PaddingImageView] */
    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View inflate;
        com.tencent.mm.plugin.emoji.ui.v2.r0 r0Var;
        ?? r86;
        int i18 = this.f98396d;
        int i19 = this.f98399g;
        java.lang.Object obj = null;
        if (view == null || view.getTag() == null) {
            android.content.Context context = this.f98397e;
            inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488738a85, (android.view.ViewGroup) null);
            com.tencent.mm.plugin.emoji.ui.v2.r0 r0Var2 = new com.tencent.mm.plugin.emoji.ui.v2.r0(this);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.hhb);
            r0Var2.f98394a = linearLayout;
            int i27 = this.f98400h;
            linearLayout.setPadding(0, i27, 0, 0);
            inflate.setTag(r0Var2);
            for (int i28 = 0; i28 < i18; i28++) {
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                this.f98402m = layoutParams;
                layoutParams.leftMargin = i27;
                this.f98401i = new android.widget.LinearLayout.LayoutParams(i19, i19);
                com.tencent.mm.plugin.emoji.ui.v2.PaddingImageView paddingImageView = new com.tencent.mm.plugin.emoji.ui.v2.PaddingImageView(context);
                android.widget.LinearLayout.LayoutParams layoutParams2 = this.f98401i;
                paddingImageView.addView(paddingImageView.f98343d, layoutParams2);
                paddingImageView.addView(paddingImageView.f98344e, layoutParams2);
                r0Var2.f98394a.addView(paddingImageView, i28, this.f98402m);
            }
            r0Var = r0Var2;
        } else {
            r0Var = (com.tencent.mm.plugin.emoji.ui.v2.r0) view.getTag();
            inflate = view;
        }
        int i29 = 0;
        while (i29 < i18) {
            int i37 = (i17 * i18) + i29;
            ?? r96 = (com.tencent.mm.plugin.emoji.ui.v2.PaddingImageView) r0Var.f98394a.getChildAt(i29);
            java.util.List list = this.f98398f;
            if (i37 <= (list == null ? 0 : list.size()) - 1) {
                r45.ri0 item = getItem(i37);
                if (item != null) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(item.f384888f)) {
                        n11.a.b().h(item.f384888f, r96.getImageView(), y12.f.a(item.f384888f, rr.s.f399149a.d(item.f384886d), i19, new java.lang.Object[0]));
                        r96.setImportantForAccessibility(1);
                        r96.setContentDescription(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.bvt));
                    } else if (com.tencent.mm.sdk.platformtools.t8.K0(item.f384887e)) {
                        r96.setImportantForAccessibility(4);
                        com.tencent.mars.xlog.Log.w("MicroMsg.emoji.PreViewListGridAdapter", "this emoji has no thumb url and url. download faild");
                    } else {
                        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Di().h(item.f384887e, r96.getImageView(), y12.f.a(item.f384887e, com.tencent.mm.plugin.emoji.model.EmojiLogic.p(n22.m.g(), "", item.f384886d), i19, new java.lang.Object[0]));
                        r96.setImportantForAccessibility(1);
                        r96.setContentDescription(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.bvt));
                    }
                    r96.setClickable(true);
                    r96.getImageViewFG().setBackgroundResource(com.tencent.mm.R.drawable.emoji_grid_item_seq_fg);
                    r96.setOnClickListener(new com.tencent.mm.plugin.emoji.ui.v2.p0(this, r96, i37));
                    r86 = 0;
                } else {
                    r86 = 0;
                    r96.getImageViewFG().setBackgroundDrawable(null);
                    n11.a.b().g("", r96.getImageView());
                    com.tencent.mars.xlog.Log.w("MicroMsg.emoji.PreViewListGridAdapter", "item is null");
                    r96.setClickable(false);
                    r96.setOnClickListener(null);
                }
            } else {
                r86 = obj;
                r96.getImageViewFG().setBackgroundDrawable(r86);
                n11.a.b().g("", r96.getImageView());
                r96.setClickable(false);
                r96.setOnClickListener(r86);
                r96.setImportantForAccessibility(4);
            }
            i29++;
            obj = r86;
        }
        return inflate;
    }
}
