package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ak0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dk0 f193434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xh2.c f193435e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dk0 dk0Var, xh2.c cVar) {
        super(0);
        this.f193434d = dk0Var;
        this.f193435e = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        java.lang.Object obj;
        java.lang.Object obj2;
        kn0.p pVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dk0 dk0Var = this.f193434d;
        java.lang.String m86 = ((mm2.c1) dk0Var.P0(mm2.c1.class)).m8();
        if (m86 == null) {
            m86 = "";
        }
        xh2.c cVar = this.f193435e;
        java.util.LinkedList linkedList = cVar.f536064a;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            z17 = false;
            if (!it.hasNext()) {
                break;
            }
            xh2.a aVar = (xh2.a) it.next();
            java.lang.String b17 = aVar.b();
            xh2.i iVar = aVar.f536054b;
            arrayList.add(new jo0.a(b17, new hn5.b(iVar.f364142a, iVar.f364143b, iVar.f364144c, iVar.f364145d), false));
        }
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1 = dk0Var.f193832p;
        java.util.Iterator<T> it6 = c10849x610a91e1.m46525xf32e824b().iterator();
        while (true) {
            obj = null;
            if (!it6.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it6.next();
            jo0.a aVar2 = (jo0.a) obj2;
            if (aVar2.f382405c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar2.f382403a, m86)) {
                break;
            }
        }
        jo0.a aVar3 = (jo0.a) obj2;
        if (aVar3 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorPreviewPlugin", "micCoverDataChangeEvent fakeData selfId: ".concat(m86));
            java.util.Iterator it7 = arrayList.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                java.lang.Object next = it7.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((jo0.a) next).f382403a, m86)) {
                    obj = next;
                    break;
                }
            }
            if (obj == null) {
                arrayList.add(aVar3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorPreviewPlugin", "micCoverDataChangeEvent fakeData selfId not exist, add");
            }
        }
        co0.s u17 = dk0Var.u1();
        if (u17 != null && (pVar = u17.D) != null && pVar.f391122i) {
            z17 = true;
        }
        c10849x610a91e1.d(arrayList, cVar.f536065b, z17);
        return jz5.f0.f384359a;
    }
}
