package b05;

/* loaded from: classes12.dex */
public final class e extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b05.f f98513b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b05.f fVar) {
        super(fVar);
        this.f98513b = fVar;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e holder, u13.g data, java.lang.Object... extraData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraData, "extraData");
        b05.f fVar = (b05.f) data;
        b05.d dVar = (b05.d) holder;
        u50.y yVar = (u50.y) i95.n0.c(u50.y.class);
        android.view.View view = dVar.f98512g;
        b05.f fVar2 = this.f98513b;
        boolean z17 = fVar2.f505294d;
        ((s50.r0) yVar).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.j(view, z17);
        if (fVar.f98515r == null) {
            android.view.View view2 = dVar.f98506a;
            if (view2 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/weshop/fts/FTSWeShopDataItem$FTSWeShopViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/weshop/fts/FTSWeShopDataItem$FTSWeShopViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = dVar.f98506a;
        if (view3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/weshop/fts/FTSWeShopDataItem$FTSWeShopViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/weshop/fts/FTSWeShopDataItem$FTSWeShopViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ImageView imageView = dVar.f98507b;
        java.lang.String str = "";
        java.lang.String str2 = null;
        if (imageView != null) {
            int h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561300eo);
            gk0.k kVar = new gk0.k(h17, h17);
            kVar.f353966d = 0.5f;
            tq.d dVar2 = fVar.f98515r;
            java.lang.String str3 = dVar2 != null ? dVar2.f502732d : null;
            if (str3 == null) {
                str3 = "";
            }
            ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).wi(imageView, str3, kVar);
        }
        android.widget.TextView textView = dVar.f98508c;
        if (textView != null) {
            textView.setText(fVar2.f98516s);
        }
        android.widget.ImageView imageView2 = dVar.f98509d;
        if (imageView2 != null) {
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                tq.d dVar3 = fVar.f98515r;
                if (dVar3 != null) {
                    str2 = dVar3.f502734f;
                }
            } else {
                tq.d dVar4 = fVar.f98515r;
                if (dVar4 != null) {
                    str2 = dVar4.f502733e;
                }
            }
            if (str2 == null) {
                str2 = "";
            }
            int h18 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).wi(imageView2, str2, new gk0.k(h18, h18));
            int i17 = str2.length() > 0 ? 0 : 8;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(imageView2, arrayList3.toArray(), "com/tencent/mm/plugin/weshop/fts/FTSWeShopDataItem$FTSWeShopViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(imageView2, "com/tencent/mm/plugin/weshop/fts/FTSWeShopDataItem$FTSWeShopViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        tq.d dVar5 = fVar2.f98515r;
        int i18 = dVar5 != null ? dVar5.f502736h : 0;
        if (i18 == 1) {
            str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o4u);
        } else if (i18 == 2) {
            str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o4t);
        } else if (i18 == 3) {
            str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o4s);
        } else if (i18 == 4) {
            str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p3q);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        android.widget.TextView textView2 = dVar.f98510e;
        if (textView2 != null) {
            textView2.setText(str);
        }
        android.widget.TextView textView3 = dVar.f98510e;
        if (textView3 != null) {
            int i19 = str.length() > 0 ? 0 : 8;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(textView3, arrayList4.toArray(), "com/tencent/mm/plugin/weshop/fts/FTSWeShopDataItem$FTSWeShopViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(textView3, "com/tencent/mm/plugin/weshop/fts/FTSWeShopDataItem$FTSWeShopViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (fVar2.f505297g != -8) {
            android.widget.TextView textView4 = dVar.f98511f;
            if (textView4 == null) {
                return;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(textView4, arrayList5.toArray(), "com/tencent/mm/plugin/weshop/fts/FTSWeShopDataItem$FTSWeShopViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(textView4, "com/tencent/mm/plugin/weshop/fts/FTSWeShopDataItem$FTSWeShopViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.widget.TextView textView5 = dVar.f98511f;
        if (textView5 != null) {
            textView5.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o3v));
        }
        android.widget.TextView textView6 = dVar.f98511f;
        if (textView6 == null) {
            return;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(textView6, arrayList6.toArray(), "com/tencent/mm/plugin/weshop/fts/FTSWeShopDataItem$FTSWeShopViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(textView6, "com/tencent/mm/plugin/weshop/fts/FTSWeShopDataItem$FTSWeShopViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup parent, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.egq, parent, false);
        b05.d dVar = this.f98513b.f98518u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(dVar, "null cannot be cast to non-null type com.tencent.mm.plugin.weshop.fts.FTSWeShopDataItem.FTSWeShopViewHolder");
        dVar.f98507b = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        dVar.f98508c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        dVar.f98506a = inflate.findViewById(com.p314xaae8f345.mm.R.id.mem);
        dVar.f98509d = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.uwf);
        dVar.f98510e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.nxa);
        dVar.f98511f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.mgb);
        dVar.f98512g = inflate.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        inflate.setTag(dVar);
        return inflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // u13.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(android.content.Context r11, android.view.View r12, u13.g r13, java.lang.Object... r14) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b05.e.d(android.content.Context, android.view.View, u13.g, java.lang.Object[]):boolean");
    }
}
