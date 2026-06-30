package a4;

/* loaded from: classes13.dex */
public class c extends p012xc85e97e9.p093xedfae76a.j0 implements p012xc85e97e9.p094xbe953013.p095x38b73479.d {

    /* renamed from: d, reason: collision with root package name */
    public final int f82688d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Bundle f82689e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p094xbe953013.p095x38b73479.e f82690f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.y f82691g;

    /* renamed from: h, reason: collision with root package name */
    public a4.d f82692h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p094xbe953013.p095x38b73479.e f82693i;

    public c(int i17, android.os.Bundle bundle, p012xc85e97e9.p094xbe953013.p095x38b73479.e eVar, p012xc85e97e9.p094xbe953013.p095x38b73479.e eVar2) {
        this.f82688d = i17;
        this.f82689e = bundle;
        this.f82690f = eVar;
        this.f82693i = eVar2;
        eVar.m7855x42780477(i17, this);
    }

    public void b() {
        p012xc85e97e9.p093xedfae76a.y yVar = this.f82691g;
        a4.d dVar = this.f82692h;
        if (yVar == null || dVar == null) {
            return;
        }
        super.mo522xb5bdeb7a(dVar);
        mo7806x9d92d11c(yVar, dVar);
    }

    @Override // p012xc85e97e9.p093xedfae76a.g0
    /* renamed from: onActive */
    public void mo520x3a2455c5() {
        this.f82690f.m7859xc0d627a();
    }

    @Override // p012xc85e97e9.p093xedfae76a.g0
    /* renamed from: onInactive */
    public void mo521xa6927f6a() {
        this.f82690f.m7860xc77ccada();
    }

    @Override // p012xc85e97e9.p093xedfae76a.g0
    /* renamed from: removeObserver */
    public void mo522xb5bdeb7a(p012xc85e97e9.p093xedfae76a.k0 k0Var) {
        super.mo522xb5bdeb7a(k0Var);
        this.f82691g = null;
        this.f82692h = null;
    }

    @Override // p012xc85e97e9.p093xedfae76a.j0, p012xc85e97e9.p093xedfae76a.g0
    /* renamed from: setValue */
    public void mo523x53d8522f(java.lang.Object obj) {
        super.mo523x53d8522f(obj);
        p012xc85e97e9.p094xbe953013.p095x38b73479.e eVar = this.f82693i;
        if (eVar != null) {
            eVar.m7857x6761d4f();
            this.f82693i = null;
        }
    }

    /* renamed from: toString */
    public java.lang.String m524x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(64);
        sb6.append("LoaderInfo{");
        sb6.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb6.append(" #");
        sb6.append(this.f82688d);
        sb6.append(" : ");
        m3.b.a(this.f82690f, sb6);
        sb6.append("}}");
        return sb6.toString();
    }
}
