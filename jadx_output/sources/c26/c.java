package c26;

/* loaded from: classes16.dex */
public final class c implements l06.c {

    /* renamed from: b, reason: collision with root package name */
    public final c26.f f38082b = new c26.f();

    public o06.e1 a(e26.c0 storageManager, o06.v0 builtInsModule, java.lang.Iterable classDescriptorFactories, q06.f platformDependentDeclarationFilter, q06.b additionalClassPartsProvider, boolean z17) {
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        kotlin.jvm.internal.o.g(builtInsModule, "builtInsModule");
        kotlin.jvm.internal.o.g(classDescriptorFactories, "classDescriptorFactories");
        kotlin.jvm.internal.o.g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        kotlin.jvm.internal.o.g(additionalClassPartsProvider, "additionalClassPartsProvider");
        java.util.Set<n16.c> packageFqNames = l06.x.f314961p;
        c26.b bVar = new c26.b(this.f38082b);
        kotlin.jvm.internal.o.g(packageFqNames, "packageFqNames");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(packageFqNames, 10));
        for (n16.c cVar : packageFqNames) {
            java.lang.String a17 = c26.a.f38081q.a(cVar);
            java.io.InputStream inputStream = (java.io.InputStream) bVar.invoke(a17);
            if (inputStream == null) {
                throw new java.lang.IllegalStateException("Resource not found in classpath: " + a17);
            }
            arrayList.add(c26.e.f38083s.a(cVar, storageManager, builtInsModule, inputStream, z17));
        }
        o06.h1 h1Var = new o06.h1(arrayList);
        o06.c1 c1Var = new o06.c1(storageManager, builtInsModule);
        b26.r rVar = b26.r.f17506a;
        b26.u uVar = new b26.u(h1Var);
        c26.a aVar = c26.a.f38081q;
        b26.e eVar = new b26.e(builtInsModule, c1Var, aVar);
        b26.i0 i0Var = b26.i0.f17447a;
        b26.c0 c0Var = b26.c0.f17422a;
        w06.b bVar2 = w06.b.f441945a;
        b26.d0 d0Var = b26.d0.f17424a;
        int i17 = b26.p.f17479a;
        b26.q qVar = new b26.q(storageManager, builtInsModule, rVar, uVar, eVar, h1Var, i0Var, c0Var, bVar2, d0Var, classDescriptorFactories, c1Var, b26.o.f17475a, additionalClassPartsProvider, platformDependentDeclarationFilter, aVar.f919a, null, new x16.b(storageManager, kz5.p0.f313996d), null, null, 851968, null);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c26.e) it.next()).u0(qVar);
        }
        return h1Var;
    }
}
