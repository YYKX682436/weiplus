package fc2;

/* loaded from: classes2.dex */
public final class k implements p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f342482d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f342483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fc2.o f342484f;

    public k(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, fc2.o oVar) {
        this.f342483e = c1163xf1deaba4;
        this.f342484f = oVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a
    public void R3(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (this.f342482d) {
            this.f342482d = false;
            fc2.o oVar = this.f342484f;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f342483e;
            c1163xf1deaba4.post(new fc2.j(oVar, c1163xf1deaba4));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a
    public void p3(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }
}
