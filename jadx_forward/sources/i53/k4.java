package i53;

/* loaded from: classes8.dex */
public final class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f370170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f370171e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i53.l4 f370172f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f370173g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f370174h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m33.i1 f370175i;

    public k4(java.util.List list, java.lang.String str, i53.l4 l4Var, java.util.ArrayList arrayList, int i17, m33.i1 i1Var) {
        this.f370170d = list;
        this.f370171e = str;
        this.f370172f = l4Var;
        this.f370173g = arrayList;
        this.f370174h = i17;
        this.f370175i = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i53.l4 l4Var;
        java.util.ArrayList<p43.a> arrayList;
        java.lang.String j17 = gm0.j1.b().j();
        p43.b Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Bi();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j17);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) ((p43.d) Bi).J0(j17);
        int size = arrayList2.size();
        java.util.Iterator it = this.f370170d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            l4Var = this.f370172f;
            arrayList = this.f370173g;
            if (!hasNext) {
                break;
            }
            m33.k1 k1Var = (m33.k1) it.next();
            if (com.p314xaae8f345.mm.vfs.w6.j(k1Var.f404838c)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(this.f370171e);
                java.lang.String str = java.io.File.separator;
                sb6.append(str);
                java.lang.String sb7 = sb6.toString();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k1Var.f404836a)) {
                    sb7 = sb7 + k1Var.f404836a + str;
                }
                p43.a a17 = l4Var.a(k1Var, sb7, j17);
                if (a17 != null) {
                    arrayList.add(a17);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MiniGameVideoProcessor", "gamelog.saveToGameCenterLocal, GameExternalService, file not exist path= " + k1Var.f404838c);
            }
        }
        int size2 = arrayList.size() + size;
        int i17 = this.f370174h;
        if (size2 > i17) {
            java.util.List subList = arrayList2.subList(0, (size + arrayList.size()) - i17);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(subList, 10));
            java.util.Iterator it6 = subList.iterator();
            while (it6.hasNext()) {
                arrayList3.add(((p43.a) it6.next()).f67902xf9dbbe9c);
            }
            ((p43.d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Bi()).z0(arrayList3);
        }
        ((p43.d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Bi()).D0(arrayList);
        l4Var.b(arrayList, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiniGameVideoProcessor", "gamelog.saveToGameCenterLocal, GameExternalService, after insert count  = " + ((java.util.ArrayList) ((p43.d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Bi()).J0(j17)).size());
        m33.i1 i1Var = this.f370175i;
        if (i1Var != null) {
            i1Var.mo74226xe05b4124();
        }
        for (p43.a aVar : arrayList) {
            n53.b.c(new lj0.b(aVar.f67895x28d45f97, 0L, 1L, 3, 3, 0, 0, 0, aVar.f67901x6985322e, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.j.f34051x366c91de, null));
        }
    }
}
