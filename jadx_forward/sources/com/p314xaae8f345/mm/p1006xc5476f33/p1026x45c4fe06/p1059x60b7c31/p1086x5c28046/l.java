package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046;

/* loaded from: classes13.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.m f162383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f162384e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f162385f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12088xa3d6f36a f162386g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.m mVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12088xa3d6f36a c12088xa3d6f36a) {
        super(1);
        this.f162383d = mVar;
        this.f162384e = e9Var;
        this.f162385f = i17;
        this.f162386g = c12088xa3d6f36a;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.v75 v75Var = (r45.v75) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12088xa3d6f36a c12088xa3d6f36a = this.f162386g;
        int i17 = this.f162385f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f162384e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.m mVar = this.f162383d;
        if (v75Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenDesignerProfile", "openDesignerProfile getDesignerInfo success in local");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.m.C(mVar, e9Var, i17, c12088xa3d6f36a, v75Var);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenDesignerProfile", "openDesignerProfile getDesignerInfo failed in local");
            mVar.getClass();
            android.content.Context f229340d = e9Var.getF229340d();
            if (f229340d == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenDesignerProfile", "fetchDesignerInfoInMainProcess failed, env.context is null");
                java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("errno", 4);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                e9Var.a(i17, mVar.u(str, jSONObject));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12085xf29f6486 c12085xf29f6486 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12085xf29f6486(c12088xa3d6f36a);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.k(e9Var, i17, mVar, c12088xa3d6f36a);
                java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(f229340d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c12085xf29f6486, kVar, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
