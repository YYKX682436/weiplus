package ms4;

/* loaded from: classes8.dex */
public class w implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f f412661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ js4.n f412662b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ms4.z f412663c;

    public w(ms4.z zVar, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, js4.n nVar) {
        this.f412663c = zVar;
        this.f412661a = activityC1102x9ee2d9f;
        this.f412662b = nVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        js4.o oVar = this.f412662b.f383079d;
        if (oVar != null) {
            oVar.a(i17, i18, str);
        }
    }

    @Override // js4.o
    /* renamed from: onSuccess */
    public void mo14245xe05b4124(java.lang.Object obj) {
        this.f412663c.a(this.f412661a, this.f412662b);
    }
}
