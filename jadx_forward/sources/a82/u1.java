package a82;

@j95.b
/* loaded from: classes11.dex */
public final class u1 extends i95.w implements o72.r4 {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f83710d = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f83711e = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f83712f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f83713g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f83714h = p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.a(false, 1, null);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f83715i = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static final boolean Ai(a82.u1 u1Var, java.lang.String str, long j17) {
        u1Var.getClass();
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return j17 <= 0 || com.p314xaae8f345.mm.vfs.w6.k(str) == j17;
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:61|(1:63)(1:85)|64|65|66|(1:68)(1:81)|69) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017d, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r11, "note download new protocol serialize error: " + r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01f0 -> B:11:0x01f4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object wi(a82.u1 r26, a82.k1 r27, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r28) {
        /*
            Method dump skipped, instructions count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a82.u1.wi(a82.u1, a82.k1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public java.lang.Object Bi(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, o72.o4 o4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new a82.p1(str4, j17, i17, str5, this, str, str2, str3, o4Var, null), interfaceC29045xdcb5ca57);
    }

    public void Di(long j17, java.lang.String md52, java.lang.String cdnUrl, java.lang.String cdnKey, int i17, java.lang.String targetLocalPath, java.lang.String htmlId, o72.o4 o4Var, o72.n4 n4Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnUrl, "cdnUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnKey, "cdnKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetLocalPath, "targetLocalPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(htmlId, "htmlId");
        p3325xe03a0797.p3326xc267989b.l.d(this.f83710d, null, null, new a82.q1(this, j17, md52, cdnUrl, cdnKey, i17, targetLocalPath, htmlId, o4Var, n4Var, null), 3, null);
    }

    public final void Ni(java.lang.String str, o72.p4 p4Var) {
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) this.f83713g.remove(str);
        if (interfaceC29045xdcb5ca57 != null) {
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p4Var));
        }
    }

    public void Ri(java.lang.String targetLocalPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetLocalPath, "targetLocalPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavPublicCdnDownloadService", "stop task: ".concat(targetLocalPath));
        if (this.f83711e.removeIf(new a82.t1(targetLocalPath))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavPublicCdnDownloadService", "removed pending task: ".concat(targetLocalPath));
            Ni(targetLocalPath, new o72.p4(-1, "Task cancelled", targetLocalPath));
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f83712f;
        a82.k1 k1Var = (a82.k1) concurrentHashMap.get(targetLocalPath);
        if (k1Var != null) {
            k1Var.f83595l = true;
            ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ai(java.lang.String.valueOf(k1Var.f83589f.hashCode()));
            com.p314xaae8f345.mm.vfs.w6.h(k1Var.f83590g);
            com.p314xaae8f345.mm.vfs.w6.h(targetLocalPath);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavPublicCdnDownloadService", "cancelled downloading task and deleted files: ".concat(targetLocalPath));
            concurrentHashMap.remove(targetLocalPath);
            Ni(targetLocalPath, new o72.p4(-1, "Task cancelled", targetLocalPath));
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavPublicCdnDownloadService", "stopAll");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f83711e;
            if (!(!concurrentLinkedQueue.isEmpty())) {
                break;
            }
            a82.k1 k1Var = (a82.k1) concurrentLinkedQueue.poll();
            if (k1Var != null) {
                arrayList.add(k1Var.f83589f);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            Ni(str, new o72.p4(-1, "All tasks cancelled", str));
        }
        java.util.Set keySet = this.f83712f.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
        for (java.lang.String str2 : kz5.n0.S0(keySet)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            Ri(str2);
        }
        p3325xe03a0797.p3326xc267989b.z0.e(this.f83710d, null, 1, null);
    }
}
