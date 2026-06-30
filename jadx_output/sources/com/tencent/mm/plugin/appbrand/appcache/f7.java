package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class f7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f75528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f75529e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f75529e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.appcache.f7(this.f75529e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.appcache.f7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.vfs.r6[] r6VarArr;
        int i17;
        com.tencent.mm.vfs.r6[] r6VarArr2;
        int i18;
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i19 = this.f75528d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        kotlinx.coroutines.r2 r2Var = null;
        try {
            if (i19 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (this.f75529e) {
                    com.tencent.mm.plugin.appbrand.appcache.l3.f75641a.run();
                }
                java.lang.String d17 = com.tencent.mm.plugin.appbrand.appcache.d9.d();
                com.tencent.mm.plugin.appbrand.appcache.qa Di = com.tencent.mm.plugin.appbrand.app.r9.Di();
                if (Di == null) {
                    com.tencent.mm.plugin.appbrand.appcache.g7.f75555b = null;
                    return f0Var;
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                com.tencent.mm.vfs.r6[] b17 = com.tencent.mm.plugin.appbrand.appcache.d9.b();
                com.tencent.mm.vfs.r6[] G = new com.tencent.mm.vfs.r6(d17).G();
                if (b17 != null) {
                    if (G == null) {
                        G = new com.tencent.mm.vfs.r6[0];
                    }
                    r6VarArr = (com.tencent.mm.vfs.r6[]) kz5.v.z(b17, G);
                } else {
                    r6VarArr = null;
                }
                if (r6VarArr == null) {
                    r6VarArr = new com.tencent.mm.vfs.r6[0];
                }
                int length = r6VarArr.length;
                int i27 = 0;
                while (i27 < length) {
                    java.lang.String o17 = r6VarArr[i27].o();
                    kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                    com.tencent.mm.plugin.appbrand.appcache.n9 p17 = Di.p(o17);
                    com.tencent.mm.plugin.appbrand.appcache.g7 g7Var = com.tencent.mm.plugin.appbrand.appcache.g7.f75554a;
                    if (p17 != null) {
                        r6VarArr2 = r6VarArr;
                        linkedList2.add(com.tencent.mm.plugin.appbrand.appcache.g7.a(g7Var, new java.lang.String[]{p17.field_appId, java.lang.String.valueOf(p17.field_debugType), java.lang.String.valueOf(p17.field_version), o17, java.lang.String.valueOf(com.tencent.mm.vfs.w6.k(o17))}));
                    } else {
                        r6VarArr2 = r6VarArr;
                    }
                    com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord i28 = com.tencent.mm.plugin.appbrand.appcache.y7.f76065a.i(o17);
                    if (i28 != null) {
                        java.lang.String[] strArr = new java.lang.String[6];
                        strArr[0] = "@LibraryAppId";
                        strArr[1] = java.lang.String.valueOf(i28.f75378e);
                        strArr[2] = java.lang.String.valueOf(i28.f75377d);
                        strArr[3] = o17;
                        strArr[4] = java.lang.String.valueOf(com.tencent.mm.vfs.w6.k(o17));
                        java.util.List list = i28.f75386p;
                        if (list != null) {
                            i18 = length;
                            str = com.tencent.mm.sdk.platformtools.h2.a(list, ",");
                        } else {
                            i18 = length;
                            str = "";
                        }
                        strArr[5] = str;
                        linkedList.add(com.tencent.mm.plugin.appbrand.appcache.g7.a(g7Var, strArr));
                    } else {
                        i18 = length;
                    }
                    if (p17 == null && i28 == null) {
                        linkedList3.add(com.tencent.mm.plugin.appbrand.appcache.g7.a(g7Var, new java.lang.String[]{o17, java.lang.String.valueOf(com.tencent.mm.vfs.w6.k(o17))}));
                    }
                    i27++;
                    length = i18;
                    r6VarArr = r6VarArr2;
                }
                int[] o18 = com.tencent.mm.plugin.appbrand.appcache.y7.f76065a.o(true);
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
                kotlin.jvm.internal.o.f(arrays, "toString(...)");
                sb6.append(arrays);
                sb6.append('\n');
                sb6.append("###DBCommonLibRecordVersionList");
                java.lang.String arrays2 = java.util.Arrays.toString(A);
                kotlin.jvm.internal.o.f(arrays2, "toString(...)");
                sb6.append(arrays2);
                sb6.append('\n');
                java.io.File externalCacheDir = com.tencent.mm.sdk.platformtools.x2.f193071a.getExternalCacheDir();
                kotlin.jvm.internal.o.d(externalCacheDir);
                java.lang.String a17 = s46.c.a(externalCacheDir.getAbsolutePath(), "dump_wxapkgs.md");
                java.lang.String sb7 = sb6.toString();
                kotlin.jvm.internal.o.f(sb7, "toString(...)");
                java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
                kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
                byte[] bytes = sb7.getBytes(UTF_8);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                com.tencent.mm.vfs.w6.S(a17, bytes, 0, bytes.length);
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
                r2Var = null;
                com.tencent.mm.plugin.appbrand.appcache.e7 e7Var = new com.tencent.mm.plugin.appbrand.appcache.e7(null);
                this.f75528d = 1;
                if (kotlinx.coroutines.l.g(g3Var, e7Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i19 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.tencent.mm.plugin.appbrand.appcache.g7.f75555b = r2Var;
            return f0Var;
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.plugin.appbrand.appcache.g7.f75555b = null;
            throw th6;
        }
    }
}
