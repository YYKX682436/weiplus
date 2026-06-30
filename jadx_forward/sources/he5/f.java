package he5;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f362456a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f362457b;

    /* renamed from: c, reason: collision with root package name */
    public final yb5.d f362458c;

    /* renamed from: d, reason: collision with root package name */
    public final he5.u f362459d;

    /* renamed from: e, reason: collision with root package name */
    public final je5.b f362460e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f362461f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f362462g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f362463h;

    public f(java.lang.String talkUsername, yz5.a deleteCreateTimeGetter, yb5.d chattingContext, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkUsername, "talkUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deleteCreateTimeGetter, "deleteCreateTimeGetter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        he5.u uVar = he5.u.f362515c;
        he5.u uVar2 = he5.u.f362515c;
        this.f362456a = talkUsername;
        this.f362457b = deleteCreateTimeGetter;
        this.f362458c = chattingContext;
        this.f362459d = uVar2;
        je5.b bVar = new je5.b();
        this.f362460e = bVar;
        if (lVar != null) {
            synchronized (bVar) {
                if (bVar.f380855b) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizContactMsgDataRepo", "MassSend listener already registered");
                } else {
                    bVar.f380855b = true;
                    bVar.f380854a = new je5.a(lVar);
                    sb5.f fVar = (sb5.f) chattingContext.f542241c.a(sb5.f.class);
                    yq1.t0 t0Var = bVar.f380854a;
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) fVar).getClass();
                    java.util.List list = yq1.u0.f546006r;
                    if (list != null && t0Var != null && !((java.util.ArrayList) list).contains(t0Var)) {
                        ((java.util.ArrayList) yq1.u0.f546006r).add(t0Var);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizContactMsgDataRepo", "MassSend listener registered successfully");
                }
            }
        }
        lr1.e.f402185b = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().p5(talkUsername);
        this.f362461f = new java.util.ArrayList();
    }

    public final long a() {
        return ((java.lang.Number) this.f362457b.mo152xb9724478()).longValue();
    }

    public final long b() {
        java.lang.Object m143895xf1229813;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.util.List list = this.f362461f;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) kz5.n0.a0(list, kz5.c0.h(list));
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f9Var != null ? java.lang.Long.valueOf(f9Var.T1()) : null);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Long l17 = (java.lang.Long) (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813) ? null : m143895xf1229813);
        return l17 != null ? l17.longValue() : com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
    }

    public final java.util.List c() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 D5;
        this.f362459d.getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f362461f;
        arrayList.clear();
        this.f362463h = false;
        long a17 = a();
        je5.b bVar = this.f362460e;
        bVar.getClass();
        java.lang.String talker = this.f362456a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        yb5.d chattingContext = this.f362458c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) chattingContext.f542241c.a(sb5.f.class))).getClass();
        long j17 = 0;
        if (yq1.u0.Ai().b1(talker, a17) == 0 && lr1.e.f402186c > 0 && (D5 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D5(talker, lr1.e.f402186c - 1)) != null) {
            j17 = D5.T1();
        }
        arrayList.addAll(bVar.e(talker, 16, a17, j17, chattingContext));
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new he5.a());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvvmMsgDataSource", "initData1: " + arrayList.size());
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:9|(2:11|(12:15|16|17|18|(1:20)(1:33)|21|22|(1:24)|25|(1:27)(1:31)|28|(1:30)))|36|16|17|18|(0)(0)|21|22|(0)|25|(0)(0)|28|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        r3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        r0 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092 A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:18:0x0088, B:20:0x0092, B:21:0x009c), top: B:17:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d(boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: he5.f.d(boolean, boolean):java.util.List");
    }
}
