package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f53819a = new java.util.LinkedList();

    public u(java.lang.String str, com.tencent.mm.app.k kVar) {
        a(str, kVar);
    }

    public boolean a(java.lang.String str, com.tencent.mm.app.k kVar) {
        java.lang.String str2 = str + "#" + kVar;
        java.util.LinkedList linkedList = this.f53819a;
        if (linkedList.contains(str2)) {
            return false;
        }
        com.tencent.mm.app.k kVar2 = com.tencent.mm.app.k.RESUMED;
        if (kVar == kVar2) {
            linkedList.add(str2);
            return true;
        }
        if (kVar != com.tencent.mm.app.k.PAUSED) {
            return true;
        }
        linkedList.remove(str + "#" + kVar2);
        return true;
    }
}
