package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class rt implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.st f104503a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ny f104504b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nr2.m f104505c;

    public rt(com.tencent.mm.plugin.finder.convert.st stVar, com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar, nr2.m mVar) {
        this.f104503a = stVar;
        this.f104504b = nyVar;
        this.f104505c = mVar;
    }

    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        java.lang.String str2;
        java.lang.String str3;
        java.util.HashSet hashSet = this.f104503a.f104574f;
        if (hashSet != null) {
            boolean b17 = kotlin.jvm.internal.o.b(str, "view_exp");
            nr2.m mVar = this.f104505c;
            if (!b17) {
                if (kotlin.jvm.internal.o.b(str, "view_unexp")) {
                    hashSet.remove(java.lang.Long.valueOf(mVar.l()));
                    return;
                }
                return;
            }
            if (hashSet.isEmpty()) {
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                jz5.l[] lVarArr = new jz5.l[4];
                java.lang.String str4 = "";
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = this.f104504b;
                if (nyVar == null || (str2 = nyVar.f135386r) == null) {
                    str2 = "";
                }
                lVarArr[0] = new jz5.l("finder_tab_context_id", str2);
                if (nyVar != null && (str3 = nyVar.f135382p) != null) {
                    str4 = str3;
                }
                lVarArr[1] = new jz5.l("finder_context_id", str4);
                lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(nyVar != null ? nyVar.f135380n : 0));
                lVarArr[3] = new jz5.l("author_finder_username", mVar.o());
                ((cy1.a) rVar).Hj("home_paid_collection", "view_exp", kz5.c1.k(lVarArr), 25496);
            }
            hashSet.add(java.lang.Long.valueOf(mVar.l()));
        }
    }
}
