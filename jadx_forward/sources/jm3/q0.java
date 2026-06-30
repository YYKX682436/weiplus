package jm3;

/* loaded from: classes10.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f381878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.p1915x633fb29.p1916x2ffff9.C16646x38766471 f381879e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.mv.p1915x633fb29.p1916x2ffff9.C16646x38766471 c16646x38766471) {
        super(1);
        this.f381878d = linkedList;
        this.f381879e = c16646x38766471;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        java.util.List snapshotList = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotList, "snapshotList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = snapshotList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((gm3.c) next).f355077e == 3) {
                arrayList.add(next);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            gm3.c cVar = (gm3.c) it6.next();
            gm3.a aVar = cVar.f355080h;
            if (aVar != null && aVar.f355068a == -1) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj3 : this.f381878d) {
                    if (obj3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) {
                        arrayList2.add(obj3);
                    }
                }
                java.util.Iterator it7 = arrayList2.iterator();
                if (it7.hasNext()) {
                    java.lang.Object next2 = it7.next();
                    if (it7.hasNext()) {
                        long abs = java.lang.Math.abs(((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) next2).f219968m - aVar.f355069b);
                        do {
                            java.lang.Object next3 = it7.next();
                            long abs2 = java.lang.Math.abs(((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) next3).f219968m - aVar.f355069b);
                            if (abs > abs2) {
                                next2 = next3;
                                abs = abs2;
                            }
                        } while (it7.hasNext());
                    }
                    obj2 = next2;
                } else {
                    obj2 = null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) obj2;
                if (c15635xf0ea441b != null) {
                    java.lang.String str = "local_" + c15635xf0ea441b.f219967i;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                    cVar.f355076d = str;
                    aVar.f355068a = c15635xf0ea441b.f219967i;
                    aVar.f355070c = c15635xf0ea441b.f219963e;
                    aVar.f355071d = c15635xf0ea441b;
                    this.f381879e.y(cVar, false);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
