package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public abstract class r2 {

    /* renamed from: a, reason: collision with root package name */
    public static final kk.j f164759a = new jt0.j(100);

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.q2 a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.q2 q2Var;
        if (str == null || str.length() == 0) {
            return null;
        }
        kk.j jVar = f164759a;
        synchronized (jVar) {
            q2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.q2) ((lt0.f) jVar).get(str);
        }
        return q2Var;
    }

    public static final void b(java.lang.String shareActionId, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.q2 details) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareActionId, "shareActionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(details, "details");
        kk.j jVar = f164759a;
        synchronized (jVar) {
        }
    }
}
