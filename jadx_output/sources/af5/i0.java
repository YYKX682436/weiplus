package af5;

/* loaded from: classes3.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingTingSpaceMvvmView f4582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z01.f0 f4583e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingTingSpaceMvvmView chattingTingSpaceMvvmView, z01.f0 f0Var) {
        super(1);
        this.f4582d = chattingTingSpaceMvvmView;
        this.f4583e = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.ImageView thumbIv = (android.widget.ImageView) obj;
        kotlin.jvm.internal.o.g(thumbIv, "thumbIv");
        android.view.ViewParent parent = thumbIv.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingTingSpaceMvvmView chattingTingSpaceMvvmView = this.f4582d;
            com.tencent.mm.plugin.ting.widget.TingSpaceCoverMvvmView tingSpaceCoverMvvmView = chattingTingSpaceMvvmView.f204639g;
            if (tingSpaceCoverMvvmView == null) {
                android.content.Context context = thumbIv.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                tingSpaceCoverMvvmView = new com.tencent.mm.plugin.ting.widget.TingSpaceCoverMvvmView(context, null, 0, 6, null);
            }
            android.view.ViewParent parent2 = tingSpaceCoverMvvmView.getParent();
            android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(tingSpaceCoverMvvmView);
            }
            thumbIv.setVisibility(4);
            viewGroup.addView(tingSpaceCoverMvvmView, viewGroup.indexOfChild(thumbIv) + 1, new android.widget.FrameLayout.LayoutParams(thumbIv.getLayoutParams().width, thumbIv.getLayoutParams().height));
            chattingTingSpaceMvvmView.f204639g = tingSpaceCoverMvvmView;
            java.util.List imageUrls = this.f4583e.f469011g;
            kotlin.jvm.internal.o.g(imageUrls, "imageUrls");
            java.util.ArrayList arrayList = (java.util.ArrayList) tingSpaceCoverMvvmView.f174883d;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                tingSpaceCoverMvvmView.removeView((android.widget.ImageView) it.next());
            }
            arrayList.clear();
            int size = imageUrls.size();
            int i17 = size <= 4 ? size : 4;
            if (i17 == 0) {
                i17 = 1;
            }
            float width = 0.0417f * tingSpaceCoverMvvmView.getWidth();
            int i18 = 0;
            while (i18 < i17) {
                android.widget.ImageView imageView = new android.widget.ImageView(tingSpaceCoverMvvmView.getContext());
                imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                imageView.setClipToOutline(true);
                imageView.setOutlineProvider(new nm4.q(width));
                tingSpaceCoverMvvmView.addView(imageView);
                arrayList.add(imageView);
                if (i18 < imageUrls.size()) {
                    java.lang.String str = (java.lang.String) imageUrls.get(i18);
                    if (str.length() > 0) {
                        try {
                            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).bj(str, imageView, new nm4.r(i18 == 0, tingSpaceCoverMvvmView));
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.TingSpaceCoverMvvmView", "loadImage error: %s", e17.getMessage());
                        }
                    }
                }
                i18++;
            }
            if (imageUrls.isEmpty() && (!arrayList.isEmpty())) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) kz5.n0.X(arrayList);
                int defaultImageResId = tingSpaceCoverMvvmView.getDefaultImageResId();
                imageView2.setImageResource(defaultImageResId);
                try {
                    android.content.res.Resources resources = tingSpaceCoverMvvmView.getResources();
                    android.content.res.Resources.Theme theme = tingSpaceCoverMvvmView.getContext().getTheme();
                    java.lang.ThreadLocal threadLocal = d3.q.f226108a;
                    android.graphics.drawable.Drawable a17 = d3.l.a(resources, defaultImageResId, theme);
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
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(java.lang.Integer.valueOf(intrinsicHeight));
                        arrayList2.add(java.lang.Integer.valueOf(intrinsicWidth));
                        java.lang.Object obj2 = new java.lang.Object();
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/ting/widget/TingSpaceCoverMvvmView", "pickColorFromDefaultImage", "(I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
                        yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/ting/widget/TingSpaceCoverMvvmView", "pickColorFromDefaultImage", "(I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
                        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                        a17.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        a17.draw(canvas);
                        tingSpaceCoverMvvmView.a("default_album_music", createBitmap);
                    }
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TingSpaceCoverMvvmView", "pickColorFromDefaultImage error: %s", e18.getMessage());
                }
            }
            tingSpaceCoverMvvmView.requestLayout();
        }
        return jz5.f0.f302826a;
    }
}
