package qp;

/* loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final qp.c f447212d = new qp.c();

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        sb6.append(lp0.b.h0("LivePhoto").o());
        sb6.append('/');
        java.lang.String sb7 = sb6.toString();
        java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(sb7, false);
        if (s17 != null) {
            java.util.List<com.p314xaae8f345.mm.vfs.x1> S0 = kz5.n0.S0(s17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMLivePhotoFileManager", "clearVideoTempDir >> dir: " + sb7 + " size: " + S0.size());
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : S0) {
                java.lang.String str = sb7 + x1Var.f294765b;
                java.lang.String name = x1Var.f294765b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                if (r26.n0.B(name, "sns_mj_template_", false)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMLivePhotoFileManager", "is sns template no to delete by clear");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMLivePhotoFileManager", "clearVideoTempDir delete file path:" + str + " result: " + com.p314xaae8f345.mm.vfs.w6.h(str));
                }
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("count", S0.size());
            f65.q qVar = f65.q.f341492a;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            qVar.a("clear_file", 0, currentTimeMillis2, jSONObject2);
        }
    }
}
