package bb1;

/* loaded from: classes7.dex */
public final class e extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1356;
    public static final java.lang.String NAME = "getNpuLibsPath";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar != null) {
            java.util.Map e17 = kz5.b1.e(new jz5.l(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, com.tencent.mm.wexnet.v.f214379a.c()));
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (!(e17 instanceof java.util.HashMap)) {
                e17 = new java.util.HashMap(e17);
            }
            e17.put("errno", 0);
            lVar.a(i17, t("ok", e17));
        }
    }
}
