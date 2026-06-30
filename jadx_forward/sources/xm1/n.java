package xm1;

/* loaded from: classes14.dex */
public class n extends xm1.h {
    @Override // xm1.h
    public boolean A(boolean z17) {
        c().getMode();
        ym1.e eVar = ym1.f.f544667h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPAudioManager", "dkbt shiftSpeaker:%b -> %b", java.lang.Boolean.valueOf(eVar.k()), java.lang.Boolean.valueOf(z17));
        boolean z18 = false;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.Bi()) {
            if (!eVar.i() && !this.f536704c) {
                wo.c cVar = wo.v1.f529356c;
                if (cVar.f529122a) {
                    if (cVar.b()) {
                        int i17 = cVar.f529126c;
                        if (i17 >= 0) {
                            xm1.h.y(this, i17, null, 2, null);
                        } else if (cVar.f529128d >= 0) {
                            if (z17) {
                                xm1.h.y(this, 0, null, 2, null);
                            } else {
                                xm1.h.y(this, 2, null, 2, null);
                            }
                        }
                        if (cVar.f529130e <= 0) {
                            return z17;
                        }
                        a(z17);
                        return z17;
                    }
                    if (cVar.a()) {
                        if (!z17) {
                            if (cVar.a() && (cVar.f529132f & 1) > 0) {
                                a(false);
                            }
                            if (cVar.d() < 0) {
                                return z17;
                            }
                            xm1.h.y(this, cVar.d(), null, 2, null);
                            return z17;
                        }
                        if (cVar.a() && (cVar.f529132f & 16) > 0) {
                            z18 = true;
                        }
                        if (z18) {
                            a(true);
                        }
                        if (cVar.e() < 0) {
                            return z17;
                        }
                        xm1.h.y(this, cVar.e(), null, 2, null);
                        return z17;
                    }
                }
                if (z17) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
                    f0Var.f391649d = 3;
                    int i18 = cVar.B;
                    if (i18 > -1) {
                        f0Var.f391649d = i18;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPAudioManager", "VoIP doShiftSpeaker useSpeakerMode: %s, getMode: %s", java.lang.Integer.valueOf(f0Var.f391649d), java.lang.Integer.valueOf(f()));
                    if (f0Var.f391649d != f()) {
                        x(f0Var.f391649d, new xm1.l(f0Var, this));
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPAudioManager", "voip doShiftSpeaker true isSpeakerphoneOn: %s", java.lang.Boolean.valueOf(c().isSpeakerphoneOn()));
                    a(true);
                    return z17;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
                f0Var2.f391649d = 3;
                if (fp.e0.g() && 2 == wo.v1.f529366m.f529283h) {
                    f0Var2.f391649d = 2;
                }
                int i19 = cVar.C;
                if (i19 > -1) {
                    f0Var2.f391649d = i19;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPAudioManager", "VoIP doShiftSpeaker usePhoneMode: %s getMode:%s", java.lang.Integer.valueOf(f0Var2.f391649d), java.lang.Integer.valueOf(f()));
                if (f0Var2.f391649d != f()) {
                    x(f0Var2.f391649d, new xm1.m(f0Var2, this));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPAudioManager", "VoIP doShiftSpeaker false isSpeakerphoneOn: %s", java.lang.Boolean.valueOf(c().isSpeakerphoneOn()));
                a(false);
                return z17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPAudioManager", "dkbt shiftSpeaker isBluetoothOn");
            xm1.h.y(this, 3, null, 2, null);
        }
        return false;
    }
}
