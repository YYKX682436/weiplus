package mo3;

/* loaded from: classes9.dex */
public class l implements vg3.z4 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f411952d = new java.util.ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f411953a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f411954b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f411955c;

    public l(boolean z17) {
        this.f411953a = false;
        this.f411954b = false;
        this.f411955c = new java.util.LinkedList();
        this.f411953a = z17;
        this.f411954b = false;
        this.f411955c = new java.util.LinkedList();
    }

    @Override // vg3.z4
    public void a() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(this.f411955c);
        ((java.util.LinkedList) this.f411955c).clear();
        if (linkedList.size() == 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = f411952d;
        synchronized (list) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                arrayList.add((c01.v8) it.next());
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            c01.v8 v8Var = (c01.v8) it6.next();
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(v8Var.mo13945x23b2dd47()).mo50293x3498a0(new mo3.j(this, v8Var, linkedList));
        }
    }

    @Override // vg3.z4
    public void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, r45.j4 j4Var) {
        java.lang.String str;
        mm.w.e("newMsgSync");
        if (this.f411953a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncMessageNotifier", "mDummy is true, do nothing and return.");
            mm.w.f("dummy");
            return;
        }
        java.util.List list = f411952d;
        synchronized (list) {
            if (((java.util.ArrayList) list).isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncMessageNotifier", "no notifiers, ignore");
                mm.w.f("noNotifier");
                return;
            }
            if (f9Var.A0() != 0 || f9Var.P0() == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncMessageNotifier", "not new msg, ignore");
                mm.w.f("notNewMsg");
                return;
            }
            java.lang.String g17 = x51.j1.g(j4Var.f459091e);
            xg3.r0 hj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj();
            int indexOf = g17.indexOf("@");
            if (indexOf >= 0) {
                g17.substring(0, indexOf);
                str = g17.substring(indexOf);
            } else {
                str = "";
            }
            if (str == null) {
                str = "";
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.ja m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ka) hj6).m0(str);
            if (m07 != null) {
                if (!((m07.f276593d & 2) != 0)) {
                    mm.w.f("roleMute");
                    return;
                }
            }
            if (this.f411954b) {
                ((java.util.LinkedList) this.f411955c).add(f9Var);
                return;
            }
            this.f411954b = true;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            synchronized (list) {
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    arrayList.add((c01.v8) it.next());
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                c01.v8 v8Var = (c01.v8) it6.next();
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(v8Var.mo13945x23b2dd47()).mo50293x3498a0(new mo3.k(this, j4Var, v8Var, f9Var));
            }
        }
    }
}
