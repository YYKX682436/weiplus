package n06;

/* loaded from: classes16.dex */
public final class d0 extends b26.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e26.c0 storageManager, g16.k0 finder, o06.v0 moduleDescriptor, o06.c1 notFoundClasses, q06.b additionalClassPartsProvider, q06.f platformDependentDeclarationFilter, b26.s deserializationConfiguration, g26.u kotlinTypeChecker, x16.a samConversionResolver) {
        super(storageManager, finder, moduleDescriptor);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageManager, "storageManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finder, "finder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleDescriptor, "moduleDescriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notFoundClasses, "notFoundClasses");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(additionalClassPartsProvider, "additionalClassPartsProvider");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deserializationConfiguration, "deserializationConfiguration");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeChecker, "kotlinTypeChecker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(samConversionResolver, "samConversionResolver");
        b26.u uVar = new b26.u(this);
        c26.a aVar = c26.a.f119614q;
        b26.e eVar = new b26.e(moduleDescriptor, notFoundClasses, aVar);
        b26.i0 i0Var = b26.i0.f98980a;
        b26.c0 c0Var = b26.c0.f98955a;
        w06.b bVar = w06.b.f523478a;
        b26.d0 d0Var = b26.d0.f98957a;
        java.util.List i17 = kz5.c0.i(new m06.a(storageManager, moduleDescriptor), new n06.i(storageManager, moduleDescriptor, null, 4, null));
        int i18 = b26.p.f99012a;
        this.f98948d = new b26.q(storageManager, moduleDescriptor, deserializationConfiguration, uVar, eVar, this, i0Var, c0Var, bVar, d0Var, i17, notFoundClasses, b26.o.f99008a, additionalClassPartsProvider, platformDependentDeclarationFilter, aVar.f82452a, kotlinTypeChecker, samConversionResolver, null, b26.g0.f98973a, 262144, null);
    }

    @Override // b26.b
    public b26.v d(n16.c fqName) {
        java.io.InputStream a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        t06.h hVar = (t06.h) this.f98946b;
        hVar.getClass();
        if (fqName.h(l06.x.f396488j)) {
            a17 = hVar.f496072b.a(c26.a.f119614q.a(fqName));
        } else {
            a17 = null;
        }
        if (a17 != null) {
            return c26.e.f119616s.a(fqName, this.f98945a, this.f98947c, a17, false);
        }
        return null;
    }
}
