package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class kc {

    /* renamed from: a, reason: collision with root package name */
    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ka f131597a = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ka();

    public static java.lang.String a(java.lang.String str) {
        return f131597a.f131591a.a(str);
    }

    private static <D extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz> com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf<D> b(int i17, java.lang.Class<D> cls, com.tencent.mapsdk.internal.jy.a... aVarArr) {
        return a(a(i17, cls, aVarArr));
    }

    private static <D extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz> com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw<D> c(int i17, java.lang.Class<D> cls, com.tencent.mapsdk.internal.jy.a... aVarArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy a17 = a(i17, cls, aVarArr);
        if (a17 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw) {
            return (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw) a17;
        }
        return null;
    }

    private static <D extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz> com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw<D> b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D> jyVar) {
        if (jyVar instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw) {
            return (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw) jyVar;
        }
        return null;
    }

    public static <D extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz> com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D> a(int i17, java.lang.Class<D> cls, com.tencent.mapsdk.internal.jy.a... aVarArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D> jyVar = null;
        if (cls != null && aVarArr != null && aVarArr.length != 0) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kb kbVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kb(i17);
            boolean z17 = aVarArr.length > 1;
            for (com.tencent.mapsdk.internal.jy.a aVar : aVarArr) {
                if (aVar instanceof com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4384xb667a2e1.a) {
                    jyVar = f131597a.a(cls, (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4384xb667a2e1.a) aVar, com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4384xb667a2e1.class);
                } else if (aVar instanceof com.tencent.mapsdk.internal.ke.c) {
                    com.tencent.mapsdk.internal.ke.c cVar = (com.tencent.mapsdk.internal.ke.c) aVar;
                    com.tencent.mapsdk.internal.ke.a aVar2 = cVar.f131606j;
                    if (aVar2 == com.tencent.mapsdk.internal.ke.a.DISK) {
                        jyVar = f131597a.a(cls, cVar, com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.class);
                    } else if (aVar2 == com.tencent.mapsdk.internal.ke.a.DB) {
                        jyVar = f131597a.a(cls, cVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kd.class);
                    }
                }
                if (z17 && jyVar != null) {
                    kbVar.f131594a.addAll(java.util.Arrays.asList(jyVar));
                }
            }
            if (z17) {
                return kbVar;
            }
        }
        return jyVar;
    }

    public static <D extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz> com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf<D> a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D> jyVar) {
        if (jyVar instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) {
            return (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) jyVar;
        }
        return null;
    }
}
