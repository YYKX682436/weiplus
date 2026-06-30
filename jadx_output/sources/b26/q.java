package b26;

/* loaded from: classes16.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final e26.c0 f17483a;

    /* renamed from: b, reason: collision with root package name */
    public final o06.v0 f17484b;

    /* renamed from: c, reason: collision with root package name */
    public final b26.s f17485c;

    /* renamed from: d, reason: collision with root package name */
    public final b26.j f17486d;

    /* renamed from: e, reason: collision with root package name */
    public final b26.d f17487e;

    /* renamed from: f, reason: collision with root package name */
    public final o06.e1 f17488f;

    /* renamed from: g, reason: collision with root package name */
    public final b26.j0 f17489g;

    /* renamed from: h, reason: collision with root package name */
    public final b26.c0 f17490h;

    /* renamed from: i, reason: collision with root package name */
    public final w06.c f17491i;

    /* renamed from: j, reason: collision with root package name */
    public final b26.e0 f17492j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Iterable f17493k;

    /* renamed from: l, reason: collision with root package name */
    public final o06.c1 f17494l;

    /* renamed from: m, reason: collision with root package name */
    public final b26.p f17495m;

    /* renamed from: n, reason: collision with root package name */
    public final q06.b f17496n;

    /* renamed from: o, reason: collision with root package name */
    public final q06.f f17497o;

    /* renamed from: p, reason: collision with root package name */
    public final p16.l f17498p;

    /* renamed from: q, reason: collision with root package name */
    public final g26.u f17499q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f17500r;

    /* renamed from: s, reason: collision with root package name */
    public final b26.a0 f17501s;

    /* renamed from: t, reason: collision with root package name */
    public final b26.m f17502t;

    public q(e26.c0 storageManager, o06.v0 moduleDescriptor, b26.s configuration, b26.j classDataFinder, b26.d annotationAndConstantLoader, o06.e1 packageFragmentProvider, b26.j0 localClassifierTypeSettings, b26.c0 errorReporter, w06.c lookupTracker, b26.e0 flexibleTypeDeserializer, java.lang.Iterable fictitiousClassDescriptorFactories, o06.c1 notFoundClasses, b26.p contractDeserializer, q06.b additionalClassPartsProvider, q06.f platformDependentDeclarationFilter, p16.l extensionRegistryLite, g26.u kotlinTypeChecker, x16.a samConversionResolver, java.util.List typeAttributeTranslators, b26.a0 enumEntriesDeserializationSupport) {
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        kotlin.jvm.internal.o.g(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.o.g(configuration, "configuration");
        kotlin.jvm.internal.o.g(classDataFinder, "classDataFinder");
        kotlin.jvm.internal.o.g(annotationAndConstantLoader, "annotationAndConstantLoader");
        kotlin.jvm.internal.o.g(packageFragmentProvider, "packageFragmentProvider");
        kotlin.jvm.internal.o.g(localClassifierTypeSettings, "localClassifierTypeSettings");
        kotlin.jvm.internal.o.g(errorReporter, "errorReporter");
        kotlin.jvm.internal.o.g(lookupTracker, "lookupTracker");
        kotlin.jvm.internal.o.g(flexibleTypeDeserializer, "flexibleTypeDeserializer");
        kotlin.jvm.internal.o.g(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        kotlin.jvm.internal.o.g(notFoundClasses, "notFoundClasses");
        kotlin.jvm.internal.o.g(contractDeserializer, "contractDeserializer");
        kotlin.jvm.internal.o.g(additionalClassPartsProvider, "additionalClassPartsProvider");
        kotlin.jvm.internal.o.g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        kotlin.jvm.internal.o.g(extensionRegistryLite, "extensionRegistryLite");
        kotlin.jvm.internal.o.g(kotlinTypeChecker, "kotlinTypeChecker");
        kotlin.jvm.internal.o.g(samConversionResolver, "samConversionResolver");
        kotlin.jvm.internal.o.g(typeAttributeTranslators, "typeAttributeTranslators");
        kotlin.jvm.internal.o.g(enumEntriesDeserializationSupport, "enumEntriesDeserializationSupport");
        this.f17483a = storageManager;
        this.f17484b = moduleDescriptor;
        this.f17485c = configuration;
        this.f17486d = classDataFinder;
        this.f17487e = annotationAndConstantLoader;
        this.f17488f = packageFragmentProvider;
        this.f17489g = localClassifierTypeSettings;
        this.f17490h = errorReporter;
        this.f17491i = lookupTracker;
        this.f17492j = flexibleTypeDeserializer;
        this.f17493k = fictitiousClassDescriptorFactories;
        this.f17494l = notFoundClasses;
        this.f17495m = contractDeserializer;
        this.f17496n = additionalClassPartsProvider;
        this.f17497o = platformDependentDeclarationFilter;
        this.f17498p = extensionRegistryLite;
        this.f17499q = kotlinTypeChecker;
        this.f17500r = typeAttributeTranslators;
        this.f17501s = enumEntriesDeserializationSupport;
        this.f17502t = new b26.m(this);
    }

    public final b26.t a(o06.d1 descriptor, k16.g nameResolver, k16.k typeTable, k16.m versionRequirementTable, k16.a metadataVersion, d26.z zVar) {
        kotlin.jvm.internal.o.g(descriptor, "descriptor");
        kotlin.jvm.internal.o.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.o.g(typeTable, "typeTable");
        kotlin.jvm.internal.o.g(versionRequirementTable, "versionRequirementTable");
        kotlin.jvm.internal.o.g(metadataVersion, "metadataVersion");
        return new b26.t(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, zVar, null, kz5.p0.f313996d);
    }

    public final o06.g b(n16.b classId) {
        kotlin.jvm.internal.o.g(classId, "classId");
        java.util.Set set = b26.m.f17466c;
        return this.f17502t.a(classId, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(e26.c0 r24, o06.v0 r25, b26.s r26, b26.j r27, b26.d r28, o06.e1 r29, b26.j0 r30, b26.c0 r31, w06.c r32, b26.e0 r33, java.lang.Iterable r34, o06.c1 r35, b26.p r36, q06.b r37, q06.f r38, p16.l r39, g26.u r40, x16.a r41, java.util.List r42, b26.a0 r43, int r44, kotlin.jvm.internal.i r45) {
        /*
            r23 = this;
            r0 = r44
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto Lb
            q06.a r1 = q06.a.f359477a
            r16 = r1
            goto Ld
        Lb:
            r16 = r37
        Ld:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L16
            q06.d r1 = q06.d.f359478a
            r17 = r1
            goto L18
        L16:
            r17 = r38
        L18:
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L27
            g26.t r1 = g26.u.f268014b
            r1.getClass()
            g26.v r1 = g26.t.f268013b
            r19 = r1
            goto L29
        L27:
            r19 = r40
        L29:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L37
            f26.t r1 = f26.t.f259216a
            java.util.List r1 = kz5.b0.c(r1)
            r21 = r1
            goto L39
        L37:
            r21 = r42
        L39:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L43
            b26.z r0 = b26.z.f17548a
            r22 = r0
            goto L45
        L43:
            r22 = r43
        L45:
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            r15 = r36
            r18 = r39
            r20 = r41
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b26.q.<init>(e26.c0, o06.v0, b26.s, b26.j, b26.d, o06.e1, b26.j0, b26.c0, w06.c, b26.e0, java.lang.Iterable, o06.c1, b26.p, q06.b, q06.f, p16.l, g26.u, x16.a, java.util.List, b26.a0, int, kotlin.jvm.internal.i):void");
    }
}
