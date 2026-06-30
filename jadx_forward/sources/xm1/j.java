package xm1;

/* loaded from: classes14.dex */
public class j extends xm1.h {
    @Override // xm1.h
    public boolean A(boolean z17) {
        return C(z17, false);
    }

    public final boolean C(boolean z17, boolean z18) {
        int i17;
        int i18;
        int i19;
        int i27;
        c().getMode();
        ym1.e eVar = ym1.f.f544667h;
        if (!eVar.e("music") && !eVar.e("openvoice")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseMusicAudioManager", "current not running a type as MUSIC");
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.BaseMusicAudioManager", "dkbt shiftSpeaker:%b -> %b  ", java.lang.Boolean.valueOf(eVar.k()), java.lang.Boolean.valueOf(z17));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.Bi()) {
            return false;
        }
        if (!z18 && (eVar.i() || this.f536704c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseMusicAudioManager", "dkbt shiftSpeaker isBluetoothOn");
            xm1.h.y(this, 0, null, 2, null);
            return false;
        }
        wo.c cVar = wo.v1.f529356c;
        if (cVar.f529122a) {
            int i28 = cVar.f529134g;
            if (i28 >= 0) {
                int i29 = -1;
                if (z17) {
                    if ((i28 >= 0) && (i28 & 16) > 0) {
                        super.a(true);
                    }
                    int i37 = cVar.f529134g;
                    if (!(i37 >= 0) || (i19 = (i37 & 224) >> 5) == 7) {
                        i19 = -1;
                    }
                    if (i19 >= 0) {
                        if ((i37 >= 0 ? 1 : 0) != 0 && (i27 = (i37 & 224) >> 5) != 7) {
                            i29 = i27;
                        }
                        xm1.h.y(this, i29, null, 2, null);
                    }
                } else {
                    if ((i28 >= 0) && (i28 & 1) > 0) {
                        super.a(false);
                    }
                    int i38 = cVar.f529134g;
                    if (!(i38 >= 0) || (i17 = (i38 & 14) >> 1) == 7) {
                        i17 = -1;
                    }
                    if (i17 >= 0) {
                        if ((i38 >= 0 ? 1 : 0) != 0 && (i18 = (i38 & 14) >> 1) != 7) {
                            i29 = i18;
                        }
                        xm1.h.y(this, i29, null, 2, null);
                    }
                }
                return z17;
            }
        }
        int i39 = z17 ? 0 : 3;
        if (!eVar.b().l() && !eVar.i()) {
            r3 = i39;
        }
        xm1.h.y(this, r3, null, 2, null);
        super.a(z17);
        return z17;
    }
}
