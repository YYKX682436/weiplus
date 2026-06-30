package h16;

/* loaded from: classes15.dex */
public class h implements g16.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h16.n f359772a;

    public h(h16.n nVar, h16.d dVar) {
        this.f359772a = nVar;
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
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
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
        boolean equals = "k".equals(h17);
        h16.n nVar = this.f359772a;
        if (equals) {
            if (obj instanceof java.lang.Integer) {
                int intValue = ((java.lang.Integer) obj).intValue();
                h16.b.f359752e.getClass();
                h16.b bVar = (h16.b) ((java.util.LinkedHashMap) h16.b.f359753f).get(java.lang.Integer.valueOf(intValue));
                if (bVar == null) {
                    bVar = h16.b.f359754g;
                }
                nVar.f359787h = bVar;
                return;
            }
            return;
        }
        if ("mv".equals(h17)) {
            if (obj instanceof int[]) {
                nVar.f359780a = (int[]) obj;
                return;
            }
            return;
        }
        if ("xs".equals(h17)) {
            if (obj instanceof java.lang.String) {
                java.lang.String str = (java.lang.String) obj;
                if (str.isEmpty()) {
                    return;
                }
                nVar.f359781b = str;
                return;
            }
            return;
        }
        if ("xi".equals(h17)) {
            if (obj instanceof java.lang.Integer) {
                nVar.f359782c = ((java.lang.Integer) obj).intValue();
            }
        } else if ("pn".equals(h17) && (obj instanceof java.lang.String)) {
            java.lang.String str2 = (java.lang.String) obj;
            if (str2.isEmpty()) {
                return;
            }
            nVar.f359783d = str2;
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
        if ("d1".equals(h17)) {
            return new h16.f(this);
        }
        if ("d2".equals(h17)) {
            return new h16.g(this);
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
