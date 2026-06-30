package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public interface w {

    /* renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f161297q0 = 0;

    default android.content.Context b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lVar, "<this>");
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 != null) {
            return mo50352x76847179;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar : null;
        android.content.Context context = (d0Var == null || (t37 = d0Var.t3()) == null) ? null : t37.f156328d;
        if (context != null) {
            return context;
        }
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        return context2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    default r45.nd7 c(r45.nd7 r4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r5) {
        /*
            r3 = this;
            java.lang.String r0 = "<this>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            java.lang.String r0 = "service"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            boolean r0 = r5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0
            r1 = 0
            if (r0 == 0) goto L2a
            r0 = r5
            com.tencent.mm.plugin.appbrand.jsapi.d0 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) r0
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r2 = r0.t3()
            boolean r2 = r2 instanceof ze.n
            if (r2 == 0) goto L2a
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r0.t3()
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.luggage.sdk.runtime.AppBrandRuntimeLU"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r2)
            ze.n r0 = (ze.n) r0
            int r0 = r0.g2()
            goto L2b
        L2a:
            r0 = r1
        L2b:
            r4.f462829e = r0
            boolean r0 = r5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9
            if (r0 == 0) goto L33
            r1 = 1
            goto L38
        L33:
            boolean r5 = r5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5
            if (r5 == 0) goto L38
            r1 = 2
        L38:
            r4.f462830f = r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w.c(r45.nd7, com.tencent.mm.plugin.appbrand.jsapi.l):r45.nd7");
    }

    default void e(android.content.Context context, android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2, ui1.z dialog) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialog, "dialog");
        d75.b.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v(str, context, str2, bitmap, dialog));
    }

    default void i(km5.b bVar, km5.d pipeable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeable, "pipeable");
        ((km5.q) pipeable.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.t(bVar))).s(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.u(bVar));
    }
}
