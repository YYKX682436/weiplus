package y1;

/* loaded from: classes14.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final y1.n f540328a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f540329b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f540330c;

    /* renamed from: d, reason: collision with root package name */
    public y1.y f540331d;

    /* renamed from: e, reason: collision with root package name */
    public final y1.l f540332e;

    /* renamed from: f, reason: collision with root package name */
    public final int f540333f;

    /* renamed from: g, reason: collision with root package name */
    public final u1.w f540334g;

    public y(y1.n outerSemanticsEntity, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outerSemanticsEntity, "outerSemanticsEntity");
        this.f540328a = outerSemanticsEntity;
        this.f540329b = z17;
        this.f540332e = outerSemanticsEntity.c();
        this.f540333f = ((y1.q) ((y1.o) outerSemanticsEntity.f505188e)).f540319d;
        this.f540334g = outerSemanticsEntity.f505187d.f505087h;
    }

    public static java.util.List b(y1.y yVar, java.util.List list, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            list = new java.util.ArrayList();
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        yVar.getClass();
        java.util.List k17 = yVar.k(z17, false);
        int size = k17.size();
        for (int i18 = 0; i18 < size; i18++) {
            y1.y yVar2 = (y1.y) k17.get(i18);
            if (yVar2.i()) {
                list.add(yVar2);
            } else if (!yVar2.f540332e.f540301f) {
                b(yVar2, list, false, 2, null);
            }
        }
        return list;
    }

    public final y1.y a(y1.i iVar, yz5.l lVar) {
        y1.y yVar = new y1.y(new y1.n(new u1.w(true).I, new y1.q(this.f540333f + (iVar != null ? 1000000000 : 2000000000), false, false, lVar)), false);
        yVar.f540330c = true;
        yVar.f540331d = this;
        return yVar;
    }

    public final u1.c1 c() {
        boolean z17 = this.f540332e.f540300e;
        y1.n nVar = this.f540328a;
        if (!z17) {
            return nVar.f505187d;
        }
        y1.n c17 = y1.z.c(this.f540334g);
        if (c17 != null) {
            nVar = c17;
        }
        return nVar.f505187d;
    }

    public final d1.g d() {
        return !this.f540334g.x() ? d1.g.f307161e : s1.a0.b(c());
    }

    public final java.util.List e(boolean z17, boolean z18, boolean z19) {
        return (z18 || !this.f540332e.f540301f) ? i() ? b(this, null, z17, 1, null) : k(z17, z19) : kz5.p0.f395529d;
    }

    public final y1.l f() {
        boolean i17 = i();
        y1.l lVar = this.f540332e;
        if (!i17) {
            return lVar;
        }
        lVar.getClass();
        y1.l lVar2 = new y1.l();
        lVar2.f540300e = lVar.f540300e;
        lVar2.f540301f = lVar.f540301f;
        lVar2.f540299d.putAll(lVar.f540299d);
        j(lVar2);
        return lVar2;
    }

    public final y1.y g() {
        y1.y yVar = this.f540331d;
        if (yVar != null) {
            return yVar;
        }
        u1.w wVar = this.f540334g;
        boolean z17 = this.f540329b;
        u1.w a17 = z17 ? y1.z.a(wVar, y1.w.f540326d) : null;
        if (a17 == null) {
            a17 = y1.z.a(wVar, y1.x.f540327d);
        }
        y1.n d17 = a17 != null ? y1.z.d(a17) : null;
        if (d17 == null) {
            return null;
        }
        return new y1.y(d17, z17);
    }

    public final java.util.List h() {
        return e(false, false, true);
    }

    public final boolean i() {
        return this.f540329b && this.f540332e.f540300e;
    }

    public final void j(y1.l lVar) {
        if (this.f540332e.f540301f) {
            return;
        }
        java.util.List k17 = k(false, false);
        int size = k17.size();
        for (int i17 = 0; i17 < size; i17++) {
            y1.y yVar = (y1.y) k17.get(i17);
            if (!yVar.i()) {
                lVar.getClass();
                y1.l child = yVar.f540332e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
                for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) child.f540299d).entrySet()) {
                    y1.o0 o0Var = (y1.o0) entry.getKey();
                    java.lang.Object value = entry.getValue();
                    java.util.Map map = lVar.f540299d;
                    java.lang.Object mo149xb9724478 = o0Var.f540317b.mo149xb9724478(((java.util.LinkedHashMap) map).get(o0Var), value);
                    if (mo149xb9724478 != null) {
                        map.put(o0Var, mo149xb9724478);
                    }
                }
                yVar.j(lVar);
            }
        }
    }

    public final java.util.List k(boolean z17, boolean z18) {
        java.util.ArrayList arrayList;
        if (this.f540330c) {
            return kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        u1.w wVar = this.f540334g;
        if (z17) {
            arrayList = new java.util.ArrayList();
            y1.q0.b(wVar, arrayList);
        } else {
            arrayList = new java.util.ArrayList();
            y1.z.b(wVar, arrayList);
        }
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            arrayList2.add(new y1.y((y1.n) arrayList.get(i17), this.f540329b));
        }
        if (z18) {
            y1.o0 o0Var = y1.i0.f540267p;
            y1.l lVar = this.f540332e;
            y1.i iVar = (y1.i) y1.m.a(lVar, o0Var);
            if (iVar != null && lVar.f540300e && (!arrayList2.isEmpty())) {
                arrayList2.add(a(iVar, new y1.u(iVar)));
            }
            y1.o0 o0Var2 = y1.i0.f540252a;
            if (lVar.d(o0Var2) && (!arrayList2.isEmpty()) && lVar.f540300e) {
                java.util.List list = (java.util.List) y1.m.a(lVar, o0Var2);
                java.lang.String str = list != null ? (java.lang.String) kz5.n0.Z(list) : null;
                if (str != null) {
                    arrayList2.add(0, a(null, new y1.v(str)));
                }
            }
        }
        return arrayList2;
    }
}
