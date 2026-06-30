package b26;

/* loaded from: classes16.dex */
public abstract class y extends b26.v {

    /* renamed from: m, reason: collision with root package name */
    public final k16.a f17540m;

    /* renamed from: n, reason: collision with root package name */
    public final d26.z f17541n;

    /* renamed from: o, reason: collision with root package name */
    public final k16.h f17542o;

    /* renamed from: p, reason: collision with root package name */
    public final b26.u0 f17543p;

    /* renamed from: q, reason: collision with root package name */
    public i16.r0 f17544q;

    /* renamed from: r, reason: collision with root package name */
    public y16.s f17545r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(n16.c fqName, e26.c0 storageManager, o06.v0 module, i16.r0 proto, k16.a metadataVersion, d26.z zVar) {
        super(fqName, storageManager, module);
        kotlin.jvm.internal.o.g(fqName, "fqName");
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        kotlin.jvm.internal.o.g(module, "module");
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(metadataVersion, "metadataVersion");
        this.f17540m = metadataVersion;
        this.f17541n = zVar;
        i16.e1 e1Var = proto.f287714g;
        kotlin.jvm.internal.o.f(e1Var, "getStrings(...)");
        i16.b1 b1Var = proto.f287715h;
        kotlin.jvm.internal.o.f(b1Var, "getQualifiedNames(...)");
        k16.h hVar = new k16.h(e1Var, b1Var);
        this.f17542o = hVar;
        this.f17543p = new b26.u0(proto, hVar, metadataVersion, new b26.w(this));
        this.f17544q = proto;
    }

    @Override // o06.d1
    public y16.s V() {
        y16.s sVar = this.f17545r;
        if (sVar != null) {
            return sVar;
        }
        kotlin.jvm.internal.o.o("_memberScope");
        throw null;
    }

    @Override // b26.v
    public void u0(b26.q components) {
        kotlin.jvm.internal.o.g(components, "components");
        i16.r0 r0Var = this.f17544q;
        if (r0Var == null) {
            throw new java.lang.IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
        }
        this.f17544q = null;
        i16.o0 o0Var = r0Var.f287716i;
        kotlin.jvm.internal.o.f(o0Var, "getPackage(...)");
        this.f17545r = new d26.m0(this, o0Var, this.f17542o, this.f17540m, this.f17541n, components, "scope of " + this, new b26.x(this));
    }
}
