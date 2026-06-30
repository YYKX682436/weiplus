package u22;

/* loaded from: classes10.dex */
public final class r {

    /* renamed from: p, reason: collision with root package name */
    public static final u22.l f505539p = new u22.l(null);

    /* renamed from: q, reason: collision with root package name */
    public static final r45.p64 f505540q = new r45.p64();

    /* renamed from: r, reason: collision with root package name */
    public static final r45.p64 f505541r = new r45.p64();

    /* renamed from: s, reason: collision with root package name */
    public static final r45.p64 f505542s = new r45.p64();

    /* renamed from: t, reason: collision with root package name */
    public static final r45.p64 f505543t = new r45.p64();

    /* renamed from: u, reason: collision with root package name */
    public static final r45.p64 f505544u = new r45.p64();

    /* renamed from: v, reason: collision with root package name */
    public static final r45.p64 f505545v = new r45.p64();

    /* renamed from: a, reason: collision with root package name */
    public final im5.b f505546a;

    /* renamed from: b, reason: collision with root package name */
    public final u22.d f505547b;

    /* renamed from: c, reason: collision with root package name */
    public final int f505548c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f505549d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f505550e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f505551f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f505552g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f505553h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f505554i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f505555j;

    /* renamed from: k, reason: collision with root package name */
    public int f505556k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedList f505557l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f505558m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f505559n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f505560o;

    public r(im5.b lifeCycleKeeper, u22.d callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifeCycleKeeper, "lifeCycleKeeper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f505546a = lifeCycleKeeper;
        this.f505547b = callback;
        this.f505548c = 2;
        this.f505550e = true;
        this.f505552g = true;
        this.f505556k = 1;
        this.f505557l = new java.util.LinkedList();
        this.f505558m = new java.util.LinkedList();
        this.f505559n = new java.util.LinkedList();
        this.f505560o = new java.util.LinkedList();
    }

    public final void a(r45.p64 info) {
        java.lang.Object obj;
        java.lang.Object obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.Iterator it = this.f505557l.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.p64) obj2).f464325d, info.f464325d)) {
                    break;
                }
            }
        }
        r45.p64 p64Var = (r45.p64) obj2;
        java.util.LinkedList linkedList = this.f505558m;
        java.util.Iterator it6 = linkedList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.p64) next).f464325d, info.f464325d)) {
                obj = next;
                break;
            }
        }
        r45.p64 p64Var2 = (r45.p64) obj;
        if (p64Var != null) {
            if (p64Var2 == null) {
                linkedList.add(p64Var);
            }
        } else if (p64Var2 == null) {
            java.lang.String str = info.f464325d;
            if (str == null || f505539p.a(info)) {
                linkedList.add(info);
            } else {
                u22.m mVar = new u22.m(this);
                boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
                im5.b bVar = this.f505546a;
                if (n17) {
                    new x85.f(bVar, str, mVar);
                } else {
                    new x85.i(bVar, str, mVar);
                }
            }
        }
        d();
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StickerPanelData", "loadMore: " + this.f505551f + ", " + this.f505550e);
        if (!this.f505550e || this.f505551f) {
            return;
        }
        this.f505551f = true;
        int i17 = this.f505556k;
        byte[] bArr = this.f505549d;
        byte[] bArr2 = this.f505555j;
        im5.b bVar = this.f505546a;
        u22.o oVar = new u22.o(this);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            new x85.n(i17, bArr, bArr2, bVar, oVar);
            return;
        }
        pq5.g l17 = new x85.b(i17, bArr, bArr2).l();
        l17.H(new x85.l(oVar));
        if (bVar != null) {
            l17.f(bVar);
        }
    }

    public final void c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("processMore: ");
        java.util.LinkedList linkedList = this.f505559n;
        sb6.append(linkedList.size());
        sb6.append(", ");
        java.util.LinkedList linkedList2 = this.f505560o;
        sb6.append(linkedList2.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StickerPanelData", sb6.toString());
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        int i17 = 0;
        if (linkedList.size() > 0) {
            linkedList3.add(new t85.d(f505543t, 0, 0, 6, null));
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            int i18 = 0;
            for (java.lang.Object obj : linkedList) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                arrayList.add(new t85.d((r45.p64) obj, i19, 2));
                i18 = i19;
            }
            linkedList3.addAll(arrayList);
            linkedList3.add(new t85.d(f505544u, 0, 0, 6, null));
        }
        if (linkedList2.size() > 0) {
            linkedList3.add(new t85.d(f505545v, 0, 0, 6, null));
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
            for (java.lang.Object obj2 : linkedList2) {
                int i27 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                arrayList2.add(new t85.d((r45.p64) obj2, i27, 3));
                i17 = i27;
            }
            linkedList3.addAll(arrayList2);
        }
        u22.k kVar = (u22.k) this.f505547b;
        kVar.getClass();
        pm0.v.L("StickerPanelCallbackWrapper_onMore", true, new u22.g(kVar, linkedList3));
    }

    public final void d() {
        pm0.v.X(new u22.q(this));
    }

    public final void e() {
        java.util.LinkedList linkedList = this.f505559n;
        linkedList.clear();
        v85.e eVar = v85.e.f515636a;
        java.util.LinkedList lensInfoList = v85.e.f515641f.f465243d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lensInfoList, "lensInfoList");
        linkedList.addAll(lensInfoList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StickerPanelData", "updateHistory: " + linkedList.size());
        c();
    }
}
