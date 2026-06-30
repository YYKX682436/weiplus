package qo5;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f447197b;

    /* renamed from: c, reason: collision with root package name */
    public static android.content.Intent f447198c;

    /* renamed from: d, reason: collision with root package name */
    public static long f447199d;

    /* renamed from: a, reason: collision with root package name */
    public static final qo5.b f447196a = new qo5.b();

    /* renamed from: e, reason: collision with root package name */
    public static final qo5.a f447200e = new qo5.a();

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPVoIPNotificationHelper", "cancelNotify: ");
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) mo3.f.f411939a).f(41);
        f447200e.m43072x2efc64();
    }

    public final android.widget.RemoteViews b(java.lang.String str, boolean z17, boolean z18) {
        android.widget.RemoteViews remoteViews;
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.f575003kc3 : com.p314xaae8f345.mm.R.C30867xcad56011.f575002kc2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        if (!ip.b.a()) {
            if (!fp.h.c(31) || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationInfo().targetSdkVersion < 31) {
                remoteViews = new android.widget.RemoteViews(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, com.p314xaae8f345.mm.R.C30864xbddafb2a.d4p);
                remoteViews.setTextViewText(com.p314xaae8f345.mm.R.id.pjm, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572028wp));
                remoteViews.setTextViewText(com.p314xaae8f345.mm.R.id.kfu, string);
            } else if (z18) {
                remoteViews = new android.widget.RemoteViews(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, com.p314xaae8f345.mm.R.C30864xbddafb2a.eqj);
                remoteViews.setTextViewText(com.p314xaae8f345.mm.R.id.kfu, string);
            } else {
                remoteViews = new android.widget.RemoteViews(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, com.p314xaae8f345.mm.R.C30864xbddafb2a.eqi);
                remoteViews.setTextViewText(com.p314xaae8f345.mm.R.id.pjm, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572028wp));
                remoteViews.setTextViewText(com.p314xaae8f345.mm.R.id.kfu, string);
            }
            return remoteViews;
        }
        android.widget.RemoteViews remoteViews2 = new android.widget.RemoteViews(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, com.p314xaae8f345.mm.R.C30864xbddafb2a.d4o);
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        java.lang.String d17 = n17 != null ? n17.d1() : null;
        ((sg3.a) v0Var).getClass();
        java.lang.String e17 = c01.a2.e(d17);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        android.graphics.Bitmap b17 = com.p314xaae8f345.mm.p943x351df9c2.g.b(str, false, 20, null);
        remoteViews2.setTextViewText(com.p314xaae8f345.mm.R.id.f567701kg0, e17);
        remoteViews2.setTextViewText(com.p314xaae8f345.mm.R.id.kg7, string);
        remoteViews2.setImageViewBitmap(com.p314xaae8f345.mm.R.id.kfq, b17);
        remoteViews2.setImageViewResource(com.p314xaae8f345.mm.R.id.pjk, com.p314xaae8f345.mm.R.C30861xcebc809e.btt);
        remoteViews2.setImageViewResource(com.p314xaae8f345.mm.R.id.kfv, z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.btp : com.p314xaae8f345.mm.R.C30861xcebc809e.btq);
        return remoteViews2;
    }

    public final void c(boolean z17) {
        java.lang.String str;
        android.os.Bundle extras;
        android.os.Bundle extras2;
        android.os.Bundle extras3;
        android.content.Intent intent = f447198c;
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMPVoIPNotificationHelper", "refreshService: serviceIntent is null");
            return;
        }
        if (intent == null || (extras3 = intent.getExtras()) == null || (str = extras3.getString("Voip_User")) == null) {
            str = "";
        }
        android.content.Intent intent2 = f447198c;
        boolean z18 = false;
        boolean z19 = (intent2 == null || (extras2 = intent2.getExtras()) == null) ? false : extras2.getBoolean("Voip_VideoCall", false);
        android.content.Intent intent3 = f447198c;
        if (intent3 != null && (extras = intent3.getExtras()) != null) {
            z18 = extras.getBoolean("Voip_CallInMulti", false);
        }
        d(str, z19, z18, z17);
    }

    public final void d(java.lang.String username, boolean z17, boolean z18, boolean z19) {
        java.lang.Object m143895xf1229813;
        java.lang.Object m143895xf12298132;
        java.lang.String str;
        android.os.Bundle extras;
        android.os.Bundle extras2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.VoIPMPVoIPNotificationHelper", "startFGS isBindVoIPForegroundService " + f447197b + " username：" + username + " videoCall:" + z17, new java.lang.Object[0]);
        if (fp.h.c(26)) {
            if (f447197b) {
                android.content.Intent intent = f447198c;
                if (intent == null || (extras2 = intent.getExtras()) == null || (str = extras2.getString("Voip_User")) == null) {
                    str = "";
                }
                android.content.Intent intent2 = f447198c;
                if (!((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, username) && z17 == ((intent2 == null || (extras = intent2.getExtras()) == null) ? false : extras.getBoolean("Voip_VideoCall", false)) && f447198c != null) ? false : true) && !z19) {
                    return;
                }
            }
            android.content.Intent intent3 = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.ServiceC18941x53733812.class);
            intent3.putExtra("Voip_User", username);
            intent3.putExtra("Voip_VideoCall", z17);
            intent3.putExtra("is_ilink_voip", true);
            intent3.putExtra("Voip_CallInMulti", z18);
            f447198c = intent3;
            if (z17) {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                if (!j35.u.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "android.permission.CAMERA", "android.permission.RECORD_AUDIO")) {
                    return;
                }
            }
            if (!z17) {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                if (!j35.u.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "android.permission.RECORD_AUDIO")) {
                    return;
                }
            }
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.startService(intent3);
                f447197b = true;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMPVoIPNotificationHelper", "bindServiceIfNeed: startService err", m143898xd4a2fc34);
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.startForegroundService(intent3);
                f447197b = true;
                m143895xf12298132 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            } catch (java.lang.Throwable th7) {
                p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf12298132 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
            }
            java.lang.Throwable m143898xd4a2fc342 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf12298132);
            if (m143898xd4a2fc342 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMPVoIPNotificationHelper", "bindServiceIfNeed: startForegroundService err", m143898xd4a2fc342);
            }
            f447197b = false;
        }
    }
}
