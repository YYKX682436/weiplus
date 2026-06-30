package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes5.dex */
public final class f0 {
    public f0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a() {
        if (!z65.c.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g0.f159282f.clear();
            return;
        }
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_weapp_all_debug_mode_appidlist, "", true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Zi, "getExpt(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g0.f159281e = Zi;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g0.f159282f;
        copyOnWriteArrayList.clear();
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g0.f159281e;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("exptVal");
            throw null;
        }
        java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"#"}, false, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : f07) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        copyOnWriteArrayList.addAll(arrayList);
    }
}
