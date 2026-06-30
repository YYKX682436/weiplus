package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f;

/* loaded from: classes7.dex */
public abstract class a implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f165496a = new java.util.LinkedHashSet();

    public final void b(java.lang.String str) {
        java.util.LinkedList linkedList;
        synchronized (this.f165496a) {
            linkedList = new java.util.LinkedList(this.f165496a);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.c) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c1) it.next());
            cVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioInstanceContext", "onRevoked url:%s", str);
            n01.e eVar = cVar.f160701a;
            if (eVar != null) {
                dl3.j jVar = (dl3.j) eVar;
                synchronized (jVar.f316867a.U) {
                    ((java.util.HashSet) jVar.f316867a.f316855o).remove(str);
                }
            }
        }
    }
}
