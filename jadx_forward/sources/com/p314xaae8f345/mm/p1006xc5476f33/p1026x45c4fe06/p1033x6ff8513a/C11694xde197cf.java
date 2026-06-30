package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager */
/* loaded from: classes7.dex */
public final class C11694xde197cf {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Collection f157642a;

    /* renamed from: b, reason: collision with root package name */
    public static final bm5.x0 f157643b = new bm5.x0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11695x5f81adb2());

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11693xc4fcf5fe f157644c;

    static {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y(null));
        f157642a = java.util.Collections.unmodifiableCollection(linkedList);
        f157644c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11693xc4fcf5fe() { // from class: com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.3
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11693xc4fcf5fe
            /* renamed from: toString */
            public java.lang.String mo49595x9616526c() {
                return "AppBrandLocalMediaObject::Nil";
            }
        };
    }

    public static long a(java.lang.String str) {
        java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E(str);
        java.util.zip.CheckedInputStream checkedInputStream = new java.util.zip.CheckedInputStream(E, new java.util.zip.Adler32());
        do {
        } while (checkedInputStream.read(new byte[2048]) >= 0);
        long value = checkedInputStream.getChecksum().getValue();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(checkedInputStream);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(E);
        return value;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11693xc4fcf5fe b(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        return c(str, str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11693xc4fcf5fe.class, str3, z17);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00de A[EDGE_INSN: B:30:0x00de->B:31:0x00de BREAK  A[LOOP:0: B:12:0x0022->B:76:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144 A[Catch: Exception -> 0x0181, TryCatch #2 {Exception -> 0x0181, blocks: (B:36:0x00ec, B:38:0x010e, B:40:0x0114, B:43:0x011b, B:46:0x0126, B:48:0x012c, B:53:0x0144, B:57:0x0164, B:60:0x016b, B:64:0x0135), top: B:35:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[LOOP:0: B:12:0x0022->B:76:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11693xc4fcf5fe c(java.lang.String r10, java.lang.String r11, java.lang.Class r12, java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11694xde197cf.c(java.lang.String, java.lang.String, java.lang.Class, java.lang.String, boolean):com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11693xc4fcf5fe d(java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11694xde197cf.d(java.lang.String, java.lang.String):com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject");
    }

    public static java.lang.String e(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.z7 a17;
        com.p314xaae8f345.mm.vfs.z7 z7Var;
        java.lang.String f17 = f(str);
        com.p314xaae8f345.mm.vfs.w6.u(f17);
        if (f17 == null) {
            a17 = null;
        } else {
            try {
                a17 = com.p314xaae8f345.mm.vfs.z7.a(f17);
            } catch (java.lang.Exception unused) {
            }
        }
        if (a17 == null) {
            z7Var = new com.p314xaae8f345.mm.vfs.z7(null, null, com.p314xaae8f345.mm.vfs.e8.l(".nomedia", false, false), null, null);
        } else {
            z7Var = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, com.p314xaae8f345.mm.vfs.e8.l(a17.f294812f + "/.nomedia", false, false), a17.f294813g, a17.f294814h);
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var, null);
        if (!m17.a()) {
            throw new java.io.FileNotFoundException("Cannot resolve path or URI: " + z7Var);
        }
        com.p314xaae8f345.mm.vfs.q2 q2Var = m17.f294799a;
        java.lang.String str2 = m17.f294800b;
        if (!q2Var.F(str2)) {
            q2Var.c(str2, false).close();
        }
        return f17;
    }

    public static java.lang.String f(java.lang.String str) {
        return ((java.lang.String) f157643b.b()) + str + "/";
    }

    /* renamed from: genMediaFilePath */
    public static java.lang.String m49597x6a716255(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return null;
        }
        return e(str) + str2;
    }
}
