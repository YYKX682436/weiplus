package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB#\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001dJ\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderFeedAlbumView;", "Lcom/tencent/mm/ui/widget/RoundedCornerFrameLayout;", "Lzy2/x6;", "Lzy2/v6;", "Lzy2/w6;", "adapter", "Ljz5/f0;", "setAdapter", "", "m", "I", "getItemViewWidth", "()I", "setItemViewWidth", "(I)V", "itemViewWidth", "", "n", "F", "getPadding", "()F", "padding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderFeedAlbumView */
/* loaded from: classes2.dex */
public final class C15284x9cdf7710 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 implements zy2.x6 {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f212602g;

    /* renamed from: h, reason: collision with root package name */
    public zy2.v6 f212603h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f212604i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public int itemViewWidth;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final float padding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15284x9cdf7710(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f212602g = new java.util.HashMap();
        this.itemViewWidth = -1;
        this.padding = getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl) / 2;
    }

    public final zy2.w6 c(int i17, int i18, int i19, int i27, int i28) {
        tw2.c cVar;
        zy2.v6 v6Var = this.f212603h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v6Var);
        tw2.e eVar = (tw2.e) v6Var;
        java.util.List list = eVar.f503997a;
        int m75939xb282bd08 = i28 == 0 ? ((r45.mb4) list.get(i28)).m75939xb282bd08(2) : 2;
        java.util.LinkedList linkedList = (java.util.LinkedList) this.f212602g.get(java.lang.Integer.valueOf(m75939xb282bd08));
        zy2.w6 w6Var = linkedList != null ? (zy2.w6) linkedList.poll() : null;
        if (w6Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(android.view.LayoutInflater.from(getContext()), "from(...)");
            android.content.Context context = getContext();
            int m75939xb282bd082 = i28 == 0 ? ((r45.mb4) list.get(i28)).m75939xb282bd08(2) : 2;
            if (i28 == 0 && m75939xb282bd082 == 4 && eVar.f503998b) {
                android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b2j, (android.view.ViewGroup) this, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
                cVar = new tw2.c(inflate);
            } else {
                android.widget.ImageView imageView = new android.widget.ImageView(context);
                imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                cVar = new tw2.c(imageView);
            }
            w6Var = cVar;
        }
        w6Var.f559137a.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i17, i18));
        android.view.View view = w6Var.f559137a;
        view.setTag(com.p314xaae8f345.mm.R.id.e_6, w6Var);
        view.setTag(com.p314xaae8f345.mm.R.id.e_7, java.lang.Integer.valueOf(m75939xb282bd08));
        view.setTranslationX(i19);
        view.setTranslationY(i27);
        return w6Var;
    }

    public int getItemViewWidth() {
        return this.itemViewWidth;
    }

    public final float getPadding() {
        return this.padding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [r45.mb4, com.tencent.mm.protobuf.e] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.tencent.mm.plugin.finder.video.FinderVideoLayout] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        zy2.w6 c17;
        int i28;
        ?? r86;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        cw2.f8 b17;
        super.onLayout(z17, i17, i18, i19, i27);
        int paddingTop = ((i27 - i18) - getPaddingTop()) - getPaddingBottom();
        int paddingStart = ((i19 - i17) - getPaddingStart()) - getPaddingEnd();
        zy2.v6 v6Var = this.f212603h;
        int size = v6Var != null ? ((tw2.e) v6Var).f503997a.size() : 0;
        int i29 = 4;
        int i37 = 4 > size ? size : 4;
        if (i37 <= 0) {
            return;
        }
        boolean z18 = this.f212604i;
        if (z17 || z18) {
            removeAllViews();
            float f17 = paddingTop / 3.0f;
            float f18 = paddingStart / 3.0f;
            int i38 = 0;
            while (i38 < i37) {
                if (i38 != 0) {
                    float f19 = this.padding;
                    if (i38 == 1) {
                        c17 = c(a06.d.b(f18), a06.d.b(1.5f * f17), a06.d.b((2 * f18) + f19), 0, i38);
                    } else if (i38 != 2) {
                        float f27 = 1.5f * f17;
                        c17 = c(a06.d.b(f18), a06.d.b(f27), a06.d.b((2 * f18) + f19), a06.d.b(f27 + f19), i38);
                    } else {
                        float f28 = 2;
                        c17 = c(a06.d.b(f18 * f28), a06.d.b(f17), 0, a06.d.b((f28 * f17) + f19), i38);
                    }
                } else {
                    float f29 = 2;
                    c17 = c(a06.d.b(f18 * f29), a06.d.b(f29 * f17), 0, 0, i38);
                }
                android.view.View view = c17.f559137a;
                addViewInLayout(view, i38, view.getLayoutParams());
                zy2.v6 v6Var2 = this.f212603h;
                if (v6Var2 != null) {
                    tw2.e eVar = (tw2.e) v6Var2;
                    android.view.View itemView = c17.f559137a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
                    ?? r27 = (r45.mb4) eVar.f503997a.get(i38);
                    int m75939xb282bd08 = i38 == 0 ? ((r45.mb4) eVar.f503997a.get(i38)).m75939xb282bd08(2) : 2;
                    if (i38 == 0 && m75939xb282bd08 == i29 && eVar.f503998b) {
                        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.e_k);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = findViewById instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) findViewById : 0;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys a17 = eVar.a();
                        if (a17 == null || (linkedList = a17.f192727f) == null || (abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) linkedList.getFirst()) == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (b17 = eVar.b()) == null) {
                            r86 = 1;
                            i28 = i38;
                        } else {
                            if (c15196x85976f5f != 0) {
                                c15196x85976f5f.m61512xab2cb478(b17);
                            }
                            if (c15196x85976f5f != 0) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88.f36135x233c02ec.b(feedObject);
                                r86 = 1;
                                i28 = i38;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f.v(c15196x85976f5f, i38, b18, null, 0, null, null, false, false, null, 508, null);
                            } else {
                                r86 = 1;
                                i28 = i38;
                            }
                            if (c15196x85976f5f != 0) {
                                c15196x85976f5f.mo61320x764d819b(r86);
                            }
                            if (c15196x85976f5f != 0) {
                                c15196x85976f5f.m61495xa8814dba(false);
                            }
                        }
                    } else {
                        r86 = 1;
                        i28 = i38;
                        android.widget.ImageView imageView = (android.widget.ImageView) itemView;
                        java.lang.String m75945x2fec8307 = r27.m75945x2fec8307(1);
                        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                            imageView.setImageDrawable(new android.graphics.drawable.ColorDrawable(imageView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744)));
                        } else {
                            mn2.g1 g1Var = mn2.g1.f411508a;
                            g1Var.e().b(new mn2.c1(r27, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null), g1Var.h(mn2.f1.f411486d)).c(imageView);
                        }
                    }
                    java.lang.String m75945x2fec83072 = r27.m75945x2fec8307(r86);
                    if ((m75945x2fec83072 == null || m75945x2fec83072.length() == 0) ? r86 : false) {
                        itemView.setOnClickListener(null);
                    } else {
                        zy2.u6 u6Var = eVar.f503999c;
                        if (u6Var != null) {
                            itemView.setOnClickListener(new tw2.d(u6Var, i28));
                        }
                    }
                } else {
                    i28 = i38;
                }
                i38 = i28 + 1;
                i29 = 4;
            }
            this.f212604i = false;
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        java.util.LinkedList linkedList;
        super.onViewRemoved(view);
        java.lang.Object tag = view != null ? view.getTag(com.p314xaae8f345.mm.R.id.e_6) : null;
        zy2.w6 w6Var = tag instanceof zy2.w6 ? (zy2.w6) tag : null;
        java.lang.Object tag2 = view != null ? view.getTag(com.p314xaae8f345.mm.R.id.e_7) : null;
        java.lang.Integer num = tag2 instanceof java.lang.Integer ? (java.lang.Integer) tag2 : null;
        int intValue = num != null ? num.intValue() : 0;
        if (w6Var != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
            java.util.HashMap hashMap = this.f212602g;
            if (hashMap.containsKey(valueOf)) {
                java.lang.Object obj = hashMap.get(java.lang.Integer.valueOf(intValue));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                linkedList = (java.util.LinkedList) obj;
            } else {
                linkedList = new java.util.LinkedList();
                hashMap.put(java.lang.Integer.valueOf(intValue), linkedList);
            }
            if (linkedList.contains(w6Var)) {
                return;
            }
            linkedList.add(w6Var);
        }
    }

    @Override // zy2.x6
    /* renamed from: setAdapter */
    public void mo62058x6cab2c8d(zy2.v6 adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        this.f212603h = adapter;
        this.f212604i = true;
        isInLayout();
        post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.q9(this));
    }

    @Override // zy2.x6
    /* renamed from: setItemViewWidth */
    public void mo62059x7b2c6f0c(int i17) {
        this.itemViewWidth = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15284x9cdf7710(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f212602g = new java.util.HashMap();
        this.itemViewWidth = -1;
        this.padding = getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl) / 2;
    }
}
