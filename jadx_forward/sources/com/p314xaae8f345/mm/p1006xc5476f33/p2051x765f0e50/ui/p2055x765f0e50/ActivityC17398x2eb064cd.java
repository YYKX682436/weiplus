package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

@db5.a(m123858x6ac9171 = 1)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingMessageRingtoneUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "Lcom/tencent/mm/plugin/setting/ui/setting/z1;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI */
/* loaded from: classes11.dex */
public class ActivityC17398x2eb064cd extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 implements com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.z1 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.Future f241771d;

    /* renamed from: e, reason: collision with root package name */
    public android.media.SoundPool f241772e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f241773f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f241774g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.y4(this));

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f241775h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Integer f241776i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Integer f241777m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Integer f241778n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17399x6c75451 f241779o;

    /* renamed from: p, reason: collision with root package name */
    public android.media.Ringtone f241780p;

    /* renamed from: q, reason: collision with root package name */
    public ip.k f241781q;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI$ringtoneResUpdateListener$1] */
    public ActivityC17398x2eb064cd() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f241779o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5948x1c015af3>(a0Var) { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI$ringtoneResUpdateListener$1
            {
                this.f39173x3fe91575 = 1941428483;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5948x1c015af3 c5948x1c015af3) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5948x1c015af3 event = c5948x1c015af3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingMessageRingtoneUI", "ringtone update res");
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.x4(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17398x2eb064cd.this));
                return true;
            }
        };
    }

    public static final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17398x2eb064cd activityC17398x2eb064cd) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finish ");
        ip.k kVar = activityC17398x2eb064cd.f241781q;
        sb6.append(kVar != null ? java.lang.Integer.valueOf(kVar.f375104a) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingMessageRingtoneUI", sb6.toString());
        ip.k kVar2 = activityC17398x2eb064cd.f241781q;
        if (kVar2 != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("setting_notification");
            int i17 = kVar2.f375104a;
            if (M != null) {
                M.putInt("settings.ringtone.wechat", i17);
            }
            java.lang.String n17 = ip.b.n(i17);
            java.lang.Object[] objArr = new java.lang.Object[1];
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            objArr[0] = n17 == null ? "" : n17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewMsgNotificationHelper", "reCreateNewMsgNotificationChannel ringtonePath:%s", objArr);
            try {
                int i18 = android.os.Build.VERSION.SDK_INT;
                if (i18 >= 26) {
                    android.content.SharedPreferences v17 = gm0.m.v();
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class);
                    android.app.NotificationChannel notificationChannel = notificationManager.getNotificationChannel(n25.a.a());
                    java.lang.String str = "message_channel_" + c01.id.a();
                    android.app.NotificationChannel notificationChannel2 = new android.app.NotificationChannel(str, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574178hb5), notificationChannel.getImportance());
                    notificationChannel2.setDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574177hb4));
                    notificationChannel2.enableLights(true);
                    notificationChannel2.setLightColor(-16711936);
                    notificationChannel2.setVibrationPattern(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274523b);
                    notificationChannel2.enableVibration(notificationChannel.shouldVibrate());
                    if (i18 >= 29) {
                        notificationChannel2.setAllowBubbles(notificationChannel.canBubble());
                    }
                    notificationChannel2.setBypassDnd(notificationChannel.canBypassDnd());
                    notificationChannel2.setLockscreenVisibility(notificationChannel.getLockscreenVisibility());
                    notificationChannel2.setShowBadge(notificationChannel.canShowBadge());
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17)) {
                        notificationChannel2.setSound(android.provider.Settings.System.DEFAULT_NOTIFICATION_URI, android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT);
                    } else {
                        android.net.Uri b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(context, com.p314xaae8f345.mm.vfs.r6.j(new java.io.File(n17)));
                        context.grantUriPermission("com.android.systemui", b17, 1);
                        notificationChannel2.setSound(b17, android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT);
                    }
                    notificationManager.deleteNotificationChannel(n25.a.a());
                    notificationManager.createNotificationChannel(notificationChannel2);
                    v17.edit().putString("message_channel_id", str).commit();
                    n25.a.f415850a = str;
                    ip.b.f375079b = str;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewMsgNotificationHelper", "reCreateNewMsgNotificationChannel %s, %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
        }
        activityC17398x2eb064cd.X6();
        activityC17398x2eb064cd.finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.z1
    public boolean T5(ip.k composition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        java.lang.Integer num = this.f241778n;
        return num != null && num.intValue() == composition.f375104a;
    }

    public final void V6() {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f241778n, this.f241777m)) {
            finish();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(mo55332x76847179());
        u1Var.g(getString(com.p314xaae8f345.mm.R.C30867xcad56011.inc));
        u1Var.n(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571995vq));
        u1Var.j(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
        u1Var.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.q4(this));
        u1Var.q(false);
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 W6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f241774g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.z1
    public void X3(ip.k composition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        java.lang.Integer num = this.f241777m;
        int i17 = composition.f375104a;
        if (num == null || num.intValue() != i17) {
            m78500x43e00957(0, true);
        }
        java.lang.String n17 = ip.b.n(i17);
        this.f241781q = composition;
        this.f241778n = java.lang.Integer.valueOf(i17);
        android.media.Ringtone ringtone = this.f241780p;
        if (ringtone != null) {
            ringtone.stop();
        }
        java.lang.Integer num2 = this.f241776i;
        if (num2 != null) {
            int intValue = num2.intValue();
            android.media.SoundPool soundPool = this.f241772e;
            if (soundPool != null) {
                soundPool.stop(intValue);
            }
        }
        if (i17 == 0) {
            android.media.Ringtone ringtone2 = android.media.RingtoneManager.getRingtone(mo55332x76847179(), android.media.RingtoneManager.getDefaultUri(2));
            this.f241780p = ringtone2;
            if (ringtone2 != null) {
                ringtone2.play();
                return;
            }
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n17);
        if (this.f241772e == null) {
            this.f241772e = new android.media.SoundPool.Builder().setMaxStreams(10).setAudioAttributes(new android.media.AudioAttributes.Builder().setLegacyStreamType(5).build()).build();
        }
        android.media.SoundPool soundPool2 = this.f241772e;
        if (soundPool2 != null) {
            soundPool2.load(com.p314xaae8f345.mm.vfs.w6.i(n17, true), 1);
        }
        android.media.SoundPool soundPool3 = this.f241772e;
        if (soundPool3 != null) {
            soundPool3.setOnLoadCompleteListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.w4(this, n17));
        }
    }

    public final void X6() {
        java.lang.Integer num = this.f241778n;
        if (num == null || num.intValue() <= 0) {
            return;
        }
        int intValue = num.intValue();
        java.util.ArrayList arrayList = this.f241773f;
        if (intValue < arrayList.size()) {
            java.lang.Object obj = arrayList.get(num.intValue());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef.f243039e.a(this, "select_view_ringtone_sound", ((ip.k) obj).f375105b, 4);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.clo;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.iuj);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.r4(this));
        m78494xd9193382(0, mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.s4(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        m78500x43e00957(0, false);
        mo78530x8b45058f();
        W6().mo7960x6cab2c8d(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.y1(this.f241773f, this));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d c22847x422a813d = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d(mo55332x76847179());
        c22847x422a813d.Q(1);
        W6().mo7967x900dcbe1(c22847x422a813d);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 W6 = W6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        in5.t0 t0Var = new in5.t0(mo55332x76847179);
        t0Var.f374662c = in5.q.f374646d;
        t0Var.c(com.p314xaae8f345.mm.R.C30859x5a72f63.f560840vn);
        t0Var.b(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        t0Var.d(com.p314xaae8f345.mm.R.C30860x5b28f31.f561171bd);
        android.content.res.Resources resources = t0Var.f374661b;
        t0Var.f374664e = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        t0Var.f374665f = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        W6.N(t0Var.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingMessageRingtoneUI", "current ringtone:" + ip.b.o());
        if (!com.p314xaae8f345.mm.vfs.w6.j(ip.b.n(1))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingMessageRingtoneUI", "file no exits");
            mo48813x58998cd();
            ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).wi(96);
            this.f241775h = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(mo55332x76847179(), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggd), true, 3, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.t4(this));
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.u4 u4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.u4(this);
            ku5.t0 t0Var2 = (ku5.t0) u0Var;
            t0Var2.getClass();
            this.f241771d = t0Var2.z(u4Var, 15000L, false);
            ((ku5.t0) ku5.t0.f394148d).g(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.v4.f243163d);
        }
        X6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.z1
    /* renamed from: notifyDataSetChanged */
    public void mo68957xced61ae5() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = W6().mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        V6();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.util.ArrayList arrayList = this.f241773f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(new ip.k(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571997vs)));
        arrayList2.add(new ip.k(1, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574519ik2)));
        arrayList2.add(new ip.k(2, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ik8)));
        arrayList2.add(new ip.k(3, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ik7)));
        arrayList2.add(new ip.k(4, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574522ik5)));
        arrayList2.add(new ip.k(5, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574520ik3)));
        arrayList2.add(new ip.k(6, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574521ik4)));
        arrayList2.add(new ip.k(7, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ik6)));
        arrayList.addAll(arrayList2);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(ip.b.o());
        this.f241777m = valueOf;
        if (valueOf != null && valueOf.intValue() == -1) {
            this.f241777m = 0;
        }
        this.f241778n = this.f241777m;
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        android.media.Ringtone ringtone = this.f241780p;
        if (ringtone != null) {
            ringtone.stop();
        }
        android.media.SoundPool soundPool = this.f241772e;
        if (soundPool != null) {
            soundPool.release();
        }
        super.onDestroy();
        mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        t14.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef.f243039e;
        set.addAll(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef.f243040f);
    }
}
