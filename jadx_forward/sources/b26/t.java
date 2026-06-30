package b26;

/* loaded from: classes16.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final b26.q f99048a;

    /* renamed from: b, reason: collision with root package name */
    public final k16.g f99049b;

    /* renamed from: c, reason: collision with root package name */
    public final o06.m f99050c;

    /* renamed from: d, reason: collision with root package name */
    public final k16.k f99051d;

    /* renamed from: e, reason: collision with root package name */
    public final k16.m f99052e;

    /* renamed from: f, reason: collision with root package name */
    public final k16.a f99053f;

    /* renamed from: g, reason: collision with root package name */
    public final d26.z f99054g;

    /* renamed from: h, reason: collision with root package name */
    public final b26.j1 f99055h;

    /* renamed from: i, reason: collision with root package name */
    public final b26.s0 f99056i;

    public t(b26.q components, k16.g nameResolver, o06.m containingDeclaration, k16.k typeTable, k16.m versionRequirementTable, k16.a metadataVersion, d26.z zVar, b26.j1 j1Var, java.util.List typeParameters) {
        java.lang.String a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(components, "components");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameResolver, "nameResolver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containingDeclaration, "containingDeclaration");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeTable, "typeTable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(versionRequirementTable, "versionRequirementTable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(metadataVersion, "metadataVersion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeParameters, "typeParameters");
        this.f99048a = components;
        this.f99049b = nameResolver;
        this.f99050c = containingDeclaration;
        this.f99051d = typeTable;
        this.f99052e = versionRequirementTable;
        this.f99053f = metadataVersion;
        this.f99054g = zVar;
        this.f99055h = new b26.j1(this, j1Var, typeParameters, "Deserializer for \"" + containingDeclaration.mo132800xfb82e301() + '\"', (zVar == null || (a17 = zVar.a()) == null) ? "[container not found]" : a17);
        this.f99056i = new b26.s0(this);
    }

    public static /* synthetic */ b26.t b(b26.t tVar, o06.m mVar, java.util.List list, k16.g gVar, k16.k kVar, k16.m mVar2, k16.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            gVar = tVar.f99049b;
        }
        k16.g gVar2 = gVar;
        if ((i17 & 8) != 0) {
            kVar = tVar.f99051d;
        }
        k16.k kVar2 = kVar;
        if ((i17 & 16) != 0) {
            mVar2 = tVar.f99052e;
        }
        k16.m mVar3 = mVar2;
        if ((i17 & 32) != 0) {
            aVar = tVar.f99053f;
        }
        return tVar.a(mVar, list, gVar2, kVar2, mVar3, aVar);
    }

    public final b26.t a(o06.m descriptor, java.util.List typeParameterProtos, k16.g nameResolver, k16.k typeTable, k16.m versionRequirementTable, k16.a metadataVersion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeParameterProtos, "typeParameterProtos");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameResolver, "nameResolver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeTable, "typeTable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(versionRequirementTable, "versionRequirementTable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(metadataVersion, "metadataVersion");
        b26.q qVar = this.f99048a;
        boolean z17 = true;
        int i17 = metadataVersion.f384958b;
        if ((i17 != 1 || metadataVersion.f384959c < 4) && i17 <= 1) {
            z17 = false;
        }
        return new b26.t(qVar, nameResolver, descriptor, typeTable, z17 ? versionRequirementTable : this.f99052e, metadataVersion, this.f99054g, this.f99055h, typeParameterProtos);
    }
}
