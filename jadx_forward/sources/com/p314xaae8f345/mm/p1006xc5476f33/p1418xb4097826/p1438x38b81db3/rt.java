package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class rt implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.st f186036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny f186037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nr2.m f186038c;

    public rt(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.st stVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar, nr2.m mVar) {
        this.f186036a = stVar;
        this.f186037b = nyVar;
        this.f186038c = mVar;
    }

    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        java.lang.String str2;
        java.lang.String str3;
        java.util.HashSet hashSet = this.f186036a.f186107f;
        if (hashSet != null) {
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "view_exp");
            nr2.m mVar = this.f186038c;
            if (!b17) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "view_unexp")) {
                    hashSet.remove(java.lang.Long.valueOf(mVar.l()));
                    return;
                }
                return;
            }
            if (hashSet.isEmpty()) {
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                jz5.l[] lVarArr = new jz5.l[4];
                java.lang.String str4 = "";
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = this.f186037b;
                if (nyVar == null || (str2 = nyVar.f216919r) == null) {
                    str2 = "";
                }
                lVarArr[0] = new jz5.l("finder_tab_context_id", str2);
                if (nyVar != null && (str3 = nyVar.f216915p) != null) {
                    str4 = str3;
                }
                lVarArr[1] = new jz5.l("finder_context_id", str4);
                lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(nyVar != null ? nyVar.f216913n : 0));
                lVarArr[3] = new jz5.l("author_finder_username", mVar.o());
                ((cy1.a) rVar).Hj("home_paid_collection", "view_exp", kz5.c1.k(lVarArr), 25496);
            }
            hashSet.add(java.lang.Long.valueOf(mVar.l()));
        }
    }
}
