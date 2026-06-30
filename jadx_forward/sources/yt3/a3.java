package yt3;

/* loaded from: classes10.dex */
public final class a3 implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f546874d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f546875e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f546876f;

    /* renamed from: g, reason: collision with root package name */
    public int f546877g;

    public a3(android.widget.ImageView view, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f546874d = view;
        this.f546875e = status;
        view.setOnClickListener(this);
        view.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(view.getContext(), com.p314xaae8f345.mm.R.raw.f79630x4129ee57, -1));
        this.f546876f = true;
    }

    @Override // yt3.r2
    /* renamed from: onActivityResult */
    public void mo47332x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordAlbumPlugin", "onActivityResult requestCode:" + i17 + " resultCode:" + i18 + " data:" + intent);
        if (i17 == 1000) {
            if (i18 == -1) {
                android.os.Bundle bundle = new android.os.Bundle();
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("key_select_video_list") : null;
                java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent != null ? intent.getStringArrayListExtra("key_select_image_list") : null;
                bundle.putInt("PARAM_ROUTER_INT", jt3.h.f383161l.a(-1, stringArrayListExtra2, stringArrayListExtra));
                bundle.putStringArrayList("PARAM_VIDEO_LIST", stringArrayListExtra);
                bundle.putStringArrayList("PARAM_PHOTO_LIST", stringArrayListExtra2);
                this.f546875e.w(ju3.c0.f383436t, bundle);
                return;
            }
            return;
        }
        if (i17 == 1001 && i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent != null ? intent.getStringArrayListExtra("CropImage_OutputPath_List") : null;
            java.lang.Integer valueOf = stringArrayListExtra3 != null ? java.lang.Integer.valueOf(stringArrayListExtra3.size()) : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            if (valueOf.intValue() > 0) {
                java.lang.String str2 = stringArrayListExtra3.get(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "get(...)");
                str = str2;
            } else {
                str = "";
            }
            java.lang.String str3 = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordAlbumPlugin", "onActivityResult outputPhotoPath:".concat(str3));
            ut3.f fVar = ut3.f.f512709c;
            android.content.Context context = this.f546874d.getContext();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            fVar.a(context, new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046(bool, "", str3, -1L, bool, null));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/RecordAlbumPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordAlbumPlugin", "click RecordAlbumPlugin");
        android.content.Intent intent = new android.content.Intent();
        int i17 = this.f546877g;
        tt3.b bVar = tt3.b.f503570b;
        android.widget.ImageView imageView = this.f546874d;
        if (i17 == 3) {
            intent.putExtra("key_edit_video_max_time_length", ((tt3.a) bVar.a()).f503569i);
            intent.putExtra("key_edit_text_color", "#0E9CE6");
            intent.putExtra("key_can_select_video_and_pic", !(gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TOP_STORY_VLOG_ENABLE_INT, 0) == 1 || ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_story_enable_vlog, false)));
            if (((tt3.a) bVar.a()).f503567g) {
                android.content.Context context = imageView.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.c((android.app.Activity) context, 1000, 9, 22, 3, false, intent);
            } else {
                android.content.Context context2 = imageView.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.c((android.app.Activity) context2, 1000, 1, 22, 2, false, intent);
            }
            nu3.i.f421754d.f142409k = 0L;
        } else if (i17 == 11) {
            intent.putExtra("album_business_tag", "album_business_media");
            android.content.Context context3 = imageView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context3, "null cannot be cast to non-null type android.app.Activity");
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.c((android.app.Activity) context3, 1000, 9, 25, 3, false, intent);
        } else if (i17 == 15) {
            intent.putExtra("key_edit_video_max_time_length", ((tt3.a) bVar.a()).f503569i);
            intent.putExtra("key_edit_text_color", "#0E9CE6");
            android.content.Context context4 = imageView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context4, "null cannot be cast to non-null type android.app.Activity");
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.c((android.app.Activity) context4, 1000, 1, 22, 3, false, intent);
            nu3.i.f421754d.f142409k = 0L;
        } else if (i17 != 16) {
            intent.putExtra("album_business_tag", "album_business_media");
            android.content.Context context5 = imageView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context5, "null cannot be cast to non-null type android.app.Activity");
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.c((android.app.Activity) context5, 1000, 1, 23, 3, false, intent);
        } else {
            intent.putExtra("album_business_tag", "album_business_media");
            android.content.Context context6 = imageView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context6, "null cannot be cast to non-null type android.app.Activity");
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.c((android.app.Activity) context6, 1001, 1, 29, 1, false, intent);
        }
        nu3.i.f421751a.d(4);
        nu3.i.f421757g.f142483j = 1L;
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/RecordAlbumPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        if (this.f546876f) {
            this.f546874d.setVisibility(i17);
        }
    }
}
