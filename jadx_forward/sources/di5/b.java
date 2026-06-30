package di5;

/* loaded from: classes10.dex */
public final class b extends lf3.n implements di5.t, ut3.d {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f314325d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f314326e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f314327f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f314328g;

    /* renamed from: h, reason: collision with root package name */
    public int f314329h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f314327f = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public void V6(mf3.k mediaInfo) {
        java.lang.String c17;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        ci5.e eVar = mediaInfo instanceof ci5.e ? (ci5.e) mediaInfo : null;
        if (eVar != null) {
            this.f314329h = eVar.f123259b.f497008i;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderPostComponent", "doOpenFinderMovieEditor: curPostEnterScene = " + this.f314329h);
        }
        ut3.f.f512709c.f512710a = this;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.b().j());
        sb6.append('_');
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        this.f314326e = sb6.toString();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        mf3.u mo2109xfb85f7b0 = mediaInfo.mo2109xfb85f7b0();
        mf3.u uVar = mf3.u.f407657f;
        if (mo2109xfb85f7b0 == uVar) {
            gg3.c a17 = mediaInfo.a();
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.FinderPostComponent", "doOpenFinderMovieEditor: params is null,type = " + mediaInfo.mo2109xfb85f7b0());
                return;
            }
            c17 = a17.f353261c;
            i17 = 4;
        } else {
            sf3.g e17 = mediaInfo.e();
            if (e17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.FinderPostComponent", "doOpenFinderMovieEditor: params is null,type = " + mediaInfo.mo2109xfb85f7b0());
                return;
            }
            c17 = e17.c();
            i17 = 3;
        }
        try {
            new com.p314xaae8f345.mm.vfs.u6(c17);
            if (mediaInfo.mo2109xfb85f7b0() == uVar) {
                arrayList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.b(2, 0L, c17, c17, ""));
            } else {
                arrayList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.b(1, 0L, c17, "", ""));
            }
            if (this.f314325d == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.d("", "");
                hp.b bVar = new hp.b();
                bVar.e(true);
                bVar.g(true);
                bVar.c(false);
                bVar.b(true);
                bVar.h(false);
                bVar.i(com.p314xaae8f345.mm.R.C30861xcebc809e.f562590jk, 0, "", 0);
                d17.f237210o = bVar.f364437a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd();
                c16995x8ab634cd.f237223d = 17;
                d17.I = c16995x8ab634cd;
                d17.F = 17;
                ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
                com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d K2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.K2();
                d17.f237209n = K2;
                d17.f237212q = 3;
                d17.f237218w = K2.f152728h * 1000;
                boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_use_timeline_editor, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderPostComponent", "useTimelineEditor: " + fj6);
                if (fj6) {
                    d17.a(4, "com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorFollowMusicPluginLayout");
                } else {
                    d17.a(4, "com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout");
                }
                d17.a(3, "com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout");
                d17.a(1, "com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout");
                this.f314325d = d17;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = this.f314325d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc19624);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("media_list", arrayList);
            bundle.putString("post_id", this.f314326e);
            c16993xacc19624.M = bundle;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196242 = this.f314325d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc196242);
            boolean aj6 = ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).aj();
            ut3.m mVar = ut3.m.f512715a;
            if (aj6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderPostComponent", "isMovieComposingEnabled = true");
                mVar.h(m80379x76847179(), 1001, 0, 0, c16993xacc196242, i17, 0, false, null, false, false);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderPostComponent", "isMovieComposingEnabled = false");
            mVar.f(m80379x76847179(), 1001, 0, 0, c16993xacc196242, i17, 0);
            java.lang.Runnable runnable = this.f314328g;
            android.os.Handler handler = this.f314327f;
            if (runnable != null) {
                handler.removeCallbacks(runnable);
                this.f314328g = null;
            }
            di5.a aVar = new di5.a(this);
            this.f314328g = aVar;
            handler.postDelayed(aVar, 200L);
        } catch (java.lang.Exception e18) {
            dp.a.m125854x26a183b(m80379x76847179(), m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p0c), 1).show();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.FinderPostComponent", "read file error:" + e18);
        }
    }

    @Override // ut3.d
    public boolean c5(android.content.Context context, android.os.Bundle bundle, ut3.c cVar) {
        return false;
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046, android.os.Bundle bundle) {
        byte[] byteArray;
        byte[] byteArray2;
        byte[] byteArray3;
        byte[] byteArray4;
        java.util.ArrayList parcelableArrayList;
        byte[] byteArray5;
        byte[] byteArray6;
        if (c16991x15ced046 != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_POST_ENTERSCENE", this.f314329h);
            if (bundle != null && (byteArray6 = bundle.getByteArray("MEDIA_EXTRA_MUSIC")) != null) {
                intent.putExtra("MEDIA_EXTRA_MUSIC", byteArray6);
            }
            if (bundle != null && (byteArray5 = bundle.getByteArray("ORIGIN_MUSIC_INFO")) != null) {
                intent.putExtra("ORIGIN_MUSIC_INFO", byteArray5);
            }
            pm0.v.l(intent, bundle, "ORIGIN_MUSIC_ID");
            pm0.v.l(intent, bundle, "ORIGIN_MUSIC_PATH");
            pm0.v.l(intent, bundle, "ORIGIN_BGM_URL");
            pm0.v.e(intent, bundle, "MEDIA_IS_MUTE", false, 4, null);
            pm0.v.e(intent, bundle, "MUSIC_IS_MUTE", false, 4, null);
            pm0.v.h(intent, bundle, "SOUND_TRACK_TYPE", 0, 4, null);
            pm0.v.l(intent, bundle, "MUSIC_FEED_ID");
            if (bundle != null && (parcelableArrayList = bundle.getParcelableArrayList("KEY_POST_HALF_RECT_LIST")) != null) {
                intent.putExtra("KEY_POST_HALF_RECT_LIST", parcelableArrayList);
            }
            pm0.v.i(intent, bundle, "key_ref_feed_id", 0L, 4, null);
            pm0.v.h(intent, bundle, "key_ref_enter_scene", 0, 4, null);
            pm0.v.l(intent, bundle, "KEY_POST_VIDEO_TITLE");
            pm0.v.e(intent, bundle, "KEY_POST_ASSETS_IS_REAL_SHOOT", false, 4, null);
            java.util.ArrayList arrayList = (java.util.ArrayList) c16991x15ced046.a().b("KEY_IMAGE_QUALITY_INT_ARRAY", new java.util.ArrayList());
            java.util.List<java.lang.String> list = c16991x15ced046.f237199m;
            if (list == null || list.size() <= 0) {
                if (bundle != null && (byteArray = bundle.getByteArray("video_composition")) != null) {
                    intent.putExtra("video_composition", byteArray);
                }
                intent.putExtra("postType", 4);
                intent.putExtra("postMediaList", kz5.c0.d(c16991x15ced046.f237194e));
                boolean z17 = true;
                intent.putExtra("postTypeList", kz5.c0.d(4));
                intent.putExtra("postThumbList", kz5.c0.d(c16991x15ced046.f237195f));
                if (arrayList != null && arrayList.size() == 1) {
                    intent.putExtra("key_post_media_quality_list", arrayList);
                }
                java.lang.String string = bundle != null ? bundle.getString("KEY_POST_MIAOJIAN_TONGKUAN_META") : null;
                if (string != null && string.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    intent.putExtra("KEY_POST_MIAOJIAN_TONGKUAN_META", string);
                    if (intent.getIntExtra("KEY_POST_FROM_APP_SOURCE", 0) == 0) {
                        intent.putExtra("KEY_POST_FROM_APP_SOURCE", 4);
                    }
                }
            } else {
                intent.putExtra("postType", 2);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add((java.lang.String) it.next());
                }
                intent.putExtra("postMediaList", arrayList2);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.String str : list) {
                    arrayList3.add(2);
                }
                intent.putExtra("postTypeList", arrayList3);
                intent.putExtra("postThumbList", kz5.c0.d(c16991x15ced046.f237195f));
                if (arrayList != null && arrayList.size() == list.size()) {
                    intent.putExtra("key_post_media_quality_list", arrayList);
                }
                pm0.v.j(intent, bundle, "KEY_POST_HALF_IMAGE_LIST");
            }
            intent.putExtra("post_id", this.f314326e);
            intent.putExtra("edit_id", (java.lang.String) c16991x15ced046.a().b("KEY_MULTI_MEDIA_EDIT_ID_STRING", ""));
            intent.putExtra("KEY_MUSIC_ID", (java.lang.String) c16991x15ced046.a().b("KEY_MUSIC_ID_STRING", ""));
            intent.putExtra("KEY_MUSIC_LIKE_FINDER_FEED_ID", (java.lang.String) c16991x15ced046.a().b("KEY_MUSIC_LIKE_FINDER_FEED_ID_STRING", ""));
            java.lang.Object b17 = c16991x15ced046.a().b("KEY_MUSIC_TYPE_INT", 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getReportValue(...)");
            intent.putExtra("KEY_MUSIC_TYPE", ((java.lang.Number) b17).intValue());
            intent.putExtra("KEY_MUSIC_SESSION_BUFFER", (java.lang.String) c16991x15ced046.a().b("KEY_MUSIC_SESSION_BUFFER", ""));
            pm0.v.l(intent, bundle, "KEY_POST_ORIGIN_FILE_PATH");
            pm0.v.e(intent, bundle, "isLongVideoPost", false, 4, null);
            intent.putExtra("KEY_POST_VIDEO_TEMPLATE", bundle != null ? bundle.getByteArray("KEY_POST_VIDEO_TEMPLATE") : null);
            intent.putExtra("KEY_POST_VIDEO_COVER_START_TIME", bundle != null ? java.lang.Double.valueOf(bundle.getDouble("KEY_POST_VIDEO_COVER_START_TIME")) : null);
            if (bundle != null && (byteArray4 = bundle.getByteArray("KEY_POST_VIDEO_CLIP_BUNDLE_TIMELIE")) != null) {
                intent.putExtra("KEY_POST_VIDEO_CLIP_BUNDLE_TIMELIE", byteArray4);
            }
            if (bundle != null && (byteArray3 = bundle.getByteArray("KEY_POST_VIDEO_CLIP_BUNDLE_JSON")) != null) {
                intent.putExtra("KEY_POST_VIDEO_CLIP_BUNDLE_JSON", byteArray3);
            }
            if (bundle != null && (byteArray2 = bundle.getByteArray("KEY_POST_ASSET_INFO")) != null) {
                intent.putExtra("KEY_POST_ASSET_INFO", byteArray2);
            }
            if (context instanceof android.app.Activity) {
                android.app.Activity activity = (android.app.Activity) context;
                activity.setResult(-1);
                activity.finish();
                activity.overridePendingTransition(0, 0);
            }
            intent.removeExtra("KEY_FROM_SHOOT_COMPOSING");
            ((w40.e) i95.n0.c(w40.e.class)).getClass();
            qs2.v.f447860a.e(m80379x76847179(), intent);
        }
        ut3.f.f512709c.f512710a = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ut3.f.f512709c.f512710a = null;
        java.lang.Runnable runnable = this.f314328g;
        if (runnable != null) {
            this.f314327f.removeCallbacks(runnable);
            this.f314328g = null;
        }
    }

    @Override // ut3.d
    public void r3(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 c16994x3ba8255, android.os.Bundle bundle) {
    }
}
