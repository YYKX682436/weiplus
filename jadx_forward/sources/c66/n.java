package c66;

/* loaded from: classes2.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f121023d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.util.List list) {
        super(1);
        this.f121023d = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Boolean bool;
        ni0.j jVar;
        java.util.List remainTidList = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remainTidList, "remainTidList");
        java.util.HashMap hashMap = new java.util.HashMap();
        for (ni0.j jVar2 : this.f121023d) {
            java.lang.String tid = jVar2.f418768b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tid, "tid");
            hashMap.put(tid, jVar2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList b17 = remainTidList.isEmpty() ? null : c66.q.f121026a.b(remainTidList, (kk.l) ((jz5.n) c66.q.f121036k).mo141623x754a37bb(), new c66.m(remainTidList));
        if (b17 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(b17, 10));
            java.util.Iterator it = b17.iterator();
            while (it.hasNext()) {
                ni0.i iVar = (ni0.i) it.next();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
                byte[] bArr = iVar.f418765b;
                if (bArr != null) {
                    try {
                        c19792x256d2725.mo11468x92b714fd(bArr);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                    }
                    if (c19792x256d2725 != null || (jVar = (ni0.j) hashMap.get(iVar.f418764a)) == null) {
                        bool = null;
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, jVar.f418770d);
                        a17.m59376x2a63115b(jVar.f418772f);
                        a17.m59427x8150691c(jVar.f418771e);
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                        bool = java.lang.Boolean.valueOf(arrayList.add(android.util.Pair.create(iVar.f418764a, cu2.u.f303974a.p(a17))));
                    }
                    arrayList2.add(bool);
                }
                c19792x256d2725 = null;
                if (c19792x256d2725 != null) {
                }
                bool = null;
                arrayList2.add(bool);
            }
        }
        return arrayList;
    }
}
