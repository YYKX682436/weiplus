package c43;

/* loaded from: classes8.dex */
public final class l extends c43.x {

    /* renamed from: l1, reason: collision with root package name */
    public static final /* synthetic */ int f119984l1 = 0;
    public x33.c Z;

    /* renamed from: p0, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd f119985p0;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f119986x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f119987y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.view.View itemView, int i17) {
        super(itemView, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f119987y0 = true;
    }

    public final void C(android.widget.ImageView imageView, java.lang.String str) {
        this.f119986x0 = str;
        lt0.l lVar = s33.y.f484074a;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) lVar.i(str);
        if (bitmap == null) {
            bitmap = com.p314xaae8f345.mm.p786x600aa8b.e.c(str);
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        lVar.put(str, bitmap);
        imageView.setBackgroundDrawable(null);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.h0.a(bitmap, imageView);
        boolean z17 = ((double) bitmap.getWidth()) >= ((double) bitmap.getHeight()) * 2.5d;
        boolean z18 = ((double) bitmap.getHeight()) >= ((double) bitmap.getWidth()) * 2.5d;
        if (z17 || z18) {
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        }
    }

    @Override // c43.x
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15791x7c5dbdd8 c15791x7c5dbdd8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd c15727xf21b07cd;
        int i17;
        float f17;
        if (c15731x94356d67 == null || (c15791x7c5dbdd8 = c15731x94356d67.f36571x8f2d71bb) == null || (c15727xf21b07cd = c15791x7c5dbdd8.f36764xeb11824f) == null) {
            return;
        }
        this.f119985p0 = c15727xf21b07cd;
        int i18 = c15727xf21b07cd.f36556x9c9b0a1d;
        int i19 = c15727xf21b07cd.f36554xdcf73fb0;
        java.lang.String str = c15727xf21b07cd.url;
        java.lang.String str2 = c15727xf21b07cd.f36543xab4b3f30;
        java.lang.String str3 = c15727xf21b07cd.f220231md5;
        x33.c cVar = this.Z;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        android.widget.ImageView chatroomContentIv = cVar.f533157b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(chatroomContentIv, "chatroomContentIv");
        x33.c cVar2 = this.Z;
        if (cVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        chatroomContentIv.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562680lw);
        chatroomContentIv.setImageDrawable(null);
        float g17 = i65.a.g(this.f120025g);
        if (i18 >= 160 || i19 >= 160) {
            float f18 = 160.0f / (i19 > i18 ? i19 : i18);
            i17 = (int) ((((int) (i18 * f18)) > 0 ? r2 : 120) * g17);
            f17 = (((int) (i19 * f18)) > 0 ? r3 : 75) * g17;
        } else {
            if (i18 <= 0) {
                i18 = 120;
            }
            i17 = (int) (i18 * g17 * 1.25f);
            if (i19 <= 0) {
                i19 = 75;
            }
            f17 = i19 * g17 * 1.25f;
        }
        int i27 = (int) f17;
        float f19 = 60 * g17;
        if (i17 < f19) {
            i17 = (int) f19;
        }
        if (i27 < f19) {
            i27 = (int) f19;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i17, i27);
        chatroomContentIv.setLayoutParams(layoutParams);
        android.widget.LinearLayout linearLayout = cVar2.f533158c;
        if (linearLayout != null) {
            linearLayout.setLayoutParams(layoutParams);
        }
        java.lang.String m17 = s33.y.m(str, true);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m17) && com.p314xaae8f345.mm.vfs.w6.j(m17)) {
            if (linearLayout != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(linearLayout, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH", "setBitmapToView", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                linearLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(linearLayout, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH", "setBitmapToView", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m17);
            C(chatroomContentIv, m17);
            return;
        }
        e43.c.a(true, str, str2, str3, new c43.k(this, linearLayout, chatroomContentIv));
        if (!this.f119987y0 || linearLayout == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(linearLayout, arrayList2.toArray(), "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH", "setBitmapToView", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        linearLayout.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(linearLayout, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH", "setBitmapToView", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // c43.x
    public android.view.View p(android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f120025g).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.beu, (android.view.ViewGroup) null, false);
        int i17 = com.p314xaae8f345.mm.R.id.bgo;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.bgo);
        if (imageView != null) {
            i17 = com.p314xaae8f345.mm.R.id.ott;
            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.ott);
            if (progressBar != null) {
                i17 = com.p314xaae8f345.mm.R.id.otu;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.otu);
                if (textView != null) {
                    i17 = com.p314xaae8f345.mm.R.id.otv;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.otv);
                    if (linearLayout != null) {
                        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate;
                        this.Z = new x33.c(frameLayout, imageView, progressBar, textView, linearLayout);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(frameLayout, "getRoot(...)");
                        return frameLayout;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // c43.x
    public void w(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15727xf21b07cd c15727xf21b07cd = this.f119985p0;
        if (c15727xf21b07cd != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("img_aeskey", c15727xf21b07cd.f36543xab4b3f30);
            intent.putExtra("img_url", c15727xf21b07cd.url);
            intent.putExtra("img_md5", c15727xf21b07cd.f220231md5);
            intent.putExtra("img_thumb", this.f119986x0);
            j45.l.j(this.f120025g, "game", ".chatroom.ui.GameImagePreviewUI", intent, null);
        }
    }
}
