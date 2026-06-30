package r06;

/* loaded from: classes16.dex */
public class e1 {

    /* renamed from: a, reason: collision with root package name */
    public o06.m f449931a;

    /* renamed from: b, reason: collision with root package name */
    public o06.t0 f449932b;

    /* renamed from: c, reason: collision with root package name */
    public o06.g0 f449933c;

    /* renamed from: e, reason: collision with root package name */
    public o06.c f449935e;

    /* renamed from: h, reason: collision with root package name */
    public final o06.r1 f449938h;

    /* renamed from: i, reason: collision with root package name */
    public final n16.g f449939i;

    /* renamed from: j, reason: collision with root package name */
    public final f26.o0 f449940j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r06.f1 f449941k;

    /* renamed from: d, reason: collision with root package name */
    public o06.o1 f449934d = null;

    /* renamed from: f, reason: collision with root package name */
    public f26.q2 f449936f = f26.q2.f340745a;

    /* renamed from: g, reason: collision with root package name */
    public boolean f449937g = true;

    public e1(r06.f1 f1Var) {
        this.f449941k = f1Var;
        this.f449931a = f1Var.e();
        this.f449932b = f1Var.f();
        this.f449933c = f1Var.mo9617x61f71b08();
        this.f449935e = f1Var.j();
        this.f449938h = f1Var.A;
        this.f449939i = f1Var.mo132800xfb82e301();
        this.f449940j = f1Var.mo132802xfb85f7b0();
    }

