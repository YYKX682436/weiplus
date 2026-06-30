package rk1;

@j95.b
/* loaded from: classes7.dex */
public final class m extends i95.w implements ft.e4 {

    /* renamed from: e, reason: collision with root package name */
    public static final rk1.c f477963e = new rk1.c(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f477964f = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d2.a(), true);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f477965g = jz5.h.b(rk1.b.f477932d);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f477966h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f477967i = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f477968m = jz5.h.b(rk1.a.f477931d);

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f477969n = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u1.a();

    /* renamed from: d, reason: collision with root package name */
    public final yz5.r f477970d = new rk1.l(this);

    public final void wi(rk1.e eVar) {
        java.lang.String str = f477964f;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Appbrand.WasmCacheService", "cache path is nil, abort");
            return;
        }
        java.util.List list = eVar.f477943g;
        java.nio.ByteBuffer allocateDirect = list != null ? java.nio.ByteBuffer.allocateDirect(list.size() * 4) : null;
        if (allocateDirect != null) {
            allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        }
        java.util.List list2 = eVar.f477943g;
        if (list2 != null) {
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                if (allocateDirect != null) {
                    allocateDirect.putInt(intValue);
                }
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7115x3f2395b7 c7115x3f2395b7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7115x3f2395b7();
        c7115x3f2395b7.f144352d = c7115x3f2395b7.b("AppId", eVar.f477937a, true);
        c7115x3f2395b7.f144353e = eVar.f477938b;
        c7115x3f2395b7.f144354f = eVar.f477940d.capacity();
        c7115x3f2395b7.f144357i = list2 != null ? list2.size() : 0L;
        rk1.f[] fVarArr = rk1.f.f477944d;
        c7115x3f2395b7.f144358j = 1;
        com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0 c5138xafbea1a0 = new com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0();
        c5138xafbea1a0.f135476a = f477969n;
        c5138xafbea1a0.f135479d = null;
        c5138xafbea1a0.f135481f = "0";
        c5138xafbea1a0.f135482g = true;
        c5138xafbea1a0.f135484i = true;
        c5138xafbea1a0.f135485j = false;
        c5138xafbea1a0.f135486k = "RuntimeTWasmCacheService";
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.g(c5138xafbea1a0);
        gVar.s0(new rk1.h(gVar, eVar, str, allocateDirect, c7115x3f2395b7));
    }
}
