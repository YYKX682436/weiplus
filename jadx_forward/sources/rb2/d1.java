package rb2;

/* loaded from: classes3.dex */
public final class d1 extends android.widget.BaseAdapter {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f475137i = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f475138d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f475139e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f475140f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f475141g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15 f475142h;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15 c13709xbc18ee15, java.lang.String str, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i17 & 1) != 0 ? null : str;
        z17 = (i17 & 2) != 0 ? false : z17;
        this.f475142h = c13709xbc18ee15;
        this.f475138d = z17;
        this.f475139e = str;
    }

    public final void a(java.lang.String str) {
        this.f475141g = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15 c13709xbc18ee15 = this.f475142h;
        if (c13709xbc18ee15.f184611l1) {
            return;
        }
        gd2.n menuData = c13709xbc18ee15.getMenuData();
        boolean z17 = false;
        if (menuData != null && menuData.a(str)) {
            z17 = true;
        }
        c13709xbc18ee15.f184611l1 = z17;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f475139e;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup parent) {
        android.view.View progressBar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        java.lang.String str = this.f475139e;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        android.graphics.Bitmap bitmap = this.f475140f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15 c13709xbc18ee15 = this.f475142h;
        if (bitmap == null || view == null || str == null) {
            progressBar = new android.widget.ProgressBar(c13709xbc18ee15.getContext(), null, 0, com.p314xaae8f345.mm.R.C30868x68b1db1.f576320w9);
            progressBar.setLayoutParams(new android.widget.Gallery.LayoutParams(-2, -2));
        } else {
            progressBar = view;
        }
        h0Var.f391656d = progressBar;
        if (progressBar instanceof android.widget.ProgressBar) {
            android.graphics.Bitmap bitmap2 = this.f475140f;
            if (bitmap2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(progressBar, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(progressBar, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                progressBar.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                android.view.View view2 = progressBar;
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(view2, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = new com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a(c13709xbc18ee15.getContext(), bitmap2.getWidth(), bitmap2.getHeight());
                c21524xecd57b9a.setImageBitmap(bitmap2);
                c21524xecd57b9a.i();
                h0Var.f391656d = c21524xecd57b9a;
                c21524xecd57b9a.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
                return (android.view.View) h0Var.f391656d;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(progressBar, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(progressBar, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            progressBar.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            android.view.View view3 = progressBar;
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view3, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f475140f == null && str != null) {
            if (this.f475138d) {
                vo0.e eVar = vo0.e.f520000a;
                wo0.c i18 = vo0.e.f520001b.i(str);
                i18.f529406d = new rb2.a1(str, this, i17, h0Var);
                i18.d();
            } else {
                wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e));
                if (a17 instanceof wo0.b) {
                    a17.f529406d = new rb2.c1(str, this, i17, h0Var);
                    a17.d();
                }
            }
        }
        return (android.view.View) h0Var.f391656d;
    }
}
