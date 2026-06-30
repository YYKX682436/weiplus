package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f135352a = new java.util.LinkedList();

    public u(java.lang.String str, com.p314xaae8f345.mm.app.k kVar) {
        a(str, kVar);
    }

    public boolean a(java.lang.String str, com.p314xaae8f345.mm.app.k kVar) {
        java.lang.String str2 = str + "#" + kVar;
        java.util.LinkedList linkedList = this.f135352a;
        if (linkedList.contains(str2)) {
            return false;
        }
        com.p314xaae8f345.mm.app.k kVar2 = com.p314xaae8f345.mm.app.k.RESUMED;
        if (kVar == kVar2) {
            linkedList.add(str2);
            return true;
        }
        if (kVar != com.p314xaae8f345.mm.app.k.PAUSED) {
            return true;
        }
        linkedList.remove(str + "#" + kVar2);
        return true;
    }
}
