package dk2;

/* loaded from: classes.dex */
public final class u3 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f f315685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f315686c;

    public u3(dk2.r4 r4Var, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, yz5.l lVar) {
        this.f315684a = r4Var;
        this.f315685b = activityC1102x9ee2d9f;
        this.f315686c = lVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        this.f315686c.mo146xb9724478(java.lang.Boolean.FALSE);
    }

    @Override // js4.o
    /* renamed from: onSuccess */
    public void mo14245xe05b4124(java.lang.Object obj) {
        this.f315684a.getClass();
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f context = this.f315685b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        js4.h e17 = ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).e(context, true);
        yz5.l lVar = this.f315686c;
        if (e17 != null) {
            ((ns4.p1) e17).f421151c = new dk2.t3(lVar);
        } else {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
    }
}
