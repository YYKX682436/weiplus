package y42;

/* loaded from: classes7.dex */
public class a extends x42.a {
    @Override // x42.b
    public java.lang.String a() {
        return "debug_alert";
    }

    @Override // x42.b
    public java.lang.Object b(com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 e17;
        if (c1469x28b0ccd7 != null && c1469x28b0ccd7.mo16304xbe0e3ae6() >= 1) {
            java.lang.String mo16298x2fec8307 = c1469x28b0ccd7.mo16298x2fec8307(0);
            if (u46.l.e(mo16298x2fec8307)) {
                return null;
            }
            g42.i.a("EdgeComputingJsApiBase", "[EdgeComputingJsApiDebugAlert] logic, msg : " + mo16298x2fec8307);
            if (!u46.l.e(mo16298x2fec8307) && (e17 = g42.i.e()) != null) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.lang.String str = "mmkv_key_log_last_report_time" + t42.a.f497031b;
                if ((currentTimeMillis - e17.getLong(str, 0L) > 604800000 || g42.i.g()) && t42.a.a()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20176, t42.a.f497031b, 12, 0, 0, mo16298x2fec8307.replace(",", ";"));
                    e17.putLong(str, currentTimeMillis);
                }
            }
        }
        return null;
    }

    @Override // x42.b
    /* renamed from: getType */
    public int mo174983xfb85f7b0() {
        return 1;
    }

    @Override // x42.b
    /* renamed from: release */
    public void mo174984x41012807() {
    }
}
