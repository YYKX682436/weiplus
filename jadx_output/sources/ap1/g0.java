package ap1;

/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.i0 f12664d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ap1.i0 i0Var) {
        super(1);
        this.f12664d = i0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ap1.z zVar;
        ap1.z zVar2;
        ap1.c2 state = (ap1.c2) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        ap1.i0 i0Var = this.f12664d;
        if (dVar != null && (dVar instanceof ap1.h2)) {
            ap1.h2 h2Var = (ap1.h2) dVar;
            if (state.f12628i && i0Var.f12685f != null) {
                java.util.Iterator it = state.f12629m.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    if (kotlin.jvm.internal.o.b(((ap1.a0) it.next()).f12600a, h2Var.f12678b.f12600a)) {
                        break;
                    }
                    i17++;
                }
                if (i17 >= 0) {
                    ap1.z zVar3 = i0Var.f12685f;
                    if (zVar3 == null) {
                        kotlin.jvm.internal.o.o("adapter");
                        throw null;
                    }
                    zVar3.notifyItemChanged(i17);
                }
            }
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof ap1.g2)) {
            if (state.f12628i && (zVar2 = i0Var.f12685f) != null) {
                java.util.List list = state.f12629m;
                kotlin.jvm.internal.o.g(list, "<set-?>");
                zVar2.f12768d = list;
                ap1.z zVar4 = i0Var.f12685f;
                if (zVar4 == null) {
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
                zVar4.notifyDataSetChanged();
            }
        }
        j75.d dVar3 = state.f298066d;
        if (dVar3 != null && (dVar3 instanceof ap1.f2)) {
            if (state.f12628i && (zVar = i0Var.f12685f) != null) {
                java.util.List list2 = state.f12629m;
                kotlin.jvm.internal.o.g(list2, "<set-?>");
                zVar.f12768d = list2;
                ap1.z zVar5 = i0Var.f12685f;
                if (zVar5 == null) {
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
                zVar5.notifyDataSetChanged();
            }
        }
        j75.d dVar4 = state.f298066d;
        if (dVar4 != null && (dVar4 instanceof ap1.a)) {
            ap1.z zVar6 = i0Var.f12685f;
            if (zVar6 != null) {
                java.util.List list3 = state.f12629m;
                kotlin.jvm.internal.o.g(list3, "<set-?>");
                zVar6.f12768d = list3;
            } else {
                i0Var.f12685f = new ap1.z(i0Var, state.f12629m, state.f12625f);
            }
            if (i0Var.f12686g == null) {
                i0Var.f12686g = new androidx.recyclerview.widget.LinearLayoutManager(i0Var.getActivity(), 1, false);
            }
            jz5.g gVar = i0Var.f12684e;
            em.c4 c4Var = (em.c4) ((jz5.n) gVar).getValue();
            if (c4Var.f254180e == null) {
                c4Var.f254180e = (androidx.recyclerview.widget.RecyclerView) c4Var.f254176a.findViewById(com.tencent.mm.R.id.j8y);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = c4Var.f254180e;
            ap1.z zVar7 = i0Var.f12685f;
            if (zVar7 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            recyclerView.setAdapter(zVar7);
            em.c4 c4Var2 = (em.c4) ((jz5.n) gVar).getValue();
            if (c4Var2.f254180e == null) {
                c4Var2.f254180e = (androidx.recyclerview.widget.RecyclerView) c4Var2.f254176a.findViewById(com.tencent.mm.R.id.j8y);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView2 = c4Var2.f254180e;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = i0Var.f12686g;
            if (layoutManager == null) {
                kotlin.jvm.internal.o.o("layoutManager");
                throw null;
            }
            recyclerView2.setLayoutManager(layoutManager);
            ap1.z zVar8 = i0Var.f12685f;
            if (zVar8 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            zVar8.notifyDataSetChanged();
        }
        return jz5.f0.f302826a;
    }
}
