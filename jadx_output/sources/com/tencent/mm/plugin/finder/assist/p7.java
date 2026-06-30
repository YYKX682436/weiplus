package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class p7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zy2.nb f102457a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f102458b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zy2.nb f102459c;

    public p7(zy2.nb nbVar, int i17, zy2.nb nbVar2) {
        this.f102457a = nbVar;
        this.f102458b = i17;
        this.f102459c = nbVar2;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.LinkedList list;
        java.lang.Object obj2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = this.f102458b;
        if (i17 == 0 && fVar.f70616b == 0) {
            java.util.HashMap hashMap = com.tencent.mm.plugin.finder.assist.q7.f102487a;
            r45.ia1 ia1Var = (r45.ia1) fVar.f70618d;
            com.tencent.mm.plugin.finder.assist.q7.f102488b = ia1Var != null ? ia1Var.getInteger(2) : 300;
            r45.ia1 ia1Var2 = (r45.ia1) fVar.f70618d;
            if (ia1Var2 != null && (list = ia1Var2.getList(1)) != null) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((r45.ey2) obj2).getInteger(2) == i18) {
                        break;
                    }
                }
                r45.ey2 ey2Var = (r45.ey2) obj2;
                if (ey2Var != null) {
                    java.util.HashMap hashMap2 = com.tencent.mm.plugin.finder.assist.q7.f102487a;
                    int integer = ey2Var.getInteger(0);
                    com.tencent.mars.xlog.Log.i("Finder.FinderSvrExptManager", "setHitCache, exptId:" + i18 + ", value:" + integer);
                    if (i18 == 1) {
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SHOW_FINDER_RECENT_LIKE_INT_SYNC, java.lang.Integer.valueOf(integer));
                    }
                    zy2.nb nbVar = this.f102459c;
                    if (nbVar != null) {
                        nbVar.a(java.lang.Integer.valueOf(ey2Var.getInteger(0)));
                    }
                }
            }
        } else {
            zy2.nb nbVar2 = this.f102457a;
            if (nbVar2 != null) {
                nbVar2.a(java.lang.Integer.valueOf(fVar.f70616b));
            }
        }
        int i19 = fVar.f70615a;
        if ((i19 == 0 && fVar.f70616b == 0) || i19 == 4) {
            com.tencent.mm.plugin.finder.assist.q7.f102487a.put(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(c01.id.e()));
        }
        return jz5.f0.f302826a;
    }
}
