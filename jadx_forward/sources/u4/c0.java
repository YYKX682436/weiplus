package u4;

/* loaded from: classes13.dex */
public class c0 extends p012xc85e97e9.p087x9da2e250.app.b3 {
    public static boolean y(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
        return (p012xc85e97e9.p087x9da2e250.app.b3.j(abstractC1183x100d4975.f93918h) && p012xc85e97e9.p087x9da2e250.app.b3.j(abstractC1183x100d4975.f93920m) && p012xc85e97e9.p087x9da2e250.app.b3.j(abstractC1183x100d4975.f93921n)) ? false : true;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void a(java.lang.Object obj, android.view.View view) {
        if (obj != null) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) obj).c(view);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void b(java.lang.Object obj, java.util.ArrayList arrayList) {
        p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975 = (p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) obj;
        if (abstractC1183x100d4975 == null) {
            return;
        }
        int i17 = 0;
        if (abstractC1183x100d4975 instanceof p012xc85e97e9.p112x993b6d55.C1184xfa388aad) {
            p012xc85e97e9.p112x993b6d55.C1184xfa388aad c1184xfa388aad = (p012xc85e97e9.p112x993b6d55.C1184xfa388aad) abstractC1183x100d4975;
            int size = c1184xfa388aad.L.size();
            while (i17 < size) {
                b((i17 < 0 || i17 >= c1184xfa388aad.L.size()) ? null : (p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) c1184xfa388aad.L.get(i17), arrayList);
                i17++;
            }
            return;
        }
        if (y(abstractC1183x100d4975) || !p012xc85e97e9.p087x9da2e250.app.b3.j(abstractC1183x100d4975.f93919i)) {
            return;
        }
        int size2 = arrayList.size();
        while (i17 < size2) {
            abstractC1183x100d4975.c((android.view.View) arrayList.get(i17));
            i17++;
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void c(android.view.ViewGroup viewGroup, java.lang.Object obj) {
        u4.g1.a(viewGroup, (p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) obj);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public boolean e(java.lang.Object obj) {
        return obj instanceof p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public java.lang.Object g(java.lang.Object obj) {
        if (obj != null) {
            return ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) obj).mo8267x5a5dd5d();
        }
        return null;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public java.lang.Object k(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975 = (p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) obj;
        p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d49752 = (p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) obj2;
        p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d49753 = (p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) obj3;
        if (abstractC1183x100d4975 != null && abstractC1183x100d49752 != null) {
            p012xc85e97e9.p112x993b6d55.C1184xfa388aad c1184xfa388aad = new p012xc85e97e9.p112x993b6d55.C1184xfa388aad();
            c1184xfa388aad.X(abstractC1183x100d4975);
            c1184xfa388aad.X(abstractC1183x100d49752);
            c1184xfa388aad.b0(1);
            abstractC1183x100d4975 = c1184xfa388aad;
        } else if (abstractC1183x100d4975 == null) {
            abstractC1183x100d4975 = abstractC1183x100d49752 != null ? abstractC1183x100d49752 : null;
        }
        if (abstractC1183x100d49753 == null) {
            return abstractC1183x100d4975;
        }
        p012xc85e97e9.p112x993b6d55.C1184xfa388aad c1184xfa388aad2 = new p012xc85e97e9.p112x993b6d55.C1184xfa388aad();
        if (abstractC1183x100d4975 != null) {
            c1184xfa388aad2.X(abstractC1183x100d4975);
        }
        c1184xfa388aad2.X(abstractC1183x100d49753);
        return c1184xfa388aad2;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public java.lang.Object l(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        p012xc85e97e9.p112x993b6d55.C1184xfa388aad c1184xfa388aad = new p012xc85e97e9.p112x993b6d55.C1184xfa388aad();
        if (obj != null) {
            c1184xfa388aad.X((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) obj);
        }
        if (obj2 != null) {
            c1184xfa388aad.X((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) obj2);
        }
        if (obj3 != null) {
            c1184xfa388aad.X((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) obj3);
        }
        return c1184xfa388aad;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void n(java.lang.Object obj, android.view.View view) {
        if (obj != null) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) obj).F(view);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void o(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975 = (p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) obj;
        int i17 = 0;
        if (abstractC1183x100d4975 instanceof p012xc85e97e9.p112x993b6d55.C1184xfa388aad) {
            p012xc85e97e9.p112x993b6d55.C1184xfa388aad c1184xfa388aad = (p012xc85e97e9.p112x993b6d55.C1184xfa388aad) abstractC1183x100d4975;
            int size = c1184xfa388aad.L.size();
            while (i17 < size) {
                o((i17 < 0 || i17 >= c1184xfa388aad.L.size()) ? null : (p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) c1184xfa388aad.L.get(i17), arrayList, arrayList2);
                i17++;
            }
            return;
        }
        if (y(abstractC1183x100d4975)) {
            return;
        }
        java.util.ArrayList arrayList3 = abstractC1183x100d4975.f93919i;
        if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
            return;
        }
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        while (i17 < size2) {
            abstractC1183x100d4975.c((android.view.View) arrayList2.get(i17));
            i17++;
        }
        int size3 = arrayList.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                return;
            } else {
                abstractC1183x100d4975.F((android.view.View) arrayList.get(size3));
            }
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void p(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) obj).a(new u4.z(this, view, arrayList));
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void q(java.lang.Object obj, java.lang.Object obj2, java.util.ArrayList arrayList, java.lang.Object obj3, java.util.ArrayList arrayList2, java.lang.Object obj4, java.util.ArrayList arrayList3) {
        ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) obj).a(new u4.a0(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void r(java.lang.Object obj, android.graphics.Rect rect) {
        if (obj != null) {
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) obj).K(new u4.b0(this, rect));
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void s(java.lang.Object obj, android.view.View view) {
        if (view != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            i(view, rect);
            ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) obj).K(new u4.y(this, rect));
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void v(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        p012xc85e97e9.p112x993b6d55.C1184xfa388aad c1184xfa388aad = (p012xc85e97e9.p112x993b6d55.C1184xfa388aad) obj;
        java.util.ArrayList arrayList2 = c1184xfa388aad.f93919i;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            p012xc85e97e9.p087x9da2e250.app.b3.d(arrayList2, (android.view.View) arrayList.get(i17));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(c1184xfa388aad, arrayList);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public void w(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        p012xc85e97e9.p112x993b6d55.C1184xfa388aad c1184xfa388aad = (p012xc85e97e9.p112x993b6d55.C1184xfa388aad) obj;
        if (c1184xfa388aad != null) {
            java.util.ArrayList arrayList3 = c1184xfa388aad.f93919i;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            o(c1184xfa388aad, arrayList, arrayList2);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.b3
    public java.lang.Object x(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        p012xc85e97e9.p112x993b6d55.C1184xfa388aad c1184xfa388aad = new p012xc85e97e9.p112x993b6d55.C1184xfa388aad();
        c1184xfa388aad.X((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) obj);
        return c1184xfa388aad;
    }
}
