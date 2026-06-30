package ap1;

/* loaded from: classes5.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.o0 f12703d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(ap1.o0 o0Var) {
        super(1);
        this.f12703d = o0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ap1.c2 state = (ap1.c2) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        java.util.HashSet hashSet = state.f12630n;
        ap1.o0 o0Var = this.f12703d;
        if (dVar != null && (dVar instanceof ap1.a)) {
            o0Var.f12711e = kz5.n0.V0(hashSet);
            o0Var.f12712f = new ap1.l0(o0Var);
            em.c4 c4Var = o0Var.f12710d;
            if (c4Var == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            if (c4Var.f254182g == null) {
                c4Var.f254182g = (androidx.recyclerview.widget.RecyclerView) c4Var.f254176a.findViewById(com.tencent.mm.R.id.v2t);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = c4Var.f254182g;
            ap1.l0 l0Var = o0Var.f12712f;
            if (l0Var == null) {
                kotlin.jvm.internal.o.o("avatarAdapter");
                throw null;
            }
            recyclerView.setAdapter(l0Var);
            em.c4 c4Var2 = o0Var.f12710d;
            if (c4Var2 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            if (c4Var2.f254182g == null) {
                c4Var2.f254182g = (androidx.recyclerview.widget.RecyclerView) c4Var2.f254176a.findViewById(com.tencent.mm.R.id.v2t);
            }
            c4Var2.f254182g.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(o0Var.getActivity(), 0, false));
            em.c4 c4Var3 = o0Var.f12710d;
            if (c4Var3 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            android.widget.RelativeLayout f17 = c4Var3.f();
            java.util.List list = o0Var.f12711e;
            if (list == null) {
                kotlin.jvm.internal.o.o("selectedList");
                throw null;
            }
            f17.setVisibility(list.isEmpty() ? 8 : 0);
            ap1.l0 l0Var2 = o0Var.f12712f;
            if (l0Var2 == null) {
                kotlin.jvm.internal.o.o("avatarAdapter");
                throw null;
            }
            l0Var2.notifyDataSetChanged();
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof ap1.h2)) {
            ap1.h2 h2Var = (ap1.h2) dVar2;
            boolean z17 = h2Var.f12677a;
            ap1.a0 a0Var = h2Var.f12678b;
            if (z17) {
                java.util.List list2 = o0Var.f12711e;
                if (list2 == null) {
                    kotlin.jvm.internal.o.o("selectedList");
                    throw null;
                }
                if (list2.indexOf(a0Var.f12600a) < 0) {
                    java.util.List list3 = o0Var.f12711e;
                    if (list3 == null) {
                        kotlin.jvm.internal.o.o("selectedList");
                        throw null;
                    }
                    list3.add(a0Var.f12600a);
                    ap1.l0 l0Var3 = o0Var.f12712f;
                    if (l0Var3 == null) {
                        kotlin.jvm.internal.o.o("avatarAdapter");
                        throw null;
                    }
                    if (o0Var.f12711e == null) {
                        kotlin.jvm.internal.o.o("selectedList");
                        throw null;
                    }
                    l0Var3.notifyItemInserted(r9.size() - 1);
                }
            } else {
                java.util.List list4 = o0Var.f12711e;
                if (list4 == null) {
                    kotlin.jvm.internal.o.o("selectedList");
                    throw null;
                }
                int indexOf = list4.indexOf(a0Var.f12600a);
                if (indexOf >= 0) {
                    java.util.List list5 = o0Var.f12711e;
                    if (list5 == null) {
                        kotlin.jvm.internal.o.o("selectedList");
                        throw null;
                    }
                    list5.remove(indexOf);
                    ap1.l0 l0Var4 = o0Var.f12712f;
                    if (l0Var4 == null) {
                        kotlin.jvm.internal.o.o("avatarAdapter");
                        throw null;
                    }
                    l0Var4.notifyItemRemoved(indexOf);
                }
            }
            em.c4 c4Var4 = o0Var.f12710d;
            if (c4Var4 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            android.widget.RelativeLayout f18 = c4Var4.f();
            java.util.List list6 = o0Var.f12711e;
            if (list6 == null) {
                kotlin.jvm.internal.o.o("selectedList");
                throw null;
            }
            f18.setVisibility(list6.isEmpty() ? 8 : 0);
        }
        j75.d dVar3 = state.f298066d;
        if (dVar3 != null && (dVar3 instanceof ap1.g2)) {
            if (((ap1.g2) dVar3).f12669a) {
                o0Var.f12711e = kz5.n0.V0(hashSet);
            } else {
                java.util.List list7 = o0Var.f12711e;
                if (list7 == null) {
                    kotlin.jvm.internal.o.o("selectedList");
                    throw null;
                }
                list7.clear();
            }
            em.c4 c4Var5 = o0Var.f12710d;
            if (c4Var5 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            android.widget.RelativeLayout f19 = c4Var5.f();
            java.util.List list8 = o0Var.f12711e;
            if (list8 == null) {
                kotlin.jvm.internal.o.o("selectedList");
                throw null;
            }
            f19.setVisibility(list8.isEmpty() ? 8 : 0);
            ap1.l0 l0Var5 = o0Var.f12712f;
            if (l0Var5 == null) {
                kotlin.jvm.internal.o.o("avatarAdapter");
                throw null;
            }
            l0Var5.notifyDataSetChanged();
        }
        return jz5.f0.f302826a;
    }
}
