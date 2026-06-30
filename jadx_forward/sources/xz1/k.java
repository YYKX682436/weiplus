package xz1;

@j95.b
/* loaded from: classes15.dex */
public final class k extends i95.w implements qk.v6, xz1.a {

    /* renamed from: i, reason: collision with root package name */
    public static final xz1.d f539720i = new xz1.d(null);

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f539721m = jz5.h.b(xz1.b.f539708d);

    /* renamed from: n, reason: collision with root package name */
    public static final jz5.g f539722n = jz5.h.b(xz1.c.f539709d);

    /* renamed from: e, reason: collision with root package name */
    public boolean f539724e;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f539723d = jz5.h.b(xz1.i.f539718d);

    /* renamed from: f, reason: collision with root package name */
    public final xz1.n f539725f = new xz1.n();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f539726g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f539727h = new java.util.concurrent.ConcurrentHashMap();

    /* JADX WARN: Can't wrap try/catch for region: R(7:6|(5:8|9|10|11|(1:13)(3:39|40|(5:89|90|91|92|93)(4:42|43|44|(4:74|75|(1:77)(1:80)|78)(2:46|(8:48|49|50|51|52|53|54|(4:24|25|26|27)(1:32))(3:66|67|68)))))(1:109)|14|15|(2:18|16)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01f9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01fb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void wi(xz1.k r19, android.net.LocalSocket r20, yz1.d r21, java.io.OutputStream r22, yz1.h r23, yz1.i r24) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xz1.k.wi(xz1.k, android.net.LocalSocket, yz1.d, java.io.OutputStream, yz1.h, yz1.i):void");
    }

    public synchronized void Ai(qk.u6 attachable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attachable, "attachable");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add attachable: ");
        xz1.d dVar = f539720i;
        sb6.append(dVar.d(attachable));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DevTools.DevToolsService", sb6.toString());
        this.f539726g.put(dVar.d(attachable), attachable);
        if (!this.f539724e) {
            this.f539724e = true;
            ((ku5.t0) ku5.t0.f394148d).a(new xz1.j(this));
        }
    }

    public synchronized void Bi(qk.u6 attachable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attachable, "attachable");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DevTools.DevToolsService", "remove attachable: " + attachable.mo52338x337a8b());
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f539726g;
        xz1.d dVar = f539720i;
        concurrentHashMap.remove(dVar.d(attachable));
        yz1.q qVar = (yz1.q) this.f539727h.remove(dVar.d(attachable));
        if (qVar != null) {
            qVar.c(1000, "");
            qVar.b(1000, "");
        }
    }

    public synchronized void Di(qk.u6 attachable, java.lang.String msg) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attachable, "attachable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f539727h;
        xz1.d dVar = f539720i;
        yz1.q qVar = (yz1.q) concurrentHashMap.get(dVar.d(attachable));
        if (qVar != null) {
            int i17 = yz1.m.f550044a;
            try {
                byte[] bytes = msg.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                qVar.a(yz1.b.a((byte) 1, bytes, bytes.length));
                f0Var = jz5.f0.f384359a;
            } catch (java.io.UnsupportedEncodingException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DevTools.DevToolsService", "sendInspectorMsg failed, " + dVar.d(attachable));
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f539724e = false;
        m176178x41012807();
    }

    /* renamed from: release */
    public final synchronized void m176178x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DevTools.DevToolsService", "release");
        java.util.Collection<yz1.q> values = this.f539727h.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        for (yz1.q qVar : values) {
            qVar.c(1011, "");
            qVar.b(1011, "");
        }
        this.f539727h.clear();
        this.f539726g.clear();
    }
}
