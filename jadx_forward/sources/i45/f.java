package i45;

/* loaded from: classes9.dex */
public final class f implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f369939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb f369940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f369941c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m f369942d;

    public f(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb c11287xc333feeb, java.util.LinkedList linkedList, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar) {
        this.f369939a = c11286x34a5504;
        this.f369940b = c11287xc333feeb;
        this.f369941c = linkedList;
        this.f369942d = mVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        k91.v5 v5Var = (k91.v5) obj;
        if (v5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxImeHelper", "get wxaAttributes for appbrand info failed");
            return null;
        }
        i45.j jVar = i45.j.f369948a;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = this.f369939a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1_");
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = this.f369942d;
        sb6.append(mVar.f67370x28d45f97);
        sb6.append("_");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(kk.v.a(c01.d9.b().C())));
        sb6.append("_");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        sb6.append("_0");
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        java.util.Iterator it = this.f369941c.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            ot0.q qVar = new ot0.q();
            java.lang.String field_appId = mVar.f67370x28d45f97;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_appId, "field_appId");
            qVar.f430179d = field_appId;
            qVar.f430210k2 = v5Var.f68904x28d45f97;
            qVar.f430270z2 = this.f369940b.f33175xc6c9cf27;
            qVar.H = mVar.f67372x453d1e07;
            qVar.f430239s = 2;
            qVar.f430222n2 = sb7;
            qVar.f430214l2 = 2;
            qVar.f430255w = v5Var.f68924xdec927b;
            qVar.f430259x = v5Var.f68913x21f9b213;
            int i17 = 0;
            qVar.f430250u2 = 0;
            ot0.a aVar = new ot0.a();
            aVar.f429893p = v5Var.u0() != null ? v5Var.u0().f387175q : 0;
            aVar.f429895r = v5Var.u0() != null ? v5Var.u0().f387176r : 0;
            if (v5Var.u0() != null) {
                i17 = v5Var.u0().f387177s;
            }
            aVar.f429896s = i17;
            qVar.f(aVar);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a aVar2 = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a();
            aVar2.f270323a = 1;
            aVar2.f270324b = "net.sourceforge.simcpux";
            aVar2.f270325c = "";
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.G(qVar, c11286x34a5504, str, null, 0, aVar2);
        }
        return null;
    }
}
