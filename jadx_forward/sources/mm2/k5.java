package mm2;

/* loaded from: classes10.dex */
public final class k5 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f410730f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f410731g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f410730f = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 1, null, 5, null);
        this.f410731g = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null);
    }

    public final java.lang.Object N6(r45.yx1 yx1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        r45.cy1 cy1Var;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        r45.zr5 zr5Var = r45.zr5.ResourceInfoType_AccPlayURL;
        zy.w wi6 = ((bz.f) ((zy.u) i95.n0.c(zy.u.class))).wi(zy.x.f558837f);
        java.lang.String c17 = mm2.o5.c(wi6, yx1Var, zr5Var);
        if (c17 == null) {
            return mm2.o5.a(wi6, yx1Var, zr5Var, mm2.m5.f410771d, interfaceC29045xdcb5ca57);
        }
        r45.by1 by1Var = yx1Var.f472999o;
        java.lang.String str = null;
        if (by1Var != null && (cy1Var = by1Var.f452677e) != null && (linkedList = cy1Var.f453453d) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.ec6) obj).f454805d == 4) {
                    break;
                }
            }
            r45.ec6 ec6Var = (r45.ec6) obj;
            if (ec6Var != null && (gVar = ec6Var.f454806e) != null) {
                str = gVar.i();
            }
        }
        if (str == null) {
            str = "";
        }
        return new zy.a(true, c17, "", "", null, str);
    }

    public final java.lang.Object O6(r45.yx1 yx1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        r45.cy1 cy1Var;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        r45.zr5 zr5Var = r45.zr5.ResourceInfoType_SongPlayURL;
        zy.w wi6 = ((bz.f) ((zy.u) i95.n0.c(zy.u.class))).wi(zy.x.f558837f);
        java.lang.String c17 = mm2.o5.c(wi6, yx1Var, zr5Var);
        if (c17 == null) {
            return mm2.o5.a(wi6, yx1Var, zr5Var, mm2.m5.f410771d, interfaceC29045xdcb5ca57);
        }
        r45.by1 by1Var = yx1Var.f472999o;
        java.lang.String str = null;
        if (by1Var != null && (cy1Var = by1Var.f452677e) != null && (linkedList = cy1Var.f453453d) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.ec6) obj).f454805d == 3) {
                    break;
                }
            }
            r45.ec6 ec6Var = (r45.ec6) obj;
            if (ec6Var != null && (gVar = ec6Var.f454806e) != null) {
                str = gVar.i();
            }
        }
        if (str == null) {
            str = "";
        }
        return new zy.a(true, c17, "", "", null, str);
    }
}
