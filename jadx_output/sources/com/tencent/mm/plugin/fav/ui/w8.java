package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public final class w8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.y8 f101516d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(com.tencent.mm.plugin.fav.ui.y8 y8Var) {
        super(0);
        this.f101516d = y8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.fav.ui.y8 y8Var = this.f101516d;
        y8Var.f101626e.clear();
        boolean G = o72.x1.G();
        java.util.List list = y8Var.f101626e;
        if (G) {
            java.util.Iterator it = ((java.util.ArrayList) t72.b.f416040a.c()).iterator();
            while (it.hasNext()) {
                t72.a aVar = (t72.a) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.field_name)) {
                    list.add(aVar);
                }
            }
        } else {
            java.util.List<r45.oq0> a17 = new com.tencent.mm.plugin.fav.ui.v6().a();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (r45.oq0 oq0Var : a17) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(oq0Var.f382438d)) {
                    t72.a aVar2 = new t72.a();
                    aVar2.field_id = -1;
                    aVar2.field_name = oq0Var.f382438d;
                    arrayList.add(aVar2);
                }
            }
            list.addAll(arrayList);
        }
        return jz5.f0.f302826a;
    }
}
