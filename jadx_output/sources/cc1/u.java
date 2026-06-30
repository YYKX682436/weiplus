package cc1;

/* loaded from: classes7.dex */
public final class u extends cc1.p {
    public static final int CTRL_INDEX = 1315;
    public static final java.lang.String NAME = "cryptoGetGeneratedKeys";

    @Override // cc1.p
    public java.lang.Object C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, kotlin.coroutines.Continuation continuation) {
        java.util.HashMap i17 = kz5.c1.i(new jz5.l("keyAliases", cc1.p.f40444g.d(lVar)));
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        i17.put("errno", 0);
        java.lang.String t17 = t("ok", i17);
        kotlin.jvm.internal.o.f(t17, "makeReturnJson(...)");
        return t17;
    }
}
