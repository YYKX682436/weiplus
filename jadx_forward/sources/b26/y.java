package b26;

/* loaded from: classes16.dex */
public abstract class y extends b26.v {

    /* renamed from: m, reason: collision with root package name */
    public final k16.a f99073m;

    /* renamed from: n, reason: collision with root package name */
    public final d26.z f99074n;

    /* renamed from: o, reason: collision with root package name */
    public final k16.h f99075o;

    /* renamed from: p, reason: collision with root package name */
    public final b26.u0 f99076p;

    /* renamed from: q, reason: collision with root package name */
    public i16.r0 f99077q;

    /* renamed from: r, reason: collision with root package name */
    public y16.s f99078r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(n16.c fqName, e26.c0 storageManager, o06.v0 module, i16.r0 proto, k16.a metadataVersion, d26.z zVar) {
        super(fqName, storageManager, module);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageManager, "storageManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(module, "module");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(metadataVersion, "metadataVersion");
        this.f99073m = metadataVersion;
        this.f99074n = zVar;
        i16.e1 e1Var = proto.f369247g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e1Var, "getStrings(...)");
        i16.b1 b1Var = proto.f369248h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b1Var, "getQualifiedNames(...)");
        k16.h hVar = new k16.h(e1Var, b1Var);
        this.f99075o = hVar;
        this.f99076p = new b26.u0(proto, hVar, metadataVersion, new b26.w(this));
        this.f99077q = proto;
    }

    @Override // o06.d1
    public y16.s V() {
        y16.s sVar = this.f99078r;
        if (sVar != null) {
            return sVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("_memberScope");
        throw null;
    }

    @Override // b26.v
    public void u0(b26.q components) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(components, "components");
        i16.r0 r0Var = this.f99077q;
        if (r0Var == null) {
            throw new java.lang.IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
        }
        this.f99077q = null;
        i16.o0 o0Var = r0Var.f369249i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o0Var, "getPackage(...)");
        this.f99078r = new d26.m0(this, o0Var, this.f99075o, this.f99073m, this.f99074n, components, "scope of " + this, new b26.x(this));
    }
}
