package fn5;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f346173a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f f346174b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f346175c;

    public b(android.view.View convertView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convertView, "convertView");
        this.f346173a = convertView;
        android.view.View findViewById = convertView.findViewById(com.p314xaae8f345.mm.R.id.h_l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f346174b = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) findViewById;
        android.view.View findViewById2 = convertView.findViewById(com.p314xaae8f345.mm.R.id.h_g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f346175c = findViewById2;
    }

    public final void a(java.lang.String str) {
        java.lang.String origPath = str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(origPath, "origPath");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(str)) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            origPath = m11.b1.Di().P0(origPath);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(origPath, "exportToJpgAndGetFullPath(...)");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryGalleryViewHolder", "setImage >> ".concat(origPath));
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(origPath);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f = this.f346174b;
        if (j17 && !r26.i0.n(origPath, ".temp", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryGalleryViewHolder", "setImage >> is set");
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(origPath, options);
            if (d17 != null) {
                d17.recycle();
            }
            int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(origPath);
            c21537x5f41189f.setVisibility(0);
            android.view.View view = this.f346175c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/view/page/ImageQueryGalleryViewHolder", "setImage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/view/page/ImageQueryGalleryViewHolder", "setImage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c21537x5f41189f.m79320x1a6eb00e(a17);
            int i17 = options.outWidth;
            int i18 = options.outHeight;
            c21537x5f41189f.f149752h = i17;
            c21537x5f41189f.f149753i = i18;
            c21537x5f41189f.i();
            c21537x5f41189f.t(origPath, com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536.uri(origPath));
            return;
        }
        boolean n17 = r26.i0.n(origPath, ".temp", false);
        android.view.View view2 = this.f346175c;
        if (n17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryGalleryViewHolder", "path: " + origPath + " is error");
            android.view.View view3 = this.f346175c;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/view/page/ImageQueryGalleryViewHolder", "setImage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/view/page/ImageQueryGalleryViewHolder", "setImage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c21537x5f41189f.setVisibility(8);
            android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.h_a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            ((android.widget.TextView) findViewById).setText(com.p314xaae8f345.mm.R.C30867xcad56011.fza);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryGalleryViewHolder", "path: " + origPath + " is no exist");
        android.view.View view4 = this.f346175c;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/view/page/ImageQueryGalleryViewHolder", "setImage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/view/page/ImageQueryGalleryViewHolder", "setImage", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c21537x5f41189f.setVisibility(8);
        android.view.View findViewById2 = view2.findViewById(com.p314xaae8f345.mm.R.id.h_a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        ((android.widget.TextView) findViewById2).setText(com.p314xaae8f345.mm.R.C30867xcad56011.fz_);
    }
}
