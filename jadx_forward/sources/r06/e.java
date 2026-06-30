package r06;

/* loaded from: classes16.dex */
public abstract class e extends r06.s0 {

    /* renamed from: d, reason: collision with root package name */
    public final n16.g f449923d;

    /* renamed from: e, reason: collision with root package name */
    public final e26.x f449924e;

    /* renamed from: f, reason: collision with root package name */
    public final e26.x f449925f;

    /* renamed from: g, reason: collision with root package name */
    public final e26.x f449926g;

    public e(e26.c0 c0Var, n16.g gVar) {
        if (c0Var == null) {
            j0(0);
            throw null;
        }
        if (gVar == null) {
            j0(1);
            throw null;
        }
        this.f449923d = gVar;
        e26.u uVar = (e26.u) c0Var;
        this.f449924e = uVar.b(new r06.b(this));
        this.f449925f = uVar.b(new r06.c(this));
        this.f449926g = uVar.b(new r06.d(this));
    }

    public static /* synthetic */ void j0(int i17) {
        java.lang.String str = (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5 || i17 == 6 || i17 == 9 || i17 == 12 || i17 == 14 || i17 == 16 || i17 == 17 || i17 == 19 || i17 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5 || i17 == 6 || i17 == 9 || i17 == 12 || i17 == 14 || i17 == 16 || i17 == 17 || i17 == 19 || i17 == 20) ? 2 : 3];
        switch (i17) {
            case 1:
                objArr[0] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i17 == 2) {
            objArr[1] = "getName";
        } else if (i17 == 3) {
            objArr[1] = "getOriginal";
        } else if (i17 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i17 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i17 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i17 == 9 || i17 == 12 || i17 == 14 || i17 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i17 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i17 == 19) {
            objArr[1] = "substitute";
        } else if (i17 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i17) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 2 && i17 != 3 && i17 != 4 && i17 != 5 && i17 != 6 && i17 != 9 && i17 != 12 && i17 != 14 && i17 != 16 && i17 != 17 && i17 != 19 && i17 != 20) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    @Override // o06.g
    public y16.s A() {
        v16.f.i(r16.i.d(this));
        y16.s P = P(g26.k.f349527a);
        if (P != null) {
            return P;
        }
        j0(17);
        throw null;
    }

    @Override // o06.g
    public y16.s F(f26.q2 q2Var) {
        if (q2Var == null) {
            j0(15);
            throw null;
        }
        v16.f.i(r16.i.d(this));
        y16.s G = G(q2Var, g26.k.f349527a);
        if (G != null) {
            return G;
        }
        j0(16);
        throw null;
    }

    @Override // r06.s0
    public y16.s G(f26.q2 q2Var, g26.l lVar) {
        if (q2Var == null) {
            j0(10);
            throw null;
        }
        if (lVar == null) {
            j0(11);
            throw null;
        }
        if (!q2Var.e()) {
            return new y16.c0(P(lVar), f26.v2.e(q2Var));
        }
        y16.s P = P(lVar);
        if (P != null) {
            return P;
        }
        j0(12);
        throw null;
    }

    @Override // o06.g
    public o06.r1 R() {
        o06.r1 r1Var = (o06.r1) ((e26.o) this.f449926g).mo152xb9724478();
        if (r1Var != null) {
            return r1Var;
        }
        j0(5);
        throw null;
    }

    @Override // r06.s0, o06.g, o06.m
    public o06.g a() {
        return this;
    }

    @Override // o06.g
    public java.util.List f0() {
        java.util.List emptyList = java.util.Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        j0(6);
        throw null;
    }

    @Override // o06.x0
    /* renamed from: getName */
    public n16.g mo132800xfb82e301() {
        n16.g gVar = this.f449923d;
        if (gVar != null) {
            return gVar;
        }
        j0(2);
        throw null;
    }

    @Override // o06.g, o06.j
    public f26.z0 k() {
        f26.z0 z0Var = (f26.z0) ((e26.o) this.f449924e).mo152xb9724478();
        if (z0Var != null) {
            return z0Var;
        }
        j0(20);
        throw null;
    }

    @Override // o06.a2
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public o06.g d(f26.v2 v2Var) {
        if (v2Var != null) {
            return v2Var.h() ? this : new r06.r0(this, v2Var);
        }
        j0(18);
        throw null;
    }

    @Override // o06.m
    public java.lang.Object w(o06.o oVar, java.lang.Object obj) {
        return oVar.f(this, obj);
    }

    @Override // o06.g
    public y16.s z() {
        y16.s sVar = (y16.s) ((e26.o) this.f449925f).mo152xb9724478();
        if (sVar != null) {
            return sVar;
        }
        j0(4);
        throw null;
    }

    @Override // r06.s0, o06.g, o06.m
    public o06.j a() {
        return this;
    }

    @Override // r06.s0, o06.m
    public o06.m a() {
        return this;
    }
}
