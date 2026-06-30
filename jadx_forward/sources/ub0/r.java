package ub0;

@j95.b
/* loaded from: classes.dex */
public class r extends i95.w implements vb0.o {
    public boolean Ai(com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010, java.lang.String str, java.lang.String str2, int i17) {
        boolean z17 = false;
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TakePhotoUtil", "takePhotoFromSys fragment is null!");
        } else if (!iq.b.g(abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7438x76847179()) && !iq.b.v(abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7438x76847179()) && !iq.b.e(abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7438x76847179())) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.f273299a = com.p314xaae8f345.mm.vfs.w6.i(str + str2, true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("takePhotoFromSys(), filePath = ");
            sb6.append(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.f273299a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TakePhotoUtil", sb6.toString());
            android.app.Activity mo7438x76847179 = abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7438x76847179();
            java.lang.String str3 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.f273299a;
            android.content.SharedPreferences.Editor edit = mo7438x76847179.getSharedPreferences("system_config_prefs", 0).edit();
            edit.putString("camera_file_path", str3);
            edit.commit();
            android.content.Intent intent = new android.content.Intent("android.media.action.IMAGE_CAPTURE");
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
            if (!r6Var.m()) {
                try {
                    r6Var.J();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TakePhotoUtil", e17, "", new java.lang.Object[0]);
                }
            }
            if (r6Var.m()) {
                android.net.Uri b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7438x76847179(), new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.f273299a));
                intent.addFlags(2);
                intent.putExtra("output", b17);
                try {
                    abstractViewOnAttachStateChangeListenerC21400xb429b010.m7587x5dc77fb5(intent, i17);
                    z17 = true;
                } catch (android.content.ActivityNotFoundException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), " + e18.getMessage());
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), dir not exist. ".concat(str));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TakePhotoUtil", "takePhoto(), dir = [%s], filename = [%s], cmd = [%s], result = [%s]", str, str2, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public void wi(android.app.Activity activity, int i17, int i18, int i19, android.content.Intent intent) {
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("max_select_count", i18);
        intent.putExtra("query_media_type", 2);
        intent.putExtra("query_source_type", i19);
        intent.addFlags(67108864);
        j45.l.n(activity, "gallery", ".ui.GalleryEntryUI", intent, i17);
    }
}
