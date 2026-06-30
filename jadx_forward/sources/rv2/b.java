package rv2;

/* loaded from: classes10.dex */
public final class b extends pv2.m {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f481907e;

    public b() {
        super("PostFileClearStage");
        this.f481907e = "LogPost.PostFileClearStage";
    }

    @Override // pv2.g
    public int a() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [kz5.p0] */
    @Override // pv2.m
    public pv2.g c() {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f481907e, "PostFileClearStage exec");
        mv2.q qVar = mv2.q.f413151a;
        if ((c01.id.a() - mv2.q.f413153c > com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.F()) || ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209421q1).mo141623x754a37bb()).r()).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "FinderFileTrack checkPostingFolder");
            mv2.q.f413153c = c01.id.a();
            try {
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183680p;
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(str, false);
                if (s17 != null) {
                    arrayList = new java.util.ArrayList(kz5.d0.q(s17, 10));
                    java.util.Iterator it = s17.iterator();
                    while (it.hasNext()) {
                        arrayList.add(str + ((com.p314xaae8f345.mm.vfs.x1) it.next()).f294765b);
                    }
                } else {
                    arrayList = null;
                }
                linkedHashSet.addAll(arrayList != null ? arrayList : kz5.p0.f395529d);
                java.util.Iterator it6 = ((java.util.ArrayList) mv2.q.f413154d).iterator();
                while (it6.hasNext()) {
                    mv2.n nVar = (mv2.n) it6.next();
                    java.util.List a17 = nVar.a();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : a17) {
                        java.lang.String str2 = (java.lang.String) obj;
                        if ((str2 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "")) ? false : true) {
                            arrayList2.add(obj);
                        }
                    }
                    java.util.Iterator it7 = arrayList2.iterator();
                    while (it7.hasNext()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "ownership, " + nVar.mo148464x337a8b() + " owns:" + ((java.lang.String) it7.next()));
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(linkedHashSet).removeAll(arrayList2);
                }
                java.util.Iterator it8 = linkedHashSet.iterator();
                while (it8.hasNext()) {
                    mv2.q.f413151a.m((java.lang.String) it8.next());
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LogPost.FinderPostFileManager", th6, "checkPostingFolder", new java.lang.Object[0]);
            }
        }
        return new rv2.a("PostFileClearStage");
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
    }
}
