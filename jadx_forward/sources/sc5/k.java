package sc5;

/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final sc5.k f488122a = new sc5.k();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f488123b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.LinkedHashMap f488124c;

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2495xc50a8b8b.g f488125d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.List f488126e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f488127f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f488128g;

    static {
        gm0.b bVar = gm0.j1.b().f354778h;
        f488123b = bVar != null ? bVar.f354678e : null;
        f488124c = new java.util.LinkedHashMap();
        f488126e = new java.util.ArrayList();
        f488127f = new java.util.ArrayList();
        f488128g = new java.util.ArrayList();
    }

    public static final void a(sc5.k kVar, java.util.List list) {
        kVar.getClass();
        java.util.LinkedHashMap linkedHashMap = f488124c;
        linkedHashMap.clear();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.w43 w43Var = (r45.w43) it.next();
            java.lang.String cliMsgId = w43Var.f470405d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cliMsgId, "cliMsgId");
            linkedHashMap.put(java.lang.Long.valueOf(java.lang.Long.parseLong(cliMsgId)), w43Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiSendToWeWorkHelper", "MessageCache initialized. Cached " + list.size() + " messages");
    }

    public final void b(r45.w43 w43Var) {
        if (w43Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiSendToWeWorkHelper", "Rejected null message in addPendingMessage");
            return;
        }
        if (!c(w43Var)) {
            ((java.util.ArrayList) f488126e).add(w43Var);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiSendToWeWorkHelper", "Message[" + w43Var.f470405d + "] already in pending list");
    }

    public final boolean c(r45.w43 w43Var) {
        if (w43Var == null) {
            return false;
        }
        java.util.List list = f488126e;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.w43) it.next()).f470405d, w43Var.f470405d)) {
                return true;
            }
        }
        return false;
    }

    public final r45.w43 d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        r45.w43 w43Var = new r45.w43();
        w43Var.f470405d = java.lang.String.valueOf(f9Var.I0());
        w43Var.f470406e = 49;
        java.lang.String j17 = f9Var.j();
        if (j17 != null) {
            java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(forName, "forName(...)");
            byte[] bytes = j17.getBytes(forName);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            w43Var.f470407f = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length);
        }
        return w43Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x012a, code lost:
    
        if (r1 == null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(r45.gp0 r9) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc5.k.e(r45.gp0):void");
    }
}
