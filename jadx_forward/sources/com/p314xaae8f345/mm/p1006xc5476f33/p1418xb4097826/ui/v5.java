package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class v5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078 f211475d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078 activityC15029x292078) {
        super(1);
        this.f211475d = activityC15029x292078;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.f0 f0Var;
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078 activityC15029x292078 = this.f211475d;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = activityC15029x292078.f210105z;
        if (gVar != null) {
            return gVar;
        }
        if (linkedList != null) {
            java.util.ArrayList arrayList = activityC15029x292078.f210102w;
            if (arrayList.isEmpty()) {
                arrayList.addAll(linkedList);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.e eVar = activityC15029x292078.f210101v;
                eVar.c(arrayList);
                eVar.notifyDataSetChanged();
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        return f0Var;
    }
}
