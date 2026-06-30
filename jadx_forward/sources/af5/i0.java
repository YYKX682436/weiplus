package af5;

/* loaded from: classes3.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22091x34f6adf7 f86115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z01.f0 f86116e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22091x34f6adf7 c22091x34f6adf7, z01.f0 f0Var) {
        super(1);
        this.f86115d = c22091x34f6adf7;
        this.f86116e = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.ImageView thumbIv = (android.widget.ImageView) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbIv, "thumbIv");
        android.view.ViewParent parent = thumbIv.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22091x34f6adf7 c22091x34f6adf7 = this.f86115d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18738x2b7fba04 c18738x2b7fba04 = c22091x34f6adf7.f286172g;
            if (c18738x2b7fba04 == null) {
                android.content.Context context = thumbIv.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                c18738x2b7fba04 = new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18738x2b7fba04(context, null, 0, 6, null);
            }
            android.view.ViewParent parent2 = c18738x2b7fba04.getParent();
            android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(c18738x2b7fba04);
            }
            thumbIv.setVisibility(4);
            viewGroup.addView(c18738x2b7fba04, viewGroup.indexOfChild(thumbIv) + 1, new android.widget.FrameLayout.LayoutParams(thumbIv.getLayoutParams().width, thumbIv.getLayoutParams().height));
            c22091x34f6adf7.f286172g = c18738x2b7fba04;
            java.util.List imageUrls = this.f86116e.f550544g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageUrls, "imageUrls");
            java.util.ArrayList arrayList = (java.util.ArrayList) c18738x2b7fba04.f256416d;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c18738x2b7fba04.removeView((android.widget.ImageView) it.next());
            }
            arrayList.clear();
            int size = imageUrls.size();
            int i17 = size <= 4 ? size : 4;
            if (i17 == 0) {
                i17 = 1;
            }
            float width = 0.0417f * c18738x2b7fba04.getWidth();
            int i18 = 0;
            while (i18 < i17) {
                android.widget.ImageView imageView = new android.widget.ImageView(c18738x2b7fba04.getContext());
                imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                imageView.setClipToOutline(true);
                imageView.setOutlineProvider(new nm4.q(width));
                c18738x2b7fba04.addView(imageView);
                arrayList.add(imageView);
                if (i18 < imageUrls.size()) {
                    java.lang.String str = (java.lang.String) imageUrls.get(i18);
                    if (str.length() > 0) {
                        try {
                            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).bj(str, imageView, new nm4.r(i18 == 0, c18738x2b7fba04));
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingSpaceCoverMvvmView", "loadImage error: %s", e17.getMessage());
                        }
                    }
                }
                i18++;
            }
            if (imageUrls.isEmpty() && (!arrayList.isEmpty())) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) kz5.n0.X(arrayList);
                int m72287xf1b3dab = c18738x2b7fba04.m72287xf1b3dab();
                imageView2.setImageResource(m72287xf1b3dab);
                try {
                    android.content.res.Resources resources = c18738x2b7fba04.getResources();
                    android.content.res.Resources.Theme theme = c18738x2b7fba04.getContext().getTheme();
                    java.lang.ThreadLocal threadLocal = d3.q.f307641a;
                    android.graphics.drawable.Drawable a17 = d3.l.a(resources, m72287xf1b3dab, theme);
                    if (a17 != null) {
                        int intrinsicWidth = a17.getIntrinsicWidth();
                        if (intrinsicWidth < 1) {
                            intrinsicWidth = 1;
                        }
                        int intrinsicHeight = a17.getIntrinsicHeight();
                        if (intrinsicHeight < 1) {
                            intrinsicHeight = 1;
                        }
                        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(config);
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList2.add(java.lang.Integer.valueOf(intrinsicHeight));
                        arrayList2.add(java.lang.Integer.valueOf(intrinsicWidth));
                        java.lang.Object obj2 = new java.lang.Object();
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/ting/widget/TingSpaceCoverMvvmView", "pickColorFromDefaultImage", "(I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
                        yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/ting/widget/TingSpaceCoverMvvmView", "pickColorFromDefaultImage", "(I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
                        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                        a17.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        a17.draw(canvas);
                        c18738x2b7fba04.a("default_album_music", createBitmap);
                    }
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingSpaceCoverMvvmView", "pickColorFromDefaultImage error: %s", e18.getMessage());
                }
            }
            c18738x2b7fba04.requestLayout();
        }
        return jz5.f0.f384359a;
    }
}
