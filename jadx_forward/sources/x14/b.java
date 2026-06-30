package x14;

/* loaded from: classes5.dex */
public final class b extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5.C17502xca6168ae f532965d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5.C17502xca6168ae c17502xca6168ae) {
        this.f532965d = c17502xca6168ae;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return java.lang.Integer.valueOf(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        x14.a aVar;
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5.C17502xca6168ae c17502xca6168ae = this.f532965d;
        if (view == null) {
            aVar = new x14.a(this);
            view2 = android.view.View.inflate(c17502xca6168ae.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.d3s, null);
            android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.gxh);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type android.widget.ProgressBar");
            aVar.f532962a = (android.widget.ProgressBar) findViewById;
            android.view.View findViewById2 = view2.findViewById(com.p314xaae8f345.mm.R.id.gxg);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            aVar.f532963b = (android.widget.ImageView) findViewById2;
            aVar.f532964c = view2.findViewById(com.p314xaae8f345.mm.R.id.gxi);
            view2.setTag(aVar);
        } else {
            java.lang.Object tag = view.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView.ImageAdapter.ViewHolder");
            aVar = (x14.a) tag;
            view2 = view;
        }
        view2.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
        android.graphics.Bitmap bitmap = c17502xca6168ae.f243186y1;
        if (bitmap != null) {
            android.widget.ProgressBar progressBar = aVar.f532962a;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            android.widget.ImageView imageView = aVar.f532963b;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            android.view.View view3 = aVar.f532964c;
            if (view3 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/view/GetHdHeadImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/setting/ui/setting/view/GetHdHeadImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = new com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a(c17502xca6168ae.getContext(), bitmap.getWidth(), bitmap.getHeight());
            c21524xecd57b9a.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
            c21524xecd57b9a.setImageBitmap(bitmap);
            c21524xecd57b9a.mo79202xa3d97c26(2.0f);
            c21524xecd57b9a.m79201x4cf4f0ef(true);
            return c21524xecd57b9a;
        }
        if (c17502xca6168ae.f243187z1) {
            android.widget.ProgressBar progressBar2 = aVar.f532962a;
            if (progressBar2 != null) {
                progressBar2.setVisibility(8);
            }
            android.view.View view4 = aVar.f532964c;
            if (view4 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/view/GetHdHeadImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/setting/ui/setting/view/GetHdHeadImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.widget.ProgressBar progressBar3 = aVar.f532962a;
            if (progressBar3 != null) {
                progressBar3.setVisibility(0);
            }
            android.view.View view5 = aVar.f532964c;
            if (view5 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/view/GetHdHeadImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/setting/ui/setting/view/GetHdHeadImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.widget.ImageView imageView2 = aVar.f532963b;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        android.widget.ImageView imageView3 = aVar.f532963b;
        if (imageView3 != null) {
            imageView3.setImageBitmap(c17502xca6168ae.f243184x1);
        }
        return view2;
    }
}
