package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class wd {
    public wd(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.util.List selectedList) {
        kotlin.jvm.internal.o.g(selectedList, "selectedList");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        for (java.lang.Object obj : selectedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String g17 = ((b93.b) c93.a.a()).g((java.lang.String) obj);
            if (g17 == null) {
                g17 = "";
            }
            sb6.append(g17);
            if (i17 < selectedList.size() - 1) {
                sb6.append(",");
            }
            i17 = i18;
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String b(java.util.LinkedList linkedList) {
        int i17 = 0;
        if (linkedList == null || linkedList.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.Object obj : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sb6.append(((r45.il1) obj).getString(1));
            if (i17 < linkedList.size() - 1) {
                sb6.append(",");
            }
            i17 = i18;
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String c(java.util.List selectedList) {
        kotlin.jvm.internal.o.g(selectedList, "selectedList");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        for (java.lang.Object obj : selectedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q((java.lang.String) obj);
            java.lang.String str = "";
            if (q17 != null) {
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String d17 = q17.d1();
                ((sg3.a) v0Var).getClass();
                java.lang.String c17 = c01.a2.c(q17, d17);
                if (c17 != null) {
                    str = c17;
                }
            }
            sb6.append(str);
            if (i17 < selectedList.size() - 1) {
                sb6.append(",");
            }
            i17 = i18;
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
