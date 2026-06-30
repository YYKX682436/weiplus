package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
public final class o9 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public o9() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6> linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11574x9db166be event = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11574x9db166be) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.util.LinkedHashMap linkedHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.f165742b;
        synchronized (linkedHashMap) {
            linkedList = new java.util.LinkedList(linkedHashMap.values());
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var : linkedList) {
            if (!(o6Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.t)) {
                o6Var.u3();
            }
        }
        return false;
    }
}
