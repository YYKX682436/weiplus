package im3;

/* loaded from: classes10.dex */
public final class g extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.oc5 f374223d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374224e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f374225f;

    public g(r45.oc5 previewItemObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewItemObj, "previewItemObj");
        this.f374223d = previewItemObj;
        this.f374225f = new java.util.HashSet();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        r45.nc5 nc5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        r45.oc5 oc5Var = this.f374223d;
        java.util.LinkedList sourceList = oc5Var.f463682d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sourceList, "sourceList");
        java.util.Iterator it = sourceList.iterator();
        while (true) {
            if (!it.hasNext()) {
                java.util.LinkedList sourceList2 = oc5Var.f463682d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sourceList2, "sourceList");
                nc5Var = (r45.nc5) kz5.n0.Z(sourceList2);
                break;
            }
            nc5Var = (r45.nc5) it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(nc5Var.f462779e, this.f374224e)) {
                break;
            }
        }
        if (nc5Var != null) {
            java.util.LinkedList linkedList = nc5Var.f462778d;
            int size = linkedList.size();
            for (int i17 = 0; i17 < size; i17++) {
                r45.mc5 mc5Var = (r45.mc5) linkedList.get(i17);
                java.lang.String str = mc5Var.f461896d;
                if (str != null) {
                    boolean contains = this.f374225f.contains(nc5Var.f462779e + '-' + str);
                    java.util.ArrayList arrayList = dVar.f544682c;
                    java.lang.String str2 = nc5Var.f462779e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    im3.j jVar = new im3.j(str, i17, mc5Var, str2);
                    jVar.f374235h = contains;
                    arrayList.add(jVar);
                }
            }
        }
        k0Var.e(dVar);
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.r(k0Var);
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        java.util.LinkedList<r45.ny5> selectItemList = this.f374223d.f463683e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(selectItemList, "selectItemList");
        for (r45.ny5 ny5Var : selectItemList) {
            r45.mc5 mc5Var = ny5Var.f463298d;
            if (mc5Var != null) {
                this.f374225f.add(ny5Var.f463299e + '-' + mc5Var.f461896d);
            }
        }
    }
}
