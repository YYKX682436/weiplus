package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class kc {

    /* renamed from: a, reason: collision with root package name */
    private static com.tencent.mapsdk.internal.ka f50064a = new com.tencent.mapsdk.internal.ka();

    public static java.lang.String a(java.lang.String str) {
        return f50064a.f50058a.a(str);
    }

    private static <D extends com.tencent.mapsdk.internal.jz> com.tencent.mapsdk.internal.kf<D> b(int i17, java.lang.Class<D> cls, com.tencent.mapsdk.internal.jy.a... aVarArr) {
        return a(a(i17, cls, aVarArr));
    }

    private static <D extends com.tencent.mapsdk.internal.jz> com.tencent.mapsdk.internal.jw<D> c(int i17, java.lang.Class<D> cls, com.tencent.mapsdk.internal.jy.a... aVarArr) {
        com.tencent.mapsdk.internal.jy a17 = a(i17, cls, aVarArr);
        if (a17 instanceof com.tencent.mapsdk.internal.jw) {
            return (com.tencent.mapsdk.internal.jw) a17;
        }
        return null;
    }

    private static <D extends com.tencent.mapsdk.internal.jz> com.tencent.mapsdk.internal.jw<D> b(com.tencent.mapsdk.internal.jy<D> jyVar) {
        if (jyVar instanceof com.tencent.mapsdk.internal.jw) {
            return (com.tencent.mapsdk.internal.jw) jyVar;
        }
        return null;
    }

    public static <D extends com.tencent.mapsdk.internal.jz> com.tencent.mapsdk.internal.jy<D> a(int i17, java.lang.Class<D> cls, com.tencent.mapsdk.internal.jy.a... aVarArr) {
        com.tencent.mapsdk.internal.jy<D> jyVar = null;
        if (cls != null && aVarArr != null && aVarArr.length != 0) {
            com.tencent.mapsdk.internal.kb kbVar = new com.tencent.mapsdk.internal.kb(i17);
            boolean z17 = aVarArr.length > 1;
            for (com.tencent.mapsdk.internal.jy.a aVar : aVarArr) {
                if (aVar instanceof com.tencent.mapsdk.core.utils.cache.MemoryCache.a) {
                    jyVar = f50064a.a(cls, (com.tencent.mapsdk.core.utils.cache.MemoryCache.a) aVar, com.tencent.mapsdk.core.utils.cache.MemoryCache.class);
                } else if (aVar instanceof com.tencent.mapsdk.internal.ke.c) {
                    com.tencent.mapsdk.internal.ke.c cVar = (com.tencent.mapsdk.internal.ke.c) aVar;
                    com.tencent.mapsdk.internal.ke.a aVar2 = cVar.f50073j;
                    if (aVar2 == com.tencent.mapsdk.internal.ke.a.DISK) {
                        jyVar = f50064a.a(cls, cVar, com.tencent.mapsdk.core.utils.cache.DiskCache.class);
                    } else if (aVar2 == com.tencent.mapsdk.internal.ke.a.DB) {
                        jyVar = f50064a.a(cls, cVar, com.tencent.mapsdk.internal.kd.class);
                    }
                }
                if (z17 && jyVar != null) {
                    kbVar.f50061a.addAll(java.util.Arrays.asList(jyVar));
                }
            }
            if (z17) {
                return kbVar;
            }
        }
        return jyVar;
    }

    public static <D extends com.tencent.mapsdk.internal.jz> com.tencent.mapsdk.internal.kf<D> a(com.tencent.mapsdk.internal.jy<D> jyVar) {
        if (jyVar instanceof com.tencent.mapsdk.internal.kf) {
            return (com.tencent.mapsdk.internal.kf) jyVar;
        }
        return null;
    }
}
