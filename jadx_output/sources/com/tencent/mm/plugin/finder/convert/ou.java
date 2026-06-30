package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ou extends com.tencent.mm.plugin.finder.convert.mu {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f104219f;

    /* renamed from: g, reason: collision with root package name */
    public final int f104220g;

    public ou(boolean z17) {
        int i17;
        this.f104219f = z17;
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.System.nanoTime();
        boolean z18 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i18 = a17.f197135a;
        if (!z18 && i18 > (i17 = a17.f197136b)) {
            i18 = i17;
        }
        this.f104220g = i18;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b7n;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ms2.e eVar;
        android.widget.TextView textView;
        int i19;
        java.util.LinkedList linkedList;
        ms2.e item = (ms2.e) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.f484927fz0);
        android.widget.TextView textView2 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.f486467lb4);
        android.widget.TextView textView3 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.f486465lb2);
        android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.qxa);
        r45.dg4 dg4Var = item.f330973d;
        if (dg4Var.f372424n == 26) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            eVar = item;
            textView = textView3;
            i19 = 0;
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderProfileTingSonglistPatchItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/profile/ting/FinderTingSongListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderProfileTingSonglistPatchItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/profile/ting/FinderTingSongListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            eVar = item;
            textView = textView3;
            i19 = 0;
        }
        android.content.Context context = holder.f293121e;
        int dimension = (this.f104220g - ((int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479724dg))) / 2;
        if (dimension > 0) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = dimension;
            layoutParams.height = dimension;
            imageView.setLayoutParams(layoutParams);
        }
        kotlin.jvm.internal.o.d(imageView);
        r45.fg4 fg4Var = dg4Var.G;
        java.lang.String str = (fg4Var == null || (linkedList = fg4Var.f374313e) == null) ? null : (java.lang.String) kz5.n0.Z(linkedList);
        if (((str == null || str.length() == 0) ? 1 : i19) != 0 && (str = dg4Var.f372421h) == null) {
            str = "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.e().c(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128355e), imageView, g1Var.h(mn2.f1.f329953d));
        }
        textView2.setText(dg4Var.f372418e);
        int i27 = dg4Var.f372430t;
        if (i27 > 0) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.f07);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i27)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            textView.setText(format);
        } else {
            textView.setVisibility(8);
        }
        android.view.View findViewById2 = holder.itemView.findViewById(com.tencent.mm.R.id.q09);
        if (this.f104219f) {
            int i28 = dg4Var.f372427q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderProfileTingSonglistPatchItemConvert", "setPlayInfoLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/profile/ting/FinderTingSongListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(i19)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/convert/FinderProfileTingSonglistPatchItemConvert", "setPlayInfoLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/profile/ting/FinderTingSongListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((com.tencent.mm.ui.widget.imageview.WeImageView) holder.itemView.findViewById(com.tencent.mm.R.id.q08)).setImageResource(com.tencent.mm.R.drawable.cl7);
            android.widget.TextView textView4 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.q07);
            if (textView4 != null) {
                textView4.setText(n(i28));
            }
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderProfileTingSonglistPatchItemConvert", "setPlayInfoLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/profile/ting/FinderTingSongListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(i19)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/convert/FinderProfileTingSonglistPatchItemConvert", "setPlayInfoLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/profile/ting/FinderTingSongListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.itemView, "song_sheet_content");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(holder.itemView, new com.tencent.mm.plugin.finder.convert.nu(holder, eVar));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(holder.itemView, 40, 25496);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
