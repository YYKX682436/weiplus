package com.tencent.mm.app;

@j95.b
/* loaded from: classes8.dex */
public final class o7 extends i95.w implements o25.s1, com.tencent.mm.modelbase.d1, qk.n6, o25.r1 {
    public java.lang.String Ai(java.lang.String str, boolean z17) {
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        if (com.tencent.mm.pluginsdk.model.app.w.j(str, z17, false) == null) {
            return "";
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        return com.tencent.mm.pluginsdk.model.app.w.j(str, z17, false).field_packageName;
    }

    public boolean Bi(android.content.Context context, java.lang.String str) {
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        return com.tencent.mm.pluginsdk.model.app.w.r(context, str);
    }

    public boolean Di(java.lang.String str) {
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        return com.tencent.mm.pluginsdk.model.app.w.t(str);
    }

    public void Ni(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, java.lang.String str4, long j17, java.lang.String str5) {
        if (m33.a1.a() != null) {
            ((com.tencent.mm.game.report.c) jj0.a.a()).d(context, str, str2, str3, i17, i18, i19, str4, j17, str5, "", 0);
        }
    }

    public void Ri() {
        com.tencent.mm.autogen.events.TalkRoomUitlEvent talkRoomUitlEvent = new com.tencent.mm.autogen.events.TalkRoomUitlEvent();
        talkRoomUitlEvent.f54885g.getClass();
        talkRoomUitlEvent.e();
    }

    public boolean Ui(android.app.Activity activity) {
        if (fp.i.b()) {
            com.tencent.mm.pluginsdk.ui.tools.l7.e(activity, 2, 1, 5, null);
            return true;
        }
        db5.t7.k(activity, null);
        return false;
    }

    public android.graphics.Bitmap Vi(android.app.Activity activity, int i17, int i18, android.content.Intent intent) {
        if (i18 != -1) {
            return null;
        }
        if (i17 == 2) {
            if (intent == null) {
                return null;
            }
            android.content.Intent intent2 = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.gallery.picker.view.ImageCropUI.class);
            intent2.putExtra("CropImageMode", 1);
            intent2.putExtra("CropImage_Filter", true);
            intent2.putExtra("CropImage_OutputPath", lp0.b.j() + "temp.avatar");
            intent2.putExtra("CropImage_ImgPath", (java.lang.String) null);
            intent2.putExtra("CropImage_from_scene", 3);
            com.tencent.mm.ui.tools.i1.a(activity, intent, intent2, lp0.b.j(), 4, null);
            return null;
        }
        if (i17 != 3) {
            if (i17 != 4 || intent == null) {
                return null;
            }
            java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
            if (stringExtra == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WorkerModelCallback", "crop picture failed");
                return null;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.WorkerModelCallback", "crop picture path %s ", stringExtra);
            return com.tencent.mm.sdk.platformtools.x.i0(stringExtra);
        }
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        android.content.Context applicationContext = activity.getApplicationContext();
        java.lang.String j17 = lp0.b.j();
        ((ub0.r) oVar).getClass();
        java.lang.String b17 = com.tencent.mm.pluginsdk.ui.tools.l7.b(applicationContext, intent, j17);
        if (b17 == null) {
            return null;
        }
        android.content.Intent intent3 = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.gallery.picker.view.ImageCropUI.class);
        intent3.putExtra("CropImageMode", 1);
        intent3.putExtra("CropImage_OutputPath", lp0.b.j() + "temp.avatar");
        intent3.putExtra("CropImage_ImgPath", b17);
        intent3.putExtra("CropImage_from_scene", 3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        arrayList.add(intent3);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/app/WorkerModelCallbackImpl", "setAvatarResult", "(Landroid/app/Activity;IILandroid/content/Intent;)Landroid/graphics/Bitmap;", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        return null;
    }

    public void Zi() {
        w11.w1.wi().h(7);
    }

    public com.tencent.mm.modelbase.m1 wi(int i17, boolean z17) {
        if (z17) {
            ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
            f21.r0.Bi().n0(i17);
        }
        f21.g0 g0Var = new f21.g0(i17);
        c01.d9.e().g(g0Var);
        return g0Var;
    }
}
