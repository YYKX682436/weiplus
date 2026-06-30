package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb;

/* loaded from: classes11.dex */
public class b extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.e f232168a;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.e eVar) {
        this.f232168a = eVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(intent.getAction())) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("mm_music_notification_action_key");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMusicNotification", "action is null, err, return");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMusicNotification", "action:%s", stringExtra);
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l a17 = kl3.t.g().a();
        qk.g9 g9Var = (qk.g9) i95.n0.c(qk.g9.class);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMusicNotification", "musicPlayer is null, return");
            return;
        }
        ql3.a z17 = ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).z();
        if (z17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMusicNotification", "music is null, return");
            return;
        }
        boolean equals = stringExtra.equals("mm_music_notification_action_play");
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.e eVar = this.f232168a;
        if (equals) {
            a17.mo67221xc84dc82d();
            android.os.Bundle bundle = eVar.f232174b;
            if (bundle != null) {
                ll3.b1.f400674b.w0(bundle);
            }
            pl3.c.c(2, z17);
            return;
        }
        if (stringExtra.equals("mm_music_notification_action_pause")) {
            a17.b();
            xl3.b k17 = kl3.t.k();
            k17.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicAudioFocusHelper", "abandonFocus");
            android.media.AudioManager audioManager = k17.f536650a;
            if (audioManager != null) {
                audioManager.abandonAudioFocus(k17.f536651b);
            }
            pl3.c.c(3, z17);
            return;
        }
        if (stringExtra.equals("mm_music_notification_action_pre")) {
            if (z17.f66984xb1df81fa == 11) {
                android.os.Bundle bundle2 = eVar.f232174b;
                if (bundle2 != null) {
                    ll3.b1.f400674b.w0(bundle2);
                }
                kl3.t.g().m(true);
            } else if (z17.f446109k2 || ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).f390387c == 2) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4();
                am.jk jkVar = c5722xb16ab0f4.f136045g;
                jkVar.f88569b = 17;
                jkVar.f88573f = "";
                c5722xb16ab0f4.b(android.os.Looper.getMainLooper());
                if (z17.f446109k2) {
                    ((rk4.z8) g9Var).getClass();
                    com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 interfaceC26826xca759055 = zk4.l.f555073c;
                    if (interfaceC26826xca759055 != null) {
                        p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169711x21b9fe47(((b66.q) interfaceC26826xca759055).m105978x2737f10());
                    }
                } else {
                    ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).D();
                }
            } else {
                a17.c(0);
                a17.mo67221xc84dc82d();
            }
            eVar.d(z17, 13, a17.e());
            pl3.c.c(1, z17);
            return;
        }
        if (!stringExtra.equals("mm_music_notification_action_next")) {
            if (stringExtra.equals("mm_music_notification_action_close")) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(eVar.f232178f);
                if (z17.f446109k2) {
                    ((rk4.z8) g9Var).zj();
                } else {
                    a17.mo67222x66343656();
                }
                pl3.c.c(5, z17);
                return;
            }
            return;
        }
        if (z17.f66984xb1df81fa == 11) {
            android.os.Bundle bundle3 = eVar.f232174b;
            if (bundle3 != null) {
                ll3.b1.f400674b.w0(bundle3);
            }
            kl3.t.g().m(true);
        } else if (z17.f446109k2 || ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).f390387c == 2) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f42 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4();
            am.jk jkVar2 = c5722xb16ab0f42.f136045g;
            jkVar2.f88569b = 16;
            jkVar2.f88573f = "";
            c5722xb16ab0f42.b(android.os.Looper.getMainLooper());
            if (z17.f446109k2) {
                ((rk4.z8) g9Var).getClass();
                com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 interfaceC26826xca7590552 = zk4.l.f555073c;
                if (interfaceC26826xca7590552 != null) {
                    p3380x6a61f93.p3382xf513feca.C30534x21b91836.m169710x21b973ff(((b66.q) interfaceC26826xca7590552).m105978x2737f10());
                }
            } else {
                ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).C();
            }
        } else {
            a17.c(0);
            a17.mo67221xc84dc82d();
        }
        eVar.d(z17, 14, a17.e());
        pl3.c.c(4, z17);
    }
}
