package ap1;

/* loaded from: classes5.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.i0 f94197d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ap1.i0 i0Var) {
        super(1);
        this.f94197d = i0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ap1.z zVar;
        ap1.z zVar2;
        ap1.c2 state = (ap1.c2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        ap1.i0 i0Var = this.f94197d;
        if (dVar != null && (dVar instanceof ap1.h2)) {
            ap1.h2 h2Var = (ap1.h2) dVar;
            if (state.f94161i && i0Var.f94218f != null) {
                java.util.Iterator it = state.f94162m.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ap1.a0) it.next()).f94133a, h2Var.f94211b.f94133a)) {
                        break;
                    }
                    i17++;
                }
                if (i17 >= 0) {
                    ap1.z zVar3 = i0Var.f94218f;
                    if (zVar3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                        throw null;
                    }
                    zVar3.m8147xed6e4d18(i17);
                }
            }
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof ap1.g2)) {
            if (state.f94161i && (zVar2 = i0Var.f94218f) != null) {
                java.util.List list = state.f94162m;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<set-?>");
                zVar2.f94301d = list;
                ap1.z zVar4 = i0Var.f94218f;
                if (zVar4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                    throw null;
                }
                zVar4.m8146xced61ae5();
            }
        }
        j75.d dVar3 = state.f379599d;
        if (dVar3 != null && (dVar3 instanceof ap1.f2)) {
            if (state.f94161i && (zVar = i0Var.f94218f) != null) {
                java.util.List list2 = state.f94162m;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list2, "<set-?>");
                zVar.f94301d = list2;
                ap1.z zVar5 = i0Var.f94218f;
                if (zVar5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                    throw null;
                }
                zVar5.m8146xced61ae5();
            }
        }
        j75.d dVar4 = state.f379599d;
        if (dVar4 != null && (dVar4 instanceof ap1.a)) {
            ap1.z zVar6 = i0Var.f94218f;
            if (zVar6 != null) {
                java.util.List list3 = state.f94162m;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list3, "<set-?>");
                zVar6.f94301d = list3;
            } else {
                i0Var.f94218f = new ap1.z(i0Var, state.f94162m, state.f94158f);
            }
            if (i0Var.f94219g == null) {
                i0Var.f94219g = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(i0Var.m158354x19263085(), 1, false);
            }
            jz5.g gVar = i0Var.f94217e;
            em.c4 c4Var = (em.c4) ((jz5.n) gVar).mo141623x754a37bb();
            if (c4Var.f335713e == null) {
                c4Var.f335713e = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) c4Var.f335709a.findViewById(com.p314xaae8f345.mm.R.id.j8y);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c4Var.f335713e;
            ap1.z zVar7 = i0Var.f94218f;
            if (zVar7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            c1163xf1deaba4.mo7960x6cab2c8d(zVar7);
            em.c4 c4Var2 = (em.c4) ((jz5.n) gVar).mo141623x754a37bb();
            if (c4Var2.f335713e == null) {
                c4Var2.f335713e = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) c4Var2.f335709a.findViewById(com.p314xaae8f345.mm.R.id.j8y);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = c4Var2.f335713e;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = i0Var.f94219g;
            if (layoutManager == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("layoutManager");
                throw null;
            }
            c1163xf1deaba42.mo7967x900dcbe1(layoutManager);
            ap1.z zVar8 = i0Var.f94218f;
            if (zVar8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            zVar8.m8146xced61ae5();
        }
        return jz5.f0.f384359a;
    }
}
