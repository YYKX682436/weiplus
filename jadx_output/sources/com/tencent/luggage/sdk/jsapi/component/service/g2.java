package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public final class g2 {
    public g2(kotlin.jvm.internal.i iVar) {
    }

    public final void a(com.tencent.luggage.sdk.jsapi.component.service.a2 info) {
        kotlin.jvm.internal.o.g(info, "info");
        java.util.ArrayList b17 = b(info);
        com.tencent.mars.xlog.Log.i("Luggage.WAUDRLogic", "checkAsync info:" + info + " check for depend libs, checkList: " + b17);
        if (b17.isEmpty()) {
            return;
        }
        com.tencent.wechat.aff.udr.p pVar = new com.tencent.wechat.aff.udr.p();
        com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
        qVar.c("ilinkres_14beccb0");
        java.util.LinkedList linkedList = qVar.f217548e;
        if (linkedList != null) {
            linkedList.addAll(b17);
        }
        java.util.LinkedList linkedList2 = pVar.f217545d;
        if (linkedList2 != null) {
            linkedList2.add(qVar);
        }
        ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ai(pVar, new com.tencent.luggage.sdk.jsapi.component.service.d2(info));
    }

    public final java.util.ArrayList b(com.tencent.luggage.sdk.jsapi.component.service.a2 a2Var) {
        java.lang.String str = a2Var.f47382a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.luggage.sdk.jsapi.component.service.g2 g2Var = com.tencent.luggage.sdk.jsapi.component.service.h2.f47439a;
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui("ilinkres_14beccb0", a2Var.f47382a);
        long j17 = Ui != null ? Ui.f217590e : 0L;
        if (j17 <= 0 || j17 < ((long) a2Var.f47383b)) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public final java.lang.String c(com.tencent.luggage.sdk.jsapi.component.service.a2 info) {
        kotlin.jvm.internal.o.g(info, "info");
        return ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) com.tencent.luggage.sdk.jsapi.component.service.h2.f47440b).getValue()).getString(info.f47382a + info.f47383b, "");
    }
}
