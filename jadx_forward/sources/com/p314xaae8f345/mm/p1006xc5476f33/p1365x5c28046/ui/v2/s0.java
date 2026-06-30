package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* loaded from: classes15.dex */
public class s0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final int f179929d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f179930e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f179931f;

    /* renamed from: g, reason: collision with root package name */
    public final int f179932g;

    /* renamed from: h, reason: collision with root package name */
    public final int f179933h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout.LayoutParams f179934i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout.LayoutParams f179935m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.q0 f179936n;

    public s0(android.content.Context context, int i17) {
        this.f179929d = 3;
        this.f179929d = i17;
        this.f179930e = context;
        int B = i65.a.B(context);
        this.f179932g = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561893vn);
        this.f179933h = (int) ((B - (r3 * i17)) / (i17 + 1.0f));
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r45.ri0 getItem(int i17) {
        java.util.List list;
        if (i17 >= 0) {
            java.util.List list2 = this.f179931f;
            if (i17 < (list2 == null ? 0 : list2.size()) && (list = this.f179931f) != null) {
                return (r45.ri0) list.get(i17);
            }
        }
        return null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f179931f == null) {
            return 0;
        }
        return (int) java.lang.Math.ceil(r0.size() / this.f179929d);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.r0 r0Var;
        ?? r86;
        int i18 = this.f179929d;
        int i19 = this.f179932g;
        java.lang.Object obj = null;
        if (view == null || view.getTag() == null) {
            android.content.Context context = this.f179930e;
            inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570271a85, (android.view.ViewGroup) null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.r0 r0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.r0(this);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.hhb);
            r0Var2.f179927a = linearLayout;
            int i27 = this.f179933h;
            linearLayout.setPadding(0, i27, 0, 0);
            inflate.setTag(r0Var2);
            for (int i28 = 0; i28 < i18; i28++) {
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                this.f179935m = layoutParams;
                layoutParams.leftMargin = i27;
                this.f179934i = new android.widget.LinearLayout.LayoutParams(i19, i19);
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13357x9e535daf c13357x9e535daf = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13357x9e535daf(context);
                android.widget.LinearLayout.LayoutParams layoutParams2 = this.f179934i;
                c13357x9e535daf.addView(c13357x9e535daf.f179876d, layoutParams2);
                c13357x9e535daf.addView(c13357x9e535daf.f179877e, layoutParams2);
                r0Var2.f179927a.addView(c13357x9e535daf, i28, this.f179935m);
            }
            r0Var = r0Var2;
        } else {
            r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.r0) view.getTag();
            inflate = view;
        }
        int i29 = 0;
        while (i29 < i18) {
            int i37 = (i17 * i18) + i29;
            ?? r96 = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13357x9e535daf) r0Var.f179927a.getChildAt(i29);
            java.util.List list = this.f179931f;
            if (i37 <= (list == null ? 0 : list.size()) - 1) {
                r45.ri0 item = getItem(i37);
                if (item != null) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f466421f)) {
                        n11.a.b().h(item.f466421f, r96.m54841xcb16a3ea(), y12.f.a(item.f466421f, rr.s.f480682a.d(item.f466419d), i19, new java.lang.Object[0]));
                        r96.setImportantForAccessibility(1);
                        r96.setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.bvt));
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f466420e)) {
                        r96.setImportantForAccessibility(4);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.PreViewListGridAdapter", "this emoji has no thumb url and url. download faild");
                    } else {
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Di().h(item.f466420e, r96.m54841xcb16a3ea(), y12.f.a(item.f466420e, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.p(n22.m.g(), "", item.f466419d), i19, new java.lang.Object[0]));
                        r96.setImportantForAccessibility(1);
                        r96.setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.bvt));
                    }
                    r96.setClickable(true);
                    r96.m54842x5ffd5a2b().setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f78001xee58c2ad);
                    r96.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.p0(this, r96, i37));
                    r86 = 0;
                } else {
                    r86 = 0;
                    r96.m54842x5ffd5a2b().setBackgroundDrawable(null);
                    n11.a.b().g("", r96.m54841xcb16a3ea());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.PreViewListGridAdapter", "item is null");
                    r96.setClickable(false);
                    r96.setOnClickListener(null);
                }
            } else {
                r86 = obj;
                r96.m54842x5ffd5a2b().setBackgroundDrawable(r86);
                n11.a.b().g("", r96.m54841xcb16a3ea());
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
