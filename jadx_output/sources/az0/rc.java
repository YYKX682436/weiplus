package az0;

/* loaded from: classes5.dex */
public abstract class rc {
    public static final void a(java.lang.String str, com.tencent.maas.instamovie.base.MJError mJError, kotlin.coroutines.Continuation continuation, long j17) {
        if (j17 == -1) {
            j17 = java.lang.System.currentTimeMillis();
        }
        bz0.b bVar = bz0.b.f36724a;
        if (mJError == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
            bVar.c(str, java.lang.System.currentTimeMillis() - j17, bz0.a.f36723b);
            return;
        }
        com.tencent.mars.xlog.Log.e("MaasFuncUtils", str + " call error: " + mJError.f48175ec + ' ' + mJError.message, new java.lang.Throwable());
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        bz0.b.b(bVar, str, mJError, java.lang.System.currentTimeMillis() - j17, 0, 8, null);
    }

    public static final kotlinx.coroutines.flow.j b(java.lang.String funcName, yz5.p block, yz5.l onCancel, boolean z17) {
        kotlin.jvm.internal.o.g(funcName, "funcName");
        kotlin.jvm.internal.o.g(block, "block");
        kotlin.jvm.internal.o.g(onCancel, "onCancel");
        return kotlinx.coroutines.flow.l.d(new az0.dc(block, funcName, z17, onCancel, null));
    }

    public static final java.util.Map c(com.tencent.mm.protobuf.f fVar) {
        f06.w wVar;
        kotlin.jvm.internal.o.g(fVar, "<this>");
        java.lang.reflect.Field[] declaredFields = fVar.getClass().getDeclaredFields();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        kotlin.jvm.internal.o.d(declaredFields);
        for (java.lang.reflect.Field field : declaredFields) {
            field.setAccessible(true);
            java.lang.String name = field.getName();
            java.lang.Object obj = field.get(fVar);
            if (obj != null) {
                java.util.List a17 = kotlin.jvm.internal.i0.a(field.getClass()).a();
                if (kotlin.jvm.internal.o.b((a17 == null || (wVar = (f06.w) kz5.n0.Z(a17)) == null) ? null : ((i06.w3) wVar).i(), kotlin.jvm.internal.i0.a(com.tencent.mm.protobuf.f.class))) {
                    kotlin.jvm.internal.o.d(name);
                    com.tencent.mm.protobuf.f fVar2 = obj instanceof com.tencent.mm.protobuf.f ? (com.tencent.mm.protobuf.f) obj : null;
                    linkedHashMap.put(name, fVar2 != null ? c(fVar2) : null);
                }
            }
            kotlin.jvm.internal.o.d(name);
            linkedHashMap.put(name, obj);
        }
        return linkedHashMap;
    }

