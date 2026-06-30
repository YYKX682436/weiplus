package bb1;

/* loaded from: classes7.dex */
public class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f4179x366c91de = 1091;

    /* renamed from: NAME */
    public static final java.lang.String f4180x24728b = "createInferenceSession";

    /* JADX WARN: Removed duplicated region for block: B:100:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0190  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r31, org.json.JSONObject r32, int r33) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bb1.b.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }

    public final void C(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6[] G;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (!r6Var.y() || (G = r6Var.G()) == null) {
            return;
        }
        for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : G) {
            if (r6Var2.y()) {
                java.lang.String o17 = r6Var2.o();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                C(o17);
            } else {
                r6Var2.N(java.lang.System.currentTimeMillis());
            }
        }
    }

    public com.p314xaae8f345.mm.vfs.r6 D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1 = env.mo50354x59eafec1();
        if (mo50354x59eafec1 != null) {
            return mo50354x59eafec1.mo49620x1d537609(jSONObject != null ? jSONObject.optString("model") : null);
        }
        return null;
    }
}
