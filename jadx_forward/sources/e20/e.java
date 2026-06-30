package e20;

/* loaded from: classes9.dex */
public final class e implements l81.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t10.d f328010a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f328011b;

    public e(t10.d dVar, boolean z17) {
        this.f328010a = dVar;
        this.f328011b = z17;
    }

    @Override // l81.v0
    public void a(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ECS_O.Router.Wxa", "silent launch failed(" + i17 + "): " + str);
        this.f328010a.c(str);
    }

    @Override // l81.v0
    /* renamed from: onSuccess */
    public void mo50385xe05b4124() {
        this.f328010a.d(new e20.d(this.f328011b));
    }
}
