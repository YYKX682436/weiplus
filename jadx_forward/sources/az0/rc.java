package az0;

/* loaded from: classes5.dex */
public abstract class rc {
    public static final void a(java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, long j17) {
        if (j17 == -1) {
            j17 = java.lang.System.currentTimeMillis();
        }
        bz0.b bVar = bz0.b.f118257a;
        if (c4093x6b88526b == null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
            bVar.c(str, java.lang.System.currentTimeMillis() - j17, bz0.a.f118256b);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaasFuncUtils", str + " call error: " + c4093x6b88526b.f129708ec + ' ' + c4093x6b88526b.f16057x38eb0007, new java.lang.Throwable());
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
        bz0.b.b(bVar, str, c4093x6b88526b, java.lang.System.currentTimeMillis() - j17, 0, 8, null);
    }

    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.j b(java.lang.String funcName, yz5.p block, yz5.l onCancel, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(funcName, "funcName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onCancel, "onCancel");
        return p3325xe03a0797.p3326xc267989b.p3328x30012e.l.d(new az0.dc(block, funcName, z17, onCancel, null));
    }

    public static final java.util.Map c(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        f06.w wVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        java.lang.reflect.Field[] declaredFields = fVar.getClass().getDeclaredFields();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(declaredFields);
        for (java.lang.reflect.Field field : declaredFields) {
            field.setAccessible(true);
            java.lang.String name = field.getName();
            java.lang.Object obj = field.get(fVar);
            if (obj != null) {
                java.util.List a17 = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(field.getClass()).a();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((a17 == null || (wVar = (f06.w) kz5.n0.Z(a17)) == null) ? null : ((i06.w3) wVar).i(), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p2495xc50a8b8b.f.class))) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(name);
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = obj instanceof com.p314xaae8f345.mm.p2495xc50a8b8b.f ? (com.p314xaae8f345.mm.p2495xc50a8b8b.f) obj : null;
                    linkedHashMap.put(name, fVar2 != null ? c(fVar2) : null);
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(name);
            linkedHashMap.put(name, obj);
        }
        return linkedHashMap;
    }

    public static final java.lang.Object d(java.lang.String str, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b) lVar.mo146xb9724478(new az0.ic(nVar, str, currentTimeMillis));
        if (c4093x6b88526b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaasFuncUtils", str + " call error: " + c4093x6b88526b.f129708ec + ' ' + c4093x6b88526b.f16057x38eb0007, new java.lang.Throwable());
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
            bz0.b.b(bz0.b.f118257a, str, c4093x6b88526b, java.lang.System.currentTimeMillis() - currentTimeMillis, 0, 8, null);
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    public static final java.lang.Object e(java.lang.String str, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b) lVar.mo146xb9724478(new az0.jc(str, nVar, currentTimeMillis));
        if (c4093x6b88526b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaasFuncUtils", str + " call error: " + c4093x6b88526b.f129708ec + ' ' + c4093x6b88526b.f16057x38eb0007, new java.lang.Throwable());
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
            bz0.b.b(bz0.b.f118257a, str, c4093x6b88526b, java.lang.System.currentTimeMillis() - currentTimeMillis, 0, 8, null);
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    public static final java.lang.Object f(java.lang.String str, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b) lVar.mo146xb9724478(new az0.pc(str, nVar, currentTimeMillis));
        if (c4093x6b88526b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaasFuncUtils", str + " call error: " + c4093x6b88526b.f129708ec + ' ' + c4093x6b88526b.f16057x38eb0007, new java.lang.Throwable());
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
            bz0.b.b(bz0.b.f118257a, str, c4093x6b88526b, java.lang.System.currentTimeMillis() - currentTimeMillis, 0, 8, null);
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    public static final boolean g(java.lang.String funcName, int i17, yz5.a block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(funcName, "funcName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b) block.mo152xb9724478();
        bz0.b bVar = bz0.b.f118257a;
        if (c4093x6b88526b == null) {
            bVar.c(funcName, java.lang.System.currentTimeMillis() - currentTimeMillis, i17);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaasFuncUtils", funcName + " call error: " + c4093x6b88526b.f129708ec + ' ' + c4093x6b88526b.f16057x38eb0007, new java.lang.Throwable());
        bVar.a(funcName, c4093x6b88526b, java.lang.System.currentTimeMillis() - currentTimeMillis, i17);
        return false;
    }

    public static final java.lang.Object h(java.lang.String str, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Object mo146xb9724478 = lVar.mo146xb9724478(new az0.qc(str, nVar, currentTimeMillis));
        if (mo146xb9724478 != null) {
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = mo146xb9724478 instanceof com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b ? (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b) mo146xb9724478 : null;
            if (mo146xb9724478 instanceof com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2) {
                c4093x6b88526b = ((com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2) mo146xb9724478).f129637a;
            }
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b2 = c4093x6b88526b;
            if (c4093x6b88526b2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaasFuncUtils", str + " call error : " + c4093x6b88526b2.f129708ec + ' ' + c4093x6b88526b2.f16057x38eb0007, new java.lang.Throwable());
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
                bz0.b.b(bz0.b.f118257a, str, c4093x6b88526b2, java.lang.System.currentTimeMillis() - currentTimeMillis, 0, 8, null);
            }
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    public static void i(java.lang.String funcName, long j17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b, boolean z17, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b2 = (i18 & 4) != 0 ? null : c4093x6b88526b;
        boolean z18 = (i18 & 8) != 0 ? false : z17;
        int i19 = (i18 & 16) != 0 ? bz0.a.f118256b : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(funcName, "funcName");
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        bz0.b bVar = bz0.b.f118257a;
        if (z18) {
            bVar.e(100, funcName, "cancel", currentTimeMillis, i19);
        } else if (c4093x6b88526b2 == null) {
            bVar.c(funcName, currentTimeMillis, i19);
        } else {
            bVar.a(funcName, c4093x6b88526b2, currentTimeMillis, i19);
        }
    }

    public static final java.lang.String j(java.util.Map map, int i17) {
        java.lang.String valueOf;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i18 = 0; i18 < i17; i18++) {
            sb6.append(" ");
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb9, "toString(...)");
        return sb9;
    }
}
