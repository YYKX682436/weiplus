package s1;

/* loaded from: classes14.dex */
public final class w0 implements s1.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f483617a;

    /* renamed from: b, reason: collision with root package name */
    public final int f483618b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f483619c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f483620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1.x0 f483621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f483622f;

    public w0(int i17, int i18, java.util.Map map, s1.x0 x0Var, yz5.l lVar) {
        this.f483620d = i17;
        this.f483621e = x0Var;
        this.f483622f = lVar;
        this.f483617a = i17;
        this.f483618b = i18;
        this.f483619c = map;
    }

    @Override // s1.u0
    public java.util.Map c() {
        return this.f483619c;
    }

    @Override // s1.u0
    public void e() {
        s1.m1 m1Var = s1.n1.f483574a;
        p2.s mo7007x6fcfed3f = this.f483621e.mo7007x6fcfed3f();
        int i17 = s1.n1.f483576c;
        p2.s sVar = s1.n1.f483575b;
        s1.n1.f483576c = this.f483620d;
        s1.n1.f483575b = mo7007x6fcfed3f;
        this.f483622f.mo146xb9724478(m1Var);
        s1.n1.f483576c = i17;
        s1.n1.f483575b = sVar;
    }

    @Override // s1.u0
    /* renamed from: getHeight */
    public int mo126531x1c4fb41d() {
        return this.f483618b;
    }

    @Override // s1.u0
    /* renamed from: getWidth */
    public int mo126532x755bd410() {
        return this.f483617a;
    }
}
