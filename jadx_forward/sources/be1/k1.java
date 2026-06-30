package be1;

/* loaded from: classes7.dex */
public final class k1 implements be1.v1 {
    @Override // be1.o
    public java.util.Map a(java.lang.String type, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y component = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        android.content.Context mo50352x76847179 = component.mo50352x76847179();
        java.util.HashMap hashMap = new java.util.HashMap();
        be1.i1 i1Var = be1.j1.f101011b;
        java.util.Iterator it = ((java.util.Map) ((jz5.n) be1.j1.f101012c).mo141623x754a37bb()).entrySet().iterator();
        while (it.hasNext()) {
            ((yz5.p) ((java.util.Map.Entry) it.next()).getValue()).mo149xb9724478(mo50352x76847179, hashMap);
        }
        return hashMap;
    }
}
