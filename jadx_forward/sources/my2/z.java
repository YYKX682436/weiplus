package my2;

/* loaded from: classes3.dex */
public final class z implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ my2.k0 f414311a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f414312b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f414313c;

    public z(my2.k0 k0Var, int i17, android.view.ViewGroup viewGroup) {
        this.f414311a = k0Var;
        this.f414312b = i17;
        this.f414313c = viewGroup;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        my2.k0 k0Var = this.f414311a;
        k0Var.A.b();
        r45.me2 me2Var = ((mm2.c1) k0Var.P0(mm2.c1.class)).f410317b6;
        int i17 = fVar.f152148a;
        ky2.g0 g0Var = k0Var.f414285y;
        if (i17 == 0 && fVar.f152149b == 0) {
            if (g0Var != null) {
                g0Var.f395081n = true;
                boolean z17 = g0Var.f395079i;
                java.util.ArrayList arrayList2 = g0Var.f395076f;
                int i18 = this.f414312b;
                if (!z17) {
                    java.lang.Object obj2 = arrayList2.get(i18);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                    if (((r45.l30) obj2).m75939xb282bd08(2) == 0) {
                        g0Var.x(i18);
                    } else {
                        g0Var.y(i18);
                    }
                } else if (((r45.l30) arrayList2.get(i18)).m75939xb282bd08(2) == 0) {
                    java.util.Iterator it = arrayList2.iterator();
                    int i19 = 0;
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        int i27 = i19 + 1;
                        if (i19 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        r45.l30 l30Var = (r45.l30) next;
                        if (i19 == i18) {
                            g0Var.x(i19);
                        } else if (l30Var.m75939xb282bd08(2) == 1) {
                            g0Var.y(i19);
                        }
                        i19 = i27;
                    }
                } else {
                    java.util.Iterator it6 = arrayList2.iterator();
                    int i28 = 0;
                    while (it6.hasNext()) {
                        java.lang.Object next2 = it6.next();
                        int i29 = i28 + 1;
                        if (i28 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        if (((r45.l30) next2).m75939xb282bd08(2) == 1) {
                            g0Var.y(i28);
                        }
                        i28 = i29;
                    }
                }
                g0Var.m8152xc67946d3(0, g0Var.mo1894x7e414b06(), java.lang.Boolean.TRUE);
            }
            if (me2Var != null && (m75941xfb8219142 = me2Var.m75941xfb821914(2)) != null) {
                m75941xfb8219142.clear();
            }
            if (g0Var != null && (arrayList = g0Var.f395076f) != null && me2Var != null && (m75941xfb821914 = me2Var.m75941xfb821914(2)) != null) {
                m75941xfb821914.addAll(arrayList);
            }
        } else {
            android.view.ViewGroup viewGroup = this.f414313c;
            db5.t7.g(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ejg));
        }
        if (g0Var != null) {
            g0Var.f395080m = false;
        }
        return jz5.f0.f384359a;
    }
}
