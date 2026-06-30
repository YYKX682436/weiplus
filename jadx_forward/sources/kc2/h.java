package kc2;

/* loaded from: classes12.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final kc2.h f387936d = new kc2.h();

    public h() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.g gVar = kc2.m.f387987a;
        int y17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a.y();
        if (1 <= y17 && y17 < 3) {
            java.util.List list = kc2.i.f387946n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((kz5.h) list).iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                kc2.i iVar = (kc2.i) next;
                if ((iVar == kc2.i.f387940e || iVar == kc2.i.f387941f || iVar == kc2.i.f387942g || iVar == kc2.i.f387943h || iVar == kc2.i.f387944i) ? false : true) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        if (3 <= y17 && y17 < 7) {
            java.util.List list2 = kc2.i.f387946n;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = ((kz5.h) list2).iterator();
            while (it6.hasNext()) {
                java.lang.Object next2 = it6.next();
                kc2.i iVar2 = (kc2.i) next2;
                if ((iVar2 == kc2.i.f387941f || iVar2 == kc2.i.f387942g || iVar2 == kc2.i.f387943h || iVar2 == kc2.i.f387944i) ? false : true) {
                    arrayList2.add(next2);
                }
            }
            return arrayList2;
        }
        if (7 <= y17 && y17 < 14) {
            java.util.List list3 = kc2.i.f387946n;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it7 = ((kz5.h) list3).iterator();
            while (it7.hasNext()) {
                java.lang.Object next3 = it7.next();
                kc2.i iVar3 = (kc2.i) next3;
                if ((iVar3 == kc2.i.f387942g || iVar3 == kc2.i.f387943h || iVar3 == kc2.i.f387944i) ? false : true) {
                    arrayList3.add(next3);
                }
            }
            return arrayList3;
        }
        if (14 <= y17 && y17 < 30) {
            java.util.List list4 = kc2.i.f387946n;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it8 = ((kz5.h) list4).iterator();
            while (it8.hasNext()) {
                java.lang.Object next4 = it8.next();
                kc2.i iVar4 = (kc2.i) next4;
                if ((iVar4 == kc2.i.f387943h || iVar4 == kc2.i.f387944i) ? false : true) {
                    arrayList4.add(next4);
                }
            }
            return arrayList4;
        }
        if (!(30 <= y17 && y17 < 60)) {
            return kc2.i.f387946n;
        }
        java.util.List list5 = kc2.i.f387946n;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.Iterator it9 = ((kz5.h) list5).iterator();
        while (it9.hasNext()) {
            java.lang.Object next5 = it9.next();
            if (((kc2.i) next5) != kc2.i.f387944i) {
                arrayList5.add(next5);
            }
        }
        return arrayList5;
    }
}
