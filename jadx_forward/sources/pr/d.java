package pr;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f439230a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f439231b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f439232c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f439233d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.e5 f439234e;

    public d(int i17, yz5.l lVar) {
        this.f439230a = i17;
        this.f439231b = lVar;
        this.f439234e = com.p314xaae8f345.mm.p2621x8fb0427b.d5.f275369a.a(i17);
    }

    public static final void a(pr.d dVar) {
        z85.b bVar;
        java.lang.Object obj;
        dVar.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.e5 e5Var = new com.p314xaae8f345.mm.p2621x8fb0427b.e5();
        int i17 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        int i18 = dVar.f439230a;
        e5Var.f275390a = i18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finish: ");
        sb6.append(i18);
        sb6.append(", ");
        java.util.LinkedList<java.lang.String> linkedList = dVar.f439233d;
        sb6.append(linkedList.size());
        sb6.append(", oldSize ");
        com.p314xaae8f345.mm.p2621x8fb0427b.e5 e5Var2 = dVar.f439234e;
        sb6.append(e5Var2.f275391b.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiDesignerTask", sb6.toString());
        boolean z17 = false;
        for (java.lang.String str : linkedList) {
            z85.a aVar = new z85.a();
            aVar.f68243x364361aa = i18;
            aVar.f68244x5bec8165 = str;
            aVar.f68245x8a0c25ad = 0;
            java.util.LinkedList linkedList2 = e5Var2.f275391b;
            if (!linkedList2.isEmpty()) {
                java.util.Iterator it = linkedList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((z85.a) obj).f68244x5bec8165, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                z85.a aVar2 = (z85.a) obj;
                if (aVar2 == null) {
                    aVar.f68245x8a0c25ad = i17;
                } else {
                    aVar.f68245x8a0c25ad = aVar2.f68245x8a0c25ad;
                    e5Var.f275391b.add(aVar);
                }
            }
            z17 = true;
            e5Var.f275391b.add(aVar);
        }
        if (z17) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n5 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f();
            synchronized (f17.f276696a) {
                bVar = f17.f276710o;
            }
            bVar.y0(e5Var);
            com.p314xaae8f345.mm.p2621x8fb0427b.d5.f275370b.put(java.lang.Integer.valueOf(i18), e5Var);
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5897xc57a522().e();
        }
        yz5.l lVar = dVar.f439231b;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
    }

    public final void b() {
        new gr.f(this.f439230a, this.f439232c, false, 4, null).l().K(new pr.c(this));
    }
}
