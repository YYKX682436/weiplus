package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.extension.reddot.h1 f105544a = new com.tencent.mm.plugin.finder.extension.reddot.h1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f105545b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f105546c;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(2);
        hashSet.add(29);
        hashSet.add(1006);
        hashSet.add(15);
        f105545b = hashSet;
        f105546c = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.g1.f105535d);
    }

    public final void a(java.util.LinkedList redDotList) {
        kotlin.jvm.internal.o.g(redDotList, "redDotList");
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_REDDOT_MULTI_USERNAME_UPDATE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        com.tencent.mars.xlog.Log.i("Finder.MultiUserChecker", "check isUpdate:" + ((java.lang.Boolean) m17).booleanValue() + " username: " + g92.b.f269769e.T0());
        java.util.Iterator it = redDotList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = (com.tencent.mm.plugin.finder.extension.reddot.jb) it.next();
            if (f105545b.contains(java.lang.Integer.valueOf(jbVar.getType())) && com.tencent.mm.sdk.platformtools.t8.K0(jbVar.field_ctrInfo.f388496q)) {
                jbVar.field_ctrInfo.f388496q = g92.b.f269769e.T0();
            }
        }
        g92.b bVar = g92.b.f269769e;
        m92.h h66 = bVar.h6();
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = h66.f324985h;
        jz5.g gVar = f105546c;
        if (!copyOnWriteArraySet.contains((l92.c) ((jz5.n) gVar).getValue())) {
            h66.f324985h.add((l92.c) ((jz5.n) gVar).getValue());
            com.tencent.mars.xlog.Log.i("Finder.MultiUserChecker", "add accountChangeListener");
        }
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_MSG_SYSTEM_INT_SYNC, 0);
        java.lang.String T0 = bVar.T0();
        if (T0 == null) {
            T0 = "";
        }
        m92.c cVar = new m92.c(T0);
        cVar.field_systemMsgCount = r17;
        bVar.C(cVar, m92.j.f325008z);
    }
}
