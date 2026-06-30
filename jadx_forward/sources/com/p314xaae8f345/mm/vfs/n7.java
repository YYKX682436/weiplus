package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class n7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.n7 f294629d = new com.p314xaae8f345.mm.vfs.n7();

    public n7() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        jz5.l lVar;
        com.p314xaae8f345.mm.vfs.r ctx = (com.p314xaae8f345.mm.vfs.r) obj;
        com.p314xaae8f345.mm.vfs.q2 fs6 = (com.p314xaae8f345.mm.vfs.q2) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fs6, "fs");
        if (!(fs6 instanceof com.p314xaae8f345.mm.vfs.u3)) {
            return java.lang.Boolean.FALSE;
        }
        jz5.l lVar2 = null;
        for (com.p314xaae8f345.mm.vfs.q2 q2Var : com.p314xaae8f345.mm.vfs.e8.c(fs6, null)) {
            if (q2Var instanceof com.p314xaae8f345.mm.vfs.h4) {
                r26.t tVar = com.p314xaae8f345.mm.vfs.p7.f294660a;
                com.p314xaae8f345.mm.vfs.h4 h4Var = (com.p314xaae8f345.mm.vfs.h4) q2Var;
                java.lang.String mRealBasePath = h4Var.f294508e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mRealBasePath, "mRealBasePath");
                boolean z17 = false;
                r26.m b17 = tVar.b(mRealBasePath, 0);
                if (b17 != null) {
                    r26.q qVar = (r26.q) b17;
                    if (qVar.a().size() >= 2) {
                        java.lang.String str = (java.lang.String) qVar.a().get(1);
                        if (lVar2 == null) {
                            java.util.Iterator it = ctx.f294681a.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    lVar = 0;
                                    break;
                                }
                                lVar = it.next();
                                jz5.l lVar3 = (jz5.l) lVar;
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lVar3.f384366d, str) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lVar3.f384367e, str)) {
                                    break;
                                }
                            }
                            lVar2 = lVar;
                            if (lVar2 == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("VFS.VFSRuleChecker", "Account not found, path: " + h4Var.f294508e);
                            }
                        } else {
                            java.lang.Object obj3 = lVar2.f384366d;
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj3, str)) {
                                continue;
                            } else {
                                java.lang.Object obj4 = lVar2.f384367e;
                                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj4, str)) {
                                    java.lang.String str2 = "Cross account migration found: " + str + " <-> (" + ((java.lang.String) obj3) + '/' + ((java.lang.String) obj4);
                                    if (z65.c.a()) {
                                        z17 = true;
                                    } else {
                                        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                                    }
                                    if (z17) {
                                        throw new java.lang.AssertionError(str2);
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VFS.VFSRuleChecker", str2);
                                    return java.lang.Boolean.FALSE;
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
