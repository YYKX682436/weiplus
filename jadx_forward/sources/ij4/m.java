package ij4;

/* loaded from: classes11.dex */
public final class m {
    public m(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.util.List a(android.content.Context context, java.util.List list) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        boolean z18 = true;
        while (it.hasNext()) {
            nj4.i iVar = (nj4.i) it.next();
            if (iVar instanceof nj4.e) {
                nj4.e eVar = (nj4.e) iVar;
                nj4.d dVar = new nj4.d(eVar);
                if (z18) {
                    dVar.f419467e = true;
                    z18 = false;
                }
                arrayList.add(dVar);
                java.lang.String str = dVar.f419469d.f86667a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                java.lang.Boolean bool = (java.lang.Boolean) ((java.util.HashMap) ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.mg) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.mg.class)).f255640d).get(str);
                boolean booleanValue = bool != null ? bool.booleanValue() : true;
                int a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.l0.f254839g.a(context);
                int size = ((eVar.f419469d.f86668b.size() + a17) - 1) / a17;
                if (size <= 4 || !booleanValue) {
                    z17 = false;
                } else {
                    z17 = true;
                    size = 4;
                }
                for (int i17 = 0; i17 < size; i17++) {
                    int i18 = i17 * a17;
                    int i19 = i18 + a17;
                    if (i19 > eVar.f419469d.f86668b.size()) {
                        i19 = eVar.f419469d.f86668b.size();
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(eVar.f419469d.f86668b.subList(i18, i19));
                    if (z17 && i17 == size - 1) {
                        mj4.h hVar = (mj4.h) arrayList2.get(arrayList2.size() - 1);
                        int size2 = arrayList2.size() - 1;
                        mj4.k kVar = (mj4.k) hVar;
                        kVar.getClass();
                        mj4.j jVar = new mj4.j(kVar);
                        jVar.h("arrow@name");
                        arrayList2.set(size2, jVar.a());
                    }
                    ai4.e eVar2 = new ai4.e(eVar.f419469d.f86667a, arrayList2);
                    arrayList.add(new nj4.c(eVar2, eVar2.f86668b.size(), dVar));
                }
            } else {
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:11|(1:13)(1:191)|14|(3:16|(1:18)(2:(2:181|(1:183))|184)|(3:20|(2:22|(3:24|(2:26|(6:28|(1:30)(1:133)|31|(1:33)(1:132)|34|(2:36|(1:38))(2:130|131))(1:134))(1:135)|39)(2:136|(2:138|(2:140|(2:142|(1:144))(2:145|146))(2:147|(2:149|(2:153|(2:155|(2:157|(1:159))(2:160|161))(2:162|(4:164|(1:166)(1:176)|167|(1:(2:171|(1:173))(2:174|175)))(2:177|178))))))))(1:179)|40))|185|186|187|(0)(0)|40) */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x010e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x010f, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.OtherTopicFriendDataSource", "get self data " + r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0122  */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(android.content.Context r25) {
        /*
            Method dump skipped, instructions count: 1299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ij4.m.b(android.content.Context):java.util.List");
    }

    public final java.util.List c(java.util.List list, boolean z17) {
        if (!bi4.v1.i()) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            mj4.h hVar = (mj4.h) list.get(i17);
            if (i17 == 0 && z17) {
                arrayList.add(hVar);
            } else {
                mj4.k kVar = (mj4.k) hVar;
                if (kVar.z()) {
                    arrayList2.add(kVar);
                } else {
                    arrayList3.add(kVar);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.OtherTopicFriendDataSource", "beforeSort [readList] = " + arrayList2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.OtherTopicFriendDataSource", "beforeSort [unReadList] = " + arrayList3);
        ij4.l lVar = ij4.l.f373269d;
        kz5.g0.t(arrayList2, lVar);
        kz5.g0.t(arrayList3, lVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.OtherTopicFriendDataSource", "afterSort [readList] = " + arrayList2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.OtherTopicFriendDataSource", "afterSort [unReadList] = " + arrayList3);
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList.add((mj4.h) it.next());
        }
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            arrayList.add((mj4.h) it6.next());
        }
        return arrayList;
    }
}
