package ap1;

/* loaded from: classes5.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.o0 f94236d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(ap1.o0 o0Var) {
        super(1);
        this.f94236d = o0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ap1.c2 state = (ap1.c2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        java.util.HashSet hashSet = state.f94163n;
        ap1.o0 o0Var = this.f94236d;
        if (dVar != null && (dVar instanceof ap1.a)) {
            o0Var.f94244e = kz5.n0.V0(hashSet);
            o0Var.f94245f = new ap1.l0(o0Var);
            em.c4 c4Var = o0Var.f94243d;
            if (c4Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            if (c4Var.f335715g == null) {
                c4Var.f335715g = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) c4Var.f335709a.findViewById(com.p314xaae8f345.mm.R.id.v2t);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c4Var.f335715g;
            ap1.l0 l0Var = o0Var.f94245f;
            if (l0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarAdapter");
                throw null;
            }
            c1163xf1deaba4.mo7960x6cab2c8d(l0Var);
            em.c4 c4Var2 = o0Var.f94243d;
            if (c4Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            if (c4Var2.f335715g == null) {
                c4Var2.f335715g = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) c4Var2.f335709a.findViewById(com.p314xaae8f345.mm.R.id.v2t);
            }
            c4Var2.f335715g.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(o0Var.m158354x19263085(), 0, false));
            em.c4 c4Var3 = o0Var.f94243d;
            if (c4Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            android.widget.RelativeLayout f17 = c4Var3.f();
            java.util.List list = o0Var.f94244e;
            if (list == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectedList");
                throw null;
            }
            f17.setVisibility(list.isEmpty() ? 8 : 0);
            ap1.l0 l0Var2 = o0Var.f94245f;
            if (l0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarAdapter");
                throw null;
            }
            l0Var2.m8146xced61ae5();
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof ap1.h2)) {
            ap1.h2 h2Var = (ap1.h2) dVar2;
            boolean z17 = h2Var.f94210a;
            ap1.a0 a0Var = h2Var.f94211b;
            if (z17) {
                java.util.List list2 = o0Var.f94244e;
                if (list2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectedList");
                    throw null;
                }
                if (list2.indexOf(a0Var.f94133a) < 0) {
                    java.util.List list3 = o0Var.f94244e;
                    if (list3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectedList");
                        throw null;
                    }
                    list3.add(a0Var.f94133a);
                    ap1.l0 l0Var3 = o0Var.f94245f;
                    if (l0Var3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarAdapter");
                        throw null;
                    }
                    if (o0Var.f94244e == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectedList");
                        throw null;
                    }
                    l0Var3.m8149x8b456734(r9.size() - 1);
                }
            } else {
                java.util.List list4 = o0Var.f94244e;
                if (list4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectedList");
                    throw null;
                }
                int indexOf = list4.indexOf(a0Var.f94133a);
                if (indexOf >= 0) {
                    java.util.List list5 = o0Var.f94244e;
                    if (list5 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectedList");
                        throw null;
                    }
                    list5.remove(indexOf);
                    ap1.l0 l0Var4 = o0Var.f94245f;
                    if (l0Var4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarAdapter");
                        throw null;
                    }
                    l0Var4.m8155x27702c4(indexOf);
                }
            }
            em.c4 c4Var4 = o0Var.f94243d;
            if (c4Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            android.widget.RelativeLayout f18 = c4Var4.f();
            java.util.List list6 = o0Var.f94244e;
            if (list6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectedList");
                throw null;
            }
            f18.setVisibility(list6.isEmpty() ? 8 : 0);
        }
        j75.d dVar3 = state.f379599d;
        if (dVar3 != null && (dVar3 instanceof ap1.g2)) {
            if (((ap1.g2) dVar3).f94202a) {
                o0Var.f94244e = kz5.n0.V0(hashSet);
            } else {
                java.util.List list7 = o0Var.f94244e;
                if (list7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectedList");
                    throw null;
                }
                list7.clear();
            }
            em.c4 c4Var5 = o0Var.f94243d;
            if (c4Var5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            android.widget.RelativeLayout f19 = c4Var5.f();
            java.util.List list8 = o0Var.f94244e;
            if (list8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectedList");
                throw null;
            }
            f19.setVisibility(list8.isEmpty() ? 8 : 0);
            ap1.l0 l0Var5 = o0Var.f94245f;
            if (l0Var5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarAdapter");
                throw null;
            }
            l0Var5.m8146xced61ae5();
        }
        return jz5.f0.f384359a;
    }
}
