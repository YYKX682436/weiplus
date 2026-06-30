package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class w3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.r f102648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102649b;

    public w3(yz5.r rVar, java.lang.String str) {
        this.f102648a = rVar;
        this.f102649b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.i23 i23Var;
        r45.i23 i23Var2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        yz5.r rVar = this.f102648a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.l23 l23Var = (r45.l23) fVar.f70618d;
            if ((l23Var != null ? (r45.i23) l23Var.getCustom(1) : null) != null) {
                if (zl2.q4.f473933a.E()) {
                    r45.l23 l23Var2 = (r45.l23) fVar.f70618d;
                    java.lang.String string = (l23Var2 == null || (i23Var2 = (r45.i23) l23Var2.getCustom(1)) == null) ? null : i23Var2.getString(3);
                    if (string == null || string.length() == 0) {
                        db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "img is empty", 0).show();
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("imgUrl: ");
                r45.l23 l23Var3 = (r45.l23) fVar.f70618d;
                sb6.append((l23Var3 == null || (i23Var = (r45.i23) l23Var3.getCustom(1)) == null) ? null : i23Var.getString(3));
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveMpLinkVerifier", sb6.toString());
                r45.l23 l23Var4 = (r45.l23) fVar.f70618d;
                rVar.C(0, "", this.f102649b, l23Var4 != null ? (r45.i23) l23Var4.getCustom(1) : null);
            } else {
                rVar.C(java.lang.Integer.valueOf(org.chromium.net.NetError.ERR_CACHE_MISS), "", "", null);
            }
        } else {
            rVar.C(java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c, "", null);
        }
        return jz5.f0.f302826a;
    }
}
