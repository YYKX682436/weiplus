package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class o7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.o7 f294650d = new com.p314xaae8f345.mm.vfs.o7();

    public o7() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        com.p314xaae8f345.mm.vfs.r ctx = (com.p314xaae8f345.mm.vfs.r) obj;
        com.p314xaae8f345.mm.vfs.q2 fs6 = (com.p314xaae8f345.mm.vfs.q2) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fs6, "fs");
        java.util.Set X0 = kz5.n0.X0(ctx.f294682b.values());
        for (com.p314xaae8f345.mm.vfs.q2 q2Var : com.p314xaae8f345.mm.vfs.e8.c(fs6, null)) {
            if (q2Var instanceof com.p314xaae8f345.mm.vfs.h4) {
                com.p314xaae8f345.mm.vfs.h4 h4Var = (com.p314xaae8f345.mm.vfs.h4) q2Var;
                if (X0.contains(h4Var.f294508e)) {
                    java.lang.String str = "Delete all main path found: " + h4Var.f294508e;
                    r26.t tVar = com.p314xaae8f345.mm.vfs.p7.f294660a;
                    if (z65.c.a()) {
                        z17 = true;
                    } else {
                        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        z17 = false;
                    }
                    if (z17) {
                        throw new java.lang.AssertionError(str);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VFS.VFSRuleChecker", str);
                    return java.lang.Boolean.FALSE;
                }
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
