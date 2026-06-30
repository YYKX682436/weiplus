package iy4;

@j95.b
/* loaded from: classes11.dex */
public final class z extends i95.w {
    public static final boolean wi() {
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j62.e.g().j("clicfg_ext_devlice_mul_platform_android", "0", true, true), "1");
        ot5.g.c("MicroMsg.ExtDeviceService", "enableMultiPlatformImpl: " + b17);
        return b17;
    }

    public final void Ai(java.lang.String uuid) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uuid, "uuid");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList K = ug3.i.K();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(K, "getOnlineInfoList(...)");
        java.util.Iterator it = kz5.n0.S0(K).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ug3.k) obj).f474006p, uuid)) {
                    break;
                }
            }
        }
        ug3.k kVar = (ug3.k) obj;
        if (kVar != null) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new iy4.y(kVar, context, uuid, null), 3, null);
        } else {
            ot5.g.a("MicroMsg.ExtDeviceService", "not find device for uuid: ".concat(uuid));
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.g.f298230a = iy4.v.f377547a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.d.f298229a = iy4.w.f377550a;
    }
}
