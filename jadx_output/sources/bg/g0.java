package bg;

/* loaded from: classes7.dex */
public class g0 extends tf.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bg.f f19796i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(bg.f fVar, eg.a aVar, com.tencent.mm.plugin.appbrand.jsapi.x0 x0Var) {
        super(aVar, x0Var);
        this.f19796i = fVar;
    }

    @Override // tf.c
    public void a(java.lang.String str, sf.f fVar) {
        c(fVar);
        org.json.JSONObject c17 = fVar.c();
        if (str.contains("insert") || str.contains("update")) {
            if (c17.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY)) {
                this.f418790d = c17.optBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY);
            }
            java.lang.Boolean valueOf = c17.has("autoRotation") ? java.lang.Boolean.valueOf(c17.optBoolean("autoRotation", false)) : null;
            if (valueOf != null) {
                this.f418791e = valueOf.booleanValue();
            }
        } else if (str.contains("operate")) {
            java.lang.String optString = c17.optString("type");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString) && optString.equalsIgnoreCase(com.tencent.tav.core.AssetExtension.SCENE_PLAY)) {
                this.f418790d = true;
            }
        } else if (str.contains("remove")) {
            this.f418790d = false;
        }
        this.f19796i.A();
    }

    @Override // tf.c
    public boolean b() {
        return !this.f19796i.S;
    }
}
