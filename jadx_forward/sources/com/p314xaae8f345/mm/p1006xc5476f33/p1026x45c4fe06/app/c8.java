package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes11.dex */
public class c8 extends hf.a {
    @Override // hf.a
    public void a(hf.b bVar) {
        super.a(bVar);
        try {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6876x3f7b6544 c6876x3f7b6544 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6876x3f7b6544();
            c6876x3f7b6544.f141954d = c6876x3f7b6544.b("Runtime", bm5.f1.a(), true);
            c6876x3f7b6544.f141955e = c6876x3f7b6544.b("CurrentActivity", com.p314xaae8f345.mm.app.w.INSTANCE.h(), true);
            c6876x3f7b6544.f141956f = c6876x3f7b6544.b("CurrentThread", java.lang.Thread.currentThread().getName(), true);
            c6876x3f7b6544.f141957g = c6876x3f7b6544.b("ExtraCrashMsg", m91.f.f406484a.a().replaceAll(",", "_"), true);
            c6876x3f7b6544.f141958h = c6876x3f7b6544.b("DeviceParameters", bVar.f362518a.replaceAll(",", "_"), true);
            c6876x3f7b6544.f141959i = c6876x3f7b6544.b("CustomParameters", bVar.f362519b.replaceAll(",", "_"), true);
            c6876x3f7b6544.f141960j = c6876x3f7b6544.b("ApplicationParameters", bVar.f362520c.replaceAll(",", "_"), true);
            c6876x3f7b6544.f141961k = c6876x3f7b6544.b(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3172xb3aee2a0, bVar.f362521d, true);
            c6876x3f7b6544.f141962l = c6876x3f7b6544.b("Context", bVar.f362522e, true);
            c6876x3f7b6544.f141963m = c6876x3f7b6544.b("CrashContent", u46.l.t(bVar.f362523f.replaceAll(",", "_"), 0, 1024), true);
            c6876x3f7b6544.f141964n = bVar.f362524g;
            c6876x3f7b6544.f141965o = c6876x3f7b6544.b("Revision", a03.h.a(), true);
            c6876x3f7b6544.k();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSkylineBootGuard", "report fail: %s", e17);
        }
    }
}
