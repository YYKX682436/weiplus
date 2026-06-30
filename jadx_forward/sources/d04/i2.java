package d04;

/* loaded from: classes8.dex */
public final class i2 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f306975e = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);

    @Override // in5.r
    public in5.s0 d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, android.view.View convertView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convertView, "convertView");
        return new d04.c2(convertView);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570958en0;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        d04.j2 item = (d04.j2) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        if (holder instanceof d04.c2) {
            d04.c2 c2Var = (d04.c2) holder;
            android.view.ViewGroup viewGroup = c2Var.f306926n;
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                int i19 = item.f306982g;
                layoutParams.width = i19;
                layoutParams.height = i19;
            } else {
                layoutParams = null;
            }
            viewGroup.setLayoutParams(layoutParams);
            android.view.View view = c2Var.f306929q;
            android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10.E;
                layoutParams2.width = i27;
                layoutParams2.height = i27;
                if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
                    int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10.F;
                    marginLayoutParams.rightMargin = i28;
                    marginLayoutParams.bottomMargin = i28;
                }
            } else {
                layoutParams2 = null;
            }
            view.setLayoutParams(layoutParams2);
            android.widget.ProgressBar progressBar = c2Var.f306928p;
            android.view.ViewGroup.LayoutParams layoutParams3 = progressBar.getLayoutParams();
            if (layoutParams3 != null) {
                int i29 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10.E;
                layoutParams3.width = i29;
                layoutParams3.height = i29;
                if (layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams3;
                    int i37 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10.F;
                    marginLayoutParams2.rightMargin = i37;
                    marginLayoutParams2.bottomMargin = i37;
                }
            } else {
                layoutParams3 = null;
            }
            progressBar.setLayoutParams(layoutParams3);
            sz3.w0 w0Var = item.f306979d;
            if (w0Var.f495670h == 1) {
                c2Var.f306928p.setVisibility(0);
                android.view.View view2 = c2Var.f306929q;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductNewMaskDecorView$ScanProductListNormalItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/scanner/ui/widget/ScanProductNewMaskDecorView$ScanProductLiveListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductNewMaskDecorView$ScanProductListNormalItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/scanner/ui/widget/ScanProductNewMaskDecorView$ScanProductLiveListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                c2Var.f306928p.setVisibility(8);
                android.view.View view3 = c2Var.f306929q;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductNewMaskDecorView$ScanProductListNormalItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/scanner/ui/widget/ScanProductNewMaskDecorView$ScanProductLiveListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductNewMaskDecorView$ScanProductListNormalItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/scanner/ui/widget/ScanProductNewMaskDecorView$ScanProductLiveListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            c2Var.f306927o.m81387x205ac394(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10.D);
            c2Var.f306927o.setImageBitmap(null);
            c2Var.f306927o.setTag(java.lang.Integer.valueOf(w0Var.f495671i));
            int i38 = w0Var.f495671i;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = c2Var.f306927o;
            byte[] bArr = w0Var.f495668f;
            int i39 = w0Var.f495669g;
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17334xac4daa10.H.get(java.lang.String.valueOf(i38));
            if (bitmap == null || bitmap.isRecycled()) {
                ((ku5.t0) ku5.t0.f394148d).g(new d04.h2(i39, bArr, this, i38, c22628xfde5d61d));
            } else {
                c22628xfde5d61d.setImageBitmap(bitmap);
            }
            w0Var.m165542x9616526c();
        }
    }
}
