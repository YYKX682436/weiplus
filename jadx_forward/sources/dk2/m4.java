package dk2;

/* loaded from: classes.dex */
public final class m4 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f f315285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f315286b;

    public m4(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, yz5.l lVar) {
        this.f315285a = activityC1102x9ee2d9f;
        this.f315286b = lVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        this.f315286b.mo146xb9724478(java.lang.Boolean.FALSE);
    }

    @Override // js4.o
    /* renamed from: onSuccess */
    public void mo14245xe05b4124(java.lang.Object obj) {
        js4.h e17 = ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).e(this.f315285a, true);
        yz5.l lVar = this.f315286b;
        if (e17 != null) {
            ((ns4.p1) e17).f421151c = new dk2.l4(lVar);
        } else {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
    }
}
