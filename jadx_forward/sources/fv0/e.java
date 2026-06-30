package fv0;

/* loaded from: classes5.dex */
public abstract class e {
    public static final dw0.d a(dw0.d dVar, dw0.c cVar, zu0.i iVar) {
        java.util.List V0 = kz5.n0.V0(dVar.f325623a);
        java.util.ArrayList arrayList = (java.util.ArrayList) V0;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar.f325619a.f129757b, ((dw0.c) it.next()).f325619a.f129757b)) {
                break;
            }
            i17++;
        }
        if (i17 >= 0) {
            arrayList.set(i17, dw0.c.a((dw0.c) arrayList.get(i17), null, null, iVar, false, 11, null));
        }
        return dw0.d.b(dVar, V0, null, new dw0.i(i17, iVar), 2, null);
    }

    public static final kw0.a b(kw0.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "<this>");
        return (kw0.a) kz5.n0.a0(eVar.f394334a, eVar.f394335b);
    }

    public static final fv0.d c(com.p314xaae8f345.p457x3304c6.p476x11d36527.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gVar, "<this>");
        return fv0.d.f348489e.a(gVar.f129781d);
    }

    public static final zu0.h d(zu0.h hVar, kw0.a stickerData, zu0.i loadState, boolean z17) {
        kw0.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stickerData, "stickerData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadState, "loadState");
        kw0.e eVar = (kw0.e) hVar.f557206a;
        java.util.Iterator it = eVar.f394334a.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((kw0.a) it.next()).f394321a.f129757b, stickerData.f394321a.f129757b)) {
                break;
            }
            i17++;
        }
        if (i17 < 0) {
            return hVar;
        }
        java.util.List V0 = kz5.n0.V0(eVar.f394334a);
        java.util.ArrayList arrayList = (java.util.ArrayList) V0;
        arrayList.set(i17, kw0.a.a((kw0.a) arrayList.get(i17), null, loadState, false, 5, null));
        int i18 = eVar.f394335b;
        if (!z17 || (i18 >= 0 && i18 != i17)) {
            kw0.g gVar2 = new kw0.g(i17);
            i17 = i18;
            gVar = gVar2;
        } else {
            gVar = new kw0.h(i17);
        }
        eVar.getClass();
        return new zu0.h(new kw0.e(V0, i17, gVar));
    }

    public static final zu0.h e(zu0.h hVar, vv0.a clipData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clipData, "clipData");
        return new zu0.h(vv0.c.a((vv0.c) hVar.f557206a, null, null, new vv0.e(clipData), 3, null));
    }

    public static final dw0.d f(dw0.d dVar, dw0.c cVar, zu0.i iVar) {
        java.util.List V0 = kz5.n0.V0(dVar.f325623a);
        java.util.ArrayList arrayList = (java.util.ArrayList) V0;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar.f325619a.f129757b, ((dw0.c) it.next()).f325619a.f129757b)) {
                break;
            }
            i17++;
        }
        if (i17 < 0) {
            return dVar;
        }
        arrayList.set(i17, dw0.c.a((dw0.c) arrayList.get(i17), null, null, zu0.i.f557209f, false, 11, null));
        return dVar.f325624b.f325627b == i17 ? dw0.d.b(dVar, V0, null, new dw0.j(i17, iVar), 2, null) : dw0.d.b(dVar, V0, null, new dw0.i(i17, iVar), 2, null);
    }
}
