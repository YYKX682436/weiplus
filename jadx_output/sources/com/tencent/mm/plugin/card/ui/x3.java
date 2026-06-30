package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class x3 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f95437a;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Bitmap f95439c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f95440d;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f95443g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f95444h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f95445i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f95446j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View f95447k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.ImageView f95448l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMVerticalTextView f95449m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMVerticalTextView f95450n;

    /* renamed from: q, reason: collision with root package name */
    public tt1.j f95453q;

    /* renamed from: b, reason: collision with root package name */
    public boolean f95438b = true;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f95441e = null;

    /* renamed from: f, reason: collision with root package name */
    public db5.d5 f95442f = null;

    /* renamed from: o, reason: collision with root package name */
    public float f95451o = 0.0f;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f95452p = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f95454r = "";

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View.OnClickListener f95455s = new com.tencent.mm.plugin.card.ui.u3(this);

    public x3(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f95437a = mMActivity;
    }

    public void a(android.view.View view, boolean z17) {
        if (this.f95451o < 0.8f) {
            android.view.WindowManager.LayoutParams attributes = this.f95437a.getWindow().getAttributes();
            attributes.screenBrightness = 0.8f;
            this.f95437a.getWindow().setAttributes(attributes);
        }
        this.f95438b = z17;
        db5.d5 d5Var = this.f95442f;
        if (d5Var == null || d5Var.isShowing()) {
            return;
        }
        this.f95442f.showAtLocation(view.getRootView(), 17, 0, 0);
        this.f95442f.setFocusable(true);
        this.f95442f.setTouchable(true);
        this.f95442f.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(16777215));
        this.f95442f.setOutsideTouchable(true);
        boolean z18 = this.f95438b;
        android.view.View.OnClickListener onClickListener = this.f95455s;
        java.lang.String str = "";
        if (z18) {
            this.f95448l.setOnClickListener(onClickListener);
            android.graphics.Bitmap bitmap = this.f95441e;
            android.graphics.Bitmap bitmap2 = this.f95440d;
            if (bitmap2 != null) {
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.reset();
                matrix.setRotate(90.0f, bitmap2.getWidth() / 2, bitmap2.getHeight() / 2);
                int width = bitmap2.getWidth();
                int height = bitmap2.getHeight();
                zj0.a aVar = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                aVar.c(java.lang.Boolean.TRUE);
                aVar.c(matrix);
                aVar.c(java.lang.Integer.valueOf(height));
                aVar.c(java.lang.Integer.valueOf(width));
                aVar.c(0);
                aVar.c(0);
                aVar.c(bitmap2);
                java.lang.Object obj = new java.lang.Object();
                yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/card/util/CardUtil", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, "(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
                yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/card/util/CardUtil", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, "(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                this.f95441e = createBitmap;
            } else {
                this.f95441e = null;
            }
            this.f95448l.setImageBitmap(this.f95441e);
            java.util.ArrayList arrayList = this.f95452p;
            arrayList.add(0, bitmap);
            if (arrayList.size() > 2) {
                for (int size = arrayList.size() - 1; size > 1; size--) {
                    lu1.a0.F((android.graphics.Bitmap) arrayList.remove(size));
                }
            }
            android.view.View view2 = this.f95443g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f95447k;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.String str2 = this.f95453q.i0().f385189o;
            if (this.f95453q.s0().f388556p0 == null || !this.f95453q.s0().f388556p0.f373426d) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f95453q.i0().C)) {
                    str = this.f95453q.i0().C;
                } else if (!this.f95453q.N()) {
                    str = str2;
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f95454r)) {
                    str = this.f95454r;
                }
            }
            if (android.text.TextUtils.isEmpty(str) || str.length() > 40) {
                this.f95449m.setVisibility(8);
            } else {
                this.f95449m.setText(lu1.g0.a(4, str, true));
                if (this.f95453q.m()) {
                    this.f95449m.setVisibility(0);
                } else {
                    this.f95449m.setVisibility(8);
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f95453q.s0().f388558q)) {
                this.f95450n.setVisibility(8);
            } else {
                this.f95450n.setText(this.f95453q.s0().f388558q);
                this.f95450n.setVisibility(0);
            }
        } else {
            this.f95444h.setOnClickListener(onClickListener);
            this.f95444h.setImageBitmap(this.f95439c);
            java.lang.String str3 = this.f95453q.i0().f385189o;
            if (this.f95453q.s0().f388556p0 == null || !this.f95453q.s0().f388556p0.f373426d) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f95453q.i0().C)) {
                    str = this.f95453q.i0().C;
                } else if (!this.f95453q.N()) {
                    str = str3;
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f95454r)) {
                    str = this.f95454r;
                }
            }
            if (android.text.TextUtils.isEmpty(str) || str.length() > 40) {
                this.f95445i.setVisibility(8);
            } else {
                this.f95445i.setText(lu1.g0.a(4, str, true));
                if (this.f95453q.m()) {
                    this.f95445i.setVisibility(0);
                } else {
                    this.f95445i.setVisibility(8);
                }
            }
            if (android.text.TextUtils.isEmpty(this.f95453q.s0().f388558q)) {
                this.f95446j.setVisibility(8);
            } else {
                this.f95446j.setText(this.f95453q.s0().f388558q);
                this.f95446j.setVisibility(0);
            }
            android.view.View view4 = this.f95443g;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = this.f95447k;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/card/ui/CardPopupWindow", "showPopupWindow", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f95442f.update();
    }
}
