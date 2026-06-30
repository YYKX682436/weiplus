package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui;

@db5.a(m123858x6ac9171 = 7)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/MusicMvRouterUI;", "Lcom/tencent/mm/plugin/mv/ui/BaseMusicMvUI;", "Lut3/d;", "<init>", "()V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvRouterUI */
/* loaded from: classes10.dex */
public final class ActivityC16655xf855844b extends com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.AbstractActivityC16647x3a7d7dd1 implements ut3.d {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f232422g = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f232423e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f232424f = p3325xe03a0797.p3326xc267989b.z0.i(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null));

    public final void U6(android.content.Intent intent) {
        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16649xd6b36a3b.class);
        intent2.addFlags(67108864);
        byte[] byteArrayExtra = intent.getByteArrayExtra("key_track_data");
        if (byteArrayExtra != null) {
            intent2.putExtra("key_track_data", byteArrayExtra);
        }
        intent2.putExtra("key_seek_to_start", intent.getBooleanExtra("key_seek_to_start", false));
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, -1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI", "createMainUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI", "createMainUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void V6() {
        int i17 = this.f232423e;
        ut3.m mVar = ut3.m.f512715a;
        ll3.t1 t1Var = ll3.t1.f400773a;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d Bi = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Bi();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvRouterUI", "videoParams " + Bi);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.g(t1Var.a(), t1Var.b(), Bi, Bi.f152728h * 1000, 14);
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            g17.f237217v = bool;
            g17.f237214s = bool;
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            g17.f237216u = bool2;
            int intExtra = getIntent().getIntExtra("KEY_MIN_RECORD_DURATION", 1000);
            int intExtra2 = getIntent().getIntExtra("KEY_MAX_RECORD_DURATION", 1000);
            boolean booleanExtra = getIntent().getBooleanExtra("KEY_IS_FIX_CLIP_MODE", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvRouterUI", "record require duration:" + intExtra + ", maxVideoDuration:" + intExtra2);
            g17.f237219x = intExtra;
            g17.f237218w = intExtra2;
            if (intExtra > 0 && booleanExtra) {
                g17.R = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ht9, java.lang.String.valueOf((int) (intExtra / 1000.0f)));
            }
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_effect_finder_enable_beautify, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19568xd45988ab c19568xd45988ab = g17.Q;
            c19568xd45988ab.f270130e = fj6;
            c19568xd45988ab.f270132g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_effect_finder_beautify_skin_smooth, -1);
            c19568xd45988ab.f270133h = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_effect_finder_beautify_eye_morph, -1);
            c19568xd45988ab.f270134i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_effect_finder_beautify_face_morph, -1);
            c19568xd45988ab.f270135m = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_effect_finder_beautify_skin_bright, -1);
            c19568xd45988ab.f270136n = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_effect_finder_beautify_eye_bright, -1);
            hp.b bVar = new hp.b();
            bVar.e(true);
            bVar.g(true);
            com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468 c10402x5bc41468 = bVar.f364437a;
            ((java.util.HashMap) c10402x5bc41468.f146312h).put("plugin_photo_crop", bool2);
            bVar.c(false);
            bVar.b(true);
            bVar.d(true);
            bVar.h(true);
            bVar.a(true);
            bVar.f(true);
            g17.f237210o = c10402x5bc41468;
            g17.f237211p = com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN;
            g17.a(2, "com.tencent.mm.plugin.recordvideo.plugin.parent.MusicMvEditVideoPluginLayout");
            ut3.f.f512709c.f512710a = this;
            mVar.c(this, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1, g17);
            return;
        }
        if (i17 == 2) {
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d Bi2 = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Bi();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvRouterUI", "videoParams " + Bi2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 g18 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.g(t1Var.a(), t1Var.b(), Bi2, 0, 14);
            java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
            g18.f237217v = bool3;
            java.lang.Boolean bool4 = java.lang.Boolean.TRUE;
            g18.f237214s = bool4;
            g18.f237215t = bool3;
            g18.f237220y = true;
            com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468 c10402x5bc414682 = new com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468((hp.a) null);
            java.util.HashMap hashMap = (java.util.HashMap) c10402x5bc414682.f146312h;
            hashMap.put("plugin_filter", bool4);
            hashMap.put("plugin_video_crop", bool4);
            hashMap.put("plugin_photo_crop", bool4);
            g18.f237210o = c10402x5bc414682;
            g18.a(1, "com.tencent.mm.plugin.recordvideo.plugin.parent.MusicMvEditPhotoPluginLayout");
            ut3.f.f512709c.f512710a = this;
            mVar.c(this, com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1, g18);
            return;
        }
        if (i17 == 3) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a.class);
            byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_track_data");
            if (byteArrayExtra != null) {
                intent.putExtra("key_track_data", byteArrayExtra);
            }
            pm0.v.g(intent, getIntent(), "key_mv_music_duration", 0);
            pm0.v.g(intent, getIntent(), "key_mv_from_scene", 0);
            pm0.v.g(intent, getIntent(), "key_mv_enter_maker_ui_from_scene", 0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI", "createMv", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI", "createMv", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (i17 == 5) {
            U6(getIntent());
            finish();
            return;
        }
        if (i17 == 6) {
            p3325xe03a0797.p3326xc267989b.l.d(this.f232424f, null, null, new jm3.c1(this, this, null), 3, null);
            return;
        }
        if (i17 != 7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mv.MusicMvRouterUI", "unknown router: " + this.f232423e);
            finish();
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16654xdc9bdf62.class);
        byte[] byteArrayExtra2 = getIntent().getByteArrayExtra("key_track_data");
        if (byteArrayExtra2 != null) {
            intent2.putExtra("key_track_data", byteArrayExtra2);
        }
        pm0.v.g(intent2, getIntent(), "key_mv_music_duration", 0);
        pm0.v.g(intent2, getIntent(), "key_mv_from_scene", 0);
        pm0.v.g(intent2, getIntent(), "key_mv_enter_maker_ui_from_scene", 0);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI", "createPostMv", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI", "createPostMv", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // ut3.d
    public boolean c5(android.content.Context context, android.os.Bundle bundle, ut3.c cVar) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvRouterUI", "onMediaGenerated");
        if (c16991x15ced046 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvRouterUI", "record video path:" + c16991x15ced046.f237194e + ' ' + c16991x15ced046.f237195f);
        boolean z17 = true;
        if (this.f232423e == 1) {
            java.lang.String str = c16991x15ced046.f237194e;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("KEY_RECORD_VIDEO_PATH", c16991x15ced046.f237194e);
                intent.putExtra("KEY_RECORD_VIDEO_THUMB_PATH", c16991x15ced046.f237195f);
                setResult(-1, intent);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                ((android.app.Activity) context).finish();
                finish();
            }
        }
        if (this.f232423e == 2) {
            java.lang.Boolean bool = c16991x15ced046.f237197h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bool, "getPhoto(...)");
            if (bool.booleanValue()) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("KEY_RECORD_PHOTO_PATH", c16991x15ced046.f237195f);
                setResult(-1, intent2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                ((android.app.Activity) context).finish();
                finish();
            }
        }
        setResult(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context).finish();
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 233 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvRouterUI", "cancel take photo");
            setResult(0);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.AbstractActivityC16647x3a7d7dd1, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f232423e = getIntent().getIntExtra("KEY_MUSIC_ROUTER", -1);
        V6();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvRouterUI", "onDestroy");
        super.onDestroy();
        p3325xe03a0797.p3326xc267989b.z0.e(this.f232424f, null, 1, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            int intExtra = intent.getIntExtra("KEY_MUSIC_ROUTER", -1);
            if (intExtra == 4) {
                overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, -1);
                finish();
            } else {
                if (intExtra != 5) {
                    return;
                }
                U6(intent);
                finish();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvRouterUI", "onPause");
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        if (grantResults.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvRouterUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvRouterUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(grantResults[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 16) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                V6();
                return;
            } else {
                db5.e1.C(mo55332x76847179(), i65.a.r(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.hh8), i65.a.r(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.hht), i65.a.r(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.g6z), i65.a.r(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.hh9), false, new jm3.e1(this), new jm3.f1(this));
                return;
            }
        }
        if (i17 != 80) {
            return;
        }
        if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
            V6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvRouterUI", "onResume");
        super.onResume();
    }

    @Override // ut3.d
    public void r3(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 c16994x3ba8255, android.os.Bundle bundle) {
    }
}
