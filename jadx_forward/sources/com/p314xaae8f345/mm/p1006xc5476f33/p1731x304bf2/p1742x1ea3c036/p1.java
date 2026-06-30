package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

/* loaded from: classes8.dex */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f221398a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f221399b;

    static {
        new java.util.HashMap();
        f221399b = new java.util.LinkedList();
    }

    public static void a(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.m1 m1Var) {
        if (h()) {
            if (m1Var != null) {
                m1Var.a(c(str) != null, d(str));
            }
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("action_id", 3);
            bundle.putString("preload_url", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p.a(bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.o1.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.l1(m1Var));
        }
    }

    public static void b() {
        if (!h()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("action_id", 2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p.a(bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.o1.class, null);
            return;
        }
        java.util.HashMap hashMap = f221398a;
        for (sd.o0 o0Var : hashMap.values()) {
            o0Var.k();
            pf.b bVar = o0Var.f488166i;
            if (bVar != null) {
                bVar.mo32259x5cd39ffa();
            }
        }
        hashMap.clear();
    }

    public static sd.o0 c(java.lang.String str) {
        return (sd.o0) f221398a.get(str);
    }

    public static boolean d(java.lang.String str) {
        sd.o0 o0Var = (sd.o0) f221398a.get(str);
        if (o0Var != null && o0Var.h() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0 b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0) o0Var.h();
            if (b0Var.V && !b0Var.f221406p1) {
                return true;
            }
        }
        return false;
    }

    public static void e(java.lang.Class cls, java.lang.String str, k60.e eVar) {
        if (!h()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("action_id", 1);
            bundle.putString("preload_url", str);
            bundle.putSerializable("webcore_impl_class", cls);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p.a(bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.o1.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.j1(eVar));
            return;
        }
        if (f221398a.containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadGameWebCoreHelp", "preload page[%s] exists, return", str);
            eVar.a();
            return;
        }
        java.util.LinkedList linkedList = f221399b;
        if (linkedList.contains(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadGameWebCoreHelp", "preload ing, return");
            eVar.a();
        } else {
            linkedList.add(str);
            com.p314xaae8f345.mm.p794xb0fa9b5e.w0.c(true, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.k1(cls, str, eVar));
        }
    }

    public static void f(java.lang.String str) {
        if (!h()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("action_id", 2);
            bundle.putString("preload_url", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p.a(bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.o1.class, null);
            return;
        }
        sd.o0 o0Var = (sd.o0) f221398a.remove(str);
        if (o0Var != null) {
            o0Var.k();
            pf.b bVar = o0Var.f488166i;
            if (bVar != null) {
                bVar.mo32259x5cd39ffa();
            }
        }
    }

    public static sd.o0 g(android.content.Context context, java.lang.String str) {
        sd.o0 o0Var = (sd.o0) f221398a.remove(str);
        if (o0Var != null) {
            o0Var.l(context);
            o0Var.k();
        }
        return o0Var;
    }

    public static boolean h() {
        return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s();
    }
}
