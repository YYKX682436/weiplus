package e33;

/* loaded from: classes10.dex */
public class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e33.v1 f329015a;

    public u1(e33.v1 v1Var) {
        this.f329015a = v1Var;
    }

    public void a(java.util.List list, boolean z17) {
        boolean z18;
        e33.b0 b0Var;
        e33.v1 v1Var = this.f329015a;
        java.lang.ref.WeakReference weakReference = v1Var.f329028e;
        if (weakReference != null && (b0Var = (e33.b0) weakReference.get()) != null) {
            if (z17 || b0Var.I() > list.size()) {
                e33.v1.a(v1Var, list);
            } else {
                e33.v1.a(v1Var, list.subList(b0Var.I(), list.size()));
            }
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        e33.t1 t1Var = v1Var.f329031h;
        int i17 = t1Var != null ? t1Var.f329003d : 3;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            t23.l2 l2Var = (t23.l2) it.next();
            if (l2Var.f496736c.contains("image")) {
                if (i17 != 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.b(1, l2Var.f496734a, l2Var.f496735b, "", l2Var.f496736c);
                    b17.f219968m = l2Var.f496737d;
                    linkedList.add(b17);
                    arrayList.add(java.lang.Long.valueOf(l2Var.f496734a));
                }
            } else if (l2Var.f496736c.contains("video") && i17 != 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.b(2, l2Var.f496734a, l2Var.f496735b, "", l2Var.f496736c);
                b18.f219968m = l2Var.f496737d;
                linkedList.add(b18);
            }
        }
        e33.t1 t1Var2 = v1Var.f329031h;
        if (t1Var2 != null && t1Var2.f329000a && !arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("QuerySmartGalleryAlbumMediaTask", "switch to smart folder to query live photo size: %d livePhotoOnly: %b", java.lang.Integer.valueOf(arrayList.size()), java.lang.Boolean.valueOf(v1Var.f329031h.f329002c));
            java.util.HashMap Bi = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).Bi(arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ref.WeakReference weakReference2 = v1Var.f329028e;
            if (weakReference2 != null) {
                arrayList2 = ((e33.b0) weakReference2.get()).f328664g;
            }
            java.util.ListIterator listIterator = linkedList.listIterator();
            while (listIterator.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) listIterator.next();
                if (abstractC15633xee433078.mo63659xfb85f7b0() == 1) {
                    if (Bi.containsKey(java.lang.Long.valueOf(abstractC15633xee433078.f219967i)) && java.lang.Boolean.TRUE.equals(Bi.get(java.lang.Long.valueOf(abstractC15633xee433078.f219967i)))) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("QuerySmartGalleryAlbumMediaTask", "QuerySmartGalleryAlbumMediaTask %d is LivePhoto currentListSize: %d", java.lang.Long.valueOf(abstractC15633xee433078.f219967i), java.lang.Integer.valueOf(arrayList2.size()));
                        java.util.Iterator it6 = arrayList2.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                z18 = false;
                                break;
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee4330782 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it6.next();
                            long j17 = abstractC15633xee4330782.f219967i;
                            if (j17 == abstractC15633xee433078.f219967i) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("QuerySmartGalleryAlbumMediaTask", "QuerySmartGalleryAlbumMediaTask switch folder, livePhoto is exist >> %d", java.lang.Long.valueOf(j17));
                                listIterator.set(abstractC15633xee4330782);
                                z18 = true;
                                break;
                            }
                        }
                        if (!z18) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.a(6, abstractC15633xee433078.f219967i);
                            a17.f219968m = abstractC15633xee433078.f219968m;
                            qk.s7 s7Var = (qk.s7) i95.n0.c(qk.s7.class);
                            a17.f219963e = ((hs.x) s7Var).wi(qk.k9.f445740d, abstractC15633xee433078.f219967i + "");
                            a17.f219966h = abstractC15633xee433078.f219963e;
                            a17.f219971p = abstractC15633xee433078.f219971p;
                            if (a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0) a17;
                                e33.t1 t1Var3 = v1Var.f329031h;
                                c15632xfc4fd0d0.I = (t1Var3 == null || !t1Var3.f329001b) ? 0 : 1;
                            }
                            listIterator.set(a17);
                        }
                    } else if (v1Var.f329031h.f329002c) {
                        listIterator.remove();
                    }
                }
            }
        }
        e33.s1 s1Var = new e33.s1(null);
        s1Var.f328987d = v1Var.f329028e;
        s1Var.f328988e = v1Var.f329029f;
        s1Var.f328991h = linkedList;
        s1Var.f328990g = v1Var.f329030g;
        s1Var.f328994n = z17;
        t23.p0.n().c(s1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("QuerySmartGalleryAlbumMediaTask", "finish page query.");
    }
}
