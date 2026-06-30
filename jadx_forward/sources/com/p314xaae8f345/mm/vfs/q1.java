package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class q1 implements com.p314xaae8f345.mm.vfs.v5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.q1 f294667a = new com.p314xaae8f345.mm.vfs.q1();

    @Override // com.p314xaae8f345.mm.vfs.v5
    public void a(java.lang.String id6, com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb fs6, int i17, java.util.Map p17) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fs6, "fs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p");
        java.lang.Object obj = p17.get("deleteFiles");
        java.lang.Object obj2 = p17.get("deleteSize");
        com.p314xaae8f345.mm.vfs.e7 e7Var = com.p314xaae8f345.mm.vfs.e7.f294444a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.vfs.e7.f294449f;
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("VFS.Expire", "[" + id6 + "] deleted count: " + obj + ", size: " + obj2);
        if (!concurrentHashMap.containsKey(id6) || (arrayList = (java.util.ArrayList) concurrentHashMap.get(id6)) == null) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.vfs.n1 n1Var = (com.p314xaae8f345.mm.vfs.n1) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) obj).intValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
            n1Var.a(id6, intValue, ((java.lang.Long) obj2).longValue());
        }
    }
}