    public static /* synthetic */ void a(int i17) {
        java.lang.String str = (i17 == 1 || i17 == 2 || i17 == 3 || i17 == 5 || i17 == 7 || i17 == 9 || i17 == 11 || i17 == 19 || i17 == 13 || i17 == 14 || i17 == 16 || i17 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 1 || i17 == 2 || i17 == 3 || i17 == 5 || i17 == 7 || i17 == 9 || i17 == 11 || i17 == 19 || i17 == 13 || i17 == 14 || i17 == 16 || i17 == 17) ? 2 : 3];
        switch (i17) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = "type";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d;
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i17 == 1) {
            objArr[1] = "setOwner";
        } else if (i17 == 2) {
            objArr[1] = "setOriginal";
        } else if (i17 == 3) {
            objArr[1] = "setPreserveSourceElement";
        } else if (i17 == 5) {
            objArr[1] = "setReturnType";
        } else if (i17 == 7) {
            objArr[1] = "setModality";
        } else if (i17 == 9) {
            objArr[1] = "setVisibility";
        } else if (i17 == 11) {
            objArr[1] = "setKind";
        } else if (i17 == 19) {
            objArr[1] = "setName";
        } else if (i17 == 13) {
            objArr[1] = "setTypeParameters";
        } else if (i17 == 14) {
            objArr[1] = "setDispatchReceiverParameter";
        } else if (i17 == 16) {
            objArr[1] = "setSubstitution";
        } else if (i17 != 17) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        } else {
            objArr[1] = "setCopyOverrides";
        }
        switch (i17) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 1 && i17 != 2 && i17 != 3 && i17 != 5 && i17 != 7 && i17 != 9 && i17 != 11 && i17 != 19 && i17 != 13 && i17 != 14 && i17 != 16 && i17 != 17) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    public o06.o1 b() {
        o06.r1 r1Var;
        r06.i1 i1Var;
        r06.g1 g1Var;
        r06.h1 h1Var;
        yz5.a aVar;
        r06.f1 f1Var = this.f449941k;
        f1Var.getClass();
        o06.m mVar = this.f449931a;
        o06.t0 t0Var = this.f449932b;
        o06.g0 g0Var = this.f449933c;
        o06.o1 o1Var = this.f449934d;
        o06.c cVar = this.f449935e;
        n16.g gVar = this.f449939i;
        o06.x1 x1Var = o06.x1.f423537a;
        r06.f1 w07 = f1Var.w0(mVar, t0Var, g0Var, o1Var, cVar, gVar, x1Var);
        java.util.List mo132803xb121b9ba = f1Var.mo132803xb121b9ba();
        java.util.ArrayList arrayList = new java.util.ArrayList(mo132803xb121b9ba.size());
        f26.v2 b17 = f26.z.b(mo132803xb121b9ba, this.f449936f, w07, arrayList);
        f26.d3 d3Var = f26.d3.f340678h;
        f26.o0 o0Var = this.f449940j;
        f26.o0 k17 = b17.k(o0Var, d3Var);
        if (k17 != null) {
            f26.d3 d3Var2 = f26.d3.f340677g;
            f26.o0 k18 = b17.k(o0Var, d3Var2);
            if (k18 != null) {
                w07.z0(k18);
            }
            o06.r1 r1Var2 = this.f449938h;
            if (r1Var2 != null) {
                o06.r1 d17 = ((r06.g) r1Var2).d(b17);
                r1Var = d17 != null ? d17 : null;
            }
            o06.r1 r1Var3 = f1Var.B;
            if (r1Var3 != null) {
                r06.g gVar2 = (r06.g) r1Var3;
                f26.o0 k19 = b17.k(gVar2.mo132802xfb85f7b0(), d3Var2);
                i1Var = k19 == null ? null : new r06.i1(w07, new z16.d(w07, k19, gVar2.mo150378x754a37bb()), gVar2.mo9601xa083c1ee());
            } else {
                i1Var = null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = f1Var.f449953z.iterator();
            while (it.hasNext()) {
                r06.g gVar3 = (r06.g) ((o06.r1) it.next());
                f26.o0 k27 = b17.k(gVar3.mo132802xfb85f7b0(), f26.d3.f340677g);
                r06.i1 i1Var2 = k27 == null ? null : new r06.i1(w07, new z16.c(w07, k27, ((z16.f) gVar3.mo150378x754a37bb()).a(), gVar3.mo150378x754a37bb()), gVar3.mo9601xa083c1ee());
                if (i1Var2 != null) {
                    arrayList2.add(i1Var2);
                }
            }
            w07.A0(k17, arrayList, r1Var, i1Var, arrayList2);
            r06.g1 g1Var2 = f1Var.D;
            o06.c cVar2 = o06.c.FAKE_OVERRIDE;
            if (g1Var2 == null) {
                g1Var = null;
            } else {
                p06.k mo9601xa083c1ee = g1Var2.mo9601xa083c1ee();
                o06.t0 t0Var2 = this.f449932b;
                o06.g0 mo9617x61f71b08 = f1Var.D.mo9617x61f71b08();
                if (this.f449935e == cVar2 && o06.f0.e(o06.f0.g(((o06.r) mo9617x61f71b08).f423514a.c()))) {
                    mo9617x61f71b08 = o06.f0.f423481h;
                }
                o06.g0 g0Var2 = mo9617x61f71b08;
                r06.g1 g1Var3 = f1Var.D;
                boolean z17 = g1Var3.f449915h;
                boolean z18 = g1Var3.f449916i;
                boolean z19 = g1Var3.f449919o;
                o06.c cVar3 = this.f449935e;
                o06.o1 o1Var2 = this.f449934d;
                g1Var = new r06.g1(w07, mo9601xa083c1ee, t0Var2, g0Var2, z17, z18, z19, cVar3, o1Var2 == null ? null : o1Var2.c(), x1Var);
            }
            if (g1Var != null) {
                r06.g1 g1Var4 = f1Var.D;
                f26.o0 o0Var2 = g1Var4.f449956s;
                g1Var.f449922r = r06.f1.x0(b17, g1Var4);
                g1Var.w0(o0Var2 != null ? b17.k(o0Var2, f26.d3.f340678h) : null);
            }
            p06.a aVar2 = f1Var.E;
            if (aVar2 == null) {
                h1Var = null;
            } else {
                p06.k mo9601xa083c1ee2 = ((p06.b) aVar2).mo9601xa083c1ee();
                o06.t0 t0Var3 = this.f449932b;
                o06.g0 mo9617x61f71b082 = ((r06.d1) f1Var.E).mo9617x61f71b08();
                if (this.f449935e == cVar2 && o06.f0.e(o06.f0.g(((o06.r) mo9617x61f71b082).f423514a.c()))) {
                    mo9617x61f71b082 = o06.f0.f423481h;
                }
                o06.g0 g0Var3 = mo9617x61f71b082;
                r06.d1 d1Var = (r06.d1) f1Var.E;
                boolean z27 = d1Var.f449915h;
                boolean z28 = d1Var.f449916i;
                boolean z29 = d1Var.f449919o;
                o06.c cVar4 = this.f449935e;
                o06.o1 o1Var3 = this.f449934d;
                h1Var = new r06.h1(w07, mo9601xa083c1ee2, t0Var3, g0Var3, z27, z28, z29, cVar4, o1Var3 == null ? null : o1Var3.b(), x1Var);
            }
            if (h1Var != null) {
                java.util.List w08 = r06.j0.w0(h1Var, ((r06.h1) f1Var.E).W(), b17, false, false, null);
                if (w08 == null) {
                    w08 = java.util.Collections.singletonList(r06.h1.v0(h1Var, v16.f.e(this.f449931a).o(), ((p06.b) ((o06.l2) ((r06.h1) f1Var.E).W().get(0))).mo9601xa083c1ee()));
                }
                if (w08.size() != 1) {
                    throw new java.lang.IllegalStateException();
                }
                h1Var.f449922r = r06.f1.x0(b17, f1Var.E);
                o06.l2 l2Var = (o06.l2) w08.get(0);
                if (l2Var == null) {
                    r06.h1.G(6);
                    throw null;
                }
                h1Var.f449960s = l2Var;
            }
            p06.a aVar3 = f1Var.F;
            r06.f0 f0Var = aVar3 == null ? null : new r06.f0(((p06.b) aVar3).mo9601xa083c1ee(), w07);
            p06.a aVar4 = f1Var.G;
            w07.y0(g1Var, h1Var, f0Var, aVar4 != null ? new r06.f0(((p06.b) aVar4).mo9601xa083c1ee(), w07) : null);
            if (this.f449937g) {
                o26.u a17 = o26.u.f424147f.a();
                java.util.Iterator it6 = f1Var.i().iterator();
                while (it6.hasNext()) {
                    a17.add(((o06.o1) it6.next()).d(b17));
                }
                w07.M(a17);
            }
            if (!f1Var.C() || (aVar = f1Var.f450075n) == null) {
                return w07;
            }
            w07.s0(f1Var.f450074m, aVar);
            return w07;
        }
        return null;
    }
}
