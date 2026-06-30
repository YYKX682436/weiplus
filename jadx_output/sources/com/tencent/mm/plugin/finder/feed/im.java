package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class im {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.im f107046a = new com.tencent.mm.plugin.finder.feed.im();

    public final so2.k a(r45.gk2 lbsSection) {
        kotlin.jvm.internal.o.g(lbsSection, "lbsSection");
        r45.dh2 dh2Var = new r45.dh2();
        dh2Var.set(0, 1);
        dh2Var.set(2, lbsSection);
        return b(dh2Var);
    }

    public final so2.k b(r45.dh2 dh2Var) {
        com.tencent.mm.plugin.finder.storage.ja0 ja0Var = new com.tencent.mm.plugin.finder.storage.ja0(dh2Var);
        r45.dh2 dh2Var2 = ja0Var.f126992a;
        int integer = dh2Var2.getInteger(0);
        if (integer == 1) {
            r45.gk2 gk2Var = (r45.gk2) dh2Var2.getCustom(2);
            if (gk2Var == null) {
                gk2Var = new r45.gk2();
            }
            com.tencent.mm.plugin.finder.storage.o90 o90Var = new com.tencent.mm.plugin.finder.storage.o90(gk2Var);
            ja0Var.f126993b = o90Var;
            ja0Var.f126994c = null;
            ja0Var.f126995d = null;
            ja0Var.f126997f = o90Var.c().getInteger(3) + 1000;
            ja0Var.f126998g = ((java.lang.Number) ((jz5.n) o90Var.f127300c).getValue()).longValue() + (ja0Var.f126993b != null ? r8.hashCode() : 0);
        } else if (integer == 2) {
            ja0Var.f126993b = null;
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) dh2Var2.getCustom(3);
            if (finderObject == null) {
                finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
            }
            com.tencent.mm.plugin.finder.storage.FinderItem a17 = h90Var.a(finderObject, 0);
            ja0Var.f126994c = a17;
            ja0Var.f126995d = null;
            ja0Var.f126997f = a17.getMediaType();
            ja0Var.f126998g = a17.getId();
        } else if (integer == 3) {
            ja0Var.f126993b = null;
            ja0Var.f126994c = null;
            r45.eh2 eh2Var = (r45.eh2) dh2Var2.getCustom(1);
            if (eh2Var == null) {
                eh2Var = new r45.eh2();
            }
            com.tencent.mm.plugin.finder.storage.la0 la0Var = new com.tencent.mm.plugin.finder.storage.la0(eh2Var);
            ja0Var.f126995d = la0Var;
            ja0Var.f126997f = la0Var.f127124a.getInteger(0);
            ja0Var.f126998g = ((java.lang.Number) ((jz5.n) la0Var.f127125b).getValue()).longValue();
        } else if (integer == 4) {
            ja0Var.f126993b = null;
            ja0Var.f126994c = null;
            ja0Var.f126995d = null;
            r45.ro2 ro2Var = (r45.ro2) dh2Var2.getCustom(4);
            if (ro2Var == null) {
                ro2Var = new r45.ro2();
            }
            ja0Var.f126996e = new com.tencent.mm.plugin.finder.profile.f0(ro2Var);
            ja0Var.f126997f = 3000;
        } else {
            ja0Var.f126993b = null;
            ja0Var.f126994c = null;
            ja0Var.f126995d = null;
            ja0Var.f126997f = 10000;
            ja0Var.f126998g = -1L;
        }
        return new so2.k(ja0Var);
    }
}
