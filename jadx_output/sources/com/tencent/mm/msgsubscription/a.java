package com.tencent.mm.msgsubscription;

/* loaded from: classes9.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData a(int i17, java.util.List itemsShowOnDialog, boolean z17) {
        kotlin.jvm.internal.o.g(itemsShowOnDialog, "itemsShowOnDialog");
        com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData subscribeMsgRequestDialogUiData = new com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData();
        subscribeMsgRequestDialogUiData.f71775e = z17 ? 1 : 0;
        int i18 = 1;
        if (i17 != 1) {
            i18 = 3;
            if (i17 != 3) {
                i18 = 2;
            }
        }
        subscribeMsgRequestDialogUiData.f71774d = i18;
        java.util.Iterator it = itemsShowOnDialog.iterator();
        while (it.hasNext()) {
            m31.q0 q0Var = (m31.q0) it.next();
            java.util.ArrayList arrayList = subscribeMsgRequestDialogUiData.f71776f;
            com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData.ItemUiData itemUiData = new com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData.ItemUiData();
            java.lang.String str = q0Var.f323203d;
            kotlin.jvm.internal.o.g(str, "<set-?>");
            itemUiData.f71777d = str;
            itemUiData.f71778e = q0Var.f323200a ? 1 : 0;
            if (q0Var instanceof m31.a1) {
                itemUiData.f71779f = ((m31.a1) q0Var).f323119f;
            } else if (q0Var instanceof m31.z0) {
                itemUiData.f71780g = ((m31.z0) q0Var).f323242e;
            }
            arrayList.add(itemUiData);
        }
        return subscribeMsgRequestDialogUiData;
    }
}
