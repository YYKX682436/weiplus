package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public final class r4 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f221276e = "sendPcRemindMsg";

    @Override // sd.c
    public java.lang.String b() {
        return this.f221276e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        if (context != null) {
            if (e17 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q5Var);
                q5Var.a(this.f221276e + ":fail", null);
                return;
            }
            ((ly4.f) ((wc0.e) i95.n0.c(wc0.e.class))).getClass();
            ly4.e eVar = new ly4.e();
            eVar.f403823m = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.p4(q5Var, this);
            eVar.f403824n = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.q4(q5Var, this);
            xc0.a aVar = new xc0.a();
            aVar.mo75930xb5cb93b2(str);
            eVar.k(context, aVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
