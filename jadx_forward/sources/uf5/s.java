package uf5;

/* loaded from: classes8.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final uf5.s f508828d = new uf5.s();

    public s() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        uf5.l state = (uf5.l) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof uf5.x0)) {
            state.f508799e = true;
        }
        java.util.List list = state.f508800f;
        if (dVar != null && (dVar instanceof uf5.y0)) {
            state.f508799e = false;
            ((java.util.ArrayList) list).clear();
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof uf5.c)) {
            uf5.c cVar = (uf5.c) dVar2;
            boolean z17 = cVar.f508738c;
            java.lang.String str = cVar.f508737b;
            if (z17) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            } else {
                ((java.util.ArrayList) list).remove(str);
            }
        }
        j75.d dVar3 = state.f379599d;
        if (dVar3 != null && (dVar3 instanceof uf5.d)) {
            uf5.d dVar4 = (uf5.d) dVar3;
            state.f508799e = false;
            ((java.util.ArrayList) list).clear();
            java.lang.String[] strArr = state.f508802h;
            if (strArr != null && (!dVar4.f508743b.isEmpty())) {
                java.util.HashSet hashSet = new java.util.HashSet(dVar4.f508743b);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.String str2 : strArr) {
                    if (!hashSet.contains(str2)) {
                        arrayList2.add(str2);
                    }
                }
                state.f508802h = (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]);
            }
        }
        j75.d dVar5 = state.f379599d;
        if (dVar5 != null && (dVar5 instanceof uf5.c2)) {
            uf5.c2 c2Var = (uf5.c2) dVar5;
            java.util.Iterator it = c2Var.f508741b.iterator();
            while (it.hasNext()) {
                ((java.util.ArrayList) list).remove((java.lang.String) it.next());
            }
            for (java.lang.String str3 : c2Var.f508742c) {
                java.util.ArrayList arrayList3 = (java.util.ArrayList) list;
                if (!arrayList3.contains(str3)) {
                    arrayList3.add(str3);
                }
            }
        }
        j75.d dVar6 = state.f379599d;
        if (dVar6 != null && (dVar6 instanceof uf5.a)) {
            ((java.util.ArrayList) list).remove(((uf5.a) dVar6).f508729b);
        }
        return jz5.f0.f384359a;
    }
}
