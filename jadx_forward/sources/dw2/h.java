package dw2;

/* loaded from: classes2.dex */
public final class h implements p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f325655d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f325656e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dw2.o f325657f;

    public h(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, dw2.o oVar) {
        this.f325656e = c1163xf1deaba4;
        this.f325657f = oVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a
    public void R3(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (this.f325655d) {
            this.f325655d = false;
            dw2.o oVar = this.f325657f;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f325656e;
            c1163xf1deaba4.post(new dw2.g(oVar, c1163xf1deaba4));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a
    public void p3(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }
}
