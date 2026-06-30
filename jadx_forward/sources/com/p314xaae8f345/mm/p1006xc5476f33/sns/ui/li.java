package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class li implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee f251276d;

    public li(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee activityC18058xc05952ee) {
        this.f251276d = activityC18058xc05952ee;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee activityC18058xc05952ee = this.f251276d;
        activityC18058xc05952ee.f248343o.getViewTreeObserver().removeOnPreDrawListener(this);
        int width = activityC18058xc05952ee.f248343o.getWidth();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.I1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$202", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        activityC18058xc05952ee.D1 = width;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$202", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        int height = activityC18058xc05952ee.f248343o.getHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$302", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        activityC18058xc05952ee.E1 = height;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$302", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        int width2 = activityC18058xc05952ee.f248343o.getWidth();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$402", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        activityC18058xc05952ee.f248689x1 = width2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$402", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        int height2 = activityC18058xc05952ee.f248343o.getHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$502", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        activityC18058xc05952ee.f248691y1 = height2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$502", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
        java.lang.String r17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.r(activityC18058xc05952ee.f248343o.mo70574x2d3ab571());
        if (r17 != null) {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(options);
            arrayList.add(r17);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsGalleryUI$4", "onPreDraw", "()Z", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1)), "com/tencent/mm/plugin/sns/ui/SnsGalleryUI$4", "onPreDraw", "()Z", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            if (options.outWidth > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                int i18 = activityC18058xc05952ee.f248689x1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$502", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                activityC18058xc05952ee.f248691y1 = (int) ((i18 / options.outWidth) * options.outHeight);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$502", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                int i19 = activityC18058xc05952ee.f248691y1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                if (i19 > activityC18058xc05952ee.f248343o.getHeight()) {
                    int height3 = activityC18058xc05952ee.f248343o.getHeight();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$502", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                    activityC18058xc05952ee.f248691y1 = height3;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$502", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var = activityC18058xc05952ee.f248688x0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        int i27 = activityC18058xc05952ee.f248689x1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        int i28 = activityC18058xc05952ee.f248691y1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        s4Var.f292232f = i27;
        s4Var.f292233g = i28;
        android.view.KeyEvent.Callback mo70575xb763149d = activityC18058xc05952ee.f248343o.mo70575xb763149d();
        if (activityC18058xc05952ee.X && !com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.v7(activityC18058xc05952ee) && (mo70575xb763149d instanceof db5.f0)) {
            ((db5.f0) mo70575xb763149d).n(0.0f, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var2 = activityC18058xc05952ee.f248688x0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = activityC18058xc05952ee.f248343o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        android.widget.ImageView imageView = activityC18058xc05952ee.f248685l1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        s4Var2.c(c18064xe6e1a3b3, imageView, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ki(this));
        if (activityC18058xc05952ee.X) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1000", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("runDragAnimation", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e mo70578x3219b31c = activityC18058xc05952ee.f248343o.mo70578x3219b31c();
            mo70578x3219b31c.m79168x9bfee16e(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oi(activityC18058xc05952ee, mo70578x3219b31c));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("runDragAnimation", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1000", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$4");
        return true;
    }
}
