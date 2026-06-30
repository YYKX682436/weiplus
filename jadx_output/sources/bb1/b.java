package bb1;

/* loaded from: classes7.dex */
public class b extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1091;
    public static final java.lang.String NAME = "createInferenceSession";

    /* JADX WARN: Removed duplicated region for block: B:100:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0190  */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l r31, org.json.JSONObject r32, int r33) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bb1.b.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }

    public final void C(java.lang.String str) {
        com.tencent.mm.vfs.r6[] G;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!r6Var.y() || (G = r6Var.G()) == null) {
            return;
        }
        for (com.tencent.mm.vfs.r6 r6Var2 : G) {
            if (r6Var2.y()) {
                java.lang.String o17 = r6Var2.o();
                kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                C(o17);
            } else {
                r6Var2.N(java.lang.System.currentTimeMillis());
            }
        }
    }

    public com.tencent.mm.vfs.r6 D(com.tencent.mm.plugin.appbrand.jsapi.l env, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(env, "env");
        com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = env.getFileSystem();
        if (fileSystem != null) {
            return fileSystem.getAbsoluteFile(jSONObject != null ? jSONObject.optString("model") : null);
        }
        return null;
    }
}
