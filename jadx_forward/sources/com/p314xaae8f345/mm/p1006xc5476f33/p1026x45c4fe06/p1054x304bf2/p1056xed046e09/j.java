package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09;

/* loaded from: classes7.dex */
public class j {

    /* renamed from: j, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.j f159756j;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f159757a;

    /* renamed from: b, reason: collision with root package name */
    public int f159758b;

    /* renamed from: c, reason: collision with root package name */
    public int f159759c;

    /* renamed from: d, reason: collision with root package name */
    public int f159760d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f159761e;

    /* renamed from: f, reason: collision with root package name */
    public int f159762f;

    /* renamed from: g, reason: collision with root package name */
    public int f159763g = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f159764h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f159765i;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.j a() {
        if (f159756j == null) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.j.class) {
                if (f159756j == null) {
                    f159756j = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.j();
                }
            }
        }
        return f159756j;
    }

    public void b(int i17, int i18) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f159761e) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f159757a)) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7080x809107ed c7080x809107ed = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7080x809107ed();
        c7080x809107ed.f143879d = c7080x809107ed.b("SessionId", this.f159761e, true);
        c7080x809107ed.f143880e = c7080x809107ed.b("AppId", this.f159757a, true);
        c7080x809107ed.f143881f = this.f159758b;
        int i19 = this.f159759c;
        cm.m mVar = null;
        c7080x809107ed.f143882g = i19 != 1 ? i19 != 2 ? i19 != 3 ? null : cm.l.test : cm.l.debug : cm.l.release;
        int i27 = this.f159760d;
        if (i27 != 0) {
            switch (i27) {
                case 1000:
                    mVar = cm.m.normal;
                    break;
                case 1001:
                    mVar = cm.m.plugin;
                    break;
                case 1002:
                    mVar = cm.m.wxstore;
                    break;
                case 1003:
                    mVar = cm.m.merchant;
                    break;
                case 1004:
                    mVar = cm.m.wagame;
                    break;
                case 1005:
                    mVar = cm.m.gift;
                    break;
            }
        } else {
            mVar = cm.m.undefined;
        }
        c7080x809107ed.f143883h = mVar;
        c7080x809107ed.f143884i = this.f159762f;
        c7080x809107ed.f143885j = i17;
        c7080x809107ed.f143886k = i18;
        c7080x809107ed.f143887l = this.f159764h ? 1L : 0L;
        c7080x809107ed.f143888m = this.f159763g;
        c7080x809107ed.f143889n = this.f159765i;
        c7080x809107ed.k();
    }
}
