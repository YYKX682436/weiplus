package zv1;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final zv1.k f557845a = new zv1.k();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f557846b = jz5.h.b(zv1.i.f557837d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f557847c = jz5.h.b(zv1.j.f557840d);

    public static zv1.q0 a(zv1.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 cacheType, zv1.j0 policy, java.util.List additionalPaths, zv1.w0 w0Var, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            additionalPaths = kz5.p0.f395529d;
        }
        if ((i17 & 8) != 0) {
            w0Var = null;
        }
        kVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheType, "cacheType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(policy, "policy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(additionalPaths, "additionalPaths");
        return new zv1.q0(cacheType, policy, additionalPaths, w0Var);
    }

    public final java.util.Map b() {
        return (java.util.Map) ((jz5.n) f557846b).mo141623x754a37bb();
    }

    public final zv1.d a(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 cacheType, zv1.a0 a0Var) {
        zv1.s sVar;
        zv1.s sVar2;
        zv1.s sVar3;
        zv1.s sVar4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheType, "cacheType");
        synchronized (b()) {
            zv1.k kVar = f557845a;
            if (kVar.b().containsKey(cacheType)) {
                return (zv1.d) kVar.b().get(cacheType);
            }
            int i17 = 3;
            switch (zv1.h.f557834a[cacheType.ordinal()]) {
                case 1:
                    com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 cacheType2 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.f35412xe5e01d51;
                    zv1.j0 j0Var = zv1.j0.f557841d;
                    kz5.p0 p0Var = kz5.p0.f395529d;
                    if (a0Var != null && (sVar = a0Var.f557790f) != null) {
                        i17 = sVar.f557908e;
                    }
                    zv1.l lVar = new zv1.l(i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheType2, "cacheType");
                    return new zv1.q0(cacheType2, j0Var, p0Var, lVar);
                case 2:
                    return a(kVar, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.f35413xdc6a4a74, zv1.j0.f557841d, null, null, 12, null);
                case 3:
                    return new zv1.e();
                case 4:
                    return new zv1.g();
                case 5:
                    return zv1.m.a(cacheType, a0Var);
                case 6:
                    return zv1.m.a(cacheType, a0Var);
                case 7:
                    return zv1.m.a(cacheType, a0Var);
                case 8:
                    return zv1.m.a(cacheType, a0Var);
                case 9:
                    return zv1.m.a(cacheType, a0Var);
                case 10:
                    return zv1.m.a(cacheType, a0Var);
                case 11:
                    return zv1.m.a(cacheType, a0Var);
                case 12:
                    return zv1.m.a(cacheType, a0Var);
                case 13:
                    return zv1.m.a(cacheType, a0Var);
                case 14:
                    int i18 = 0;
                    if (((a0Var == null || (sVar4 = a0Var.f557790f) == null) ? 0 : sVar4.f557910k) > 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 type = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.f35415x48086f0;
                        zv1.j0 j0Var2 = zv1.j0.f557844g;
                        java.util.List b17 = kz5.b0.b();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 cacheType3 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.f35412xe5e01d51;
                        zv1.j0 j0Var3 = zv1.j0.f557841d;
                        kz5.p0 p0Var2 = kz5.p0.f395529d;
                        if (a0Var != null && (sVar3 = a0Var.f557790f) != null) {
                            i17 = sVar3.f557908e;
                        }
                        zv1.l lVar2 = new zv1.l(i17);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheType3, "cacheType");
                        lz5.e eVar = (lz5.e) b17;
                        eVar.add(new zv1.q0(cacheType3, j0Var3, p0Var2, lVar2));
                        eVar.add(a(kVar, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.f35413xdc6a4a74, j0Var3, null, null, 12, null));
                        if (a0Var != null && (sVar2 = a0Var.f557790f) != null) {
                            i18 = sVar2.f557911l;
                        }
                        if (i18 > 0) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
                            eVar.add(a(kVar, type, zv1.j0.f557843f, null, null, 12, null));
                        }
                        return new zv1.m0(type, j0Var2, kz5.b0.a(b17));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 type2 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60.f35415x48086f0;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type2, "type");
                    return new zv1.f(type2);
                default:
                    return null;
            }
        }
    }
}
