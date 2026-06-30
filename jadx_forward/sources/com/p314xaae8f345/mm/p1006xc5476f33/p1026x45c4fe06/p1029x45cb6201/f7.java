package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class f7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f157061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f157062e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f157062e = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.f7(this.f157062e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.f7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.vfs.r6[] r6VarArr;
        int i17;
        com.p314xaae8f345.mm.vfs.r6[] r6VarArr2;
        int i18;
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i19 = this.f157061d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = null;
        try {
            if (i19 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                if (this.f157062e) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l3.f157174a.run();
                }
                java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d9.d();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa Di = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di();
                if (Di == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g7.f157088b = null;
                    return f0Var;
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                com.p314xaae8f345.mm.vfs.r6[] b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d9.b();
                com.p314xaae8f345.mm.vfs.r6[] G = new com.p314xaae8f345.mm.vfs.r6(d17).G();
                if (b17 != null) {
                    if (G == null) {
                        G = new com.p314xaae8f345.mm.vfs.r6[0];
                    }
                    r6VarArr = (com.p314xaae8f345.mm.vfs.r6[]) kz5.v.z(b17, G);
                } else {
                    r6VarArr = null;
                }
                if (r6VarArr == null) {
                    r6VarArr = new com.p314xaae8f345.mm.vfs.r6[0];
                }
                int length = r6VarArr.length;
                int i27 = 0;
                while (i27 < length) {
                    java.lang.String o17 = r6VarArr[i27].o();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 p17 = Di.p(o17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g7 g7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g7.f157087a;
                    if (p17 != null) {
                        r6VarArr2 = r6VarArr;
                        linkedList2.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g7.a(g7Var, new java.lang.String[]{p17.f67177x28d45f97, java.lang.String.valueOf(p17.f67180x8ecd6328), java.lang.String.valueOf(p17.f67185x8987ca93), o17, java.lang.String.valueOf(com.p314xaae8f345.mm.vfs.w6.k(o17))}));
                    } else {
                        r6VarArr2 = r6VarArr;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb i28 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a.i(o17);
                    if (i28 != null) {
                        java.lang.String[] strArr = new java.lang.String[6];
                        strArr[0] = "@LibraryAppId";
                        strArr[1] = java.lang.String.valueOf(i28.f156911e);
                        strArr[2] = java.lang.String.valueOf(i28.f156910d);
                        strArr[3] = o17;
                        strArr[4] = java.lang.String.valueOf(com.p314xaae8f345.mm.vfs.w6.k(o17));
                        java.util.List list = i28.f156919p;
                        if (list != null) {
                            i18 = length;
                            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.h2.a(list, ",");
                        } else {
                            i18 = length;
                            str = "";
                        }
                        strArr[5] = str;
                        linkedList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g7.a(g7Var, strArr));
                    } else {
                        i18 = length;
                    }
                    if (p17 == null && i28 == null) {
                        linkedList3.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g7.a(g7Var, new java.lang.String[]{o17, java.lang.String.valueOf(com.p314xaae8f345.mm.vfs.w6.k(o17))}));
                    }
                    i27++;
                    length = i18;
                    r6VarArr = r6VarArr2;
                }
                int[] o18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a.o(true);
                if (o18 == null) {
                    i17 = 0;
                    o18 = new int[0];
                } else {
                    i17 = 0;
                }
                int[] A = Di.A("@LibraryAppId", i17);
                if (A == null) {
                    A = new int[i17];
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("###PKGTRACKED");
                sb6.append('(');
                sb6.append(java.lang.String.valueOf(linkedList2.size()));
                sb6.append(')');
                sb6.append('\n');
                sb6.append("| appId | versionType | appVersion | path | size |");
                sb6.append('\n');
                sb6.append("| ----- | ----------- | ---------- | ---- | ---- |");
                sb6.append('\n');
                java.util.Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    sb6.append((java.lang.String) it.next());
                    sb6.append('\n');
                }
                sb6.append('\n');
                sb6.append("###COMMONLIBTRACKED");
                sb6.append('(');
                sb6.append(java.lang.String.valueOf(linkedList2.size()));
                sb6.append(')');
                sb6.append('\n');
                sb6.append("| appId | versionType | appVersion | path | size | uinList |");
                sb6.append('\n');
                sb6.append("| ----- | ----------- | ---------- | ---- | ---- | ------- |");
                sb6.append('\n');
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    sb6.append((java.lang.String) it6.next());
                    sb6.append('\n');
                }
                sb6.append('\n');
                sb6.append("###UNTRACKED");
                sb6.append('(');
                sb6.append(java.lang.String.valueOf(linkedList3.size()));
                sb6.append(')');
                sb6.append('\n');
                sb6.append("| path | size |");
                sb6.append('\n');
                sb6.append("| ---- | ---- |");
                sb6.append('\n');
                java.util.Iterator it7 = linkedList3.iterator();
                while (it7.hasNext()) {
                    sb6.append((java.lang.String) it7.next());
                    sb6.append('\n');
                }
                sb6.append('\n');
                sb6.append("###KVCommonLibRecordVersionList");
                java.lang.String arrays = java.util.Arrays.toString(o18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
                sb6.append(arrays);
                sb6.append('\n');
                sb6.append("###DBCommonLibRecordVersionList");
                java.lang.String arrays2 = java.util.Arrays.toString(A);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays2, "toString(...)");
                sb6.append(arrays2);
                sb6.append('\n');
                java.io.File externalCacheDir = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getExternalCacheDir();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(externalCacheDir);
                java.lang.String a17 = s46.c.a(externalCacheDir.getAbsolutePath(), "dump_wxapkgs.md");
                java.lang.String sb7 = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
                java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
                byte[] bytes = sb7.getBytes(UTF_8);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                com.p314xaae8f345.mm.vfs.w6.S(a17, bytes, 0, bytes.length);
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
                r2Var = null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e7 e7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e7(null);
                this.f157061d = 1;
                if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, e7Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i19 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g7.f157088b = r2Var;
            return f0Var;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g7.f157088b = null;
            throw th6;
        }
    }
}
