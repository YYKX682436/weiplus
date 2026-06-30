package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes7.dex */
public final class f3 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e3 f264408a;

    /* renamed from: b, reason: collision with root package name */
    public int f264409b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f264410c;

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3 f3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 l2Var;
        java.lang.ref.WeakReference weakReference = f3Var.f264410c;
        if (weakReference != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2) weakReference.get()) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthMultiAccountMgr", "[goBackWebview]");
            java.lang.ref.WeakReference weakReference2 = f3Var.f264410c;
            if (weakReference2 != null && (l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2) weakReference2.get()) != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2) l2Var).d();
            }
        }
        f3Var.c();
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3 f3Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 l2Var;
        java.lang.ref.WeakReference weakReference = f3Var.f264410c;
        if (weakReference != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2) weakReference.get()) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthMultiAccountMgr", "[goRedirectWebview] redirectUrl = " + str);
            java.lang.ref.WeakReference weakReference2 = f3Var.f264410c;
            if (weakReference2 != null && (l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2) weakReference2.get()) != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2) l2Var).b(str, 9);
            }
        }
        f3Var.c();
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y2 y2Var;
        fl1.c0 c0Var;
        fl1.c0 c0Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e3 e3Var = this.f264408a;
        if (e3Var != null && (c0Var2 = e3Var.f264390g) != null) {
            c0Var2.f();
            e3Var.f264390g = null;
            e3Var.f264389f = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e3 e3Var2 = this.f264408a;
        if (e3Var2 != null && (y2Var = e3Var2.f264389f) != null) {
            y2Var.f264727b.a(y2Var.f264728c);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e3 e3Var3 = y2Var.f264729d;
            if (e3Var3 != null && (c0Var = e3Var3.f264390g) != null) {
                c0Var.f();
                e3Var3.f264390g = null;
                e3Var3.f264389f = null;
            }
            y2Var.f264729d = null;
        }
        this.f264408a = null;
        this.f264410c = null;
    }
}
