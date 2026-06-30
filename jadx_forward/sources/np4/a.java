package np4;

/* loaded from: classes10.dex */
public abstract class a {
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 a(rm5.v videoComposition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoComposition, "videoComposition");
        java.lang.System.currentTimeMillis();
        java.util.ArrayList<rm5.j> arrayList = videoComposition.f479117l;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (rm5.j jVar : arrayList) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1(jVar.f479032a, jVar.f479033b, 0);
            i1Var.e(jVar.f479035d);
            i1Var.a(jVar.f479036e);
            i1Var.d(jVar.f479037f);
            i1Var.c(jVar.f479038g);
            i1Var.b(jVar.f479039h);
            rm5.j jVar2 = i1Var.f257160l;
            jVar2.f479045n.set(jVar.f479045n);
            jVar2.f479046o.set(jVar.f479046o);
            java.lang.System.currentTimeMillis();
            arrayList2.add(i1Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1(arrayList2);
        java.util.ArrayList arrayList3 = h1Var.f257130c;
        if (!arrayList3.isEmpty()) {
            java.lang.System.currentTimeMillis();
            java.util.Iterator it = arrayList3.iterator();
            long j17 = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var2 = null;
            long j18 = 0;
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it.next();
                rm5.j jVar3 = i1Var3.f257160l;
                long j19 = ((float) (jVar3.f479038g - jVar3.f479037f)) / jVar3.f479039h;
                boolean a17 = jVar3.f479048q.a();
                rm5.j jVar4 = i1Var3.f257160l;
                long min = java.lang.Math.min(a17 ? jVar4.f479048q.f479064c : 0L, java.lang.Math.min(j17, j19));
                rm5.j jVar5 = i1Var2 != null ? i1Var2.f257160l : null;
                if (jVar5 != null) {
                    jVar5.f479050s = j18 - (min / 2);
                }
                jVar4.f479049r = j18 - (min / 2);
                i1Var3.e(j18 - min);
                i1Var3.a(jVar4.f479035d + j19);
                j18 = jVar4.f479036e;
                j17 = j19;
                i1Var2 = i1Var3;
            }
            rm5.j jVar6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) kz5.n0.i0(arrayList3)).f257160l;
            jVar6.f479050s = jVar6.f479036e;
            java.lang.System.currentTimeMillis();
        }
        java.lang.System.currentTimeMillis();
        java.lang.System.currentTimeMillis();
        return h1Var;
    }
}
