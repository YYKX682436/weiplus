package r06;

/* loaded from: classes16.dex */
public class i0 implements o06.m0 {

    /* renamed from: a */
    public f26.q2 f449963a;

    /* renamed from: b */
    public o06.m f449964b;

    /* renamed from: c */
    public o06.t0 f449965c;

    /* renamed from: d */
    public o06.g0 f449966d;

    /* renamed from: e */
    public o06.n0 f449967e;

    /* renamed from: f */
    public o06.c f449968f;

    /* renamed from: g */
    public java.util.List f449969g;

    /* renamed from: h */
    public final java.util.List f449970h;

    /* renamed from: i */
    public o06.r1 f449971i;

    /* renamed from: j */
    public o06.r1 f449972j;

    /* renamed from: k */
    public f26.o0 f449973k;

    /* renamed from: l */
    public n16.g f449974l;

    /* renamed from: m */
    public boolean f449975m;

    /* renamed from: n */
    public boolean f449976n;

    /* renamed from: o */
    public boolean f449977o;

    /* renamed from: p */
    public boolean f449978p;

    /* renamed from: q */
    public boolean f449979q;

    /* renamed from: r */
    public java.util.List f449980r;

    /* renamed from: s */
    public p06.k f449981s;

    /* renamed from: t */
    public boolean f449982t;

    /* renamed from: u */
    public final java.util.Map f449983u;

    /* renamed from: v */
    public java.lang.Boolean f449984v;

    /* renamed from: w */
    public boolean f449985w;

    /* renamed from: x */
    public final /* synthetic */ r06.j0 f449986x;

    public i0(r06.j0 j0Var, f26.q2 q2Var, o06.m mVar, o06.t0 t0Var, o06.g0 g0Var, o06.c cVar, java.util.List list, java.util.List list2, o06.r1 r1Var, f26.o0 o0Var, n16.g gVar) {
        if (q2Var == null) {
            q(0);
            throw null;
        }
        if (mVar == null) {
            q(1);
            throw null;
        }
        if (t0Var == null) {
            q(2);
            throw null;
        }
        if (g0Var == null) {
            q(3);
            throw null;
        }
        if (cVar == null) {
            q(4);
            throw null;
        }
        if (list == null) {
            q(5);
            throw null;
        }
        if (list2 == null) {
            q(6);
            throw null;
        }
        if (o0Var == null) {
            q(7);
            throw null;
        }
        this.f449986x = j0Var;
        this.f449967e = null;
        this.f449972j = j0Var.f449996p;
        this.f449975m = true;
        this.f449976n = false;
        this.f449977o = false;
        this.f449978p = false;
        this.f449979q = j0Var.f450006z;
        this.f449980r = null;
        this.f449981s = null;
        this.f449982t = j0Var.A;
        this.f449983u = new java.util.LinkedHashMap();
        this.f449984v = null;
        this.f449985w = false;
        this.f449963a = q2Var;
        this.f449964b = mVar;
        this.f449965c = t0Var;
        this.f449966d = g0Var;
        this.f449968f = cVar;
        this.f449969g = list;
        this.f449970h = list2;
        this.f449971i = r1Var;
        this.f449973k = o0Var;
        this.f449974l = gVar;
    }

    public static /* synthetic */ void q(int i17) {
        java.lang.String str;
        int i18;
        switch (i17) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i17) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                i18 = 2;
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                i18 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i18];
        switch (i17) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 17:
                objArr[0] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d;
                break;
            case 19:
            case 21:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = "type";
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case 35:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i17) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case 16:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case 28:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case 29:
                objArr[1] = "setOriginal";
                break;
            case 30:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case 32:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case 38:
                objArr[1] = "setSubstitution";
                break;
            case 40:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case 42:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i17) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case 12:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case 19:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case 35:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i17) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                throw new java.lang.IllegalStateException(format);
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }

    @Override // o06.m0
    public o06.m0 a(o06.r1 r1Var) {
        this.f449972j = r1Var;
        return this;
    }

    @Override // o06.m0
    public o06.m0 b() {
        this.f449979q = true;
        return this;
    }

    @Override // o06.m0
    /* renamed from: build */
    public o06.n0 mo132797x59bc66e() {
        return this.f449986x.v0(this);
    }

    @Override // o06.m0
    public o06.m0 c(p06.k kVar) {
        if (kVar != null) {
            this.f449981s = kVar;
            return this;
        }
        q(35);
        throw null;
    }

    @Override // o06.m0
    public o06.m0 d() {
        this.f449977o = true;
        return this;
    }

    @Override // o06.m0
    public o06.m0 e(boolean z17) {
        this.f449975m = z17;
        return this;
    }

    @Override // o06.m0
    public o06.m0 f(o06.m mVar) {
        if (mVar != null) {
            this.f449964b = mVar;
            return this;
        }
        q(8);
        throw null;
    }

    @Override // o06.m0
    public o06.m0 g(java.util.List list) {
        if (list != null) {
            this.f449980r = list;
            return this;
        }
        q(21);
        throw null;
    }

    @Override // o06.m0
    public o06.m0 h(o06.g0 g0Var) {
        if (g0Var != null) {
            this.f449966d = g0Var;
            return this;
        }
        q(12);
        throw null;
    }

    @Override // o06.m0
    public o06.m0 i(java.util.List list) {
        if (list != null) {
            this.f449969g = list;
            return this;
        }
        q(19);
        throw null;
    }

    @Override // o06.m0
    public o06.m0 j(o06.a aVar, java.lang.Object obj) {
        if (aVar != null) {
            this.f449983u.put(aVar, obj);
            return this;
        }
        q(39);
        throw null;
    }

    @Override // o06.m0
    public o06.m0 k(o06.c cVar) {
        if (cVar != null) {
            this.f449968f = cVar;
            return this;
        }
        q(14);
        throw null;
    }

    @Override // o06.m0
    public o06.m0 l() {
        this.f449982t = true;
        return this;
    }

    @Override // o06.m0
    public o06.m0 m(f26.o0 o0Var) {
        if (o0Var != null) {
            this.f449973k = o0Var;
            return this;
        }
        q(23);
        throw null;
    }

    @Override // o06.m0
    public o06.m0 n(o06.t0 t0Var) {
        if (t0Var != null) {
            this.f449965c = t0Var;
            return this;
        }
        q(10);
        throw null;
    }

    @Override // o06.m0
    public o06.m0 o(n16.g gVar) {
        if (gVar != null) {
            this.f449974l = gVar;
            return this;
        }
        q(17);
        throw null;
    }

    @Override // o06.m0
    public o06.m0 p() {
        this.f449976n = true;
        return this;
    }
}
