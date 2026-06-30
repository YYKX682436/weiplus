package mx3;

@j95.b
/* loaded from: classes10.dex */
public final class u extends i95.w implements mx3.j {

    /* renamed from: f, reason: collision with root package name */
    public static final mx3.s f414153f = new mx3.s(null);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f414154d = jz5.h.b(mx3.t.f414152d);

    /* renamed from: e, reason: collision with root package name */
    public zx3.a f414155e;

    public final yx3.v Ai() {
        return (yx3.v) ((jz5.n) this.f414154d).mo141623x754a37bb();
    }

    public boolean Bi(mx3.i iVar, android.os.Bundle params) {
        java.lang.String string;
        yx3.v Ai;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        zx3.a aVar = this.f414155e;
        if (aVar == null || aVar.f558637b != iVar) {
            if (iVar == mx3.i.VOIP) {
                this.f414155e = new zx3.d(this);
            } else if (iVar == mx3.i.MULTITALK) {
                this.f414155e = new zx3.c(this);
            } else if (iVar == mx3.i.WMPF_CALL_IN) {
                this.f414155e = new zx3.e(this);
            } else if (iVar == mx3.i.ILINK_VOIP) {
                this.f414155e = new zx3.b(this);
            }
        }
        zx3.a aVar2 = this.f414155e;
        if (aVar2 == null || (string = params.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)) == null) {
            return false;
        }
        int hashCode = string.hashCode();
        ym1.e eVar = ym1.f.f544667h;
        mx3.u uVar = aVar2.f558636a;
        switch (hashCode) {
            case -346633629:
                if (!string.equals("bad_net")) {
                    return false;
                }
                int i17 = params.getInt("streamType");
                if (!eVar.i() && !eVar.j() && (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar.a(), "silent") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar.a(), "vibrate"))) {
                    return false;
                }
                try {
                    uVar.Di(vx3.d.f522807e, i17, false);
                    uVar.Vi(null, false, 0L);
                    uVar.Ni(eVar.k());
                    break;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseSceneSetting", "playSound Failed Throwable t = ", th6);
                    return false;
                }
            case 100571:
                if (!string.equals("end")) {
                    return false;
                }
                int i18 = params.getInt("streamType");
                if (!eVar.i() && !eVar.j() && (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar.a(), "silent") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar.a(), "vibrate"))) {
                    return false;
                }
                try {
                    uVar.Di(vx3.d.f522807e, i18, false);
                    uVar.Vi(null, false, 0L);
                    if ((eVar.i() || eVar.j()) && (Ai = uVar.Ai()) != null) {
                        yx3.k kVar = Ai.f549476c;
                        if (kVar != null) {
                            kVar.a(0.5f, 0.5f);
                            Ai.f549483j = -1.0f;
                        } else {
                            Ai.f549483j = 0.5f;
                        }
                    }
                    uVar.Ni(eVar.k());
                    break;
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseSceneSetting", "playSound Failed Throwable t = ", th7);
                    return false;
                }
                break;
            case 94756344:
                if (!string.equals("close")) {
                    return false;
                }
                if (aVar2.f558638c) {
                    aVar2.f558639d = true;
                }
                yx3.v Ai2 = uVar.Ai();
                if (Ai2 != null) {
                    Ai2.d(vx3.b.f522799f);
                    break;
                }
                break;
            case 106440182:
                if (!string.equals("pause")) {
                    return false;
                }
                yx3.v Ai3 = uVar.Ai();
                if (Ai3 != null) {
                    Ai3.d(vx3.b.f522797d);
                    break;
                }
                break;
            case 109757538:
                if (!string.equals("start")) {
                    return false;
                }
                aVar2.f558638c = true;
                boolean a17 = aVar2.a(params.getString(dm.i4.f66875xa013b0d5), params.getInt("isVideoCall"), params.getBoolean("isOutCall"), params.getLong("seekStartMs"), params.containsKey("isSpeakOn") ? java.lang.Boolean.valueOf(params.getBoolean("isSpeakOn")) : null);
                aVar2.f558638c = false;
                if (aVar2.f558639d) {
                    aVar2.f558639d = false;
                    yx3.v Ai4 = uVar.Ai();
                    if (Ai4 != null) {
                        Ai4.d(vx3.b.f522799f);
                    }
                }
                return a17;
            default:
                return false;
        }
        return true;
    }

    public void Di(vx3.d soundType, int i17, boolean z17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(soundType, "soundType");
        yx3.v Ai = Ai();
        if (Ai != null) {
            Ai.f549478e = new vx3.c(soundType, i17, z17);
            ym1.e eVar = ym1.f.f544667h;
            if (eVar.b().k()) {
                i18 = eVar.c();
            } else {
                vx3.c cVar = Ai.f549478e;
                i18 = cVar != null ? cVar.f522804b : 0;
            }
            Ai.A = eVar.b().h(i18);
        }
    }

    public void Ni(boolean z17) {
        yx3.v Ai = Ai();
        if (Ai != null) {
            Ai.f(z17);
        }
    }

    public boolean Ri(boolean z17) {
        yx3.v Ai;
        java.lang.String a17 = ym1.f.f544667h.a();
        if ((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, "vibrate") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, "normal")) && (Ai = Ai()) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneServiceHelper", "updateVibrateInfo");
            Ai.f549491r = true;
        }
        return true;
    }

    public boolean Ui(java.lang.String name, boolean z17) {
        yx3.v Ai;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        java.lang.String a17 = ym1.f.f544667h.a();
        if ((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, "vibrate") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, "normal")) && (Ai = Ai()) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneServiceHelper", "updateRingtoneInfo name:" + name + ", isOutCall:" + z17 + ", seekStartMs:" + Ai.f549479f);
            Ai.f549474a = Ai.f549477d;
            Ai.f549477d = null;
            Ai.f549480g = z17;
            Ai.f549483j = -1.0f;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = Ai.f549484k;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            Ai.f549484k = p3325xe03a0797.p3326xc267989b.l.d(Ai.f549485l, null, null, new yx3.s(Ai, name, z17, null), 3, null);
        }
        return true;
    }

    public void Vi(java.lang.String str, boolean z17, long j17) {
        yx3.v Ai = Ai();
        if (Ai != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneServiceHelper", "updateRingtoneInfo name:" + str + ", isOutCall:" + z17 + ", seekStartMs:" + j17);
            Ai.f549474a = Ai.f549477d;
            Ai.f549477d = null;
            Ai.f549479f = j17;
            Ai.f549480g = z17;
            Ai.f549483j = -1.0f;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = Ai.f549484k;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            Ai.f549484k = p3325xe03a0797.p3326xc267989b.l.d(Ai.f549485l, null, null, new yx3.u(Ai, str, z17, null), 3, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        ?? r37;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        mx3.i0 i0Var = mx3.i0.f414110a;
        if (gm0.j1.b().n()) {
            mx3.i0.n();
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                mx3.i0 i0Var2 = mx3.i0.f414110a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneManager", "deleteNonMyVoipChannel");
                try {
                    if (gm0.j1.b().n()) {
                        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("notification");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                        android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
                        java.lang.String[] b17 = i0Var2.e().b();
                        if (b17 != null) {
                            r37 = new java.util.ArrayList();
                            for (java.lang.String str : b17) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                                vx3.i i17 = mx3.i0.i(str);
                                java.lang.String str2 = i17 != null ? i17.f522828l : null;
                                if (str2 != null) {
                                    r37.add(str2);
                                }
                            }
                        } else {
                            r37 = kz5.p0.f395529d;
                        }
                        r37.toString();
                        for (android.app.NotificationChannel notificationChannel : notificationManager.getNotificationChannels()) {
                            java.lang.String id6 = notificationChannel.getId();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(id6, "getId(...)");
                            if (r26.n0.B(id6, "voip_ringtone_channel_", false) && !r37.contains(notificationChannel.getId())) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneManager", "deleteNonMyVoipChannel id:%s", notificationChannel.getId());
                                notificationManager.deleteNotificationChannel(notificationChannel.getId());
                            }
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RingtoneManager", "deleteNonMyVoipChannel error: " + e17.getLocalizedMessage());
                }
            }
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f) ((iz2.c) pf5.u.f435469a.e(zy2.b6.class).c(iz2.c.class))).f218266g.add(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui.ActivityC17235xecd31272.class);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = mx3.i0.f414117h;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        mx3.i0.f414117h = null;
    }

    public nx3.a wi() {
        int i17;
        yx3.v Ai = Ai();
        if (Ai == null) {
            return null;
        }
        Ai.f549494u = java.lang.System.currentTimeMillis() - Ai.f549492s;
        ym1.e eVar = ym1.f.f544667h;
        if (eVar.b().k()) {
            i17 = eVar.c();
        } else {
            vx3.c cVar = Ai.f549478e;
            i17 = cVar != null ? cVar.f522804b : 0;
        }
        nx3.a aVar = new nx3.a(Ai.f549498y == vx3.g.f522815i, Ai.f549494u, Ai.f549493t, java.lang.String.valueOf(Ai.B), Ai.f549499z, Ai.f549495v, Ai.E, Ai.D, eVar.b().h(i17), i17, Ai.A, !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar.a(), "normal"), Ai.C, Ai.f549497x, Ai.f549496w);
        Ai.f549492s = 0L;
        Ai.f549494u = 0L;
        Ai.f549495v = true;
        Ai.f549496w = "";
        Ai.f549498y = vx3.g.f522812f;
        Ai.f549499z = "";
        Ai.B = 0;
        Ai.E = false;
        Ai.A = 0;
        return aVar;
    }
}
