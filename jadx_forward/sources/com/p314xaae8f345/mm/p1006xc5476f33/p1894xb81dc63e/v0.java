package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f232145a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f232146b;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.v0 v0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.v0();
        java.lang.String str = v0Var.a() + "coverimg/";
        f232145a = str;
        java.lang.String str2 = com.p314xaae8f345.mm.vfs.q7.c("multitask") + "/coverimg/";
        f232146b = str2;
        if (!com.p314xaae8f345.mm.vfs.w6.j(v0Var.a())) {
            com.p314xaae8f345.mm.vfs.w6.u(v0Var.a());
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.mm.vfs.w6.u(str);
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.u(str2);
    }

    public final java.lang.String a() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class))).getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            str = gm0.j1.u().d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.d0.class);
            str = c10756x2a5d7b2d != null ? c10756x2a5d7b2d.f149939d : null;
            if (str == null) {
                str = "";
            }
        }
        sb6.append(str);
        sb6.append("multitask/");
        return sb6.toString();
    }
}
