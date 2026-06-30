package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class g1 implements pm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f294479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.h1 f294480b;

    public g1(com.p314xaae8f345.mm.vfs.h1 h1Var, java.util.Map map) {
        this.f294480b = h1Var;
        this.f294479a = map;
    }

    @Override // pm5.a
    public java.lang.Iterable a(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        java.util.HashMap hashMap = new java.util.HashMap(this.f294479a);
        com.p314xaae8f345.mm.vfs.h1 h1Var = this.f294480b;
        if (h1Var.f294502g == null) {
            hashMap.put(h1Var.f294501f, str);
        } else {
            int i17 = 0;
            int i18 = 0;
            while (true) {
                int indexOf = str.indexOf(h1Var.f294503h, i17);
                if (indexOf < 0 || h1Var.f294502g.size() - i18 <= 1) {
                    break;
                }
                hashMap.put((java.lang.String) h1Var.f294502g.get(i18), str.substring(i17, indexOf));
                i17 = indexOf + 1;
                i18++;
            }
            hashMap.put((java.lang.String) h1Var.f294502g.get(i18), str.substring(i17));
        }
        java.lang.Object obj2 = h1Var.f294499d;
        if (!(obj2 instanceof com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb)) {
            return ((com.p314xaae8f345.mm.vfs.h1) obj2).b(hashMap);
        }
        com.p314xaae8f345.mm.vfs.q2 q2Var = (com.p314xaae8f345.mm.vfs.q2) ((com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) obj2).b(hashMap);
        if (q2Var == com.p314xaae8f345.mm.vfs.C22759xc55eb7d2.f()) {
            return null;
        }
        return java.util.Collections.singleton(q2Var);
    }
}
