package jr;

/* loaded from: classes12.dex */
public final class b implements jr.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jr.d f382819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f382820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f382821c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jr.n f382822d;

    public b(jr.d dVar, boolean z17, java.util.LinkedList linkedList, jr.n nVar) {
        this.f382819a = dVar;
        this.f382820b = z17;
        this.f382821c = linkedList;
        this.f382822d = nVar;
    }

    @Override // jr.n
    public void a(java.util.List emojiList, jr.q wordInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiList, "emojiList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wordInfo, "wordInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IEmojiSuggest", "onResult: remote " + emojiList.size());
        jr.d dVar = this.f382819a;
        if (dVar.f382818e) {
            boolean z17 = this.f382820b;
            java.lang.Object obj = null;
            java.util.LinkedList linkedList = this.f382821c;
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : linkedList) {
                    if (((jr.p) obj2).f382849a.f68653x95b20dd4 == 81) {
                        arrayList.add(obj2);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj3 : linkedList) {
                    if (((jr.p) obj3).f382849a.f68653x95b20dd4 != 81) {
                        arrayList2.add(obj3);
                    }
                }
                java.util.LinkedList linkedList2 = new java.util.LinkedList(emojiList);
                linkedList2.addAll(linkedList);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj4 : linkedList2) {
                    if (((jr.p) obj4).f382849a.f68668xd33ad9b9 != 0) {
                        arrayList3.add(obj4);
                    }
                }
                java.util.Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    obj = it.next();
                    if (it.hasNext()) {
                        long j17 = ((jr.p) obj).f382849a.f68668xd33ad9b9;
                        do {
                            java.lang.Object next = it.next();
                            long j18 = ((jr.p) next).f382849a.f68668xd33ad9b9;
                            if (j17 < j18) {
                                obj = next;
                                j17 = j18;
                            }
                        } while (it.hasNext());
                    }
                }
                jr.p pVar = (jr.p) obj;
                if (pVar != null) {
                    pVar.f382850b.f382848d = 1;
                    dVar.f382828h.add(pVar);
                }
                jr.d.a(dVar, dVar.f382828h, arrayList);
                jr.d.a(dVar, dVar.f382828h, emojiList);
                jr.d.a(dVar, dVar.f382828h, arrayList2);
            } else {
                java.util.Iterator it6 = linkedList.iterator();
                if (it6.hasNext()) {
                    obj = it6.next();
                    if (it6.hasNext()) {
                        long j19 = ((jr.p) obj).f382849a.f68668xd33ad9b9;
                        do {
                            java.lang.Object next2 = it6.next();
                            long j27 = ((jr.p) next2).f382849a.f68668xd33ad9b9;
                            if (j19 < j27) {
                                obj = next2;
                                j19 = j27;
                            }
                        } while (it6.hasNext());
                    }
                }
                jr.p pVar2 = (jr.p) obj;
                if (pVar2 != null) {
                    pVar2.f382850b.f382848d = 1;
                    dVar.f382828h.add(pVar2);
                }
                jr.d.a(dVar, dVar.f382828h, linkedList);
                jr.d.a(dVar, dVar.f382828h, emojiList);
            }
            jr.n nVar = this.f382822d;
            if (nVar != null) {
                nVar.a(dVar.f382828h, wordInfo);
            }
            jr.f fVar = jr.f.f382830a;
            java.util.LinkedList emojiList2 = dVar.f382828h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiList2, "emojiList");
            if (!emojiList2.isEmpty()) {
                int size = emojiList2.size();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj5 : emojiList2) {
                    if (((jr.p) obj5).f382850b.f382845a == 0) {
                        arrayList4.add(obj5);
                    }
                }
                int size2 = arrayList4.size();
                fVar.a(1);
                if (size <= 2) {
                    fVar.a(2);
                } else if (size <= 5) {
                    fVar.a(3);
                } else if (size <= 10) {
                    fVar.a(4);
                } else if (size <= 50) {
                    fVar.a(5);
                } else {
                    fVar.a(9);
                }
                if (size2 > 0) {
                    fVar.a(11);
                    if (size2 <= 2) {
                        fVar.a(12);
                        return;
                    }
                    if (size2 <= 5) {
                        fVar.a(13);
                        return;
                    }
                    if (size2 <= 10) {
                        fVar.a(14);
                    } else if (size2 <= 50) {
                        fVar.a(15);
                    } else {
                        fVar.a(19);
                    }
                }
            }
        }
    }
}
