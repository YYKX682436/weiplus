package d82;

/* loaded from: classes11.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final d82.j f308479a = new d82.j();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f308480b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.y0 f308481c = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));

    /* renamed from: d, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f308482d = p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.a(false, 1, null);

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(12:5|6|7|(1:(1:(11:11|12|13|14|15|(1:29)(1:19)|20|21|22|23|24)(2:34|35))(1:36))(2:59|(1:62)(1:61))|37|38|39|40|41|42|43|(1:46)(10:45|14|15|(1:17)|29|20|21|22|23|24)))|65|6|7|(0)(0)|37|38|39|40|41|42|43|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:11|(5:12|13|14|15|(1:29)(1:19))|20|21|22|23|24) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:(2:3|(12:5|6|7|(1:(1:(11:11|12|13|14|15|(1:29)(1:19)|20|21|22|23|24)(2:34|35))(1:36))(2:59|(1:62)(1:61))|37|38|39|40|41|42|43|(1:46)(10:45|14|15|(1:17)|29|20|21|22|23|24)))|37|38|39|40|41|42|43|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01ae, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01af, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Fav.NoteVideoCompressMgr", r0, "triggerUploadCheck: error", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x016a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x016f, code lost:
    
        r10 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0168, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c0, code lost:
    
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c2, code lost:
    
        r1.d(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c8, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x016c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016d, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /* JADX WARN: Type inference failed for: r0v27, types: [kotlinx.coroutines.sync.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(d82.j r19, d82.g r20, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r21) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d82.j.a(d82.j, d82.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final d82.e b(java.lang.String dataId, java.lang.String originalPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataId, "dataId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originalPath, "originalPath");
        boolean z17 = dataId.length() == 0;
        d82.c cVar = d82.c.f308457a;
        if (!z17) {
            if (!(originalPath.length() == 0)) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = f308480b;
                d82.g gVar = (d82.g) concurrentHashMap.get(dataId);
                d82.b bVar = d82.b.f308456a;
                if (gVar != null) {
                    int ordinal = gVar.f308466d.ordinal();
                    if (ordinal == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.NoteVideoCompressMgr", "compress: already compressing, dataId:".concat(dataId));
                        return bVar;
                    }
                    if (ordinal == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.NoteVideoCompressMgr", "compress: already completed, dataId:".concat(dataId));
                        return new d82.d(gVar.f308465c);
                    }
                    if (ordinal != 2) {
                        throw new jz5.j();
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.NoteVideoCompressMgr", "compress: already failed, dataId:".concat(dataId));
                    return cVar;
                }
                byte[] bytes = originalPath.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                java.lang.String str = o72.x1.H() + kk.k.g(bytes) + "_h264";
                d82.g gVar2 = new d82.g(dataId, originalPath, str, null, 8, null);
                d82.g gVar3 = (d82.g) concurrentHashMap.putIfAbsent(dataId, gVar2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.NoteVideoCompressMgr", "dumpTasks: total=" + concurrentHashMap.size());
                for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                    java.lang.String str2 = (java.lang.String) entry.getKey();
                    d82.g gVar4 = (d82.g) entry.getValue();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.NoteVideoCompressMgr", "  - dataId:" + str2 + ", state:" + gVar4.f308466d + ", originalPath:" + gVar4.f308464b);
                }
                if (gVar3 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.NoteVideoCompressMgr", "compress: another thread added task first, dataId:".concat(dataId));
                    int ordinal2 = gVar3.f308466d.ordinal();
                    if (ordinal2 == 0) {
                        return bVar;
                    }
                    if (ordinal2 == 1) {
                        return new d82.d(gVar3.f308465c);
                    }
                    if (ordinal2 == 2) {
                        return cVar;
                    }
                    throw new jz5.j();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.NoteVideoCompressMgr", "compress: created new task, dataId:" + dataId + ", originalPath:" + originalPath + ", outputPath:" + str);
                p3325xe03a0797.p3326xc267989b.l.d(f308481c, null, null, new d82.h(gVar2, null), 3, null);
                return bVar;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.NoteVideoCompressMgr", "compress: invalid params, dataId:" + dataId + ", originalPath:" + originalPath);
        return cVar;
    }

    public static final void c(java.lang.String dataId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataId, "dataId");
        d82.g gVar = (d82.g) f308480b.remove(dataId);
        if (gVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.NoteVideoCompressMgr", "removeTask: removed, dataId:" + dataId + ", state:" + gVar.f308466d);
        }
    }
}
