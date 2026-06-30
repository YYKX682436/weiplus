package bt;

/* loaded from: classes5.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final bt.k1 f24092a = new bt.k1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f24093b = kz5.c1.k(new jz5.l("StnCallBack", new jz5.l(1000, 500)), new jz5.l("AlarmStart", new jz5.l(1000, 500)), new jz5.l("AlarmOn", new jz5.l(500, 100)), new jz5.l("ShortLinkEmptyCMD", new jz5.l(500, 50)), new jz5.l("ShortLinkRunCMD", new jz5.l(java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL), 5000)), new jz5.l("LongLinkEmptyCMD", new jz5.l(500, 50)), new jz5.l("LongLinkRunCMD", new jz5.l(30000, 5000)), new jz5.l("LongLinkOnAlarm", new jz5.l(3000, 1000)), new jz5.l("LongLinkBeforeConnection", new jz5.l(java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL), 5000)), new jz5.l("LongLinkAfterConnection", new jz5.l(1000, 1000)), new jz5.l("LongLinkAfterReadWrite", new jz5.l(1000, 50)), new jz5.l("LongLinkNoopResp", new jz5.l(500, 50)), new jz5.l("LongLinkNoopReq", new jz5.l(8000, 1000)));

    public final int a(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        boolean j17 = mm.k.j(mm.k.f328516x0, null, 1, null);
        java.util.Map map = f24093b;
        if (!j17) {
            java.lang.Object obj = map.get(key);
            kotlin.jvm.internal.o.d(obj);
            return ((java.lang.Number) ((jz5.l) obj).f302833d).intValue();
        }
        j62.e g17 = j62.e.g();
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = key.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1(g17.a("clicfg_batt_mars_cfg_".concat(lowerCase), "-1", true, true), -1);
        if (D1 >= 0) {
            return D1;
        }
        java.lang.Object obj2 = map.get(key);
        kotlin.jvm.internal.o.d(obj2);
        return ((java.lang.Number) ((jz5.l) obj2).f302834e).intValue();
    }
}
