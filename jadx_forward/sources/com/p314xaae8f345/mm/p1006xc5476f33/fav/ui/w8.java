package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes11.dex */
public final class w8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 f183049d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var) {
        super(0);
        this.f183049d = y8Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var = this.f183049d;
        y8Var.f183159e.clear();
        boolean G = o72.x1.G();
        java.util.List list = y8Var.f183159e;
        if (G) {
            java.util.Iterator it = ((java.util.ArrayList) t72.b.f497573a.c()).iterator();
            while (it.hasNext()) {
                t72.a aVar = (t72.a) it.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f68044x225f1eb0)) {
                    list.add(aVar);
                }
            }
        } else {
            java.util.List<r45.oq0> a17 = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.v6().a();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (r45.oq0 oq0Var : a17) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oq0Var.f463971d)) {
                    t72.a aVar2 = new t72.a();
                    aVar2.f68043xc8a07680 = -1;
                    aVar2.f68044x225f1eb0 = oq0Var.f463971d;
                    arrayList.add(aVar2);
                }
            }
            list.addAll(arrayList);
        }
        return jz5.f0.f384359a;
    }
}
