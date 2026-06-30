package qx3;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final qx3.b f448874a = new qx3.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f448875b = java.util.Collections.synchronizedMap(new java.util.HashMap());

    public static final vx3.i a(long j17) {
        vx3.i iVar;
        java.util.Map cacheFriendRingtoneItem = f448875b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cacheFriendRingtoneItem, "cacheFriendRingtoneItem");
        synchronized (cacheFriendRingtoneItem) {
            iVar = (vx3.i) cacheFriendRingtoneItem.get(java.lang.Long.valueOf(j17));
        }
        return iVar;
    }

    public static final void d(long j17, vx3.i info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.Map cacheFriendRingtoneItem = f448875b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cacheFriendRingtoneItem, "cacheFriendRingtoneItem");
        synchronized (cacheFriendRingtoneItem) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cacheFriendRingtoneItem, "cacheFriendRingtoneItem");
            cacheFriendRingtoneItem.put(java.lang.Long.valueOf(j17), info);
        }
        if (info.j()) {
            qx3.d.c(info.f522831o, info);
        }
    }

    public final java.lang.Object b(long j17, vx3.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        if (iVar == null) {
            return iVar;
        }
        t45.n0 n0Var = iVar.f522822f;
        if (!(n0Var != null && n0Var.f497148d == 2)) {
            if (n0Var != null && n0Var.f497148d == 1) {
                return iVar;
            }
            return null;
        }
        if (iVar.f522820d != null) {
            return iVar;
        }
        java.lang.Object c17 = f448874a.c(j17, iVar, interfaceC29045xdcb5ca57);
        return c17 == pz5.a.f440719d ? c17 : (vx3.i) c17;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r27, vx3.i r29, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r30) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qx3.b.c(long, vx3.i, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
