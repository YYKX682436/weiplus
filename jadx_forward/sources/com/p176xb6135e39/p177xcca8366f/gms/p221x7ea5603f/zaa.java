package com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f;

/* loaded from: classes15.dex */
final class zaa implements com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2032x89dbbe78 {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.AbstractC2026x350819b9 zaa;

    public zaa(com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.AbstractC2026x350819b9 abstractC2026x350819b9) {
        this.zaa = abstractC2026x350819b9;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2032x89dbbe78
    /* renamed from: onDelegateCreated */
    public final void mo18685xccb239c4(com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2030x97ee5eef interfaceC2030x97ee5eef) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2030x97ee5eef interfaceC2030x97ee5eef2;
        this.zaa.zaa = interfaceC2030x97ee5eef;
        linkedList = this.zaa.zac;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.zah zahVar = (com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.zah) it.next();
            interfaceC2030x97ee5eef2 = this.zaa.zaa;
            zahVar.zab(interfaceC2030x97ee5eef2);
        }
        linkedList2 = this.zaa.zac;
        linkedList2.clear();
        this.zaa.zab = null;
    }
}
