package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.m3 f263419a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.m3();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f263420b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final int f263421c = 3;

    public final void a(boolean z17, java.lang.Class stubService, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.y0 binder) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.l3 l3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stubService, "stubService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binder, "binder");
        if (z17 && (!b(stubService).isEmpty())) {
            l3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.l3) b(stubService).pop();
            jz5.g gVar = cx4.s.f306187a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1200L, 102L, 1L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUIConnectionPool", "reuse service");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.l3 l3Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.l3(z17, stubService);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) stubService);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            boolean z18 = l85.j1.f398720a;
            l85.s0.f398741d.a(intent, l3Var2);
            context.bindService(intent, l3Var2, 1);
            if (z17) {
                jz5.g gVar2 = cx4.s.f306187a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1200L, 101L, 1L);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUIConnectionPool", "bind new service");
            l3Var = l3Var2;
        }
        l3Var.getClass();
        l3Var.f263412f = binder;
        if (l3Var.f263413g != null) {
            binder.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.k3(l3Var));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUIConnectionPool", "attach service");
    }

    public final java.util.LinkedList b(java.lang.Class cls) {
        java.lang.String canonicalName = cls.getCanonicalName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(canonicalName);
        java.util.Map map = f263420b;
        java.util.LinkedList linkedList = (java.util.LinkedList) ((java.util.HashMap) map).get(canonicalName);
        if (linkedList != null) {
            return linkedList;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        ((java.util.HashMap) map).put(canonicalName, linkedList2);
        return linkedList2;
    }
}
