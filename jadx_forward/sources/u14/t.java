package u14;

@j95.b
/* loaded from: classes5.dex */
public final class t extends i95.w implements wd0.l1 {
    public void Ai(java.lang.String eventId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ce.f242442a.a();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(eventId, kz5.b1.e(new jz5.l("care_session_id", a17)), 35684);
    }

    public void Bi(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidService", "WaveHAid, destroy haid inst");
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17488x7dde8191.m68989xed3b9540(j17);
    }

    public int Di() {
        int ordinal = Ui().ordinal();
        if (ordinal != 2) {
            if (ordinal == 3) {
                return 2;
            }
            if (ordinal == 4) {
                return 1;
            }
            if (ordinal == 5) {
                return 4;
            }
        }
        return 3;
    }

    public int Ni() {
        int i17 = (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ui() ? new cv.v0(4, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6m), 0, 4, null) : ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).aj() ? new cv.v0(3, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6o), 0, 4, null) : ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Vi() ? new cv.v0(1, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6p), 0, 4, null) : new cv.v0(2, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6n), 0, 4, null)).f304049a;
        if (i17 != 1) {
            if (i17 == 2) {
                return 1;
            }
            if (i17 == 3 || i17 == 4) {
                return 3;
            }
        }
        return 2;
    }

    public final int Ri(wd0.g1 g1Var) {
        int ordinal = g1Var.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 100;
        }
        int i17 = 3;
        if (ordinal != 2) {
            if (ordinal == 3) {
                return 2;
            }
            i17 = 4;
            if (ordinal == 4) {
                return 1;
            }
            if (ordinal != 5) {
                throw new jz5.j();
            }
        }
        return i17;
    }

    public wd0.g1 Ui() {
        java.lang.String str;
        java.lang.Object m143895xf1229813;
        if (!j65.e.b()) {
            return wd0.g1.f526246e;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("HearingAid_");
        long n17 = j62.e.g().n();
        if (n17 == 0) {
            str = "0";
        } else if (n17 > 0) {
            str = java.lang.Long.toString(n17, 10);
        } else {
            char[] cArr = new char[64];
            long j17 = (n17 >>> 1) / 5;
            long j18 = 10;
            int i17 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (n17 - (j17 * j18)), 10);
            while (j17 > 0) {
                i17--;
                cArr[i17] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                j17 /= j18;
            }
            str = new java.lang.String(cArr, i17, 64 - i17);
        }
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(wd0.g1.m173489xdce0328(java.lang.String.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(sb7).getString("hearing_aid_mode_local", "CLOSE"))));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813) != null) {
            m143895xf1229813 = wd0.g1.f526246e;
        }
        return (wd0.g1) m143895xf1229813;
    }

    public wd0.g1 Vi() {
        java.lang.String str;
        java.lang.Object m143895xf1229813;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("HearingAid_");
        long n17 = j62.e.g().n();
        if (n17 == 0) {
            str = "0";
        } else if (n17 > 0) {
            str = java.lang.Long.toString(n17, 10);
        } else {
            char[] cArr = new char[64];
            long j17 = (n17 >>> 1) / 5;
            long j18 = 10;
            int i17 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (n17 - (j17 * j18)), 10);
            while (j17 > 0) {
                i17--;
                cArr[i17] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                j17 /= j18;
            }
            str = new java.lang.String(cArr, i17, 64 - i17);
        }
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(wd0.g1.m173489xdce0328(java.lang.String.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(sb7).getString("hearing_aid_mode_local_old", "CLOSE"))));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813) != null) {
            m143895xf1229813 = wd0.g1.f526246e;
        }
        return (wd0.g1) m143895xf1229813;
    }

    public wd0.g1 Zi() {
        java.lang.String str;
        java.lang.Object m143895xf1229813;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("HearingAid_");
        long n17 = j62.e.g().n();
        if (n17 == 0) {
            str = "0";
        } else if (n17 > 0) {
            str = java.lang.Long.toString(n17, 10);
        } else {
            char[] cArr = new char[64];
            long j17 = (n17 >>> 1) / 5;
            long j18 = 10;
            int i17 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (n17 - (j17 * j18)), 10);
            while (j17 > 0) {
                i17--;
                cArr[i17] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                j17 /= j18;
            }
            str = new java.lang.String(cArr, i17, 64 - i17);
        }
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(sb7).getInt("hearing_aid_mode_remote", 0);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(i18 != 0 ? i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? i18 != 100 ? wd0.g1.f526246e : wd0.g1.f526247f : wd0.g1.f526251m : wd0.g1.f526248g : wd0.g1.f526249h : wd0.g1.f526250i : wd0.g1.f526246e);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813) != null) {
            m143895xf1229813 = wd0.g1.f526246e;
        }
        return (wd0.g1) m143895xf1229813;
    }

    public int aj(long j17, int i17, int i18, int i19, int i27, int i28) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidService", "WaveHAid, init haid inst, type:" + i17 + ", device:" + i18 + ", scene:" + i19 + ", sr:" + i27 + ", ch:" + i28 + '.');
        return com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17488x7dde8191.m68991x22d930(j17, i17, i18, i19, i27, i28);
    }

    public boolean bj() {
        wd0.g1 Ui = Ui();
        return (Ui != wd0.g1.f526247f && Ui != wd0.g1.f526246e) && cj();
    }

    public boolean cj() {
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2536x30bfd4.C20332xeefa2873()) == 1;
    }

    public void fj(p3325xe03a0797.p3326xc267989b.y0 lifecycleScope, wd0.g1 mode) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleScope, "lifecycleScope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mode, "mode");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("HearingAid_");
        long n17 = j62.e.g().n();
        if (n17 == 0) {
            str = "0";
        } else if (n17 > 0) {
            str = java.lang.Long.toString(n17, 10);
        } else {
            char[] cArr = new char[64];
            long j17 = (n17 >>> 1) / 5;
            long j18 = 10;
            int i17 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (n17 - (j17 * j18)), 10);
            for (long j19 = 0; j17 > j19; j19 = 0) {
                i17--;
                cArr[i17] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                j17 /= j18;
            }
            str = new java.lang.String(cArr, i17, 64 - i17);
        }
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidService", "current select mode (update set mode) is " + mode.name() + ", uin is " + sb7);
        p3325xe03a0797.p3326xc267989b.l.d(lifecycleScope, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.dd(Ri(mode), null), 3, null);
        wd0.g1 Ui = Ui();
        wd0.g1 g1Var = wd0.g1.f526246e;
        if (Ui != g1Var) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(sb7).putString("hearing_aid_mode_local_old", Ui().name());
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(sb7).putString("hearing_aid_mode_local", mode.name());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("before_value", java.lang.Integer.valueOf(Vi() == g1Var ? 2 : 1));
        hashMap.put("after_value", java.lang.Integer.valueOf(Ui() == g1Var ? 2 : 1));
        hashMap.put("vocals_enhance_mode", java.lang.Integer.valueOf(Ri(Ui())));
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bm.f242411a;
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bm.f242412b;
        if (str2 == null) {
            str2 = (java.lang.String) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bm.f242411a).mo141623x754a37bb();
        }
        hashMap.put("care_mode_sessionid", str2);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("vocals_enhance_btn", "set_vocal_enhance", hashMap, 35684);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        boolean bj6 = bj();
        int Di = Di();
        int Ni = Ni();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidService", "initXWebAudioHAidConfig, enable:" + bj6 + ", haidType:" + Di + ", haidDevice:" + Ni);
        com.p314xaae8f345.p3210x3857dc.s1.a(bj6, Di, Ni, null);
    }

    public long wi() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsHearingAidService", "WaveHAid, create haid inst.");
        return com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17488x7dde8191.m68988xc8697982();
    }
}
