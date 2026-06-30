package uh5;

/* loaded from: classes12.dex */
public final class g {
    public g(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.String fileName, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fileName) && i17 != 0 && i18 != 0) {
                java.util.HashMap hashMap = uh5.h.f509543e;
                uh5.h hVar = (uh5.h) hashMap.get(fileName);
                if (hVar == null) {
                    hVar = new uh5.h();
                    java.lang.System.currentTimeMillis();
                    hashMap.put(fileName, hVar);
                }
                hVar.f509545b += i19 + '|';
                if (i19 > 0) {
                    if (hVar.f509544a == 0) {
                        hVar.f509544a = i19;
                    }
                } else if (hVar.f509544a != 0) {
                    hVar.f509546c++;
                    hVar.f509544a = 0;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.LimitImageDecoder", "dkprog addBit: [%d,%d,%d] succ:%d change:%d str:%s file:%s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(hVar.f509544a), java.lang.Integer.valueOf(hVar.f509546c), hVar.f509545b, fileName);
            }
        } catch (java.lang.Throwable th6) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.LimitImageDecoder", "get useopt  addBit :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
        }
    }
}