    public static final java.lang.Object d(java.lang.String str, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.maas.instamovie.base.MJError mJError = (com.tencent.maas.instamovie.base.MJError) lVar.invoke(new az0.ic(nVar, str, currentTimeMillis));
        if (mJError != null) {
            com.tencent.mars.xlog.Log.e("MaasFuncUtils", str + " call error: " + mJError.f48175ec + ' ' + mJError.message, new java.lang.Throwable());
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            nVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
            bz0.b.b(bz0.b.f36724a, str, mJError, java.lang.System.currentTimeMillis() - currentTimeMillis, 0, 8, null);
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public static final java.lang.Object e(java.lang.String str, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.maas.instamovie.base.MJError mJError = (com.tencent.maas.instamovie.base.MJError) lVar.invoke(new az0.jc(str, nVar, currentTimeMillis));
        if (mJError != null) {
            com.tencent.mars.xlog.Log.e("MaasFuncUtils", str + " call error: " + mJError.f48175ec + ' ' + mJError.message, new java.lang.Throwable());
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            nVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
            bz0.b.b(bz0.b.f36724a, str, mJError, java.lang.System.currentTimeMillis() - currentTimeMillis, 0, 8, null);
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public static final java.lang.Object f(java.lang.String str, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.maas.instamovie.base.MJError mJError = (com.tencent.maas.instamovie.base.MJError) lVar.invoke(new az0.pc(str, nVar, currentTimeMillis));
        if (mJError != null) {
            com.tencent.mars.xlog.Log.e("MaasFuncUtils", str + " call error: " + mJError.f48175ec + ' ' + mJError.message, new java.lang.Throwable());
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            nVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
            bz0.b.b(bz0.b.f36724a, str, mJError, java.lang.System.currentTimeMillis() - currentTimeMillis, 0, 8, null);
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public static final boolean g(java.lang.String funcName, int i17, yz5.a block) {
        kotlin.jvm.internal.o.g(funcName, "funcName");
        kotlin.jvm.internal.o.g(block, "block");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.maas.instamovie.base.MJError mJError = (com.tencent.maas.instamovie.base.MJError) block.invoke();
        bz0.b bVar = bz0.b.f36724a;
        if (mJError == null) {
            bVar.c(funcName, java.lang.System.currentTimeMillis() - currentTimeMillis, i17);
            return true;
        }
        com.tencent.mars.xlog.Log.e("MaasFuncUtils", funcName + " call error: " + mJError.f48175ec + ' ' + mJError.message, new java.lang.Throwable());
        bVar.a(funcName, mJError, java.lang.System.currentTimeMillis() - currentTimeMillis, i17);
        return false;
    }

    public static final java.lang.Object h(java.lang.String str, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Object invoke = lVar.invoke(new az0.qc(str, nVar, currentTimeMillis));
        if (invoke != null) {
            com.tencent.maas.instamovie.base.MJError mJError = invoke instanceof com.tencent.maas.instamovie.base.MJError ? (com.tencent.maas.instamovie.base.MJError) invoke : null;
            if (invoke instanceof com.tencent.maas.instamovie.MJAsyncTaskInfo) {
                mJError = ((com.tencent.maas.instamovie.MJAsyncTaskInfo) invoke).f48104a;
            }
            com.tencent.maas.instamovie.base.MJError mJError2 = mJError;
            if (mJError2 != null) {
                com.tencent.mars.xlog.Log.e("MaasFuncUtils", str + " call error : " + mJError2.f48175ec + ' ' + mJError2.message, new java.lang.Throwable());
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                nVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
                bz0.b.b(bz0.b.f36724a, str, mJError2, java.lang.System.currentTimeMillis() - currentTimeMillis, 0, 8, null);
            }
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public static void i(java.lang.String funcName, long j17, com.tencent.maas.instamovie.base.MJError mJError, boolean z17, int i17, int i18, java.lang.Object obj) {
        com.tencent.maas.instamovie.base.MJError mJError2 = (i18 & 4) != 0 ? null : mJError;
        boolean z18 = (i18 & 8) != 0 ? false : z17;
        int i19 = (i18 & 16) != 0 ? bz0.a.f36723b : i17;
        kotlin.jvm.internal.o.g(funcName, "funcName");
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        bz0.b bVar = bz0.b.f36724a;
        if (z18) {
            bVar.e(100, funcName, "cancel", currentTimeMillis, i19);
        } else if (mJError2 == null) {
            bVar.c(funcName, currentTimeMillis, i19);
        } else {
            bVar.a(funcName, mJError2, currentTimeMillis, i19);
        }
    }

    public static final java.lang.String j(java.util.Map map, int i17) {
        java.lang.String valueOf;
        kotlin.jvm.internal.o.g(map, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i18 = 0; i18 < i17; i18++) {
            sb6.append(" ");
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("\n" + sb7 + '{');
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.Object value = entry.getValue();
            java.util.Map map2 = value instanceof java.util.Map ? (java.util.Map) value : null;
            if (map2 != null) {
                valueOf = j(map2, (sb7 + entry.getKey() + " = ").length());
                if (valueOf != null) {
                    sb8.append("\n\t" + sb7 + '[' + entry.getKey() + "] = " + valueOf + ',');
                }
            }
            valueOf = java.lang.String.valueOf(value);
            sb8.append("\n\t" + sb7 + '[' + entry.getKey() + "] = " + valueOf + ',');
        }
        sb8.append("\n" + sb7 + '}');
        java.lang.String sb9 = sb8.toString();
        kotlin.jvm.internal.o.f(sb9, "toString(...)");
        return sb9;
    }
}
