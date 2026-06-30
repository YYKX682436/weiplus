package h16;

/* loaded from: classes15.dex */
public class m implements g16.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h16.n f359777a;

    public m(h16.n nVar, h16.d dVar) {
        this.f359777a = nVar;
    }

    public static /* synthetic */ void g(int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i17 == 1) {
            objArr[0] = "enumClassId";
        } else if (i17 == 2) {
            objArr[0] = "enumEntryName";
        } else if (i17 != 3) {
            objArr[0] = "classLiteralValue";
        } else {
            objArr[0] = "classId";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
        if (i17 == 1 || i17 == 2) {
            objArr[2] = "visitEnum";
        } else if (i17 != 3) {
            objArr[2] = "visitClassLiteral";
        } else {
            objArr[2] = "visitAnnotation";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // g16.m0
    public void a() {
    }

    @Override // g16.m0
    public void b(n16.g gVar, java.lang.Object obj) {
        if (gVar == null) {
            return;
        }
        java.lang.String h17 = gVar.h();
        boolean equals = "version".equals(h17);
        h16.n nVar = this.f359777a;
        if (equals) {
            if (obj instanceof int[]) {
                nVar.f359780a = (int[]) obj;
            }
        } else if ("multifileClassName".equals(h17)) {
            nVar.f359781b = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        }
    }

    @Override // g16.m0
    public void c(n16.g gVar, n16.b bVar, n16.g gVar2) {
        if (bVar == null) {
            g(1);
            throw null;
        }
        if (gVar2 != null) {
            return;
        }
        g(2);
        throw null;
    }

    @Override // g16.m0
    public g16.n0 d(n16.g gVar) {
        java.lang.String h17 = gVar != null ? gVar.h() : null;
        if (com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306.equals(h17) || "filePartClassNames".equals(h17)) {
            return new h16.k(this);
        }
        if ("strings".equals(h17)) {
            return new h16.l(this);
        }
        return null;
    }

    @Override // g16.m0
    public g16.m0 e(n16.g gVar, n16.b bVar) {
        if (bVar != null) {
            return null;
        }
        g(3);
        throw null;
    }

    @Override // g16.m0
    public void f(n16.g gVar, t16.f fVar) {
        if (fVar != null) {
            return;
        }
        g(0);
        throw null;
    }
}
