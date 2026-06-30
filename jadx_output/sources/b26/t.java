package b26;

/* loaded from: classes16.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final b26.q f17515a;

    /* renamed from: b, reason: collision with root package name */
    public final k16.g f17516b;

    /* renamed from: c, reason: collision with root package name */
    public final o06.m f17517c;

    /* renamed from: d, reason: collision with root package name */
    public final k16.k f17518d;

    /* renamed from: e, reason: collision with root package name */
    public final k16.m f17519e;

    /* renamed from: f, reason: collision with root package name */
    public final k16.a f17520f;

    /* renamed from: g, reason: collision with root package name */
    public final d26.z f17521g;

    /* renamed from: h, reason: collision with root package name */
    public final b26.j1 f17522h;

    /* renamed from: i, reason: collision with root package name */
    public final b26.s0 f17523i;

    public t(b26.q components, k16.g nameResolver, o06.m containingDeclaration, k16.k typeTable, k16.m versionRequirementTable, k16.a metadataVersion, d26.z zVar, b26.j1 j1Var, java.util.List typeParameters) {
        java.lang.String a17;
        kotlin.jvm.internal.o.g(components, "components");
        kotlin.jvm.internal.o.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.o.g(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.o.g(typeTable, "typeTable");
        kotlin.jvm.internal.o.g(versionRequirementTable, "versionRequirementTable");
        kotlin.jvm.internal.o.g(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.o.g(typeParameters, "typeParameters");
        this.f17515a = components;
        this.f17516b = nameResolver;
        this.f17517c = containingDeclaration;
        this.f17518d = typeTable;
        this.f17519e = versionRequirementTable;
        this.f17520f = metadataVersion;
        this.f17521g = zVar;
        this.f17522h = new b26.j1(this, j1Var, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + '\"', (zVar == null || (a17 = zVar.a()) == null) ? "[container not found]" : a17);
        this.f17523i = new b26.s0(this);
    }

    public static /* synthetic */ b26.t b(b26.t tVar, o06.m mVar, java.util.List list, k16.g gVar, k16.k kVar, k16.m mVar2, k16.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            gVar = tVar.f17516b;
        }
        k16.g gVar2 = gVar;
        if ((i17 & 8) != 0) {
            kVar = tVar.f17518d;
        }
        k16.k kVar2 = kVar;
        if ((i17 & 16) != 0) {
            mVar2 = tVar.f17519e;
        }
        k16.m mVar3 = mVar2;
        if ((i17 & 32) != 0) {
            aVar = tVar.f17520f;
        }
        return tVar.a(mVar, list, gVar2, kVar2, mVar3, aVar);
    }

    public final b26.t a(o06.m descriptor, java.util.List typeParameterProtos, k16.g nameResolver, k16.k typeTable, k16.m versionRequirementTable, k16.a metadataVersion) {
        kotlin.jvm.internal.o.g(descriptor, "descriptor");
        kotlin.jvm.internal.o.g(typeParameterProtos, "typeParameterProtos");
        kotlin.jvm.internal.o.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.o.g(typeTable, "typeTable");
        kotlin.jvm.internal.o.g(versionRequirementTable, "versionRequirementTable");
        kotlin.jvm.internal.o.g(metadataVersion, "metadataVersion");
        b26.q qVar = this.f17515a;
        boolean z17 = true;
        int i17 = metadataVersion.f303425b;
        if ((i17 != 1 || metadataVersion.f303426c < 4) && i17 <= 1) {
            z17 = false;
        }
        return new b26.t(qVar, nameResolver, descriptor, typeTable, z17 ? versionRequirementTable : this.f17519e, metadataVersion, this.f17521g, this.f17522h, typeParameterProtos);
    }
}
