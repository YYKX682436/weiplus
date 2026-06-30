package com.p314xaae8f345.mm.app;

/* loaded from: classes13.dex */
public class e5 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f134938d;

    /* renamed from: e, reason: collision with root package name */
    public static int f134939e;

    /* renamed from: f, reason: collision with root package name */
    public static int f134940f;

    public e5() {
        super(0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            f134939e = 2;
            f134940f = 12;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s()) {
            f134939e = 22;
            f134940f = 32;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j()) {
            f134939e = 42;
            f134940f = 52;
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5703x726b2593 c5703x726b2593 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5703x726b2593) abstractC20979x809547d1;
        if (c5703x726b2593 == null) {
            return false;
        }
        am.pj pjVar = c5703x726b2593.f136025g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaLeakReporter", "event audio[%b %d] mediaplayer[%b %d] audioRecord[%b %d] hadRpt[%b]", java.lang.Boolean.valueOf(pjVar.f89155a), java.lang.Integer.valueOf(pjVar.f89156b), java.lang.Boolean.valueOf(pjVar.f89157c), java.lang.Integer.valueOf(pjVar.f89158d), java.lang.Boolean.valueOf(pjVar.f89159e), java.lang.Integer.valueOf(pjVar.f89160f), java.lang.Boolean.valueOf(f134938d));
        if (pjVar.f89155a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(650L, f134939e, 1L, false);
        }
        if (pjVar.f89157c) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(650L, f134940f, 1L, false);
        }
        if (pjVar.f89159e) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(650L, f134940f + 1, 1L, false);
        }
        if (f134938d) {
            return false;
        }
        if (pjVar.f89156b <= 10 && pjVar.f89158d <= 10 && pjVar.f89160f < 1) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.i("mediaLeak", to.f.b(), null);
        f134938d = true;
        return false;
    }
}
