package c43;

/* loaded from: classes8.dex */
public final class l extends c43.x {

    /* renamed from: l1, reason: collision with root package name */
    public static final /* synthetic */ int f38451l1 = 0;
    public x33.c Z;

    /* renamed from: p0, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage f38452p0;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f38453x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f38454y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.view.View itemView, int i17) {
        super(itemView, i17);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f38454y0 = true;
    }

    public final void C(android.widget.ImageView imageView, java.lang.String str) {
        this.f38453x0 = str;
        lt0.l lVar = s33.y.f402541a;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) lVar.i(str);
        if (bitmap == null) {
            bitmap = com.tencent.mm.graphics.e.c(str);
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
    public void k(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack) {
        com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage chatroomMsgImage;
        int i17;
        float f17;
        if (chatroomMsgPack == null || (msgContent = chatroomMsgPack.msg_content) == null || (chatroomMsgImage = msgContent.chatroom_image) == null) {
            return;
        }
        this.f38452p0 = chatroomMsgImage;
        int i18 = chatroomMsgImage.thumb_width;
        int i19 = chatroomMsgImage.thumb_height;
        java.lang.String str = chatroomMsgImage.url;
        java.lang.String str2 = chatroomMsgImage.aeskey;
        java.lang.String str3 = chatroomMsgImage.f138698md5;
        x33.c cVar = this.Z;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        android.widget.ImageView chatroomContentIv = cVar.f451624b;
        kotlin.jvm.internal.o.f(chatroomContentIv, "chatroomContentIv");
        x33.c cVar2 = this.Z;
        if (cVar2 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        chatroomContentIv.setBackgroundResource(com.tencent.mm.R.drawable.f481147lw);
        chatroomContentIv.setImageDrawable(null);
        float g17 = i65.a.g(this.f38492g);
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
        android.widget.LinearLayout linearLayout = cVar2.f451625c;
        if (linearLayout != null) {
            linearLayout.setLayoutParams(layoutParams);
        }
        java.lang.String m17 = s33.y.m(str, true);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(m17) && com.tencent.mm.vfs.w6.j(m17)) {
            if (linearLayout != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(linearLayout, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH", "setBitmapToView", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                linearLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(linearLayout, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH", "setBitmapToView", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            kotlin.jvm.internal.o.d(m17);
            C(chatroomContentIv, m17);
            return;
        }
        e43.c.a(true, str, str2, str3, new c43.k(this, linearLayout, chatroomContentIv));
        if (!this.f38454y0 || linearLayout == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(linearLayout, arrayList2.toArray(), "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH", "setBitmapToView", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        linearLayout.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(linearLayout, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH", "setBitmapToView", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // c43.x
    public android.view.View p(android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f38492g).inflate(com.tencent.mm.R.layout.beu, (android.view.ViewGroup) null, false);
        int i17 = com.tencent.mm.R.id.bgo;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.bgo);
        if (imageView != null) {
            i17 = com.tencent.mm.R.id.ott;
            android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(inflate, com.tencent.mm.R.id.ott);
            if (progressBar != null) {
                i17 = com.tencent.mm.R.id.otu;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.otu);
                if (textView != null) {
                    i17 = com.tencent.mm.R.id.otv;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.otv);
                    if (linearLayout != null) {
                        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate;
                        this.Z = new x33.c(frameLayout, imageView, progressBar, textView, linearLayout);
                        kotlin.jvm.internal.o.f(frameLayout, "getRoot(...)");
                        return frameLayout;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // c43.x
    public void w(android.view.View view) {
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage chatroomMsgImage = this.f38452p0;
        if (chatroomMsgImage != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("img_aeskey", chatroomMsgImage.aeskey);
            intent.putExtra("img_url", chatroomMsgImage.url);
            intent.putExtra("img_md5", chatroomMsgImage.f138698md5);
            intent.putExtra("img_thumb", this.f38453x0);
            j45.l.j(this.f38492g, "game", ".chatroom.ui.GameImagePreviewUI", intent, null);
        }
    }
}
