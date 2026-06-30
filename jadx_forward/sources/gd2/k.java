package gd2;

/* loaded from: classes3.dex */
public final class k implements g04.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.n f352075d;

    public k(gd2.n nVar) {
        this.f352075d = nVar;
    }

    @Override // g04.h
    public void k5(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        g04.l lVar = (g04.l) obj2;
        if (str == null || lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommentImageMenuData", "onEnd, input:" + str + " result:" + lVar);
            return;
        }
        java.util.List list = lVar.f349002a;
        int b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.k1.b(list);
        boolean f17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.k1.f(b17);
        boolean Di = ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).Di(lVar.f349003b, list);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(f17);
        gd2.n nVar = this.f352075d;
        nVar.f352080c.put(str, valueOf);
        nVar.f352081d.put(str, java.lang.Boolean.valueOf(Di));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentImageMenuData", "local translate, img " + str + ", result " + list + ", ratio " + b17 + ", showTransEntrance " + f17 + ", showOCREntrance " + Di);
    }
}
