package m06;

/* loaded from: classes16.dex */
public final class h extends r06.j1 {
    public static final m06.g K = new m06.g(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o06.m mVar, m06.h hVar, o06.c cVar, boolean z17) {
        super(mVar, hVar, p06.i.f432298a, l26.h0.f396768g, cVar, o06.x1.f423537a);
        int i17 = p06.k.Z0;
        this.f449999s = true;
        this.B = z17;
        this.C = false;
    }

    @Override // r06.j0, o06.r0
    /* renamed from: isExternal */
    public boolean mo123388x64310b15() {
        return false;
    }

    @Override // r06.j0, o06.n0
    /* renamed from: isInline */
    public boolean mo123389xe19a9463() {
        return false;
    }

    @Override // r06.j0, o06.n0
    public boolean r() {
        return false;
    }

    @Override // r06.j1, r06.j0
    public r06.j0 u0(o06.m newOwner, o06.n0 n0Var, o06.c kind, n16.g gVar, p06.k annotations, o06.x1 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newOwner, "newOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotations, "annotations");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        return new m06.h(newOwner, (m06.h) n0Var, kind, this.B);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r06.j0
    public o06.n0 v0(r06.i0 configuration) {
        boolean z17;
        n16.g gVar;
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configuration, "configuration");
        m06.h hVar = (m06.h) super.v0(configuration);
        if (hVar == null) {
            return null;
        }
        java.util.List W = hVar.W();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(W, "getValueParameters(...)");
        boolean z19 = false;
        if (!W.isEmpty()) {
            java.util.Iterator it = W.iterator();
            while (it.hasNext()) {
                f26.o0 mo132802xfb85f7b0 = ((r06.t1) ((o06.l2) it.next())).mo132802xfb85f7b0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132802xfb85f7b0, "getType(...)");
                if (l06.j.c(mo132802xfb85f7b0) != null) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        if (z17) {
            return hVar;
        }
        java.util.List W2 = hVar.W();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(W2, "getValueParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(W2, 10));
        java.util.Iterator it6 = W2.iterator();
        while (it6.hasNext()) {
            f26.o0 mo132802xfb85f7b02 = ((r06.t1) ((o06.l2) it6.next())).mo132802xfb85f7b0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132802xfb85f7b02, "getType(...)");
            arrayList.add(l06.j.c(mo132802xfb85f7b02));
        }
        int size = hVar.W().size() - arrayList.size();
        if (size == 0) {
            java.util.List W3 = hVar.W();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(W3, "getValueParameters(...)");
            java.util.ArrayList arrayList2 = (java.util.ArrayList) kz5.n0.a1(arrayList, W3);
            if (!arrayList2.isEmpty()) {
                java.util.Iterator it7 = arrayList2.iterator();
                while (it7.hasNext()) {
                    jz5.l lVar = (jz5.l) it7.next();
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b((n16.g) lVar.f384366d, ((r06.v) ((o06.l2) lVar.f384367e)).mo132800xfb82e301())) {
                        z18 = false;
                        break;
                    }
                }
            }
            z18 = true;
            if (z18) {
                return hVar;
            }
        }
        java.util.List<o06.l2> W4 = hVar.W();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(W4, "getValueParameters(...)");
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(W4, 10));
        for (o06.l2 l2Var : W4) {
            n16.g mo132800xfb82e301 = ((r06.v) l2Var).mo132800xfb82e301();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132800xfb82e301, "getName(...)");
            int i17 = ((r06.s1) l2Var).f450055i;
            int i18 = i17 - size;
            if (i18 >= 0 && (gVar = (n16.g) arrayList.get(i18)) != null) {
                mo132800xfb82e301 = gVar;
            }
            arrayList3.add(l2Var.u(hVar, mo132800xfb82e301, i17));
        }
        r06.i0 y07 = hVar.y0(f26.v2.f340764b);
        if (!arrayList.isEmpty()) {
            java.util.Iterator it8 = arrayList.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (((n16.g) it8.next()) == null) {
                    z19 = true;
                    break;
                }
            }
        }
        y07.f449984v = java.lang.Boolean.valueOf(z19);
        y07.f449969g = arrayList3;
        y07.f449967e = hVar.a();
        o06.n0 v07 = super.v0(y07);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v07);
        return v07;
    }
}
