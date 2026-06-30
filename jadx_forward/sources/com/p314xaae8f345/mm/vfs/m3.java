package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class m3 implements com.p314xaae8f345.mm.vfs.x5 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f294604b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashSet f294605c = new java.util.HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.f1 f294606a;

    public m3(java.lang.String idEnvStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(idEnvStr, "idEnvStr");
        this.f294606a = new com.p314xaae8f345.mm.vfs.f1(idEnvStr);
    }

    @Override // com.p314xaae8f345.mm.vfs.x5
    public com.p314xaae8f345.mm.vfs.w5 b(java.util.Map env) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        java.lang.String a17 = this.f294606a.a(env);
        if (a17 == null) {
            return null;
        }
        com.p314xaae8f345.mm.vfs.k3 k3Var = new com.p314xaae8f345.mm.vfs.k3(a17);
        java.util.HashMap hashMap = f294604b;
        synchronized (hashMap) {
            java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(a17);
            if (arrayList != null) {
                kz5.h0.B(arrayList, com.p314xaae8f345.mm.vfs.l3.f294598d);
                arrayList.add(new java.lang.ref.WeakReference(k3Var));
            } else {
                hashMap.put(a17, kz5.c0.d(new java.lang.ref.WeakReference(k3Var)));
            }
            if (f294605c.contains(a17)) {
                k3Var.f294561b = false;
            }
        }
        return k3Var;
    }
}
