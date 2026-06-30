package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

@j95.b
/* loaded from: classes11.dex */
public class p2 extends i95.w {

    /* renamed from: e, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2621x8fb0427b.z3 f235111e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Boolean f235112f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Boolean f235113g;

    /* renamed from: d, reason: collision with root package name */
    public ur3.a f235114d = null;

    public static ur3.a Ai() {
        gm0.j1.b().c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2 p2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.class);
        if (p2Var.f235114d == null && gm0.j1.a()) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.class) {
                if (p2Var.f235114d == null) {
                    p2Var.f235114d = new ur3.a(c01.d9.b().s());
                }
            }
        }
        return p2Var.f235114d;
    }

    public static void Bi(android.content.Intent intent, int i17, int i18, java.lang.String str) {
        ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.o2(intent, i17, i18, str), 100L);
    }

    public static int wi(android.content.Intent intent) {
        if (intent != null) {
            return intent.getIntExtra("CONTACT_INFO_UI_SOURCE", 0);
        }
        return 0;
    }
}
