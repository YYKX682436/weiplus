package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class h0 implements com.p314xaae8f345.mm.vfs.v5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.h0 f294497a = new com.p314xaae8f345.mm.vfs.h0();

    @Override // com.p314xaae8f345.mm.vfs.v5
    public final void a(java.lang.String id6, com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb, int i17, java.util.Map p17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interfaceC22750xe27c22eb, "<anonymous parameter 1>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p");
        java.lang.Object obj = p17.get("op");
        java.lang.String str2 = (java.lang.String) com.p314xaae8f345.mm.vfs.j0.f294542b.get(obj);
        if (str2 == null) {
            str2 = java.lang.String.valueOf(obj);
        }
        java.lang.Object obj2 = p17.get("result");
        java.lang.String str3 = (java.lang.String) com.p314xaae8f345.mm.vfs.j0.f294543c.get(obj2);
        if (str3 == null) {
            str3 = java.lang.String.valueOf(obj2);
        }
        java.lang.Object obj3 = p17.get(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
        java.lang.Object obj4 = p17.get("targetFS");
        java.lang.Object obj5 = p17.get("targetPath");
        if (obj4 == null) {
            str = "[" + id6 + "] (" + str2 + ") " + obj3 + " : " + str3;
        } else {
            str = "[" + id6 + "] (" + str2 + ") " + obj3 + " -> " + obj5 + '(' + obj4 + ") : " + str3;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p17.get("result"), 2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.AccessLog", str);
            return;
        }
        java.lang.AssertionError assertionError = new java.lang.AssertionError("Operation rejected: " + str);
        if (!com.p314xaae8f345.mm.vfs.i0.f294522a) {
            if (z65.c.a()) {
                throw assertionError;
            }
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        if (com.p314xaae8f345.mm.vfs.e8.j("vfs_db_protect_assert") > 0) {
            throw assertionError;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("VFS.AccessLog", assertionError, "", new java.lang.Object[0]);
    }
}
