package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43;

/* loaded from: classes7.dex */
public class d0 implements o91.e {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f167050d;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f167050d = linkedList;
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.l0(c11510xdd90c2f2));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.a0());
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.b0(c11510xdd90c2f2));
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.z(c11510xdd90c2f2));
    }

    @Override // o91.e
    public java.lang.String T0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str) {
        if (lVar != null && str != null && str.length() != 0) {
            for (o91.e eVar : this.f167050d) {
                if (eVar.U0(lVar, str)) {
                    return eVar.T0(lVar, str);
                }
            }
        }
        return str;
    }

    @Override // o91.e
    public boolean U0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str) {
        if (lVar != null && str != null && str.length() != 0) {
            java.util.Iterator it = this.f167050d.iterator();
            while (it.hasNext()) {
                if (((o91.e) it.next()).U0(lVar, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
