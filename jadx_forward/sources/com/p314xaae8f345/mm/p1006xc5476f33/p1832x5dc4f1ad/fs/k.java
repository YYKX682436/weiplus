package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k f229512a = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f229513b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f229514c = new java.util.HashMap();

    static {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushFileSystemFactory", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }

    public static /* synthetic */ jc3.k0 b(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.k kVar, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var, java.util.List list, int i17, java.lang.Object obj) {
        if ((i17 & 16) != 0) {
            list = null;
        }
        return kVar.a(str, str2, str3, u1Var, list);
    }

    public final jc3.k0 a(java.lang.String instanceName, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var, java.util.List list) {
        jc3.k0 eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        java.lang.String lowerCase = instanceName.toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        java.util.HashMap hashMap = f229513b;
        if (hashMap.containsKey(lowerCase)) {
            eVar = (jc3.k0) hashMap.get(lowerCase);
            if (eVar == null) {
                synchronized (this) {
                    hashMap.remove(lowerCase);
                }
                eVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.e(lowerCase, str, str2, u1Var, list);
                synchronized (this) {
                    hashMap.put(lowerCase, eVar);
                }
            } else {
                eVar.J(lowerCase, str, str2, u1Var, list);
            }
        } else {
            eVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.e(lowerCase, str, str2, u1Var, list);
            synchronized (this) {
                hashMap.put(lowerCase, eVar);
            }
        }
        return eVar;
    }
}
