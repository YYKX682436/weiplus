package jz3;

/* loaded from: classes12.dex */
public class y extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public y() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        boolean z17;
        int i17;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5973x2e8f3b26 c5973x2e8f3b26 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5973x2e8f3b26) abstractC20979x809547d1;
        java.util.HashMap hashMap = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0.class)).f240658o;
        java.util.HashMap hashMap2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0.class)).f240659p;
        java.util.HashMap hashMap3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0.class)).f240660q;
        am.bt btVar = c5973x2e8f3b26.f136271g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(btVar.f87817c)) {
            z17 = false;
        } else {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScanTranslationListener", "request to translate img %s, sessionId %d", btVar.f87817c, java.lang.Integer.valueOf(btVar.f87816b));
                dm.aa y07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0.class)).cj().y0(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(btVar.f87817c + com.p314xaae8f345.mm.vfs.w6.l(btVar.f87817c)));
                java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                if (y07 != null && android.text.TextUtils.equals(y07.f65919x12058dee, c17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScanTranslationListener", "already has translation result, translateLanguageCode: " + c17);
                    java.lang.String str = y07.f65916x970b0f9e;
                    if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 c5974x1d8a7409 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409();
                        am.ct ctVar = c5974x1d8a7409.f136272g;
                        ctVar.f87933a = btVar.f87816b;
                        ctVar.f87935c = true;
                        ctVar.f87936d = str;
                        c5974x1d8a7409.e();
                        hashMap.remove(java.lang.Integer.valueOf(btVar.f87816b));
                        return true;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ScanTranslationListener", "can not find old translation result!");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScanTranslationListener", "request translation, languageCode: " + c17);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039 c6797x4bb2039 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039();
                switch (btVar.f87815a) {
                    case 1:
                        i17 = 4;
                        break;
                    case 2:
                        i17 = 5;
                        break;
                    case 3:
                        i17 = 6;
                        break;
                    case 4:
                        i17 = 7;
                        break;
                    case 5:
                        i17 = 8;
                        break;
                    case 6:
                        i17 = 9;
                        break;
                    case 7:
                        i17 = 10;
                        break;
                    default:
                        i17 = 0;
                        break;
                }
                c6797x4bb2039.f141278d = i17;
                hashMap2.put(java.lang.Integer.valueOf(btVar.f87816b), c6797x4bb2039);
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.p2 p2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.p2();
                java.lang.String str2 = btVar.f87817c;
                p2Var.f240508a = str2;
                p2Var.f240509b = str2;
                int m43592x7a249f0b = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str2).m43592x7a249f0b();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScanTranslationListener", "original img degree %s", java.lang.Integer.valueOf(m43592x7a249f0b));
                java.lang.String str3 = btVar.f87817c;
                java.lang.String c18 = e04.t2.c(str3);
                p2Var.f240513f = c18;
                android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(btVar.f87817c, new android.graphics.BitmapFactory.Options());
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C19986xa7bb691b()) == 1) {
                    J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.d(J2, -1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScanTranslationListener", "addBackgroundColor to %s", J2);
                }
                if (J2 != null) {
                    if (m43592x7a249f0b != 0) {
                        J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(J2, m43592x7a249f0b);
                    }
                    str3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.u0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.a0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.a0.class))).Ai("jpg");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(J2, 80, android.graphics.Bitmap.CompressFormat.JPEG, str3, false);
                    p2Var.f240509b = str3;
                }
                java.lang.String str4 = str3;
                hashMap.put(java.lang.Integer.valueOf(btVar.f87816b), p2Var);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                hashMap3.put(java.lang.Integer.valueOf(btVar.f87816b), java.lang.Long.valueOf(currentTimeMillis));
                e04.t2.a(c18, str4, 2, new jz3.x(this, c18, c6797x4bb2039, currentTimeMillis, c5973x2e8f3b26, str4, hashMap2, hashMap3));
                return true;
            } catch (java.lang.Exception e17) {
                z17 = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ScanTranslationListener", e17, "", new java.lang.Object[0]);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0.class)).fj(btVar.f87816b);
            }
        }
        return z17;
    }
}
