package mm2;

/* loaded from: classes10.dex */
public abstract class o5 {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(zy.w r33, r45.yx1 r34, r45.zr5 r35, yz5.p r36, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r37) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.o5.a(zy.w, r45.yx1, r45.zr5, yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean b(zy.w wVar, r45.yx1 songInfo, r45.zr5 type) {
        r45.cy1 cy1Var;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        java.lang.String d17 = d(songInfo, type);
        r45.by1 by1Var = songInfo.f472999o;
        java.lang.String str = null;
        if (by1Var != null && (cy1Var = by1Var.f452677e) != null && (linkedList = cy1Var.f453453d) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.ec6) obj).f454805d == type.f473871d) {
                    break;
                }
            }
            r45.ec6 ec6Var = (r45.ec6) obj;
            if (ec6Var != null && (gVar = ec6Var.f454806e) != null) {
                str = gVar.i();
            }
        }
        return ((bz.a) wVar).f(str, d17);
    }

    public static final java.lang.String c(zy.w wVar, r45.yx1 songInfo, r45.zr5 type) {
        r45.cy1 cy1Var;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        java.lang.String str = null;
        if (!b(wVar, songInfo, type)) {
            return null;
        }
        java.lang.String d17 = d(songInfo, type);
        r45.by1 by1Var = songInfo.f472999o;
        if (by1Var != null && (cy1Var = by1Var.f452677e) != null && (linkedList = cy1Var.f453453d) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.ec6) obj).f454805d == type.f473871d) {
                    break;
                }
            }
            r45.ec6 ec6Var = (r45.ec6) obj;
            if (ec6Var != null && (gVar = ec6Var.f454806e) != null) {
                str = gVar.i();
            }
        }
        return ((bz.a) wVar).c(str, d17);
    }

    public static final java.lang.String d(r45.yx1 yx1Var, r45.zr5 resourceType) {
        r45.cy1 cy1Var;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yx1Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resourceType, "resourceType");
        r45.by1 by1Var = yx1Var.f472999o;
        if (by1Var == null || (cy1Var = by1Var.f452677e) == null || (linkedList = cy1Var.f453453d) == null) {
            return "";
        }
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.ec6) obj).f454805d == resourceType.f473871d) {
                break;
            }
        }
        r45.ec6 ec6Var = (r45.ec6) obj;
        if (ec6Var == null) {
            return "";
        }
        return yx1Var.f472991d + '_' + ec6Var.f454805d + '_' + ec6Var.f454809h;
    }
}
